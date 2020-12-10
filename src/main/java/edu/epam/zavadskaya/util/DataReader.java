package edu.epam.zavadskaya.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataReader {
    private static final Logger logger = LogManager.getLogger(DataReader.class);
    public final static String PATH = "src/main/resources/data.txt";

    public List<String> readFromFile(String path) {
        List<String> lines = new ArrayList<>();
        File file = new File(path);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            logger.error(e);
        }
        logger.info("String array with lines from file: " + lines);
        return lines;
    }
}
