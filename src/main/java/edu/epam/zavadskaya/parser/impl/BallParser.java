package edu.epam.zavadskaya.parser.impl;

import com.sun.tools.javac.util.Pair;
import edu.epam.zavadskaya.entity.Point;
import edu.epam.zavadskaya.entity.Radius;
import edu.epam.zavadskaya.parser.Parser;
import edu.epam.zavadskaya.validator.InputValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class BallParser implements Parser {
    private static final Logger logger = LogManager.getLogger(BallParser.class);
    private static BallParser instance = new BallParser();
    private static final String SPLIT_BY = "\\s+";

    private BallParser() {
    }

    public static BallParser getInstance() {
        return instance;
    }

    @Override
    public List<Pair<Point, Radius>> parse(List<String> list){
        List<Pair<Point, Radius>> balls = new ArrayList<>();
        InputValidator inputValidator = new InputValidator();
        for (String line: list) {
            if(inputValidator.isDataValid(line)){
                String [] data = line.split(SPLIT_BY);
                Point center = new Point(Double.parseDouble(data[0]),Double.parseDouble(data[1]), Double.parseDouble(data[2]));
                Radius radius = new Radius(Double.parseDouble(data[3]));
                balls.add(new Pair<>(center, radius));
            }
        }
        return balls;
    }
}
