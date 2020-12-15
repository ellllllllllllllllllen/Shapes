package edu.epam.zavadskaya.entity;

public class Ball {
    //private long ballId;
    private Point point;
    private double radius;


    public Ball(Point point, double radius) {
        this.point = point;
        this.radius = radius;
    }

//    public long getBallId() {
//        return ballId;
//    }

//    public void setBallId(long ballId) {
//        this.ballId = ballId;
//    }

    public Point getCenter() {
        return point;
    }

    public void setCenter(Point center) {
        this.point = center;
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

        Ball ball = (Ball) o;

        if (Double.compare(ball.radius, radius) != 0) return false;
        return point != null ? point.equals(ball.point) : ball.point == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = point != null ? point.hashCode() : 0;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ball{");
        sb.append("center=").append(point);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
}
