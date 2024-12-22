package furniture;

import materials.Condition;
import materials.Materials;

import java.util.Objects;
public class Sofa extends Furniture{
    public Sofa(FurnitureType type, Materials material, Condition condition) {

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
        Furniture sofa = (Furniture) o;
        return (Objects.equals(this.type, sofa.type) && Objects.equals(this.material, sofa.material) && Objects.equals(this.condition, sofa.condition));
    }
}
