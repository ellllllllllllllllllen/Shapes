package edu.epam.zavadskaya.specification;

@FunctionalInterface
public interface Specification<T> {
    boolean specify(T t);
}
