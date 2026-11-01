    import java.util.Scanner;

    public class NilaiMahasiswa {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int[] nilai = new int[5];

            for (int i = 0; i < nilai.length; i++) {
                System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
                nilai[i] = input.nextInt();
            }

            int total = 0;
            int tertinggi = nilai[0];

            for (int i = 0; i < nilai.length; i++) {
                total += nilai[i];  

                if (nilai[i] > tertinggi) {
                    tertinggi = nilai[i];
                }
            }

            double rataRata = (double) total / nilai.length;

            System.out.println("\n=== Hasil Perhitungan ===");
            System.out.println("Total nilai     : " + total);
            System.out.println("Rata-rata nilai : " + rataRata);
            System.out.println("Nilai tertinggi : " + tertinggi);

            input.close();
        }
    }