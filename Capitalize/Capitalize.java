import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        try {
            byte[] contentbytes = Files.readAllBytes(Path.of(args[0]));
            String content = new String(contentbytes);
            List<String> words = new ArrayList<>();
            for (String word : content.trim().split("\\s+")) {
                if (word.length() != 0) {
                    String sub = word.substring(0, 1).toUpperCase()+word.substring(1).toLowerCase();
                    words.add(sub);
                }
            }
            Files.write(Path.of(args[1]), String.join(" ", words).getBytes());
        } catch(IOException error) {
            throw error;
        }
    }
}