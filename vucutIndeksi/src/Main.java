import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz : ");
        double kg = scan.nextDouble();
        System.out.print("Metre Cinsinden Boyunuz : ");
        double boy = scan.nextDouble();
        double indeks = (boy*boy);
        double indeks1 = (kg/indeks);
        System.out.print("Vücut Kitle İndeksiniz : "  + indeks1);
        if (indeks1<18.5){
            System.out.print(" Ve Zayıf Kategoride Yer Alıyorsunuz");
        }
        else if (18.5<indeks1) {
            System.out.print(" Ve İdeal Kategoride Yer Alıyorsunuz");
        }
        else if (25<indeks1){
            System.out.print(" Ve Şişman Kategoride Yer Alıyorsunuz");
        }
        else if (indeks1<29.9){
            System.out.print(" Ve Şişman Kategoride Yer Alıyorsunuz");
        }
        else if (30<indeks1) {
            System.out.print(" Ve Obez Kategoride Yer Alıyorsunuz");
        }
        else if (indeks1<34.9) {
            System.out.print(" Ve Obez Kategoride Yer Alıyorsunuz");
        }
        else if (35<indeks1){
            System.out.print(" Ve Aşırı Obez Kategorisinde Yer Alıyorsunuz");
        }
        else {
            System.out.print("Geçersiz Değerler Girildi");
        }
    }
}