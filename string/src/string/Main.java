package string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*String mesaj = "Merhaba Ben Yusuf Mete Kaya.";
        System.out.println(mesaj.concat(" Memnun Oldum."));
        System.out.println(mesaj.startsWith("M"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0, 5, karakterler, 0); //5 i dahil olarak almaz//
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("us"));
        System.out.println(mesaj.lastIndexOf("Yu"));//sağdan arar soldan sayar//
        System.out.println(mesaj);

        System.out.println("--------------------------------------");
        System.out.println(mesaj.replace(" ", "_"));*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Kullanıcı Adı Giriniz: ");
        String ID = scan.nextLine();
        System.out.println("Şifrenizi Giriniz: ");
        String pasw = scan.nextLine();

        while (pasw.length() < 6) {
            System.out.println("Şifrenizi En Az Altı Karakteli Olacak Şekilde Tekrar Giriniz: ");
            String pasw1 = scan.nextLine();
            if (pasw1.length() > 5) {
                System.out.println("Şifreniz onalandı...");
                break;
            }

            /*String mesaj = "Fırat Üniversitesi Teknoloji Fakültesi.";
            for (String kelime : mesaj.split(" ")) {
                System.out.println(kelime);
            }
            System.out.println(mesaj.toLowerCase());
            System.out.println(mesaj.toUpperCase());

            String Yenimesaj = "     Elazığ Üniversitesi Bilim Fakültesi.        ";

            System.out.println(Yenimesaj.trim());*/
        }
    }
}
