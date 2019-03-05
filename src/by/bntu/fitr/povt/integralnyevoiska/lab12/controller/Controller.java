package by.bntu.fitr.povt.integralnyevoiska.lab12.controller;

import by.bntu.fitr.povt.integralnyevoiska.lab12.logic.LocMinCounter;
import by.bntu.fitr.povt.integralnyevoiska.lab12.view.Printer;
import by.bntu.fitr.povt.integralnyevoiska.lab12.util.UserInput;

public class Controller {
    public static void main(String[] args) {
        int row = UserInput.inputInt("Input the number of rows:");
        int col = UserInput.inputInt("Input the number of columns:");
        if (row <= 0 || col <= 0) {
            Printer.print("Wrong values of columns and rows!");
        } else {
            int[][] array = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    array[i][j] = UserInput.inputInt("array[" + i + "][" + j + "] = ");
                }
            }
            Printer.print("The number of local minimums is " + LocMinCounter.countLocalMinimums(array));
        }
    }
}
