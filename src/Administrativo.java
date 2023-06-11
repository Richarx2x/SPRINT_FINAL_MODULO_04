
public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    public Administrativo() {
        super();
    }

    public Administrativo(String nombre, String fechaNacimiento, int rut, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, rut);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    // Métodos de acceso para los atributos específicos de Administrativo
    public String getArea() {
        return area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nÁrea: " + area + "\nExperiencia Previa: " + experienciaPrevia;
    }

    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println("Analizando Administrativo Area: " + getArea() + "  Experiencia previa : " + getExperienciaPrevia());
        // Lógica específica para analizar a un administrativo
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
            System.out.println("ERROR!! EL ÁREA DEBE TENER UN MÍNIMO DE 5 Y UN MÁXIMO DE 20 CARÁCTERES");
        }
        this.area = area;
    }

    public static boolean validarAreaVacia(String area) {
        return area != null && !area.isEmpty();
    }

    //Experiencia Previa
    public void setExperienciaPrevia(String experienciaPrevia) {
        if (experienciaPrevia.length() > 100) {
            throw new IllegalArgumentException("HA EXCEDIO EL MÁXIMO DE CARÁCTERES PERMITIDOS!");
        }
        this.experienciaPrevia = experienciaPrevia;
    }

    public static boolean validarExperienciaPreviaVacio(String experienciaPrevia) {
        return experienciaPrevia != null && !experienciaPrevia.isEmpty();
    }

}