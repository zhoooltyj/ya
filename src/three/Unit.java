package three;

/**
 * Created by polosatik on 26.09.17.
 */
public abstract class Unit {

    protected final int power;
    protected final double speed;
    protected Terrain terrain;

    protected Unit(int power, int speed, Terrain terrain) {
        this.power = power;
        this.speed = speed;
        this.terrain = terrain;
    }

    public void move() {
        System.out.println(this.getClass() + " moving forward: " + speed);
    }

    public abstract void shoot();

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

}
