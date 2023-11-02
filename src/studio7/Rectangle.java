package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	 private double length;
	 private double width;
	 private double x;
	 private double y;
	 
	/**
	 * 
	 * @param length: length or rectangle
	 * @param width: width of rectangle
	 * @param x: x coordinate of rectangle
	 * @param y: y coordinate of rectangle
	 */
	public Rectangle(double length, double width, double x, double y) {
		this.length = length;
		this.width = width;
		this.x = x;
		this.y = y;
	}
	
	public double rectangleArea() {
		return length*width;	
	}

	public double rectanglePerimeter() {
		return 2*length+2*width;	
	}
	
	public boolean isSquare() {
		if (length==width) {
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @param rec1 : first rectangle you want to check
	 * @param rec2 : second rectangle you want to check
	 * @return whether rec1 is greater than rec2
	 */
	public boolean isLarger(Rectangle rec2) {
		if ((length*width)>rec2.rectangleArea()) {
			return true;
		}
		return false;
	}
	
	public void rectangleDraw() {
		StdDraw.filledRectangle(x,y,.5*length,.5*width);
	}
	
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(.25,.25,.5,.5);
		Rectangle rectangle2 = new Rectangle(.1,.5,.5,.5);
		System.out.println(rectangle1.isSquare()); //should return true
		System.out.println(rectangle2.isSquare()); //should return false
		System.out.println(rectangle1.isLarger(rectangle2)); //should return false
		rectangle1.rectangleDraw();
		rectangle2.rectangleDraw();
		
		

	}

}
