import java.time.LocalDate;

/**
 * Representa un accidente.
 */
public class Accidente {

    int id;
    String rutCliente;
    LocalDate fechaAccidente;
    String horaAccidente;
    String lugar;
    String causas;
    String consecuencias;

    public Accidente() {
    }

    /**
     * Crea una instancia de Accidente con los valores proporcionados.
     *
     * @param id              Identificador del accidente.
     * @param rutCliente      Rut del cliente afectado.
     * @param fechaAccidente  Fecha del accidente.
     * @param horaAccidente   Hora del accidente.
     * @param lugar           Lugar del accidente.
     * @param causas          Causas del accidente.
     * @param consecuencias   Consecuencias del accidente.
     */
    public Accidente(int id, String rutCliente, LocalDate fechaAccidente, String horaAccidente, String lugar, String causas, String consecuencias) {
        this.id = id;
        this.rutCliente = rutCliente;
        this.fechaAccidente = fechaAccidente;
        this.horaAccidente = horaAccidente;
        this.lugar = lugar;
        this.causas = causas;
        this.consecuencias = consecuencias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public LocalDate getFechaAccidente() {
        return fechaAccidente;
    }

    public void setFechaAccidente(LocalDate fechaAccidente) {
        this.fechaAccidente = fechaAccidente;
    }

    public String getHoraAccidente() {
        return horaAccidente;
    }

    public void setHoraAccidente(String horaAccidente) {
        this.horaAccidente = horaAccidente;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getCausas() {
        return causas;
    }

    public void setCausas(String causas) {
        this.causas = causas;
    }

    public String getConsecuencias() {
        return consecuencias;
    }

    public void setConsecuencias(String consecuencias) {
        this.consecuencias = consecuencias;
    }

    @Override
    public String toString() {
        return "Accidente{" +
                "id=" + id +
                ", rutCliente='" + rutCliente + '\'' +
                ", fechaAccidente=" + fechaAccidente +
                ", horaAccidente='" + horaAccidente + '\'' +
                ", lugar='" + lugar + '\'' +
                ", causas='" + causas + '\'' +
                ", consecuencias='" + consecuencias + '\'' +
                '}';
    }
}
