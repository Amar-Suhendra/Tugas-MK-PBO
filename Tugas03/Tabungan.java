/**
 * Ini adalah class utama (parent) dari class simpanan dan junior
 *
 * @author Amar Suhendra
 * @version 10.11.21-Aplha01
 */
public class Tabungan
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

    }

    protected void setSaldoMinimum(double saldo_minimun){

    }

    protected void setSetoranMininum(double setoran_minumum){

    }

    public double getSaldo(){
        double saldo= 1.0;
        return saldo;
    }

    public void setSaldo(double saldo){

    }

    public void simpanUang(double uang){

    }

    public void tarikUang(double jumlahPenarikan){

    }

}
