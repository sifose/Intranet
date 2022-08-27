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

@Entity(name="ESP_ENTETE_ABSENCE")
@IdClass(EspEnteteAbsence.EspEnteteAbsenceId.class)
public class EspEnteteAbsence implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspEnteteAbsenceId implements Serializable {
        java.lang.String anneeDeb;
        EspModule espModule;
        java.math.BigDecimal numSeance;
        java.time.LocalDateTime dateSeance;
        java.lang.String codeCl;
    }

    /** Primary key. */
    protected static final String PK = "EspEnteteAbsencePkEnteteAbsenceEspEnte";

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
    @Column(name="SEMESTRE", precision=1)
    private BigDecimal semestre;
    @Id
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Id
    @Column(name="NUM_SEANCE", nullable=false)
    private BigDecimal numSeance;
    @Id
    @Column(name="DATE_SEANCE", nullable=false)
    private LocalDateTime dateSeance;
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="DATE_LAST_MODIF")
    private LocalDateTime dateLastModif;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_MODULE", nullable=false)
    private EspModule espModule;

    /** Default constructor. */
    public EspEnteteAbsence() {
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
     * Access method for numSeance.
     *
     * @return the current value of numSeance
     */
    public BigDecimal getNumSeance() {
        return numSeance;
    }

    /**
     * Setter method for numSeance.
     *
     * @param aNumSeance the new value for numSeance
     */
    public void setNumSeance(BigDecimal aNumSeance) {
        numSeance = aNumSeance;
    }

    /**
     * Access method for dateSeance.
     *
     * @return the current value of dateSeance
     */
    public LocalDateTime getDateSeance() {
        return dateSeance;
    }

    /**
     * Setter method for dateSeance.
     *
     * @param aDateSeance the new value for dateSeance
     */
    public void setDateSeance(LocalDateTime aDateSeance) {
        dateSeance = aDateSeance;
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
     * Access method for dateLastModif.
     *
     * @return the current value of dateLastModif
     */
    public LocalDateTime getDateLastModif() {
        return dateLastModif;
    }

    /**
     * Setter method for dateLastModif.
     *
     * @param aDateLastModif the new value for dateLastModif
     */
    public void setDateLastModif(LocalDateTime aDateLastModif) {
        dateLastModif = aDateLastModif;
    }

    /**
     * Access method for utilisateur.
     *
     * @return the current value of utilisateur
     */
    public String getUtilisateur() {
        return utilisateur;
    }

    /**
     * Setter method for utilisateur.
     *
     * @param aUtilisateur the new value for utilisateur
     */
    public void setUtilisateur(String aUtilisateur) {
        utilisateur = aUtilisateur;
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
     * Compares the key for this instance with another EspEnteteAbsence.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspEnteteAbsence and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspEnteteAbsence)) {
            return false;
        }
        EspEnteteAbsence that = (EspEnteteAbsence) other;
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
        Object myNumSeance = this.getNumSeance();
        Object yourNumSeance = that.getNumSeance();
        if (myNumSeance==null ? yourNumSeance!=null : !myNumSeance.equals(yourNumSeance)) {
            return false;
        }
        Object myDateSeance = this.getDateSeance();
        Object yourDateSeance = that.getDateSeance();
        if (myDateSeance==null ? yourDateSeance!=null : !myDateSeance.equals(yourDateSeance)) {
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
     * Compares this instance with another EspEnteteAbsence.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspEnteteAbsence)) return false;
        return this.equalKeys(other) && ((EspEnteteAbsence)other).equalKeys(this);
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
        if (getEspModuleCodeModule() == null) {
            i = 0;
        } else {
            i = getEspModuleCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getNumSeance() == null) {
            i = 0;
        } else {
            i = getNumSeance().hashCode();
        }
        result = 37*result + i;
        if (getDateSeance() == null) {
            i = 0;
        } else {
            i = getDateSeance().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspEnteteAbsence |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" espModuleCodeModule=").append(getEspModuleCodeModule());
        sb.append(" numSeance=").append(getNumSeance());
        sb.append(" dateSeance=").append(getDateSeance());
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
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("espModuleCodeModule", getEspModuleCodeModule());
        ret.put("numSeance", getNumSeance());
        ret.put("dateSeance", getDateSeance());
        ret.put("codeCl", getCodeCl());
        return ret;
    }

}
