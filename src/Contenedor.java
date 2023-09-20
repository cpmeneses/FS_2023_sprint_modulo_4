import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Representa un contenedor que almacena usuarios y capacitaciones.
 */
public class Contenedor {
    List<Usuario> usuarios;
    List<Capacitacion> capacitaciones;

    /**
     * Crea una instancia de Contenedor con listas vacías.
     */
    public Contenedor() {
        this.usuarios = new ArrayList<Usuario>();
        this.capacitaciones = new ArrayList<Capacitacion>();
    }

    public Contenedor(List<Usuario> usuarios, List<Capacitacion> capacitaciones) {
        this.usuarios = usuarios;
        this.capacitaciones = capacitaciones;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Capacitacion> getCapacitaciones() {
        return capacitaciones;
    }

    public void setCapacitaciones(List<Capacitacion> capacitaciones) {
        this.capacitaciones = capacitaciones;
    }

    public void almacenarCliente(Cliente cliente) {
        usuarios.add(cliente);
    }

    public void almacenarProfesional(Profesional profesional) { usuarios.add(profesional); }

    public void almacenarAdministrativo(Administrativo administrativo) { usuarios.add(administrativo); }

    /**
     * Elimina un usuario de la lista de usuarios según su RUN.
     *
     * @param run El RUN del usuario a eliminar.
     */
    public void eliminarUsuario(int run) {
        Iterator iterator = usuarios.iterator();
        while (iterator.hasNext()) {
            Usuario usuario = (Usuario) iterator.next();
            int usuarioRun = usuario.getRun();
            if (usuarioRun == run) {
                iterator.remove();
            }
        }
    }

    /**
     * Lista todos los usuarios almacenados.
     */
    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println("***********************");
            String nombreCompleto = usuario.getNombre() + " " + usuario.getApellido1() + " " + usuario.getApellido2();
            System.out.println("Nombre: " + nombreCompleto);
            System.out.println("Fecha de Nacimiento: " + usuario.getFechaDeNacimiento());
            System.out.println("RUN: " +  usuario.getRun());
            System.out.println("Tipo de Usuario: " +  usuario.getTipoUsuarioString() + "\n");

        }
    }

    /**
     * Lista los usuarios almacenados por tipo (clientes, profesionales y administrativos).
     */
    public void listarUsuariosPorTipo() {
        List<Cliente> clientes = new ArrayList<Cliente>();
        List<Profesional> profesionales = new ArrayList<Profesional>();
        List<Administrativo> administrativos= new ArrayList<Administrativo>();

        for (Usuario usuario : usuarios) {

            switch (usuario.getTipoUsuarioString()) {
                case "Cliente" -> clientes.add((Cliente) usuario);
                case "Profesional" -> profesionales.add((Profesional) usuario);
                case "Administrativo"-> administrativos.add((Administrativo) usuario);
            }
        }
        System.out.println("********Clientes*******");
        for (Cliente cliente:
             clientes) {
            String nombreCompleto = cliente.getNombre() + " " + cliente.getApellido1() + " " + cliente.getApellido2();
            System.out.println("Nombre: " + nombreCompleto);
            System.out.println("Fecha de Nacimiento: " + cliente.getFechaDeNacimiento());
            System.out.println("RUN: " +  cliente.getRun());
            System.out.println("Tipo de Usuario: " +  cliente.getTipoUsuarioString());
            System.out.println("RUT: " +  cliente.getRut());
            System.out.println("Razón Social: " +  cliente.getRazonSocial());
            System.out.println("Teléfono Representante: " +  cliente.getTelefonoRepresentante());
            System.out.println("Dirección: " +  cliente.getDireccionEmpresa());
            System.out.println("Comuna: " +  cliente.getComunaEmpresa() + "\n");
        }

        System.out.println("******Profesionales*****");
        for (Profesional profesional:
                profesionales) {
            String nombreCompleto = profesional.getNombre() + " " + profesional.getApellido1() + " " + profesional.getApellido2();
            System.out.println("Nombre: " + nombreCompleto);
            System.out.println("Fecha de Nacimiento: " + profesional.getFechaDeNacimiento());
            System.out.println("RUN: " +  profesional.getRun());
            System.out.println("Tipo de Usuario: " +  profesional.getTipoUsuarioString());
            System.out.println("Título: " + profesional.getTitulo());
            System.out.println("Fecha de Ingreso: " + profesional.getFechaIngreso() + "\n");
        }
        System.out.println("*****Administrativos****");
        for (Administrativo administrativo:
                administrativos) {
            String nombreCompleto = administrativo.getNombre() + " " + administrativo.getApellido1() + " " + administrativo.getApellido2();
            System.out.println("Nombre: " + nombreCompleto);
            System.out.println("Fecha de Nacimiento: " + administrativo.getFechaDeNacimiento());
            System.out.println("RUN: " +  administrativo.getRun());
            System.out.println("Tipo de Usuario: " +  administrativo.getTipoUsuarioString());
            System.out.println("Área: " + administrativo.getArea());
            System.out.println("Experiencia Previa: " + administrativo.getExperienciaPrevia() + "\n");
        }

    }

    /**
     * Almacena una capacitación en la lista de capacitaciones.
     *
     * @param capacitacion La capacitación a almacenar.
     */
    public void almacenarCapacitacion(Capacitacion capacitacion) {
        capacitaciones.add(capacitacion);
    }

    /**
     * Lista todas las capacitaciones almacenadas.
     */
    public void listarCapacitaciones() {
        for (Capacitacion capacitacion : capacitaciones) {
            System.out.println("ID: " + capacitacion.getId());
            System.out.println("Rut Cliente: " + capacitacion.getRutCliente());
            System.out.println("Día: " + capacitacion.getDia());
            System.out.println("Hora: " + capacitacion.getHora());
            System.out.println("Lugar: " + capacitacion.getLugar());
            System.out.println("Duración: " + capacitacion.getDuracion());
            System.out.println("Cantidad de asistentes: " + capacitacion.getCantidadDeAsistentes()+ "\n");
        }

    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "usuarios=" + usuarios +
                ", capacitaciones=" + capacitaciones +
                '}';
    }
}
