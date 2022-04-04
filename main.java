import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class main{
    public static void main(String[] args) throws IOException {
        File nya = new File("Z:\\complet.txt");
        FileReader pur = new FileReader(nya, StandardCharsets.UTF_8);

        int x = 0;
        try (FileReader fr = new FileReader(nya)) {
            int content;
            while ((content = fr.read()) != -1) {
                char ch = (char) content;
                if (ch == 'a' || ch == 'A') {
                    x++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(x);
    }
}
