package java8_examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {

        String s = "3aabacbebebe";
        String str = s.substring(1, s.length());
        int length = Character.getNumericValue(s.charAt(0));
        System.out.println("length = " + length);
        System.out.println(str);

        char[] chars = str.toCharArray();



        HashSet<Character> characters = new HashSet<>();
        for (char aChar : chars) {
            characters.add(aChar);
        }

        System.out.println(characters);
    }
}
