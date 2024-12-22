package furniture;
import materials.*;

abstract public class Furniture {
    public Condition condition;
    public FurnitureType type;
    public Materials material;

    public Furniture(FurnitureType type, Materials material, Condition condition){

        this.type = type;
        this.material = material;
        this.condition = condition;

    }

    public FurnitureType getType(){
        return type;
    }
    public Materials getMaterial(){
        return this.material;
    }
    public Condition getCondition(){
        return this.condition;}



    }

