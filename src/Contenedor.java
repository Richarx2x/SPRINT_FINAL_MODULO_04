import java.util.ArrayList;
class Contenedor {
    private List<Asesoria> asesorias;
    private List<Capacitacion> capacitaciones;

    public Contenedor() {
        asesorias = new ArrayList<>();
        capacitaciones = new ArrayList<>();
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

    public void eliminarUsuario(int run) {
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario && ((Usuario) asesoria).getRun() == run) {
                asesorias.remove(asesoria);
                break;
            }
        }
    }

    public void listarUsuarios() {
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {
                System.out.println(((Usuario) asesoria).toString());
                System.out.println("--------------------");
            }
        }
    }

    public void listarUsuariosPorTipo(String tipo) {
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Usuario) {
                Usuario usuario = (Usuario) asesoria;
                if (tipo.equalsIgnoreCase("cliente") && usuario instanceof Cliente) {
                    System.out.println(usuario.toString());
                    System.out.println("--------------------");
                } else if (tipo.equalsIgnoreCase("administrativo") && usuario instanceof Administrativo) {
                    System.out.println(usuario.toString());
                    System.out.println("--------------------");
                } else if (tipo.equalsIgnoreCase("profesional") && usuario instanceof Profesional) {
                    System.out.println(usuario.toString());
                    System.out.println("--------------------");
                }
            }
        }
    }

    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println(capacitacion.toString());
            System.out.println("--------------------");
        }
    }
}