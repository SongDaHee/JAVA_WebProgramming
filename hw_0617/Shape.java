package hw_0617;

public abstract class Shape {
	Point p;
	Shape(){
		this(new Point(0,0));
	}
	
	Shape(Point p){
		this.p = p;
	}
	
	Point getPosition() {
		return p;
	}
	
	void setposition(Point p) {
		this.p = p;
	}
	
	abstract double calcArea();
}

class Circle extends Shape{
	double r;
	
	Circle(double r){
		this.r = r;
	}
	
	double calcArea() {
		return r*r*Math.PI;
	}
}

class Rectangle extends Shape{
	double width;
	double height;
	
	Rectangle (double width, double height) {
		this.height = height;
		this.width = width;
	}
	
	boolean isSqure() {
		if(width == height)
			return true;
		else
			return false;
	}
	
	double calcArea() {
		return width*height;
	}
}

class Point{
	int x;
	int y;
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "["+x+","+y+"]";
	}
}
