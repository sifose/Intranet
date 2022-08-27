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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_DETAIL_CONTRAT")
@IdClass(EspDetailContrat.EspDetailContratId.class)
public class EspDetailContrat implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspDetailContratId implements Serializable {
        java.lang.String numord;
        Classe classe;
        EspModule espModule;
    }

    /** Primary key. */
    protected static final String PK = "EspDetailContratPkDetailContrat";

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
    @Column(name="NUMORD", nullable=false, length=10)
    private String numord;
    @Column(name="NB_HEURES", nullable=false, precision=3)
    private BigDecimal nbHeures;
    @Column(name="PERIODE", nullable=false, length=25)
    private String periode;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_CL", nullable=false)
    private Classe classe;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_MODULE", nullable=false)
    private EspModule espModule;

    /** Default constructor. */
    public EspDetailContrat() {
        super();
    }

    /**
     * Access method for numord.
     *
     * @return the current value of numord
     */
    public String getNumord() {
        return numord;
    }

    /**
     * Setter method for numord.
     *
     * @param aNumord the new value for numord
     */
    public void setNumord(String aNumord) {
        numord = aNumord;
    }

    /**
     * Access method for nbHeures.
     *
     * @return the current value of nbHeures
     */
    public BigDecimal getNbHeures() {
        return nbHeures;
    }

    /**
     * Setter method for nbHeures.
     *
     * @param aNbHeures the new value for nbHeures
     */
    public void setNbHeures(BigDecimal aNbHeures) {
        nbHeures = aNbHeures;
    }

    /**
     * Access method for periode.
     *
     * @return the current value of periode
     */
    public String getPeriode() {
        return periode;
    }

    /**
     * Setter method for periode.
     *
     * @param aPeriode the new value for periode
     */
    public void setPeriode(String aPeriode) {
        periode = aPeriode;
    }

    /**
     * Access method for classe.
     *
     * @return the current value of classe
     */
    public Classe getClasse() {
        return classe;
    }

    /**
     * Setter method for classe.
     *
     * @param aClasse the new value for classe
     */
    public void setClasse(Classe aClasse) {
        classe = aClasse;
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

    /** Temporary value holder for group key fragment classeCodeCl */
    private transient String tempClasseCodeCl;

    /**
     * Gets the key fragment codeCl for member classe.
     * If this.classe is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setClasseCodeCl.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Classe
     */
    public String getClasseCodeCl() {
        return (getClasse() == null ? tempClasseCodeCl : getClasse().getCodeCl());
    }

    /**
     * Sets the key fragment codeCl from member classe.
     * If this.classe is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getClasseCodeCl.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeCl New value for the key fragment
     * @see Classe
     */
    public void setClasseCodeCl(String aCodeCl) {
        if (getClasse() == null) {
            tempClasseCodeCl = aCodeCl;
        } else {
            getClasse().setCodeCl(aCodeCl);
        }
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
     * Compares the key for this instance with another EspDetailContrat.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspDetailContrat and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspDetailContrat)) {
            return false;
        }
        EspDetailContrat that = (EspDetailContrat) other;
        Object myNumord = this.getNumord();
        Object yourNumord = that.getNumord();
        if (myNumord==null ? yourNumord!=null : !myNumord.equals(yourNumord)) {
            return false;
        }
        Object myClasseCodeCl = this.getClasseCodeCl();
        Object yourClasseCodeCl = that.getClasseCodeCl();
        if (myClasseCodeCl==null ? yourClasseCodeCl!=null : !myClasseCodeCl.equals(yourClasseCodeCl)) {
            return false;
        }
        Object myEspModuleCodeModule = this.getEspModuleCodeModule();
        Object yourEspModuleCodeModule = that.getEspModuleCodeModule();
        if (myEspModuleCodeModule==null ? yourEspModuleCodeModule!=null : !myEspModuleCodeModule.equals(yourEspModuleCodeModule)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspDetailContrat.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspDetailContrat)) return false;
        return this.equalKeys(other) && ((EspDetailContrat)other).equalKeys(this);
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
        if (getNumord() == null) {
            i = 0;
        } else {
            i = getNumord().hashCode();
        }
        result = 37*result + i;
        if (getClasseCodeCl() == null) {
            i = 0;
        } else {
            i = getClasseCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getEspModuleCodeModule() == null) {
            i = 0;
        } else {
            i = getEspModuleCodeModule().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspDetailContrat |");
        sb.append(" numord=").append(getNumord());
        sb.append(" classeCodeCl=").append(getClasseCodeCl());
        sb.append(" espModuleCodeModule=").append(getEspModuleCodeModule());
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
        ret.put("numord", getNumord());
        ret.put("classeCodeCl", getClasseCodeCl());
        ret.put("espModuleCodeModule", getEspModuleCodeModule());
        return ret;
    }

}
