package models;

public class CuentaAhorro extends Cuenta implements Transaccion {


    public CuentaAhorro(int numCuenta, float saldo, String tipoCuenta) {
        super(numCuenta, saldo, tipoCuenta);
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
