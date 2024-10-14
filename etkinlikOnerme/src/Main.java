import java.util.Scanner;

public class Main {
    public static void main (String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Hava Sıcaklığını Giriniz : ");
        double derece = scan.nextDouble();

        if (5>=derece){
            System.out.println("KAYAK");
        }
        else if (5<derece){
            System.out.println("TİYATRO");
        }
        else if (15>derece){
            System.out.println("TİYATRO");
        }
        else if (16<=derece){
            System.out.println("MANGAL");
        }
        else if (derece<=30){
            System.out.println("MANGAL");
        }
        else if (30<derece){
            System.out.println("YÜZME");
        }

    }
}