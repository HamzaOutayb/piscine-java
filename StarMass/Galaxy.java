import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        this.celestialObjects = new ArrayList<>();
    }

    public List<CelestialObject> getCelestialObjects() {
        return celestialObjects;
    }

    public void addCelestialObject(CelestialObject ele) {
        this.celestialObjects.add(ele);
    }

    public HashMap<String, Integer> computeMassRepartition() {
        HashMap<String, Integer>  mymap = new HashMap<>();
        mymap.put("Planet", 0);
        mymap.put("Star", 0);
        mymap.put("Other", 0);
        for (CelestialObject num : celestialObjects) {
            if (num instanceof Planet) {
                Integer mass = (Integer) mymap.get("Planet");
                mymap.put("Planet", mass + num.getMass());
            } else if (num instanceof Star) {
                Integer mass = (Integer) mymap.get("Star");
                mymap.put("Star", mass + num.getMass());

            } else {
                Integer mass = (Integer) mymap.get("Other");
                mymap.put("Other", mass + num.getMass());

            }
        }
        return mymap;
    }
}