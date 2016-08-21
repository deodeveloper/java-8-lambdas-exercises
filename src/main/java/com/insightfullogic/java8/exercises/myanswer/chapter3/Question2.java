package com.insightfullogic.java8.exercises.myanswer.chapter3;

import com.insightfullogic.java8.examples.chapter1.Artist;

public class Question2 {
    // Q3
    public static int countBandMembersInternal(java.util.List<Artist> artists) {
        //this reduce function could further be simplified with Method expression as Long::sum
        return  artists.stream().map(artist->artist.getMembers().count()).reduce(0l,(x,y)->x+y).intValue();
    }
}
