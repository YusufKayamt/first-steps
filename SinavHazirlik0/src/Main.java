package dosyaadi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Bir dosya tam adi giriniz : ");
        String dosyaTamAdi=klavye.next();
        int indexNokta = dosyaTamAdi.lastIndexOf(".");
        String dosyaAdi = dosyaTamAdi.substring(0,indexNokta);
        String uzantı = dosyaTamAdi.substring(indexNokta+1);
        System.out.println("Dosya adı "+dosyaAdi+" Uzantı adı " +uzantı );
    }
}
