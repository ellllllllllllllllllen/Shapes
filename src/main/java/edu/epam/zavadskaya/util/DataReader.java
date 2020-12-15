package edu.epam.zavadskaya.util;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataReader {
    private static final Logger logger = LogManager.getLogger(DataReader.class);
    public final static String PATH = "data/data.txt";

    public List<String> readFromFile() {
        StringBuilder stringBuilder = new StringBuilder(PATH);
        List<String> lineList = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(stringBuilder.toString()))) {
            Stream<String> lines = bufferedReader.lines();
            lineList = lines.collect(Collectors.toList());
        } catch (IOException e) {
            logger.error(e.getMessage());
        }
        return lineList;
    }
}
