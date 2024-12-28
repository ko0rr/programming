package factory.machine;
import furniture.FurnitureType;
import materials.*;

import java.util.Objects;


public class Machine implements Squeeze, PopOut {
    public FurnitureType typeOfProduction;
    public MaterialType typeOfMaterial;
    public boolean isBusy; //TODO private       ?вложенный класс/интерфейс

    public Machine(MaterialType material, FurnitureType furniture) {
        this.typeOfMaterial = material;
        this.typeOfProduction = furniture;
    }

    private boolean checkMaterial(MaterialType typeOfMaterial) throws UnsupportedMaterialException {
        isBusy = true;
        if (Objects.equals(typeOfMaterial.getMaterial(), MaterialType.PLASTIC.getMaterial())) {
           return true;
        } else {
            throw new UnsupportedMaterialException(typeOfMaterial);
        }
    }

    @Override
    public MaterialType.Plastic.Condition squeeze(MaterialType typeOfMaterial, FurnitureType typeOfProduction) {
        MaterialType.Plastic.Condition conditionOfPlastic = MaterialType.Plastic.Condition.USUAL;
        try{
            System.out.println("Начинается прессование. Подается материал " + typeOfMaterial.getMaterial());
            if (checkMaterial(typeOfMaterial)) {
                conditionOfPlastic = MaterialType.Plastic.Condition.SQUEEZED;
                System.out.println("Прессование успешно");

            }
        }catch (UnsupportedMaterialException e){
                System.out.println("Прессование невозможно с материалом " + typeOfMaterial.getMaterial());
            System.out.println("Caught exception: " + e.getMessage());
        }
        isBusy = true;
        return conditionOfPlastic;
    }

    @Override
    public MaterialType.Plastic.Condition popOut(MaterialType.Plastic.Condition condition) {
        isBusy = false;
        System.out.println("Продукт готов");
        return condition;
    }


}





