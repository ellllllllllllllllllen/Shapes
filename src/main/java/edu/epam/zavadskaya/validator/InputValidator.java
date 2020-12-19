package edu.epam.zavadskaya.validator;

import edu.epam.zavadskaya.service.BallService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InputValidator {
    private static final Logger logger = LogManager.getLogger(InputValidator.class);
    private static final String SPLIT_BY = "\\s+";
    private static final String NUMBER_REGEX = "^-?\\d*(\\.\\d+)?$";
    private static final int DATA_LENGTH = 4;

    public boolean isDataValid(String line){
        String [] data = line.split(SPLIT_BY);
        boolean isValid = true;
        if (data.length != DATA_LENGTH){
            isValid = false;
            logger.error("Wrong amount of data");
        }
        int i = 0;
        while (i < data.length) {
            if(!isNumber(data[i])) {
                isValid = false;
                logger.error("Incorrect data");
            }
            i++;
        }
        return isValid;
    }
    public boolean isNumber(String number){
        return number.matches(NUMBER_REGEX);
    }
}
