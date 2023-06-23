import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisi için eleman sayısını giriniz : ");
        int elemanSayisi = input.nextInt();

        int[] fibonacciSerisi = new int[elemanSayisi];
        fibonacciSerisi[0] = 0; // İlk eleman 0
        fibonacciSerisi[1] = 1; // İkinci eleman 1

        // Fibonacci serisini hesapla
        for (int i = 2; i < elemanSayisi; i++) {
            fibonacciSerisi[i] = fibonacciSerisi[i - 1] + fibonacciSerisi[i - 2];
        }

        // Fibonacci serisini ekrana yazdır
        System.out.println("Fibonacci Serisi : ");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(fibonacciSerisi[i] + " ");
        }
    }
}