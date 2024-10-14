import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdv1, kdv2, kdv3, kdv4;
        Scanner scan = new Scanner(System.in);
        double price = 0.0;
        System.out.println("Tutar Giriniz : ");
        price = scan.nextDouble();

        kdv1 = 18;
        kdv2 = (price*kdv1);
        kdv3 = (kdv2/100);
        kdv4 = (price+kdv3);
        System.out.println(kdv4);



        }
    }