import java.util.Objects;

public class CelestialObject {
    private double x;
    private double z;
    private double y;
    private String name;
    public static final double KM_IN_ONE_AU = 1.5E8;

    public CelestialObject() {
        this.x = 0.0;
        this.y = 0.0;
        this.z = 0.0;
        this.name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getZ() {
        return this.z;
    }

    public String getName() {
        return this.name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getDistanceBetween(CelestialObject defaultStar, CelestialObject earth) {
        double DeltaX = defaultStar.getX() - earth.getX();
        double DeltaY = defaultStar.getY() - earth.getY();
        double DeltaZ = defaultStar.getZ() - earth.getZ();
        return Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY + DeltaZ * DeltaZ);
    }

    public static double getDistanceBetweenInKm(CelestialObject defaultStar, CelestialObject earth) {
        double DeltaX = defaultStar.getX() - earth.getX();
        double DeltaY = defaultStar.getY() - earth.getY();
        double DeltaZ = defaultStar.getZ() - earth.getZ();
        return Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY + DeltaZ * DeltaZ) * KM_IN_ONE_AU;
    }

    public String toString() {
        return "${this.name} is positioned at (  ${this.x}  ,   ${this.y}  ,   ${this.z}  )";
    }

    public boolean equals(CelestialObject earth1) {
        if (earth1 == null && this == null) {
            return true;
        } else if (earth1 != null && this == null || earth1 == null && this != null) {
            return false;
        }
        return this.x == earth1.x && this.y == earth1.y && this.z == earth1.z && this.name.equals(earth1.name);
    }

    public int hashCode() {
    return Objects.hash(this.name, this.x, this.y, this.z);
    }

}
