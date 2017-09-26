package three;

/**
 * Created by polosatik on 26.09.17.
 */
public abstract class Unit {

    protected final int power;
    protected final double speed;

    protected Unit(int power, int speed) {
        this.power = power;
        this.speed = speed;
    }

    public void move() {
        System.out.println(this.getClass() + " moving forward: " + speed);
    }

    public abstract void shoot();

}
