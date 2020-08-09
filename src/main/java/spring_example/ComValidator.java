package spring_example;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class ComValidator implements Validator {
    @Override
    public void printValidation(String email) {
        if (!email.endsWith("com")) {
            System.out.println("com is missing");
        }
    }
}
