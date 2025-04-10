import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kor=0.0, math=0.0, eng=0.0, sci=0.0, sum=0.0;
        double doubleAvg = 0.0;
        int intAvg = 0;
        boolean boolResult = false;

        System.out.print("국어 점수 입력: ");
        kor = sc.nextDouble();
        System.out.print("수학 점수 입력: ");
        math = sc.nextDouble();
        System.out.print("영어 점수 입력: ");
        eng = sc.nextDouble();
        System.out.print("과학 점수 입력: ");
        sci = sc.nextDouble();

        sum = kor + math + eng + sci;

        intAvg = (int)sum / 4;
        doubleAvg = sum/ 4;
        boolResult = intAvg == doubleAvg;


        System.out.print("\n총점: " + sum);

        System.out.print("\n=== 형변환 없는 평균 계산 ===");
        System.out.print("\n정수 나눗셈 평균: " + intAvg);

        System.out.print("\n=== 형변환을 사용한 평균 계산 ===");
        System.out.print("\n실수 나눗셈 평균: " + doubleAvg);
        System.out.printf("\n소수점 둘째 자리까지: %.2f\n", doubleAvg);

        System.out.print("\n=== 자료형 논리 비교 ===");
        System.out.print("\n정수평균 == 실수평균 " + (intAvg == doubleAvg));

        if (doubleAvg >= 80) {
            System.out.print("\n'합격'");
        } else {
            System.out.print("\n'불합격'");
        }

    }

}