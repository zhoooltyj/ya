package homework.hwthree.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by polosatik on 02.10.17.
 */
public class ArraySum {

    static HashMap<Integer, Integer> map = new HashMap<>();

    static HashMap<Integer,Integer> createHashMap(ArrayN arrayN) {

        for(Integer i:arrayN.nums){
            map.put(i, arrayN.N-i);
        }
        return map;
    }




}
