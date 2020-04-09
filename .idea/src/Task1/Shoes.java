package Task1;

import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Comparator;


class Shoes implements Comparable<Shoes> {
   private int size;
   private String brand;

   public Shoes(int size, String brand) {
       this.size = size;
       this.brand = brand;
   }

   public int getSize() {
       return size;
   }

   public void setSize(int size) {
       this.size = size;
   }

   public String getBrand() {
       return brand;
   }

   public void setBrand(String brand) {
       this.brand = brand;
   }

   @Override
   public boolean equals(Object o) {
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
       Shoes shoes = (Shoes) o;
       return size == shoes.size;
   }

   @Override
   public int hashCode() {
       return Objects.hash(size);
   }

   @Override
   public int compareTo(Shoes shoes) {
       return this.getSize() - shoes.getSize();
   }


   @Override
   public String toString() {
       return "Shoes{" +
               "size=" + size +
               ", brand='" + brand + '\'' +
               '}';
   }
}

class ShoesTreeSet {
public static void main(String[] args) {
    SortedSet<Shoes> shoes = new TreeSet<>();
    shoes.add(new Shoes(45, "Nike"));
    shoes.add(new Shoes(41, "Reebok"));
    shoes.add(new Shoes(44, "Puma"));
    shoes.add(new Shoes(46, "Adidas"));
    shoes.add(new Shoes(43, "LaCost"));

    System.out.println("Unsorted set of shoes: " + shoes);

    shoes = new TreeSet<>(Comparator.comparing(Shoes::getBrand));

    shoes.add(new Shoes(45, "Nike"));
    shoes.add(new Shoes(41, "Reebok"));
    shoes.add(new Shoes(44, "Puma"));
    shoes.add(new Shoes(46, "Adidas"));
    shoes.add(new Shoes(43, "LaCost"));

    System.out.println("Sorted set by shoes brand " + shoes);

    shoes = new TreeSet<>(Comparator.comparing(Shoes::getSize));

    shoes.add(new Shoes(45, "Nike"));
    shoes.add(new Shoes(41, "Reebok"));
    shoes.add(new Shoes(44, "Puma"));
    shoes.add(new Shoes(46, "Adidas"));
    shoes.add(new Shoes(43, "LaCost"));

    System.out.println("Sorted set by shoes size " + shoes);

    shoes = new TreeSet<>(Comparator.comparing(Shoes::getSize).reversed());

    shoes.add(new Shoes(45, "Nike"));
    shoes.add(new Shoes(41, "Reebok"));
    shoes.add(new Shoes(44, "Puma"));
    shoes.add(new Shoes(46, "Adidas"));
    shoes.add(new Shoes(43, "LaCost"));

    System.out.println("Sorted set by shoes size (DESC) " + shoes);
}
}



