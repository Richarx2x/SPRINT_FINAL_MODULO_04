import java.util.regex.Pattern;
public class Validaciones {

    // VALIDADORES CLASS CLIENTE:
    // VALIDADOR RUT: VALORES ENTRE 0 Y 99999999
    public static boolean validarRut(int rut) {
        return rut >= 0 && rut <= 99999999;
    }

    // VALIDADOR LONGITUD STRING NOMBRES: MIN 5 MAX 30
    public static boolean validarNombres(String nombres) {
        return nombres.length() >= 5 && nombres.length() <= 30;
    }

    // VALIDADOR LONGITUD STRING APELLIDOS: MIN 5, MAX 30
    public static boolean validarLongitudApellidos(String apellidos) {
        String patron = "^.{5,30}$";
        return Pattern.matches(patron, apellidos);
    }

    // VALIDADOR TELÉFONO
    public static boolean validarTelefono(int telefono) {
        String telefonoStr = Integer.toString(telefono);
        String patron = "^[0-9]{1,}$";
        return Pattern.matches(patron, telefonoStr);
    }

    // VALIDADOR LONGITUD STRING AFP: MIN 4, MAX 30
    public static boolean validarLongitudAfp(String afp) {
        String patron = "^.{4,30}$";
        return Pattern.matches(patron, afp);
    }

    // VALIDADOR SISTEMA DE SALUD: 1 FONASA, 2 ISAPRE
    public static boolean validarSistemaSalud(int sistemaSalud) {
        return sistemaSalud == 1 || sistemaSalud == 2;
    }

    // VALIDADOR DIRECCION: MAX 70
    public static boolean validarLongitudDireccion(String direccion) {
        int longitudMaxima = 70;
        return direccion.length() <= longitudMaxima;
    }

    // VALIDADOR COMUNA: MAX 50
    public static boolean validarLongitudComuna(String comuna) {
        int longitudMaxima = 50;
        return comuna.length() <= longitudMaxima;
    }

    // VALIDADOR EDAD: 0 <= edad < 150
    public static boolean validarEdad(int edad) {
        return edad >= 0 && edad < 150;
    }

    // ==============================================================================================================

    // VALIDADORES CLASS ACCIDENTE:
    // VALIDADOR IDENTIFICADOR (ID)
    public static boolean validarIdentificador(int identificador) {
        String identificadorStr = Integer.toString(identificador);
        String patron = "^[0-9]{1,}$";
        return Pattern.matches(patron, identificadorStr);
    }

    // VALIDADOR RUT
    public static boolean validarRutAccidente(int rut) {
        String rutStr = Integer.toString(rut);
        String patron = "^[0-9]{1,}$";
        return Pattern.matches(patron, rutStr);
    }

    // VALIDADOR HORA
    public static boolean validarFormatoHora(String hora) {
        String patron = "^([01]?\\d|2[0-3]):[0-5]\\d$";
        return Pattern.matches(patron, hora);
    }

    // VALIDADOR FECHA
    public static boolean validarFormatoFecha(String dia) {
        String patron = "^(0[1-9]|1\\d|2\\d|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        return Pattern.matches(patron, dia);
    }

    // VALIDADOR LONGITUD STRING LUGAR: MIN 10, MAX 50
    public static boolean validarLongitudLugar(String lugar) {
        String patron = "^.{10,50}$";
        return Pattern.matches(patron, lugar);
    }

    // VALIDADOR LONGITUD STRING ORIGEN: MAX 100
    public static boolean validarLongitudOrigen(String origen) {
        int longitudMaxima = 100;
        return origen.length() <= longitudMaxima;
    }

    // VALIDADOR LONGITUD STRING CONSECUENCIAS: MAX 100
    public static boolean validarLongitudConsecuencias(String consecuencias) {
        int longitudMaxima = 100;
        return consecuencias.length() <= longitudMaxima;
    }

    // ----------------------------------------------------------------------------------
    // GENERAMOS ID ALEATORIO
    private int generaId(){
        return (int) (Math.random() * 89999999) + 10000000;
    }

}
