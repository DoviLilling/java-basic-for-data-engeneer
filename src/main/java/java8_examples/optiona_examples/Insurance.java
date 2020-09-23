package java8_examples.optiona_examples;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@RequiredArgsConstructor
public enum  Insurance {

    IDI("ביטוח ישיר");

    @Getter
    private final String name;

}
