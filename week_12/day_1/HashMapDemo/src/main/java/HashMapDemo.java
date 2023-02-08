import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[]args){
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Ash", 100);
        ages.put("Ben", 21);
        ages.put("Steve", 80);
        ages.put("Futbol", 2);

        Boolean output = ages.containsValue(100);

//        String output = "Cat age is " + ashAge.toString();
        System.out.println(output);


    }


}
