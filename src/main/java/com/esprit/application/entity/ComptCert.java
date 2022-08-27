// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="COMPT_CERT")
@IdClass(ComptCert.ComptCertId.class)
public class ComptCert implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class ComptCertId implements Serializable {
        java.math.BigDecimal cpt;
        java.time.LocalDateTime dateCert;
        java.lang.String heure;
    }

    /** Primary key. */
    protected static final String PK = "ComptCertPkCompt";

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
    @Column(name="DATE_CERT", nullable=false)
    private LocalDateTime dateCert;
    @Id
    @Column(name="HEURE", nullable=false, length=20)
    private String heure;
    @Id
    @Column(name="CPT", nullable=false)
    private BigDecimal cpt;

    /** Default constructor. */
    public ComptCert() {
        super();
    }

    /**
     * Access method for dateCert.
     *
     * @return the current value of dateCert
     */
    public LocalDateTime getDateCert() {
        return dateCert;
    }

    /**
     * Setter method for dateCert.
     *
     * @param aDateCert the new value for dateCert
     */
    public void setDateCert(LocalDateTime aDateCert) {
        dateCert = aDateCert;
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
     * Access method for cpt.
     *
     * @return the current value of cpt
     */
    public BigDecimal getCpt() {
        return cpt;
    }

    /**
     * Setter method for cpt.
     *
     * @param aCpt the new value for cpt
     */
    public void setCpt(BigDecimal aCpt) {
        cpt = aCpt;
    }

    /**
     * Compares the key for this instance with another ComptCert.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ComptCert and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ComptCert)) {
            return false;
        }
        ComptCert that = (ComptCert) other;
        Object myCpt = this.getCpt();
        Object yourCpt = that.getCpt();
        if (myCpt==null ? yourCpt!=null : !myCpt.equals(yourCpt)) {
            return false;
        }
        Object myDateCert = this.getDateCert();
        Object yourDateCert = that.getDateCert();
        if (myDateCert==null ? yourDateCert!=null : !myDateCert.equals(yourDateCert)) {
            return false;
        }
        Object myHeure = this.getHeure();
        Object yourHeure = that.getHeure();
        if (myHeure==null ? yourHeure!=null : !myHeure.equals(yourHeure)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ComptCert.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ComptCert)) return false;
        return this.equalKeys(other) && ((ComptCert)other).equalKeys(this);
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
        if (getCpt() == null) {
            i = 0;
        } else {
            i = getCpt().hashCode();
        }
        result = 37*result + i;
        if (getDateCert() == null) {
            i = 0;
        } else {
            i = getDateCert().hashCode();
        }
        result = 37*result + i;
        if (getHeure() == null) {
            i = 0;
        } else {
            i = getHeure().hashCode();
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
        StringBuffer sb = new StringBuffer("[ComptCert |");
        sb.append(" cpt=").append(getCpt());
        sb.append(" dateCert=").append(getDateCert());
        sb.append(" heure=").append(getHeure());
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
        ret.put("cpt", getCpt());
        ret.put("dateCert", getDateCert());
        ret.put("heure", getHeure());
        return ret;
    }

}
