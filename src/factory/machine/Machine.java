package factory.machine;
import furniture.FurnitureType;
import materials.*;


public class Machine implements Squeeze, PopOut {
    public FurnitureType typeOfProduction;
    public Materials typeOfMaterial;
    public Condition conditionOfMaterial;

    public Machine(Materials material, FurnitureType furniture, Condition condition) {
        this.typeOfMaterial = material;
        this.typeOfProduction = furniture;
        this.conditionOfMaterial = condition;
    }

    public boolean checkMaterial(Materials typeOfMaterial) throws UnsupportedMaterialException {
        boolean flag = false;
        Material plastic = new Material(Materials.PLASTIC);
        if (typeOfMaterial.getMaterial().equals(plastic.materials().getMaterial())) {
            flag = true;
            return flag;
        } else {
            throw new UnsupportedMaterialException(typeOfMaterial);
        }
    }

    @Override
    public Condition squeeze(Materials typeOfMaterial, Condition conditionOfMaterial, FurnitureType typeOfProduction) {
        try{
            if (checkMaterial(typeOfMaterial)) {
                conditionOfMaterial = Condition.SQUEEZED;
                return conditionOfMaterial;
            }
        }catch (UnsupportedMaterialException e){
            System.out.println("Caught exception: " + e.getMessage());
        }
        return conditionOfMaterial;
    }

    @Override
    public Condition popOut(Condition condition) {
        return Condition.PRODUCTION;
    }


}





