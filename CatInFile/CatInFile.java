import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
       InputStream in = System.in;
        byte[] data = in.readAllBytes();
        try {
            Files.write(Path.of(args[0]), data);
        } catch(IOException err) {
            return;
        }
    }
}