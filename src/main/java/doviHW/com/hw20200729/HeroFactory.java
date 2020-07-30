package doviHW.com.hw20200729;

/**
 * @author Dovi Lilling
 */

import java.util.Map;
import java.util.Random;

public class HeroFactory {
    private static Random random = new Random();
    private static Map<Integer, Hero> heroMap = Map.of(
            0, new King(),
            1, new Knight(),
            2, new Elf(),
            3, new Hobbit()
            );

    public static Hero createHero(){
        return heroMap.get(random.nextInt(4));
    }

    public static Hero createHero(String name){
        Hero myHero = createHero();
        myHero.setName(name);
        return myHero;
    }
}
