package JavaCore24;

import java.util.Set;
import java.util.TreeSet;


public class Schedule {
    Set<Seance> seances = new TreeSet<>();


    public Set<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }
}

