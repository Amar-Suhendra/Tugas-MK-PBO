
/**
 * Class ini akan mengecek semua class yang telah dibuat
 *
 * @author Amar Suhendra
 * @version 15.11.21-Alpha03
 */

import java.util.Scanner;

public class TestTabungan {
  private static void menuMain() {
    System.out.println("+===================================+");
    System.out.println("|           APLIKASI TABUNGAN       |");
    System.out.println("|           1. simpanan             |");
    System.out.println("|           2. junior               |");
    System.out.println("+===================================+");
  }

  private static void menusimpanan() {
    System.out.println("+===================================+");
    System.out.println("|            Menu simpanan          |");
    System.out.println("|            1. Simpan Uang         |");
    System.out.println("|            2. Tarik tunai         |");
    System.out.println("+===================================+");
  }

  private static void menujunior() {
    System.out.println("+===================================+");
    System.out.println("|            Menu junior            |");
    System.out.println("|            1. Simpan Uang         |");
    System.out.println("|            2. Tarik tunai         |");
    System.out.println("+===================================+");
  }

  public static void main(String[] args) {
    String nama, aksi;
    long noRekening;
    int pilih;
    boolean status = true;
    double saldoAwal, setoran;
    try (Scanner input = new Scanner(System.in)) {
      System.out.print("Masukkan nama anda : ");
      nama = input.nextLine();
      System.out.print("Masukkan no rekening anda : ");
      noRekening = input.nextLong();
      while (status) {
        menuMain();
        System.out.println("Nama : " + nama);
        System.out.println("No Rekening : " + noRekening + "\n");
        System.out.print("Masukkan pilihan anda (1/2) : ");
        pilih = input.nextInt();
        if (pilih == 1) {
          while (status) {
            System.out.print("Masukkan saldo awal anda : ");
            saldoAwal = input.nextDouble();
            Simpanan akunSimpanan = new Simpanan(nama, noRekening, saldoAwal);
            if (akunSimpanan.getSaldo() < 499999) {
              System.out.println("Minimal saldo awal adalah : 50.000");
            } else {
              while (status) {
                menusimpanan();
                System.out.print("Masukkan pilihan anda (1/2) : ");
                pilih = input.nextInt();
                if (pilih == 1) {
                  System.out.print("Masukkan jumlah uang yang ingin disimpan : ");
                  setoran = input.nextDouble();
                  akunSimpanan.simpanUang(setoran);
                  System.out.println("Saldo anda sekarang : " + akunSimpanan.getSaldo());
                  System.out.print("\n" + "Tekan 'm' untuk kembali ke menu, tekan 'e' untuk keluar ");
                  aksi = input.next();

                  if (aksi.equalsIgnoreCase("m")) {
                    status = true;
                  } else if (aksi.equalsIgnoreCase("e")) {
                    status = false;
                  } else {
                    status = false;
                  }

                } else if (pilih == 2) {
                  System.out.println("tarik duit");
                  status = false;
                } else {
                  System.out.println("menu gk valid");
                }
              }
            }
          }
          status = false;
        } else if (pilih == 2) {
          while (status) {
            menujunior();
            System.out.print("Masukkan pilihan anda (1/2) : ");
            pilih = input.nextInt();
            if (pilih == 1) {
              System.out.println("simpan uang");
              status = false;
            } else if (pilih == 2) {
              System.out.println("tarik duit");
              status = false;
            } else {
              System.out.println("menu gk valid");
            }
          }
        } else {
          System.out.println("gk ada pilihan");
        }
      } // end loop
    } catch (Exception e) {
      System.out.println("system close");
    }
  }

}
