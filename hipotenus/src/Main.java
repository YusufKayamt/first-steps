import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Kenar : ");
        int a = scan.nextInt();

        System.out.print("2. Kenar : ");
        int b = scan.nextInt();

        double c = Math.sqrt((a*a)+(b*b));
        System.out.println(c);





    }
}