package com.bijay.myanswer.chapter3;

import com.insightfullogic.java8.exercises.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Advanced Exercises Question 1
 */
public class FilterUsingReduce {

	public static <I> List<I> filter(Stream<I> stream, Predicate<I> predicate) {
		return stream.reduce(new ArrayList<I>(), (r, e) -> {
			ArrayList list = new ArrayList(r);
			if (predicate.test(e))
				list.add(e);
			return list;
		}, (l, r) -> {
			ArrayList list = new ArrayList(l);
			list.addAll(r);
			return list;
		});
	}

}
