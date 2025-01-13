package SpringJourney;

class Mobile {
    String brand;
    int price;
    String network;
    static String name;


    static {
        name = "Feature Phone";
    }

    public Mobile(String brand, int price, String network) {
        this.brand = brand;
        this.price = price;
        this.network = network;
    }


    public static void show(Mobile obj) {
        System.out.println(STR."Mobile{brand='\{obj.brand}', price=\{obj.price}, network='\{obj.network}', name='\{name}'}");
    }


}

public class CoreJavaDemo  {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("SpringJourney.Mobile");
//        Mobile mobile = new Mobile("Apple", 17500, "5G");
//

//        mobile.brand = "Samsung";
//        mobile.price = 1700;
//
//        Mobile mobile1 = new Mobile();
//        mobile1.brand = "Apple";
//        mobile1.price = 1500;

//        Mobile.show(mobile);
    }
}
