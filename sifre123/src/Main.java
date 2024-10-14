import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String anahtar = "elma";
        Scanner scan = new Scanner(System.in);
        System.out.println("Şifrenizi Giriniz... ");
        String sifre = scan.next();

        System.out.println("Şifrenizi Onaylayınız... ");
        String sifre2 = scan.next();

        System.out.println("Anahtar Kelime Ne... ");
        String sifre3 = scan.next();

        if (sifre.equals(sifre2) && (anahtar.equals(sifre3))){
            System.out.println("ŞİFRENİZ ONAYLANDI !!!");
            System.out.println("SLEAMON ALEYKM");
        }



        else {
            System.out.println("ŞİFRENİZ ONAYLANMADI !!!");
        }
    }
}