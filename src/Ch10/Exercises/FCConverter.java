package Ch10.Exercises;

public class FCConverter {
    private double fTemp;
    private double cTemp;

    public void setFahrenheit(double s) {
        fTemp = s;
    }

    public void setCelsius(double s) {
        cTemp = s;
    }

    public double getFahrenheit() {
        return (9f/5f*(cTemp + 32));
    }

    public double getCelsius() {
        return (5f/9f*(fTemp - 32));
    }
}