package furniture;

import materials.*;
import java.util.Objects;

public class Wardrobe extends Furniture{
    public Wardrobe(FurnitureType type, MaterialType material) {
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
        Furniture wardrobe = (Furniture) o;
        return (Objects.equals(this.type, wardrobe.type) && Objects.equals(this.material, wardrobe.material));
    }
}
