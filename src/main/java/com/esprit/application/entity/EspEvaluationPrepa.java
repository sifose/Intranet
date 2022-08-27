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

@Entity(name="ESP_EVALUATION_PREPA")
@IdClass(EspEvaluationPrepa.EspEvaluationPrepaId.class)
public class EspEvaluationPrepa implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspEvaluationPrepaId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String codeCl;
        java.lang.String codeModule;
        java.lang.String idEt;
    }

    /** Primary key. */
    protected static final String PK = "EspEvaluationPrepaEspEvaluationPrepaPk";

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
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Column(name="A_Q1", length=1)
    private String aQ1;
    @Column(name="A_Q2", length=1)
    private String aQ2;
    @Column(name="A_Q3", length=1000)
    private String aQ3;
    @Column(name="B_Q1", length=1)
    private String bQ1;
    @Column(name="B_Q2", length=1)
    private String bQ2;
    @Column(name="B_Q3", length=1)
    private String bQ3;
    @Column(name="B_Q4", length=1)
    private String bQ4;
    @Column(name="B_Q51", length=1000)
    private String bQ51;
    @Column(name="B_Q6", length=1000)
    private String bQ6;
    @Column(name="B_Q7", length=1000)
    private String bQ7;
    @Column(name="B_Q8", length=1000)
    private String bQ8;
    @Column(name="C_Q1", length=1)
    private String cQ1;
    @Column(name="C_Q2")
    private BigDecimal cQ2;
    @Column(name="C_Q3")
    private BigDecimal cQ3;
    @Column(name="C_Q4")
    private BigDecimal cQ4;
    @Column(name="C_Q5", length=1000)
    private String cQ5;
    @Column(name="D_Q1", length=1)
    private String dQ1;
    @Column(name="D_Q2", length=1000)
    private String dQ2;
    @Column(name="DATE_MISE_JOUR")
    private LocalDateTime dateMiseJour;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="E_Q1", length=1)
    private String eQ1;
    @Column(name="E_Q21", length=1000)
    private String eQ21;
    @Column(name="E_Q22", length=1000)
    private String eQ22;
    @Column(name="F_Q1", length=1000)
    private String fQ1;
    @Column(name="G_Q1", length=1000)
    private String gQ1;
    @Column(name="H_Q1", length=1000)
    private String hQ1;
    @Column(name="B_Q5", length=1)
    private String bQ5;

    /** Default constructor. */
    public EspEvaluationPrepa() {
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
     * Access method for aQ1.
     *
     * @return the current value of aQ1
     */
    public String getAQ1() {
        return aQ1;
    }

    /**
     * Setter method for aQ1.
     *
     * @param aAQ1 the new value for aQ1
     */
    public void setAQ1(String aAQ1) {
        aQ1 = aAQ1;
    }

    /**
     * Access method for aQ2.
     *
     * @return the current value of aQ2
     */
    public String getAQ2() {
        return aQ2;
    }

    /**
     * Setter method for aQ2.
     *
     * @param aAQ2 the new value for aQ2
     */
    public void setAQ2(String aAQ2) {
        aQ2 = aAQ2;
    }

    /**
     * Access method for aQ3.
     *
     * @return the current value of aQ3
     */
    public String getAQ3() {
        return aQ3;
    }

    /**
     * Setter method for aQ3.
     *
     * @param aAQ3 the new value for aQ3
     */
    public void setAQ3(String aAQ3) {
        aQ3 = aAQ3;
    }

    /**
     * Access method for bQ1.
     *
     * @return the current value of bQ1
     */
    public String getBQ1() {
        return bQ1;
    }

    /**
     * Setter method for bQ1.
     *
     * @param aBQ1 the new value for bQ1
     */
    public void setBQ1(String aBQ1) {
        bQ1 = aBQ1;
    }

    /**
     * Access method for bQ2.
     *
     * @return the current value of bQ2
     */
    public String getBQ2() {
        return bQ2;
    }

    /**
     * Setter method for bQ2.
     *
     * @param aBQ2 the new value for bQ2
     */
    public void setBQ2(String aBQ2) {
        bQ2 = aBQ2;
    }

    /**
     * Access method for bQ3.
     *
     * @return the current value of bQ3
     */
    public String getBQ3() {
        return bQ3;
    }

    /**
     * Setter method for bQ3.
     *
     * @param aBQ3 the new value for bQ3
     */
    public void setBQ3(String aBQ3) {
        bQ3 = aBQ3;
    }

    /**
     * Access method for bQ4.
     *
     * @return the current value of bQ4
     */
    public String getBQ4() {
        return bQ4;
    }

    /**
     * Setter method for bQ4.
     *
     * @param aBQ4 the new value for bQ4
     */
    public void setBQ4(String aBQ4) {
        bQ4 = aBQ4;
    }

    /**
     * Access method for bQ51.
     *
     * @return the current value of bQ51
     */
    public String getBQ51() {
        return bQ51;
    }

    /**
     * Setter method for bQ51.
     *
     * @param aBQ51 the new value for bQ51
     */
    public void setBQ51(String aBQ51) {
        bQ51 = aBQ51;
    }

    /**
     * Access method for bQ6.
     *
     * @return the current value of bQ6
     */
    public String getBQ6() {
        return bQ6;
    }

    /**
     * Setter method for bQ6.
     *
     * @param aBQ6 the new value for bQ6
     */
    public void setBQ6(String aBQ6) {
        bQ6 = aBQ6;
    }

    /**
     * Access method for bQ7.
     *
     * @return the current value of bQ7
     */
    public String getBQ7() {
        return bQ7;
    }

    /**
     * Setter method for bQ7.
     *
     * @param aBQ7 the new value for bQ7
     */
    public void setBQ7(String aBQ7) {
        bQ7 = aBQ7;
    }

    /**
     * Access method for bQ8.
     *
     * @return the current value of bQ8
     */
    public String getBQ8() {
        return bQ8;
    }

    /**
     * Setter method for bQ8.
     *
     * @param aBQ8 the new value for bQ8
     */
    public void setBQ8(String aBQ8) {
        bQ8 = aBQ8;
    }

    /**
     * Access method for cQ1.
     *
     * @return the current value of cQ1
     */
    public String getCQ1() {
        return cQ1;
    }

    /**
     * Setter method for cQ1.
     *
     * @param aCQ1 the new value for cQ1
     */
    public void setCQ1(String aCQ1) {
        cQ1 = aCQ1;
    }

    /**
     * Access method for cQ2.
     *
     * @return the current value of cQ2
     */
    public BigDecimal getCQ2() {
        return cQ2;
    }

    /**
     * Setter method for cQ2.
     *
     * @param aCQ2 the new value for cQ2
     */
    public void setCQ2(BigDecimal aCQ2) {
        cQ2 = aCQ2;
    }

    /**
     * Access method for cQ3.
     *
     * @return the current value of cQ3
     */
    public BigDecimal getCQ3() {
        return cQ3;
    }

    /**
     * Setter method for cQ3.
     *
     * @param aCQ3 the new value for cQ3
     */
    public void setCQ3(BigDecimal aCQ3) {
        cQ3 = aCQ3;
    }

    /**
     * Access method for cQ4.
     *
     * @return the current value of cQ4
     */
    public BigDecimal getCQ4() {
        return cQ4;
    }

    /**
     * Setter method for cQ4.
     *
     * @param aCQ4 the new value for cQ4
     */
    public void setCQ4(BigDecimal aCQ4) {
        cQ4 = aCQ4;
    }

    /**
     * Access method for cQ5.
     *
     * @return the current value of cQ5
     */
    public String getCQ5() {
        return cQ5;
    }

    /**
     * Setter method for cQ5.
     *
     * @param aCQ5 the new value for cQ5
     */
    public void setCQ5(String aCQ5) {
        cQ5 = aCQ5;
    }

    /**
     * Access method for dQ1.
     *
     * @return the current value of dQ1
     */
    public String getDQ1() {
        return dQ1;
    }

    /**
     * Setter method for dQ1.
     *
     * @param aDQ1 the new value for dQ1
     */
    public void setDQ1(String aDQ1) {
        dQ1 = aDQ1;
    }

    /**
     * Access method for dQ2.
     *
     * @return the current value of dQ2
     */
    public String getDQ2() {
        return dQ2;
    }

    /**
     * Setter method for dQ2.
     *
     * @param aDQ2 the new value for dQ2
     */
    public void setDQ2(String aDQ2) {
        dQ2 = aDQ2;
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
     * Access method for eQ1.
     *
     * @return the current value of eQ1
     */
    public String getEQ1() {
        return eQ1;
    }

    /**
     * Setter method for eQ1.
     *
     * @param aEQ1 the new value for eQ1
     */
    public void setEQ1(String aEQ1) {
        eQ1 = aEQ1;
    }

    /**
     * Access method for eQ21.
     *
     * @return the current value of eQ21
     */
    public String getEQ21() {
        return eQ21;
    }

    /**
     * Setter method for eQ21.
     *
     * @param aEQ21 the new value for eQ21
     */
    public void setEQ21(String aEQ21) {
        eQ21 = aEQ21;
    }

    /**
     * Access method for eQ22.
     *
     * @return the current value of eQ22
     */
    public String getEQ22() {
        return eQ22;
    }

    /**
     * Setter method for eQ22.
     *
     * @param aEQ22 the new value for eQ22
     */
    public void setEQ22(String aEQ22) {
        eQ22 = aEQ22;
    }

    /**
     * Access method for fQ1.
     *
     * @return the current value of fQ1
     */
    public String getFQ1() {
        return fQ1;
    }

    /**
     * Setter method for fQ1.
     *
     * @param aFQ1 the new value for fQ1
     */
    public void setFQ1(String aFQ1) {
        fQ1 = aFQ1;
    }

    /**
     * Access method for gQ1.
     *
     * @return the current value of gQ1
     */
    public String getGQ1() {
        return gQ1;
    }

    /**
     * Setter method for gQ1.
     *
     * @param aGQ1 the new value for gQ1
     */
    public void setGQ1(String aGQ1) {
        gQ1 = aGQ1;
    }

    /**
     * Access method for hQ1.
     *
     * @return the current value of hQ1
     */
    public String getHQ1() {
        return hQ1;
    }

    /**
     * Setter method for hQ1.
     *
     * @param aHQ1 the new value for hQ1
     */
    public void setHQ1(String aHQ1) {
        hQ1 = aHQ1;
    }

    /**
     * Access method for bQ5.
     *
     * @return the current value of bQ5
     */
    public String getBQ5() {
        return bQ5;
    }

    /**
     * Setter method for bQ5.
     *
     * @param aBQ5 the new value for bQ5
     */
    public void setBQ5(String aBQ5) {
        bQ5 = aBQ5;
    }

    /**
     * Compares the key for this instance with another EspEvaluationPrepa.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspEvaluationPrepa and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspEvaluationPrepa)) {
            return false;
        }
        EspEvaluationPrepa that = (EspEvaluationPrepa) other;
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
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspEvaluationPrepa.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspEvaluationPrepa)) return false;
        return this.equalKeys(other) && ((EspEvaluationPrepa)other).equalKeys(this);
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
        if (getIdEt() == null) {
            i = 0;
        } else {
            i = getIdEt().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspEvaluationPrepa |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" codeModule=").append(getCodeModule());
        sb.append(" idEt=").append(getIdEt());
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
        ret.put("idEt", getIdEt());
        return ret;
    }

}
