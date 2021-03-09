package persistenceMike;

import java.io.*;


public class LineByLinePersistenceService implements PersistenceService {

    @Override
    public void save(String text, File file) throws IOException {
        String[] result = text.split(" ");

        FileWriter writer = new FileWriter("TextInLines.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        int counter = 0;
        while (counter < result.length) {
            String element = result[counter];
            bufferedWriter.write(element);
            bufferedWriter.newLine();
            counter++;
        }
        bufferedWriter.close();
    }
}

