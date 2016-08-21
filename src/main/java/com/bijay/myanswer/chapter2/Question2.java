package com.bijay.myanswer.chapter2;

public class Question2 {

    public static ThreadLocal<javax.swing.text.DateFormatter> formatter
            = ThreadLocal.withInitial(()->new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MMM-YYYY")));

}
