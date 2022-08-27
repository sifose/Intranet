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

@Entity(name="ESP_SCORE_SPECIALITE")
@IdClass(EspScoreSpecialite.EspScoreSpecialiteId.class)
public class EspScoreSpecialite implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspScoreSpecialiteId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String codeSpec;
        java.math.BigDecimal niveauAcces;
    }

    /** Primary key. */
    protected static final String PK = "EspScoreSpecialitePkScoreSpec";

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
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Id
    @Column(name="CODE_SPEC", nullable=false, length=2)
    private String codeSpec;
    @Id
    @Column(name="NIVEAU_ACCES", nullable=false, precision=1)
    private BigDecimal niveauAcces;
    @Column(name="CAPACITE_ACCUEUIL", precision=4)
    private BigDecimal capaciteAccueuil;
    @Column(name="SCORE_MIN", precision=10, scale=3)
    private BigDecimal scoreMin;

    /** Default constructor. */
    public EspScoreSpecialite() {
        super();
    }

    /**
     * Access method for anneeDeb.
     *
     * @return the current value of anneeDeb
     */
    public String getAnneeDeb() {
        return anneeDeb;
    }

    /**
     * Setter method for anneeDeb.
     *
     * @param aAnneeDeb the new value for anneeDeb
     */
    public void setAnneeDeb(String aAnneeDeb) {
        anneeDeb = aAnneeDeb;
    }

    /**
     * Access method for codeSpec.
     *
     * @return the current value of codeSpec
     */
    public String getCodeSpec() {
        return codeSpec;
    }

    /**
     * Setter method for codeSpec.
     *
     * @param aCodeSpec the new value for codeSpec
     */
    public void setCodeSpec(String aCodeSpec) {
        codeSpec = aCodeSpec;
    }

    /**
     * Access method for niveauAcces.
     *
     * @return the current value of niveauAcces
     */
    public BigDecimal getNiveauAcces() {
        return niveauAcces;
    }

    /**
     * Setter method for niveauAcces.
     *
     * @param aNiveauAcces the new value for niveauAcces
     */
    public void setNiveauAcces(BigDecimal aNiveauAcces) {
        niveauAcces = aNiveauAcces;
    }

    /**
     * Access method for capaciteAccueuil.
     *
     * @return the current value of capaciteAccueuil
     */
    public BigDecimal getCapaciteAccueuil() {
        return capaciteAccueuil;
    }

    /**
     * Setter method for capaciteAccueuil.
     *
     * @param aCapaciteAccueuil the new value for capaciteAccueuil
     */
    public void setCapaciteAccueuil(BigDecimal aCapaciteAccueuil) {
        capaciteAccueuil = aCapaciteAccueuil;
    }

    /**
     * Access method for scoreMin.
     *
     * @return the current value of scoreMin
     */
    public BigDecimal getScoreMin() {
        return scoreMin;
    }

    /**
     * Setter method for scoreMin.
     *
     * @param aScoreMin the new value for scoreMin
     */
    public void setScoreMin(BigDecimal aScoreMin) {
        scoreMin = aScoreMin;
    }

    /**
     * Compares the key for this instance with another EspScoreSpecialite.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspScoreSpecialite and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspScoreSpecialite)) {
            return false;
        }
        EspScoreSpecialite that = (EspScoreSpecialite) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myCodeSpec = this.getCodeSpec();
        Object yourCodeSpec = that.getCodeSpec();
        if (myCodeSpec==null ? yourCodeSpec!=null : !myCodeSpec.equals(yourCodeSpec)) {
            return false;
        }
        Object myNiveauAcces = this.getNiveauAcces();
        Object yourNiveauAcces = that.getNiveauAcces();
        if (myNiveauAcces==null ? yourNiveauAcces!=null : !myNiveauAcces.equals(yourNiveauAcces)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspScoreSpecialite.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspScoreSpecialite)) return false;
        return this.equalKeys(other) && ((EspScoreSpecialite)other).equalKeys(this);
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
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getCodeSpec() == null) {
            i = 0;
        } else {
            i = getCodeSpec().hashCode();
        }
        result = 37*result + i;
        if (getNiveauAcces() == null) {
            i = 0;
        } else {
            i = getNiveauAcces().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspScoreSpecialite |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" codeSpec=").append(getCodeSpec());
        sb.append(" niveauAcces=").append(getNiveauAcces());
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
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("codeSpec", getCodeSpec());
        ret.put("niveauAcces", getNiveauAcces());
        return ret;
    }

}
