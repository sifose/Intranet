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

@Entity(name="ESP_DISPENSE_ETUDIANT")
@IdClass(EspDispenseEtudiant.EspDispenseEtudiantId.class)
public class EspDispenseEtudiant implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspDispenseEtudiantId implements Serializable {
        java.lang.String idEt;
        java.lang.String codeModule;
        java.lang.String anneeDeb;
        java.math.BigDecimal semestre;
    }

    /** Primary key. */
    protected static final String PK = "EspDispenseEtudiantPkDispense";

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
    @Id
    @Column(name="CODE_MODULE", nullable=false, length=10)
    private String codeModule;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Id
    @Column(name="SEMESTRE", nullable=false, precision=1)
    private BigDecimal semestre;
    @Column(name="MOYENNE", nullable=false, precision=5, scale=2)
    private BigDecimal moyenne;
    @Column(name="OBSERVATION", length=100)
    private String observation;
    @Column(name="DATE_DEBUT_DISPENSE")
    private LocalDateTime dateDebutDispense;

    /** Default constructor. */
    public EspDispenseEtudiant() {
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
     * Access method for moyenne.
     *
     * @return the current value of moyenne
     */
    public BigDecimal getMoyenne() {
        return moyenne;
    }

    /**
     * Setter method for moyenne.
     *
     * @param aMoyenne the new value for moyenne
     */
    public void setMoyenne(BigDecimal aMoyenne) {
        moyenne = aMoyenne;
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
     * Access method for dateDebutDispense.
     *
     * @return the current value of dateDebutDispense
     */
    public LocalDateTime getDateDebutDispense() {
        return dateDebutDispense;
    }

    /**
     * Setter method for dateDebutDispense.
     *
     * @param aDateDebutDispense the new value for dateDebutDispense
     */
    public void setDateDebutDispense(LocalDateTime aDateDebutDispense) {
        dateDebutDispense = aDateDebutDispense;
    }

    /**
     * Compares the key for this instance with another EspDispenseEtudiant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspDispenseEtudiant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspDispenseEtudiant)) {
            return false;
        }
        EspDispenseEtudiant that = (EspDispenseEtudiant) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
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
        Object mySemestre = this.getSemestre();
        Object yourSemestre = that.getSemestre();
        if (mySemestre==null ? yourSemestre!=null : !mySemestre.equals(yourSemestre)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspDispenseEtudiant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspDispenseEtudiant)) return false;
        return this.equalKeys(other) && ((EspDispenseEtudiant)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[EspDispenseEtudiant |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" codeModule=").append(getCodeModule());
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
        ret.put("idEt", getIdEt());
        ret.put("codeModule", getCodeModule());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("semestre", getSemestre());
        return ret;
    }

}
