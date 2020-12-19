package edu.epam.zavadskaya.observer.impl;

import edu.epam.zavadskaya.entity.Ball;
import edu.epam.zavadskaya.entity.BallParameter;
import edu.epam.zavadskaya.entity.Warehouse;
import edu.epam.zavadskaya.observer.Observer;
import edu.epam.zavadskaya.service.BallService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BallObserver implements Observer<Ball> {
    private static final Logger logger = LogManager.getLogger(BallObserver.class);

    @Override
    public void performedArea(Ball ball) {
        Long id = ball.getId();
        BallService ballService = BallService.getInstance();
        Warehouse warehouse = Warehouse.getInstance();
        double area = ballService.findArea(ball);
        BallParameter ballParameter = warehouse.getById(id);
        ballParameter.setArea(area);
        logger.info("Area was updated in {} , new area {}", ball, area);
    }

    @Override
    public void performedVolume(Ball ball) {
        Long id = ball.getId();
        BallService ballService = BallService.getInstance();
        Warehouse warehouse = Warehouse.getInstance();
        double volume = ballService.findVolume(ball);
        BallParameter ballParameter = warehouse.getById(id);
        ballParameter.setVolume(volume);
        logger.info("Volume was updated in {} , new volume {}", ball, volume);
    }
}
