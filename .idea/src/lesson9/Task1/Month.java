package lesson9.Task1;

public enum Month  {
    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING),
    APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING),
    JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER),
    AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.AUTUMN),
    OCTOBER(30, Seasons.AUTUMN),
    NOVEMBER(30, Seasons.AUTUMN),
    DECEMBER(31, Seasons.WINTER);

    public final int days;
    public final Seasons season;

    Month(int days, Seasons season) {
        this.days = days;
        this.season = season;
    }

    public static Month valueOf(boolean b) {
        return null;
    }


    public int getDays() {

        return days;
    }

    public Seasons getSeason() {

        return season;
    }



}















