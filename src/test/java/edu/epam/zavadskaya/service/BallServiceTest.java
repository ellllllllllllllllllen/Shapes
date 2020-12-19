package edu.epam.zavadskaya.service;

import edu.epam.zavadskaya.entity.Ball;
import edu.epam.zavadskaya.entity.Point;
import edu.epam.zavadskaya.entity.Radius;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BallServiceTest {

    @Test
    public void testFindArea() {
        Ball ball = new Ball(new Point(0.0, 0.0, 0.0), new Radius(3.0));
        BallService ballService = BallService.getInstance();
        double actual = ballService.findArea(ball);
        double expected = 113.04;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testFindVolume() {
    }

    @Test
    public void testFindRatioOfVolumes() {
    }

    @Test
    public void testIsBall() {
    }

    @Test
    public void testIsTouch() {
    }
}