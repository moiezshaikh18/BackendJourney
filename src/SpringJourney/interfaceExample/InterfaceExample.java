package SpringJourney.interfaceExample;

abstract class Computer {
    public abstract void code();
}

class Laptop extends Computer {
    public void code() {
        System.out.println("Coding...Compile...Run");
    }
}

class Desktop extends Computer {
    public void code() {
        System.out.println("Coding...Compile...Run...Faster");
    }
}


class Developer {
    public void devApp(Computer computer) {
        computer.code();
    }
}


public class InterfaceExample {
    public static void main(String[] args) {

        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer developer = new Developer();
        developer.devApp(desktop);
    }
}
