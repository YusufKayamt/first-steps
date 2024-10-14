import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayı : ");
        double a = scan.nextDouble();
        System.out.print("İkinci sayı : ");
        double b = scan.nextDouble();
        System.out.println("İşlem Seçin...");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.print("Seçiminizi Giriniz...");
        double secim = scan.nextDouble();
         if (secim == 1){
             System.out.println("Toplama Sonucu = " + (a+b));
         }
         else if (secim == 2){
             System.out.println("Çıkarma Sonucu = " + (a-b));
         }
         else if (secim == 3){
             System.out.println("Çarpma Sonucu = " + (a*b));
         }
         else if (secim == 4){
             System.out.println("Bölme Sonucu = " + (a/b));
         }
         else
             System.out.println("Hatalı Seçim");

    }
}