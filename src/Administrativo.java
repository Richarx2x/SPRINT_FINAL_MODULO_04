class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;
    public Administrativo() {}
    public Administrativo(String nombre, String fechaNacimiento, int run, String area, String experienciaPrevia) {
        super(nombre, fechaNacimiento, run);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }
    //Accesadores y mutadores
    public String getArea() {
        return area;
    }
    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }

    //Métodos personalizados
    @Override
    public String toString() {
        return super.toString() + "\nÁrea: " + area + "\nExperiencia Previa: " + experienciaPrevia;
    }

    //Validadores
//Area
    /*private boolean validarArea(String area) {
        int longitud = area.length();
        return longitud >= 5 && longitud <= 20;
    }*/
    public static boolean validarAreaVacia(String area) {
        return area != null && !area.isEmpty();
    }
    public static boolean validarArea(String area) {
        if (area == null || area.length() < 5 || area.length() > 20) {
            return false;
        }
        return true;
    }
    //Experiencia Previa
    public static boolean validarExperienciaPrevia(String experienciaPrevia) {
        if (experienciaPrevia == null || experienciaPrevia.length() > 100) {
            return false;
        }
        return true;
    }
    public static boolean validarExperienciaPreviaVacio(String experienciaPrevia) {
        return experienciaPrevia != null && !experienciaPrevia.isEmpty();
    }
//===================================================================================

}


/*


public void setExperienciaPrevia(String experienciaPrevia) {
        if (experienciaPrevia.length() > 100) {
            throw new IllegalArgumentException("HA EXCEDIO EL MÁXIMO DE CARÁCTERES PERMITIDOS!");
        }
        this.experienciaPrevia = experienciaPrevia;
    }
    */