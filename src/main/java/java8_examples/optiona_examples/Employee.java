package java8_examples.optiona_examples;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
@Data
@RequiredArgsConstructor
public class Employee {
    private final String name;
    private int salary;

    public static void main(String[] args) {
        soWork(new Employee("Shay"));

    }

    static class HeavyAndSlowService {

        {
            System.out.println("Heavy service was created it took 10 sec");
        }

        int getInt() {
            System.out.println("another 5 secs");
            return 10;
        }
    }


    public static void soWork(Employee employee) {
        Optional.ofNullable(employee)
                .map(Employee::getName)
                .map(String::length)
                .ifPresentOrElse(System.out::println, () -> {
                    throw new IllegalStateException("emloyee not configured well");
                });

    }
}
