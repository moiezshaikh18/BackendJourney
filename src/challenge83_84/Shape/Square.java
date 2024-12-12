package challenge83_84.Shape;

public class Square extends Shape_83{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println(STR."Square Area:: \{side * side}");
    }
}
