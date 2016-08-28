package com.bijay.myanswer.chapter4;

import com.insightfullogic.java8.examples.chapter1.Artist;

import java.util.List;
import java.util.Optional;

public class Artists {

    private List<Artist> artists;

    public Artists(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            return Optional.empty();
        }
        return Optional.of(artists.get(index));
    }

    private void indexException(int index) {
        throw new IllegalArgumentException(index + 
                                           " doesn't correspond to an Artist");
    }

    public Optional<String> getArtistName(int index) {
        try {
            return getArtist(index).isPresent()? Optional.of(getArtist(index).get().getName()) : Optional.empty();
        } catch (IllegalArgumentException e) {
            return Optional.of("unknown");
        }
    }

}
