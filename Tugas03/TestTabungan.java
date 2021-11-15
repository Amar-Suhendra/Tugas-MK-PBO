/**
 * Class ini akan mengecek semua class yang telah dibuat
 *
 * @author Amar Suhendra
 * @version 15.11.21-Alpha04
 * Link Gdrive : https://drive.google.com/drive/folders/1o8RGKEoW2MLsK9gaiGTvM9ERefwr66GT?usp=sharing
 */

import java.util.Scanner;

public class TestTabungan {
  /**
   * Method untuk menu utama
   */
  private static void menuMain() {
    System.out.println("+===================================+");
    System.out.println("|           APLIKASI TABUNGAN       |");
    System.out.println("|           1. simpanan             |");
    System.out.println("|           2. junior               |");
    System.out.println("+===================================+");
  }

  /**
   * Method untuk menu simpanan
   */
  private static void menusimpanan() {
    System.out.println("+===================================+");
    System.out.println("|            Menu simpanan          |");
    System.out.println("|            1. Simpan Uang         |");
    System.out.println("|            2. Tarik tunai         |");
    System.out.println("+===================================+");
  }

  /**
   * Method untuk menu junior
   */
  private static void menujunior() {
    System.out.println("+===================================+");
    System.out.println("|            Menu junior            |");
    System.out.println("|            1. Simpan Uang         |");
    System.out.println("|            2. Tarik tunai         |");
    System.out.println("+===================================+");
  }

  public static void main(String[] args) {
    // deklarasi variabel
    String nama, aksi;
    long noRekening;
    int pilih;
    boolean status = true;
    double saldoAwal, setoran, tarik;

    try (Scanner input = new Scanner(System.in)) {
      // meminta inputan user
      System.out.print("Masukkan nama anda : ");
      nama = input.nextLine();
      System.out.print("Masukkan no rekening anda : ");
      noRekening = input.nextLong();

      // start loop
      while (status) {
        menuMain();
        System.out.println("Nama : " + nama);
        System.out.println("No Rekening : " + noRekening + "\n");

        // meminta inputan user
        System.out.print("Masukkan pilihan anda (1/2) : ");
        pilih = input.nextInt();

        // melakukan validasi
        if (pilih == 1) {

          // start loop
          while (status) {

            // meminta inputan user
            System.out.print("Masukkan saldo awal anda : ");
            saldoAwal = input.nextDouble();

            // membuat objek baru
            Simpanan akunSimpanan = new Simpanan(nama, noRekening, saldoAwal);

            // melakukan validasi
            if (akunSimpanan.getSaldo() < 499999) {
              System.out.println("Minimal saldo awal adalah : 500.000");
            } else {

              // loop start
              while (status) {
                menusimpanan();
                System.out.println("Nama : " + nama);
                System.out.println("No Rekening : " + noRekening + "\n");
                System.out.print("Masukkan pilihan anda (1/2) : ");
                pilih = input.nextInt();

                // melakukan validasi
                if (pilih == 1) {
                  System.out.print("Masukkan jumlah uang yang ingin disimpan : ");
                  setoran = input.nextDouble();
                  akunSimpanan.simpanUang(setoran);
                  System.out.println("Saldo anda sekarang : " + akunSimpanan.getSaldo());
                  System.out.print("\n" + "Tekan 'm' untuk kembali ke menu, tekan 'e' untuk keluar : ");
                  aksi = input.next();

                  // melakukan validasi
                  if (aksi.equalsIgnoreCase("m")) {
                    status = true;
                  } else if (aksi.equalsIgnoreCase("e")) {
                    status = false;
                  } else {
                    status = false;
                  }

                } else if (pilih == 2) {

                  // meminta inputan user
                  System.out.print("Masukkan jumlah uang yang ingin ditarik : ");
                  tarik = input.nextDouble();
                  akunSimpanan.tarikUang(tarik);
                  System.out.println("Sisa saldo anda : " + akunSimpanan.getSaldo());
                  System.out.print("\n" + "Tekan 'm' untuk kembali ke menu, tekan 'e' untuk keluar : ");
                  aksi = input.next();

                  // melakukan validasi
                  if (aksi.equalsIgnoreCase("m")) {
                    status = true;
                  } else if (aksi.equalsIgnoreCase("e")) {
                    status = false;
                  } else {
                    status = false;
                  }
                } else {
                  System.out.println("Pilihan tidak valid");
                }
                // end loop
              }
            }
            // end loop
          }
          status = false;

        } else if (pilih == 2) {

          // loop start
          while (status) {

            // meminta saldo awal
            System.out.print("Masukkan saldo awal anda : ");
            saldoAwal = input.nextDouble();

            // membuat object baru
            Junior akunJunior = new Junior(nama, noRekening, saldoAwal);

            // melakukan validasi
            if (akunJunior.getSaldo() < 49999) {
              System.out.println("Minimal saldo awal adalah : 50.000");
            } else {

              // loop start
              while (status) {
                menujunior();
                System.out.println("Nama : " + nama);
                System.out.println("No Rekening : " + noRekening + "\n");

                // meminta inputan user
                System.out.print("Masukkan pilihan anda (1/2) : ");
                pilih = input.nextInt();

                // melakukan validasi
                if (pilih == 1) {

                  // meminta inputan user
                  System.out.print("Masukkan jumlah uang yang ingin disimpan : ");
                  setoran = input.nextDouble();
                  akunJunior.simpanUang(setoran);
                  System.out.println("Saldo anda sekarang : " + akunJunior.getSaldo());
                  System.out.print("\n" + "Tekan 'm' untuk kembali ke menu, tekan 'e' untuk keluar : ");
                  aksi = input.next();

                  // melakukan validasi
                  if (aksi.equalsIgnoreCase("m")) {
                    status = true;
                  } else if (aksi.equalsIgnoreCase("e")) {
                    status = false;
                  } else {
                    status = false;
                  }

                } else if (pilih == 2) {

                  // meminta inputan user
                  System.out.print("Masukkan jumlah uang yang ingin ditarik : ");
                  tarik = input.nextDouble();
                  akunJunior.tarikUang(tarik);
                  System.out.println("Sisa saldo anda : " + akunJunior.getSaldo());
                  System.out.print("\n" + "Tekan 'm' untuk kembali ke menu, tekan 'e' untuk keluar : ");
                  aksi = input.next();

                  // melakukan validasi
                  if (aksi.equalsIgnoreCase("m")) {
                    status = true;
                  } else if (aksi.equalsIgnoreCase("e")) {
                    status = false;
                  } else {
                    status = false;
                  }
                } else {
                  System.out.println("Pilihan tidak valid");
                }
                // end loop
              }
            }
            // end loop
          }
          status = false;
        } else {
          System.out.println("Pilihan tidak valid");
        }
        // end loop
      }
    } catch (Exception e) {
      System.out.println("system close");
    }
  }

}
