// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="PRESOUTENANCE")
public class Presoutenance implements Serializable {

    /** Primary key. */
    protected static final String PK = "idPresoutenance";

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
    @Column(name="ID_PRESOUTENANCE", unique=true, nullable=false, precision=10)
    private BigDecimal idPresoutenance;
    @Column(name="DTE", length=255)
    private String dte;
    @Column(name="HEURE", length=255)
    private String heure;
    @Column(name="ETAT", precision=10)
    private BigDecimal etat;
    @ManyToOne
    @JoinColumn(name="ET_ID_ET")
    private EspEtudiant espEtudiant;
    @ManyToOne
    @JoinColumn(name="SESSIONPSOUT_IDSOUTENANCE")
    private Sessionpresoutenance sessionpresoutenance;

    /** Default constructor. */
    public Presoutenance() {
        super();
    }

    /**
     * Access method for idPresoutenance.
     *
     * @return the current value of idPresoutenance
     */
    public BigDecimal getIdPresoutenance() {
        return idPresoutenance;
    }

    /**
     * Setter method for idPresoutenance.
     *
     * @param aIdPresoutenance the new value for idPresoutenance
     */
    public void setIdPresoutenance(BigDecimal aIdPresoutenance) {
        idPresoutenance = aIdPresoutenance;
    }

    /**
     * Access method for dte.
     *
     * @return the current value of dte
     */
    public String getDte() {
        return dte;
    }

    /**
     * Setter method for dte.
     *
     * @param aDte the new value for dte
     */
    public void setDte(String aDte) {
        dte = aDte;
    }

    /**
     * Access method for heure.
     *
     * @return the current value of heure
     */
    public String getHeure() {
        return heure;
    }

    /**
     * Setter method for heure.
     *
     * @param aHeure the new value for heure
     */
    public void setHeure(String aHeure) {
        heure = aHeure;
    }

    /**
     * Access method for etat.
     *
     * @return the current value of etat
     */
    public BigDecimal getEtat() {
        return etat;
    }

    /**
     * Setter method for etat.
     *
     * @param aEtat the new value for etat
     */
    public void setEtat(BigDecimal aEtat) {
        etat = aEtat;
    }

    /**
     * Access method for espEtudiant.
     *
     * @return the current value of espEtudiant
     */
    public EspEtudiant getEspEtudiant() {
        return espEtudiant;
    }

    /**
     * Setter method for espEtudiant.
     *
     * @param aEspEtudiant the new value for espEtudiant
     */
    public void setEspEtudiant(EspEtudiant aEspEtudiant) {
        espEtudiant = aEspEtudiant;
    }

    /**
     * Access method for sessionpresoutenance.
     *
     * @return the current value of sessionpresoutenance
     */
    public Sessionpresoutenance getSessionpresoutenance() {
        return sessionpresoutenance;
    }

    /**
     * Setter method for sessionpresoutenance.
     *
     * @param aSessionpresoutenance the new value for sessionpresoutenance
     */
    public void setSessionpresoutenance(Sessionpresoutenance aSessionpresoutenance) {
        sessionpresoutenance = aSessionpresoutenance;
    }

    /**
     * Compares the key for this instance with another Presoutenance.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Presoutenance and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Presoutenance)) {
            return false;
        }
        Presoutenance that = (Presoutenance) other;
        Object myIdPresoutenance = this.getIdPresoutenance();
        Object yourIdPresoutenance = that.getIdPresoutenance();
        if (myIdPresoutenance==null ? yourIdPresoutenance!=null : !myIdPresoutenance.equals(yourIdPresoutenance)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Presoutenance.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Presoutenance)) return false;
        return this.equalKeys(other) && ((Presoutenance)other).equalKeys(this);
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
        if (getIdPresoutenance() == null) {
            i = 0;
        } else {
            i = getIdPresoutenance().hashCode();
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
        StringBuffer sb = new StringBuffer("[Presoutenance |");
        sb.append(" idPresoutenance=").append(getIdPresoutenance());
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
        ret.put("idPresoutenance", getIdPresoutenance());
        return ret;
    }

}
