package Task1;

import java.util.List;
import java.util.Map;

public interface Printer {
  default Map<Integer, Deputy> deputyWriter(List<Fraction> fraction) {
    return null;
  }


}
