package three.battle;

/**
 * Created by polosatik on 26.09.17.
 */
public class Infantry extends Unit {
    private int ammunition = 30;

    public Infantry(int power, int speed) {
        super(power, speed, new RoadTerrain());

    }

    @Override
    public void shoot(){
        if (ammunition == 0) {
            System.out.println("Recharging...");
            ammunition = 30;
        }

        System.out.println("Infantry shooting with power: " + power);

    }

}
