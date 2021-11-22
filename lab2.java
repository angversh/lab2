//Пользователь вводит с клавиатуры целое положительное число n
//Вывести на экран n первых чисел последовательности 0, -5, -10, -15

import java.util.InputMismatchException;
import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Insert an integer number of members in the sequence");
            int n = s.nextInt();
            int sequence = 5;
            if (n < 0) {
                System.out.println("The inserted number is not correct. Insert a positive number");
                System.exit(1);
            } else {
                for (int i = 0; i < n; i++) {
                    sequence -= 5;
                    System.out.print(sequence + " ");
                }
            }
            } catch (InputMismatchException e) {
            System.out.println("This is incorrect. Insert an integer number");
            System.exit(1);
        }
    }
}


