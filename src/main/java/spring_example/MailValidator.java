package spring_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Evgeny Borisov
 */
@Service
public class MailValidator {

    private String someQuote = QuoteUtil.giveQuote();


    @Autowired
    private Set<Validator> validators;


    public void validateMail(String email) {
        System.out.println("someQuote = " + someQuote);
        for (Validator validator : validators) {
            validator.printValidation(email);
        }
    }


}
