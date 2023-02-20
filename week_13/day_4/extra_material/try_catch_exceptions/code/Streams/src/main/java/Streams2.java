import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.stream.Stream;

import static java.util.Locale.filter;

public class Streams2 {

    public static void main(String[] args) {
        Stream.of(1,2,3,4,5,6,7,8,9)
            .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        Stream.of(2,9,1,3,5,7,2)
                .sorted()
                .forEach(System.out::println);

        Stream.of("Apples", "Pear", "Banana", "Orange")
                .limit(2)
                .forEach(System.out::println);

        double avg = Stream.of(99,3,11,65,14)
                .mapToInt(n -> n)
                .average()
                .getAsDouble();

       int max = Stream.of(99,3,11,65,14)
                .mapToInt(n -> n)
                .max()
                .getAsInt();

       Stream.of("Apple")
               .peek(val -> System.out.println("Value was: " + val)
               .map(String::toUpperCase)
               .peek(val -> System.out.println("Value now was: " + val);


    }
}
