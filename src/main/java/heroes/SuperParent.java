package heroes;

/**
 * @author Evgeny Borisov
 */
public class SuperParent implements Mother, Father{
    @Override
    public void talkToChildren() {
        Mother.super.talkToChildren();
        Father.super.talkToChildren();
    }
}
