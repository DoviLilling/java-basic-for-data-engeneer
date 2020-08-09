package heroes;

import com.github.javafaker.Faker;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class RandomUtil {

    private static Random random = new Random();
    public static final Faker faker = new Faker();

    private RandomUtil() {
    }

    public static String getName() {
        return faker.funnyName().name();
    }

    public static int between(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static Random getRandom() {
        return random;
    }
}
