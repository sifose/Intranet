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

@Entity(name="COMITEVALIDATION")
public class Comitevalidation implements Serializable {

    /** Primary key. */
    protected static final String PK = "idcomitevalidation";

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
    @Column(name="IDCOMITEVALIDATION", unique=true, nullable=false, precision=10)
    private BigDecimal idcomitevalidation;
    @Column(name="NOM", length=255)
    private String nom;
    @Column(name="SPECIALITE", length=255)
    private String specialite;

    /** Default constructor. */
    public Comitevalidation() {
        super();
    }

    /**
     * Access method for idcomitevalidation.
     *
     * @return the current value of idcomitevalidation
     */
    public BigDecimal getIdcomitevalidation() {
        return idcomitevalidation;
    }

    /**
     * Setter method for idcomitevalidation.
     *
     * @param aIdcomitevalidation the new value for idcomitevalidation
     */
    public void setIdcomitevalidation(BigDecimal aIdcomitevalidation) {
        idcomitevalidation = aIdcomitevalidation;
    }

    /**
     * Access method for nom.
     *
     * @return the current value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter method for nom.
     *
     * @param aNom the new value for nom
     */
    public void setNom(String aNom) {
        nom = aNom;
    }

    /**
     * Access method for specialite.
     *
     * @return the current value of specialite
     */
    public String getSpecialite() {
        return specialite;
    }

    /**
     * Setter method for specialite.
     *
     * @param aSpecialite the new value for specialite
     */
    public void setSpecialite(String aSpecialite) {
        specialite = aSpecialite;
    }

    /**
     * Compares the key for this instance with another Comitevalidation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Comitevalidation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Comitevalidation)) {
            return false;
        }
        Comitevalidation that = (Comitevalidation) other;
        Object myIdcomitevalidation = this.getIdcomitevalidation();
        Object yourIdcomitevalidation = that.getIdcomitevalidation();
        if (myIdcomitevalidation==null ? yourIdcomitevalidation!=null : !myIdcomitevalidation.equals(yourIdcomitevalidation)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Comitevalidation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Comitevalidation)) return false;
        return this.equalKeys(other) && ((Comitevalidation)other).equalKeys(this);
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
        if (getIdcomitevalidation() == null) {
            i = 0;
        } else {
            i = getIdcomitevalidation().hashCode();
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
        StringBuffer sb = new StringBuffer("[Comitevalidation |");
        sb.append(" idcomitevalidation=").append(getIdcomitevalidation());
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
        ret.put("idcomitevalidation", getIdcomitevalidation());
        return ret;
    }

}
