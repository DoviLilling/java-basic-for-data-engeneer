package spring_example;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class ShtrudelValidator implements Validator {
    @Override
    public void printValidation(String email) {
        if (!email.contains("@")) {
            System.out.println("@ is missing");
        }
    }
}
