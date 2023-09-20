import java.time.LocalDate;

/**
 * Representa un administrativo que es un tipo de usuario.
 */
public class Administrativo extends Usuario {
    private String area;
    private String experienciaPrevia;

    /**
     * Crea una instancia de Administrativo con los valores proporcionados.
     *
     * @param nombre           Nombre del administrativo.
     * @param apellido1        Primer apellido del administrativo.
     * @param apellido2        Segundo apellido del administrativo.
     * @param fechaDeNacimiento Fecha de nacimiento del administrativo.
     * @param run              RUN del administrativo.
     * @param tipoUsuario      Tipo de usuario del administrativo (3 para Administrativo).
     * @param area             Área del administrativo.
     * @param experienciaPrevia Experiencia previa del administrativo.
     */
    public Administrativo(String nombre, String apellido1, String apellido2, LocalDate fechaDeNacimiento, int run, int tipoUsuario, String area, String experienciaPrevia) {
        super(nombre, apellido1, apellido2, fechaDeNacimiento, run, tipoUsuario);
        this.area = area;
        this.experienciaPrevia = experienciaPrevia;
    }

    public Administrativo() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(String experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }


    @Override
    public String toString() {
        return "Administrativo{" +
                "area='" + area + '\'' +
                ", experienciaPrevia='" + experienciaPrevia + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", run=" + run +
                ", tipoUsuario=" + tipoUsuario +
                '}';
    }

    /**
     * Analiza el usuario administrativo.
     * Se imprime el área y la experiencia previa del administrativo.
     * Además de la información que tiene como Usuario.
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(area);
        System.out.println(experienciaPrevia);
    }
}
