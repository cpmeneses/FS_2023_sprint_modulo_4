import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Representa una capacitación.
 */
public class Capacitacion {
    private int id;
    private int rutCliente;
    private LocalDate dia;
    private LocalTime hora;
    private String lugar;
    private int duracion;
    private int cantidadDeAsistentes;

    public Capacitacion() {
    }

    /**
     * Crea una instancia de Capacitacion con los valores proporcionados.
     *
     * @param id                  Identificador de la capacitación.
     * @param rutCliente          Rut del cliente.
     * @param dia                 Día de la capacitación.
     * @param hora                Hora de la capacitación.
     * @param lugar               Lugar de la capacitación.
     * @param duracion            Duración de la capacitación en minutos.
     * @param cantidadDeAsistentes Cantidad de asistentes a la capacitación.
     */
    public Capacitacion(int id, int rutCliente, LocalDate dia, LocalTime hora, String lugar, int duracion, int cantidadDeAsistentes) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantidadDeAsistentes() {
        return cantidadDeAsistentes;
    }

    public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
        this.cantidadDeAsistentes = cantidadDeAsistentes;
    }

    /**
     * Devuelve el detalle de la capacitación con formato "La capacitación será en <lugar> a las <hora> del dia <dia>, y durará <duracion> minutos".
     *
     * @return El detalle de la capacitación.
     */
    public String mostrarDetalle() {
        return String.format("La capacitación será en %s a las %s del día %s, y durará %d minutos", lugar, hora, dia, duracion);
    }

    @Override
    public String toString() {
        return "Capacitacion{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", dia='" + dia + '\'' +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion=" + duracion +
                ", cantidadDeAsistentes=" + cantidadDeAsistentes +
                '}';
    }
}
