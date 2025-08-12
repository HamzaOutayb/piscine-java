import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length == 0) {
            return;
        }
        try {
            byte[] contentbytes = Files.readAllBytes(Path.of(args[0]));
            String content = new String(contentbytes);

            String res = content.substring(0, 1).toUpperCase()+content.substring(1).toLowerCase();
            Files.write(Path.of(args[1]), res.getBytes());
        } catch(IOException error) {
            throw error;
        }
    }
}