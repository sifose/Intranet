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
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="ESP_BILAN_PREPA")
@IdClass(EspBilanPrepa.EspBilanPrepaId.class)
public class EspBilanPrepa implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspBilanPrepaId implements Serializable {
        java.lang.String idEt;
        java.lang.String codeCl;
        java.lang.String codeModule;
        java.lang.String anneeDeb;
    }

    /** Primary key. */
    protected static final String PK = "EspBilanPrepaEspBilanPrepaPk";

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

    @Column(name="BILAN_Q1")
    private BigDecimal bilanQ1;
    @Id
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="DATE_MISE_JOUR")
    private LocalDateTime dateMiseJour;
    @Id
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Id
    @Column(name="CODE_MODULE", nullable=false, length=10)
    private String codeModule;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="BILAN_Q2")
    private BigDecimal bilanQ2;
    @Column(name="BILAN_Q3")
    private BigDecimal bilanQ3;
    @Column(name="BILAN_Q4")
    private BigDecimal bilanQ4;
    @Column(name="BILAN_Q5")
    private BigDecimal bilanQ5;
    @Column(name="BILAN_Q6")
    private BigDecimal bilanQ6;
    @Column(name="BILAN_Q7")
    private BigDecimal bilanQ7;
    @Column(name="BILAN_Q8")
    private BigDecimal bilanQ8;
    @Column(name="BILAN_Q9")
    private BigDecimal bilanQ9;
    @Column(name="BILAN_Q10")
    private BigDecimal bilanQ10;

    /** Default constructor. */
    public EspBilanPrepa() {
        super();
    }

    /**
     * Access method for bilanQ1.
     *
     * @return the current value of bilanQ1
     */
    public BigDecimal getBilanQ1() {
        return bilanQ1;
    }

    /**
     * Setter method for bilanQ1.
     *
     * @param aBilanQ1 the new value for bilanQ1
     */
    public void setBilanQ1(BigDecimal aBilanQ1) {
        bilanQ1 = aBilanQ1;
    }

    /**
     * Access method for idEt.
     *
     * @return the current value of idEt
     */
    public String getIdEt() {
        return idEt;
    }

    /**
     * Setter method for idEt.
     *
     * @param aIdEt the new value for idEt
     */
    public void setIdEt(String aIdEt) {
        idEt = aIdEt;
    }

    /**
     * Access method for dateSaisie.
     *
     * @return the current value of dateSaisie
     */
    public LocalDateTime getDateSaisie() {
        return dateSaisie;
    }

    /**
     * Setter method for dateSaisie.
     *
     * @param aDateSaisie the new value for dateSaisie
     */
    public void setDateSaisie(LocalDateTime aDateSaisie) {
        dateSaisie = aDateSaisie;
    }

    /**
     * Access method for dateMiseJour.
     *
     * @return the current value of dateMiseJour
     */
    public LocalDateTime getDateMiseJour() {
        return dateMiseJour;
    }

    /**
     * Setter method for dateMiseJour.
     *
     * @param aDateMiseJour the new value for dateMiseJour
     */
    public void setDateMiseJour(LocalDateTime aDateMiseJour) {
        dateMiseJour = aDateMiseJour;
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
     * Access method for bilanQ2.
     *
     * @return the current value of bilanQ2
     */
    public BigDecimal getBilanQ2() {
        return bilanQ2;
    }

    /**
     * Setter method for bilanQ2.
     *
     * @param aBilanQ2 the new value for bilanQ2
     */
    public void setBilanQ2(BigDecimal aBilanQ2) {
        bilanQ2 = aBilanQ2;
    }

    /**
     * Access method for bilanQ3.
     *
     * @return the current value of bilanQ3
     */
    public BigDecimal getBilanQ3() {
        return bilanQ3;
    }

    /**
     * Setter method for bilanQ3.
     *
     * @param aBilanQ3 the new value for bilanQ3
     */
    public void setBilanQ3(BigDecimal aBilanQ3) {
        bilanQ3 = aBilanQ3;
    }

    /**
     * Access method for bilanQ4.
     *
     * @return the current value of bilanQ4
     */
    public BigDecimal getBilanQ4() {
        return bilanQ4;
    }

    /**
     * Setter method for bilanQ4.
     *
     * @param aBilanQ4 the new value for bilanQ4
     */
    public void setBilanQ4(BigDecimal aBilanQ4) {
        bilanQ4 = aBilanQ4;
    }

    /**
     * Access method for bilanQ5.
     *
     * @return the current value of bilanQ5
     */
    public BigDecimal getBilanQ5() {
        return bilanQ5;
    }

    /**
     * Setter method for bilanQ5.
     *
     * @param aBilanQ5 the new value for bilanQ5
     */
    public void setBilanQ5(BigDecimal aBilanQ5) {
        bilanQ5 = aBilanQ5;
    }

    /**
     * Access method for bilanQ6.
     *
     * @return the current value of bilanQ6
     */
    public BigDecimal getBilanQ6() {
        return bilanQ6;
    }

    /**
     * Setter method for bilanQ6.
     *
     * @param aBilanQ6 the new value for bilanQ6
     */
    public void setBilanQ6(BigDecimal aBilanQ6) {
        bilanQ6 = aBilanQ6;
    }

    /**
     * Access method for bilanQ7.
     *
     * @return the current value of bilanQ7
     */
    public BigDecimal getBilanQ7() {
        return bilanQ7;
    }

    /**
     * Setter method for bilanQ7.
     *
     * @param aBilanQ7 the new value for bilanQ7
     */
    public void setBilanQ7(BigDecimal aBilanQ7) {
        bilanQ7 = aBilanQ7;
    }

    /**
     * Access method for bilanQ8.
     *
     * @return the current value of bilanQ8
     */
    public BigDecimal getBilanQ8() {
        return bilanQ8;
    }

    /**
     * Setter method for bilanQ8.
     *
     * @param aBilanQ8 the new value for bilanQ8
     */
    public void setBilanQ8(BigDecimal aBilanQ8) {
        bilanQ8 = aBilanQ8;
    }

    /**
     * Access method for bilanQ9.
     *
     * @return the current value of bilanQ9
     */
    public BigDecimal getBilanQ9() {
        return bilanQ9;
    }

    /**
     * Setter method for bilanQ9.
     *
     * @param aBilanQ9 the new value for bilanQ9
     */
    public void setBilanQ9(BigDecimal aBilanQ9) {
        bilanQ9 = aBilanQ9;
    }

    /**
     * Access method for bilanQ10.
     *
     * @return the current value of bilanQ10
     */
    public BigDecimal getBilanQ10() {
        return bilanQ10;
    }

    /**
     * Setter method for bilanQ10.
     *
     * @param aBilanQ10 the new value for bilanQ10
     */
    public void setBilanQ10(BigDecimal aBilanQ10) {
        bilanQ10 = aBilanQ10;
    }

    /**
     * Compares the key for this instance with another EspBilanPrepa.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspBilanPrepa and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspBilanPrepa)) {
            return false;
        }
        EspBilanPrepa that = (EspBilanPrepa) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
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
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspBilanPrepa.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspBilanPrepa)) return false;
        return this.equalKeys(other) && ((EspBilanPrepa)other).equalKeys(this);
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
        if (getIdEt() == null) {
            i = 0;
        } else {
            i = getIdEt().hashCode();
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
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspBilanPrepa |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" codeModule=").append(getCodeModule());
        sb.append(" anneeDeb=").append(getAnneeDeb());
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
        ret.put("idEt", getIdEt());
        ret.put("codeCl", getCodeCl());
        ret.put("codeModule", getCodeModule());
        ret.put("anneeDeb", getAnneeDeb());
        return ret;
    }

}
