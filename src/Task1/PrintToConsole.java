package Task1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintToConsole implements Printer {
    @Override
    public Map<Integer, Deputy> deputyWriter(List<Fraction> fraction) {
        int counter = 0;
        for (Fraction fraction1 : fraction) {
            fraction.forEach(Fraction::allDeputyFraction);
        }
        Map map = new HashMap<Integer, Deputy>();
        map.put(counter, fraction);
        counter++;
        System.out.println(map);

        return map;
    }
}
