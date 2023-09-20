import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Esta clase representa una visita en terreno.
 */
public class VisitaEnTerreno {
    private int id;

    private int rutCliente;
    private LocalDate fechaVisita;
    private LocalTime horaVisita;
    private String lugar;
    private String comentarios;

    public VisitaEnTerreno() {
    }

    /**
     * Crea un objeto VisitaEnTerreno con los valores proporcionados.
     *
     * @param id           El ID de la visita en terreno.
     * @param rutCliente   El RUT del cliente asociado a la visita en terreno.
     * @param fechaVisita  La fecha de la visita en terreno.
     * @param horaVisita   La hora de la visita en terreno.
     * @param lugar        El lugar de la visita en terreno.
     * @param comentarios  Los comentarios de la visita en terreno.
     */
    public VisitaEnTerreno(int id, int rutCliente, LocalDate fechaVisita, LocalTime horaVisita, String lugar, String comentarios) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.fechaVisita = fechaVisita;
        this.horaVisita = horaVisita;
        this.lugar = lugar;
        this.comentarios = comentarios;
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

    public LocalDate getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(LocalDate fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public LocalTime getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(LocalTime horaVisita) {
        this.horaVisita = horaVisita;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "VisitaEnTerreno{" +
                "id=" + id +
                ", rutCliente=" + rutCliente +
                ", fechaVisita=" + fechaVisita +
                ", horaVisita=" + horaVisita +
                ", lugar='" + lugar + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
