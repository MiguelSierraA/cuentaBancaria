package models;

public class CuentaCorriente extends Cuenta implements Transaccion{

    private float sobregiro;

    public CuentaCorriente(int numCuenta, float saldo, String tipoCuenta) {
        super(numCuenta, saldo, tipoCuenta);
        this.sobregiro = sobregiro;
    }


    @Override
    public float retiros() {
        return 0;
    }

    @Override
    public float trasferencias() {
        return 0;
    }
}
