package MainTask.Months5;

import java.util.Scanner;

//5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input month's number (from 1 to 12):");
        int monthNumber = scanner.nextInt();
        String monthName;

        switch (monthNumber) {
            case 1: monthName = "January";
            break;
            case 2: monthName = "February";
                break;
            case 3: monthName = "March";
                break;
            case 4: monthName = "April";
                break;
            case 5: monthName = "May";
                break;
            case 6: monthName = "June";
                break;
            case 7: monthName = "July";
                break;
            case 8: monthName = "August";
                break;
            case 9: monthName = "September";
                break;
            case 10: monthName = "October";
                break;
            case 11: monthName = "November";
                break;
            case 12: monthName = "December";
                break;
            default: throw new IllegalArgumentException("There is no month with number " + monthNumber);
        }

        System.out.println("Your month is " + monthName);
    }
}
