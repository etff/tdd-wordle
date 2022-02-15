package wordle.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private FileReader() {
    }

    public static List<String> readWords() {
        List<String> result = new ArrayList<>();
        File file = new File("src/main/resources/words.txt");

        try (BufferedReader inFiles = new BufferedReader(
                new InputStreamReader(new FileInputStream(file.getAbsolutePath()), StandardCharsets.UTF_8))) {
            String line = "";
            while ((line = inFiles.readLine()) != null) {
                if (line.trim().length() > 0) {
                    result.add(line);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
