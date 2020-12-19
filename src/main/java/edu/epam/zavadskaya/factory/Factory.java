package edu.epam.zavadskaya.factory;

import edu.epam.zavadskaya.entity.Ball;
import edu.epam.zavadskaya.entity.Point;
import edu.epam.zavadskaya.entity.Radius;
import edu.epam.zavadskaya.exception.BallFactoryException;

public abstract class Factory {
    public abstract Ball createShape(Point point, Radius radius) throws BallFactoryException;
}
