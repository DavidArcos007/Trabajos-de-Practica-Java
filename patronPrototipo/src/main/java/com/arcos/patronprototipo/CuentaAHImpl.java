package com.arcos.patronprototipo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CuentaAHImpl implements ICuenta {

    private String tipo;
    private double monto;

    public CuentaAHImpl() {
        this.tipo = "AHORRO";
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public ICuenta clonar() {
        CuentaAHImpl cuenta = null;
        try {
            cuenta = (CuentaAHImpl) (clone());
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return cuenta;
    }

    @Override
    public String toString() {
        return "CuentaAhImpl{" + "tipo=" + tipo + ", monto=" + monto + '}';
    }
}
