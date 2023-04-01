package MainTask.Addition4;

import java.util.Scanner;

//4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Input second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Numbers sum is " + (firstNumber + secondNumber));

        System.out.println("Numbers multiplication result is " + (firstNumber * secondNumber));
    }
}
