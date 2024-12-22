package factory.machine;

import materials.Materials;

class UnsupportedMaterialException extends Exception {
    public UnsupportedMaterialException(Materials material) {
        super("Нельзя поместить " + material.getMaterial() + " в машину");
    }
    public String getMessage(){
        return "Материал не поддерживается";
    }
}