import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void menu() {
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
    }

    //buscar rut de cliente


    /* public static boolean buscarRut(int rut) {
         boolean existe = false;
         for (Asesoria asesoria : asesorias) {

             if (asesoria instanceof Cliente) {
                 Cliente cliente = new Cliente();
                 if (cliente.getRut() == rut) {
                     existe = true;
                     break;
                 }
             }
         }

         return existe;
     }
 */
    public static void main(String[] args) throws ParseException {

        Contenedor contenedor = new Contenedor();
        Scanner scanner = new Scanner(System.in);
//        -------------------------------MENU-------------------------
        System.out.println("Ingrese la opión a realizar");

        boolean salir = false;
        while (!salir) {
            menu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese los datos del cliente:");
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Fecha de nacimiento: ");
                    String fechaNacimiento = scanner.nextLine();
                    System.out.print("RUN: ");
                    int run = scanner.nextInt();
                    System.out.print("RUT: ");
                    int rut = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Apellidos: ");
                    String apellidos = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    int telefono = scanner.nextInt();
                    System.out.print("AFP: ");
                    String afp = scanner.nextLine();
                    System.out.print("Sistema de salud (1: Fonasa, 2: Isapre): ");
                    int sistemaSalud = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = scanner.nextLine();
                    System.out.print("Comuna: ");
                    String comuna = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();

                    Cliente cliente = new Cliente(nombre, fechaNacimiento, run, rut, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad);

                    contenedor.almacenarCliente(cliente);
                    break;
                case 2:
                    System.out.println("Ingrese los datos del profesional:");
                    String nombr;
                    do{
                        System.out.print("Nombre: ");
                        nombre = scanner.nextLine();
                        if (!Usuario.validarNombre(nombre)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    }while(true);
                    String fechaNacimien;
                    do{
                        System.out.print("Fecha de nacimiento: ");
                        fechaNacimien = scanner.nextLine();
                        if (!Usuario.validarFormatoFecha(fechaNacimien)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    }while(true);
                    int ru;
                    do{
                        System.out.print("RUN: ");
                        run = scanner.nextInt();
                        if (!Usuario.validarRun(run)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                    }
                    } while(true);
                    scanner.nextLine();
                    String titulo;
                    do{
                        System.out.print("Titulo: ");
                        titulo = scanner.nextLine();
                        if (!Profesional.validarTitulo(titulo)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while(true);
                    System.out.print("Título: ");
                    //String titulo = scanner.nextLine();
                    System.out.print("Fecha de ingreso: ");
                    String fechaIngreso = scanner.nextLine();

                    Profesional profesional = new Profesional(nombre, fechaNacimien, run, titulo, fechaIngreso);

                    contenedor.almacenarProfesional(profesional);

                    break;
                case 3:
                    System.out.println("\nIngrese los datos del administrativo:");
                    String nom;
                    do{
                        System.out.print("Nombre: ");
                        nombre = scanner.nextLine();
                        if (!Usuario.validarNombre(nombre)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    }while(true);
                    String fechaNacimi;
                    do{
                        System.out.print("Fecha de nacimiento: ");
                        fechaNacimien = scanner.nextLine();
                        if (!Usuario.validarFormatoFecha(fechaNacimien)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    }while(true);
                    int runn;
                    do{
                        System.out.print("RUN: ");
                        run = scanner.nextInt();
                        if (!Usuario.validarRun(run)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while(true);
                    String area;
                    do{
                        System.out.print("Área: ");
                        area = scanner.nextLine();
                        if (!Administrativo.validarArea(area)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    }while(true);

                    String experienciaPrevia;
                    do{
                        System.out.print("Experiencia previa: ");
                        experienciaPrevia = scanner.nextLine();
                        if (!Administrativo.validarExperienciaPrevia(experienciaPrevia)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    }while(true);

                    Administrativo administrativo = new Administrativo(nombre, fechaNacimiento, run, area, experienciaPrevia);

                    contenedor.almacenarAdministrativo(administrativo);
                    break;
                case 4:

                    System.out.println("\nIngrese los datos Capacitación:");
                    System.out.print("Id Capacitacion: ");
                    int idCapacitacion = scanner.nextInt();

                    System.out.print("Rut Cliente: ");
                    int clienterut = scanner.nextInt();
                    boolean valida = contenedor.buscarRut(clienterut);
                    if (valida == false) {

                        System.out.println("no existe un cliente con el rut proporcionado");


                    } else {
                        scanner.nextLine();
                        String dia;

                        do {
                            System.out.print("Día: ");
                            dia = scanner.nextLine();
                            if (!Capacitacion.validarDiaSemana(dia)) {
                                System.out.println(" Ingrese dia váido lunes,martes,miercoles, jueves,viernes,sabado,domingo");
                            }
                        } while (!Capacitacion.comprobarDia(dia));


                        String hora;
                        do {
                            System.out.print("Hora: ");
                            hora = scanner.nextLine();
                            if (!Capacitacion.comprobarFormatoHora(hora)) {
                                System.out.println(" Ingrese en formato hh:mm");
                            }

                        } while (!Capacitacion.comprobarFormatoHora(hora));

                        String lugar;
                        do {
                            System.out.print("Lugar: ");
                            lugar = scanner.nextLine();
                            if (!Capacitacion.comprobarLugar(lugar)) {
                                System.out.println(" Mínimo 10, máximo 50 caracteres");
                            }

                        } while (!Capacitacion.comprobarLugar(lugar));

                        int duracion;
                        do {
                            System.out.println("Duracion :");
                            duracion = scanner.nextInt();
                            if (!Capacitacion.comprobarDuracion(duracion)) {
                                System.out.println(" Máximo 70 minutos");
                            }

                        } while (!Capacitacion.comprobarDuracion(duracion));

                        int cantidadAsistentes;
                        do {
                            System.out.println("Cantidad de Asistentes :");
                            cantidadAsistentes = scanner.nextInt();
                            if (!Capacitacion.comprobarCantidadAsistentes(cantidadAsistentes)) {
                                System.out.println("mínimo 1  y Máximo 1000 Asistentes");
                            }

                        } while (!Capacitacion.comprobarCantidadAsistentes(cantidadAsistentes));

                        Capacitacion cap = new Capacitacion(idCapacitacion, dia, hora, lugar, duracion, cantidadAsistentes);
                        contenedor.almacenarCapacitacion(cap);

                        break;
                    }

                    break;
                case 5:
                    System.out.println("Ingrese RUT de Usuario a eliminar");
                    int rutt = scanner.nextInt();

                    contenedor.eliminarUsuario(rutt);
                    break;
                case 6:
                    System.out.println("-----LISTA DE USUARIOS-----");
                    contenedor.listarUsuarios();
                    break;
                case 7:
                    contenedor.listarUsuarios();
                    break;
                case 8:
                    System.out.println("----LISTAR CAPACITACIONES----");
                    contenedor.mostrarCapacitaciones();

                    break;
                case 9:
                    System.out.println("Gracias por usar nuestro sistema, hasta luego");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, ingrese una opcion del menu");
                    break;

            }

        }

    }


}
