package patronPrototipo2;

public class demoPrototipo2 {

    public static void main(String[] args) {

        CAdminPrototipo admin = new CAdminPrototipo();

        //Obtener dos Instancias
        CPersona uno = (CPersona) admin.ObtenerPrototipos("Persona");
        CPersona dos = (CPersona) admin.ObtenerPrototipos("Persona");

        //verificar que tengas los valores del prototipo original 
        System.out.println(uno);
        System.out.println(dos);
        System.out.println("------------------");

        //Modificar el estado 
        uno.setNombre("Ana");
        dos.setNombre("Pedro");

        //verificar que tengas los valores del prototipo original 
        System.out.println(uno);
        System.out.println(dos);
        System.out.println("------------------");

        CAuto auto = new CAuto("Nissan", 25000);

        admin.adicionarPrototipo("Auto", auto);

        CAuto auto2 = (CAuto) admin.ObtenerPrototipos("Auto");
        auto2.setModelo("Honda");

        //verificar que tengas los valores del prototipo original 
        System.out.println(uno);
        System.out.println(dos);
        System.out.println("------------------");

        CValores val = (CValores) admin.ObtenerPrototipos("Valores");
        System.out.println(val);
    }
}
