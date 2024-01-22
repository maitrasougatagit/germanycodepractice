package java8app.another;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaPractice {

    public static void main(String [] args){
        Student std1 = new Student("Sougata",80);
        Student std2 = new Student("Amit",10);
        Student std3 = new Student("Bikas",70);
        Student std4 = new Student("Chandal",100);
        Student std5 = new Student("Uddan",30);
        Student std6 = new Student("Sandip",65);
        List<Student> students = new ArrayList<>();
        students.add(std1);
        students.add(std2);
        students.add(std3);
        students.add(std4);
        students.add(std5);
        students.add(std6);
        // List of all students more that 50
        List<Student> passedStudents = students.stream().filter((i) -> i.getMarks()>50).collect(Collectors.toList());
        //passedStudents.stream().forEach((i)->System.out.println("Passed student Name::"+ i.getName() +" with marks :"+i.getMarks()));
        // Find out name of the studients who passed in alphabetical order
        List<String> studentNames = students.stream().filter((i)-> i.getMarks()>50).map((i)-> i.getName()).collect(Collectors.toList());
        studentNames.stream().forEach((i)-> System.out.println(i));

    }
}
