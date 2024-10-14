import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        String[]nesneler={"Tas","Kagit","Makas"};
        int prg = (int) (Math.random()*3);
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir seçim yap tas0 kagit1 makas2");
        int sen = scan.nextInt();

        if ((prg==0&&sen==1) || (prg==1&&sen==2)||(prg==2&&sen==0)){
            System.out.println("kazanıdn");
        } else if ((prg==0&&sen==2) || (prg==2&&sen==1) || (prg==1&&sen==0)) {
            System.out.println("kayıp");
        }
        else {
            System.out.println("berebar");
        }
    }
}