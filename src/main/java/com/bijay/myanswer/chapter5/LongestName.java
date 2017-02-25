package com.bijay.myanswer.chapter5;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LongestName {

    public static Artist byReduce(List<Artist> artists) {
        return artists.stream().reduce((a1, a2) -> a1.getName().length() - a2.getName().length()>0 ? a1 : a2).orElse(null);
    }

    public static Artist byCollecting(List<Artist> artists) {
        return artists.stream().collect(Collectors.maxBy(Comparator.comparing((Artist a) -> a.getName().length() ))).orElse(null);
    }

}
