package Homework.Exercise3;


import Homework.Exercise1.CodingText;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        MusicShop shop = new MusicShop("Музыкальный магазин");
        Guitar guitar = new Guitar("Гитара");
        Piano piano = new Piano("Пианино");
        Trumpet trumpet = new Trumpet("Труба");
        MusicalInstrument musicalinstrument = new MusicalInstrument("Магазин");

        shop.addMusicalInstrument(guitar);
        shop.addMusicalInstrument(piano);
        shop.addMusicalInstrument(trumpet);

        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + guitar.getNameinstrument() + ";");
        System.out.println("2." + piano.getNameinstrument() + ";");
        System.out.println("3." + trumpet.getNameinstrument() + ";");
        System.out.println("4." + shop.getName() + ";");
        System.out.println("5." + musicalinstrument.getNameinstrument() + ".");
        System.out.println("__________________________________");

        collectionCoding(shop.getMusicalInstruments());

        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + guitar.getNameinstrument() + ";");
        System.out.println("2." + piano.getNameinstrument() + ";");
        System.out.println("3." + trumpet.getNameinstrument() + ";");
        System.out.println("4." + shop.getName() + ";");
        System.out.println("5." + musicalinstrument.getNameinstrument() + ".");
        System.out.println("__________________________________");

        collectionDeCoding(shop.getMusicalInstruments());

        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + guitar.getNameinstrument() + ";");
        System.out.println("2." + piano.getNameinstrument() + ";");
        System.out.println("3." + trumpet.getNameinstrument() + ";");
        System.out.println("4." + shop.getName() + ";");
        System.out.println("5." + musicalinstrument.getNameinstrument() + ".");
        System.out.println("__________________________________");
        musicalinstrument.price();

        musicalinstrument.setBrend("8:00-18:00");
        System.out.println(musicalinstrument);
    }

    private static void collectionCoding(Collection<MusicalInstrument> enyCollection) {
        CodingText ct = new CodingText();
        for (MusicalInstrument musicalInstrument : enyCollection) {
            musicalInstrument.setNameinstrument(ct.caesar(musicalInstrument.getNameinstrument()));
        }
    }

    private static void collectionDeCoding(Collection<MusicalInstrument> enyCollection) {
        CodingText ct = new CodingText();
        for (MusicalInstrument musicalInstrument : enyCollection) {
            musicalInstrument.setNameinstrument(ct.caesarDeshifrator(musicalInstrument.getNameinstrument()));
        }
    }
}