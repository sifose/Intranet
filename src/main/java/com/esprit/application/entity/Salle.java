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

@Entity(name="SALLE")
public class Salle implements Serializable {

    /** Primary key. */
    protected static final String PK = "codeSalle";

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
    @Column(name="CODE_SALLE", unique=true, nullable=false, length=3)
    private String codeSalle;
    @Column(name="DESCRIPTION", length=200)
    private String description;
    @OneToMany(mappedBy="salle")
    private Set<AffectationExamen> affectationExamen;

    /** Default constructor. */
    public Salle() {
        super();
    }

    /**
     * Access method for codeSalle.
     *
     * @return the current value of codeSalle
     */
    public String getCodeSalle() {
        return codeSalle;
    }

    /**
     * Setter method for codeSalle.
     *
     * @param aCodeSalle the new value for codeSalle
     */
    public void setCodeSalle(String aCodeSalle) {
        codeSalle = aCodeSalle;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for affectationExamen.
     *
     * @return the current value of affectationExamen
     */
    public Set<AffectationExamen> getAffectationExamen() {
        return affectationExamen;
    }

    /**
     * Setter method for affectationExamen.
     *
     * @param aAffectationExamen the new value for affectationExamen
     */
    public void setAffectationExamen(Set<AffectationExamen> aAffectationExamen) {
        affectationExamen = aAffectationExamen;
    }

    /**
     * Compares the key for this instance with another Salle.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Salle and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Salle)) {
            return false;
        }
        Salle that = (Salle) other;
        Object myCodeSalle = this.getCodeSalle();
        Object yourCodeSalle = that.getCodeSalle();
        if (myCodeSalle==null ? yourCodeSalle!=null : !myCodeSalle.equals(yourCodeSalle)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Salle.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Salle)) return false;
        return this.equalKeys(other) && ((Salle)other).equalKeys(this);
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
        if (getCodeSalle() == null) {
            i = 0;
        } else {
            i = getCodeSalle().hashCode();
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
        StringBuffer sb = new StringBuffer("[Salle |");
        sb.append(" codeSalle=").append(getCodeSalle());
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
        ret.put("codeSalle", getCodeSalle());
        return ret;
    }

}
