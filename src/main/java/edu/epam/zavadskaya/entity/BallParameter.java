package edu.epam.zavadskaya.entity;

public class BallParameter {
    private double area;
    private double volume;

    public BallParameter(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BallParameter{");
        sb.append("area=").append(area);
        sb.append(", volume=").append(volume);
        sb.append('}');
        return sb.toString();
    }
}
