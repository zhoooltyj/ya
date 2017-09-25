package two;

/**
 * Created by polosatik on 19.09.17.
 */
public class Presentation {

    public static void main(String[] args) throws ZeroRadiusException {
        Circle circle = new Circle();
        circle.setRadius(0);

    }

//    public static void main(String[] args) {
//        Circle circle1 = new Circle();
//        Circle circle2 = new Circle(10);
//
//        Rectangle rectangle1 = new Rectangle(10, 15);
//        Rectangle rectangle2 = new Rectangle(20, 30);
//
//        System.out.println("Sum of circles " + sumAreas(circle1, circle2));
//        System.out.println(sumAreas(rectangle1, rectangle2));
//
//        try {
//            doSmthDangerous();
//        } catch (Exception e) {
//            System.out.println("In catch");
//            e.printStackTrace();
//        } finally {
//            System.out.println("In finally");
//        }
//    }

    private static double sumAreas(Circle circle1, Circle circle2) {
        return circle1.getArea() + circle2.getArea();
    }

    private static double sumAreas(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.getArea() + rectangle2.getArea();
    }

    private static double sumAreas(Shape shape1, Shape shape2) {
        return shape1.getArea() + shape2.getArea();
    }

    private void doSmthDangerous() throws Exception {
     int i = 6/0;
    }

}
