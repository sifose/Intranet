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

@Entity(name="ESP_EVAL_CL_MODULE")
@IdClass(EspEvalClModule.EspEvalClModuleId.class)
public class EspEvalClModule implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspEvalClModuleId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String codeCl;
        java.lang.String codeModule;
        java.lang.String codeCritere;
    }

    /** Primary key. */
    protected static final String PK = "EspEvalClModulePkEvalCl";

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
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Id
    @Column(name="CODE_MODULE", nullable=false, length=10)
    private String codeModule;
    @Id
    @Column(name="CODE_CRITERE", nullable=false, length=10)
    private String codeCritere;
    @Column(name="NB_PALIER1", precision=4)
    private BigDecimal nbPalier1;
    @Column(name="NB_PALIER2", precision=4)
    private BigDecimal nbPalier2;
    @Column(name="NB_PALIER3", precision=4)
    private BigDecimal nbPalier3;
    @Column(name="NB_PALIER4", precision=4)
    private BigDecimal nbPalier4;
    @Column(name="NB_PALIER5", precision=4)
    private BigDecimal nbPalier5;
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="ID_ENS2", length=10)
    private String idEns2;
    @Column(name="NUM_SEMESTRE", precision=1)
    private BigDecimal numSemestre;

    /** Default constructor. */
    public EspEvalClModule() {
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
     * Access method for codeCl.
     *
     * @return the current value of codeCl
     */
    public String getCodeCl() {
        return codeCl;
    }

    /**
     * Setter method for codeCl.
     *
     * @param aCodeCl the new value for codeCl
     */
    public void setCodeCl(String aCodeCl) {
        codeCl = aCodeCl;
    }

    /**
     * Access method for codeModule.
     *
     * @return the current value of codeModule
     */
    public String getCodeModule() {
        return codeModule;
    }

    /**
     * Setter method for codeModule.
     *
     * @param aCodeModule the new value for codeModule
     */
    public void setCodeModule(String aCodeModule) {
        codeModule = aCodeModule;
    }

    /**
     * Access method for codeCritere.
     *
     * @return the current value of codeCritere
     */
    public String getCodeCritere() {
        return codeCritere;
    }

    /**
     * Setter method for codeCritere.
     *
     * @param aCodeCritere the new value for codeCritere
     */
    public void setCodeCritere(String aCodeCritere) {
        codeCritere = aCodeCritere;
    }

    /**
     * Access method for nbPalier1.
     *
     * @return the current value of nbPalier1
     */
    public BigDecimal getNbPalier1() {
        return nbPalier1;
    }

    /**
     * Setter method for nbPalier1.
     *
     * @param aNbPalier1 the new value for nbPalier1
     */
    public void setNbPalier1(BigDecimal aNbPalier1) {
        nbPalier1 = aNbPalier1;
    }

    /**
     * Access method for nbPalier2.
     *
     * @return the current value of nbPalier2
     */
    public BigDecimal getNbPalier2() {
        return nbPalier2;
    }

    /**
     * Setter method for nbPalier2.
     *
     * @param aNbPalier2 the new value for nbPalier2
     */
    public void setNbPalier2(BigDecimal aNbPalier2) {
        nbPalier2 = aNbPalier2;
    }

    /**
     * Access method for nbPalier3.
     *
     * @return the current value of nbPalier3
     */
    public BigDecimal getNbPalier3() {
        return nbPalier3;
    }

    /**
     * Setter method for nbPalier3.
     *
     * @param aNbPalier3 the new value for nbPalier3
     */
    public void setNbPalier3(BigDecimal aNbPalier3) {
        nbPalier3 = aNbPalier3;
    }

    /**
     * Access method for nbPalier4.
     *
     * @return the current value of nbPalier4
     */
    public BigDecimal getNbPalier4() {
        return nbPalier4;
    }

    /**
     * Setter method for nbPalier4.
     *
     * @param aNbPalier4 the new value for nbPalier4
     */
    public void setNbPalier4(BigDecimal aNbPalier4) {
        nbPalier4 = aNbPalier4;
    }

    /**
     * Access method for nbPalier5.
     *
     * @return the current value of nbPalier5
     */
    public BigDecimal getNbPalier5() {
        return nbPalier5;
    }

    /**
     * Setter method for nbPalier5.
     *
     * @param aNbPalier5 the new value for nbPalier5
     */
    public void setNbPalier5(BigDecimal aNbPalier5) {
        nbPalier5 = aNbPalier5;
    }

    /**
     * Access method for idEns.
     *
     * @return the current value of idEns
     */
    public String getIdEns() {
        return idEns;
    }

    /**
     * Setter method for idEns.
     *
     * @param aIdEns the new value for idEns
     */
    public void setIdEns(String aIdEns) {
        idEns = aIdEns;
    }

    /**
     * Access method for idEns2.
     *
     * @return the current value of idEns2
     */
    public String getIdEns2() {
        return idEns2;
    }

    /**
     * Setter method for idEns2.
     *
     * @param aIdEns2 the new value for idEns2
     */
    public void setIdEns2(String aIdEns2) {
        idEns2 = aIdEns2;
    }

    /**
     * Access method for numSemestre.
     *
     * @return the current value of numSemestre
     */
    public BigDecimal getNumSemestre() {
        return numSemestre;
    }

    /**
     * Setter method for numSemestre.
     *
     * @param aNumSemestre the new value for numSemestre
     */
    public void setNumSemestre(BigDecimal aNumSemestre) {
        numSemestre = aNumSemestre;
    }

    /**
     * Compares the key for this instance with another EspEvalClModule.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspEvalClModule and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspEvalClModule)) {
            return false;
        }
        EspEvalClModule that = (EspEvalClModule) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        Object myCodeModule = this.getCodeModule();
        Object yourCodeModule = that.getCodeModule();
        if (myCodeModule==null ? yourCodeModule!=null : !myCodeModule.equals(yourCodeModule)) {
            return false;
        }
        Object myCodeCritere = this.getCodeCritere();
        Object yourCodeCritere = that.getCodeCritere();
        if (myCodeCritere==null ? yourCodeCritere!=null : !myCodeCritere.equals(yourCodeCritere)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspEvalClModule.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspEvalClModule)) return false;
        return this.equalKeys(other) && ((EspEvalClModule)other).equalKeys(this);
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
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getCodeModule() == null) {
            i = 0;
        } else {
            i = getCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getCodeCritere() == null) {
            i = 0;
        } else {
            i = getCodeCritere().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspEvalClModule |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" codeModule=").append(getCodeModule());
        sb.append(" codeCritere=").append(getCodeCritere());
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
        ret.put("codeCl", getCodeCl());
        ret.put("codeModule", getCodeModule());
        ret.put("codeCritere", getCodeCritere());
        return ret;
    }

}
