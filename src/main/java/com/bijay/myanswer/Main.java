package com.bijay.myanswer;

import java.util.Arrays;
import java.util.List;
/*from   w  ww . j  a  v  a 2  s.  c om*/
public class Main {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3);

		double sum = numbers
				.parallelStream()
				.reduce(0, (partialSum, a) -> partialSum + a, (a,b) -> 2*(a+b));
		System.out.println(sum);

	}
}
