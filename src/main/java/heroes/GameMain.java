package heroes;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Evgeny Borisov
 */
public class GameMain {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        HeroFactory heroFactory = new HeroFactory();
        GameManager gameManager = new GameManager();
        gameManager.makeFight(heroFactory.createRandomHero(),new Knight());
    }
}
