package spring_example;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Service
public class ShayService {

    @InjectChuckNorrisQuote
    private String chuckQuote;

    @Scheduled(fixedDelay = 1000)
    public void printChuck() {
        System.out.println(chuckQuote);
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 2) {
            throw new RuntimeException("not valid");
        }
    }
}
