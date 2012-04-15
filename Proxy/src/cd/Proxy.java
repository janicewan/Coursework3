package cd;
import java.net.URL;

public class Proxy implements Image {

	private URL imageURL;
	private Image image;
	
	public Proxy(URL imageURL) {
		this.imageURL= imageURL;
	}
	
	public void showImage() {
		image = new RealSubject(imageURL);
		image.showImage();
	}

}

