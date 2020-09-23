package java8_examples.optiona_examples;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public class Car {
    private Insurance insurance;

    public Optional<Insurance> getInsurance() {
        return Optional.ofNullable(insurance);
    }
}
