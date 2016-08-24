package com.bijay.myanswer.chapter3;

import org.apache.commons.math3.stat.descriptive.SummaryStatistics;

/**
 * Advanced Exercises Question 2
 */
public class MapUsingReduce {

    public static <I, O> java.util.List<O> map(java.util.stream.Stream<I> stream, java.util.function.Function<I, O> mapper) {
        /*List<O> output = new ArrayList<O>();
        return  stream.reduce(output,
                (oList,i)-> {oList.add(mapper.apply(i)); return oList;},
                );
                */
        //TODO: yet to be implemented
        throw new RuntimeException("not yet implemented");
        SummaryStatistics
    }

}
