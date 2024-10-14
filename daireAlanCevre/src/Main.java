import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Pi'nin değerini giriniz (Önerilen 3.14)");
        double pi = scan.nextDouble();
        System.out.print("Dairenin Yarıçapı : ");
        double r = scan.nextDouble();
        double cevre = (2*pi*r);
        double rkare = (r*r);
        double alan = (pi*rkare);
        System.out.println("Çevre = "+cevre);
        System.out.println("Alan = "+alan);


    }
}