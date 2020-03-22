package lesson10.Task2;

public class LoudLettersReplaceTo {
    public static void main(String[] args) {

        String ua = "В той самий день, коли станеш королем\n" +
                "Ти першою за грати кинеш совість\n" +
                "Собі лиши жагу життя натомість\n" +
                "Всім нам накажеш жити без проблем";
        System.out.println(ua.toLowerCase().replace('а',
                '-').replace('е',
                '-').replace('є',
                '-').replace('и',
                '-').replace('і',
                '-').replace('ї',
                '-').replace('о',
                '-').replace('у',
                '-').replace('ю',
                '-').replace('я',
                '-'));
    }
}
