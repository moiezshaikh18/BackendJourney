package challenge99_102.challenge102;

public class Road {
    public static void main(String[] args) throws InterruptedException {

        TrafficLight red = new TrafficLight(TrafficLightColor.RED);
        TrafficLight yellow = new TrafficLight(TrafficLightColor.YELLOW);
        TrafficLight green = new TrafficLight(TrafficLightColor.GREEN);

        green.start();
        green.join();

        yellow.start();
        yellow.join();

        red.start();
    }
}
