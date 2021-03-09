package persistenceMike;

import java.io.File;
import java.io.IOException;

public interface PersistenceService {

    void save(String text, File file) throws IOException;

}
