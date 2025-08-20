import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        list.lastIndexOf(value);
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
        List<Integer> res = new List<Integer>();
        for (Integer i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                return res.add(i);
            }
        }
        return null;

    }
}