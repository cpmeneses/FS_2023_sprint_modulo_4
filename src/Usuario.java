import java.time.LocalDate;
import java.time.Period;

/**
 * Esta clase representa un usuario genérico.
 */
public class Usuario implements IUsuario {
    protected String nombre;
    protected String apellido1;
    protected String apellido2;
    protected LocalDate fechaDeNacimiento;
    protected int run;
    protected int tipoUsuario;

    /**
     * Crea un objeto Usuario con los valores proporcionados.
     *
     * @param nombre             El nombre del usuario.
     * @param apellido1          El primer apellido del usuario.
     * @param apellido2          El segundo apellido del usuario.
     * @param fechaDeNacimiento  La fecha de nacimiento del usuario.
     * @param run                El RUN del usuario.
     * @param tipoUsuario        El tipo de usuario.
     */
    public Usuario(String nombre, String apellido1, String apellido2, LocalDate fechaDeNacimiento, int run, int tipoUsuario) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.run = run;
        this.tipoUsuario = tipoUsuario;
    }

    public Usuario() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Obtiene el tipo de usuario como una cadena de texto.
     *
     * @return El tipo de usuario como una cadena de texto.
     */
    public String getTipoUsuarioString() {
        String tipo ="";

        if (tipoUsuario == 1){
            tipo = "Cliente";
        } else if (tipoUsuario == 2) {
            tipo = "Profesional";
        }
        else {
            tipo = "Administrativo";
        }
        return tipo;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", run=" + run +
                ", tipoUsuario=" + tipoUsuario +
                '}';
    }

    /**
     * Imprime la información base del usuario.
     */
    @Override
    public void analizarUsuario() {
        System.out.println("- Analizar Usuario -");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido 1: " + apellido1);
        System.out.println("Apellido 2: " + apellido2);
        System.out.println("Fecha de Nacimiento: " + fechaDeNacimiento);
        System.out.println("Run: " + run);
        System.out.println("Tipo de Usuario: " + tipoUsuario);
        System.out.println("(1 Cliente, 2 Profesional, 3 Administrativo)");
    }

    /**
     * Calcula y muestra la edad del usuario en años.
     */
    public void mostrarEdad(){

        LocalDate fechaActual = LocalDate.now();

        Period periodo = Period.between(this.fechaDeNacimiento, fechaActual);

        // Obtener la diferencia de años
        int edad = periodo.getYears();
        System.out.println("- Mostrar Edad -");
        System.out.println("La edad es: " + edad + " años");
    }
}
