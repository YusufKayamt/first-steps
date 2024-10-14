import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int algo,bbg,mat,fiz,lab,sonuc,son,gecer,kalır;
        System.out.println("Algoritma Notunuz : ");
        algo = input.nextInt();
        System.out.println("BBG Notunuz : ");
        bbg = input.nextInt();
        System.out.println("Matematik Notunuz : ");
        mat = input.nextInt();
        System.out.println("Fizik Notunuz : ");
        fiz = input.nextInt();
        System.out.println("Lab Notunuz : ");
        lab = input.nextInt();
        gecer = 60;
        kalır = 59;
        sonuc = (algo + bbg + mat + fiz + lab);
        son = (sonuc / 5);
        if (son<gecer){
        System.out.println("Kaldınız...");
        } else if (son>kalır){
            System.out.println("Geçtiniz...");
        }
        System.out.println("Not Ortalamanız : " + son);
    }
}