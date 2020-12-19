package edu.epam.zavadskaya.entity;

public class Ball extends Shape{
    private Point center;
    private Radius radius;

    public Ball(Point center, Radius radius) {
        this.center = center;
        this.radius = radius;
    }

    public Ball() {

    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Radius getRadius() {
        return radius;
    }

    public void setRadius(Radius radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ball ball = (Ball) o;

        if (center != null ? !center.equals(ball.center) : ball.center != null) return false;
        return radius != null ? radius.equals(ball.radius) : ball.radius == null;
    }

    @Override
    public int hashCode() {
        int result = center != null ? center.hashCode() : 0;
        result = 31 * result + (radius != null ? radius.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("center=").append(center);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
