package paciente;

import validacion.Validador;
import interfaz.consola.Consola;

public class Menu {

    public static void menuGeneral(GestorPacientes gestorPacientes) {
        int ope;
        do {
            Menu.imprimirMenuGnral();

            ope = Integer.parseInt(Consola.ingresarDato(Mensajes.ENTRADA.OPCION.tx(),
                    Mensajes.ERROR.OPCION.tx(),
                    Validador.MENU));

            switch (ope) {
                case 1:
                    ingresarPacientes(gestorPacientes);
                    break;
                case 2:
                    atenderPacientes(gestorPacientes);
                    break;
                case 3:
                    modificarPacientes(gestorPacientes);
                    break;
                case 4:
                    System.out.println(Mensajes.NOTIF.DESPEDIDA.tx());
                    System.exit(0);
                    break;
                default:
                    System.out.println(Mensajes.ERROR.VALOR_NO_VALIDO.tx());
                    break;
            }
        } while (ope != 4);
    }

    private static void ingresarPacientes(GestorPacientes gestorPacientes) {
        String ope;
        do {
            System.out.println(Mensajes.MENU.ENCABEZADO_MENU_CLINICA.tx());
            ingresarPaciente(gestorPacientes);
            System.out.println(Mensajes.ENTRADA.CONFIRM_OTRO_PACIENTE.tx());
            ope = Consola.get_().entrada.nextLine();
        } while ("s".equals(ope.toLowerCase()));

    }

    //menu donde se ingresa los datos case 1:
    private static void ingresarPaciente(GestorPacientes gestorPacientes) {
        String ci = Consola.ingresarDato(Mensajes.ENTRADA.CEDULA.tx(),
                Mensajes.ERROR.CEDULA.tx(),
                Validador.CEDULA);

        String nombre = Consola.ingresarDato(Mensajes.ENTRADA.NOMBRE.tx(),
                Mensajes.ERROR.NOMBRE.tx(),
                Validador.SOLO_LETRAS);

        String apellido = Consola.ingresarDato(Mensajes.ENTRADA.APELLIDO.tx(),
                Mensajes.ERROR.APELLIDO.tx(),
                Validador.SOLO_LETRAS);

        int edad = Integer.parseInt(Consola.ingresarDato(Mensajes.ENTRADA.EDAD.tx(),
                Mensajes.ERROR.EDAD.tx(),
                Validador.EDAD_EST));

        if (!gestorPacientes.insertarPaciente(new Paciente(ci, nombre, apellido, edad))) {
            System.out.println(Mensajes.ERROR.NUEVO_PACIENTE.tx());
        } else {
            System.out.println(Mensajes.NOTIF.NUEVO_PACIENTE_INGRE.tx());
        }
    }

    private static void atenderPacientes(GestorPacientes gestorPacientes) {
        String ope;
        do {
            System.out.println(Mensajes.MENU.ENCABEZADO_ATENDER_CLINICA.tx());
            if (!atenderPaciente(gestorPacientes)) {
                break;
            }
            System.out.println(Mensajes.ENTRADA.ATENDER_OTRO_PACIENTE.tx());
            ope = Consola.get_().entrada.nextLine();
        } while ("s".equals(ope.toLowerCase()));

    }

    //menu donde se ingresa los datos case 2:
    private static boolean atenderPaciente(GestorPacientes gestorPacientes) {
        Paciente aux = gestorPacientes.atenderPaciente();
        if (aux == null) {
            System.out.println(Mensajes.ERROR.ATENDER_PACIENTE.tx());
            return false;
        } else {
            System.out.println(Mensajes.NOTIF.ATENDER_PACIENTE.tx());
            aux.insertarDiagnostico(Diagnostico.obtenerDiagnostico());
            aux.imprimirXConsola();
            return true;
        }
    }

    private static void modificarPacientes(GestorPacientes gestorPacientes) {
        String ope;
        do {
            System.out.println(Mensajes.MENU.ENCABEZADO_MODIFICAR_CLINICA.tx());
            if (gestorPacientes.existePaciente() == null) {
                System.out.println(Mensajes.ERROR.LISTA_VACIA.tx());
                break;
            }
            modificarPaciente(gestorPacientes);
            System.out.println(Mensajes.ENTRADA.MODIFICAR_OTRO_PACIENTE.tx());
            ope = Consola.get_().entrada.nextLine();
        } while ("s".equals(ope.toLowerCase()));
    }

    //menu donde se ingresa los datos case 3:
    private static void modificarPaciente(GestorPacientes gestorPacientes) {
        String ope;
        do {
            ope = "n";
            String ci = Consola.ingresarDato(Mensajes.ENTRADA.CEDULA_MODIF.tx(),
                    Mensajes.ERROR.CEDULA.tx(),
                    Validador.CEDULA);
            if (!gestorPacientes.buscarPaciente(ci)) {
                System.out.println(Mensajes.ERROR.PACIENTE_NO_EXISTE.tx());
                ope = Consola.get_().entrada.nextLine();
            } else {
                String nombre = Consola.ingresarDato(Mensajes.ENTRADA.NOMBRE_MODIF.tx(),
                        Mensajes.ERROR.NOMBRE.tx(),
                        Validador.SOLO_LETRAS);
                String apellido = Consola.ingresarDato(Mensajes.ENTRADA.APE_MODIF.tx(),
                        Mensajes.ERROR.APELLIDO.tx(),
                        Validador.SOLO_LETRAS);
                int edad = Integer.parseInt(Consola.ingresarDato(Mensajes.ENTRADA.EDAD_MODIF.tx(),
                        Mensajes.ERROR.EDAD.tx(),
                        Validador.EDAD_EST));

                if (!gestorPacientes.modificarPaciente(ci, nombre, apellido, edad)) {
                    System.out.println(Mensajes.ERROR.MODIF_NO.tx());
                } else {
                    System.out.println(Mensajes.NOTIF.MODIF_PACIENTE.tx());
                }
            }
        } while ("s".equals(ope.toLowerCase()));
    }

    private static void imprimirMenuGnral() {
        System.out.println(Mensajes.MENU.ENCABEZADO_MENU.tx());
        System.out.println(Mensajes.MENU.OPCION1.tx());
        System.out.println(Mensajes.MENU.OPCION2.tx());
        System.out.println(Mensajes.MENU.OPCION3.tx());
        System.out.println(Mensajes.MENU.OPCION4.tx());
    }

}
