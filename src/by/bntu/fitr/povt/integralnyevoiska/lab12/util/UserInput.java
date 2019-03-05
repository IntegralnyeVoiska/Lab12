package by.bntu.fitr.povt.integralnyevoiska.lab12.util;

import java.util.Scanner;
public class UserInput {

    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String msg)
    {
        System.out.print(msg);
        return scanner.nextInt();
    }
}
