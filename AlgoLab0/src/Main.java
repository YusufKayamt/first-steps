import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("Pi değeri kaç olsun ? (Önerilen 3,14)");
        double pi = scan.nextDouble();

        System.out.println("Daireinin Yarıcapı...");
        double r = scan.nextDouble();

        double cevre = (2*pi*r);
        double rkare = (r*r);
        double alan = (pi*rkare);

        System.out.println("Çevre : " +cevre);
        System.out.println("Alan : " +alan);
    }
}