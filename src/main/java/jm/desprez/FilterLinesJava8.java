package jm.desprez;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FilterLinesJava8 {

    public void filter()
            throws IOException {
        final List<String> lines = Files.readAllLines(Paths.get("source.txt"));

        final List<String> filtered = lines.stream()
                                           .filter(line -> line.contains("Bad credentials"))
                                           .collect(Collectors.toList());

        Files.write(Paths.get("output.txt"), filtered);
    }

}
