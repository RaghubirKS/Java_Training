//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for(int i = 1; i <= 5; ++i) {
            System.out.println("i = " + i);
        }

        List<Employee> employees = List.of(new Employee("a", (double)200.0F), new Employee("a", (double)2100.0F), new Employee("a", (double)2399900.0F), new Employee("a", (double)22200.0F), new Employee("a", (double)2400.0F), new Employee("a", (double)200.0F));
        Person.id = 1;
        Person.name = "p1";
        Person.age = 12;
        Person.sal = 12000;
        System.out.println("Person id = " + Person.id + " \n Person name = " + Person.name + " \n Person age = " + Person.age + "\n Person sal = " + Person.sal);
        secondHighSalOfEmp(employees);
    }

    public static void secondHighSalOfEmp(List<Employee> employees) {
        List<Employee> uniqueemp = removeDuplicateSal(employees);
        System.out.printf(uniqueemp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1L).findFirst().toString());
    }

    public static List<Employee> removeDuplicateSal(List<Employee> employees) {
        List<Employee> uniqueEmp = ((Map)employees.stream().collect(Collectors.toMap(Employee::getSalary, (e) -> e, (existing, replacement) -> existing))).values().stream().toList();
        System.out.println("/n uniqueEmp === ");
        System.out.println(uniqueEmp.toString());
        return uniqueEmp;
    }
}
