package junit;

import static org.junit.Assert.*;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unused")
public class Junit {

	@Before
	public void setUp() throws Exception 
	{
		System.out.println("Setting up");
	}

	@After
	public void tearDown() throws Exception 
	{
		System.out.println("Testing is Done");
	}

	@SuppressWarnings("resource")
	@Test
	public void test() {
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
