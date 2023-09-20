/**
 * Esta clase representa una revisión realizada durante una visita en terreno.
 */
public class Revision {
    private int idRevision;

    private int idVisitaTerreno;
    private String tipoRevision;
    private String detalle;
    private int estado;

    public Revision() {
    }

    /**
     * Crea un objeto Revision con los valores proporcionados.
     *
     * @param idRevision       El ID de la revisión.
     * @param idVisitaTerreno  El ID de la visita en terreno asociada a la revisión.
     * @param tipoRevision     El tipo de revisión.
     * @param detalle          El detalle de la revisión.
     * @param estado           El estado de la revisión.
     */
    public Revision(int idRevision, int idVisitaTerreno, String tipoRevision, String detalle, int estado) {
        this.idRevision = idRevision;
        this.idVisitaTerreno = idVisitaTerreno;
        this.tipoRevision = tipoRevision;
        this.detalle = detalle;
        this.estado = estado;
    }

    public int getIdRevision() {
        return idRevision;
    }

    public void setIdRevision(int idRevision) {
        this.idRevision = idRevision;
    }

    public int getIdVisitaTerreno() {
        return idVisitaTerreno;
    }

    public void setIdVisitaTerreno(int idVisitaTerreno) {
        this.idVisitaTerreno = idVisitaTerreno;
    }

    public String getTipoRevision() {
        return tipoRevision;
    }

    public void setTipoRevision(String tipoRevision) {
        this.tipoRevision = tipoRevision;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revision{" +
                "idRevision=" + idRevision +
                ", idVisitaTerreno=" + idVisitaTerreno +
                ", tipoRevision='" + tipoRevision + '\'' +
                ", detalle='" + detalle + '\'' +
                ", estado=" + estado +
                '}';
    }
}
