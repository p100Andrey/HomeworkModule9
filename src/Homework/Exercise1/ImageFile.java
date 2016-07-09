package Homework.Exercise1;

public class ImageFile extends File {

    public String painter;

    public String getPainter() {
        return painter;
    }

    public void setPainter(String painter) {
        this.painter = painter;
    }

    public ImageFile(String imagePreview) {
        super(imagePreview);
    }

    public void picture() {
        System.out.println(name + " - picture");
    }

    @Override
    public String toString() {
        return name + ", painter, " + painter;
    }
}
