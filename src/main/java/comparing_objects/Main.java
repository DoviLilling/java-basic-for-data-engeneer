package comparing_objects;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(10, 20);


        List<Point> points = List.of(point1, point2);


        Point point = new Point(10, 20);

        boolean contains = points.contains(point);
        System.out.println(contains);

    }
}
