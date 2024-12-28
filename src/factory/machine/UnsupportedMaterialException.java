package factory.machine;

import materials.MaterialType;

class UnsupportedMaterialException extends Exception {
    public UnsupportedMaterialException(MaterialType material) {
        super("Нельзя поместить " + material.getMaterial() + " в машину");
    }
    public String getMessage(){
        return "Материал не поддерживается";
    }
}