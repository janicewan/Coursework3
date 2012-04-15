package cd;

public class RealSubject implements Image{
	String imageURL;

	public RealSubject(String url) {
		this.imageURL = url; 
		loadImage();
	}

	private String loadImage() {
		return("Loading  " + imageURL);
	}
	
	public String showImage() {
		return("Displaying  " + imageURL);		
	}

}
