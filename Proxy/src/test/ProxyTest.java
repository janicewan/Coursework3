/**
 * 
 */
package test;

import static org.junit.Assert.*;

import org.junit.Test;

import cd.Proxy;

/**
 * @author jwan01
 *
 */
public class ProxyTest {

	@Test
	public static void test() {
		
		String imageURL = "HiRes_photo1";

		
		String expectedOutput= "Displaying  " + imageURL;
		String stringReturned= null;
		Proxy classUnderTest= new Proxy(imageURL);
		stringReturned= classUnderTest.showImage();
		assertEquals("Wrong Answer !", stringReturned, expectedOutput);
		
		
	}

}
