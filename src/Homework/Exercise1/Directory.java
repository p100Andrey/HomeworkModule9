package Homework.Exercise1;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private String name;
    private List<File> files;

    public Directory(String directory) {
        this.name = directory;
        files = new ArrayList<>();
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public String getName() {
        return name;
    }

    public void addFile(File file){
        files.add(file);
    }
}
