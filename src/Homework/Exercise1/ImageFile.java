package Homework.Exercise1;

public class ImageFile extends File {

    public ImageFile(String imagePreview) {
        super(imagePreview);
    }

    @Override
    public String toString() {
        return name;
    }
}
