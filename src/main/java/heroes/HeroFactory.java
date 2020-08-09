package heroes;

import org.reflections.Reflections;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
public class HeroFactory {


    private List<Class<? extends Hero>> heroesClassesList = new ArrayList<>();


    public HeroFactory() {
        Reflections scanner = new Reflections("heroes");
        Set<Class<? extends Hero>> classes = scanner.getSubTypesOf(Hero.class);
        for (Class<? extends Hero> heroClass : classes) {

            if (!Modifier.isAbstract(heroClass.getModifiers())) {
                this.heroesClassesList.add(heroClass);
            }

        }
    }

    public Hero createRandomHero() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        int randomNumber = RandomUtil.between(0, heroesClassesList.size());
        Class<? extends Hero> heroClass = heroesClassesList.get(randomNumber);
        Constructor<? extends Hero> constructor = heroClass.getDeclaredConstructor();
        Hero hero = constructor.newInstance();

        return hero;

    }
}





