/**
 * 
 */
package cd;

import java.net.URL;

/**
 * @author jwan01
 *
 */
public class Image implements ImageInterface{
	URL imageURL;

	/* (non-Javadoc)
	 * @see cd.ImageInterface#showImage(java.net.URL)
	 */
	@Override
	public void showImage(URL url) {

		/**
		 * display image
		 */
		 System.out.println("HighRes Image");
		
	}
}
