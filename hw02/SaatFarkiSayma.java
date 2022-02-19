package hw02;

import java.util.Scanner;

public class SaatFarkiSayma {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Count: ");
        System.out.println((countingMin(s.nextLine()) + " minutes.")); // Ör: 11:11am-11:11pm
    }
    public static int countingMin(String str)
    {
        String[] times = str.split("-");

        int minutes = 0;

        String firstDailyPeriod = times[0].substring(times[0].length() - 2);
        String secondDailyPeriod = times[1].substring(times[1].length() - 2);

        if (!firstDailyPeriod.equals(secondDailyPeriod))
        {
            minutes = 720;
        }

        String firstHour = times[0].substring(0, times[0].indexOf(":"));
        String secondHour = times[1].substring(0, times[1].indexOf(":"));

        String firstMinute = times[0].substring(times[0].indexOf(":") + 1, times[0].length() - 2);
        String secondMinute = times[1].substring(times[1].indexOf(":") + 1, times[1].length() - 2);

        int firstTime = Integer.parseInt(firstHour) * 60 + Integer.parseInt(firstMinute);
        int secondTime = Integer.parseInt(secondHour) * 60 + Integer.parseInt(secondMinute);

        minutes += (secondTime - firstTime);

        if (minutes < 0)
        {
            minutes += 1440;
        }
        return minutes;
    }
}
