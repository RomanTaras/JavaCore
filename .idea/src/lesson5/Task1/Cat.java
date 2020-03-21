package lesson5.Task1;

public class Cat extends Pet {
    {
        System.out.print("Iam cat and I'm saying: ");
    }

    @Override
    void voice() {
        System.out.print(" meow - meow - meow");
    }


    public static void main(String[] args) {

        Cat puh = new Cat();
        puh.voice();

    }
}


