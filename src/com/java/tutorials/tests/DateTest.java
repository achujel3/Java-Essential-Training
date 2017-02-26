package com.java.tutorials.tests;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

    public void testingDateClass(){

        Date date = new Date();
        System.out.println(date);

        GregorianCalendar gregorianCalendar = new GregorianCalendar(2009, 1, 28);
        gregorianCalendar.add(GregorianCalendar.DATE, 1);
        Date date2 = gregorianCalendar.getTime();
        System.out.println(date2);

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFormat.format(date2));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.of(2009, 1, 28);
        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dateTimeFormatter.format(localDate));

        LocalDate localDateNow = LocalDate.now();
        DateTimeFormatter dateTimeFormatterNow = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        System.out.println(dateTimeFormatterNow.format(localDateNow));

    }

}
