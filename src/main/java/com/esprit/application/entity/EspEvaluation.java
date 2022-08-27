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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_EVALUATION")
@IdClass(EspEvaluation.EspEvaluationId.class)
public class EspEvaluation implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspEvaluationId implements Serializable {
        java.lang.String idEt;
        java.lang.String anneeDeb;
        EspModule espModule;
        java.lang.String codeCl;
        java.math.BigDecimal numSemestre;
    }

    /** Primary key. */
    protected static final String PK = "EspEvaluationPkEspEvaluation";

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
    @Column(name="ID_ET", nullable=false, length=16)
    private String idEt;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Id
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Id
    @Column(name="NUM_SEMESTRE", nullable=false, precision=1)
    private BigDecimal numSemestre;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="EV1", precision=1)
    private BigDecimal ev1;
    @Column(name="EV2", precision=1)
    private BigDecimal ev2;
    @Column(name="EV3", precision=1)
    private BigDecimal ev3;
    @Column(name="EV4", precision=1)
    private BigDecimal ev4;
    @Column(name="EV5", precision=1)
    private BigDecimal ev5;
    @Column(name="PT_FORT", length=2000)
    private String ptFort;
    @Column(name="PT_FAIBLE", length=2000)
    private String ptFaible;
    @Column(name="PROPOSITION", length=2000)
    private String proposition;
    @Column(name="EV6", precision=1)
    private BigDecimal ev6;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_MODULE", nullable=false)
    private EspModule espModule;

    /** Default constructor. */
    public EspEvaluation() {
        super();
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
     * Access method for ev1.
     *
     * @return the current value of ev1
     */
    public BigDecimal getEv1() {
        return ev1;
    }

    /**
     * Setter method for ev1.
     *
     * @param aEv1 the new value for ev1
     */
    public void setEv1(BigDecimal aEv1) {
        ev1 = aEv1;
    }

    /**
     * Access method for ev2.
     *
     * @return the current value of ev2
     */
    public BigDecimal getEv2() {
        return ev2;
    }

    /**
     * Setter method for ev2.
     *
     * @param aEv2 the new value for ev2
     */
    public void setEv2(BigDecimal aEv2) {
        ev2 = aEv2;
    }

    /**
     * Access method for ev3.
     *
     * @return the current value of ev3
     */
    public BigDecimal getEv3() {
        return ev3;
    }

    /**
     * Setter method for ev3.
     *
     * @param aEv3 the new value for ev3
     */
    public void setEv3(BigDecimal aEv3) {
        ev3 = aEv3;
    }

    /**
     * Access method for ev4.
     *
     * @return the current value of ev4
     */
    public BigDecimal getEv4() {
        return ev4;
    }

    /**
     * Setter method for ev4.
     *
     * @param aEv4 the new value for ev4
     */
    public void setEv4(BigDecimal aEv4) {
        ev4 = aEv4;
    }

    /**
     * Access method for ev5.
     *
     * @return the current value of ev5
     */
    public BigDecimal getEv5() {
        return ev5;
    }

    /**
     * Setter method for ev5.
     *
     * @param aEv5 the new value for ev5
     */
    public void setEv5(BigDecimal aEv5) {
        ev5 = aEv5;
    }

    /**
     * Access method for ptFort.
     *
     * @return the current value of ptFort
     */
    public String getPtFort() {
        return ptFort;
    }

    /**
     * Setter method for ptFort.
     *
     * @param aPtFort the new value for ptFort
     */
    public void setPtFort(String aPtFort) {
        ptFort = aPtFort;
    }

    /**
     * Access method for ptFaible.
     *
     * @return the current value of ptFaible
     */
    public String getPtFaible() {
        return ptFaible;
    }

    /**
     * Setter method for ptFaible.
     *
     * @param aPtFaible the new value for ptFaible
     */
    public void setPtFaible(String aPtFaible) {
        ptFaible = aPtFaible;
    }

    /**
     * Access method for proposition.
     *
     * @return the current value of proposition
     */
    public String getProposition() {
        return proposition;
    }

    /**
     * Setter method for proposition.
     *
     * @param aProposition the new value for proposition
     */
    public void setProposition(String aProposition) {
        proposition = aProposition;
    }

    /**
     * Access method for ev6.
     *
     * @return the current value of ev6
     */
    public BigDecimal getEv6() {
        return ev6;
    }

    /**
     * Setter method for ev6.
     *
     * @param aEv6 the new value for ev6
     */
    public void setEv6(BigDecimal aEv6) {
        ev6 = aEv6;
    }

    /**
     * Access method for espModule.
     *
     * @return the current value of espModule
     */
    public EspModule getEspModule() {
        return espModule;
    }

    /**
     * Setter method for espModule.
     *
     * @param aEspModule the new value for espModule
     */
    public void setEspModule(EspModule aEspModule) {
        espModule = aEspModule;
    }

    /** Temporary value holder for group key fragment espModuleCodeModule */
    private transient String tempEspModuleCodeModule;

    /**
     * Gets the key fragment codeModule for member espModule.
     * If this.espModule is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspModuleCodeModule.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspModule
     */
    public String getEspModuleCodeModule() {
        return (getEspModule() == null ? tempEspModuleCodeModule : getEspModule().getCodeModule());
    }

    /**
     * Sets the key fragment codeModule from member espModule.
     * If this.espModule is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspModuleCodeModule.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeModule New value for the key fragment
     * @see EspModule
     */
    public void setEspModuleCodeModule(String aCodeModule) {
        if (getEspModule() == null) {
            tempEspModuleCodeModule = aCodeModule;
        } else {
            getEspModule().setCodeModule(aCodeModule);
        }
    }

    /**
     * Compares the key for this instance with another EspEvaluation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspEvaluation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspEvaluation)) {
            return false;
        }
        EspEvaluation that = (EspEvaluation) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myEspModuleCodeModule = this.getEspModuleCodeModule();
        Object yourEspModuleCodeModule = that.getEspModuleCodeModule();
        if (myEspModuleCodeModule==null ? yourEspModuleCodeModule!=null : !myEspModuleCodeModule.equals(yourEspModuleCodeModule)) {
            return false;
        }
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        Object myNumSemestre = this.getNumSemestre();
        Object yourNumSemestre = that.getNumSemestre();
        if (myNumSemestre==null ? yourNumSemestre!=null : !myNumSemestre.equals(yourNumSemestre)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspEvaluation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspEvaluation)) return false;
        return this.equalKeys(other) && ((EspEvaluation)other).equalKeys(this);
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
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getEspModuleCodeModule() == null) {
            i = 0;
        } else {
            i = getEspModuleCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getNumSemestre() == null) {
            i = 0;
        } else {
            i = getNumSemestre().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspEvaluation |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" espModuleCodeModule=").append(getEspModuleCodeModule());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" numSemestre=").append(getNumSemestre());
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
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("espModuleCodeModule", getEspModuleCodeModule());
        ret.put("codeCl", getCodeCl());
        ret.put("numSemestre", getNumSemestre());
        return ret;
    }

}
