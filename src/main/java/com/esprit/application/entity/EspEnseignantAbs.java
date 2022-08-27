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

@Entity(name="ESP_ENSEIGNANT_ABS")
@IdClass(EspEnseignantAbs.EspEnseignantAbsId.class)
public class EspEnseignantAbs implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspEnseignantAbsId implements Serializable {
        java.lang.String idEns;
        java.time.LocalDateTime dateAbs;
        java.lang.String codeModule;
        java.lang.String codeCl;
        java.math.BigDecimal numSeance;
        java.lang.String anneeDeb;
        java.math.BigDecimal semestre;
    }

    /** Primary key. */
    protected static final String PK = "EspEnseignantAbsEspEnseignantAbsPk";

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
    @Column(name="DATE_ABS", nullable=false)
    private LocalDateTime dateAbs;
    @Id
    @Column(name="CODE_MODULE", nullable=false, length=10)
    private String codeModule;
    @Id
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Id
    @Column(name="NUM_SEANCE", nullable=false, precision=1)
    private BigDecimal numSeance;
    @Column(name="MOTIF", length=300)
    private String motif;
    @Column(name="NB_HEURES", precision=1)
    private BigDecimal nbHeures;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="TYPE_ABS", length=1)
    private String typeAbs;
    @Column(name="CODE_MOTIF", length=2)
    private String codeMotif;
    @Column(name="NB_MINUTES", precision=2)
    private BigDecimal nbMinutes;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Id
    @Column(name="SEMESTRE", nullable=false, precision=1)
    private BigDecimal semestre;
    @Column(name="OBSERVATION", length=500)
    private String observation;

    /** Default constructor. */
    public EspEnseignantAbs() {
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
     * Access method for dateAbs.
     *
     * @return the current value of dateAbs
     */
    public LocalDateTime getDateAbs() {
        return dateAbs;
    }

    /**
     * Setter method for dateAbs.
     *
     * @param aDateAbs the new value for dateAbs
     */
    public void setDateAbs(LocalDateTime aDateAbs) {
        dateAbs = aDateAbs;
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
     * Access method for motif.
     *
     * @return the current value of motif
     */
    public String getMotif() {
        return motif;
    }

    /**
     * Setter method for motif.
     *
     * @param aMotif the new value for motif
     */
    public void setMotif(String aMotif) {
        motif = aMotif;
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
     * Access method for typeAbs.
     *
     * @return the current value of typeAbs
     */
    public String getTypeAbs() {
        return typeAbs;
    }

    /**
     * Setter method for typeAbs.
     *
     * @param aTypeAbs the new value for typeAbs
     */
    public void setTypeAbs(String aTypeAbs) {
        typeAbs = aTypeAbs;
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
     * Access method for nbMinutes.
     *
     * @return the current value of nbMinutes
     */
    public BigDecimal getNbMinutes() {
        return nbMinutes;
    }

    /**
     * Setter method for nbMinutes.
     *
     * @param aNbMinutes the new value for nbMinutes
     */
    public void setNbMinutes(BigDecimal aNbMinutes) {
        nbMinutes = aNbMinutes;
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
     * Compares the key for this instance with another EspEnseignantAbs.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspEnseignantAbs and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspEnseignantAbs)) {
            return false;
        }
        EspEnseignantAbs that = (EspEnseignantAbs) other;
        Object myIdEns = this.getIdEns();
        Object yourIdEns = that.getIdEns();
        if (myIdEns==null ? yourIdEns!=null : !myIdEns.equals(yourIdEns)) {
            return false;
        }
        Object myDateAbs = this.getDateAbs();
        Object yourDateAbs = that.getDateAbs();
        if (myDateAbs==null ? yourDateAbs!=null : !myDateAbs.equals(yourDateAbs)) {
            return false;
        }
        Object myCodeModule = this.getCodeModule();
        Object yourCodeModule = that.getCodeModule();
        if (myCodeModule==null ? yourCodeModule!=null : !myCodeModule.equals(yourCodeModule)) {
            return false;
        }
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        Object myNumSeance = this.getNumSeance();
        Object yourNumSeance = that.getNumSeance();
        if (myNumSeance==null ? yourNumSeance!=null : !myNumSeance.equals(yourNumSeance)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
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
     * Compares this instance with another EspEnseignantAbs.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspEnseignantAbs)) return false;
        return this.equalKeys(other) && ((EspEnseignantAbs)other).equalKeys(this);
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
        if (getDateAbs() == null) {
            i = 0;
        } else {
            i = getDateAbs().hashCode();
        }
        result = 37*result + i;
        if (getCodeModule() == null) {
            i = 0;
        } else {
            i = getCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getNumSeance() == null) {
            i = 0;
        } else {
            i = getNumSeance().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspEnseignantAbs |");
        sb.append(" idEns=").append(getIdEns());
        sb.append(" dateAbs=").append(getDateAbs());
        sb.append(" codeModule=").append(getCodeModule());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" numSeance=").append(getNumSeance());
        sb.append(" anneeDeb=").append(getAnneeDeb());
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
        ret.put("dateAbs", getDateAbs());
        ret.put("codeModule", getCodeModule());
        ret.put("codeCl", getCodeCl());
        ret.put("numSeance", getNumSeance());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("semestre", getSemestre());
        return ret;
    }

}
