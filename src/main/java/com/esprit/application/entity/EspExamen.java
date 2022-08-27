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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ESP_EXAMEN")
@IdClass(EspExamen.EspExamenId.class)
public class EspExamen implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspExamenId implements Serializable {
        java.math.BigDecimal numSession;
        EspSaisonUniversitaire espSaisonUniversitaire;
        java.lang.String anneeFin;
    }

    /** Primary key. */
    protected static final String PK = "EspExamenPkEspExamen";

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
    @Column(name="NUM_SESSION", nullable=false, precision=38)
    private BigDecimal numSession;
    @Id
    @Column(name="ANNEE_FIN", nullable=false, length=4)
    private String anneeFin;
    @Column(name="DATE_DEBUT")
    private LocalDateTime dateDebut;
    @Column(name="DATE_FIN")
    private LocalDateTime dateFin;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ANNEE_DEB", nullable=false)
    private EspSaisonUniversitaire espSaisonUniversitaire;
    @OneToMany(mappedBy="espExamen")
    private Set<EspModuleEtudiant> espModuleEtudiant;

    /** Default constructor. */
    public EspExamen() {
        super();
    }

    /**
     * Access method for numSession.
     *
     * @return the current value of numSession
     */
    public BigDecimal getNumSession() {
        return numSession;
    }

    /**
     * Setter method for numSession.
     *
     * @param aNumSession the new value for numSession
     */
    public void setNumSession(BigDecimal aNumSession) {
        numSession = aNumSession;
    }

    /**
     * Access method for anneeFin.
     *
     * @return the current value of anneeFin
     */
    public String getAnneeFin() {
        return anneeFin;
    }

    /**
     * Setter method for anneeFin.
     *
     * @param aAnneeFin the new value for anneeFin
     */
    public void setAnneeFin(String aAnneeFin) {
        anneeFin = aAnneeFin;
    }

    /**
     * Access method for dateDebut.
     *
     * @return the current value of dateDebut
     */
    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    /**
     * Setter method for dateDebut.
     *
     * @param aDateDebut the new value for dateDebut
     */
    public void setDateDebut(LocalDateTime aDateDebut) {
        dateDebut = aDateDebut;
    }

    /**
     * Access method for dateFin.
     *
     * @return the current value of dateFin
     */
    public LocalDateTime getDateFin() {
        return dateFin;
    }

    /**
     * Setter method for dateFin.
     *
     * @param aDateFin the new value for dateFin
     */
    public void setDateFin(LocalDateTime aDateFin) {
        dateFin = aDateFin;
    }

    /**
     * Access method for espSaisonUniversitaire.
     *
     * @return the current value of espSaisonUniversitaire
     */
    public EspSaisonUniversitaire getEspSaisonUniversitaire() {
        return espSaisonUniversitaire;
    }

    /**
     * Setter method for espSaisonUniversitaire.
     *
     * @param aEspSaisonUniversitaire the new value for espSaisonUniversitaire
     */
    public void setEspSaisonUniversitaire(EspSaisonUniversitaire aEspSaisonUniversitaire) {
        espSaisonUniversitaire = aEspSaisonUniversitaire;
    }

    /**
     * Access method for espModuleEtudiant.
     *
     * @return the current value of espModuleEtudiant
     */
    public Set<EspModuleEtudiant> getEspModuleEtudiant() {
        return espModuleEtudiant;
    }

    /**
     * Setter method for espModuleEtudiant.
     *
     * @param aEspModuleEtudiant the new value for espModuleEtudiant
     */
    public void setEspModuleEtudiant(Set<EspModuleEtudiant> aEspModuleEtudiant) {
        espModuleEtudiant = aEspModuleEtudiant;
    }

  

    /** Temporary value holder for group key fragment espSaisonUniversitaireAnneeDeb */
    private transient String tempEspSaisonUniversitaireAnneeDeb;

    /**
     * Gets the key fragment anneeDeb for member espSaisonUniversitaire.
     * If this.espSaisonUniversitaire is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspSaisonUniversitaireAnneeDeb.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspSaisonUniversitaire
     */
    public String getEspSaisonUniversitaireAnneeDeb() {
        return (getEspSaisonUniversitaire() == null ? tempEspSaisonUniversitaireAnneeDeb : getEspSaisonUniversitaire().getAnneeDeb());
    }

    /**
     * Sets the key fragment anneeDeb from member espSaisonUniversitaire.
     * If this.espSaisonUniversitaire is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspSaisonUniversitaireAnneeDeb.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAnneeDeb New value for the key fragment
     * @see EspSaisonUniversitaire
     */
    public void setEspSaisonUniversitaireAnneeDeb(String aAnneeDeb) {
        if (getEspSaisonUniversitaire() == null) {
            tempEspSaisonUniversitaireAnneeDeb = aAnneeDeb;
        } else {
            getEspSaisonUniversitaire().setAnneeDeb(aAnneeDeb);
        }
    }

    /**
     * Compares the key for this instance with another EspExamen.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspExamen and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspExamen)) {
            return false;
        }
        EspExamen that = (EspExamen) other;
        Object myNumSession = this.getNumSession();
        Object yourNumSession = that.getNumSession();
        if (myNumSession==null ? yourNumSession!=null : !myNumSession.equals(yourNumSession)) {
            return false;
        }
        Object myEspSaisonUniversitaireAnneeDeb = this.getEspSaisonUniversitaireAnneeDeb();
        Object yourEspSaisonUniversitaireAnneeDeb = that.getEspSaisonUniversitaireAnneeDeb();
        if (myEspSaisonUniversitaireAnneeDeb==null ? yourEspSaisonUniversitaireAnneeDeb!=null : !myEspSaisonUniversitaireAnneeDeb.equals(yourEspSaisonUniversitaireAnneeDeb)) {
            return false;
        }
        Object myAnneeFin = this.getAnneeFin();
        Object yourAnneeFin = that.getAnneeFin();
        if (myAnneeFin==null ? yourAnneeFin!=null : !myAnneeFin.equals(yourAnneeFin)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspExamen.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspExamen)) return false;
        return this.equalKeys(other) && ((EspExamen)other).equalKeys(this);
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
        if (getNumSession() == null) {
            i = 0;
        } else {
            i = getNumSession().hashCode();
        }
        result = 37*result + i;
        if (getEspSaisonUniversitaireAnneeDeb() == null) {
            i = 0;
        } else {
            i = getEspSaisonUniversitaireAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getAnneeFin() == null) {
            i = 0;
        } else {
            i = getAnneeFin().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspExamen |");
        sb.append(" numSession=").append(getNumSession());
        sb.append(" espSaisonUniversitaireAnneeDeb=").append(getEspSaisonUniversitaireAnneeDeb());
        sb.append(" anneeFin=").append(getAnneeFin());
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
        ret.put("numSession", getNumSession());
        ret.put("espSaisonUniversitaireAnneeDeb", getEspSaisonUniversitaireAnneeDeb());
        ret.put("anneeFin", getAnneeFin());
        return ret;
    }

}
