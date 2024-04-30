
package com.arcos.patronprototipo;


public class DemoPrototipo {

  
    public static void main(String[] args) {
        
        CuentaAHImpl cuentaAhorros = new CuentaAHImpl();
        cuentaAhorros.setMonto(200);
        CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorros.clonar();

        CuentaAHImpl cuentaAhorros2 = new CuentaAHImpl();
        System.out.println(cuentaAhorros);
        System.out.println(cuentaAhorros2);
        System.out.println(cuentaClonada);
        
        if(cuentaClonada != null){
            System.out.println(cuentaClonada);
        }
        System.out.println(cuentaClonada == cuentaAhorros);
    }
    
}
