package edu.epam.zavadskaya.entity;

public class Radius {
    private double radius;

    public Radius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Radius radius1 = (Radius) o;

        return Double.compare(radius1.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Radius{");
        sb.append("radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
