package Homework.Exercise1;

public class AudioFile extends File {

    public AudioFile(String audioFile) {
        super(audioFile);
    }

    @Override
    public String toString() {
        return name;
    }
}
