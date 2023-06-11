import java.time.LocalDate;
//import java.time.LocalTime;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class Accidente {
    private int identificador;
    private Cliente rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String origen;
    private String consecuencias;


    public Accidente(int identificador, Cliente rutCliente, String dia, String hora, String lugar, String origen, String consecuencias) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.origen = origen;
        this.consecuencias = consecuencias;
/*        if (validarFormatoFecha(dia)){
            this.dia = dia;
        } else {System.out.println("No se reconoce la fecha ingresada");}
        if (validarFormatoHora(hora)) {
            this.hora = hora;
        } else {System.out.println("No se reconoce la hora ingresada");}
        if (validarLongitudLugar(lugar)){
            this.lugar = lugar;
        } else {System.out.println("No se reconoce el lugar del accidente ingresado");}
        if (validarLongitudOrigen(origen)){
            this.origen = origen;
        } else {System.out.println("No se reconoce el origen del accidente ingresado");}
        if (validarLongitudConsecuencias(consecuencias)) {
            this.consecuencias = consecuencias;
        } else {System.out.println("No se reconocen las consecuencias ingresadas");}*/
    }

    // Métodos de acceso para los atributos de Accidente

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
/*        if (validarIdentificador(identificador)) {
            this.identificador = identificador;
        } else {System.out.println("Ingresa bien el ID. Identificador ingresado no es correcto");}*/
    }

    public Cliente getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Cliente rutCliente) {
        this.rutCliente = rutCliente;
/*        if (validarRutAccidente(rut)) {
            this.rutCliente = rutCliente;
        } else {System.out.println("Ingresa bien el RUT. RUT ingresado no es correcto");}*/
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
/*        if (validarFormatoFecha(dia)){
            this.dia = dia;
        } else {System.out.println("Ingresa bien la fecha: Formato DD/MM/AAAA");}*/
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
/*        if (validarFormatoHora(hora)){
            this.hora = hora;
        } else {System.out.println("Ingresa bien la hora: Formato HH:MM");}*/
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
/*        if (validarLongitudLugar(lugar)){
            this.lugar = lugar;
        } else {System.out.println("Ingresa bien el lugar del accidente. Min 10 caracteres, Max 50 caracteres");}*/
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
/*        if (validarLongitudOrigen(origen)){
            this.origen = origen;
        } else {System.out.println("Ingresa bien el origen del accidente. Max 100 caracteres caracteres permitidos");}*/
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
/*        if (validarLongitudConsecuencias(consecuencias)) {
            this.consecuencias = consecuencias;
        } else {System.out.println("Ingresa bien las consecuencias del accidente. Max 100 caracteres permitidos");}*/
    }

    // VALIDADORES CLASS ACCIDENTE:
/*    // VALIDADOR IDENTIFICADOR (ID)
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
    // GENERAMOS ID
    private int generaId(){
        return (int) (Math.random() * 89999999) + 10000000;
    }*/

    // toString:
    @Override
    public String toString() {
        return "Accidente{" +
                "identificador=" + identificador +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", origen='" + origen + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }

}
