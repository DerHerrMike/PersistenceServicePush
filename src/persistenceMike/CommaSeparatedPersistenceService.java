package persistenceMike;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CommaSeparatedPersistenceService implements PersistenceService {

    @Override
    public void save(String text, File file) throws IOException {

        String[] result = text.split(" ");
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        while (counter < result.length) {
            sb.append(result[counter]).append(",");
            counter++;
        }
        try {
            FileWriter fw = new FileWriter("TextWithCommas.txt");
            fw.write(sb.toString());
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
