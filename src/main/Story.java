package main;

import furniture.DetailsWardrobe;
import furniture.Furniture;
import furniture.FurnitureType;
import furniture.Wardrobe;
import materials.*;

public class Story {
    FurnitureType furniture;
    Materials material;
    Plastic plastic;

    public Story(Plastic plastic, FurnitureType furniture, Materials material){
        this.furniture = furniture;
        this.material = material;
        this.plastic = plastic;
    }


    public void process(Plastic material, FurnitureType furniture1, FurnitureType furniture2, FurnitureType furniture3){
        String result = Materials.PLASTIC.getSubMaterial(String.valueOf(material));
        System.out.println(result + " подаётся в штамповальную машину. ");
        System.out.println("Там она " + Condition.SQUEEZED.getCondition() + " и из машины выскакивает " +  Condition.PRODUCTION.getCondition() + " " + furniture1.getType() + ", " + furniture2.getType() + " или " + furniture3.getType());
    }

    public void detailedProcess(FurnitureType furniture1, FurnitureType furniture2){
        System.out.println("Для изготовления " + furniture1.getType() + " или " + furniture2.getType() + " требовалась не одна штамповальная машина, а " + furniture1.getSize() + " или " + furniture2.getSize());
    }

    public void plasticDescription(Plastic plastic, Plastic plasticColor){
        String result1 = Materials.PLASTIC.getSubMaterial(String.valueOf(plastic));
        String result2 = Materials.PLASTIC.getSubMaterial(String.valueOf(plasticColor));
        System.out.println(result1 + " изготавливался " + result2);
    }

    public void wardrobeCreation(Wardrobe furniture){
        DetailsWardrobe[] arrayWardrobe = furniture.getDetails();
        System.out.println("На одной такой машине изготавливался сам " + FurnitureType.WARDROBE.getType() + ", на другой - " + arrayWardrobe[2].getDetail() + " к нему и " + arrayWardrobe[0].getDetail() + ", на третьей - " + arrayWardrobe[1].getDetail() + " и так далее.");
    }

    public void woodplasticDespriction(Plastic plastic, Materials material){
        String woodplastic = Materials.PLASTIC.getSubMaterial(String.valueOf(plastic));
        System.out.println("Была так называемая " + woodplastic + ". Мебель из неё было не отличить от " + material.getMaterial());
    }

    public void metalplasticDespriction(Plastic plastic, Materials material){
        String metalplastic = Materials.PLASTIC.getSubMaterial(String.valueOf(plastic));
        System.out.println("Была также " + metalplastic + ", которая заменяла " + material.getMaterial());
    }


}
