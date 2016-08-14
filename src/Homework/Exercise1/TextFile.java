package Homework.Exercise1;


public class TextFile extends File {

    public TextFile(String textFile) {
        super(textFile);
    }

    @Override
    public String toString() {
        return name;
    }
}