package Homework.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class BouquetOfFlowers {
    private String name;
    private List<Flower> flowers;

    public BouquetOfFlowers(String bouqet) {
        this.name = bouqet;
        flowers = new ArrayList<>();
    }

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;

    }
    public String getName() {
        return name;
    }

    public void addFlower (Flower flower){
        flowers.add(flower);
    }
}