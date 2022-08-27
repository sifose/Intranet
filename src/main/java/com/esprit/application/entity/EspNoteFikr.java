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

@Entity(name="ESP_NOTE_FIKR")
@IdClass(EspNoteFikr.EspNoteFikrId.class)
public class EspNoteFikr implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspNoteFikrId implements Serializable {
        java.lang.String idEt;
        java.lang.String idEns;
        java.math.BigDecimal numSemestre;
        java.lang.String codeModule;
        java.lang.String anneeDeb;
        java.lang.String codeCl;
    }

    /** Primary key. */
    protected static final String PK = "EspNoteFikrEspNoteFikrPk";

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
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Column(name="NOM", length=50)
    private String nom;
    @Id
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;
    @Column(name="NOM_ENS", length=50)
    private String nomEns;
    @Id
    @Column(name="CODE_MODULE", nullable=false, length=10)
    private String codeModule;
    @Column(name="DESIGNATION", length=50)
    private String designation;
    @Id
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=10)
    private String anneeDeb;
    @Id
    @Column(name="NUM_SEMESTRE", nullable=false, precision=5)
    private BigDecimal numSemestre;
    @Column(name="ORALE", precision=5, scale=2)
    private BigDecimal orale;
    @Column(name="TP", precision=5, scale=2)
    private BigDecimal tp;
    @Column(name="DC1", precision=5, scale=2)
    private BigDecimal dc1;
    @Column(name="DC2", precision=5, scale=2)
    private BigDecimal dc2;
    @Column(name="DS", precision=5, scale=2)
    private BigDecimal ds;
    @Column(name="ABS_OR", length=20)
    private String absOr;
    @Column(name="ABS_DC1", length=20)
    private String absDc1;
    @Column(name="ABS_DC2", length=20)
    private String absDc2;
    @Column(name="ABS_DS", length=20)
    private String absDs;
    @Column(name="ABS_TP", length=20)
    private String absTp;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;

    /** Default constructor. */
    public EspNoteFikr() {
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
     * Access method for nom.
     *
     * @return the current value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter method for nom.
     *
     * @param aNom the new value for nom
     */
    public void setNom(String aNom) {
        nom = aNom;
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
     * Access method for nomEns.
     *
     * @return the current value of nomEns
     */
    public String getNomEns() {
        return nomEns;
    }

    /**
     * Setter method for nomEns.
     *
     * @param aNomEns the new value for nomEns
     */
    public void setNomEns(String aNomEns) {
        nomEns = aNomEns;
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
     * Access method for orale.
     *
     * @return the current value of orale
     */
    public BigDecimal getOrale() {
        return orale;
    }

    /**
     * Setter method for orale.
     *
     * @param aOrale the new value for orale
     */
    public void setOrale(BigDecimal aOrale) {
        orale = aOrale;
    }

    /**
     * Access method for tp.
     *
     * @return the current value of tp
     */
    public BigDecimal getTp() {
        return tp;
    }

    /**
     * Setter method for tp.
     *
     * @param aTp the new value for tp
     */
    public void setTp(BigDecimal aTp) {
        tp = aTp;
    }

    /**
     * Access method for dc1.
     *
     * @return the current value of dc1
     */
    public BigDecimal getDc1() {
        return dc1;
    }

    /**
     * Setter method for dc1.
     *
     * @param aDc1 the new value for dc1
     */
    public void setDc1(BigDecimal aDc1) {
        dc1 = aDc1;
    }

    /**
     * Access method for dc2.
     *
     * @return the current value of dc2
     */
    public BigDecimal getDc2() {
        return dc2;
    }

    /**
     * Setter method for dc2.
     *
     * @param aDc2 the new value for dc2
     */
    public void setDc2(BigDecimal aDc2) {
        dc2 = aDc2;
    }

    /**
     * Access method for ds.
     *
     * @return the current value of ds
     */
    public BigDecimal getDs() {
        return ds;
    }

    /**
     * Setter method for ds.
     *
     * @param aDs the new value for ds
     */
    public void setDs(BigDecimal aDs) {
        ds = aDs;
    }

    /**
     * Access method for absOr.
     *
     * @return the current value of absOr
     */
    public String getAbsOr() {
        return absOr;
    }

    /**
     * Setter method for absOr.
     *
     * @param aAbsOr the new value for absOr
     */
    public void setAbsOr(String aAbsOr) {
        absOr = aAbsOr;
    }

    /**
     * Access method for absDc1.
     *
     * @return the current value of absDc1
     */
    public String getAbsDc1() {
        return absDc1;
    }

    /**
     * Setter method for absDc1.
     *
     * @param aAbsDc1 the new value for absDc1
     */
    public void setAbsDc1(String aAbsDc1) {
        absDc1 = aAbsDc1;
    }

    /**
     * Access method for absDc2.
     *
     * @return the current value of absDc2
     */
    public String getAbsDc2() {
        return absDc2;
    }

    /**
     * Setter method for absDc2.
     *
     * @param aAbsDc2 the new value for absDc2
     */
    public void setAbsDc2(String aAbsDc2) {
        absDc2 = aAbsDc2;
    }

    /**
     * Access method for absDs.
     *
     * @return the current value of absDs
     */
    public String getAbsDs() {
        return absDs;
    }

    /**
     * Setter method for absDs.
     *
     * @param aAbsDs the new value for absDs
     */
    public void setAbsDs(String aAbsDs) {
        absDs = aAbsDs;
    }

    /**
     * Access method for absTp.
     *
     * @return the current value of absTp
     */
    public String getAbsTp() {
        return absTp;
    }

    /**
     * Setter method for absTp.
     *
     * @param aAbsTp the new value for absTp
     */
    public void setAbsTp(String aAbsTp) {
        absTp = aAbsTp;
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
     * Compares the key for this instance with another EspNoteFikr.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspNoteFikr and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspNoteFikr)) {
            return false;
        }
        EspNoteFikr that = (EspNoteFikr) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myIdEns = this.getIdEns();
        Object yourIdEns = that.getIdEns();
        if (myIdEns==null ? yourIdEns!=null : !myIdEns.equals(yourIdEns)) {
            return false;
        }
        Object myNumSemestre = this.getNumSemestre();
        Object yourNumSemestre = that.getNumSemestre();
        if (myNumSemestre==null ? yourNumSemestre!=null : !myNumSemestre.equals(yourNumSemestre)) {
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
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspNoteFikr.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspNoteFikr)) return false;
        return this.equalKeys(other) && ((EspNoteFikr)other).equalKeys(this);
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
        if (getIdEns() == null) {
            i = 0;
        } else {
            i = getIdEns().hashCode();
        }
        result = 37*result + i;
        if (getNumSemestre() == null) {
            i = 0;
        } else {
            i = getNumSemestre().hashCode();
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
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspNoteFikr |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" idEns=").append(getIdEns());
        sb.append(" numSemestre=").append(getNumSemestre());
        sb.append(" codeModule=").append(getCodeModule());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" codeCl=").append(getCodeCl());
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
        ret.put("idEns", getIdEns());
        ret.put("numSemestre", getNumSemestre());
        ret.put("codeModule", getCodeModule());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("codeCl", getCodeCl());
        return ret;
    }

}
