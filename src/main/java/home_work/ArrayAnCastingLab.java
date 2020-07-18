package home_work;


import com.epam.services.MyService;
import lab0.Person;

import static java.lang.Math.*;

/**
 * @author Evgeny Borisov
 */
public class ArrayAnCastingLab {



    public ArrayAnCastingLab() {

        System.out.println("ArrayAnCastingLab was created!");

    }

    public int[] convertToInt(double[] doubles) {


        System.out.println(pow(sqrt(round(10.5) * 23), 3));






        int[] integers = new int[doubles.length];

        for (int i = 0; i < doubles.length; i++) {

            integers[i] = ((int) doubles[i]);

        }

        return integers;


    }
}
