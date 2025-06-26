import java.util.Scanner;

public class DaysOfWeek {

    public static String getDayName(int dayNumber) {
        String[] days = {
            "Sunday", "Monday", "Tuesday", "Wednesday", 
            "Thursday", "Friday", "Saturday"
        };

        if (dayNumber >= 0 && dayNumber <= 6) {
            return days[dayNumber];
        } else {
            return "Invalid day number";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (0-6): ");
        int number = input.nextInt();

        String day = getDayName(number);
        System.out.println("Day: " + day);
    }
}
