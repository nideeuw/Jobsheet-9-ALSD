import java.util.Scanner;

public class MainSurat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackSurat17 stack = new StackSurat17(10);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama Mahasiswa");
            System.out.print("Pilih: ");
            pilih = input.nextInt(); input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = input.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenisIzin = input.nextLine().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = input.nextInt(); 
                    input.nextLine();
                    stack.push(new Surat17(idSurat, namaMahasiswa, kelas, jenisIzin, durasi));
                    System.out.println("Surat berhasil diterima.");
                    break;

                case 2:
                    Surat17 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa);
                    }
                    break;

                case 3:
                    Surat17 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari: " + terakhir.namaMahasiswa);
                    } else {
                        System.out.println("Tidak ada surat saat ini.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = input.nextLine();
                    if (stack.cariSurat(cari)) {
                        System.out.println("Surat ditemukan atas nama " + cari);
                    } else {
                        System.out.println("Tidak ditemukan surat atas nama " + cari);
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}