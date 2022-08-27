// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="ESP_MAIL_ENSEIGNANT")
public class EspMailEnseignant implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

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
    @Column(name="ID", unique=true, nullable=false, precision=126)
    private double id;
    @Column(name="NOM_ENS", length=30)
    private String nomEns;
    @Column(name="MAIL_ENS", length=50)
    private String mailEns;

    /** Default constructor. */
    public EspMailEnseignant() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public double getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(double aId) {
        id = aId;
    }

    /**
     * Access method for nomEns.
     *
     * @return the current value of nomEns
     */
    public String getNomEns() {
        return nomEns;
    }

    /**
     * Setter method for nomEns.
     *
     * @param aNomEns the new value for nomEns
     */
    public void setNomEns(String aNomEns) {
        nomEns = aNomEns;
    }

    /**
     * Access method for mailEns.
     *
     * @return the current value of mailEns
     */
    public String getMailEns() {
        return mailEns;
    }

    /**
     * Setter method for mailEns.
     *
     * @param aMailEns the new value for mailEns
     */
    public void setMailEns(String aMailEns) {
        mailEns = aMailEns;
    }

    /**
     * Compares the key for this instance with another EspMailEnseignant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspMailEnseignant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspMailEnseignant)) {
            return false;
        }
        EspMailEnseignant that = (EspMailEnseignant) other;
        if (Double.doubleToLongBits(this.getId()) != Double.doubleToLongBits(that.getId())) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspMailEnseignant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspMailEnseignant)) return false;
        return this.equalKeys(other) && ((EspMailEnseignant)other).equalKeys(this);
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
        i = (int) (Double.doubleToLongBits(getId()) ^ (Double.doubleToLongBits(getId())>>>32));
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
        StringBuffer sb = new StringBuffer("[EspMailEnseignant |");
        sb.append(" id=").append(getId());
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
        ret.put("id", Double.valueOf(getId()));
        return ret;
    }

}
