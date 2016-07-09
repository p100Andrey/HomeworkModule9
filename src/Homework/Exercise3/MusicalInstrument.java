package Homework.Exercise3;


public class MusicalInstrument {

    private String brend;

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    protected String instrument;

    public String getNameinstrument() {
        return instrument;
    }

    public void setNameinstrument(String instrument) {
        this.instrument = instrument;
    }

    public MusicalInstrument(String name) {
        this.instrument = name;
    }

    public void price() {
        System.out.println(instrument + ": MUSIC");
    }

    @Override
    public String toString() {
        return instrument + ", Open: " + brend;
    }
}