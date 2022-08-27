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
import javax.persistence.Version;

@Entity(name="TYPE_MVT")
public class TypeMvt implements Serializable {

    /** Primary key. */
    protected static final String PK = "typeMvt";

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
    @Column(name="TYPE_MVT", unique=true, nullable=false, length=2)
    private String typeMvt;
    @Column(name="LIBELLE_TYPE", length=20)
    private String libelleType;
    @Column(name="DATE_LAST_MVT")
    private LocalDateTime dateLastMvt;
    @Column(name="COMPTEUR_AUTO", length=1)
    private String compteurAuto;
    @Column(name="NUM_AUTO", precision=10)
    private BigDecimal numAuto;
    @Column(name="TAILLE_COMPTEUR", precision=2)
    private BigDecimal tailleCompteur;
    @Column(name="CODE_PRIX", precision=2)
    private BigDecimal codePrix;
    @Column(name="DESIGNATION", length=40)
    private String designation;
    @Column(name="SIGNE", length=1)
    private String signe;

    /** Default constructor. */
    public TypeMvt() {
        super();
    }

    /**
     * Access method for typeMvt.
     *
     * @return the current value of typeMvt
     */
    public String getTypeMvt() {
        return typeMvt;
    }

    /**
     * Setter method for typeMvt.
     *
     * @param aTypeMvt the new value for typeMvt
     */
    public void setTypeMvt(String aTypeMvt) {
        typeMvt = aTypeMvt;
    }

    /**
     * Access method for libelleType.
     *
     * @return the current value of libelleType
     */
    public String getLibelleType() {
        return libelleType;
    }

    /**
     * Setter method for libelleType.
     *
     * @param aLibelleType the new value for libelleType
     */
    public void setLibelleType(String aLibelleType) {
        libelleType = aLibelleType;
    }

    /**
     * Access method for dateLastMvt.
     *
     * @return the current value of dateLastMvt
     */
    public LocalDateTime getDateLastMvt() {
        return dateLastMvt;
    }

    /**
     * Setter method for dateLastMvt.
     *
     * @param aDateLastMvt the new value for dateLastMvt
     */
    public void setDateLastMvt(LocalDateTime aDateLastMvt) {
        dateLastMvt = aDateLastMvt;
    }

    /**
     * Access method for compteurAuto.
     *
     * @return the current value of compteurAuto
     */
    public String getCompteurAuto() {
        return compteurAuto;
    }

    /**
     * Setter method for compteurAuto.
     *
     * @param aCompteurAuto the new value for compteurAuto
     */
    public void setCompteurAuto(String aCompteurAuto) {
        compteurAuto = aCompteurAuto;
    }

    /**
     * Access method for numAuto.
     *
     * @return the current value of numAuto
     */
    public BigDecimal getNumAuto() {
        return numAuto;
    }

    /**
     * Setter method for numAuto.
     *
     * @param aNumAuto the new value for numAuto
     */
    public void setNumAuto(BigDecimal aNumAuto) {
        numAuto = aNumAuto;
    }

    /**
     * Access method for tailleCompteur.
     *
     * @return the current value of tailleCompteur
     */
    public BigDecimal getTailleCompteur() {
        return tailleCompteur;
    }

    /**
     * Setter method for tailleCompteur.
     *
     * @param aTailleCompteur the new value for tailleCompteur
     */
    public void setTailleCompteur(BigDecimal aTailleCompteur) {
        tailleCompteur = aTailleCompteur;
    }

    /**
     * Access method for codePrix.
     *
     * @return the current value of codePrix
     */
    public BigDecimal getCodePrix() {
        return codePrix;
    }

    /**
     * Setter method for codePrix.
     *
     * @param aCodePrix the new value for codePrix
     */
    public void setCodePrix(BigDecimal aCodePrix) {
        codePrix = aCodePrix;
    }

    /**
     * Access method for designation.
     *
     * @return the current value of designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Setter method for designation.
     *
     * @param aDesignation the new value for designation
     */
    public void setDesignation(String aDesignation) {
        designation = aDesignation;
    }

    /**
     * Access method for signe.
     *
     * @return the current value of signe
     */
    public String getSigne() {
        return signe;
    }

    /**
     * Setter method for signe.
     *
     * @param aSigne the new value for signe
     */
    public void setSigne(String aSigne) {
        signe = aSigne;
    }

    /**
     * Compares the key for this instance with another TypeMvt.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TypeMvt and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TypeMvt)) {
            return false;
        }
        TypeMvt that = (TypeMvt) other;
        Object myTypeMvt = this.getTypeMvt();
        Object yourTypeMvt = that.getTypeMvt();
        if (myTypeMvt==null ? yourTypeMvt!=null : !myTypeMvt.equals(yourTypeMvt)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TypeMvt.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TypeMvt)) return false;
        return this.equalKeys(other) && ((TypeMvt)other).equalKeys(this);
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
        if (getTypeMvt() == null) {
            i = 0;
        } else {
            i = getTypeMvt().hashCode();
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
        StringBuffer sb = new StringBuffer("[TypeMvt |");
        sb.append(" typeMvt=").append(getTypeMvt());
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
        ret.put("typeMvt", getTypeMvt());
        return ret;
    }

}
