package two;

/**
 * Created by polosatik on 19.09.17.
 */
public class Rectangle {

    public final double a;
    public final double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;

    }
    public double getArea() { return a * b; }
}
