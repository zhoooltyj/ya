package three;

/**
 * Created by polosatik on 26.09.17.
 */
public class Tank extends Unit {

    private int ammunition = 1;
    public Tank(int power, int speed){
        super(power, speed, new RoadTerrain());

    }

    @Override
    public void shoot() {
        System.out.println("Tank shooting with power: " +  power);
        --ammunition;
        if (ammunition == 0) {
            System.out.println("Recharging...");
            ammunition = 1;
        }
    }
}
