package Homework.Exercise2;


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

        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + aster.getflower() + ";");
        System.out.println("2." + chamomile.getflower() + ";");
        System.out.println("3." + tulip.getflower() + ";");
        System.out.println("4." + rose.getflower() + ";");
        System.out.println("5." + rosesbush.getNamesbush() + ";");
        System.out.println("6." + bouquet.getName() + ";");
        System.out.println("7." + flower.getflower() + ".");

        rosesbush.bushBrand();
        rosesbush.setBushage("10 лет");
        System.out.println(rosesbush);
    }
}
