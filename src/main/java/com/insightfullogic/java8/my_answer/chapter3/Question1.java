package com.insightfullogic.java8.my_answer.chapter3;

import com.insightfullogic.java8.examples.chapter1.Album;
import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question1 {
    public static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0,(x,y) -> x+y);
    }

    public static java.util.List<String> getNamesAndOrigins(List<Artist> artists) {
        //better to use Stream.of(...) than Arrays.asList(...).stream()
        return artists.stream().flatMap(artist -> Arrays.asList(artist.getName(), artist.getNationality()).stream()).collect(Collectors.toList());
    }

    public static java.util.List<Album> getAlbumsWithAtMostThreeTracks(List<Album> input) {
        return input.stream().filter(album -> album.getTrackList().size()<=3).collect(Collectors.toList());
    }
}
