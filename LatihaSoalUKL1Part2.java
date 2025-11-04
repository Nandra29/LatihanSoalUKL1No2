import java.util.Scanner;
public class LatihaSoalUKL1Part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan bilangan gannjil atau genap ");
        int bilangan = scanner.nextInt();
        
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan genap");
        } else {
            System.out.println("Bilangan ganjil");
        }
    }
    
}
