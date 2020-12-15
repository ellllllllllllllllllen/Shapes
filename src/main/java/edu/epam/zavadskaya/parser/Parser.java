package edu.epam.zavadskaya.parser;

import edu.epam.zavadskaya.exception.BallFactoryException;

import java.util.List;
public interface Parser<T> {
    List<T> parse(List<String> list) throws BallFactoryException;
}
