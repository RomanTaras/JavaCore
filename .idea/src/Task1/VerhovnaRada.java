package Task1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VerhovnaRada {
    List<Fraction> fractionList = new ArrayList<>();
    Stream stream = fractionList.stream();

    public List<Fraction> getFractionList() {
        return fractionList;
    }

    int counter = 0;

    void addNewFraction() {

        Scanner ss = new Scanner(System.in);
        System.out.println("Enter name fraction for adding = ");
        String fractionNameForAdding = ss.nextLine();
        fractionList.add(counter++, new Fraction(fractionNameForAdding));
    }

    void removeFraction() {
        System.out.println("enter fraction name for removing = ");
        Scanner sc = new Scanner(System.in);
        String fractionNameForRemoving = sc.nextLine();
        fractionList.removeIf(fraction -> fraction.fractionName.toUpperCase().equals(fractionNameForRemoving.toUpperCase()));

    }

    void showAllFractions() {
        System.out.println("Fraction list = " + fractionList);
    }

    void showSomeFraction() {
        System.out.println("Enter few first letters of fraction name for fraction showing = ");
        Scanner sf = new Scanner(System.in);
        String s = sf.nextLine();
        List<Fraction> someFr = fractionList.stream().filter(fraction -> fraction.getFractionName().toLowerCase().contains(s.toLowerCase())).collect(Collectors.toList());
        System.out.println(someFr);
    }

    void addDeputyToFraction() {
        Map<Integer, String> map = new HashMap<>();
        for (Fraction fraction : fractionList) {
            fraction.getFractionName();
            map.put(counter--, fraction.getFractionName());
        }
        System.out.println(map);
        System.out.println("Select number of fraction from list for adding deputy to Fraction = ");
        Scanner s = new Scanner(System.in);
        int u = s.nextInt();

        fractionList.forEach(fraction -> {
            if (fraction.getFractionName().equals(map.get(u))) {
                fraction.addDeputy();
            }
        });
        System.out.println(fractionList);
    }


    void removeDeputyFromFraction() {
        System.out.println("Select number of fraction for deputy removing");
        Map<Integer, String> map1 = new HashMap<>();
        for (Fraction fraction : fractionList) {
            fraction.getFractionName();
            map1.put(counter--, fraction.getFractionName());
        }
        System.out.println(map1);
        System.out.println("Select number of fraction from list for adding deputy to Fraction = ");
        Scanner s = new Scanner(System.in);
        int u = s.nextInt();

        fractionList.forEach(fraction -> {
            if (fraction.getFractionName().equals(map1.get(u))) {
                fraction.removeDeputy();
            }
        });
        System.out.println(fractionList);
    }


    void listOfAllBribersInFraction() {
        fractionList.forEach(fraction -> {
            fraction.briberList();
                });
    }
    void biggestBriberInFraction() {

        List<List<Deputy>> listOfDeputy = fractionList.stream().map(fraction -> fraction.allDeputyFraction()).collect(Collectors.toList());
        List<Deputy> collectDeputy = listOfDeputy.stream().flatMap(deputy -> deputy.stream()).collect(Collectors.toList());
        Collections.sort(collectDeputy, (deputy1,deputy2)->{
            return deputy1.giveBribe()-deputy2.giveBribe();
        });
    }
    void allDeputyInFraction(){
       fractionList.forEach(x->x.allDeputyFraction());
    }





    @Override
    public String toString() {
        return "VerhovnaRada{" +
                "fractionList=" + fractionList +
                ", stream=" + stream +
                ", counter=" + counter +
                '}';
    }
}




