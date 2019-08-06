package threelesson;

import java.util.Random;
import java.util.Scanner;

public class ThreeHomeWork {
    public static void main(String[] args) {
        int answer;
        int userAnswer;
        int maxTryCount;
        int tryCount;
        Random rand = new Random();

        game(rand.nextInt(10),0,3,0,1);
    }

    public static void game(int answer,int userAnswer, int maxTryCount,int tryCount,int startTryCount) {
        Scanner sc = new Scanner(System.in);
        do {
            for (tryCount = startTryCount; tryCount <= maxTryCount; tryCount++) {
                System.out.println("Введите число от 0 до 9");
                userAnswer = sc.nextInt();
                if (userAnswer == answer) {
                    System.out.println("Поздравляю! Вы угадали число!");
                    break;
                } else if (userAnswer > answer) {
                    System.out.println("Вы ввели слишком большое число");
                } else {
                    System.out.println("Вы ввели слишком маленькое число");
                }
                System.out.println("Осталось попыток = " + (maxTryCount - tryCount));
            }

            if (tryCount == maxTryCount) {
                System.out.println("Ух, это было опасно, вы справились на последней попытке!");
            } else if (tryCount == maxTryCount + 1) {
                System.out.println("Попытки закончились - Вы проиграли =( Правильный ответ был " + answer);
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        }
        while (sc.nextInt() == 1);
    }
}
