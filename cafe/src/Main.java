import javax.swing.*;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int coffee, size, opt, price = 0;

        System.out.println("음료 선택: 1. 아메리카노(3000원) 2. 카페라떼(4000원) 3. 카푸치노(4500원)");
        coffee = sc.nextInt();
        if (coffee == 1) {
            price = 3000;
        } else if (coffee == 2) {
            price = 4000;
        } else if (coffee == 3) {
            price = 4500;
        } else{
            System.out.println("다른 번호 입력");
            return;
        }

        System.out.println("크기 선택: 1.Small, 2.Medium(+500원) 3.Large(+1000원) ");
        size = sc.nextInt();
        if (size == 1) {
            price += 0;
        }else if (size == 2) {
            price += 500;
        }else if (size == 3) {
            price += 1000;
        }
        else {
            System.out.println("다른 번호 입력");
            return;
        }

        System.out.println("옵션 선택: 1.기본 2. 샷추가(+500원) 3. 시럽추가(+300원) 4. 샷+시럽추가(+800원)");
        opt = sc.nextInt();
        if (opt == 1) {
            price += 0;
        }else if (opt == 2) {
            price += 500;
        }else if (opt == 3) {
            price += 300;
        }else if (opt == 4) {
            price += 800;
        }else {
            System.out.println("다른 번호 입력");
            return;
        }
    System.out.println("최종가격은: "+price+"원");
    }

}