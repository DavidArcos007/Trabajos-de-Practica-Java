package paciente;

/**
 *
 * @author felix
 */
public class Mensajes {

    public enum ENTRADA {

        OPCION("Opción: "),
        CEDULA("Cédula del paciente: "),
        CEDULA_MODIF("Cédula del paciente a modificar: "),
        NOMBRE("Nombre del paciente: "),
        APELLIDO("Apellido del paciente: "),
        EDAD("Edad del paciente: "),
        EDAD_MODIF("Edad a modificar del paciente: "),
        NOMBRE_MODIF("Nombre a modificar del paciente: "),
        APE_MODIF("Apellido a modificar del paciente: "),
        CONFIRM_OTRO_PACIENTE("Inscribir otro paciente (s/n)"),
        ATENDER_OTRO_PACIENTE("Atender a otro paciente (s/n)"),
        MODIFICAR_OTRO_PACIENTE("Modificar datos de otro paciente (s/n)");

        private String valor;

        private ENTRADA(String v) {
            valor = v;
        }

        public String tx() {
            return valor;
        }
    }

    public enum ERROR {

        OPCION("Número de opción no válida."),
        CEDULA("El número de cédula especificado no es válido."),
        NOMBRE("Solo se aceptan caracteres alfabéticos como parte del nombre."),
        APELLIDO("Solo se aceptan caracteres alfabéticos como parte del apellido."),
        EDAD("El valor ingresado debe ser un número entero entre 1 y 110."),
        CALIF("El valor ingresado no es válido como valor de calificación."),
        VALOR_NO_VALIDO("Valor no válido."),
        NUEVO_PACIENTE("No fue posible insertar los datos del paciente."),
        ATENDER_PACIENTE("No existen pacientes para ser atendidos."),
        LISTA_VACIA("No existen pacientes en la lista de espera."),
        MODIF_NO("No se pudo modificar los datos del paciente."),
        PACIENTE_NO_EXISTE("No existe el paciente solicitado. Volver a intentar (s/n).");

        private String valor;

        private ERROR(String v) {
            valor = v;
        }

        public String tx() {
            return valor;
        }
    }

    public enum NOTIF {

        DESPEDIDA("HASTA PRONTO!!!"),
        NUEVO_PACIENTE_INGRE("Datos de paciente ingresados satisfactoriamente."),
        ATENDER_PACIENTE("El paciente con los siguientes datos fue atendido satisfactoriamente: "),
        MODIF_PACIENTE("Datos del paciente modificados satisfactoriamente."),
        DATOS_PACIENTE("Datos Del Paciente"),
        CEDULA("Cedula : "),
        NOMBRE("Nombre : "),
        APELLIDO("Apellido:"),
        EDAD("Edad:"),
        DIAG("Diagnóstico final: ");

        private String valor;

        private NOTIF(String v) {
            valor = v;
        }

        public String tx() {
            return valor;
        }
    }

    public enum MENU {

        ENCABEZADO_MENU("     ***** CLÍNICA ESTOMATOLÓGICA ****       "),
        ENCABEZADO_MENU_CLINICA("     *****    INGRESAR PACIENTE     *****    "),
        ENCABEZADO_ATENDER_CLINICA("     *****    ATENDER PACIENTE     *****    "),
        ENCABEZADO_MODIFICAR_CLINICA("     *****    MODIFICAR DATOS DE PACIENTE     *****    "),
        OPCION1("1  INGRESAR PACIENTE"),
        OPCION2("2. ATENDER PACIENTE"),
        OPCION3("3. MODIFICAR DATOS DE PACIENTE"),
        OPCION4("4. SALIR");

        private String valor;

        private MENU(String v) {
            valor = v;
        }

        public String tx() {
            return valor;
        }
    }

}
