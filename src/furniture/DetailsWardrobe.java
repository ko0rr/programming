package furniture;

public enum DetailsWardrobe {
    SHELF("полка"),
    TRAYS("ящики"),
    DOORS("двери");
    private String type;
    DetailsWardrobe(String type){
        this.type = type;
    }

    public String getDetail(){
        return this.type;
    }
}
