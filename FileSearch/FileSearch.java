import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class FileSearch {
    public static String searchFile(String fileName) {
        return Files.walk(Path.of(fileName))
        .filter( (path)-> path.getFileName().toString().equals(fileName))
        .findFirst()
        .map(Path::toString)
        .orElse(null);
    }

}
