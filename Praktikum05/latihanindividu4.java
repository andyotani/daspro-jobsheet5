import java.util.Scanner;

public class latihanindividu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan usia Anda: ");
        
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            
            if (age < 0) {
                System.out.println("Usia tidak boleh negatif. Silakan masukkan angka positif.");
            } else {
                String category;
                
                if (age <= 12) {
                    category = "Anak";
                } else if (age <= 19) {
                    category = "Remaja";
                } else if (age <= 64) {
                    category = "Dewasa";
                } else {
                    category = "Lansia";
                }
                
                System.out.println("Kategori usia Anda adalah: " + category);
            }
        } else {
            System.out.println("Input tidak valid. Silakan masukkan angka positif.");
        }
        
        scanner.close();
    }
}
