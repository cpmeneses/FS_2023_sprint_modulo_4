import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Esta clase representa un profesional.
 */
public class Profesional extends Usuario {
    private String titulo;
    private LocalDate fechaIngreso;

    /**
     * Crea un objeto Profesional con los valores proporcionados.
     *
     * @param nombre            El nombre del profesional.
     * @param apellido1         El primer apellido del profesional.
     * @param apellido2         El segundo apellido del profesional.
     * @param fechaDeNacimiento La fecha de nacimiento del profesional.
     * @param run               El RUN del profesional.
     * @param tipoUsuario       El tipo de usuario del profesional.
     * @param titulo            El título del profesional.
     * @param fechaIngreso      La fecha de ingreso del profesional.
     */
    public Profesional(String nombre, String apellido1, String apellido2, LocalDate fechaDeNacimiento, int run, int tipoUsuario, String titulo, LocalDate fechaIngreso) {
        super(nombre, apellido1, apellido2, fechaDeNacimiento, run, tipoUsuario);
        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;
    }

    public Profesional() {
    }

    /**
     * Imprime la información del profesional.
     * Imprime su título y su fecha de ingreso.
     * Además de su información como usuario.
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(titulo);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaIngresoFormateada = fechaIngreso.format(formatter);
        System.out.println(fechaIngresoFormateada);
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", run=" + run +
                ", tipoUsuario=" + tipoUsuario +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
