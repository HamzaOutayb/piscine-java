import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        Map<String, String> map = new HashMap<>();
        List<String> list1 = new ArrayList<>(first);
        List<String> list2 = new ArrayList<>(second);
        int min = Math.min(second.size(), first.size());
        for (int i = 0; i < min; i++) {
            map.put(list1.get(i), list2.get(i));
        }
        return map;
    }
}