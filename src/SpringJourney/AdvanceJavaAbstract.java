package SpringJourney;

abstract class Car {
    public abstract void drive();

    public void playMusic() {
        System.out.println("Play Music....");
    }
}

class WagonR extends Car {


    @Override
    public void drive() {
        System.out.println("Driving wagonR car....");
    }

    static class WagonRSpecial {
        public void driveFromSpecial() {
            System.out.println("Driving from special wagonR");
        }
    }

}

class A {
    public void show() {
        System.out.println("In A show");
    }
}


public class AdvanceJavaAbstract {
    public static void main(String[] args) {

//        WagonR wagonR = new WagonR();
//        wagonR.drive();


//        WagonR.WagonRSpecial wagonRSpecialSecond = wagonR.new WagonRSpecial(); // when you make class non-static

//        WagonR.WagonRSpecial wagonRSpecial = new WagonR.WagonRSpecial();
//        wagonRSpecial.driveFromSpecial();


        // Anonymous class
        A a = new A() {

            public void show() {
                System.out.println("In a anonymous class show");
            }
        };

        a.show();
    }
}
