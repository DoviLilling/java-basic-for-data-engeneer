package spring_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConf.class);
        MailValidator mailValidator = context.getBean(MailValidator.class);
        mailValidator.validateMail("sf;kjhaslkfjsd");


    }
}

