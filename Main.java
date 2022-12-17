import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n = input.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int k = 1; k<= (n - i); k++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
            }
        for (int p = n - 1; p >= 0; p--) {
            for (int h = n - p; h >= 1; h--){
                System.out.print(" ");
            }
            for (int d = 2 * p - 1; d >= 1; d--) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    }
