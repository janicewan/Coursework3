package cd;

import java.net.URL;

public class RealSubject implements Image{
	URL imageURL;

	/* (non-Javadoc)
	 * @see cd.Image#showImage(java.net.URL)
	 */
	@Override
	public void showImage(URL url) {

		/**
		 * display image
		 */
		 System.out.println("HighRes Image");
		
	}
}
