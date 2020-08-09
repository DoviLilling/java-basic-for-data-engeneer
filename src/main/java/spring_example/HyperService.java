package spring_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class HyperService {

    @Autowired
    private StamService stamService;


    @Scheduled(fixedDelay = 1000)
    public void print(){
        System.out.print("hyper : ");
        stamService.doStupidThing();
    }
}
