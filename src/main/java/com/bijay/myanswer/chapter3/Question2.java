package com.bijay.myanswer.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.List;

public class Question2 {
    // Q3
    public static int countBandMembersInternal(List<Artist> artists) {
        return artists.stream()
		        .map(a->a.getMembers().count())
		        .reduce(0L,Long::sum)
		        .intValue();

                //alternative solution for parallel stream
	            /* artists.stream()
		        .reduce(0L,
		            (partialSum, a) -> partialSum + a.getMembers().count(),
		            (a, b) -> (a+b))
		        .intValue();*/
    }
}
