import java.io.IOException;

public class Main {

    public static void printContent() throws IOException {
        FileReader fileReader = new FileReader();
        String content = fileReader.readFromFile("C:\\Users\\pawel\\Desktop\\Exercisses lesson 10\\Exercises 1.txt");
        System.out.println(content);
    }

    public static void main(String[] args) throws IOException {
        printContent();
    }

}
