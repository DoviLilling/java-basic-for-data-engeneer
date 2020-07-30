package doviHW.com.hw20200729;

/**
 * @author Dovi Lilling
 */

public class Hobbit extends Hero{

    public Hobbit() {
        hobbitInception();
        setName();
    }

    public Hobbit(String newName) {
        hobbitInception();
        setName(newName);
    }

    private void hobbitInception(){
        heroInception(1, 3);
    }

    @Override
    public void kick(Hero enemy) {
        if (isAlive()){
            System.out.println(getName() + " is crying... What a wuss!");
        }
    }
}
