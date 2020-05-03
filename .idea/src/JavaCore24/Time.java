package JavaCore24;

public class Time {

    int min;
    int hour;

    public Time(int min, int hour) {
        this.min = min;
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int newHour) {
        if (newHour >= 0 && newHour <= 24) {
            hour = newHour;
        } else {
            throw new IllegalArgumentException("Hours out of range \"0 - 24");
        }
    }

    @Override
    public String toString() {
        return "Time{" +
                "min=" + min +
                ", hour=" + hour +
                '}';
    }
}




