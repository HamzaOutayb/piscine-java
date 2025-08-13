import java.util.Objects;

public class Planet extends CelestialObject{
    private Star centerStar;
    public Planet() {
        super();
        centerStar = new Star();
    }
    public Planet(String name, double x, double y, double z, Star star) {
        super(name, x, y, z);
        centerStar = star;
    }

    public Star getCenterStar() {
        return this.centerStar;
    }
    public  void setCenterStar(Star s) {
         this.centerStar = s;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), this.centerStar);
    }

    @Override
    public boolean equals(Object earth) {
        if (!(earth instanceof Planet)) {
            return false;
        }
        Planet planet = (Planet) earth;
        return super.equals(planet) && this.centerStar.equals(planet.getCenterStar());
    }
    @Override
    public String toString() {
        return String.format("%s circles around %s at the %.3f AU", super.getName(), this.getCenterStar().getName(), super.getDistanceBetween(this,this.getCenterStar()));
    }
}
