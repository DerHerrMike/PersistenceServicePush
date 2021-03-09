package persistenceMike;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class CommaSeparatedPersistenceService implements PersistenceService {

    @Override
    public void save(String text, File file) throws IOException {

        String[] result = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String line : result) {
            sb.append(line).append(",");
        }
        if (Files.notExists(file.toPath())) {
            Files.createFile(file.toPath());
        }

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
