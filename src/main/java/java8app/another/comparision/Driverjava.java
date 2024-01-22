package java8app.another.comparision;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Driverjava {

    public static void main(String args []){
        Employee e1 = new Employee(40,"Sougata");
        Employee e2 = new Employee(50,"Arijit");
        Employee e3 = new Employee(30,"Tridib");
        Employee e4 = new Employee(34,"Babul");
        Employee e5 = new Employee(38,"Tarun");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        List<String> sortedEmployees = employees.stream().filter((i)-> i.getAge() > 35).sorted(Comparator.comparing(Employee::getName)).map((i)-> i.getName()).collect(Collectors.toList());
        sortedEmployees.forEach((i)->System.out.println(i));

    }
}
