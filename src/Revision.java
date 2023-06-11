public class Revision {
    private int idRevision;
    private VisitaTerreno idVisitaTerreno;
    private String nombre;
    private String detalle_revision;
    private String estado;


    public void revision(int idRevision, VisitaTerreno idVisitaTerreno, String nombre, String detalle_revision, String estado) {
        this.idRevision = idRevision;
        this.idVisitaTerreno = idVisitaTerreno;
        this.nombre = nombre;
        this.detalle_revision = detalle_revision;
        this.estado = estado;
    }


    public int getRevision() {
        return idRevision;
    }

    public void setRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public VisitaTerreno getIdVisitaTerreno() {
        return idVisitaTerreno;
    }

    public void setIdentificador(VisitaTerreno idVisitaTerreno) {
        this.idVisitaTerreno = idVisitaTerreno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // validador de nombre

    public boolean nombre(String nombre) {
        if (nombre != null && nombre.length() >= 10 && nombre.length() <= 50) {
            return true;
        }
        return false;
    }

    public String getDetalle_revision() {
        return detalle_revision;
    }

    public void setDetalle_revision(String detalle_revision) {
        this.detalle_revision = detalle_revision;
    }

    // validador detalle revision

    public boolean validarDetalle(String detalle_revision) {
        if (detalle_revision.length() > 100) {
            return true;
        }
        return false;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    // validar estado

    public boolean estado(String estado) {
        if (estado.equals("1") || estado.equals("2") || estado.equals("3")) {
            return true;
        }
        return false;
    }

}