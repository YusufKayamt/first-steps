import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Arabanın Fiyatı : ");
        String fiyat = scan.next();
        System.out.print("Arabanın Markası : ");
        String marka = scan.next();
        System.out.print("Arabanın Serisi : ");
        String seri = scan.next();
        System.out.print("Arabanın Modeli : ");
        String model = scan.next();
        System.out.print("Arabanın Üretim Yılı : ");
        String yıl = scan.next();
        System.out.print("Arabanın Vites Türü : ");
        String vites = scan.next();
        System.out.print("Arabanın Kilometresi : ");
        String km = scan.next();
        System.out.print("Araba Sahibinin İletişim Numarası : ");
        String no = scan.next();

        System.out.println("Arabanın Fiyatı " + fiyat);
        System.out.println("Arabanın Markası " + marka);
        System.out.println("Arabanını Serisi " + seri);
        System.out.println("Arabaının Modeli " + model);
        System.out.println("Arabanını Üretim Yılı " + yıl);
        System.out.println("Arabanın Vites Türü " + vites);
        System.out.println("Arabanın Kilometresi " + km);
        System.out.println("Araba Sahibinin İletişim Numarası " + no);


    }
}