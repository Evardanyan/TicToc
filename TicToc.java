package tictactoe;

import java.util.Scanner;

public class TicToc {
    public static void main(String[] args) {
        int step = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        char[][] arr = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = ' ';
            }
        }
        System.out.println("\n---------");
        System.out.println("|       |" + "\n|       |" + "\n|       |");
        System.out.println("---------");
        while (true) {
            System.out.print("Enter the coordinates:");
            String[] coordinates = scanner.nextLine().split(" ");
            if (!coordinates[0].matches("\\d+") || !coordinates[1].matches("\\d")) {
                System.out.println("You should enter numbers!");
            } else if (!coordinates[0].matches("[1-3]") || !coordinates[1].matches("[1-3]")) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else {
                int index1 = Integer.parseInt(coordinates[0]) - 1;
                int index2 = Integer.parseInt(coordinates[1]) - 1;
                if (arr[index1][index2] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    count++;
                    step++;
                    if (step == 1) {
                        arr[index1][index2] = 'X';
                    } else if (step == 2) {
                        arr[index1][index2] = 'O';
                        step = 0;
                    }
                }
            }

            System.out.println("\n---------");
            System.out.println("|" + " " + arr[0][0] + " " + arr[0][1] + " " + arr[0][2] + " " + "|" + "\n|" + " " + arr[1][0] + " " + arr[1][1] + " " + arr[1][2] + " " + "|" + "\n|" +
                    " " + arr[2][0] + " " + arr[2][1] + " " + arr[2][2] + " " + "|");
            System.out.println("---------");

            if ((arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') ||
                    (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') || (arr[0][0] == 'X'
                    && arr[0][1] == 'X' && arr[0][2] == 'X') || (arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X') ||
                    (arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X') ||
                    (arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X') ||
                    (arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X') ||
                    (arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X')) {
                System.out.println("X wins");
                break;
            } else if ((arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') ||
                    (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') || (arr[0][0] == 'O'
                    && arr[0][1] == 'O' && arr[0][2] == 'O') || (arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O') ||
                    (arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O') ||
                    (arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O') ||
                    (arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O') ||
                    (arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O')) {
                System.out.println("O wins");
                break;
            } else if (count == 9) {
                System.out.println("Draw");
                break;
            }
        }

    }
}
