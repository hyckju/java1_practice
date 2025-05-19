import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 1;
        int score = 0;

        while (100 > count) {
            System.out.printf("점수를 입력하세요(종료하려면 음수 입력): ");
            score = scanner.nextInt();

            if (score < 0) break;
            sum += score;

        }
        if (sum == 0) {
            System.out.printf("입력된 점수가 없습니다.");
            return;


        }
        System.out.println("점수의 총합은: " + sum);



    }
}