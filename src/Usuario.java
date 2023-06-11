import java.text.ParseException;
import java.text.SimpleDateFormat;

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

    public static boolean validarFormatoFecha(String fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(fecha);
            return true;
        } catch (ParseException e) {
            return false;
        }
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
        /* public void setNombres(String nombres) {
        this.nombres = nombres;
/*        if (validarNombres(nombres)) {
            this.nombres = nombres;
        } else {System.out.println("Ingresa bien los nombres. Utiliza un total mínimo de 5 caracteres y máximo de 30 caracteres");}*/

    public static boolean validarNombreVacio(String nombre) {
        return nombre != null && !nombre.isEmpty();
    }

    //RUN
    public void setRun(int run) {
        /*        if (validarRut(int rut)) {
            this.rut = rut;
        } else {System.out.println("Ingresa bien el RUT. Utiliza número menor a 99999999");}*/
        if (run < 0 || run > 99999999) {
            throw new IllegalArgumentException("ERROR!! EL RUN DEBE SER ENTRE 0 Y 99999999!");
        }
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
