package edu.epam.zavadskaya.observer.impl;

import edu.epam.zavadskaya.entity.Ball;
import edu.epam.zavadskaya.observer.Observer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BallObserver implements Observer<Ball> {
    private static final Logger logger = LogManager.getLogger(BallObserver.class);

    @Override
    public void performedArea(Ball ball) {

    }

    @Override
    public void performedVolume(Ball ball) {
        //
    }
}
