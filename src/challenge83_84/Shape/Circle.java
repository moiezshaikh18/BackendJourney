package challenge83_84.Shape;

public class Circle extends Shape_83 {
    private double radius ;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println(STR."Circle Area:: \{Math.PI * radius * radius}");
    }
}
