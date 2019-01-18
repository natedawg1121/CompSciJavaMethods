package Ch10.Exercises;

public class Time {
    private int hours;
    private int minutes;
    private int fullMins;

    public Time(int h, int m) {
        if (h >= 24) {
            hours = h - 24;
        } else {
            hours = h;
        }

        if (m >= 60) {
            minutes = m - 60;
            h++;
        } else {
            minutes = m;
        }

        if (h >= 24) {
            hours = h - 24;
        }
        fullMins = ((h * 60) + m);
    }

    public int toMins(Time t) {
        return t.fullMins;
    }

    boolean lessThan(Time t) {
        return t.fullMins > fullMins;
    }

    int elapsedSince(Time t) {
        int temp = fullMins - t.fullMins;
        if (temp > 0) {
            return temp;
        } else {
            return temp + 720;
        }
    }

    public String toString() {
        String fin = "";
        if (hours < 10) {
            fin += "0" + hours;
        } else {
            fin += "" + hours;
        }
        fin += ":";
        if (minutes < 10) {
            fin += "0" + minutes;
        } else {
            fin += "" + minutes;
        }
        return fin;
    }
}