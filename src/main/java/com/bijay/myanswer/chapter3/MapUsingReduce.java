package com.bijay.myanswer.chapter3;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Advanced Exercises Question 2
 */
public class MapUsingReduce {

	public static <I, O> List<O> map(Stream<I> stream, Function<I, O> mapper) {
		return stream.reduce(new ArrayList<O>(), (r, e) -> {
					ArrayList<O> list = new ArrayList<>(r);
					list.add(mapper.apply(e));
					return list;
				},
				(l1, l2) -> {
					// Avoid mutating the list
					ArrayList<O> list = new ArrayList<>(l1);
					list.addAll(l2);
					return list;
				});
	}
}
