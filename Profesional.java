import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class Profesional extends Usuario {
    private String titulo;
    private String fechaIngreso;

    public Profesional() {}

    public Profesional(String nombre, String fechaNacimiento, int run, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, run);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
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
    public static boolean validarFechaVacia(String fechaIngreso) {
        return fechaIngreso != null && !fechaIngreso.isEmpty();
    }
//Titulo
    public boolean validarTitulo() {
        if (titulo != null && titulo.length() >= 10 && titulo.length() <= 50) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean validarTituloVacio(String titulo) {
        return titulo != null && !titulo.isEmpty();
    }
//===================================================================================
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaIngresoStr = sdf.format(fechaIngreso);
        return super.toString() + "\nTítulo: " + titulo + "\nFecha de Ingreso: " + fechaIngresoStr;
    }
}
//===================================================================================
class Profesional extends Usuario implements Asesoria {
    private String titulo;
    private String fechaIngreso;


    @Override
    public void analizarUsuario() {
        System.out.println("Analizando al profesional: " + getNombre());
        // Lógica específica para analizar a un profesional
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Título: " + titulo + "\n" +
                "Fecha de ingreso: " + fechaIngreso;
    }
}