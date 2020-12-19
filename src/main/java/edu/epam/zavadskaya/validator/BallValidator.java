package edu.epam.zavadskaya.validator;

import edu.epam.zavadskaya.entity.Radius;

public class BallValidator {
    private static BallValidator instance;

    private BallValidator() {
    }

    public static BallValidator getInstance() {
        if (instance == null) {
            instance = new BallValidator();
        }
        return instance;
    }

    public static boolean isBallValid(Radius radius) {
        return (radius.getRadius() <= 0);
    }
}
