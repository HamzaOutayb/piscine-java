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
    @Override
    public boolean equals(Object earth1) {
        if (earth1 == null || getClass() != earth1.getClass() || !super.equals(earth1)) return false;
        Star earth2 = (Star) earth1;
        return super.equals(earth2) && earth2.getMagnitude() == this.getMagnitude();
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.getMagnitude());
    }
}
