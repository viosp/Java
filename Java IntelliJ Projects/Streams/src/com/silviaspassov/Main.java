package com.silviaspassov;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	    List<String> someBingNumbers = Arrays.asList(
	            "123", "n123",
                "b123", "y789",
                "5hgj", "g937", "d756", "f456",
                "b567", "h678",
                "n612");

	    List<String> gNumbers = new ArrayList<>();

//	    someBingNumbers.forEach(number -> {
//	        if(number.startsWith("b")) {
//	            gNumbers.add(number);
////                System.out.println(number);
//            }
//        });
//
//	    gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//	    gNumbers.forEach((String s) -> System.out.println(s));

        someBingNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("g"))
                .sorted()
                .forEach(System.out::println);

        Stream<String> IoNumberStream = Stream.of("I26", "I123", "I45", "I90");
        Stream<String> InNumberStream = Stream.of("N26", "N23", "O45", "L90");
        Stream<String> concatStream = Stream.concat(IoNumberStream, InNumberStream);
        System.out.println("-------------------");

        System.out.println(concatStream
                .distinct()
                .peek(System.out::println)
                .count());

        Employee john = new Employee("John Do", 30);
        Employee jack = new Employee("Jack So", 36);
        Employee jane = new Employee("Jane Hi", 22);
        Employee sik = new Employee("Sik Me", 40);

        Department hr = new Department("Human Resources");
        hr.addEmployee(jane);
        hr.addEmployee(john);
        hr.addEmployee(sik);
        Department accounting = new Department("Accounting");
        accounting.addEmployee(jack);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

//        List<String> sortedGNumbers = someBingNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("g"))
//                .sorted()
//                .collect(Collectors.toList());

        List<String> sortedGNumbers = someBingNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("g"))
                .sorted()
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for(String s : sortedGNumbers) {
            System.out.println(s);
        }



    }
}
