// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ESP_FILIERE")
public class EspFiliere implements Serializable {

    /** Primary key. */
    protected static final String PK = "codeFiliere";

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
    @Column(name="CODE_FILIERE", unique=true, nullable=false, length=2)
    private String codeFiliere;
    @Column(name="LIB_FILIERE", length=100)
    private String libFiliere;
    @OneToMany(mappedBy="espFiliere")
    private Set<EspUe> espUe;

    /** Default constructor. */
    public EspFiliere() {
        super();
    }

    /**
     * Access method for codeFiliere.
     *
     * @return the current value of codeFiliere
     */
    public String getCodeFiliere() {
        return codeFiliere;
    }

    /**
     * Setter method for codeFiliere.
     *
     * @param aCodeFiliere the new value for codeFiliere
     */
    public void setCodeFiliere(String aCodeFiliere) {
        codeFiliere = aCodeFiliere;
    }

    /**
     * Access method for libFiliere.
     *
     * @return the current value of libFiliere
     */
    public String getLibFiliere() {
        return libFiliere;
    }

    /**
     * Setter method for libFiliere.
     *
     * @param aLibFiliere the new value for libFiliere
     */
    public void setLibFiliere(String aLibFiliere) {
        libFiliere = aLibFiliere;
    }

    /**
     * Access method for espUe.
     *
     * @return the current value of espUe
     */
    public Set<EspUe> getEspUe() {
        return espUe;
    }

    /**
     * Setter method for espUe.
     *
     * @param aEspUe the new value for espUe
     */
    public void setEspUe(Set<EspUe> aEspUe) {
        espUe = aEspUe;
    }

    /**
     * Compares the key for this instance with another EspFiliere.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspFiliere and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspFiliere)) {
            return false;
        }
        EspFiliere that = (EspFiliere) other;
        Object myCodeFiliere = this.getCodeFiliere();
        Object yourCodeFiliere = that.getCodeFiliere();
        if (myCodeFiliere==null ? yourCodeFiliere!=null : !myCodeFiliere.equals(yourCodeFiliere)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspFiliere.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspFiliere)) return false;
        return this.equalKeys(other) && ((EspFiliere)other).equalKeys(this);
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
        if (getCodeFiliere() == null) {
            i = 0;
        } else {
            i = getCodeFiliere().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspFiliere |");
        sb.append(" codeFiliere=").append(getCodeFiliere());
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
        ret.put("codeFiliere", getCodeFiliere());
        return ret;
    }

}
