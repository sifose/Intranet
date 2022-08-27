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

@Entity(name="ESP_SEANCE_ENS")
@IdClass(EspSeanceEns.EspSeanceEnsId.class)
public class EspSeanceEns implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspSeanceEnsId implements Serializable {
        java.lang.String idEns;
        EspModule espModule;
        java.lang.String anneeDeb;
        java.lang.String codeCl;
        java.time.LocalDateTime dateSeance;
        java.math.BigDecimal semestre;
    }

    /** Primary key. */
    protected static final String PK = "EspSeanceEnsPkAbsenceEns1";

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
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;
    @Id
    @Column(name="DATE_SEANCE", nullable=false)
    private LocalDateTime dateSeance;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Id
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Id
    @Column(name="SEMESTRE", nullable=false, precision=1)
    private BigDecimal semestre;
    @Column(name="NUM_SEANCE", precision=1)
    private BigDecimal numSeance;
    @Column(name="NB_SEANCE", precision=2)
    private BigDecimal nbSeance;
    @Column(name="REALISATION", length=1)
    private String realisation;
    @Column(name="CODE_MOTIF", length=2)
    private String codeMotif;
    @Column(name="HEURE_ENTREE", precision=2)
    private BigDecimal heureEntree;
    @Column(name="MINUTE_ENTREE", precision=10)
    private BigDecimal minuteEntree;
    @Column(name="HEURE_SORTIE", precision=10)
    private BigDecimal heureSortie;
    @Column(name="MINUTE_SORTIE", precision=10)
    private BigDecimal minuteSortie;
    @Column(name="OBSERVATION", length=300)
    private String observation;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Column(name="NB_MIN_PAUSE", precision=10)
    private BigDecimal nbMinPause;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_MODULE", nullable=false)
    private EspModule espModule;

    /** Default constructor. */
    public EspSeanceEns() {
        super();
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
     * Access method for nbSeance.
     *
     * @return the current value of nbSeance
     */
    public BigDecimal getNbSeance() {
        return nbSeance;
    }

    /**
     * Setter method for nbSeance.
     *
     * @param aNbSeance the new value for nbSeance
     */
    public void setNbSeance(BigDecimal aNbSeance) {
        nbSeance = aNbSeance;
    }

    /**
     * Access method for realisation.
     *
     * @return the current value of realisation
     */
    public String getRealisation() {
        return realisation;
    }

    /**
     * Setter method for realisation.
     *
     * @param aRealisation the new value for realisation
     */
    public void setRealisation(String aRealisation) {
        realisation = aRealisation;
    }

    /**
     * Access method for codeMotif.
     *
     * @return the current value of codeMotif
     */
    public String getCodeMotif() {
        return codeMotif;
    }

    /**
     * Setter method for codeMotif.
     *
     * @param aCodeMotif the new value for codeMotif
     */
    public void setCodeMotif(String aCodeMotif) {
        codeMotif = aCodeMotif;
    }

    /**
     * Access method for heureEntree.
     *
     * @return the current value of heureEntree
     */
    public BigDecimal getHeureEntree() {
        return heureEntree;
    }

    /**
     * Setter method for heureEntree.
     *
     * @param aHeureEntree the new value for heureEntree
     */
    public void setHeureEntree(BigDecimal aHeureEntree) {
        heureEntree = aHeureEntree;
    }

    /**
     * Access method for minuteEntree.
     *
     * @return the current value of minuteEntree
     */
    public BigDecimal getMinuteEntree() {
        return minuteEntree;
    }

    /**
     * Setter method for minuteEntree.
     *
     * @param aMinuteEntree the new value for minuteEntree
     */
    public void setMinuteEntree(BigDecimal aMinuteEntree) {
        minuteEntree = aMinuteEntree;
    }

    /**
     * Access method for heureSortie.
     *
     * @return the current value of heureSortie
     */
    public BigDecimal getHeureSortie() {
        return heureSortie;
    }

    /**
     * Setter method for heureSortie.
     *
     * @param aHeureSortie the new value for heureSortie
     */
    public void setHeureSortie(BigDecimal aHeureSortie) {
        heureSortie = aHeureSortie;
    }

    /**
     * Access method for minuteSortie.
     *
     * @return the current value of minuteSortie
     */
    public BigDecimal getMinuteSortie() {
        return minuteSortie;
    }

    /**
     * Setter method for minuteSortie.
     *
     * @param aMinuteSortie the new value for minuteSortie
     */
    public void setMinuteSortie(BigDecimal aMinuteSortie) {
        minuteSortie = aMinuteSortie;
    }

    /**
     * Access method for observation.
     *
     * @return the current value of observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * Setter method for observation.
     *
     * @param aObservation the new value for observation
     */
    public void setObservation(String aObservation) {
        observation = aObservation;
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
     * Access method for nbMinPause.
     *
     * @return the current value of nbMinPause
     */
    public BigDecimal getNbMinPause() {
        return nbMinPause;
    }

    /**
     * Setter method for nbMinPause.
     *
     * @param aNbMinPause the new value for nbMinPause
     */
    public void setNbMinPause(BigDecimal aNbMinPause) {
        nbMinPause = aNbMinPause;
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
     * Compares the key for this instance with another EspSeanceEns.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspSeanceEns and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspSeanceEns)) {
            return false;
        }
        EspSeanceEns that = (EspSeanceEns) other;
        Object myIdEns = this.getIdEns();
        Object yourIdEns = that.getIdEns();
        if (myIdEns==null ? yourIdEns!=null : !myIdEns.equals(yourIdEns)) {
            return false;
        }
        Object myEspModuleCodeModule = this.getEspModuleCodeModule();
        Object yourEspModuleCodeModule = that.getEspModuleCodeModule();
        if (myEspModuleCodeModule==null ? yourEspModuleCodeModule!=null : !myEspModuleCodeModule.equals(yourEspModuleCodeModule)) {
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
        Object myDateSeance = this.getDateSeance();
        Object yourDateSeance = that.getDateSeance();
        if (myDateSeance==null ? yourDateSeance!=null : !myDateSeance.equals(yourDateSeance)) {
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
     * Compares this instance with another EspSeanceEns.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspSeanceEns)) return false;
        return this.equalKeys(other) && ((EspSeanceEns)other).equalKeys(this);
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
        if (getIdEns() == null) {
            i = 0;
        } else {
            i = getIdEns().hashCode();
        }
        result = 37*result + i;
        if (getEspModuleCodeModule() == null) {
            i = 0;
        } else {
            i = getEspModuleCodeModule().hashCode();
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
        if (getDateSeance() == null) {
            i = 0;
        } else {
            i = getDateSeance().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspSeanceEns |");
        sb.append(" idEns=").append(getIdEns());
        sb.append(" espModuleCodeModule=").append(getEspModuleCodeModule());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" dateSeance=").append(getDateSeance());
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
        ret.put("idEns", getIdEns());
        ret.put("espModuleCodeModule", getEspModuleCodeModule());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("codeCl", getCodeCl());
        ret.put("dateSeance", getDateSeance());
        ret.put("semestre", getSemestre());
        return ret;
    }

}
