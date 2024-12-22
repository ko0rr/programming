package factory.machine;
import furniture.FurnitureType;
import materials.*;

public interface Squeeze {
    public Condition squeeze(Materials typeOfMaterial, Condition conditionOfMaterial, FurnitureType typeOfProduction);
}