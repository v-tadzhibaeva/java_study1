package twolesson;

import java.util.Arrays;

public class TwoHomeWork {

    public static void main(String[] args) {
        int[] num = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Первое задание:");
        System.out.println("Было:\t" + Arrays.toString(num));
        taskOne(num);
        System.out.println("Стало:\t" + Arrays.toString(num) + "\n");

        int[] changeValue = new int[8];
        taskTwo(changeValue);
        System.out.println("Второе задание:");
        System.out.println(Arrays.toString(changeValue) + "\n");

        int[] multiplication = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Третье задание:");
        System.out.println("Было:\t" + Arrays.toString(multiplication));
        taskThree(multiplication);
        System.out.println("Стало:\t" + Arrays.toString(multiplication) + "\n");

        System.out.println("Четвертое задание:");
        taskFour();

        int[] minMax = {21, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Максимальное число в массиве = " + taskFiveMax(minMax));
        System.out.println("Минимальное число в массиве = " + taskFiveMin(minMax));

    }

    public static void taskOne(int[] num) {
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] == 1 ? 0 : 1;
        }
    }

    public static void taskTwo(int[] value) {
        for (int i = 0; i < value.length; i++) {
            value[i] = i * 3;
        }
    }

    public static void taskThree(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6)
                a[i] *= 2;
        }
    }

    public static void taskFour() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }

    public static int taskFiveMax(int[] minMax) {
        Arrays.sort(minMax);
        return minMax[minMax.length - 1];
    }

    public static int taskFiveMin(int[] minMax) {
        int min = minMax[0];
        for (int a : minMax)
            if (a < min)
                min = a;
        return min;
    }
}
