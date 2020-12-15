package edu.epam.zavadskaya.repository.impl;

import edu.epam.zavadskaya.entity.Ball;
import edu.epam.zavadskaya.repository.Repository;
import edu.epam.zavadskaya.specification.Specification;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BallRepository implements Repository<Ball> {
    private List<Ball> balls;
    private static BallRepository ballRepository;

    private BallRepository() {
        this.balls = new ArrayList<>();
    }

    public static BallRepository getInstance() {
        if (ballRepository == null) {
            ballRepository = new BallRepository();
        }
        return ballRepository;
    }

    @Override
    public void add(Ball ball) {
        balls.add(ball);
    }

    @Override
    public void remove(Ball ball) {
        balls.remove(ball);
    }

    @Override
    public Ball get(int index) {
        return balls.get(index);
    }

    @Override
    public List<Ball> query(Specification<Ball> specification) {
        return balls.stream().filter(specification::specify).collect(Collectors.toList());
    }

    @Override
    public List<Ball> sort(Comparator<? super Ball> comparator) {
        return balls.stream().sorted(comparator).collect(Collectors.toList());
    }
}
