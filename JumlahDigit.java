import java.util.Scanner;

public class JumlahDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bilangan: ");
        long bilangan = input.nextLong();
        
        int jumlahDigit = jumlahDigit(bilangan);
        System.out.println("Jumlah digit " + jumlahDigit);
    }

    public static int jumlahDigit(long n) {
        int jumlah = 0;
        
        while (n != 0) {
            int digit = (int)(n % 10); 
            jumlah += digit;
            n /= 10; 
    }
                return jumlah;
   }
}