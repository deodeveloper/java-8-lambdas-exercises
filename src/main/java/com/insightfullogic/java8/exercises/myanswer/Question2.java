package com.insightfullogic.java8.exercises.myanswer;

public class Question2 {

    public static ThreadLocal<javax.swing.text.DateFormatter> formatter
            = ThreadLocal.withInitial(()->new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MMM-YYYY")));

}
