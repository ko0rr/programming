package furniture;

public enum FurnitureType {
    CHAIR("стул", 1),
    TABLE("стол", 1),
    BED("кровать", 1),
    WARDROBE("шкаф", 3),
    SOFA("диван", 2), ;

    private String type;
    private int size;
    FurnitureType(String type, int size) {
        this.type = type;
        this.size = size;

    }

    public String getType() {

        return type;

    }

    public int getSize() {

        return size;

    }


}
