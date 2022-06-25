import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReader {

    public String readFromFile(String path) throws IOException {
        return Files.readString(Path.of(path));
    }

}
