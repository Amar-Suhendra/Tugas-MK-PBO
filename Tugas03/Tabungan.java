/**
 * Ini adalah class utama (parent) dari class simpanan dan junior
 *
 * @author Amar Suhendra
 * @version 15.11.21-Alpha05
 * Link Gdrive : https://drive.google.com/drive/folders/1o8RGKEoW2MLsK9gaiGTvM9ERefwr66GT?usp=sharing
 */
abstract class Tabungan 
{
    // Instance variables
    private String nama;
    private long noRekening;
    private double saldo = 0;
    private double saldo_minimun = 0;
    private double setoran_minimun = 0;

    /**
     * Constructor for class Tabungan
     */
    public Tabungan() 
    {

    }

    // Second Constructor for class Tabungan
    public Tabungan(String nama, long noRekening) 
    {
        this.nama = nama;
        this.noRekening = noRekening;
    }

    /**
     * Method mutator untuk mengeset saldo minimum
     * 
     * @param saldo_minimun Menerima data saldo minimum dari user
     */
    protected void setSaldoMinimum(double saldo_minimun) 
    {
        this.saldo_minimun = saldo_minimun;
    }

    /**
     * Method mutator untuk mengeset setoran minimun
     * 
     * @param setoran_minumum Menerima data setoran minimum dari user
     */
    protected void setSetoranMininum(double setoran_minimum) 
    {
        this.setoran_minimun = setoran_minimum;
    }

    /**
     * Method accessor untuk mendapatkan nilai saldo
     * 
     * @return saldo
     */
    public double getSaldo() 
    {
        return saldo;
    }

    /**
     * Method mutator untuk mengeset saldo
     * 
     * @param saldo Menerima data saldo dari user
     */
    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }

    /**
     * Melakukan validasi untuk proses simpan uang
     * 
     * @param uang Menerima data uang dari user
     */
    public void simpanUang(double uang) 
    {
        if (uang < setoran_minimun) {
            System.out.println("Setoran minimum : " + setoran_minimun);
        } else {
            saldo += uang;
        }
    }

    /**
     * Melakukan validasi untuk proses penarikan uang
     * 
     * @param jumlahPenarikan Menerima data jumlah penarikan dari user
     */
    public void tarikUang(double jumlahPenarikan) 
    {
        if ((saldo - jumlahPenarikan) < 0) {
            System.out.println("Saldo anda tidak cukup!");
        } else {
            if ((saldo - jumlahPenarikan) < saldo_minimun) {
                System.out.println("Saldo anda tidak cukup!");
            } else {
                saldo -= jumlahPenarikan;
            }
        }
    }

}
