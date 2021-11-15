/**
 * Ini adalah class utama (parent) dari class simpanan dan junior
 *
 * @author Amar Suhendra
 * @version 15.11.21-Aplha04
 */
abstract class Tabungan
{
    // Instance variables
    private String nama;
    private long noRekening;
    private double saldo = 0;
    private double saldo_minimun = 0;
    private double setoran_minimun = 0;

    public Tabungan(){
        
    }
    
    public Tabungan(String nama, long noRekening){
        this.nama = nama;
        this.noRekening = noRekening;
    }

    protected void setSaldoMinimum(double saldo_minimun){
        this.saldo_minimun = saldo_minimun;
    }

    protected void setSetoranMininum(double setoran_minumum){
        this.setoran_minimun = setoran_minumum;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void simpanUang(double uang){
        if (uang < setoran_minimun) {
            System.out.println("Setoran minimum : " + setoran_minimun);
        } else {
            saldo+=uang;
        }
    }

    public void tarikUang(double jumlahPenarikan){
        if ((saldo - jumlahPenarikan) < 0 ) {
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
