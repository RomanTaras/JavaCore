package lesson5.Task1;

public class Cow extends Pet {
    {
        System.out.print("Iam cow and I'm saying: ");
    }

    @Override
    void voice() {
        System.out.print(" mu - mu - mu");
    }


    public static void main(String[] args) {

        Cow zirka = new Cow();
        zirka.voice();

    }
}


