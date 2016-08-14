package Homework.Exercise2;

import java.util.List;

public class Rosebush {
    private List<Rose> roses;

    public List<Rose> getRoses() {
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }

    String namesbush;

    public String getNamesbush() {
        return namesbush;
    }

    public void setNamesbush(String namesbush) {
        this.namesbush = namesbush;
    }

    @Override
    public String toString() {
        return namesbush;
    }
}
