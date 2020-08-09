package spring_example;

import com.github.javafaker.Faker;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

/**
 * @author Evgeny Borisov
 */
@Component
public class ChuckNorrisQuoteProviderBPP implements BeanPostProcessor {

    private Faker faker = new Faker();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectChuckNorrisQuote.class)) {
                String quote = faker.chuckNorris().fact();
                field.setAccessible(true);
                try {
                    field.set(bean,quote);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return bean;

    }
}
