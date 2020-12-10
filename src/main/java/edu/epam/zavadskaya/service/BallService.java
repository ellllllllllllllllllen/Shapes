package edu.epam.zavadskaya.service;

import edu.epam.zavadskaya.entity.Ball;

public class BallService {

    //вычисления площади поверхности шара
    public double findArea(Ball ball){
        return 4 * Math.PI * Math.pow(ball.getRadius(), 2);
    }

    //объема шара
    public double findVolume(Ball ball){
        return 4 / 3.0 * Math.PI * Math.pow(ball.getRadius(), 3);
    }

    //соотношения объемов получаемых в результате рассечения шара координатной плоскостью
    public double findRatioOfVolumes(){
        return 0;
    }

    //является ли объект шаром
    public boolean isBall(){
        return true;
    }

    //касается ли шар любой из координатных плоскостей.
    public boolean isTouch(Ball ball){
        double spherePointCoordinateX = ball.getCenter().getX() - ball.getRadius();
        double spherePointCoordinateY = ball.getCenter().getY() - ball.getRadius();
        double spherePointCoordinateZ = ball.getCenter().getZ() - ball.getRadius();
        boolean isTouch = false;
        if(spherePointCoordinateX <= 0 || spherePointCoordinateY <= 0 || spherePointCoordinateZ <= 0){
            isTouch = true;
        }
        return isTouch;
    }
}
