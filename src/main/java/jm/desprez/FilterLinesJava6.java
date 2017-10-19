package jm.desprez;

import java.io.*;

public class FilterLinesJava6 {

    public void filter()
            throws IOException {

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(new File("source.txt")));
            writer = new BufferedWriter(new FileWriter(new File("output.txt")));

            String line;
            while((line = reader.readLine()) != null) {
                if(line.contains("Bad credentials")) {
                    writer.write(line);
                }
            }

        } catch(Exception e) {
            if(reader != null) {
                reader.close();
            }
            if(writer != null) {
                writer.close();
            }
            throw e;
        }
    }

}
