// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="SEMINAIRE")
public class Seminaire implements Serializable {

    /** Primary key. */
    protected static final String PK = "idseminaire";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="IDSEMINAIRE", unique=true, nullable=false, precision=10)
    private BigDecimal idseminaire;
    @Column(name="DATEFIN")
    private LocalDateTime datefin;
    @Column(name="LIBELLE", length=255)
    private String libelle;
    @Column(name="ENSEIGNANT", length=255)
    private String enseignant;
    @Column(name="DATESEMINAIRE")
    private LocalDateTime dateseminaire;
    @Column(name="DATEEXAMEN")
    private LocalDateTime dateexamen;
    @Column(name="SALLE", length=255)
    private String salle;
    @Column(name="HEUREDEBUT", length=255)
    private String heuredebut;
    @Column(name="HEUREFIN", length=255)
    private String heurefin;
    @OneToMany(mappedBy="seminaire")
    private Set<Noteseminaire> noteseminaire;
    @OneToMany(mappedBy="seminaire")
    private Set<EspEtudiantSeminaire> espEtudiantSeminaire;

    /** Default constructor. */
    public Seminaire() {
        super();
    }

    /**
     * Access method for idseminaire.
     *
     * @return the current value of idseminaire
     */
    public BigDecimal getIdseminaire() {
        return idseminaire;
    }

    /**
     * Setter method for idseminaire.
     *
     * @param aIdseminaire the new value for idseminaire
     */
    public void setIdseminaire(BigDecimal aIdseminaire) {
        idseminaire = aIdseminaire;
    }

    /**
     * Access method for datefin.
     *
     * @return the current value of datefin
     */
    public LocalDateTime getDatefin() {
        return datefin;
    }

    /**
     * Setter method for datefin.
     *
     * @param aDatefin the new value for datefin
     */
    public void setDatefin(LocalDateTime aDatefin) {
        datefin = aDatefin;
    }

    /**
     * Access method for libelle.
     *
     * @return the current value of libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Setter method for libelle.
     *
     * @param aLibelle the new value for libelle
     */
    public void setLibelle(String aLibelle) {
        libelle = aLibelle;
    }

    /**
     * Access method for enseignant.
     *
     * @return the current value of enseignant
     */
    public String getEnseignant() {
        return enseignant;
    }

    /**
     * Setter method for enseignant.
     *
     * @param aEnseignant the new value for enseignant
     */
    public void setEnseignant(String aEnseignant) {
        enseignant = aEnseignant;
    }

    /**
     * Access method for dateseminaire.
     *
     * @return the current value of dateseminaire
     */
    public LocalDateTime getDateseminaire() {
        return dateseminaire;
    }

    /**
     * Setter method for dateseminaire.
     *
     * @param aDateseminaire the new value for dateseminaire
     */
    public void setDateseminaire(LocalDateTime aDateseminaire) {
        dateseminaire = aDateseminaire;
    }

    /**
     * Access method for dateexamen.
     *
     * @return the current value of dateexamen
     */
    public LocalDateTime getDateexamen() {
        return dateexamen;
    }

    /**
     * Setter method for dateexamen.
     *
     * @param aDateexamen the new value for dateexamen
     */
    public void setDateexamen(LocalDateTime aDateexamen) {
        dateexamen = aDateexamen;
    }

    /**
     * Access method for salle.
     *
     * @return the current value of salle
     */
    public String getSalle() {
        return salle;
    }

    /**
     * Setter method for salle.
     *
     * @param aSalle the new value for salle
     */
    public void setSalle(String aSalle) {
        salle = aSalle;
    }

    /**
     * Access method for heuredebut.
     *
     * @return the current value of heuredebut
     */
    public String getHeuredebut() {
        return heuredebut;
    }

    /**
     * Setter method for heuredebut.
     *
     * @param aHeuredebut the new value for heuredebut
     */
    public void setHeuredebut(String aHeuredebut) {
        heuredebut = aHeuredebut;
    }

    /**
     * Access method for heurefin.
     *
     * @return the current value of heurefin
     */
    public String getHeurefin() {
        return heurefin;
    }

    /**
     * Setter method for heurefin.
     *
     * @param aHeurefin the new value for heurefin
     */
    public void setHeurefin(String aHeurefin) {
        heurefin = aHeurefin;
    }

    /**
     * Access method for noteseminaire.
     *
     * @return the current value of noteseminaire
     */
    public Set<Noteseminaire> getNoteseminaire() {
        return noteseminaire;
    }

    /**
     * Setter method for noteseminaire.
     *
     * @param aNoteseminaire the new value for noteseminaire
     */
    public void setNoteseminaire(Set<Noteseminaire> aNoteseminaire) {
        noteseminaire = aNoteseminaire;
    }

    /**
     * Access method for espEtudiantSeminaire.
     *
     * @return the current value of espEtudiantSeminaire
     */
    public Set<EspEtudiantSeminaire> getEspEtudiantSeminaire() {
        return espEtudiantSeminaire;
    }

    /**
     * Setter method for espEtudiantSeminaire.
     *
     * @param aEspEtudiantSeminaire the new value for espEtudiantSeminaire
     */
    public void setEspEtudiantSeminaire(Set<EspEtudiantSeminaire> aEspEtudiantSeminaire) {
        espEtudiantSeminaire = aEspEtudiantSeminaire;
    }

    /**
     * Compares the key for this instance with another Seminaire.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Seminaire and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Seminaire)) {
            return false;
        }
        Seminaire that = (Seminaire) other;
        Object myIdseminaire = this.getIdseminaire();
        Object yourIdseminaire = that.getIdseminaire();
        if (myIdseminaire==null ? yourIdseminaire!=null : !myIdseminaire.equals(yourIdseminaire)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Seminaire.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Seminaire)) return false;
        return this.equalKeys(other) && ((Seminaire)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getIdseminaire() == null) {
            i = 0;
        } else {
            i = getIdseminaire().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Seminaire |");
        sb.append(" idseminaire=").append(getIdseminaire());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idseminaire", getIdseminaire());
        return ret;
    }

}
