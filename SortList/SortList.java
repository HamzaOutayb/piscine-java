import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        if (list == null) {
            return null;
        }
        List<Integer> res = new ArrayList<>(list);
        for (int i = 0; i < res.size(); i++) {
            for (int j = i + 1; j < res.size(); j++) {
                if (res.get(i) > res.get(j)) {
                    Integer temp = res.get(i);
                    res.set(i, res.get(j));
                    res.set(j, temp);
                }
            }
        }
        return res;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null) {
            return null;
        }
        List<Integer> res = new ArrayList<>(list);
        res.sort(Collections.reverseOrder());
        return res;
    }
}