// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="ESP_DEPT")
public class EspDept implements Serializable {

    /** Primary key. */
    protected static final String PK = "codeDept";

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
    @Column(name="CODE_DEPT", unique=true, nullable=false, length=2)
    private String codeDept;
    @Column(name="LIBELLE_DEPT", length=50)
    private String libelleDept;
    @Column(name="DATE_CR")
    private LocalDateTime dateCr;
    @Column(name="DATE_DERNIER_MODIF")
    private LocalDateTime dateDernierModif;

    /** Default constructor. */
    public EspDept() {
        super();
    }

    /**
     * Access method for codeDept.
     *
     * @return the current value of codeDept
     */
    public String getCodeDept() {
        return codeDept;
    }

    /**
     * Setter method for codeDept.
     *
     * @param aCodeDept the new value for codeDept
     */
    public void setCodeDept(String aCodeDept) {
        codeDept = aCodeDept;
    }

    /**
     * Access method for libelleDept.
     *
     * @return the current value of libelleDept
     */
    public String getLibelleDept() {
        return libelleDept;
    }

    /**
     * Setter method for libelleDept.
     *
     * @param aLibelleDept the new value for libelleDept
     */
    public void setLibelleDept(String aLibelleDept) {
        libelleDept = aLibelleDept;
    }

    /**
     * Access method for dateCr.
     *
     * @return the current value of dateCr
     */
    public LocalDateTime getDateCr() {
        return dateCr;
    }

    /**
     * Setter method for dateCr.
     *
     * @param aDateCr the new value for dateCr
     */
    public void setDateCr(LocalDateTime aDateCr) {
        dateCr = aDateCr;
    }

    /**
     * Access method for dateDernierModif.
     *
     * @return the current value of dateDernierModif
     */
    public LocalDateTime getDateDernierModif() {
        return dateDernierModif;
    }

    /**
     * Setter method for dateDernierModif.
     *
     * @param aDateDernierModif the new value for dateDernierModif
     */
    public void setDateDernierModif(LocalDateTime aDateDernierModif) {
        dateDernierModif = aDateDernierModif;
    }

    /**
     * Compares the key for this instance with another EspDept.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspDept and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspDept)) {
            return false;
        }
        EspDept that = (EspDept) other;
        Object myCodeDept = this.getCodeDept();
        Object yourCodeDept = that.getCodeDept();
        if (myCodeDept==null ? yourCodeDept!=null : !myCodeDept.equals(yourCodeDept)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspDept.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspDept)) return false;
        return this.equalKeys(other) && ((EspDept)other).equalKeys(this);
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
        if (getCodeDept() == null) {
            i = 0;
        } else {
            i = getCodeDept().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspDept |");
        sb.append(" codeDept=").append(getCodeDept());
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
        ret.put("codeDept", getCodeDept());
        return ret;
    }

}
