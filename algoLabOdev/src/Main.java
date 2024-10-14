package test1;

import java.util.Scanner;

public class Main {

    public static int sayiAl1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kordinatı giriniz: ");
        int row = input.nextInt();
        return row;
    }

    public static int sayiAl2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kordinatı giriniz: ");
        int col = input.nextInt();
        return col;
    }

    public static void yazdirMatris(int[][] matris) {
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                if (matris[i][j] == 1299) {
                    System.out.print("* ");
                } else {
                    System.out.print(matris[i][j] + " ");
                }

            }
            System.out.println();
        }
    }

    public static void matrisElemaniniGuncelle(int[][] matris, int row, int col, int deger) {
        if (row >= 0 && row < matris.length && col >= 0 && col < matris[0].length) {

            matris[row][col] = deger;
        } else {
            System.out.println("Geçersiz koordinatlar!");
        }
    }

    public static void arastir(int row, int col, int[][] matris) {
        if (row < 0 || row >= 10 || col < 0 || col >= 10 || matris[row][col] == 1) {
            // Geçerli olmayan durumlar veya zaten işlem yapılmış hücreler için geri dön.
            return;
        }

        int temp = matris[row][col];  // Temp ile ilk değeri kaydedip, sonradan değişeceğiz.

        matris[row][col] = 1299;

        // Yukarı yönde kontrol
        if (row > 0 && temp == matris[row - 1][col]) {
            arastir(row - 1, col, matris);
        }

        // Aşağı yönde kontrol
        if (row < 9 && temp == matris[row + 1][col]) {
            arastir(row + 1, col, matris);
        }

        // Sağa yönde kontrol
        if (col < 9 && temp == matris[row][col + 1]) {
            arastir(row, col + 1, matris);
        }

        // Sola yönde kontrol
        if (col > 0 && temp == matris[row][col - 1]) {
            arastir(row, col - 1, matris);
        }
    }

    public static void main(String[] args) {

        int[][] matris = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 2, 2, 2, 5, 6, 7, 1, 9, 0},
                {0, 2, 3, 4, 5, 6, 7, 8, 9, 0},
                {0, 2, 3, 5, 5, 5, 7, 8, 9, 0},
                {0, 2, 3, 4, 5, 6, 0, 0, 9, 0},
                {0, 2, 3, 4, 5, 6, 7, 0, 9, 0},
                {0, 2, 3, 4, 0, 0, 0, 0, 0, 0},
                {0, 2, 3, 4, 5, 6, 0, 8, 9, 0},
                {0, 2, 3, 0, 5, 6, 0, 0, 9, 0},
                {0, 2, 3, 4, 5, 6, 0, 0, 9, 0},};

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");

        int row = sayiAl1();
        int col = sayiAl1();
        System.out.println("");
        System.out.println("(" + row + "," + col + ") konumundaki değer : " + matris[row][col]);

        arastir(row, col, matris);

        matrisElemaniniGuncelle(matris, row, col, 1299);

        System.out.println("\nGüncellenmiş Matris:");
        yazdirMatris(matris);

    }

}