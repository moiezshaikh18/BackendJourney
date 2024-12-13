interface Flyable {
    void fly(); // Abstract method
}




abstract class Bird implements Flyable {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void fly();
}




class Eagle extends Bird {

    // Constructor for Eagle
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is soaring high in the sky!");
    }

    public static void main(String[] args) {
        Eagle eagle = new Eagle("Golden Eagle");

        // Call the fly method
        eagle.fly();
    }
}
