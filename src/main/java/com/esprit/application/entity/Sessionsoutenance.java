// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="SESSIONSOUTENANCE")
public class Sessionsoutenance implements Serializable {

    /** Primary key. */
    protected static final String PK = "idsoutenance";

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
    @Column(name="IDSOUTENANCE", unique=true, nullable=false, precision=10)
    private BigDecimal idsoutenance;
    @Column(name="DATEDEBUT", length=255)
    private String datedebut;
    @Column(name="DATEFIN", length=255)
    private String datefin;
    @Column(name="LIBELLE", length=255)
    private String libelle;
    @Column(name="ETAT", nullable=false, precision=10)
    private BigDecimal etat;
    @OneToMany(mappedBy="sessionsoutenance")
    private Set<Soutenance> soutenance;

    /** Default constructor. */
    public Sessionsoutenance() {
        super();
    }

    /**
     * Access method for idsoutenance.
     *
     * @return the current value of idsoutenance
     */
    public BigDecimal getIdsoutenance() {
        return idsoutenance;
    }

    /**
     * Setter method for idsoutenance.
     *
     * @param aIdsoutenance the new value for idsoutenance
     */
    public void setIdsoutenance(BigDecimal aIdsoutenance) {
        idsoutenance = aIdsoutenance;
    }

    /**
     * Access method for datedebut.
     *
     * @return the current value of datedebut
     */
    public String getDatedebut() {
        return datedebut;
    }

    /**
     * Setter method for datedebut.
     *
     * @param aDatedebut the new value for datedebut
     */
    public void setDatedebut(String aDatedebut) {
        datedebut = aDatedebut;
    }

    /**
     * Access method for datefin.
     *
     * @return the current value of datefin
     */
    public String getDatefin() {
        return datefin;
    }

    /**
     * Setter method for datefin.
     *
     * @param aDatefin the new value for datefin
     */
    public void setDatefin(String aDatefin) {
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
     * Access method for soutenance.
     *
     * @return the current value of soutenance
     */
    public Set<Soutenance> getSoutenance() {
        return soutenance;
    }

    /**
     * Setter method for soutenance.
     *
     * @param aSoutenance the new value for soutenance
     */
    public void setSoutenance(Set<Soutenance> aSoutenance) {
        soutenance = aSoutenance;
    }

    /**
     * Compares the key for this instance with another Sessionsoutenance.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Sessionsoutenance and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Sessionsoutenance)) {
            return false;
        }
        Sessionsoutenance that = (Sessionsoutenance) other;
        Object myIdsoutenance = this.getIdsoutenance();
        Object yourIdsoutenance = that.getIdsoutenance();
        if (myIdsoutenance==null ? yourIdsoutenance!=null : !myIdsoutenance.equals(yourIdsoutenance)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Sessionsoutenance.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Sessionsoutenance)) return false;
        return this.equalKeys(other) && ((Sessionsoutenance)other).equalKeys(this);
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
        if (getIdsoutenance() == null) {
            i = 0;
        } else {
            i = getIdsoutenance().hashCode();
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
        StringBuffer sb = new StringBuffer("[Sessionsoutenance |");
        sb.append(" idsoutenance=").append(getIdsoutenance());
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
        ret.put("idsoutenance", getIdsoutenance());
        return ret;
    }

}
