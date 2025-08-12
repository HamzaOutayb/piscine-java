import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {
    public static void createFile(String fileName, String content) throws IOException {
        try {
            Files.createFile(Path.of(fileName));
            Files.writeString(Path.of(fileName), content);
        } catch(IOException error) {
            throw error;
        }
    }
    public static String getContentFile(String fileName) throws IOException {
        try {
            byte[] content = Files.readAllBytes(Path.of(fileName));
            return new String(content);
        }catch(IOException error) {
            throw error;
        }

    }
    public static void deleteFile(String fileName) {
        try {
            Files.delete(Path.of(fileName));
        }catch(IOException error) {
            System.err.println(error);
        }
    }
}