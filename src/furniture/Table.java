package furniture;

import materials.Condition;
import materials.Materials;

import java.util.Objects;
public class Table extends Furniture{
    public Table(FurnitureType type, Materials material, Condition condition) {

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
        Furniture table = (Furniture) o;
        return (Objects.equals(this.type, table.type) && Objects.equals(this.material, table.material) && Objects.equals(this.condition, table.condition));
    }
}
