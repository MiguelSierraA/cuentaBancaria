package models;

public class Cuenta {

    protected int numCuenta;
    protected float saldo;
    protected String tipoCuenta;

    public Cuenta(int numCuenta, float saldo, String tipoCuenta) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }


}
