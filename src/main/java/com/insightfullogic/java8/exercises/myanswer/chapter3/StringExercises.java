package com.insightfullogic.java8.exercises.myanswer.chapter3;

import java.util.Comparator;

public class StringExercises {

    // Question 7
    public static int countLowercaseLetters(String string) {
        return (int) string.chars().mapToObj(c->(char)c).filter(Character::isLowerCase).count();
    }

    // Question 8
    public static java.util.Optional<String> mostLowercaseString(java.util.List<String> strings) {
        return strings.stream().max(Comparator.comparing(s -> s.chars().mapToObj(c->(char)c).filter(Character::isLowerCase).count()));
    }

}
