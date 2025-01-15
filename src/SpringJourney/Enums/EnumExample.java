package SpringJourney.Enums;


enum Laptop {
    MACBOOK(20000), DELL(15000), XPS(40000), HP(5000), SURFACE();

    private int price;


    Laptop() {
    }

    Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


public class EnumExample {
    public static void main(String[] args) {

        for (Laptop lap : Laptop.values()) {
            if (lap == Laptop.SURFACE) {
                lap.setPrice(78690);
            }

            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}
