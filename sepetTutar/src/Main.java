import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double salata = 3.75;
        double muz = 12.50;
        double karpuz = 6;
        double mandalin = 4.25;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kilo Cinsinden Salata Miktarı ");
        double s = scan.nextDouble();
        double s2 = (s*salata);
        System.out.println(s2);

        System.out.print("Kilo Cinsinden Muz Miktarı ");
        double m = scan.nextDouble();
        double m2 = (m*muz);
        System.out.println(m2);

        System.out.print("Kilo Cinsinden Karpuz Miktarı ");
        double k = scan.nextDouble();
        double k2 = (k*karpuz);
        System.out.println(k2);

        System.out.print("Kilo Cinsinden Mandalina Miktarı ");
        double n = scan.nextDouble();
        double n2 =(n*mandalin);
        System.out.println(n2);
        double toplam = (s2+m2+k2+n2);
        System.out.println("TOPLAM TUTAR " + toplam + "TL");

    }
}