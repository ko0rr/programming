package furniture;

import materials.Condition;
import materials.Materials;

import java.util.Objects;
public class Chair extends Furniture{
    public Chair(FurnitureType type, Materials material, Condition condition) {
        super(type, material, condition);

    }


    @Override
    public int hashCode() {
        return Objects.hash(type, material, condition);
    }

    @Override
    public String toString() {
        return type.getType() + " из " + material.getMaterial();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture chair = (Furniture) o;
        return (Objects.equals(this.type, chair.type) && Objects.equals(this.material, chair.material) && Objects.equals(this.condition, chair.condition));
    }

}
