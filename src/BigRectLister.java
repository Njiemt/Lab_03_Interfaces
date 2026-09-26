import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
void main() {

    ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

    Random ran = new Random();

    Rectangle r = new Rectangle();

    BigRectangleFilter filter = new BigRectangleFilter();

    for (int i = 0; i < 10; i++) {
        int width = ran.nextInt(4) + 1;
        int height = ran.nextInt(4) + 1;

        Rectangle rectangle = new Rectangle(width, height);

        rectangles.add(rectangle);
    }
    for (int i = 0; i < 10; i++) {
        if (filter.accept(rectangles.get(i))) {
            System.out.println(rectangles.get(i));
        }
    }
}