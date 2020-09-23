package lombok_examples;

import lombok.*;


import java.util.List;
import java.util.Objects;

/**
 * @author Evgeny Borisov
 */
@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@With
@Builder
public class Customer {
    private String name;
    private String lastName;
    private int age;
    private String address;

    private List<Beer> beers;


}
