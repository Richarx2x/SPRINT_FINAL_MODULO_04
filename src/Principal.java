import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

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

    public static void main(String[] args) {

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
                    String nombre;
                    do {
                        System.out.print("Nombre: ");
                        nombre = scanner.nextLine();
                        if (!Usuario.validarNombre(nombre)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    }  while (true);
                    String fechaNacimiento;
                    do {
                        System.out.print("Fecha de nacimiento: ");
                        fechaNacimiento = scanner.nextLine();
                        if (!Usuario.validarFormatoFecha(fechaNacimiento)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);
                    int run;
                    do {
                        System.out.print("RUN: ");
                        run = scanner.nextInt();
                        if (!Cliente.validarRut(run)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);
                    int rut;
                    do {
                        System.out.print("RUT: ");
                        rut = scanner.nextInt();
                        if (!Cliente.validarRut(rut)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break; // Sale del ciclo do-while si el RUT es válido
                        }
                    } while (true);
                    scanner.nextLine(); // probando...
                    String apellidos;
                    do {
                        System.out.print("Apellidos: ");
                        apellidos = scanner.nextLine();
                        if (!Cliente.validarLongitudApellidos(apellidos)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);
                    int telefono;
                    do {
                        System.out.print("Teléfono: ");
                        telefono = scanner.nextInt();
                        if (!Cliente.validarTelefono(telefono)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);
                    scanner.nextLine(); // probando...
                    String afp;
                    do {
                        System.out.print("AFP: ");
                        afp = scanner.nextLine();
                        if (!Cliente.validarLongitudAfp(afp)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);
                    int sistemaSalud;
                    do {
                        System.out.print("Sistema de salud (1: Fonasa, 2: Isapre): ");
                        sistemaSalud = scanner.nextInt();
                        if (!Cliente.validarSistemaSalud(sistemaSalud)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);
                    scanner.nextLine(); // probando...
                    String direccion;
                    do {
                        System.out.print("Dirección: ");
                        direccion = scanner.nextLine();
                        if (!Cliente.validarLongitudDireccion(direccion)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);
                    String comuna;
                    do {
                        System.out.print("Comuna: ");
                        comuna = scanner.nextLine();
                        if (!Cliente.validarLongitudComuna(comuna)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);
                    int edad;
                    do {
                        System.out.print("Edad: ");
                        edad = scanner.nextInt();
                        if (!Cliente.validarEdad(edad)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);

                    Cliente cliente = new Cliente(nombre, fechaNacimiento, run, rut, apellidos, telefono, afp, sistemaSalud, direccion, comuna, edad);

                    contenedor.almacenarCliente(cliente);
                    break;
                case 2:
                    System.out.println("Ingrese los datos del profesional:");
                    System.out.print("Nombre: ");
                    String nombr = scanner.nextLine();
                    System.out.print("Fecha de nacimiento: ");
                    String fechaNacimien = scanner.nextLine();
                    System.out.print("RUN: ");
                    int ru = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Fecha de ingreso: ");
                    String fechaIngreso = scanner.nextLine();

                    Profesional profesional = new Profesional(nombr, fechaNacimien, ru, titulo, fechaIngreso);

                    contenedor.almacenarProfesional(profesional);

                    break;
                case 3:
                    System.out.println("\nIngrese los datos del administrativo:");
                    System.out.print("Nombre: ");
                    String nom = scanner.nextLine();
                    System.out.print("Fecha de nacimiento: ");
                    String fechaNacimi = scanner.nextLine();
                    System.out.print("RUN: ");
                    int runn = scanner.nextInt();

                    System.out.print("Área: ");
                    String area = scanner.nextLine();
                    System.out.print("Experiencia previa: ");
                    String experienciaPrevia = scanner.nextLine();

                    Administrativo administrativo = new Administrativo(nom, fechaNacimi, runn, area, experienciaPrevia);

                    contenedor.almacenarAdministrativo(administrativo);
                    break;
                case 4:
                    System.out.println("\nIngrese los datos Capacitación:");
                    System.out.print("Rut Cliente: ");
                    int clienterut = new Cliente().getRut();
                    System.out.print("Día: ");
                    String dia = scanner.nextLine();
                    System.out.print("Hora: ");
                    String hora = scanner.nextLine();
                    System.out.print("Lugar: ");
                    String lugar = scanner.nextLine();
                    System.out.println("Duracion :");
                    int duracion = scanner.nextInt();
                    System.out.println("Cantidad de Asistentes :");
                    int cantidadAsistentes = scanner.nextInt();

                    Capacitacion capacitacion = new Capacitacion();
                    contenedor.almacenarCapacitacion(capacitacion);
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
