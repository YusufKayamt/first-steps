import java.util.Scanner;
public class Main{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("a ve b sayılarını giriniz: ");
        int b = scan.nextInt();
        int a = scan.nextInt();

        double sonuc = Math.log10(b)/Math.log10(a);
        System.out.println(sonuc);
    }
}