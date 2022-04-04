import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) throws IOException {
        ArrayList hledam = new ArrayList();

        File nya = new File("Z:\\complet.txt");
        FileReader pur = new FileReader(nya, StandardCharsets.UTF_8);

        for (; ;) {
            int j = pur.read();
            if (j == -1)
                break;

            char ch = (char) j;
            ch = Character.toLowerCase(ch);
            boolean jeNovy = true;
            for (int k = 0; k < hledam.size(); k++) {
                if (ch == (char) hledam.get(k)) {
                    jeNovy = false;
                }
            }

            if (jeNovy) {
                System.out.print(" "+ch);
                hledam.add(ch);
            }
        }
    }
}
