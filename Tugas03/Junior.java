/**
 * Child dari class tabungan
 *
 * @author Amar Suhendra
 * @version 15.11.21-Alpha05
 * Link Gdrive : https://drive.google.com/drive/folders/1o8RGKEoW2MLsK9gaiGTvM9ERefwr66GT?usp=sharing
 */
public class Junior extends Tabungan 
{
    // instance variables
    private double SALDO_AWAL_MINIMUM = 50000;
    private double SALDO_MINUMUM = 10000;
    private double SETORAN_MINIMUM = 50000;
    private double MAKS_TARIKAN_PER_HARI = 1000000;

    /**
     * Constructor for class Junior
     * 
     * @param nama      menerima data nama dari user
     * @param noRek     menerima data no rekening dari user
     * @param saldoAwal menerima data saldo awal dari user
     */
    public Junior(String nama, long noRek, double saldoAwal) 
    {
        super(nama, noRek);
        super.setSaldoMinimum(SALDO_MINUMUM);
        super.setSetoranMininum(SETORAN_MINIMUM);
        if (saldoAwal >= SALDO_AWAL_MINIMUM) {
            super.setSaldo(saldoAwal);
        }
    }

    @Override

    /**
     * Melakukan validasi untuk proses penarikan uang
     * 
     * @param jumlahPenarikan menerima data jumlah penarikan dari user
     */
    public void tarikUang(double jumlahPenarikan) 
    {

        if (jumlahPenarikan > MAKS_TARIKAN_PER_HARI) {
            System.out.println("Anda tidak boleh menarik lebih dari : " + MAKS_TARIKAN_PER_HARI);
        } else {
            if (jumlahPenarikan > super.getSaldo()) {
                System.out.println("Saldo anda tidak cukup!");
            } else {
                if ((super.getSaldo() - jumlahPenarikan) < SALDO_MINUMUM) {
                    System.out.println("Saldo anda tidak cukup!");
                } else {
                    setSaldo(super.getSaldo() - jumlahPenarikan);
                    MAKS_TARIKAN_PER_HARI -= jumlahPenarikan;
                }
            }
        }

    }
}
