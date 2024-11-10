package HackerrankExercises;
import java.util.Calendar;

public class getDay {
    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String dayName;
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                dayName = "SUNDAY";
                break;
            case Calendar.MONDAY:
                dayName = "MONDAY";
                break;
            case Calendar.TUESDAY:
                dayName = "TUESDAY";
                break;
            case Calendar.WEDNESDAY:
                dayName = "WEDNESDAY";
                break;
            case Calendar.THURSDAY:
                dayName = "THURSDAY";
                break;
            case Calendar.FRIDAY:
                dayName = "FRIDAY";
                break;
            case Calendar.SATURDAY:
                dayName = "SATURDAY";
                break;
            default:
                dayName = "Unknown";
        }

        return dayName;
    }

    public static void main(String[] args) {
        findDay(7, 25, 1994);
    }
}
