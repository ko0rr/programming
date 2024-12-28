package furniture;
import materials.*;

abstract public class Furniture {
    public FurnitureType type;
    public MaterialType material;


    public Furniture(FurnitureType type, MaterialType material){

        this.type = type;
        this.material = material;



    }

    public FurnitureType getType(){
        return type;
    }
    public MaterialType getMaterial(){
        return this.material;
    }


    }

