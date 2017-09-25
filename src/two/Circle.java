package two;

/**
 * Created by polosatik on 19.09.17.
 */
public class Circle extends Shape {

    public static final double PI = 3.14;

     double radius;

    public Circle() {
        radius = 5.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) throws ZeroRadiusException {
        if (radius == 0) {
            throw new ZeroRadiusException();
        }
        this.radius = radius;
    }
    public double getArea() {
            return 3.14 * radius * radius;
    }
    double getArea(double pi) {
        return pi * radius * radius;
    }
}
