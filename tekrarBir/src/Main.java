import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Aysima'nın içtiği Süt Sayısı: ...");
        double sutSayı = scan.nextDouble();
        if (sutSayı>3){
            System.out.println("Çok fazla süt içilmiş");
        }
        else if (1<sutSayı) {
            System.out.println("İdeal süt içilmiş");
        }
        else if (1>sutSayı) {
            System.out.println("harika");
        }

    }
}