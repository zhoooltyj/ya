package homework.hwthree.array;

import java.util.HashMap;

/**
 * Created by polosatik on 02.10.17.
 */
public class Presentation {
    public static void main(String[] args) {

        ArrayN arrayN = ConsoleReader.importData();
        System.out.println(arrayN);

       // int N = 35;
        //Integer[] array = new Integer[]{2, 5, 7, 8, 4, 11, 19};

        HashMap<Integer, Integer> map = ArraySum.createHashMap(arrayN);

        System.out.println(map);

    }

}
