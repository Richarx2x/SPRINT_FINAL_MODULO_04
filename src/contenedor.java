class Contenedor {
    private List<Asesoria> asesorias;
    private List<Capacitacion> capacitaciones;

    public Contenedor() {
        this.asesorias = new ArrayList<>();
        this.capacitaciones = new ArrayList<>();
    }

    public void almacenarCliente(Cliente cliente) {
        asesorias.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) {
        asesorias.add(profesional);
    }

    public void almacenarAdministrativo(Administrativo administrativo) {
        asesorias.add(administrativo);
    }

    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    public void eliminarUsuario(int RUN) {
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                if (usuario.getRUN() == RUN) {
                    asesorias.remove(asesoria);
                    break;
                }
            }
        }
    }

    public void listarUsuarios() {
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                usuario.mostrarEdad();
            }
        }
    }

    public void mostrarCapacitaciones() {
        for (Capacitacion capacitacion : capacitaciones) {
            capacitacion.mostrarDetalle();
        }
    }

    public void mostrarUsuarios() {
        for (Asesoria asesoria : asesorias) {
            asesoria.analizarUsuario();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Contenedor contenedor = new Contenedor();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del cliente:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Fecha de nacimiento: ");
        String fechaNacimiento = scanner.nextLine();
        System.out.print("RUN: ");
        int run = scanner.nextInt();
        scanner.nextLine();
        System.out.print("RUT: ");
        int rut = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();
        System.out.print("AFP: ");
        String afp = scanner.nextLine();
        System.out.print("Sistema de salud (1: Fonasa, 2: Isapre): ");
        int sistemaSalud = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Comuna: ");
        String comuna = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, fechaNacimiento, run, rut, nombres, apellidos, telefono, afp, sistemaSalud,
                direccion, comuna);

        System.out.println("\nIngrese los datos del profesional:");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Fecha de nacimiento: ");
        fechaNacimiento = scanner.nextLine();
        System.out.print("RUN: ");
        run = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Fecha de ingreso: ");
        String fechaIngreso = scanner.nextLine();

        Profesional profesional = new Profesional(nombre, fechaNacimiento, run, titulo, fechaIngreso);

        System.out.println("\nIngrese los datos del administrativo:");
        System.out.print("Nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Fecha de nacimiento: ");
        fechaNacimiento = scanner.nextLine();
        System.out.print("RUN: ");
        run = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Área: ");
        String area = scanner.nextLine();
        System.out.print("Experiencia previa: ");
        String experienciaPrevia = scanner.nextLine();

        Administrativo administrativo = new Administrativo(nombre, fechaNacimiento, run, area, experienciaPrevia);

        contenedor.almacenarCliente(cliente);
        contenedor.almacenarProfesional(profesional);
        contenedor.almacenarAdministrativo(administrativo);

        contenedor.mostrarUsuarios();
    }
}
