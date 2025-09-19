package Com.ShapeSelect;

public class Rectangle {
	private double l;
	private double w;
//constructor
	public Rectangle(double l, double w) {
		super();
		this.l = l;
		this.w = w;
	}
	public double calArea(){
		return this.l*this.w;
	}
	public double calperimeter(){
		return this.l*this.w*2;
	}
	
}
