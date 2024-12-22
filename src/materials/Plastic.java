package materials;

public enum Plastic {
    WOODPLASTIC("древопластмасса"),
    METALPLASTIC("металлопластмасса"),
    PLASTIC("пластик"),
    COLORFULPLASTIC("различных цветов и оттенков");
    private String plastic;

    Plastic(String plastic) {

        this.plastic = plastic;
    }

    public String getPlastic() {
        return plastic;
    }
}