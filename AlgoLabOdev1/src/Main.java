package test1;

import java.util.Scanner;

public class Main {
        //matrıx büyüklüğünü belirttiğimiz kod bloğu
    private static final int MATRIX_SIZE = 10;

    private static final int EXPLORED_CELL = 1299;

    public static void main(String[] args) {
        //txt belgesindeki veriler
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
                {0, 2, 3, 4, 5, 6, 0, 0, 9, 0},
        };

        yazdirMatris(matris);

        int row,col;
        //kodu bir döngü içinde çalıştırmak amacıyla do-while komudu
        do {
             row = sayiCek0("Satır");
             col = sayiCek0("Sütun");
             //row ve col değerleri 0 a eşit olduğu taktirde programın ne yapacağını belirtiyoruz
            if (row==0&&col==0){
                System.out.println("Program Sonlandırıldı");
            } else {
            System.out.println("\n(" + row + "," + col + ") konumundaki değer : " + matris[row][col]);

            arastir(row, col, matris);

            matrisElemaniniGuncelle(matris, row, col, EXPLORED_CELL);

            System.out.println("\nGüncellenmiş Matris:");
            yazdirMatris(matris);}
                //hangi şartlar dahililnde döngünün devam edeceğini belirtiyoruz
        }while(row!=0||col!=0);
    }


        //kullanıcının seçtiği koordinatları almak için...
    private static int sayiCek0(String coordinateType) {
        Scanner input = new Scanner(System.in);
        System.out.print(coordinateType + " koordinatı giriniz: ");
        return input.nextInt();
    }
        //kullanıcı tarafından seçilen koordinatların yerine " " veya * sembolünü yerleştirmek
    private static void yazdirMatris(int[][] matris) {
        for (int[] row : matris) {
            for (int cell : row) {
                if (cell == EXPLORED_CELL) {
                    System.out.print("* ");
                } else {
                    System.out.print(cell + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void arastir(int row, int col, int[][] matris) {
        //row ve col değerlerinin hangi şartlarda ne yapacağını anlatan kod bloğu
        if (row < 0 || row >= MATRIX_SIZE || col < 0 || col >= MATRIX_SIZE || matris[row][col] == 1) {
            return;
        }

        int gecici = matris[row][col];
        matris[row][col] = EXPLORED_CELL;

        exploreNeighbor(row - 1, col, gecici, matris);
        exploreNeighbor(row + 1, col, gecici, matris);
        exploreNeighbor(row, col - 1, gecici, matris);
        exploreNeighbor(row, col + 1, gecici, matris);
    }

    private static void exploreNeighbor(int row, int col, int temp, int[][] matris) {
        if (row >= 0 && row < MATRIX_SIZE && col >= 0 && col < MATRIX_SIZE && temp == matris[row][col]) {
            arastir(row, col, matris);
        }
    }
        //matris elemanını güncelleyerek tekrardan programın ne yapacağını anlatan kod bloğu
    private static void matrisElemaniniGuncelle(int[][] matris, int row, int col, int deger) {
        if (row >= 0 && row < MATRIX_SIZE && col >= 0 && col < MATRIX_SIZE) {
            matris[row][col] = deger;
        } else {
            System.out.println("Geçersiz koordinatlar!");
        }
    }
}
