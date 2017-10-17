package four.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by polosatik on 03.10.17.
 */
public class Presentation {
    public static void main(String[] args) throws IOException{
//        этот код сам по себе работает и выводит на печать (но в памяти не сохраняется, потому что это стрим. Для сохранения в памяти
// нужно пользоваться коллекцией)
//        Files.lines(Paths.get("/Users/polosatik/Documents/git/ya/src/four/file/text"))
//        .forEach(line -> System.out.println(line))
//        ;

        //или чтение в стрим в явном виде
        Stream<String> lines = Files.lines(Paths.get("/Users/polosatik/Documents/git/ya/src/four/file/text"));
        lines.forEach(line -> System.out.println(line));


        //или в коллекцию, чтобы в памяти хранилось. чтобы работало надо закомментить предыдущую строчку, потому что в ней
        //lines выводится на печать и удаляется из памяти
        List<String> collect = lines.collect(Collectors.toList());
        for (String s : collect) {
            System.out.println(s);
        }

        //создает и заполняет файл:
        Files.write(Paths.get("/Users/polosatik/Documents/git/ya/src/four/file/new"), Arrays.asList("1", "123", "12"));

//          iterable - интерфейс, который умеет возвращать итератор, вот иллюстрация итератора
//        List<Integer> list = Arrays.asList(1, 5, 3);
//        Iterator<Integer> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }



    }
}
