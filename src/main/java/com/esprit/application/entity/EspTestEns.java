// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="ESP_TEST_ENS")
@IdClass(EspTestEns.EspTestEnsId.class)
public class EspTestEns implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspTestEnsId implements Serializable {
        java.lang.String idEns;
        java.time.LocalDateTime dateChoix;
    }

    /** Primary key. */
    protected static final String PK = "EspTestEnsEspTestEnsPk";

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
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;
    @Column(name="TYPE_CHOIX", length=1)
    private String typeChoix;
    @Id
    @Column(name="DATE_CHOIX", nullable=false)
    private LocalDateTime dateChoix;

    /** Default constructor. */
    public EspTestEns() {
        super();
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
     * Access method for typeChoix.
     *
     * @return the current value of typeChoix
     */
    public String getTypeChoix() {
        return typeChoix;
    }

    /**
     * Setter method for typeChoix.
     *
     * @param aTypeChoix the new value for typeChoix
     */
    public void setTypeChoix(String aTypeChoix) {
        typeChoix = aTypeChoix;
    }

    /**
     * Access method for dateChoix.
     *
     * @return the current value of dateChoix
     */
    public LocalDateTime getDateChoix() {
        return dateChoix;
    }

    /**
     * Setter method for dateChoix.
     *
     * @param aDateChoix the new value for dateChoix
     */
    public void setDateChoix(LocalDateTime aDateChoix) {
        dateChoix = aDateChoix;
    }

    /**
     * Compares the key for this instance with another EspTestEns.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspTestEns and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspTestEns)) {
            return false;
        }
        EspTestEns that = (EspTestEns) other;
        Object myIdEns = this.getIdEns();
        Object yourIdEns = that.getIdEns();
        if (myIdEns==null ? yourIdEns!=null : !myIdEns.equals(yourIdEns)) {
            return false;
        }
        Object myDateChoix = this.getDateChoix();
        Object yourDateChoix = that.getDateChoix();
        if (myDateChoix==null ? yourDateChoix!=null : !myDateChoix.equals(yourDateChoix)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspTestEns.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspTestEns)) return false;
        return this.equalKeys(other) && ((EspTestEns)other).equalKeys(this);
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
        if (getIdEns() == null) {
            i = 0;
        } else {
            i = getIdEns().hashCode();
        }
        result = 37*result + i;
        if (getDateChoix() == null) {
            i = 0;
        } else {
            i = getDateChoix().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspTestEns |");
        sb.append(" idEns=").append(getIdEns());
        sb.append(" dateChoix=").append(getDateChoix());
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
        ret.put("idEns", getIdEns());
        ret.put("dateChoix", getDateChoix());
        return ret;
    }

}
