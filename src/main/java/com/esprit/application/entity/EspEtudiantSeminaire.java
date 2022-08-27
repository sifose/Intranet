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
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_ETUDIANT_SEMINAIRE")
@IdClass(EspEtudiantSeminaire.EspEtudiantSeminaireId.class)
public class EspEtudiantSeminaire implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspEtudiantSeminaireId implements Serializable {
        Seminaire seminaire;
        EspEtudiant espEtudiant;
    }

    /** Primary key. */
    protected static final String PK = "EspEtudiantSeminaireSysC0016168";

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

    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ETDS_ID_ET", nullable=false)
    private EspEtudiant espEtudiant;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="SEMINAIRE_IDSEMINAIRE", nullable=false)
    private Seminaire seminaire;

    /** Default constructor. */
    public EspEtudiantSeminaire() {
        super();
    }

    /**
     * Access method for espEtudiant.
     *
     * @return the current value of espEtudiant
     */
    public EspEtudiant getEspEtudiant() {
        return espEtudiant;
    }

    /**
     * Setter method for espEtudiant.
     *
     * @param aEspEtudiant the new value for espEtudiant
     */
    public void setEspEtudiant(EspEtudiant aEspEtudiant) {
        espEtudiant = aEspEtudiant;
    }

    /**
     * Access method for seminaire.
     *
     * @return the current value of seminaire
     */
    public Seminaire getSeminaire() {
        return seminaire;
    }

    /**
     * Setter method for seminaire.
     *
     * @param aSeminaire the new value for seminaire
     */
    public void setSeminaire(Seminaire aSeminaire) {
        seminaire = aSeminaire;
    }

    /** Temporary value holder for group key fragment seminaireIdseminaire */
    private transient BigDecimal tempSeminaireIdseminaire;

    /**
     * Gets the key fragment idseminaire for member seminaire.
     * If this.seminaire is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setSeminaireIdseminaire.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Seminaire
     */
    public BigDecimal getSeminaireIdseminaire() {
        return (getSeminaire() == null ? tempSeminaireIdseminaire : getSeminaire().getIdseminaire());
    }

    /**
     * Sets the key fragment idseminaire from member seminaire.
     * If this.seminaire is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getSeminaireIdseminaire.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdseminaire New value for the key fragment
     * @see Seminaire
     */
    public void setSeminaireIdseminaire(BigDecimal aIdseminaire) {
        if (getSeminaire() == null) {
            tempSeminaireIdseminaire = aIdseminaire;
        } else {
            getSeminaire().setIdseminaire(aIdseminaire);
        }
    }

    /** Temporary value holder for group key fragment espEtudiantIdEt */
    private transient String tempEspEtudiantIdEt;

    /**
     * Gets the key fragment idEt for member espEtudiant.
     * If this.espEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspEtudiantIdEt.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspEtudiant
     */
    public String getEspEtudiantIdEt() {
        return (getEspEtudiant() == null ? tempEspEtudiantIdEt : getEspEtudiant().getIdEt());
    }

    /**
     * Sets the key fragment idEt from member espEtudiant.
     * If this.espEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspEtudiantIdEt.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdEt New value for the key fragment
     * @see EspEtudiant
     */
    public void setEspEtudiantIdEt(String aIdEt) {
        if (getEspEtudiant() == null) {
            tempEspEtudiantIdEt = aIdEt;
        } else {
            getEspEtudiant().setIdEt(aIdEt);
        }
    }

    /**
     * Compares the key for this instance with another EspEtudiantSeminaire.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspEtudiantSeminaire and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspEtudiantSeminaire)) {
            return false;
        }
        EspEtudiantSeminaire that = (EspEtudiantSeminaire) other;
        Object mySeminaireIdseminaire = this.getSeminaireIdseminaire();
        Object yourSeminaireIdseminaire = that.getSeminaireIdseminaire();
        if (mySeminaireIdseminaire==null ? yourSeminaireIdseminaire!=null : !mySeminaireIdseminaire.equals(yourSeminaireIdseminaire)) {
            return false;
        }
        Object myEspEtudiantIdEt = this.getEspEtudiantIdEt();
        Object yourEspEtudiantIdEt = that.getEspEtudiantIdEt();
        if (myEspEtudiantIdEt==null ? yourEspEtudiantIdEt!=null : !myEspEtudiantIdEt.equals(yourEspEtudiantIdEt)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspEtudiantSeminaire.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspEtudiantSeminaire)) return false;
        return this.equalKeys(other) && ((EspEtudiantSeminaire)other).equalKeys(this);
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
        if (getSeminaireIdseminaire() == null) {
            i = 0;
        } else {
            i = getSeminaireIdseminaire().hashCode();
        }
        result = 37*result + i;
        if (getEspEtudiantIdEt() == null) {
            i = 0;
        } else {
            i = getEspEtudiantIdEt().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspEtudiantSeminaire |");
        sb.append(" seminaireIdseminaire=").append(getSeminaireIdseminaire());
        sb.append(" espEtudiantIdEt=").append(getEspEtudiantIdEt());
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
        ret.put("seminaireIdseminaire", getSeminaireIdseminaire());
        ret.put("espEtudiantIdEt", getEspEtudiantIdEt());
        return ret;
    }

}
