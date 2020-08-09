package spring_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */

@Service
public class SuperService {

    @Autowired
    private StamService stamService;


    @Scheduled(fixedDelay = 3000)
    public void doWork() {
        System.out.println("working...");
        stamService.doStupidThing();
    }

}
