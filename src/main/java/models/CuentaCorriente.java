package models;

public class CuentaCorriente extends Cuenta{

    private float sobregiro;

    public CuentaCorriente(int numCuenta, float saldo, String tipoCuenta) {
        super(numCuenta, saldo, tipoCuenta);
        this.sobregiro = sobregiro;
    }


}
