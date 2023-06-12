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
                    } while (true);
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
                    String nombr;
                    do {
                        System.out.print("Nombre: ");
                        nombr = scanner.nextLine();
                        if (!Usuario.validarNombre(nombr)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);



                    String fechaNacimien;
                    do {
                        System.out.print("Fecha de nacimiento: ");
                        fechaNacimien = scanner.nextLine();
                        if (!Usuario.validarFormatoFecha(fechaNacimien)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);


                    int ru;
                    do {
                        System.out.print("RUT: ");
                        ru = scanner.nextInt();
                        if (!Cliente.validarRut(ru)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break; // Sale del ciclo do-while si el RUT es válido
                        }
                    } while (true);
                    scanner.nextLine();
                    String titulo;
                    do {
                        System.out.print("Titulo: ");
                        titulo = scanner.nextLine();
                        if (!Profesional.validarTituloVacio(titulo)) {
                            System.out.println("minimo de 10 a 50 caracteres comom maximo, intente nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);
                    scanner.nextLine();

                    System.out.print("Fecha de ingreso: ");
                    String fechaIngreso = scanner.nextLine();

                    Profesional profesional = new Profesional(nombr, fechaNacimien, ru, titulo, fechaIngreso);

                    contenedor.almacenarProfesional(profesional);

                    break;
                case 3:
                    System.out.println("\nIngrese los datos del administrativo:");
                    System.out.print("Nombre: ");
                    String nom;
                    do {
                        System.out.print("Nombre: ");
                        nom = scanner.nextLine();
                        if (!Usuario.validarNombre(nom)) {
                            System.out.println("La información ingresada no cumple los requisitos. Ingresa la información nuevamente");
                        } else {
                            System.out.println("Información ingresada correctamente");
                            break;
                        }
                    } while (true);

                    System.out.print("Fecha de nacimiento: ");
                    String fechaNacimi = scanner.nextLine();
                    System.out.print("RUN: ");
                    int runn = scanner.nextInt();
                    scanner.nextLine();
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
                    System.out.print("Área: ");
                    String area = scanner.nextLine();
                    System.out.print("Experiencia previa: ");
                    String experienciaPrevia = scanner.nextLine();

                    Administrativo administrativo = new Administrativo(nom, fechaNacimi, runn, area, experienciaPrevia);

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
