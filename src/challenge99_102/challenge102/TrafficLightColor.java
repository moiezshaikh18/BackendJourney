package challenge99_102.challenge102;

public enum TrafficLightColor {

    RED(9000),YELLOW(1000),GREEN(4000);

    private int onTimeMillis;

    TrafficLightColor(int onTimeMillis) {
        this.onTimeMillis = onTimeMillis;
    }

    public int getOnTimeMillis() {
        return onTimeMillis;
    }
}
