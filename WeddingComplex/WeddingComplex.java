import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        Map<String, String> res = new HashMap<>();
        
        for (Map.Entry<String, List<String>> entry : first.entrySet()) {
            String person = entry.getKey();
            List<String> preferences = entry.getValue();
            if (second.containsKey(person)) {
                List<String> secondPreferences = second.get(person);
                for (String preference : preferences) {
                    if (secondPreferences.contains(preference)) {
                        res.put(person, preference);
                        break;
                    }
                }
            }
        }
        
        return res;
    }
}
