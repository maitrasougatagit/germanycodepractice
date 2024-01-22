package java8app.another.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDriver {


    public static void main(String args []){
        List<String> words = Arrays.asList("Hello", "World");
        words.stream().map((i) -> i.split("")).collect(Collectors.toList());



    }
}
