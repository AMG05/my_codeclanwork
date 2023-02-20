import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streams {

    public static int addTwo(int input){
        return input + 2;
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ben", "James","Joan", "Amanda", "Annie");


        names.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.println(name));


        Stream<String> fruits = Stream.of("Apple", "Pear", "Banana");

        fruits.map(String::toLowerCase).forEach(name -> System.out.println(name));

        Stream.of(1,2,3,4)
                .map(Streams::addTwo);
    }
}
