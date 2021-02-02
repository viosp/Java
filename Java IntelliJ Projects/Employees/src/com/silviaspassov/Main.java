package com.silviaspassov;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("Jone Doe", 30);
        Employee tim = new Employee("Tim bee", 33);
        Employee jack = new Employee("Jack cee", 38);
        Employee sivi = new Employee("Sivi dee", 40);
        Employee red = new Employee("red eee", 21);
        Employee blue = new Employee("blue fff", 29);
        Employee pink = new Employee("pink kkk", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(sivi);
        employees.add(red);
        employees.add(blue);
        employees.add(pink);

        Function<Employee, String> getLastName = (Employee employee) -> {
            return employee.getName().substring(employee.getName().indexOf(' ') + 1);
        };

        String lastName = getLastName.apply(employees.get(2));
        System.out.println(lastName);

        Function<Employee, String> getFirstName = (Employee employee) -> {
            return employee.getName().substring(0, employee.getName().indexOf(' '));
        };

        Random random1 = new Random();
        for (Employee employee : employees) {
            if (random1.nextBoolean()) {
                System.out.println(getAName(getFirstName, employee));
            } else {
                System.out.println(getAName(getLastName, employee));
            }
        }

        Function<Employee, String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> firstName = name -> name.substring(0, name.indexOf(' '));
        Function chainedFunction = upperCase.andThen(firstName);
        System.out.println(chainedFunction.apply(employees.get(0)));

        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) -> {
            return name.concat(" " + employee.getAge());
        };

        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName, employees.get(0)));

        IntUnaryOperator incBy5 = i -> i+5;
        System.out.println(incBy5.applyAsInt(10));


    }


    private static String getAName(Function<Employee, String> getName, Employee employee) {
        return getName.apply(employee);

    }


//        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
//        printEmployeesByAge(employees, "\nEmployees under 30", employee -> employee.getAge() <= 30);
//
//        printEmployeesByAge(employees, "\nEmployees younger than 25", new Predicate<Employee>() {
//            @Override
//            public boolean test(Employee employee) {
//                return employee.getAge() < 25;
//            }
//        });
//
//        IntPredicate greatherThan15 = i -> i >15;
//        IntPredicate lessThan100 = i -> i <100;
//        System.out.println(greatherThan15.test(10));
//        System.out.println(greatherThan15.and(lessThan100).test(15));
//
//        Random random = new Random();
//        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
//        for(int i=0; i<10;i++){
//            System.out.println(randomSupplier.get());
//        }
//
//        employees.forEach(employee -> {
//            String firstName = employee.getName().substring(employee.getName().indexOf(' ') +1);
//            System.out.println("First name is: " +firstName);
//        });


    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        System.out.println("******************");
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }

    }

}

