package Ch00;

public class Box {
	private int length;
	private int width;
	private int height;

	//Constructor method
	public Box() {
		length = 20;
		width = 10;
		height = 5;
	}

	//Another constructor method
	public Box(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}

	//Volume method
	public int findVolume() {
		return length*width*height;
	}

	//Mutator/setter methods
	public void setLength(int le) {
		length = le;
	}
	public void setWidth(int wi) {
		width = wi;
	}
	
	public void setHeight(int he) {
		height = he;
	}

	//Accessor/getter methods
	public int getLength() {
		return length;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}

	//Printout method
	public String toString() {
		return ("Box LWH = " + length + " x " + width + " x " + height);
	}
}	