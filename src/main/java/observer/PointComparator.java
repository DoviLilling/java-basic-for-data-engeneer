package observer;

/**
 * @author Evgeny Borisov
 */
public class PointComparator implements Comparator<Point> {
    @Override
    public boolean compare(Point t1, Point t2) {

        if (t1.getX() * t1.getY() * t1.getZ() > t2.getX() * t2.getY() * t2.getZ()) {
            return true;
        }else {
            return false;
        }
    }
}
