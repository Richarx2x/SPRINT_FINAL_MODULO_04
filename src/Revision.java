import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Revision {
    private int revision;
    private int identificadorVisita;
    private String nombre;
    private String detalle_revision;
    private String estado;


    public void revision(int revision, int identificador, String nombre, String detalle_revision, String estado){
        this.revision = revision;
        this.identificadorVisita = identificador;
        this.nombre = nombre;
        this.detalle_revision = detalle_revision;
        this.estado = estado;
    }


    public int getRevision() {
        return revision;
    }

    public void setRevision(int revision) {
        this.revision = revision;
    }

    public int getIdentificadorVisita() {
        return identificadorVisita;
    }

    public void setIdentificador(int identificadorVisita) {
        this.identificadorVisita = identificadorVisita;
    }

    // validador identificador Visita

    public static void identificadorVisita(int identificadorVisita){
        Scanner scanner = new Scanner(System.in);
        while (true){
            // se solicitaria el rut del cliente al usuario
            //System.out.print("Ingrese el identificador de visita: ");
            //       identificadorVisita = scanner.nextInt();
            //luego se realiza la validacion dentro del bucle//
            if (identificadorVisita > 0 ){
                // si la validacion es correcta, sale del bucle//
                System.out.println("identificador de visita valido: " + identificadorVisita);
                break;
            } else {
                //si las condiciones no se cumplen arrojara error
                System.out.println("campo obligatorio e ingrese identificador de visita correctamente , intente nuevamente ");
                return;
            }
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // validador de nombre

    public static void nombre(String nombre){
        if (nombre != null && nombre.length() >= 10 && nombre.length() <= 50){
            // con este metodo se deja claro las condiciones de la validacion
            // si no se cumple las condiciones se arrojara error
        }else {
            System.out.println("Campo obligatorio,minimo de 10 a 50 caracteres ");

        } return;
    }

    public String getDetalle_revision() {
        return detalle_revision;
    }

    public void setDetalle_revision(String detalle_revision) {
        this.detalle_revision = detalle_revision;
    }

    // validador detalle revision

    public static void validarDetalle(String detalle_revision) {
        Scanner scanner = new Scanner(System.in);
        // se ingresa los detalles para la revision
        //System.out.println("Ingrese el detalle (máximo 100 caracteres): ");
        detalle_revision = scanner.nextLine();
        if (detalle_revision.length() > 100) {
            // si detalle supera los 100 caracteres arrojara error
            System.out.println("El detalle excede el límite de 100 caracteres.intente nuevamente");
            detalle_revision = detalle_revision.substring(0,100);
        }


    }
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    // validar estador

    public static void estado(String estado){
        Scanner scanner = new Scanner(System.in);
        // se ingresa las opciones disponibles
        while (true) {
            //System.out.println("Ingrese el estado (1: sin problemas, 2: con observaciones, 3: no aprueba): ");
            estado = scanner.nextLine();
            if (estado.equals("1") || estado.equals("2") || estado.equals("3")) {
                break;
                //si estado no cumple con los requisitos de validacion arrojara error
            } else {
                System.out.println("Estado inválido. Intente nuevamente.");
            }
        }

        System.out.println("Estado válido: " + estado);
    }

}