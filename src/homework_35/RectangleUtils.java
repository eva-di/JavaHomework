package homework_35;

import lesson_32.lists.MyList;

import java.util.Iterator;

public class RectangleUtils {

    public static void removeDuplicates (MyList<Rectangle> rectangles, Rectangle rectangleToRemove) {

        Iterator<Rectangle> iterator = rectangles.iterator();

//        while (iterator.hasNext()) {
//            if (iterator.next().equals(rectangleToRemove)) {
//                iterator.remove();

            for (int i = 0; i < rectangles.size(); i++) {
            if (rectangles.get(i).equals(rectangleToRemove)) {
                rectangles.remove(i);
                i--;

            }

        }


    }
}
