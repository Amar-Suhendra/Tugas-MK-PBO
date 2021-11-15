/**
 * Child dari class tabungan
 * 
 * @author Amar Suhendra
 * @version 15.11.21-Alpha05
 * Link Gdrive : https://drive.google.com/drive/folders/1o8RGKEoW2MLsK9gaiGTvM9ERefwr66GT?usp=sharing
 */
public class Simpanan extends Tabungan 
{
    // instance variables
    private double SALDO_AWAL_MINIMUM = 500000;
    private double SALDO_MINUMUM = 10000;
    private double SETORAN_MINIMUM = 50000;

    /**
     * Constructor for class Simpanan
     * 
     * @param nama      menerima data nama dari user
     * @param noRek     menerima data no rekening dari user
     * @param saldoAwal menerima data saldo awal dari user
     */
    public Simpanan(String nama, long noRek, double saldoAwal) 
    {
        super(nama, noRek);
        super.setSaldoMinimum(SALDO_MINUMUM);
        super.setSetoranMininum(SETORAN_MINIMUM);

        if (saldoAwal >= SALDO_AWAL_MINIMUM) {
            super.setSaldo(saldoAwal);
        }
    }

}
