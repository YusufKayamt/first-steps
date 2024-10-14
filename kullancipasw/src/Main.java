import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı Adı Giriniz: ");
        String ID = scan.nextLine();
        System.out.println("Şifrenizi Giriniz: ");
        String pasw = scan.nextLine();

        while (pasw.length() < 6) {
            System.out.println("Şifrenizi En Az Altı Karakteli Olacak Şekilde Tekrar Giriniz: ");
            String pasw1 = scan.nextLine();
            if (pasw1.length() > 5) {
                System.out.println("Şifreniz onaylandı...");
                pasw=pasw1;
                break;
            }
        }
    }
}