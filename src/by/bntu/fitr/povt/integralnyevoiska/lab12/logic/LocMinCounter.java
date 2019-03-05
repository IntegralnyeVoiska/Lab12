package by.bntu.fitr.povt.integralnyevoiska.lab12.logic;

public class LocMinCounter {

    public static boolean isLocalMinimum(int[][] matr, int i, int j) {
        boolean flag = false;

        int value = matr[i][j];

        if ((i > 0 && value < matr[i - 1][j]) && (j > 0 && value < matr[i][j - 1]) &&
                (i < matr.length - 1 && value < matr[i + 1][j]) && (j < matr[i].length - 1 && value < matr[i][j + 1])) {
            flag = true;
        } else if (matr.length == 1 && matr[i].length == 1) {
            flag = false;
        } else if (i == 0) {
            if (j == 0 && value < matr[i][j + 1] && value < matr[i + 1][j]) {
                flag = true;

            } else if (j > 0 && j < matr[i].length - 1 && value < matr[i][j - 1] && value < matr[i][j + 1] && value < matr[i + 1][j]) {
                flag = true;
            } else if (j == matr[i].length - 1 && value < matr[i][j - 1] && value < matr[i + 1][j]) {
                flag = true;
            }
        } else if (i == matr.length - 1) {
            if (j == 0 && value < matr[i - 1][j] && value < matr[i][j + 1]) {
                flag = true;
            } else if (j > 0 && j < matr[i].length - 1 && value < matr[i][j - 1] && value < matr[i][j + 1] && value < matr[i - 1][j]) {
                flag = true;
            } else if (j == matr[i].length - 1 && value < matr[i][j - 1] && value < matr[i - 1][j]) {
                flag = true;
            }
        } else if (j == 0 && i < matr.length - 1) {
            if (value < matr[i - 1][j] && value < matr[i + 1][j] && value < matr[i][j + 1]) {
                flag = true;
            }
        } else if (j == matr[i].length - 1 && i < matr.length - 1) {
            if (value < matr[i - 1][j] && value < matr[i + 1][j] && value < matr[i][j - 1]) {
                flag = true;
            }
        }

        return flag;
    }


    public static int countLocalMinimums(int[][] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                if (isLocalMinimum(a, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
}

