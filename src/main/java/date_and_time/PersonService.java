package date_and_time;

import lab0.Person;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Evgeny Borisov
 */
public class PersonService {


    private DateFormatService formatService = new DateFormatService();


    public Person createPersonWithAgeByBirthday(String birthday) {
        LocalDate date = formatService.convert(birthday);
        long between = ChronoUnit.YEARS.between(date, LocalDate.now());
        Person person = new Person();
        person.setAge((int) between);
        return person;
    }
}
