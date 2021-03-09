package persistenceMike;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextInput {

    private final PersistenceService persistenceService;

    public TextInput(PersistenceService persistenceService) {
        this.persistenceService = persistenceService;
    }

    private void input() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib einen beliebigen Text ein: ");
        String text = scanner.nextLine();
        persistenceService.save(text, Paths.get("output/TextBeforeFormatting.txt").toFile());
    }


    public static void main(String[] args) throws IOException {
        TextInput textInput = new TextInput(new LineByLinePersistenceService());
        textInput.input();
//        TextInput forCommaSepa = new TextInput(new CommaSeparatedPersistenceService());
//        forCommaSepa.input();
    }
}
