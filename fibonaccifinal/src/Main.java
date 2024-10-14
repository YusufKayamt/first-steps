import  java.util.Scanner;
public class Main {
    public static void main (String[]args){
        Scanner giris = new Scanner(System.in);
        System.out.println("Dizini boyutunu girin: ");
        int n = giris.nextInt();
        int[] sayilar = new int[n];
        sayilar[0]=0;
        sayilar[1]=1;
        for (int i=2; i<n; i++)
            sayilar[i]=sayilar[i-1]+sayilar[i-2];
        for (int i=0; i<n; i++)
            System.out.println(sayilar[i]+" ");

    }
}