package factory.machine;
import furniture.*;
import materials.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Factory {
    FurnitureType type;
    MaterialType material;

    public Factory(FurnitureType type, MaterialType material){
        this.type = type;
        this.material = material;

    }

    //private Machine machine = new Machine(material, type);
    ArrayList<Machine> machines = new ArrayList<>(Arrays.asList(

            new Machine(material, type),
            new Machine(material, type),
            new Machine(material, type),
            new Machine(material, type),
            new Machine(material, type),
            new Machine(material, type),
            new Machine(material, type),
            new Machine(material, type)
    ));


    public Chair produceChair(FurnitureType type, MaterialType material){
        System.out.println("Производится " + type.getType() + ", нужно машин: " + type.getSize());
        Machine availableMachine = null;
        for (Machine m : machines) {
            if (!m.isBusy)

                availableMachine = m;
        }

        if (availableMachine == null) {

            throw new IllegalArgumentException("No available machines");

        }
        MaterialType.Plastic.Condition sample = availableMachine.squeeze(material, type);
        availableMachine.popOut(sample);

        return new Chair(FurnitureType.CHAIR, material);

    }



    public Table produceTable(FurnitureType type, MaterialType material){
        System.out.println("Производится " + type.getType() + ", нужно машин: " + type.getSize());
        Machine availableMachine = null;
        for (Machine m : machines) {
            if (!m.isBusy)
                availableMachine = m;
        }
        if (availableMachine == null) {
            throw new IllegalArgumentException("No available machines");
        }
        MaterialType.Plastic.Condition sample = availableMachine.squeeze(material, type);
        availableMachine.popOut(sample);
        return new Table(FurnitureType.TABLE, material);

    }



    public Bed produceBed(FurnitureType type, MaterialType material){
        System.out.println("Производится " + type.getType() + ", нужно машин: " + type.getSize());
        Machine availableMachine = null;
        for (Machine m : machines) {
            if (!m.isBusy)
                availableMachine = m;
        }
        if (availableMachine == null) {
            throw new IllegalArgumentException("No available machines");
        }
        MaterialType.Plastic.Condition sample = availableMachine.squeeze(material, type);
        availableMachine.popOut(sample);
        return new Bed(FurnitureType.BED, material);

    }

// подумать про сложный объект
    public Sofa produceSofa(FurnitureType type, MaterialType material) {
        System.out.println("Производится " + type.getType() + ", нужно машин: " + type.getSize());
        Machine availableMachine = null;
        int i = 1;
            for (Machine m : machines) {
                if (!m.isBusy && (i<= type.getSize())){
                    System.out.println("Используется машина номер " + i);
                    i++;
                    availableMachine = m;

                }
        }

        if (availableMachine == null) {
            throw new IllegalArgumentException("No available machines");
        }
        MaterialType.Plastic.Condition sample = availableMachine.squeeze(material, type);
        availableMachine.popOut(sample);

        return new Sofa(FurnitureType.SOFA, material);
    }


    public Wardrobe produceWardrobe(FurnitureType type, MaterialType material){
        System.out.println("Производится " + type.getType() + ", нужно машин: " + type.getSize());
        Machine availableMachine = null;
        int i = 1;
            for (Machine m : machines) {
                if (!m.isBusy && (i<= type.getSize())){
                    System.out.println("Используется машина номер " + i);
                    i++;
                    availableMachine = m;

                }
        }

        if (availableMachine == null) {
            throw new IllegalArgumentException("No available machines");
        }
        MaterialType.Plastic.Condition sample = availableMachine.squeeze(material, type);
        availableMachine.popOut(sample);
        return new Wardrobe(FurnitureType.WARDROBE, material);
    }



}



