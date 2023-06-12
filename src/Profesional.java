import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Profesional extends Usuario {
    private String titulo;
    private String fechaIngreso;

    public Profesional() {
        super();
    }

    public Profesional(String nombre, String fechaNacimiento, int rut, String titulo, String fechaIngreso) {
        super(nombre, fechaNacimiento, rut);
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
    public static boolean validarFormatoFecha(String fecha) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        return fecha.matches("\\d{2}/\\d{2}/\\d{4}") && sdf.format(sdf.parse(fecha)).equals(fecha);
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

    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Analizando Título Profesional: " + getTitulo()+"  Fecha Ingreso: "+getFechaIngreso());
        // Lógica específica para analizar a un profesional
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Título: " + titulo + "\n" +
                "Fecha de ingreso: " + fechaIngreso;
    }
}
