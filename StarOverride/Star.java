import java.util.Objects;

public class Star extends CelestialObject {
    private double magnitude;

    public String getName() {
        return super.getName();
    }
    public double getX() {
        return super.getX();
    }
    public double getY() {
        return super.getY();
    }
    public double getZ() {
        return super.getZ();
    }
    public double getMagnitude() {
        return this.magnitude;
    }
    public void setMagnitude(double Magnitude) {
    this.magnitude = Magnitude;
}

    public Star() {
         super();
    }
    public Star(String name, double x, double y, double z, double magnitude) {
         super(name, x, y, z);
         this.setMagnitude(magnitude);
    }
    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude)", super.getName(), this.getMagnitude());
    }

    public boolean equals(Object earth1) {
        if (earth1 == null && this == null) {
            return true;
        } else if (earth1 != null && this == null || earth1 == null && this != null) {
            return false;
        }
        Star earth2 = (Star)earth1;
        return this.getX() == earth2.getX() && this.getY() == earth2.getY() && this.getZ() == earth2.getZ() && this.getName().equals(earth2.getName()) && this.magnitude == earth2.getMagnitude();
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), this.magnitude);
    }
}
