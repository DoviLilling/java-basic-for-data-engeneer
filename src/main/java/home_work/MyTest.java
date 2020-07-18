package home_work;

/**
 * @author Evgeny Borisov
 */
public class MyTest {
    public static void main(String[] args) {

        double[] doubles ={1.2,2.7,2,4,6};


        new ArrayAnCastingLab();
        new ArrayAnCastingLab();
        new ArrayAnCastingLab();
        new ArrayAnCastingLab();
        new ArrayAnCastingLab();
        ArrayAnCastingLab castingLab = new ArrayAnCastingLab();
        int[] ints = castingLab.convertToInt(doubles);

        for (int x : ints) {
            System.out.println(x);
        }
    }
}
