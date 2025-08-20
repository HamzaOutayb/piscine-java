import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return null;
        }
        Integer res =  list.lastIndexOf(value);
        return res == -1 ? null : res;
    }

    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                return i;
            }
        }
        return null;
    }

    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> res = new ArrayList<>();
        if (list == null) {
            return res;
        }
        for (Integer i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                res.add(i);
            }
        }
        return res;
    }
}