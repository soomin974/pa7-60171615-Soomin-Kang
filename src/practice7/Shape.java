package practice7;


public abstract class Shape implements Drawable {
    double x,y;
    

    public Shape(double x , double y) {
    this.x = x;
    this.y = y;
    }
    public abstract double getArea();
    public abstract double getLength();
}

