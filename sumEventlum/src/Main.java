import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.print("숫자를 입력하세요: ");
        int input = scanner.nextInt();

        if (input < 0) {
            System.out.println("0보다 큰수를 입력하세요.");
        }else{

            for (int i = 1; i <= input;  i++) {
                if (i % 2 == 0) {

                    } else {
                    sum += i;
                    }
            } System.out.println("홀수의합: "+ sum);
        }



    }

}