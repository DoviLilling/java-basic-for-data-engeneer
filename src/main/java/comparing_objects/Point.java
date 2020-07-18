package comparing_objects;

import abstrac_classes.Animal;

import java.util.Objects;

/**
 * @author Evgeny Borisov
 */
public class Point extends Animal {
    private int x;
    private int y;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return x == ((Point) o).getX() && y == ((Point) o).getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void makeVoice() {

    }
}
