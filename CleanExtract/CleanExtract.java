import java.util.ArrayList;
import java.util.List;

public class CleanExtract {
    public static String extract(String s) {
        List<String> res = new ArrayList<>();
        String[] parts = s.split("\\|");

        for (String part : parts) {
            if (!part.contains(".") && !part.trim().isEmpty()) {
                res.add(part);
                continue;
            }

            boolean eat = false;
            StringBuilder sub = new StringBuilder();

            part = part.trim();
            for (int i = 0; i < part.length(); i++) {
                char c = part.charAt(i);
                if (c == '.' && part.length()-1 == i)  {
                    continue;
                }
                if (c == '.' && eat == false) {
                    eat = true;
                    continue;
                }
                if (eat) {
                    sub.append(c);
                }
            }
            if (!sub.toString().trim().isEmpty()) {
                res.add(sub.toString().trim());
            }
        }
        return String.join(" ", res);
    }
}