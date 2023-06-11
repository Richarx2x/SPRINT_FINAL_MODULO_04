import java.util.regex.Pattern;

public class VisitaTerreno {
    private int idVisitaTerreno;
    private Cliente rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;

    public VisitaTerreno(int idVisitaTerreno, Cliente rutCliente, String dia, String hora, String lugar, String comentarios) {
        this.idVisitaTerreno =idVisitaTerreno ;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    // Métodos de acceso para los atributos de VisitaTerreno

    public int getIdentificador() {
        return idVisitaTerreno;
    }

    public void setIdentificador(int idVisitaTerreno) {
        this.idVisitaTerreno = idVisitaTerreno;
    }

    // validador identificador visita en Terreno
    public Cliente getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(Cliente rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    //validador de hora
    public static boolean validarFormatoHora(String hora) {
        String patron = "^([01]?\\d|2[0-3]):[0-5]\\d$";
        return Pattern.matches(patron, hora);
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

//validador de lugar

    public boolean validarLugar(String lugar) {
        if (!lugar.isEmpty() && lugar.length() >= 10 && lugar.length() <= 50) {
            return true;
        }
        return false;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    // validador comentarios

    public boolean validarComentarios(String comentarios) {
        if (comentarios.length() <= 100) {
            return true;
        }
        return false;

    }

}

