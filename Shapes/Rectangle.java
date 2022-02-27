package Shapes;

public class Rectangle implements Shapes {
	
	private int width;
	private int length;
	
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public int calculateArea() {
		int area = width * length;
		return area;
	}

	public int calculatePerimeter() {
		int perimeter = (width * 2) + (length * 2);
		//int perimeter2 = width + width + length + length;  -> alternative
		return perimeter;
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public static void main(String[] args) {
		Rectangle rec = new Rectangle(2, 3);
		System.out.println("Area: " + rec.calculateArea()); // 6
		System.out.println("Perimeter: " + rec.calculatePerimeter()); // 10
		
	}

}
