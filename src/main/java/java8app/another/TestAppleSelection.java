package java8app.another;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestAppleSelection {

    public static void main(String args[]){
        List<Apple> apples = new ArrayList<>();
        Apple apple1 = new Apple(10,"red","ind");
        Apple apple2 = new Apple(100,"red","aus");
        Apple apple3 = new Apple(50,"red","sri");
        Apple apple4 = new Apple(15,"red","aus");
        Apple apple5 = new Apple(20,"red","sri");
        Apple apple6 = new Apple(10,"red","ind");
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);
        apples.add(apple4);
        apples.add(apple5);
        apples.add(apple6);
        apples.stream().filter((apple) -> apple.getWeight()>=50);

        Comparator<Apple> compareByWeight = (Apple app1 , Apple app2) -> app1.getWeight() -app1.getWeight();
        Printfile<String> printToConsole = (String content) -> System.out.println(content);

        DecorateContent<String> preDecorate = (s)-> s +" Hello";
        DecorateContent<String> postDecorate = (s)-> "Hello "+s;
        TestAppleSelection testAppleSelection = new TestAppleSelection();
        String x = "Sougata Maitra";
        testAppleSelection.printDecoratedObject(printToConsole,testAppleSelection.decorateCard(preDecorate,x));


    }

    public String decorateCard(DecorateContent decorator,String content){
       return  decorator.decorateContent(content);

    }
    public void  printDecoratedObject(Printfile printer,String content){
        printer.print(content);

    }


    public List<Apple> filterHeavyApples(List<Apple> apples){
        List<Apple> heavyApples = new ArrayList<>();
        for(Apple apple: apples){
            if(apple.getWeight() >= 50){
                heavyApples.add(apple);
            }
        }
        return heavyApples;
    }
    public List<Apple> filterLightWeightApples(List<Apple> apples){
        List<Apple> lightApples = new ArrayList<>();
        for(Apple apple: apples){
            if(apple.getWeight() <= 50){
                lightApples.add(apple);
            }
        }
        return lightApples;
    }

    public List<Apple> filterLightWeightApplesAndCountry(List<Apple> apples, String country){
        List<Apple> lightApples = new ArrayList<>();
        for(Apple apple: apples){
            if(apple.getWeight() <= 50 && country.equalsIgnoreCase(apple.getCountry())) {
                lightApples.add(apple);
            }
        }
        return lightApples;
    }
}
