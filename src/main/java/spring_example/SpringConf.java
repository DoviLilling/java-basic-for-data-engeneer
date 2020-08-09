package spring_example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
//@ComponentScan(basePackages = "spring_example")
@ComponentScan
@EnableScheduling
public class SpringConf {
}
