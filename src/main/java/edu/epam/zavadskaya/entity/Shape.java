package edu.epam.zavadskaya.entity;

import edu.epam.zavadskaya.util.IdGenerator;

public abstract class Shape{
    private long id = IdGenerator.generate();

    public long getId() {
        return id;
    }
}
