package three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by polosatik on 03.10.17.
 */
public class StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,5,7,8,20,1));

        List<Integer> result = list.stream()
        .filter(el -> el % 2 != 0)
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(result);

//        for(int i =0; i<list.size(); i++) {
//            if (list.get(i) % 2 == 0) {
//                System.out.println(list.get(i));
//                list.remove(i);
//            }
//        }
//        System.out.println(list);
    }

}
