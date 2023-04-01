package MainTask.ReverseOrder2;

import java.util.Scanner;

//2. Отобразить в окне консоли аргументы командной строки в обратном порядке.

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input arguments:");
        StringBuilder arguments = new StringBuilder(scanner.nextLine());
        System.out.println("Arguments in reverse order: " + arguments.reverse());
    }
}
