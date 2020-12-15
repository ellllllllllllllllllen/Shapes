package edu.epam.zavadskaya.validator;

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

    public static boolean isBallValid(double radius) {
        return (radius <=0);
    }
}
