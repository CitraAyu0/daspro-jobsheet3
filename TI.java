import java.util.Scanner;

public class TI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan program studi dan kelas: ");

        String kelas = sc.nextLine();

        System.out.println("Program studi dan kelas yang dimasukkan: " + kelas);
    }
}