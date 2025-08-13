public class Star extends CelestialObject {
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
        return Math.sqrt(super.getX()*super.getX()+super.getY()*super.getY()+super.getZ()*super.getZ());
    }
}
