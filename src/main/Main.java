package main;
import factory.machine.Factory;
import furniture.*;
import materials.*;


public class Main {
    public static void main(String[] args){

        Factory factory = new Factory(FurnitureType.CHAIR, MaterialType.WOOD);
        Chair chair = factory.produceChair(FurnitureType.CHAIR, MaterialType.PLASTIC); // проверять исключение тут
        Table table = factory.produceTable(FurnitureType.TABLE, MaterialType.PLASTIC);
        Wardrobe wardrobe = factory.produceWardrobe(FurnitureType.WARDROBE, MaterialType.PLASTIC);
        Sofa sofa = factory.produceSofa(FurnitureType.SOFA, MaterialType.PLASTIC);
        Bed bed = factory.produceBed(FurnitureType.BED, MaterialType.PLASTIC);

        System.out.println("========== Объекты созданы ===============");


    }
}


