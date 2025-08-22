import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> first,
            Map<String, List<String>> second) {
        Map<String, String> result = new HashMap<>();

        for (String key : first.keySet()) {
            for (String pref : first.get(key)) {
                if (!result.containsValue(pref)) {
                    result.put(key, pref);
                    break;
                } else {
                    String otherHusband = findKeyByValue(result, pref);
                    if (second.get(pref).indexOf(key) < second.get(pref).indexOf(otherHusband)) {
                        result.put(key, pref);
                        result.remove(otherHusband);

                        for (String newPref : first.get(otherHusband)) {
                            if (!result.containsValue(newPref)) {
                                result.put(otherHusband, newPref);
                                break;
                            }
                        }
                        break;
                    }
                }
            }

        }

        return result;
    }

    public static String findKeyByValue(Map<String, String> map, String value) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null; // Return null if value is not found
    }
}