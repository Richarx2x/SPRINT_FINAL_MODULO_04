import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario implements Asesoria {
    private String nombre;
    private String fechaNacimiento;
    private int run;

    // constructor
    public Usuario() {
    }

    public Usuario(String nombre, String fechaNacimiento, int run) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void analizarUsuario() {
        System.out.println("Nombre Usuario: " + getNombre());
    }
    //Validadores
    //Formato Fecha
    public static int mostrarEdad(String fechaNacimiento) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Date fechaNac = sdf.parse(fechaNacimiento);
        Date fechaActual = new Date();
        long diferenciaEnMillis = fechaActual.getTime() - fechaNac.getTime();
        long edadEnMillis = 31557600000L; // Aproximadamente 1 año en milisegundos
        return (int) (diferenciaEnMillis / edadEnMillis);
    }

    public static boolean validarFormatoFecha(String fecha) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        return fecha.matches("\\d{2}/\\d{2}/\\d{4}") && sdf.format(sdf.parse(fecha)).equals(fecha);
    }

    public static boolean validarFechaVacia(String fechaNacimiento) {
        return fechaNacimiento != null && !fechaNacimiento.isEmpty();
    }

    //Nombre
    public static boolean validarNombre(String nombre) {
        int longitudMinima = 10;
        int longitudMaxima = 50;
        int longitud = nombre.length();
        if (longitud < longitudMinima || longitud > longitudMaxima) {
            return false;
        }
        return true;
    }

    public static boolean validarNombreVacio(String nombre) {
        return nombre != null && !nombre.isEmpty();
    }

    //RUN
    public static boolean validarRun(int run) {
        return run > 0 && run < 99999999;
    }
    public static boolean validarRunVacio(String run) {
        return run != null && !run.isEmpty();
    }
    public void setRun(int run) {

        this.run = run;
    }

    public static boolean validarRun(String run) {
        return run != null && !run.isEmpty();
    }
    //===================================================================================

    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Fecha de nacimiento: " + fechaNacimiento + "\n" +
                "RUN: " + run;
    }
}
