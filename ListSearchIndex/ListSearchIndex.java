import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        return list.lastIndexOf(value);
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                return i;
            }
        }
        return null;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> res = new ArrayList<>();
        for (Integer i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                res.add(i);
            }
        }
        return res;
    }
}