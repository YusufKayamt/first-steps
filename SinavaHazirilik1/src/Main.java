package final202223;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        Random rnd = new Random();
        // Ogrenciler dizisi tanımlanıyor...
        int[] ogrenciler = new int[300];
        // Ogrenci numaraları ile dizi olusturuluyor...
        int no = 2023100;
        for (int i = 0; i < ogrenciler.length; i++) {
            ogrenciler[i] = no + i;
        }
        // Ogrenciler dizisi yazdırılıyor.
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println((i + 1) + ". " + ogrenciler[i]);
        }

        // Çözüm 1: Secilecek ogrenci sayisi kullanıcıdan alınıyor..
        System.out.print("Sayi giriniz : ");
        int n = klavye.nextInt();
        int[] liste = new int[n];
        for (int i = 0; i < liste.length; ) {
            int rasgele = rnd.nextInt(300);
            if (i == 0) {
                liste[i] = no + rasgele;
                i++;
            } else {
                for (int j = 0; j < i; j++) {
                    if (liste[j] == no + rasgele) {
                        //i--;
                        break;
                    } else {
                        liste[i] = no + rasgele;
                        if (j == (i - 1)) {
                            i++;
                        }
                    }
                }
            }
        }
    }
}
