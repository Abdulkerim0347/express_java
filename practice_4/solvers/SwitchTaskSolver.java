package practice_4.solvers;

import practice_4.Season;

public class SwitchTaskSolver {

    public static void main(String[] args) {
        System.out.println(dayOfWeek(2));
        System.out.println(dayOfWeek(15));

        System.out.println(describeSeason(Season.WINTER));
        System.out.println(describeSeason(Season.AUTUMN));
        System.out.println(describeSeason(Season.SUMMER));
    }


    public static String dayOfWeek(int day) {
        String dayOfWeek = "";
        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                dayOfWeek = "No such day of week";
        }
        return dayOfWeek;
    }

    public static String describeSeason(Season season) {
        String description = "";
        switch (season) {
            case WINTER -> description = "Winter - cold af";
            case AUTUMN -> description = "Autumn - my bday!";
            case SPRING -> description = "Spring - everything blooms!";
            case SUMMER -> description = "Summer - sea, sun, suchki!";
        }
        return description;
    }
}
