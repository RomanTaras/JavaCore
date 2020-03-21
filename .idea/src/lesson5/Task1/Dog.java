package lesson5.Task1;

public class Dog extends Pet {
    {
        System.out.print("Iam dog and I'm saying: ");
    }
    @Override
   void voice() {
        System.out.print(" Bark-bark-bark");
    }


    public static void main(String[] args) {

        Dog rex = new Dog();
        rex.voice();

    }
}
