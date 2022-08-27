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
import javax.persistence.Version;

@Entity(name="ESP_REALISE")
@IdClass(EspRealise.EspRealiseId.class)
public class EspRealise implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspRealiseId implements Serializable {
        java.lang.String idDr;
        java.lang.String titre;
    }

    /** Primary key. */
    protected static final String PK = "EspRealisePkRealise";

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
    @Column(name="ID_DR", nullable=false, length=20)
    private String idDr;
    @Id
    @Column(name="TITRE", nullable=false, length=500)
    private String titre;
    @Column(name="NB_JOURS", nullable=false)
    private BigDecimal nbJours;
    @Column(name="RESULTAT", nullable=false, length=500)
    private String resultat;
    @Column(name="NOM_DR", nullable=false, length=20)
    private String nomDr;

    /** Default constructor. */
    public EspRealise() {
        super();
    }

    /**
     * Access method for idDr.
     *
     * @return the current value of idDr
     */
    public String getIdDr() {
        return idDr;
    }

    /**
     * Setter method for idDr.
     *
     * @param aIdDr the new value for idDr
     */
    public void setIdDr(String aIdDr) {
        idDr = aIdDr;
    }

    /**
     * Access method for titre.
     *
     * @return the current value of titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Setter method for titre.
     *
     * @param aTitre the new value for titre
     */
    public void setTitre(String aTitre) {
        titre = aTitre;
    }

    /**
     * Access method for nbJours.
     *
     * @return the current value of nbJours
     */
    public BigDecimal getNbJours() {
        return nbJours;
    }

    /**
     * Setter method for nbJours.
     *
     * @param aNbJours the new value for nbJours
     */
    public void setNbJours(BigDecimal aNbJours) {
        nbJours = aNbJours;
    }

    /**
     * Access method for resultat.
     *
     * @return the current value of resultat
     */
    public String getResultat() {
        return resultat;
    }

    /**
     * Setter method for resultat.
     *
     * @param aResultat the new value for resultat
     */
    public void setResultat(String aResultat) {
        resultat = aResultat;
    }

    /**
     * Access method for nomDr.
     *
     * @return the current value of nomDr
     */
    public String getNomDr() {
        return nomDr;
    }

    /**
     * Setter method for nomDr.
     *
     * @param aNomDr the new value for nomDr
     */
    public void setNomDr(String aNomDr) {
        nomDr = aNomDr;
    }

    /**
     * Compares the key for this instance with another EspRealise.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspRealise and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspRealise)) {
            return false;
        }
        EspRealise that = (EspRealise) other;
        Object myIdDr = this.getIdDr();
        Object yourIdDr = that.getIdDr();
        if (myIdDr==null ? yourIdDr!=null : !myIdDr.equals(yourIdDr)) {
            return false;
        }
        Object myTitre = this.getTitre();
        Object yourTitre = that.getTitre();
        if (myTitre==null ? yourTitre!=null : !myTitre.equals(yourTitre)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspRealise.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspRealise)) return false;
        return this.equalKeys(other) && ((EspRealise)other).equalKeys(this);
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
        if (getIdDr() == null) {
            i = 0;
        } else {
            i = getIdDr().hashCode();
        }
        result = 37*result + i;
        if (getTitre() == null) {
            i = 0;
        } else {
            i = getTitre().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspRealise |");
        sb.append(" idDr=").append(getIdDr());
        sb.append(" titre=").append(getTitre());
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
        ret.put("idDr", getIdDr());
        ret.put("titre", getTitre());
        return ret;
    }

}
