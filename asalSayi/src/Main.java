import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayı Giriniz...");
        int number = scan.nextInt();
        boolean asal = true;
        if (number == 1) {
            System.out.println("Sayı asal değildir");
            return;
        }
        if (number < 1) {
            System.out.println("Sayı geçersiz");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                asal = false;
            }
        }
        if (asal) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı  asal değildir");
        }
    }
}
