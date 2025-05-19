import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        int student = 0;
        int subject = 0;
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수: ");
        student = scanner.nextInt();
        System.out.print("과목 수: ");
        subject = scanner.nextInt();

        int[][] scores = new int[student][subject];


        for (int i = 0; i < student; i++) {
            System.out.println("\n[" + (i + 1) + "번 학생의 성적 입력]");
            for (int j = 0; j < subject; j++) {
                System.out.print("과목 " + (j + 1) + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        System.out.println("----성적표---- ");

        for (int i = 0; i < student; i++) {
            System.out.print((i + 1) + "번 학생: ");
            for (int j = 0; j < subject; j++) {
                System.out.print(scores[i][j] + " ");

            }
            System.out.println();

        }


    }

}



