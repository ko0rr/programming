package main;
import factory.machine.Factory;
import furniture.*;
import materials.*;


public class Main {
    public static void main(String[] args){
        Factory factory = new Factory(FurnitureType.CHAIR, Materials.WOOD, Condition.USUAL);
        Chair chair = factory.produceChair(FurnitureType.CHAIR, Materials.PLASTIC, Condition.USUAL); // проверять исключение тут
        Table table = factory.produceTable(FurnitureType.TABLE, Materials.PLASTIC, Condition.USUAL);
        Wardrobe wardrobe = factory.produceWardrobe(FurnitureType.WARDROBE, Materials.PLASTIC, Condition.USUAL);
        Sofa sofa = factory.produceSofa(FurnitureType.SOFA, Materials.PLASTIC, Condition.USUAL);
        Bed bed = factory.produceBed(FurnitureType.BED, Materials.PLASTIC, Condition.USUAL);
        //Class<?> plasticClass = Materials.PLASTIC.getSubTypeEnum();

        System.out.println("========== Объекты созданы ===============");

        Story story = new Story(Plastic.PLASTIC, FurnitureType.CHAIR, Materials.PLASTIC);
        story.process(Plastic.PLASTIC, chair.type, table.type, bed.type);
        story.detailedProcess(wardrobe.type, sofa.type);
        story.wardrobeCreation(wardrobe);
        story.plasticDescription(Plastic.PLASTIC, Plastic.COLORFULPLASTIC);
        story.woodplasticDespriction(Plastic.WOODPLASTIC, Materials.WOOD);
        story.metalplasticDespriction(Plastic.METALPLASTIC, Materials.METAL);






    }
}


