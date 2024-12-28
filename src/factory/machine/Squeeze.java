package factory.machine;
import furniture.FurnitureType;
import materials.*;

public interface Squeeze {
    MaterialType.Plastic.Condition squeeze(MaterialType typeOfMaterial, FurnitureType typeOfProduction);
}