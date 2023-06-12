import java.util.regex.Pattern;

public class Capacitacion {
    private int idCapacitacion;

    private Cliente RUTCliente;
    private String dia;
    private String hora;
    private String lugar;
    private int duracion;
    private int cantidadAsistentes;

    public Capacitacion() {


    }

    public Capacitacion(int idCapacitacion, String dia, String hora, String lugar, int duracion, int cantidadAsistentes) {
        this.idCapacitacion = idCapacitacion;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public Capacitacion(int idCapacitacion, Cliente RUTCliente, String dia, String hora, String lugar, int duracion, int cantidadAsistentes) {

        this.idCapacitacion = idCapacitacion;
        this.RUTCliente = RUTCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadAsistentes = cantidadAsistentes;
    }

    public int getIdCapacitacion() {
        return idCapacitacion;
    }

    public void setIdCapacitacion(int idCapacitacion) {
        this.idCapacitacion = idCapacitacion;
    }


    public Cliente getRUTCliente() {
        return RUTCliente;
    }

    public void setRUTCliente(Cliente RUTCliente) {
        this.RUTCliente = new Cliente();
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

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        if (lugar.length() > 10 && lugar.length() < 50)
            this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {

        this.duracion = duracion;

    }

    public int getCantidadAsistentes() {

        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        if (cantidadAsistentes > 0 && cantidadAsistentes < 1000) {
            this.cantidadAsistentes = cantidadAsistentes;
        }

    }

    public String mostrarDetalle() {
        return "La capacitacion será en: " + this.getLugar() + " a las " + this.getHora() + " del día " + this.getDia() + ", y durará  " + this.getDuracion() + "  minutos.";
    }

    public static boolean comprobarCantidadAsistentes(int cantidadAsistentes) {
        if (cantidadAsistentes > 0 && cantidadAsistentes < 1000) {
            return true;
        }
        return false;
    }

    /**
     * comprueba que el día ingresado sea correcto
     *
     * @param dia
     * @return
     */
    public static boolean comprobarDia(String dia) {
        String[] semana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        for (int i = 0; i <= semana.length; i++) {

            if (semana[i].equals(dia)) {
                return true;
            }
        }
        return false;
    }

    public static boolean validarDiaSemana(String dia) {
        String[] diasValidos = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        for (String diaValido : diasValidos) {
            if (diaValido.equalsIgnoreCase(dia)) {
                return true;
            }
        }
        return false;
    }

    /**
     * comprueba el largo mínimo y máximo de caracteres
     *
     * @param lugar
     * @return
     */

    public static boolean comprobarLugar(String lugar) {
        if (lugar.length() > 10 && lugar.length() < 50) {
            return true;
        }
        return false;
    }

    /**
     * comprueba el rango hasta igual o menor a 70
     *
     * @param duracion
     * @return
     */
    public static boolean comprobarDuracion(int duracion) {
        if (duracion <= 70) {
            return true;
        }
        return false;
    }

    /**
     * comprueba el formato de hora ingresado
     *
     * @param hora
     * @return
     */
    public static boolean comprobarFormatoHora(String hora) {
        String patron = "^([01]?\\d|2[0-3]):[0-5]\\d$";
        return Pattern.matches(patron, hora);
    }
}
