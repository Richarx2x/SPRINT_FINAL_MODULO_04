import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;
    public Administrativo() {}
    public Administrativo(String nombre, Date fechaNacimiento, int run, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }
    // Métodos de acceso para los atributos específicos de Administrativo
    public String getArea() {
        return area;
    }
    public String getExperienciaPrevia() {
        return experienciaPrevia;
    @Override
    public String toString() {
        return super.toString() + "\nÁrea: " + area + "\nExperiencia Previa: " + experienciaPrevia;
    }
}
//Validadores
//Area
    private boolean validarArea(String area) {
        int longitud = area.length();
        return longitud >= 5 && longitud <= 20;
    }
    public void setArea(String area) {
        if (validarArea(area)) {
            this.area = area;
        } else {
            System.out.println("Error: El área debe tener entre 5 y 20 caracteres.");
        }
        this.area = area;
    }
    public static boolean validarAreaVacia(String area) {
        return area != null && !area.isEmpty();
    }
//Experiencia Previa
    public void setExperienciaPrevia(String experienciaPrevia) {
        if (experienciaPrevia.length() > 100) {
            throw new IllegalArgumentException("La experiencia previa no puede exceder los 100 caracteres.");
        }
        this.experienciaPrevia = experienciaPrevia;
    }
    public static boolean validarExperienciaPreviaVacio(String experienciaPrevia) {
        return experienciaPrevia != null && !experienciaPrevia.isEmpty();
    }
//===================================================================================
class Administrativo extends Usuario implements Asesoria {
    private String area;
    private String experienciaPrevia;
    @Override
    public void analizarUsuario() {
        System.out.println("Analizando al administrativo: " + getNombre());
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Área: " + area + "\n" +
                "Experiencia previa: " + experienciaPrevia;
    }
}