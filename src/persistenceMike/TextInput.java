package persistenceMike;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextInput {

    private final PersistenceService persistenceService;

    public TextInput(PersistenceService persistenceService) {
        this.persistenceService = persistenceService;
    }

    public void input() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib einen beliebigen Text ein: ");
        String text = scanner.nextLine();
        File outputFile = new File("TextBeforeFormatting");
        persistenceService.save(text, outputFile);
    }

    public static void main(String[] args) throws IOException {
        TextInput textInput = new TextInput(new LineByLinePersistenceService());
        textInput.input();
//        TextInput forCommaSepa = new TextInput(new CommaSeparatedPersistenceService());
//        forCommaSepa.input();
    }
}
