package AbstractionAndPolymorphism.passBy;

public class TestPassByReference {

    public static void main(String[] args) {
        Point point = new Point(4,8);
        System.out.println("First  "+ point);

        move(point);

        System.out.println("First  "+ point);
    }

    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }

    public static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return STR."Point{x=\{x}, y=\{y}}";
        }
    }

}
