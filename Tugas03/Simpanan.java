/**
 * 
 * @author Amar Suhendra
 * @version 15.11.21-Alpha03
 */
public class Simpanan extends Tabungan {
    private double SALDO_AWAL_MINIMUM = 500000;
    private double SALDO_MINUMUM = 10000;
    private double SETORAN_MINIMUM = 50000;
    

    public Simpanan(String nama, long noRek, double saldoAwal){
        super(nama, noRek);
        super.setSaldoMinimum(SALDO_MINUMUM);
        super.setSetoranMininum(SETORAN_MINIMUM);
        
        if (saldoAwal >= SALDO_AWAL_MINIMUM) {
            super.setSaldo(saldoAwal);
        }
    }
    
}
