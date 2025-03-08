import java.io.File;

public class TestIO {
    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println("File exists: " + file.exists());
    }
}