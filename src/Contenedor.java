import java.util.ArrayList;
import java.util.List;

public class Contenedor {
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
                if (usuario.getRun() == RUN) {
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
                usuario.analizarUsuario();
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
    public  boolean buscarRut(int RUN) {
        boolean existe= false;
        //List<Asesoria> asesorias = new ArrayList<>();
        for (Asesoria asesoria : asesorias) {
            if (asesoria instanceof Cliente) {
                Cliente ccl = (Cliente) asesoria;
                if (ccl.getRun() == RUN) {
                    return existe = true;
                }
            }
        }

        return existe;
    }
}
