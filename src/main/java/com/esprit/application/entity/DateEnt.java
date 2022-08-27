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

@Entity(name="DATE_ENT")
public class DateEnt implements Serializable {

    /** Primary key. */
    protected static final String PK = "dateEnt1";

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
    @Column(name="DATE_ENT1", unique=true, nullable=false, length=50)
    private String dateEnt1;
    @Column(name="NOMBRE_CONDIDATS", precision=38)
    private BigDecimal nombreCondidats;
    @Column(name="NOMBR_MAX", precision=38)
    private BigDecimal nombrMax;

    /** Default constructor. */
    public DateEnt() {
        super();
    }

    /**
     * Access method for dateEnt1.
     *
     * @return the current value of dateEnt1
     */
    public String getDateEnt1() {
        return dateEnt1;
    }

    /**
     * Setter method for dateEnt1.
     *
     * @param aDateEnt1 the new value for dateEnt1
     */
    public void setDateEnt1(String aDateEnt1) {
        dateEnt1 = aDateEnt1;
    }

    /**
     * Access method for nombreCondidats.
     *
     * @return the current value of nombreCondidats
     */
    public BigDecimal getNombreCondidats() {
        return nombreCondidats;
    }

    /**
     * Setter method for nombreCondidats.
     *
     * @param aNombreCondidats the new value for nombreCondidats
     */
    public void setNombreCondidats(BigDecimal aNombreCondidats) {
        nombreCondidats = aNombreCondidats;
    }

    /**
     * Access method for nombrMax.
     *
     * @return the current value of nombrMax
     */
    public BigDecimal getNombrMax() {
        return nombrMax;
    }

    /**
     * Setter method for nombrMax.
     *
     * @param aNombrMax the new value for nombrMax
     */
    public void setNombrMax(BigDecimal aNombrMax) {
        nombrMax = aNombrMax;
    }

    /**
     * Compares the key for this instance with another DateEnt.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class DateEnt and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DateEnt)) {
            return false;
        }
        DateEnt that = (DateEnt) other;
        Object myDateEnt1 = this.getDateEnt1();
        Object yourDateEnt1 = that.getDateEnt1();
        if (myDateEnt1==null ? yourDateEnt1!=null : !myDateEnt1.equals(yourDateEnt1)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another DateEnt.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DateEnt)) return false;
        return this.equalKeys(other) && ((DateEnt)other).equalKeys(this);
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
        if (getDateEnt1() == null) {
            i = 0;
        } else {
            i = getDateEnt1().hashCode();
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
        StringBuffer sb = new StringBuffer("[DateEnt |");
        sb.append(" dateEnt1=").append(getDateEnt1());
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
        ret.put("dateEnt1", getDateEnt1());
        return ret;
    }

}
