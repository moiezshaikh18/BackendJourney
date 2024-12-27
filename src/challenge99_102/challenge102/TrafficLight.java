package challenge99_102.challenge102;

public class TrafficLight extends Thread {

    private final TrafficLightColor trafficLightColor;

    public TrafficLight(TrafficLightColor trafficLightColor) {
        this.trafficLightColor = trafficLightColor;
    }

    @Override
    public void run() {
        System.out.printf("\n%s active",trafficLightColor);
        try {
            Thread.sleep(trafficLightColor.getOnTimeMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\n%s inActive",trafficLightColor);
    }
}
