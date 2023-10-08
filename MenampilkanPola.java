import java.util.Scanner;

public class MenampilkanPola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan nilai n : ");
        
        int n = scanner.nextInt();
        scanner.close();
        
        menampilkanPola(n);
    }

    public static void menampilkanPola(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); 
            }
            
            for (int k = n; k >= 1; k--) {
                if (k > i) {
                    System.out.print(" "); 
                } else {
                    System.out.print(k + " "); 
                }
            }
            
            System.out.println(); 
        }
    }
}