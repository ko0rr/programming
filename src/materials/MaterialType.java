package materials;

public enum MaterialType {
    WOOD("дерево"),
    PLASTIC(""),
    METAL("металл");
    private String material;

    public String getMaterial() {
        if (this == PLASTIC) {
            return Plastic.PLASTIC.getPlastic();
        }
        return material;
    }

    public enum Plastic {
        WOODPLASTIC("древопластмасса"),
        METALPLASTIC("металлопластмасса"),
        PLASTIC("пластик"),
        COLORFULPLASTIC("различных цветов и оттенков");
        private String plastic;
        private Condition condition;

        Plastic(String plastic) {
            this.plastic = plastic;
        }

        public String getPlastic() {
            return plastic;
        }

        public enum Condition {
            USUAL("просто пластик"),
            SQUEEZED("спрессовывается");

            private String condition;

            Condition(String condition) {
                this.condition = condition;
            }

            public String getCondition() {
                return condition;
            }

        }
    }

    MaterialType(String material) {

        this.material = material;
    }

}