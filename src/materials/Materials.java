package materials;

import furniture.Furniture;

public enum Materials {
    WOOD("дерево"),
    PLASTIC(Plastic.class),
    METAL("металл");
    private String material;
    private Class<?> subTypeEnum;

    Materials(String material) {

        this.material = material;
    }

    Materials(Class<?> subTypeEnum) {            // Конструктор для связывания с целым enum
        this.subTypeEnum = subTypeEnum;
    }

    public Class<?> getSubTypeEnum() {      // Метод для получения подтипа
        return subTypeEnum;
    }

    public String getMaterial() {
        if (subTypeEnum != null && subTypeEnum.isEnum()) {
            Class<? extends Enum<?>> enumClass = (Class<? extends Enum<?>>) subTypeEnum;
            Enum<?>[] constants = enumClass.getEnumConstants();

            // Пример: Получить названия всех элементов перечисления
            StringBuilder result = new StringBuilder();
            for (Enum<?> constant : constants) {
                if (constant instanceof Plastic plastic) {
                    result.append(plastic.getPlastic()).append(", ");
                }
            }
            return result.length() > 0 ? result.substring(0, result.length() - 2) : ""; // Убрать последнюю запятую
        }
        return material;
    }
    public String getSubMaterial(String specificEnumName) {
    if (subTypeEnum != null && subTypeEnum.isEnum()) {
        Class<? extends Enum<?>> enumClass = (Class<? extends Enum<?>>) subTypeEnum;
        Enum<?>[] constants = enumClass.getEnumConstants();

        for (Enum<?> constant : constants) {
            if (constant.name().equalsIgnoreCase(specificEnumName) && constant instanceof Plastic plastic) {
                return plastic.getPlastic();
            }
        }
        return "Element not found in Plastic enum";
    }
    return material;
}


}