package Homework.Exercise1;

import java.io.*;
import java.util.Collection;

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

        collectionCoding(directory.getFiles());

        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + audio.getName() + ";");
        System.out.println("2." + text.getName() + ";");
        System.out.println("3." + image.getName() + ";");
        System.out.println("4." + directory.getName() + ";");
        System.out.println("5." + directory.getFiles() + ";");
        System.out.println("__________________________________");

        collectionDeCoding(directory.getFiles());

        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + audio.getName() + ";");
        System.out.println("2." + text.getName() + ";");
        System.out.println("3." + image.getName() + ";");
        System.out.println("4." + directory.getName() + ";");
        System.out.println("5." + directory.getFiles() + ";");
        System.out.println("__________________________________");

    }

    private static void collectionCoding(Collection<File> enyCollection) {
        CodingText ct = new CodingText();
        for (File file : enyCollection) {
            file.setName(ct.caesar(file.getName()));
        }
    }

    private static void collectionDeCoding(Collection<File> enyCollection) {
        CodingText ct = new CodingText();
        for (File file : enyCollection) {
            file.setName(ct.caesarDeshifrator(file.getName()));
        }
    }
}
//В задании сказано: "Зашифровать и расшифровать текстовое представление коллекци обьектов из ДЗ из Модуля 3: ООП в Java"
//У тебя шифратор работает только сфайлами
// В модуле 3 вроде было еще что-то