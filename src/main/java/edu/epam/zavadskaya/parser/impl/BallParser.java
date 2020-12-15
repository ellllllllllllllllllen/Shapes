package edu.epam.zavadskaya.parser.impl;

import edu.epam.zavadskaya.entity.Ball;
import edu.epam.zavadskaya.entity.Point;
import edu.epam.zavadskaya.exception.BallFactoryException;
import edu.epam.zavadskaya.factory.impl.BallFactory;
import edu.epam.zavadskaya.parser.Parser;
import edu.epam.zavadskaya.service.BallService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class BallParser implements Parser<Ball> {
    private static final Logger logger = LogManager.getLogger(BallParser.class);
    private static final String REGEX = " ";
    private static final BallFactory BALL_FACTORY = new BallFactory();
    private static BallParser instance = new BallParser();

    private BallParser() {
    }

    public static BallParser getInstance() {
        return instance;
    }

    @Override
    public List<Ball> parse(List<String> list){
        List<Ball> result = new ArrayList<>();
        for(String str: list) {
            String[] arguments = str.split(REGEX);
            try {
                result.add(BALL_FACTORY.createShape(Double.parseDouble(arguments[0]),
                        new Point(Double.parseDouble(arguments[1]), Double.parseDouble(arguments[2]), Double.parseDouble(arguments[3]))));
            } catch (NumberFormatException | CubeFactoryException fe) {
                String msg = String.valueOf(new StringBuilder((Arrays.toString(arguments))).append("Wrong argument").append(fe.getMessage()));
                LOGGER.info(msg, fe);
            }
        }
        return result;
    }
}
