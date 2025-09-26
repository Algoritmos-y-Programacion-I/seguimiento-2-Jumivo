package model;

public class Cuenta { 

    private String nombreBanco;
    private TipoCuenta TipoCuenta;
    private double saldo;


    public Cuenta(String nombre, TipoCuenta TipoCuenta, double saldo) {
        this.nombreBanco = nombreBanco;
        this.TipoCuenta = TipoCuenta;
        this.saldo = saldo;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public TipoCuenta getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    public double setSaldo(){
        this.saldo = saldo
    }

    public void depositar (double monto){
        if (monto > 0)
            saldo += monto 

        }
    }
   public boolean retirar (double monto){
        if (monto > 0 && saldo >= monto){
            saldo -= monto;
            return true;
        }
        return false;


}
