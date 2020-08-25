package java8_examples.multiple_inheritance;

/**
 * @author Evgeny Borisov
 */
public class Son implements Father,Mother {

    @Override
    public void talkToChildren() {
        Mother.super.talkToChildren();
        Father.super.talkToChildren();
        System.out.println(123);
    }
}
