
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("--- Menú Principal ---");
            System.out.println("1. Almacenar Cliente");
            System.out.println("2. Almacenar Profesional");
            System.out.println("3. Almacenar Administrativo");
            System.out.println("4. Almacenar Capacitación");
            System.out.println("5. Eliminar Usuario");
            System.out.println("6. Listar Usuarios");
            System.out.println("7. Listar Usuarios por Tipo");
            System.out.println("8. Listar Capacitaciones");
            System.out.println("9. Salir");

            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    crearCliente(contenedor, scanner);
                    break;
                case 2:
                    //crearProfesional(contenedor, scanner);
                    break;
                case 3:
                    //crearAdministrativo(contenedor, scanner);
                    break;
                case 4:
                    //crearCapacitacion(contenedor, scanner);
                    break;
                case 5:
                    //eliminarUsuario(contenedor, scanner);
                    break;
                case 6:
                    //contenedor.listarUsuarios();
                    break;
                case 7:
                    //listarUsuariosPorTipo(contenedor, scanner);
                    break;
                case 8:
                    //contenedor.listarCapacitaciones();
                    break;
                case 9:
                    salir = true;
                    System.out.println("Gracias por usar nuestro sistema, hasta luego");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, ingrese una opcion del menu");
                    break;
            }
            System.out.println("--------------------");
        }
    }

    public static int leeE(String mensaje){
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    public static String leeS(String mensaje){
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextLine();
    }

    public static float leeF(String mensaje){
        System.out.println(mensaje);
        Scanner entrada = new Scanner(System.in);
        return entrada.nextFloat();
    }
    private static void crearCliente(Scanner scanner) {
        // Lógica para solicitar los datos del cliente al usuario
        // y crear un objeto de la clase Cliente
        int rut = leeE("Ingresa el rut: ");
        String nombres = leeS("Ingresa el nombre del cliente: ");
        String apellidos = leeS("Ingresa el apellido del cliente: ");
        int telefono = leeE("Ingresa el teléfono del cliente");
        String afp = leeS("Ingresa la afp del cliente");
        int sistemaSalud = leeE("Ingresa tu sistema de salud. 1 Fonasa, 2 Isapre");
        String direccion = leeS ("Ingresa la dirección del cliente");
        String comuna = leeS ("Ingresa la comuna del cliente");
        int edad = leeE ("Ingresa la edad del cliente");

        Cliente cliente = new Cliente(rut, nombres, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad);

        // Asignar los valores correspondientes a los atributos del cliente
        contenedor.almacenarCliente(cliente);
        System.out.println("Cliente almacenado exitosamente.");
    }

   /* private static void crearProfesional(Contenedor contenedor, Scanner scanner) {
        // Lógica para solicitar los datos del profesional al usuario
        // y crear un objeto de la clase Profesional
        Profesional profesional = new Profesional();
        // Asignar los valores correspondientes a los atributos del profesional
        contenedor.almacenarProfesional(profesional);
        System.out.println("Profesional almacenado exitosamente.");
    }

    private static void crearAdministrativo(Contenedor contenedor, Scanner scanner) {
        // Lógica para solicitar los datos del administrativo al usuario
        // y crear un objeto de la clase Administrativo
        Administrativo administrativo = new Administrativo();
        // Asignar los valores correspondientes a los atributos del administrativo
        contenedor.almacenarAdministrativo(administrativo);
        System.out.println("Administrativo almacenado exitosamente.");
    }

    private static void crearCapacitacion(Contenedor contenedor, Scanner scanner) {
        // Lógica para solicitar los datos de la capacitación al usuario
        // y crear un objeto de la clase Capacitacion
        Capacitacion capacitacion = new Capacitacion();
        // Asignar los valores correspondientes a los atributos de la capacitación
        contenedor.almacenarCapacitacion(capacitacion);
        System.out.println("Capacitación almacenada exitosamente.");
    }

    private static void eliminarUsuario(Contenedor contenedor, Scanner scanner) {
        System.out.print("Ingrese el RUN del usuario a eliminar: ");
        int run = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        contenedor.eliminarUsuario(run);
        System.out.println("Usuario eliminado exitosamente.");
    }

    private static void listarUsuariosPorTipo(Contenedor contenedor, Scanner scanner) {
        System.out.print("Ingrese el tipo de usuario (cliente, profesional, administrativo): ");
        String tipo = scanner.nextLine();

        contenedor.listarUsuariosPorTipo(tipo);
    }*/
}