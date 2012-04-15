package cd;

import java.net.URL;

public class RealSubject implements Image{
	URL imageURL;

	public RealSubject(URL url) {
		this.imageURL = url; 
		loadImage();
	}

	private void loadImage() {
		System.out.println("Loading  " + imageURL);
	}
	
	public void showImage() {
		 System.out.println("Displaying  " + imageURL);		
	}

}
