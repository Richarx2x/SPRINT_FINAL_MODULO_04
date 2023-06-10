import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class VisitaTerreno {
    private int identificador;
    private int rutCliente;
    private String dia;
    private String hora;
    private String lugar;
    private String comentarios;

    public VisitaTerreno(int identificador, int rutCliente, String dia, String hora, String lugar, String comentarios) {
        this.identificador = identificador;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.comentarios = comentarios;
    }

    // Métodos de acceso para los atributos de VisitaTerreno

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

// validador identificador visita en Terreno

    public static void validarIdentificador(int identificador) {
        while (true) {
            // se hace la validacion dentro del bucle
            if (identificador > 0) {
                //al ser la validacion exitosa sale del bucle //
                System.out.println("El identificador es válido: " + identificador);
                break;

            } else {
                // si la validacion no se cumple arrojara error
                System.out.println("El identificador se ser mayor a 0, Inténtalo de nuevamente");
                return;
            }
        }
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }
// validador Rut cliente

    public static void validarRutCliente(int rutCliente) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // se solicitaria el rut del cliente al usuario
            //System.out.print("Ingrese el RUT del cliente: ");
            //       rutCliente = scanner.nextInt();
            //luego se realiza la validacion dentro del bucle//
            if (rutCliente > 0 && rutCliente < 99999999) {
                // si la validacion es correcta, sale del bucle//
                System.out.println("rut del cliente es valido: " + rutCliente);
                break;
            } else {
                //si las condiciones no se cumplen arrojara error
                System.out.println("campo obligatorio e ingrese rut menor de 99.999.999 , intente nuevamente ");
                return;
            }
        }
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

//validador dia

    public static void validarDia(String dia) {
        while (true) {
            // se realiza validacion dentro del bucle/
            if (dia.matches("^\\d{2}/\\d{2}/\\d{4}$")) {
                // la validacion es exitosa se sale del bucle//
                System.out.println("validacion de dia exitosa: " + dia);
                break;
            } else {
                // si las condiciones no se cumplen mandara mensaje de error //
                System.out.println("El dia debe tener formato DD/MM/AAAA, intente nuevamente");
            }
            return;
        }

    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
//validador de hora

    public class ValidadorHora {
        public static boolean validarFormatoHora(String hora) {
            String patron = "^([01]?\\d|2[0-3]):[0-5]\\d$";
            return Pattern.matches(patron, hora);
        }
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

//validador de lugar

    public static void validarLugar(String lugar) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            //Dentro del bucle while (true), se muestra un mensaje solicitando el ingreso del lugar
            System.out.println("Ingrese el lugar(campo obligatorio minimo de 10 a maximo 50 caracteres");
            lugar = scanner.nextLine();
            //la validacion se realiza con el if //
            if (!lugar.isEmpty() && lugar.length() >= 10 && lugar.length() <= 50) {
                break;
                // si la validacion se cumple se rompe el bucle//
            } else {
                System.out.println("lugar no cumple con requisitos,intente nuevamente");
            }
            return;
        }
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    // validador comentarios

    public static void validarComentarios(String comentarios) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Ingrese el comentario (máximo 100 caracteres): ");
            comentarios = scanner.nextLine();
            if (comentarios.length() <= 100) {
                break;
            } else {
                // si los requisitos no se cumplen arrojara error
                System.out.println("El comentario excede el límite de 100 caracteres. Intente nuevamente.");

            }

        }

    }
}