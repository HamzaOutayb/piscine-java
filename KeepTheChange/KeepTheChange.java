import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> coin = new ArrayList<>(coins);
        coin.sort(null);
        Collections.reverse(coin);
        List<Integer> res = new ArrayList<>();
        for (Integer c : coin) {
            while (amount-c > 0 && c <= amount) {
                res.add(c);
                amount -= c;
            }
        }
        return res;
    }
}