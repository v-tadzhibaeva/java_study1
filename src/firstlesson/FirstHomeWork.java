package firstlesson;

public class FirstHomeWork {
    public static void main(String[] args) {
        System.out.println("Задача 3 - результат вычисления (a * (b + (c / d))) = " + taskThree(1, 3, 5, 8));
        System.out.println("Задача 4 - сумма находится в пределах от 10 до 20 - " + taskFour(3, 9));
        System.out.println("Задача 5 - введенное число положительное - " + taskFive(67));
        System.out.println("Задача 6 - введенное число отрицательное - " + taskSix(-67));
        System.out.println("Задача 7 - " + taskSeven("Артём"));
        System.out.println("Задача 8 - введенный год високосный - " + taskEigth(2016));
    }

    public static void taskTwo(String[] args) {
        byte q = 1;
        short v = 10000;
        int b = 2;
        long l = 23400000000L;
        float a = 18.6f;
        double d = 67.7;
        boolean c = false;
        char ch = 'c';
        String string = "str";
    }

    private static float taskThree(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    private static boolean taskFour(int a, int b) {
        int c = a + b;
        return c <= 20 && c >= 10;
    }

    private static boolean taskFive(int number) {
        return number >= 0;
    }

    private static boolean taskSix(int number) {
        return number < 0;
    }

    private static String taskSeven(String name) {
        return "Привет, " + name + "!";
    }

    private static boolean taskEigth(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}
