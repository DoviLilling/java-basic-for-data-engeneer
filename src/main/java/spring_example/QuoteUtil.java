package spring_example;

import com.github.javafaker.Faker;

/**
 * @author Evgeny Borisov
 */
public class QuoteUtil {
    private static Faker faker = new Faker();

    public static String giveQuote(){
        return faker.chuckNorris().fact();

    }
}
