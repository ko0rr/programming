package factory.machine;
import furniture.*;
import materials.*;

public class Factory {
    FurnitureType type;
    Materials material;
    Condition condition;
    public Factory(FurnitureType type, Materials material, Condition condition){
        this.type = type;
        this.material = material;
        this.condition = condition;
    }

    public Machine machine = new Machine(material, type, condition);

    public Chair produceChair(FurnitureType type, Materials material, Condition condition){
        Condition sample = machine.squeeze(material, condition, type);
        Condition finalCondition = machine.popOut(sample);
        return new Chair(FurnitureType.CHAIR, material, finalCondition);

    }
    public Table produceTable(FurnitureType type, Materials material, Condition condition){
        Condition sample = machine.squeeze(material, condition, type);
        Condition finalCondition = machine.popOut(sample);
        return new Table(FurnitureType.TABLE, material, finalCondition);

    }
    public Bed produceBed(FurnitureType type, Materials material, Condition condition){
        Condition sample = machine.squeeze(material, condition, type);
        Condition finalCondition = machine.popOut(sample);
        return new Bed(FurnitureType.BED, material, finalCondition);

    }
    public Sofa produceSofa(FurnitureType type, Materials material, Condition condition){
        Condition sample = machine.squeeze(material, condition, type);
        Condition finalCondition = machine.popOut(sample);
        return new Sofa(FurnitureType.SOFA, material, finalCondition);

    }

    public Wardrobe produceWardrobe(FurnitureType type, Materials material, Condition condition){
        Condition sample = machine.squeeze(material, condition, type);
        Condition finalCondition = machine.popOut(sample);
        return new Wardrobe(FurnitureType.WARDROBE, material, finalCondition);
    }

}