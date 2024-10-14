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

        System.out.println(fiyat);
        System.out.println(marka);
        System.out.println(seri);
        System.out.println(model);
        System.out.println(yıl);
        System.out.println(vites);
        System.out.println(km);
        System.out.println(no);


    }
}