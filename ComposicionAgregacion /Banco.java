public class Banco {

    private String nrodeCuenta;
    private String tipoDeCuenta;
    private double saldo;
    
    public Banco(String nrodeCuenta, String tipoDeCuenta, double saldo) {
        this.nrodeCuenta = nrodeCuenta;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = saldo;
    }
    public String getNrodeCuenta() {
        return nrodeCuenta;
    }
    public void setNrodeCuenta(String nrodeCuenta) {
        this.nrodeCuenta = nrodeCuenta;
    }
    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }
    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
  
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    @Override
    public String toString() {
        return "Banco [nrodeCuenta=" + nrodeCuenta + ", tipoDeCuenta=" + tipoDeCuenta + ", saldo=" + saldo + "]";
    }
}