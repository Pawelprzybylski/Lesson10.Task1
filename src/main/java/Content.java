import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Content {
    public static void main(String[] args) throws IOException {
        String content = Files.readString(Path.of("C:\\Users\\pawel\\Desktop\\Exercisses lesson 10\\Exercises 1.txt"));
    }

}
