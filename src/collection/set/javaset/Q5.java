package collection.set.javaset;

import java.awt.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q5 {
    private int width;
    private int height;

    public static void main(String[] args) {
        HashSet<Rectangle> rectanglesSet = new HashSet<>();
        rectanglesSet.add(new Rectangle(10, 10));

        rectanglesSet.add(new Rectangle(5, 5));
        rectanglesSet.add(new Rectangle(5, 5));

        for (Rectangle rectangle : rectanglesSet) {
            System.out.println(rectangle);
        }

    }
}
