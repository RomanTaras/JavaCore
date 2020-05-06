package Lesson22.Task2;

public class Coin {
    public static void main(String[] args) {
        String tt = (Math.random() < 0.5) ? "Heads" : "Tails";
        TossAcoin tossAcoin = (x) -> tt;
        System.out.println(tossAcoin.probability(tt));
    }
}
