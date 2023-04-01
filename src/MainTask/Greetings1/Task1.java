package MainTask.Greetings1;

import java.io.IOException;
import java.util.Scanner;

// 1. Приветствовать любого пользователя при вводе его имени через командную строку.

public class Task1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.printf("Hi %s!", name);
    }
}
