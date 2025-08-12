import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Cat {
    public static void cat(String[] args) throws IOException {
        if (args.length == 0) {
            System.out.print("");
            return;
        } 
        try {
            byte[] arr = Files.readAllBytes(Path.of(args[0]));
            PrintStream out = System.out;
            out.write(arr);
            out.flush();
        }catch(IOException error) {
            System.out.print("");
            return;
        }
    }
}