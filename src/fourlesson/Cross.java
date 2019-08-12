package fourlesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Cross {

    static final int SIZE_X = 5;
    static final int SIZE_Y = 5;
    static final char PLAYER_DOT = 'X';
    static final char AI_DOT = 'O';
    static final char EMPTY_DOT = '.';
    static final Random rand;
    static char[][] field = new char[5][5];
    static Scanner scanner;

    public Cross() {
    }

    public static void initField() {
        for (int i = 0; i < SIZE_X; ++i) {
            for (int j = 0; j < SIZE_Y; ++j) {
                field[i][j] = '.';
            }
        }

    }

    public static void PrintField() {
        System.out.println("-------");

        for (int i = 0; i < SIZE_X; ++i) {
            System.out.print("|");

            for (int j = 0; j < SIZE_Y; ++j) {
                System.out.print(field[i][j] + "|");
            }

            System.out.println();
        }

        System.out.println("-------");
    }

    public static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    public static void playerStep() throws IOException {
        int x;
        int y;
        System.out.println("Введите координаты: X (1 - " + SIZE_X + "): ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        x = Integer.parseInt(br.readLine()) - 1;
        System.out.println("Введите координаты: Y (1 - " + SIZE_X + "): ");
        y = Integer.parseInt(br.readLine()) - 1;
        while (field[x][y] == '0' || field[x][y] == 'X' || x < 0 || x > 2
                || y < 0 || y > 2) {
            System.out.println("Enter x:");
            x = Integer.parseInt(br.readLine()) - 1;
            System.out.println("Enter y:");
            y = Integer.parseInt(br.readLine()) - 1;
        }
        field[x][y] = 'X';
    }

    public static boolean isCellValid(int y, int x) {
        if (x >= 0 && y >= 0 && x <= 2 && y <= 2) {
            return field[y][x] == '.';
        } else {
            return false;
        }
    }

    public static boolean isFieldFull() {
        for (int i = 0; i < SIZE_X; ++i) {
            for (int j = 0; j < SIZE_Y; ++j) {
                if (field[i][j] == '.') {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkWin(char sym) {
        if (field[0][0] == sym && field[0][1] == sym && field[0][2] == sym) {
            return true;
        } else if (field[1][0] == sym && field[1][1] == sym && field[1][2] == sym) {
            return true;
        } else if (field[2][0] == sym && field[2][1] == sym && field[2][2] == sym) {
            return true;
        } else if (field[0][0] == sym && field[1][0] == sym && field[2][0] == sym) {
            return true;
        } else if (field[0][1] == sym && field[1][1] == sym && field[2][1] == sym) {
            return true;
        } else if (field[0][2] == sym && field[1][2] == sym && field[2][2] == sym) {
            return true;
        } else if (field[0][0] == sym && field[1][1] == sym && field[2][2] == sym) {
            return true;
        } else {
            return field[2][0] == sym && field[1][1] == sym && field[0][2] == sym;
        }
    }

    public static void aiStep() {
        int x;
        int y;
        do {
            x = rand.nextInt(SIZE_X);
            y = rand.nextInt(SIZE_Y);
        } while (!isCellValid(y, x));

        setSym(y, x, 'O');
    }

    public static void main(String[] args) {
        initField();
        PrintField();

        while (true) {
            playerStep();
            PrintField();
            if (checkWin('X')) {
                System.out.println("Player WIN");
                break;
            }

            if (isFieldFull()) {
                System.out.println("DRAW");
            }

            aiStep();
            PrintField();
            if (checkWin('O')) {
                System.out.println("SkyNet WIN");
                break;
            }

            if (isFieldFull()) {
                System.out.println("DRAW");
            }
        }

    }

static {
        scanner=new Scanner(System.in);
        rand=new Random();
        }
        }