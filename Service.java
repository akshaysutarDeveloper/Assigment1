package service;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
public class Service
{
	@SuppressWarnings("resource")
	public void put()
	{	
		try
			{    
				URL url=new URL("http://www.texla.net");    
				URLConnection urlcon=url.openConnection();    
				InputStream stream=urlcon.getInputStream();    
				FileOutputStream fos=new FileOutputStream("C:\\Users\\Akshay\\Desktop\\web-content.txt");
				while(true)
				{
					int i=stream.read();
					if(i==-1)
						break;
					System.out.print((char)i);
					fos.write(i);
				}
            }
		 catch(Exception e)
		 {
			System.out.println(e);
		 }    
   }   
}