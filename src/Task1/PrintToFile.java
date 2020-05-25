package Task1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintToFile implements Printer {

    @Override
    public Map<Integer, Deputy> deputyWriter(List<Fraction> fraction) {

        for (Fraction fraction1 : fraction) {
            fraction.forEach(Fraction::allDeputyFraction);
        }


        Map map = new HashMap<Integer, Deputy>();
        map.put(0, fraction);

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("D:/JavaCoreLearning/src/doc.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.write("\r\n" + map.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return map;
    }

}
