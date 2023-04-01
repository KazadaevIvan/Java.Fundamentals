package MainTask.RandomNumbers3;

import java.util.Random;
import java.util.Scanner;

//3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input amount of random numbers:");
        int number = scanner.nextInt();

        int[] randomNumbers = new int[number];

        for (int i = 0; i < number; i++) {
            randomNumbers[i] = new Random().nextInt(100);
        }

        System.out.printf("Here is you %s random numbers in one line:\n", number);
        for (int item : randomNumbers) {
            System.out.print(item + " ");
        }

        System.out.printf("\nHere is you %s random numbers on separate lines:\n", number);
        for (int item : randomNumbers) {
            System.out.println(item);
        }
    }
}
