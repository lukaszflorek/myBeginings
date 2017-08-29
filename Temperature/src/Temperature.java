public class Temperature {
    private double number;
    private TemperatureScale scale;

    // Constructors for Temperature

    public Temperature() {
        number = 0.0;
        scale = TemperatureScale.CELSIUS;
    }
    public Temperature(double number) {
        this.number = number;
        scale = TemperatureScale.CELSIUS;
    }
    public Temperature(TemperatureScale scale, double number) {
        this.scale = scale;
        this.number = number;
    }
    // Setters and getters

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public TemperatureScale getScale() {
        return scale;
    }

    public void setScale(TemperatureScale scale) {
        this.scale = scale;
    }
}
