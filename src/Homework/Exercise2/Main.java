package Homework.Exercise2;


import Homework.Exercise1.CodingText;
import Homework.Exercise1.File;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Aster aster = new Aster("Цветок астра");
        Chamomile chamomile = new Chamomile("Цветок ромашка");
        Tulip tulip = new Tulip("Цветок тюльпан");
        Rose rose = new Rose("Цветок роза");
        Rosebush rosesbush = new Rosebush("Куст чайной розы");
        BouquetOfFlowers bouquet = new BouquetOfFlowers("Букет цветов");
        Flower flower = new Flower("Цветы");

        bouquet.addFlower(aster);
        bouquet.addFlower(tulip);
        bouquet.addFlower(rose);

        shouText(aster, chamomile, tulip, rose, rosesbush, bouquet, flower);

        collectionCoding(bouquet.getFlowers());

        shouText(aster, chamomile, tulip, rose, rosesbush, bouquet, flower);

        collectionDeCoding(bouquet.getFlowers());

        shouText(aster, chamomile, tulip, rose, rosesbush, bouquet, flower);

        rosesbush.bushBrand();
        rosesbush.setBushage("10 лет");
        System.out.println(rosesbush);
    }

    private static void shouText(Aster aster, Chamomile chamomile, Tulip tulip, Rose rose, Rosebush rosesbush, BouquetOfFlowers bouquet, Flower flower) {
        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + aster.getflower() + ";");
        System.out.println("2." + chamomile.getflower() + ";");
        System.out.println("3." + tulip.getflower() + ";");
        System.out.println("4." + rose.getflower() + ";");
        System.out.println("5." + rosesbush.getNamesbush() + ";");
        System.out.println("6." + bouquet.getName() + ";");
        System.out.println("7." + flower.getflower() + ".");
        System.out.println("__________________________________");
    }

    private static void collectionCoding(Collection<Flower> enyCollection) {
        CodingText ct = new CodingText();
        for (Flower flower : enyCollection) {
            flower.setflower(ct.caesar(flower.getflower()));
        }
    }

    private static void collectionDeCoding(Collection<Flower> enyCollection) {
        CodingText ct = new CodingText();
        for (Flower flower : enyCollection) {
            flower.setflower(ct.caesarDeshifrator(flower.getflower()));
        }
    }
}
