package java8_examples.optiona_examples;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum Seniority {

    STAJER(Integer.MIN_VALUE, 10),
    JUNIOR(11, 17),
    MIDDLE(18, 22),
    SENIOUR(23, Integer.MAX_VALUE);

    private final int min;
    private final int max;


    public static Seniority findBySalary(int salary) {
        return Arrays.stream(values())
                .filter(seniority -> seniority.min <= salary && seniority.max >= salary)
                .findAny()
                .get();

    }


}
