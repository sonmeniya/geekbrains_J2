package ru.java;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class HowTime {
    public static void main(String[] args) {
        DateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss ");
        String time = DATE_FORMAT.format(System.currentTimeMillis());
        System.out.println(time);
    }
}