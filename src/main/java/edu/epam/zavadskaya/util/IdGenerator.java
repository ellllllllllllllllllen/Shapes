package edu.epam.zavadskaya.util;

public class IdGenerator {
    private static long count = 1;

    private IdGenerator() {}

    public static long generate() {
        return count++;
    }
}
