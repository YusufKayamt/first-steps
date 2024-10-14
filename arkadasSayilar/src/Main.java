import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("1. Sayıyı giriniz...");
        int number1 = scan.nextInt();
        System.out.println("2. Sayıyı giriniz...");
        int number2 = scan.nextInt();

        int total1=0;

        for (int i = 1; i<number1; i++){
            if(number1%i==0){
                total1=total1+i;
            }
        }
        if(total1==number2){
            System.out.println("Sayılar arkadaş sayıdır");
        }




    }
}