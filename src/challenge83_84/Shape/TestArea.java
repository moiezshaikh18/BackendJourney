package challenge83_84.Shape;

public class TestArea {
    public static void main(String[] args) {
        Circle circle = new Circle((int) 3.15);
        circle.calculateArea();

        Square square = new Square(15.15);
        square.calculateArea();
    }
}
