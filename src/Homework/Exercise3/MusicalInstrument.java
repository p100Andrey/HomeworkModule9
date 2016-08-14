package Homework.Exercise3;


public class MusicalInstrument {

    public String instrument;

    public String getNameinstrument() {
        return instrument;
    }

    public void setNameinstrument(String instrument) {
        this.instrument = instrument;
    }

    public MusicalInstrument(String name) {
        this.instrument = name;
    }

    @Override
    public String toString() {
        return instrument;
    }
}