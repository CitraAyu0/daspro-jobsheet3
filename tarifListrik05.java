import java.util.Scanner;
public class tarifListrik05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double jmlListrik;
        int tarif = 1500;

        System.out.print("Masukkan jumlah Listrik: ");
        jmlListrik = sc.nextDouble();
        System.out.println("Tarif Per kWh Listrik: ");

        boolean isMelebihi = jmlListrik > 500;
        if (isMelebihi) {
            System.out.println("Penggunaan Listrik Anda Melebihi 500 kWh");
        }else {
            System.out.println("Penggunaan Listrik Anda Tidak Melebihi 500 kWh");
        }

        double totalTarif = jmlListrik * tarif;
        System.out.println("Jumlah Tagihan Yang Perlu Anda Bayarkan Adalah: " + totalTarif);
    }
}
