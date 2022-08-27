// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ESP_RUBRIQUE")
public class EspRubrique implements Serializable {

    /** Primary key. */
    protected static final String PK = "codeRub";

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
    @Column(name="CODE_RUB", unique=true, nullable=false, length=2)
    private String codeRub;
    @Column(name="LIBELLE", length=50)
    private String libelle;
    @Column(name="SIGNE", length=1)
    private String signe;
    @Column(name="TAUX", precision=5, scale=2)
    private BigDecimal taux;
    @Column(name="VALEUR", precision=10, scale=3)
    private BigDecimal valeur;
    @OneToMany(mappedBy="espRubrique")
    private Set<EspAssRubEtIns> espAssRubEtIns;

    /** Default constructor. */
    public EspRubrique() {
        super();
    }

    /**
     * Access method for codeRub.
     *
     * @return the current value of codeRub
     */
    public String getCodeRub() {
        return codeRub;
    }

    /**
     * Setter method for codeRub.
     *
     * @param aCodeRub the new value for codeRub
     */
    public void setCodeRub(String aCodeRub) {
        codeRub = aCodeRub;
    }

    /**
     * Access method for libelle.
     *
     * @return the current value of libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Setter method for libelle.
     *
     * @param aLibelle the new value for libelle
     */
    public void setLibelle(String aLibelle) {
        libelle = aLibelle;
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
     * Access method for taux.
     *
     * @return the current value of taux
     */
    public BigDecimal getTaux() {
        return taux;
    }

    /**
     * Setter method for taux.
     *
     * @param aTaux the new value for taux
     */
    public void setTaux(BigDecimal aTaux) {
        taux = aTaux;
    }

    /**
     * Access method for valeur.
     *
     * @return the current value of valeur
     */
    public BigDecimal getValeur() {
        return valeur;
    }

    /**
     * Setter method for valeur.
     *
     * @param aValeur the new value for valeur
     */
    public void setValeur(BigDecimal aValeur) {
        valeur = aValeur;
    }

    /**
     * Access method for espAssRubEtIns.
     *
     * @return the current value of espAssRubEtIns
     */
    public Set<EspAssRubEtIns> getEspAssRubEtIns() {
        return espAssRubEtIns;
    }

    /**
     * Setter method for espAssRubEtIns.
     *
     * @param aEspAssRubEtIns the new value for espAssRubEtIns
     */
    public void setEspAssRubEtIns(Set<EspAssRubEtIns> aEspAssRubEtIns) {
        espAssRubEtIns = aEspAssRubEtIns;
    }

    /**
     * Compares the key for this instance with another EspRubrique.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspRubrique and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspRubrique)) {
            return false;
        }
        EspRubrique that = (EspRubrique) other;
        Object myCodeRub = this.getCodeRub();
        Object yourCodeRub = that.getCodeRub();
        if (myCodeRub==null ? yourCodeRub!=null : !myCodeRub.equals(yourCodeRub)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspRubrique.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspRubrique)) return false;
        return this.equalKeys(other) && ((EspRubrique)other).equalKeys(this);
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
        if (getCodeRub() == null) {
            i = 0;
        } else {
            i = getCodeRub().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspRubrique |");
        sb.append(" codeRub=").append(getCodeRub());
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
        ret.put("codeRub", getCodeRub());
        return ret;
    }

}
