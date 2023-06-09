import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Usuario implements Asesoria{
    private String nombre;
    private String fechaNacimiento;
    private int run;
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
        System.out.println("Analizando al cliente: " + getNombre());
    }
    //Validadores
    //Formato Fecha
        public class ValidadorFecha {
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
            // Verificar la longitud del nombre
            int longitud = nombre.length();
            if (longitud < longitudMinima || longitud > longitudMaxima) {
                return false;
            }
            // El nombre es válido
            return true;
        }
        public static boolean validarNombreVacio(String nombre) {
            return nombre != null && !nombre.isEmpty();
        }
    //RUN
        public void setRun(int run) {
            if (run < 0 || run > 99999999) {
                throw new IllegalArgumentException("El RUN debe ser un número entre 0 y 99.999.999");
            }
            this.run = run;
        }
        public static boolean validarRun(String run) {
            return run != null && !run.isEmpty();
        }
//===================================================================================
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Fecha de nacimiento: " + fechaNacimiento + "\n" +
                "RUN: " + run;
    }
}