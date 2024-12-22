package materials;

public enum Condition {
    USUAL("просто пластик"),
    SQUEEZED("спрессовывается"),
    PRODUCTION("готовый");
    private String condition;
    Condition(String condition){
        this.condition = condition;
    }


    public String getCondition() {
        return condition;
    }

}
