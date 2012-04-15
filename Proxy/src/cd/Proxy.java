package cd;

public class Proxy implements Image {

	private String imageURL;
	private Image image;
	
	public Proxy(String imageURL) {
		this.imageURL= imageURL;
	}
	
	public String showImage() {
		image = new RealSubject(imageURL);
		return image.showImage();
	}

}

