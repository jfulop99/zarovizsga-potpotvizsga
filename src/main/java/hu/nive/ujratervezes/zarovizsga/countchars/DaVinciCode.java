package hu.nive.ujratervezes.zarovizsga.countchars;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaVinciCode {


    public int encode(String path, char pattern) {

        if (!"10x".contains(String.valueOf(pattern))) {
            throw new IllegalArgumentException("Must be 0,1 or x");
        }
        int result = 0;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(path))){
            String line;
            while ((line = reader.readLine()) != null) {
                result += lineProcessor(line, pattern);
            }

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }

        return result;
    }

    private int lineProcessor(String line, char pattern) {
        int counter = 0;
        for (char item : line.toCharArray()) {
            if (item == pattern) {
                counter++;
            }
        }
        return counter;
    }

}
