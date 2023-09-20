import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Representa un cliente que es un tipo de usuario.
 */
public class Cliente extends Usuario{
    private int rut;
    private String razonSocial;
    private long telefonoRepresentante;
    private String direccionEmpresa;
    private String comunaEmpresa;

    /**
     * Crea una instancia de Cliente con los valores proporcionados.
     *
     * @param nombre              Nombre del cliente.
     * @param apellido1           Primer apellido del cliente.
     * @param apellido2           Segundo apellido del cliente.
     * @param fechaDeNacimiento   Fecha de nacimiento del cliente.
     * @param run                 RUN del cliente.
     * @param tipoUsuario         Tipo de usuario del cliente.
     * @param rut                 Rut del cliente.
     * @param razonSocial         Razón social del cliente.
     * @param telefonoRepresentante  Teléfono del representante del cliente.
     * @param direccionEmpresa    Dirección de la empresa del cliente.
     * @param comunaEmpresa       Comuna de la empresa del cliente.
     */
    public Cliente(String nombre, String apellido1, String apellido2, LocalDate fechaDeNacimiento, int run, int tipoUsuario, int rut, String razonSocial, long telefonoRepresentante, String direccionEmpresa, String comunaEmpresa) {
        super(nombre, apellido1, apellido2, fechaDeNacimiento, run, tipoUsuario);
        this.rut = rut;
        this.razonSocial = razonSocial;
        this.telefonoRepresentante = telefonoRepresentante;
        this.direccionEmpresa = direccionEmpresa;
        this.comunaEmpresa = comunaEmpresa;
    }

    public Cliente() {
    }

    /**
     * Imprime la información del cliente.
     * Se imprime el rut, la razón social, el teléfono del representante, la dirección de la empresa y la comuna de la empresa del cliente.
     * Además de la información que tiene como Usuario.
     */
    @Override
    public void analizarUsuario() {
        super.analizarUsuario();
        System.out.println(rut);
        System.out.println(razonSocial);
        System.out.println(telefonoRepresentante);
        System.out.println(direccionEmpresa);
        System.out.println(comunaEmpresa);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut=" + rut +
                ", razonSocial='" + razonSocial + '\'' +
                ", telefonoRepresentante=" + telefonoRepresentante +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                ", comunaEmpresa='" + comunaEmpresa + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", run=" + run +
                ", tipoUsuario=" + tipoUsuario +
                '}';
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public long getTelefonoRepresentante() {
        return telefonoRepresentante;
    }

    public void setTelefonoRepresentante(long telefonoRepresentante) {
        this.telefonoRepresentante = telefonoRepresentante;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public String getComunaEmpresa() {
        return comunaEmpresa;
    }

    public void setComunaEmpresa(String comunaEmpresa) {
        this.comunaEmpresa = comunaEmpresa;
    }

    /**
     * Obtiene el nombre del cliente.
     * Imprime el nombre de la empresa, el rut y la dirección del cliente.
     */
    public void obtenerNombre() {
        System.out.println("Obtener Nombre");
        System.out.println("Razón Social: " + this.razonSocial);
        System.out.println("Rut: "  + this.rut);
        System.out.println("Dirección: " + this.direccionEmpresa);
    }
}
