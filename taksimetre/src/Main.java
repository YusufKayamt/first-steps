import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    double acılıs = 10;
    Scanner scan =new Scanner(System.in);
    System.out.println("Kaç Kilometre ? ");
    double km = scan.nextDouble();
    double tutar = (km*2.2);
    double top = (tutar+acılıs);
    if (20>top){
        top=20;
    }
    System.out.println(top);


    }
}