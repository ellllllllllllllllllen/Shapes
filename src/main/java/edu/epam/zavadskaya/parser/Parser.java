package edu.epam.zavadskaya.parser;

import com.sun.tools.javac.util.Pair;
import edu.epam.zavadskaya.entity.Point;
import edu.epam.zavadskaya.entity.Radius;
import edu.epam.zavadskaya.exception.BallFactoryException;

import java.util.List;
public interface Parser{
    List<Pair<Point, Radius>> parse(List<String> list) throws BallFactoryException;
}
