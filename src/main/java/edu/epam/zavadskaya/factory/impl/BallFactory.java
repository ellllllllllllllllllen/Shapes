package edu.epam.zavadskaya.factory.impl;

import edu.epam.zavadskaya.entity.Ball;
import edu.epam.zavadskaya.entity.Point;
import edu.epam.zavadskaya.exception.BallFactoryException;
import edu.epam.zavadskaya.factory.Factory;
import edu.epam.zavadskaya.validator.BallValidator;

public class BallFactory extends Factory {
    @Override
    public Ball createShape(Point point, double radius) throws BallFactoryException {
        if(!BallValidator.isBallValid(radius)){
            throw new BallFactoryException("Ball is invalid");
        }
        Ball ball = new Ball(point, radius);
        return ball;
    }
}
