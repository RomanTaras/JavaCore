package Task1;

import java.util.*;

public class Fraction {
    String fractionName;

    public Fraction(String fractionName) {
        this.fractionName = fractionName;
    }

    public String getFractionName() {
        return fractionName;
    }

    public void setFractionName(String fractionName) {
        this.fractionName = fractionName;
    }

    private final List<Deputy> listDeputyNameInFraction = new ArrayList<>();
//    Stream stream = listDeputyNameInFraction.stream();

    public void addDeputy() {
        Scanner ss = new Scanner(System.in);

        System.out.print("Enter name: ");
        String nname = ss.nextLine();
        System.out.print("Enter lastName: ");
        String lname = ss.nextLine();
        System.out.print("Enter weight: ");
        int weight = ss.nextInt();
        System.out.print("Enter height: ");
        int height = ss.nextInt();
        System.out.println("Enter carBrand");
        String cBrand = ss.next();
        System.out.print("Enter age: ");
        int age = ss.nextInt();
        System.out.print("Deputy xabarnuk ?, boolean");
        boolean briber = ss.nextBoolean();
        this.listDeputyNameInFraction.add(new Deputy(weight, height, cBrand, nname, lname, age, briber));
        if (briber) {
            listDeputyNameInFraction.forEach(g -> g.giveBribe());
        }
    }

    void removeDeputy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter last name of deputy for removing");
        String lastNameForRemoving = scanner.next();
        listDeputyNameInFraction.removeIf(e -> e.getLastName().contains(lastNameForRemoving));
    }

    void briberList() {
        System.out.println("all bribers = ");
        listDeputyNameInFraction.stream().filter(deputy -> deputy.getBribeValue() > 0).forEach(System.out::print);
    }

    void biggestBriber() {
        Deputy a = Collections.max(listDeputyNameInFraction, Comparator.comparing(s -> s.getBribeValue()));
        System.out.println("The biggest briber = " + a);
    }

    public List<Deputy> allDeputyFraction() {
        return listDeputyNameInFraction;
    }

    void removeAllDeputyFromFraction() {
        listDeputyNameInFraction.clear();
        System.out.println("After removing = " + listDeputyNameInFraction);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "fractionName='" + fractionName + '\'' +
                ", listDeputyNameInFraction=" + listDeputyNameInFraction +
                '}';
    }
}
