package Homework;

import Homework.Exercise1.*;
import Homework.Exercise2.Aster;
import Homework.Exercise2.BouquetOfFlowers;
import Homework.Exercise2.Chamomile;
import Homework.Exercise2.Rose;
import Homework.Exercise3.Guitar;
import Homework.Exercise3.MusicShop;
import Homework.Exercise3.Piano;
import Homework.Exercise3.Trumpet;

public class Main {

    private static CodingText caesarCoder = new CodingText();

    public static void main(String[] args) {

        codeDecode(processFiles());
        codeDecode(processFlowers());
        codeDecode(processMusicalInstrument());
    }

    private static void codeDecode(String text) {
        System.out.println(text);

        String encoded = caesarCoder.caesar(text);
        System.out.println(encoded);

        String decoded = caesarCoder.caesarDeshifrator(encoded);
        System.out.println(decoded);
    }

    private static String processFiles() {
        Directory directory = new Directory("Директория");
        directory.addFile(new AudioFile("Какой-то диджей"));
        directory.addFile(new TextFile("Книга"));
        directory.addFile(new ImageFile("Мона Лиза"));
        return directory.getFiles().toString();
    }

    private static String processFlowers() {
        BouquetOfFlowers bouquet = new BouquetOfFlowers("Букет цветов");
        bouquet.addFlower(new Aster("Цветок астра"));
        bouquet.addFlower(new Chamomile("Цветок ромашка"));
        bouquet.addFlower(new Rose("Цветок роза"));
        return bouquet.getFlowers().toString();
    }

    private static String processMusicalInstrument() {
        MusicShop shop = new MusicShop("Музыкальный магазин");
        shop.addMusicalInstrument(new Guitar("Гитара"));
        shop.addMusicalInstrument(new Piano("Пианино"));
        shop.addMusicalInstrument(new Trumpet("Труба"));
        return shop.getMusicalInstruments().toString();
    }
}
