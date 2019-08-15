package fourlesson;

import java.util.Random;
import java.util.Scanner;

public class Cross {

    static final int SIZE_Y = 5;
    static final int SIZE_X = 5;
    static final int SIZE_WIN = 4;
    static final char[][] fieldg = new char[SIZE_Y][SIZE_X];

    static final char player_DOT = 'X';
    static final char Ai_DOT = 'O';
    static final char EMPTY_DOT = '.';

    static Scanner scr = new Scanner(System.in);
    static Random rnd = new Random();

    private static void emtpyField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                fieldg[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void printBorder() {
        System.out.print("  -");
        for (int i = 0; i < 10; i++) System.out.print("-");
        System.out.println();
    }

    private static void printField() {
        System.out.print("   ");
        for (int i = 0; i < SIZE_X; i++) System.out.print("" + (i + 1) + " ");
        System.out.println();
        printBorder();
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("" + (i + 1) + " |");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(fieldg[i][j] + "|");
            }
            System.out.println();
        }
        printBorder();
    }

    private static void printFieldLine() {
        for (int i = 0; i < fieldg.length * 2 + 1; i++) {
            System.out.print("  -");
        }
        System.out.println();
    }

    private static void dotField(int y, int x, char dot) {
        fieldg[y][x] = dot;
    }

    private static void playerMove() {
        int x, y;
        do {
            System.out.println("Координаты вашего хода в диапозоне от 1 до " + SIZE_X);
            System.out.print("Введите координату строки: ");
            y = scr.nextInt() - 1;
            System.out.print("Введите координату столбца: ");
            x = scr.nextInt() - 1;

        } while (checkMove(y, x));
        dotField(y, x, player_DOT);
    }

    private static void AiMove() {
        int x, y;
        if (check(player_DOT)) return;
        if (check(Ai_DOT)) return;

        do {
            y = rnd.nextInt(SIZE_Y);
            x = rnd.nextInt(SIZE_X);
        } while (checkMove(y, x));
        dotField(y, x, Ai_DOT);
    }

    private static boolean check(char ai_dot) {
        for (int a = 0; a < SIZE_Y; a++) {
            for (int b = 0; b < SIZE_X; b++) {
                if (b + SIZE_WIN <= SIZE_X) {
                    if (checkLineHorisont(a, b, ai_dot) == SIZE_WIN - 1) {
                        if (MoveAiLineHorisont(a, b)) return true;
                    }

                    if (a - SIZE_WIN > -2) {
                        if (checkDiaUp(a, b, ai_dot) == SIZE_WIN - 1) {
                            if (MoveAiDiaUp(a, b)) return true;
                        }
                    }
                    if (a + SIZE_WIN <= SIZE_Y) {
                        if (checkDiaDown(a, b, ai_dot) == SIZE_WIN - 1) {
                            if (MoveAiDiaDown(a, b)) return true;
                        }
                    }
                }
                if (a + SIZE_WIN <= SIZE_Y) {
                    if (checkLineVertical(a, b, ai_dot) == SIZE_WIN - 1) {
                        if (MoveAiLineVertical(a, b)) return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean MoveAiLineVertical(int a, int b) {
        for (int i = a; i < SIZE_WIN; i++) {
            if ((fieldg[i][b] == EMPTY_DOT)) {
                fieldg[i][b] = Cross.Ai_DOT;
                return true;
            }
        }
        return false;
    }

    private static boolean MoveAiLineHorisont(int a, int b) {
        for (int j = b; j < SIZE_WIN; j++) {
            if ((fieldg[a][j] == EMPTY_DOT)) {
                fieldg[a][j] = Cross.Ai_DOT;
                return true;
            }
        }
        return false;
    }

    private static boolean MoveAiDiaDown(int a, int b) {

        for (int i = 0; i < SIZE_WIN; i++) {
            if ((fieldg[i + a][i + b] == EMPTY_DOT)) {
                fieldg[i + a][i + b] = Cross.Ai_DOT;
                return true;
            }
        }
        return false;
    }

    private static boolean MoveAiDiaUp(int a, int b) {
        for (int i = 0, j = 0; j < SIZE_WIN; i--, j++) {
            if ((fieldg[a + i][b + j] == EMPTY_DOT)) {
                fieldg[a + i][b + j] = Cross.Ai_DOT;
                return true;
            }
        }
        return false;
    }


    private static boolean checkMove(int y, int x) {
        if (x < 0 || x >= SIZE_X || y < 0 || y >= SIZE_Y) return true;
        else return !(fieldg[y][x] == EMPTY_DOT);
    }

    private static boolean fullField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (fieldg[i][j] == EMPTY_DOT) return false;
            }
        }
        System.out.println("Ничья");
        return true;
    }

    private static boolean checkWin(char dot) {
        for (int a = 0; a < SIZE_Y; a++) {
            for (int b = 0; b < SIZE_X; b++) {
                if (b + SIZE_WIN <= SIZE_X) {
                    if (checkLineHorisont(a, b, dot) >= SIZE_WIN) return true;

                    if (a - SIZE_WIN > -2) {
                        if (checkDiaUp(a, b, dot) >= SIZE_WIN) return true;
                    }
                    if (a + SIZE_WIN <= SIZE_Y) {
                        if (checkDiaDown(a, b, dot) >= SIZE_WIN) return true;
                    }
                }
                if (a + SIZE_WIN <= SIZE_Y) {
                    if (checkLineVertical(a, b, dot) >= SIZE_WIN) return true;
                }
            }
        }
        return false;
    }

    private static int checkDiaUp(int a, int b, char dot) {
        int count = 0;
        for (int i = 0, j = 0; j < SIZE_WIN; i--, j++) {
            if ((fieldg[a + i][b + j] == dot)) count++;
        }
        return count;
    }

    private static int checkDiaDown(int a, int b, char dot) {
        int count = 0;
        for (int i = 0; i < SIZE_WIN; i++) {
            if ((fieldg[i + a][i + b] == dot)) count++;
        }
        return count;
    }

    private static int checkLineHorisont(int a, int b, char dot) {
        int count = 0;
        for (int j = b; j < SIZE_WIN + b; j++) {
            if ((fieldg[a][j] == dot)) count++;
        }
        return count;
    }

    private static int checkLineVertical(int a, int b, char dot) {
        int count = 0;
        for (int i = a; i < SIZE_WIN + a; i++) {
            if ((fieldg[i][b] == dot)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        emtpyField();
        printField();
        do {
            playerMove();
            System.out.println("Ваш ход");
            printField();
            if (checkWin(player_DOT)) {
                System.out.println("Вы победили");
                break;
            } else if (fullField()) break;
            AiMove();
            System.out.println("Ход Компа");
            printField();
            if (checkWin(Ai_DOT)) {
                System.out.println("Компьютер победил");
                break;
            } else if (fullField()) break;
        } while (true);
        System.out.println("!Игра завершена!");
    }
}
