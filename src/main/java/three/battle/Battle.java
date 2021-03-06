package three.battle;

/**
 * Created by polosatik on 26.09.17.
 */
public class Battle {
    public static void main(String[] args) {
        Unit t34 = new Tank(10, 5);
        Unit soldier = new Infantry(1, 1);

        soldier.move();
        t34.shoot();
        t34.shoot();
        soldier.shoot();
        t34.move();

        t34.setTerrain(new RuggedTerrain());
        t34.move();
    }
}
