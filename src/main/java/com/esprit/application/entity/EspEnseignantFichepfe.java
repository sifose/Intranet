// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity(name="ESP_ENSEIGNANT_FICHEPFE")
@IdClass(EspEnseignantFichepfe.EspEnseignantFichepfeId.class)
public class EspEnseignantFichepfe implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspEnseignantFichepfeId implements Serializable {
        java.lang.String espEnseignantIdEns;
        Fichepfe fichepfe;
    }

    /** Primary key. */
    protected static final String PK = "EspEnseignantFichepfeSysC0016135";

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
    @Column(name="ESP_ENSEIGNANT_ID_ENS", nullable=false, length=255)
    private String espEnseignantIdEns;
    @OneToOne
    @Id
    @JoinColumn(name="FICHEPFES_ID_FICHE", nullable=false)
    private Fichepfe fichepfe;

    /** Default constructor. */
    public EspEnseignantFichepfe() {
        super();
    }

    /**
     * Access method for espEnseignantIdEns.
     *
     * @return the current value of espEnseignantIdEns
     */
    public String getEspEnseignantIdEns() {
        return espEnseignantIdEns;
    }

    /**
     * Setter method for espEnseignantIdEns.
     *
     * @param aEspEnseignantIdEns the new value for espEnseignantIdEns
     */
    public void setEspEnseignantIdEns(String aEspEnseignantIdEns) {
        espEnseignantIdEns = aEspEnseignantIdEns;
    }

    /**
     * Access method for fichepfe.
     *
     * @return the current value of fichepfe
     */
    public Fichepfe getFichepfe() {
        return fichepfe;
    }

    /**
     * Setter method for fichepfe.
     *
     * @param aFichepfe the new value for fichepfe
     */
    public void setFichepfe(Fichepfe aFichepfe) {
        fichepfe = aFichepfe;
    }

    /** Temporary value holder for group key fragment fichepfeIdFiche */
    private transient BigDecimal tempFichepfeIdFiche;

    /**
     * Gets the key fragment idFiche for member fichepfe.
     * If this.fichepfe is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setFichepfeIdFiche.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Fichepfe
     */
    public BigDecimal getFichepfeIdFiche() {
        return (getFichepfe() == null ? tempFichepfeIdFiche : getFichepfe().getIdFiche());
    }

    /**
     * Sets the key fragment idFiche from member fichepfe.
     * If this.fichepfe is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getFichepfeIdFiche.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdFiche New value for the key fragment
     * @see Fichepfe
     */
    public void setFichepfeIdFiche(BigDecimal aIdFiche) {
        if (getFichepfe() == null) {
            tempFichepfeIdFiche = aIdFiche;
        } else {
            getFichepfe().setIdFiche(aIdFiche);
        }
    }

    /**
     * Compares the key for this instance with another EspEnseignantFichepfe.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspEnseignantFichepfe and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspEnseignantFichepfe)) {
            return false;
        }
        EspEnseignantFichepfe that = (EspEnseignantFichepfe) other;
        Object myEspEnseignantIdEns = this.getEspEnseignantIdEns();
        Object yourEspEnseignantIdEns = that.getEspEnseignantIdEns();
        if (myEspEnseignantIdEns==null ? yourEspEnseignantIdEns!=null : !myEspEnseignantIdEns.equals(yourEspEnseignantIdEns)) {
            return false;
        }
        Object myFichepfeIdFiche = this.getFichepfeIdFiche();
        Object yourFichepfeIdFiche = that.getFichepfeIdFiche();
        if (myFichepfeIdFiche==null ? yourFichepfeIdFiche!=null : !myFichepfeIdFiche.equals(yourFichepfeIdFiche)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspEnseignantFichepfe.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspEnseignantFichepfe)) return false;
        return this.equalKeys(other) && ((EspEnseignantFichepfe)other).equalKeys(this);
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
        if (getEspEnseignantIdEns() == null) {
            i = 0;
        } else {
            i = getEspEnseignantIdEns().hashCode();
        }
        result = 37*result + i;
        if (getFichepfeIdFiche() == null) {
            i = 0;
        } else {
            i = getFichepfeIdFiche().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspEnseignantFichepfe |");
        sb.append(" espEnseignantIdEns=").append(getEspEnseignantIdEns());
        sb.append(" fichepfeIdFiche=").append(getFichepfeIdFiche());
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
        ret.put("espEnseignantIdEns", getEspEnseignantIdEns());
        ret.put("fichepfeIdFiche", getFichepfeIdFiche());
        return ret;
    }

}
