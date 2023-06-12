import java.time.LocalDate;
import java.util.regex.Pattern;

public class Cliente extends Usuario {
    // Declaración de variables
    private int rut;
    private String apellidos;
    private int telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    // Constructor vacio
    public Cliente() {
        super();
    }

    // Constructor con objetos clase padre + objetos propios
    public Cliente(String nombre, String fechaNacimiento, int run,int rut, String apellidos, int telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, run);
        this.rut = rut;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
/*        if (validarLongitudApellidos(apellidos)) {
            this.apellidos = apellidos;
        } else {System.out.println("No se reconocen los apellidos ingresados");}
        if (validarTelefono(telefono)) {
            this.telefono = telefono;
        } else {System.out.println("No se reconoce el teléfono ingresado");}
        if (validarLongitudAfp(afp)) {
            this.afp = afp;
        } else {System.out.println("No se reconoce la afp ingresada");}
        if (validarSistemaSalud(sistemaSalud)) {
            this.sistemaSalud = sistemaSalud;
        } else {System.out.println("No se reconoce el sistema de salud ingresado");}
        if (validarLongitudDireccion(direccion)) {
            this.direccion = direccion;
        } else {System.out.println("No se reconoce la dirección ingresada");}
        if (validarLongitudComuna(comuna)) {
            this.comuna = comuna;
        } else {System.out.println("No se reconoce la comuna ingresada");}
        if (validarEdad(edad)) {
            this.edad = edad;
        } else {System.out.println("No se reconoce la edad ingresada");}*/

    }


    // Métodos de acceso para los atributos específicos de Cliente (Getters & Setters)

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
/*        if (validarLongitudApellidos(apellidos)) {
            this.apellidos = apellidos;
        } else {System.out.println("Ingresa bien los apellidos. Utiliza un total mínimo de 5 caracteres y máximo de 30 caracteres");}*/
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
/*        if (validarTelefono(telefono)) {
            this.telefono = telefono;
        } else {System.out.println("Ingresa bien el teléfono. Es obligatorio");}*/
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
/*        if (validarLongitudAfp(afp)) {
            this.afp = afp;
        } else {System.out.println("Ingresa bien la AFP. Min 4 caracteres, max 30 caracteres");}*/
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
/*        if (validarSistemaSalud(sistemaSalud)) {
            switch (sistemaSalud){
                case 1:
                    System.out.println("Fonasa");
                    this.sistemaSalud = sistemaSalud;
                    break;
                case 2:
                    System.out.println("Isapre");
                    this.sistemaSalud = sistemaSalud;
                    break;
            }
        } else {System.out.println("Ingresa bien tu sistema de salud. 1: FONASA, 2: ISAPRE");}*/
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
/*        if (validarLongitudDireccion(direccion)) {
            this.direccion = direccion;
        } else {System.out.println("Ingresa bien tu dirección: máximo 70 caracteres");}*/
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
/*        if (validarLongitudComuna(comuna)) {
            this.comuna = comuna;
        } else {System.out.println("Ingresa bien la comuna: máximo 50 caracteres");}*/
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
/*        if (validarEdad(edad)) {
            this.edad = edad;
        } else {System.out.println("Ingresa bien la edad: un valor entre 0 y 150 años");}*/
    }

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

    @Override
    public void analizarUsuario() {
        System.out.println("Analizando al cliente: " + getRut() + "" + getNombre() + ", quien vive en " + getDireccion()
                + getComuna());
    }

    public String obtenerNombre() {
        String nombreCompleto;
        nombreCompleto = "nombre completo: " + getNombre() + " " + getApellidos();
        return nombreCompleto;
    }


    public String obtenerSistemaSalud() {
        String reconoceSistemaSalud;
        if (Validaciones.validarSistemaSalud(sistemaSalud)) {
            reconoceSistemaSalud = "Fonasa";
            return reconoceSistemaSalud;
        } else if (!Validaciones.validarSistemaSalud(sistemaSalud)) {
            reconoceSistemaSalud = "Isapre";
            return reconoceSistemaSalud;
        } else {
            reconoceSistemaSalud = "No se reconoce sistema de salud";
            return reconoceSistemaSalud;
        }
    }


    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Apellidos: " + apellidos + "\n" +
                "Teléfono: " + telefono + "\n" +
                "AFP: " + afp + "\n" +
                "Sistema de Salud: " + sistemaSalud + "\n" +
                "Dirección: " + direccion + "\n" +
                "Comuna: " + comuna + "\n" +
                "Edad: " + edad;
    }
}