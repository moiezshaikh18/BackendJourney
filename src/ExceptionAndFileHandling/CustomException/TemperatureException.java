package ExceptionAndFileHandling.CustomException;

public class TemperatureException extends  Exception{

    private final double degree;

    public TemperatureException( double degree) {
        this.degree = degree;
    }

    public String getMessage(){
        return "temperature is invalid";
    }

    public double getDegree(){
        return degree;
    }

}
