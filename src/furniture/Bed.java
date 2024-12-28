package furniture;
import materials.MaterialType;
import java.util.Objects;


public class Bed extends Furniture{
    public Bed(FurnitureType type, MaterialType material) {

        super(type, material);

    }

    @Override
    public int hashCode() {
        return Objects.hash(type, material);
    }

    @Override
    public String toString() {
        return type.getType() + " из " + material.getMaterial();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Furniture bed = (Furniture) o;
        return (Objects.equals(this.type, bed.type) && Objects.equals(this.material, bed.material));
    }
}
