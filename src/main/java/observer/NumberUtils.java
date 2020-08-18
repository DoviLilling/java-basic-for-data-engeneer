package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Evgeny Borisov
 */
public class NumberUtils {

    public static void printNumbersSorted(List<Integer> numbers) {


        Consumer<Integer> consumer = new Consumer<>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        for (Integer number : numbers) {
            System.out.println(number);
        }

        numbers.forEach(consumer);

        numbers.forEach(integer -> System.out.println(integer));


        if (numbers.isEmpty()) {
            System.out.println("nothing to print numbers list is empty");
            return;
        }
        if (numbers.size() == 1) {
            System.out.println(numbers.get(0));
            return;
        }

        for (int i = 0; i < numbers.size()-1; i++) {
            int a = numbers.get(i);
            int b = numbers.get(i + 1);
            if (a > b) {
                numbers.set(i, b);
                numbers.set(i + 1, a);
            }
        }

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(4);
        nums.add(8);
        nums.add(1);
        nums.add(3);
        nums.add(31);
        NumberUtils.printNumbersSorted(nums);
    }


















}
