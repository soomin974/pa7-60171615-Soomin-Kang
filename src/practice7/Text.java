package practice7;

public class Text implements Drawable {
	String text;
	public Text(String text) {
		this.text = text;
	}
	
	public void draw() {
		System.out.println(text);
	}
}
