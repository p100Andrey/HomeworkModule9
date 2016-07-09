package Homework.Exercise1;

public class Main {
    public static void main(String[] args) {

        CodingText codingText = new CodingText();


        AudioFile audio = new AudioFile("ololo.mp3");
        audio.setName("Какой-то диджей");
        TextFile text = new TextFile("Текстовый файл");
        text.setName("500 страниц");
        ImageFile image = new ImageFile("Файл изображения");
        image.setName("Мона Лиза");
        Directory directory = new Directory("Директория");

        directory.addFile(audio);
        directory.addFile(text);
        directory.addFile(image);

        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + audio.getName() + ";");
        System.out.println("2." + text.getName() + ";");
        System.out.println("3." + image.getName() + ";");
        System.out.println("4." + directory.getName() + ";");
        System.out.println("5." + directory.getFiles() + ";");
        System.out.println("__________________________________");

        codingText.caesar(directory);

        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + audio.getName() + ";");
        System.out.println("2." + text.getName() + ";");
        System.out.println("3." + image.getName() + ";");
        System.out.println("4." + directory.getName() + ";");
        System.out.println("5." + directory.getFiles() + ";");
        System.out.println("__________________________________");

        codingText.caesarDeshifrator(directory);

        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + audio.getName() + ";");
        System.out.println("2." + text.getName() + ";");
        System.out.println("3." + image.getName() + ";");
        System.out.println("4." + directory.getName() + ";");
        System.out.println("5." + directory.getFiles() + ";");
        System.out.println("__________________________________");

    }
}
