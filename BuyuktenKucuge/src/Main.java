import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci Sayı (a) ...");
        double a = scan.nextDouble();

        System.out.print("İkinci Sayı (b)...");
        double b = scan.nextDouble();

        System.out.print("Üçüncü Sayı (c)...");
        double c = scan.nextDouble();

        if (a<b && b<c) {
            System.out.println("a<b<c");
        } else if (b<a && a<c) {
            System.out.println("b<a<c");
        } else if (c<a && a<b) {
            System.out.println("c<a<b");
        } else if (a<c && c<b) {
            System.out.println("a<c<b");
        } else if (c<b && b<a) {
            System.out.println("c<b<a");
        } else if (b<c && c<a) {
            System.out.println("b<c<a");
        }
    }
}