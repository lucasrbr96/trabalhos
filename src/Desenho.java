import java.awt.Image;
import java.awt.Toolkit;
import java.io.Serializable;

public class Desenho implements Serializable{
	
	private Image img;
	private int x; 
	private int y;
	
	public Image getImg() {
		return img;
	}
	
	public void setImg(String path) {
		this.img = Toolkit.getDefaultToolkit().createImage(path);
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
