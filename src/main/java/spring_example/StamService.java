package spring_example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
@Scope("prototype")
public class StamService {

    public StamService() {
        System.out.println("Stam service was created");
    }


    public void doStupidThing() {
        System.out.println("Stupid thing");
    }
}
