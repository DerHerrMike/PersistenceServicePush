package persistenceMike;

import java.io.*;
import java.nio.file.Files;

public class LineByLinePersistenceService implements PersistenceService {

    @Override
    public void save(String text, File file) throws IOException {
        String[] result = text.split(" ");
        if (Files.notExists(file.toPath())) {
            Files.createFile(file.toPath());
        }
        FileWriter writer = new FileWriter(file);

        try (BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            for (String element : result) {
                bufferedWriter.write(element);
                bufferedWriter.newLine();
            }
        }
    }
}

