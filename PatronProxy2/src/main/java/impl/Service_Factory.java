
package impl;

import inter.I_Process_Ejecutor;


public class Service_Factory {

    public static I_Process_Ejecutor create_Process_Ejecutor() {
        return new Process_Ejecutor_Proxy();
    }
}
