//import java.util.Date;
import java.time.LocalDate;
//import java.time.LocalTime;
class Cliente extends Usuario {
    private int rut;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {}

    public Cliente(String nombre, LocalDate fechaNacimiento, int run, int rut, String nombres, String apellidos, String telefono, String afp, int sistemaSalud, String direccion, String comuna, int edad) {
        super(nombre, fechaNacimiento, run);
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.afp = afp;
        this.sistemaSalud = sistemaSalud;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    // Métodos de acceso para los atributos específicos de Cliente

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }

    public int getSistemaSalud() {
        return sistemaSalud;
    }

    public void setSistemaSalud(int sistemaSalud) {
        this.sistemaSalud = sistemaSalud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        String sistemaSaludStr = (sistemaSalud == 1) ? "Fonasa" : "Isapre";
        return super.toString() + "\nRUT: " + rut + "\nNombres: " + nombres + "\nApellidos: " + apellidos + "\nTeléfono: " + telefono + "\nAFP: " + afp + "\nSistema de Salud: " + sistemaSaludStr + "\nDirección: " + direccion + "\nComuna: " + comuna + "\nEdad: " + edad;
    }
}