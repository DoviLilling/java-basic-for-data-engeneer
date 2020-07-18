package abstrac_classes;

/**
 * @author Evgeny Borisov
 */
public abstract class Animal {

    private int weight;
    private int height;


    public abstract void makeVoice();


    public final void printWeight(){
        System.out.println(this.weight);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
