package Lesson22.Task1;

public class Cat {

    static String message1 = "meow-meow-meow";
    static String message2 = "bark-bark-bark";
    static String message3 = "mu-mu-mu";

    public static void main(String[] args) {
        Pett cat = message->message1;
        System.out.println("I`m a cat and i`m saying = " + cat.voice(message1));

        Pett dog = message->message2;
        System.out.println("I`m a dog and i`m saying = " + dog.voice(message2));

        Pett cow = message->message3;
        System.out.println("I`m a cow and i`m saying = " + cow.voice(message3));

    }
}
