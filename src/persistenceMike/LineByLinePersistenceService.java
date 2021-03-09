package persistenceMike;

import java.io.*;

public class LineByLinePersistenceService implements PersistenceService {

    @Override
    public void save(String text, File file) throws IOException {
        String[] result = text.split(" ");
        FileWriter writer = new FileWriter("TextInLines3.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        for (String element : result) {
            bufferedWriter.write(element);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}

