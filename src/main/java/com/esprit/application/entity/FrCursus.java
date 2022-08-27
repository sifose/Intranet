// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="FR_CURSUS")
public class FrCursus implements Serializable {

    /** Primary key. */
    protected static final String PK = "idCursus";

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
    @Column(name="ID_CURSUS", unique=true, nullable=false)
    private BigDecimal idCursus;
    @Column(name="LIBELLE_CURSUS", length=30)
    private String libelleCursus;
    @Column(name="ANNEE_CURSUS", length=10)
    private String anneeCursus;
    @Column(name="TYPE_CURSUS", length=10)
    private String typeCursus;
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="FIN_CURSUS", length=10)
    private String finCursus;

    /** Default constructor. */
    public FrCursus() {
        super();
    }

    /**
     * Access method for idCursus.
     *
     * @return the current value of idCursus
     */
    public BigDecimal getIdCursus() {
        return idCursus;
    }

    /**
     * Setter method for idCursus.
     *
     * @param aIdCursus the new value for idCursus
     */
    public void setIdCursus(BigDecimal aIdCursus) {
        idCursus = aIdCursus;
    }

    /**
     * Access method for libelleCursus.
     *
     * @return the current value of libelleCursus
     */
    public String getLibelleCursus() {
        return libelleCursus;
    }

    /**
     * Setter method for libelleCursus.
     *
     * @param aLibelleCursus the new value for libelleCursus
     */
    public void setLibelleCursus(String aLibelleCursus) {
        libelleCursus = aLibelleCursus;
    }

    /**
     * Access method for anneeCursus.
     *
     * @return the current value of anneeCursus
     */
    public String getAnneeCursus() {
        return anneeCursus;
    }

    /**
     * Setter method for anneeCursus.
     *
     * @param aAnneeCursus the new value for anneeCursus
     */
    public void setAnneeCursus(String aAnneeCursus) {
        anneeCursus = aAnneeCursus;
    }

    /**
     * Access method for typeCursus.
     *
     * @return the current value of typeCursus
     */
    public String getTypeCursus() {
        return typeCursus;
    }

    /**
     * Setter method for typeCursus.
     *
     * @param aTypeCursus the new value for typeCursus
     */
    public void setTypeCursus(String aTypeCursus) {
        typeCursus = aTypeCursus;
    }

    /**
     * Access method for idEns.
     *
     * @return the current value of idEns
     */
    public String getIdEns() {
        return idEns;
    }

    /**
     * Setter method for idEns.
     *
     * @param aIdEns the new value for idEns
     */
    public void setIdEns(String aIdEns) {
        idEns = aIdEns;
    }

    /**
     * Access method for finCursus.
     *
     * @return the current value of finCursus
     */
    public String getFinCursus() {
        return finCursus;
    }

    /**
     * Setter method for finCursus.
     *
     * @param aFinCursus the new value for finCursus
     */
    public void setFinCursus(String aFinCursus) {
        finCursus = aFinCursus;
    }

    /**
     * Compares the key for this instance with another FrCursus.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FrCursus and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FrCursus)) {
            return false;
        }
        FrCursus that = (FrCursus) other;
        Object myIdCursus = this.getIdCursus();
        Object yourIdCursus = that.getIdCursus();
        if (myIdCursus==null ? yourIdCursus!=null : !myIdCursus.equals(yourIdCursus)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FrCursus.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FrCursus)) return false;
        return this.equalKeys(other) && ((FrCursus)other).equalKeys(this);
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
        if (getIdCursus() == null) {
            i = 0;
        } else {
            i = getIdCursus().hashCode();
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
        StringBuffer sb = new StringBuffer("[FrCursus |");
        sb.append(" idCursus=").append(getIdCursus());
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
        ret.put("idCursus", getIdCursus());
        return ret;
    }

}
