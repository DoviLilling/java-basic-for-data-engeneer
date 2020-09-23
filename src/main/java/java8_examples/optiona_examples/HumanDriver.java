package java8_examples.optiona_examples;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor
public class HumanDriver {
    private Car car;


    public static void main(String[] args) {
     printInsuranceName(new HumanDriver(new Car(Insurance.IDI)));
    }


    public static void printInsuranceName(HumanDriver humanDriver) {


        String insuranceName = Optional.ofNullable(humanDriver)
                .map(HumanDriver::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("no name");

        System.out.println("insuranceName = " + insuranceName);
    }
}
