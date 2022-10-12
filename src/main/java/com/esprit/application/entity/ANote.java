// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="A_NOTE")
public class ANote implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    
    /** Primary key. */
    protected static final String PK = "id";

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

   
    @Column(name="ID_ET", nullable=false, length=20)
    private String idEt;
    @Column(name="ID_ENS", nullable=false, length=20)
    private String idEns;
    @Column(name="CODE_CL", nullable=false, length=20)
    private String codeCl;
    @Column(name="ANNEE_DEB", nullable=false, length=20)
    private String anneeDeb;
    @Column(name="CODE_MODULE", nullable=false, length=20)
    private String codeModule;
    @Column(name="ORALE", precision=5, scale=2)
    private BigDecimal orale;
    @Column(name="SEMESTRE", nullable=false, precision=2)
    private BigDecimal semestre;
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
    @Column(name="TP", precision=5, scale=2)
    private BigDecimal tp;
    @Column(name="TE", precision=5, scale=2)
    private BigDecimal te;
    @Column(name="ABS_TP", length=20)
    private String absTp;
    @Column(name="ABS_TE", length=20)
    private String absTe;
    @Column(name="DATE_SAISIE", nullable=false)
    private LocalDateTime dateSaisie;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name="ID", unique=true, nullable=false, length=50)
    private Long id;

    /** Default constructor. */
    public ANote() {
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
     * Access method for semestre.
     *
     * @return the current value of semestre
     */
    public BigDecimal getSemestre() {
        return semestre;
    }

    /**
     * Setter method for semestre.
     *
     * @param aSemestre the new value for semestre
     */
    public void setSemestre(BigDecimal aSemestre) {
        semestre = aSemestre;
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
     * Access method for te.
     *
     * @return the current value of te
     */
    public BigDecimal getTe() {
        return te;
    }

    /**
     * Setter method for te.
     *
     * @param aTe the new value for te
     */
    public void setTe(BigDecimal aTe) {
        te = aTe;
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
     * Access method for absTe.
     *
     * @return the current value of absTe
     */
    public String getAbsTe() {
        return absTe;
    }

    /**
     * Setter method for absTe.
     *
     * @param aAbsTe the new value for absTe
     */
    public void setAbsTe(String aAbsTe) {
        absTe = aAbsTe;
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

    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
     * Compares the key for this instance with another ANote.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ANote and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ANote)) {
            return false;
        }
        ANote that = (ANote) other;
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
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myCodeModule = this.getCodeModule();
        Object yourCodeModule = that.getCodeModule();
        if (myCodeModule==null ? yourCodeModule!=null : !myCodeModule.equals(yourCodeModule)) {
            return false;
        }
        Object mySemestre = this.getSemestre();
        Object yourSemestre = that.getSemestre();
        if (mySemestre==null ? yourSemestre!=null : !mySemestre.equals(yourSemestre)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ANote.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ANote)) return false;
        return this.equalKeys(other) && ((ANote)other).equalKeys(this);
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
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getCodeModule() == null) {
            i = 0;
        } else {
            i = getCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getSemestre() == null) {
            i = 0;
        } else {
            i = getSemestre().hashCode();
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
        StringBuffer sb = new StringBuffer("[ANote |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" idEns=").append(getIdEns());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" codeModule=").append(getCodeModule());
        sb.append(" semestre=").append(getSemestre());
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
        ret.put("codeCl", getCodeCl());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("codeModule", getCodeModule());
        ret.put("semestre", getSemestre());
        return ret;
    }

}
