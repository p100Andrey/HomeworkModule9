package Homework.Exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MusicShop {
    private String name;
    private List<MusicalInstrument> musicalInstruments;

    public MusicShop(String musicshop) {
        this.name = musicshop;
        musicalInstruments = new ArrayList<>();
    }

    public List<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(List<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMusicalInstrument(MusicalInstrument instrument) {
        musicalInstruments.add(instrument);
    }

    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order){
        return null;
    }
}