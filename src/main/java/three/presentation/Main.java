package three.presentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by polosatik on 26.09.17.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student alex = new Student("Alex", 18, 5.0);
        Student kate = new Student("Kate", 17, 4.5);
        Student john = new Student("John", 19, 4.0);

        list.add(alex);
        list.add(kate);
        list.add(john);



        System.out.println(list);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
            return Double.compare(o1.getAverageScore(), o2.getAverageScore());
        }
    }.reversed());
        System.out.println(list);
    }
}
