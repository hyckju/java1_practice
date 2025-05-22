import java.util.Scanner;

public class LibrarySeatReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("좌석의 행 수:");
        int rows = input.nextInt();
        System.out.println("좌석의 열 수:");
        int cols = input.nextInt();

        int [][] seats = new int[rows][cols];

        while(true){
            System.out.println("\n좌석을 예약하세요 (종료시 0 0 입력) : ");

            System.out.print("예약할 좌석의 행 번호 (1 ~" + rows + "): ");
            int r = input.nextInt();
            System.out.print("예약할 좌석의 열 번호 (1 ~" + cols + "): ");
            int c = input.nextInt();

            if(r == 0 && c == 0) break;

            if(r<1||r<rows||c<1||c<cols){
                System.out.println("잘못된 좌석입니다. 다시 입력.");
                continue;
            }
            int rowIndex = r-1;
            int colIndex = c-1;

            if(seats[rowIndex][colIndex] == 1){
                System.out.println("이미 예약된 좌석입니다.");

            }else{
                seats[rowIndex][colIndex] = 1;
                System.out.println("좌석 예약 완료");
            }
        }

        System.out.println("\n--- 현재 좌석 배치도 (0:비어있음 1:예약됨) ---");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + "");
            }
            System.out.println();
        }


        }

    }