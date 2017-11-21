package practice7;

public class Circle extends Shape{
    double radius;

    public Circle(double x, double y,double radius) {
        super(x, y);
        this.radius = radius;
    }
    
    public void draw() {

    }
    public double getArea() {
    	double area = radius*radius*(3.14);
    	return area;
    }
    public double getLength() {
    	double length = 2*(3.14)*radius;
    	return length;
    }

    
}

