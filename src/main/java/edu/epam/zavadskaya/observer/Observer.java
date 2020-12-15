package edu.epam.zavadskaya.observer;

public interface Observer<T> {
    void performedArea(T t);
    void performedVolume(T t);
}
