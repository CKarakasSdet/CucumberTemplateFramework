package utilities;

import org.apache.commons.lang3.RandomStringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtilities {

    public static String randomEmailGenerator(int count){
        return RandomStringUtils.randomAlphabetic(count) + "gmail.com" ;
    }

    public static String randomName(int characterCount){
        return RandomStringUtils.randomAlphabetic(characterCount) ;
    }

    public static String randomLastName(int characterCount){
        return RandomStringUtils.randomAlphabetic(characterCount) ;
    }

    public static String randomDay(){
       String day = String.valueOf ((Math.random() * (27) + 1));
        return day ;
    }

    public static String randomMonth(){
        return String.valueOf((Math.random() * (11) + 1));
    }

    public static String randomYear(int maxYear, int minYear){
        return  String.valueOf((Math.random() * (maxYear - minYear) + minYear));
    }

    public static String getRandomDate(){
        String resultDate;

        return randomMonth() + "/" + randomDay() + "/" + randomYear(2000, 2021) ;
    }








}
