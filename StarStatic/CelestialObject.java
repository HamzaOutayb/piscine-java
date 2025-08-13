
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

    public static double getDistanceBetween(CelestialObject defaultStar, CelestialObject earth) {
        double DeltaX = defaultStar.x - earth.x;
        double DeltaY = defaultStar.y - earth.y;
        double DeltaZ = defaultStar.z - earth.z;
        return Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY + DeltaZ * DeltaZ);
    }

    public static double getDistanceBetweenInKm(CelestialObject defaultStar, CelestialObject earth) {
        double DeltaX = defaultStar.x - earth.x;
        double DeltaY = defaultStar.y - earth.y;
        double DeltaZ = defaultStar.z - earth.z;
        return Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY + DeltaZ * DeltaZ)*KM_IN_ONE_AU;
    }
}
