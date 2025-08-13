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
         this.magnitude =0.0;
    }
    public Star(String name, double x, double y, double z, double magnitude) {
         super(name, x, y, z);
         this.setMagnitude(magnitude);
    }
    @Override
    public String toString() {
        return String.format("%s shines at the %.3f magnitude", super.getName(), this.getMagnitude());
    }
    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass() || !super.equals(object)) return false;
        Star star = (Star) object;
        return  star.getMagnitude() == this.magnitude;
    }
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.magnitude);
    }
}
