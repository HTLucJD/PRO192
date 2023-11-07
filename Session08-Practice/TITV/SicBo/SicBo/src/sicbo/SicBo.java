/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sicbo;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * Một người chơi sẽ có tài khoản. Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng
 * số tiền họ đang có.
 * Luật chơi như sau:
 * Có 3 viên xúc xắc. Mõi viên xúc có 6 mặt có giá tị từ 1 đến 6.
 * Mỗi lần lắc sẽ ra một kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá xx3
 * 1. Nếu tổng = 3 hoặc 18 => Cái ăn hết, người chơi thua.
 * 2. Nếu tổng = (4->10) <-> xỉu => nếu người chơi đặt xỉu thì người chơi thắng, ngược lại thua
 * 3. Nếu tổng = (11-17) <-> tài => nếu người chơi đặt tài thì người chơi thắng, ngược lại thua
 */
public class SicBo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double playerAccount = 5000000;
        Scanner sc = new Scanner(System.in);
        Locale lc = new Locale("vi", "VN");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
        int choice = 1;
        do {
            System.out.println("-----WELCOME TO SIC BO-----");
            System.out.println("Choose (1) to continue playing");
            System.out.println("Choose (Any key) to exit");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Let's gooo");
                //Đặt cược
                System.out.println("Your account: " + numf.format(playerAccount) + " How much do you want to bet?");
                double bet = 0;
                do {
                    System.out.println("Fading (0 <= bet amount <= " + numf.format(playerAccount) + " :");
                    bet = sc.nextDouble();
                } while (bet <= 0 || bet > playerAccount);

                //Chọn tài xỉu
                int chooseSicBo = 0;
                do {
                    System.out.println("Choose: 1 <-> Over or 2 <-> Under");
                    chooseSicBo = sc.nextInt();
                } while (chooseSicBo != 1 && chooseSicBo != 2);
                //Tung xúc xắc
                Random dice1 = new Random();
                Random dice2 = new Random();
                Random dice3 = new Random();

                int value1 = dice1.nextInt(5) + 1;
                int value2 = dice2.nextInt(5) + 1;
                int value3 = dice3.nextInt(5) + 1;
                int sum = value1 + value2 + value3;

                //Tính toán kết quả
                System.out.println("Result: " + value1 + " - " + value2 + " - " + value3);
                if (sum == 1 || sum == 18) {
                    System.out.println("Sum is: " + sum + "=> Bookmaker wins and you lose the bet!");
                    playerAccount -= bet;
                    System.out.println("Your account is: " + numf.format(playerAccount));
                } else if (sum >= 4 || sum <= 10) {
                    System.out.println("Sum is: " + sum + "=> Under");
                    if (chooseSicBo == 2) {
                        System.out.println("Your won the bet");
                        playerAccount += bet;
                        System.out.println("Your account is: " + numf.format(playerAccount));
                    } else {
                        System.out.println("Your lose the bet");
                        playerAccount -= bet;
                        System.out.println("Your account is: " + numf.format(playerAccount));
                    }
                } else {
                    System.out.println("Sum is: " + sum + "=> Over");
                    if (chooseSicBo == 1) {
                        System.out.println("Your won the bet");
                        playerAccount += bet;
                        System.out.println("Your account is: " + numf.format(playerAccount));
                    } else {
                        System.out.println("Your lose the bet");
                        playerAccount -= bet;
                        System.out.println("Your account is: " + numf.format(playerAccount));
                    }
                }
                        
            }
        } while (choice != 1);

    }
}
