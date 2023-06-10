import com.sun.istack.internal.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Capacitacion {
    private int idCapacitacion;
    @NotNull
    private Cliente RUTCliente;
    private String dia;
    private String hora;
    private String lugar;
    @NotNull
    private int duracion;
    private int cantidadAsistentes;

    public Capacitacion() {

        this.idCapacitacion = idCapacitacion();
    }

    public Capacitacion(int idCapacitacion, int RUTCliente, String dia, String hora, String lugar, int duracion, int cantidadAsistentes) throws Exception{
        this();
        this.RUTCliente = RUTCliente;
        if(comprobarDia(dia)){
            this.dia = dia;

        }
        if (comprobarFormatoHora(hora)){
            this.hora = hora;
        }
        if(lugar.length()>10 && lugar.length()<50){
            throw new Exception("Rango no válido");
        }
        this.lugar = lugar;

        if(comprobarDuracion(duracion)){
            this.duracion = duracion;
        }

        this.cantidadAsistentes = cantidadAsistentes;
    }
    public int getIdCapacitacion(){

        return idCapacitacion;
    }
    private int idCapacitacion(){

        return (int)(Math.random()*100+1);
    }
    public Cliente getRUTCliente() {
        return RUTCliente;
    }

    public void setRUTCliente(Cliente RUTCliente) {
        this.RUTCliente = RUTCliente;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        if(comprobarDia(dia)){
            this.dia = dia;
        }

    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        if (comprobarFormatoHora(hora)){
            this.hora = hora;
        }

    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar)throws Exception {
        if(lugar.length()>10 && lugar.length()<50)
            throw new Exception("Rango no válido");
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        if(comprobarDuracion(duracion)){
            this.duracion = duracion;
        }else {
            System.out.println("Ingrese hora formato hh:mm");
        }
    }

    public int getCantidadAsistentes() {

        return cantidadAsistentes;
    }

    public void setCantidadAsistentes(int cantidadAsistentes) {
        if(cantidadAsistentes > 0 && cantidadAsistentes < 1000){
            this.cantidadAsistentes = cantidadAsistentes;
        }

    }
    public String mostrarDetalle(){
        return "La capacitacion será en: "+ this.getLugar()+ " a las "+ this.getHora()+ " del día "+this.getDia()+", y durará  "+this.getDuracion()+"  minutos.";
    }

    /**
     * comprueba que el día ingresado sea correcto
     * @param dia
     * @return
     */
    private boolean comprobarDia(String dia){
        String[] semana={"lunes","martes","miercoles", "jueves","viernes","sabado","domingo"};
        for (int i =0;i <= semana.length; i++ ){
            if(semana[i].equals(dia)){
                return true;
            }
        }
        return false;
    }

    /**
     * comprueba el largo mínimo y máximo de caracteres
     * @param lugar
     * @return
     */
    private boolean comprobarLugar(String lugar){
        if(lugar.length()>10 && lugar.length()<50){
            return true;
        }
        return false;
    }

    /**
     * comprueba el rango hasta igual o menor a 70
     * @param duracion
     * @return
     */
    private boolean comprobarDuracion(int duracion){
        if(duracion <= 70){
            return true;
        }
        return false;
    }

    /**
     * comprueba el formato de hora ingresado
     * @param hora
     * @return
     */
    private boolean comprobarFormatoHora(String hora){
        String patron = "^([01]?\\d|2[0-3]):[0-5]\\d$";
        return Pattern.matches(patron,hora);
    }
}