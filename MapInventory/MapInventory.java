import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapInventory {
    public static int getProductPrice(Map<String, Integer> inventory, String productId) {
        return inventory.get(productId) == null ? -1 : inventory.get(productId);
    }

    public static List<String> getProductIdsByPrice(Map<String, Integer> inventory, int price) {
        List<String> res = new ArrayList<>();
        for (Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() == (price)) {
                res.add(entry.getKey());
            }
        }
        return res;
    }
}