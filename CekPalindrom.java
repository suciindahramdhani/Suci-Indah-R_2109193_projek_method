package cekpalindrom;

import java.util.Scanner;

public class CekPalindrom {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bilangan: ");
        
        int bilangan = scanner.nextInt();
        scanner.close();

        boolean cekPalindrome = cekPalindrom(bilangan);

        if (cekPalindrome) {
            System.out.println(bilangan + " ini termasuk palindrom.");
        } else {
            System.out.println(bilangan + " ini bukan termasuk palindrom.");
        }
}


    // Fungsi untuk membalikkan bilangan
    public static int balik(int bilangan) {
        int reverse = 0;

        while (bilangan != 0) {
            int digit = bilangan % 10;
            reverse = reverse * 10 + digit;
            bilangan /= 10;
        }

        return reverse;
}
    

    public static boolean cekPalindrom(int bilangan) {
        int balik = balik(bilangan);

        return bilangan == balik;
    }
}

