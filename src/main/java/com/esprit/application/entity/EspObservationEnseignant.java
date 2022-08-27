// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="ESP_OBSERVATION_ENSEIGNANT")
@IdClass(EspObservationEnseignant.EspObservationEnseignantId.class)
public class EspObservationEnseignant implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspObservationEnseignantId implements Serializable {
        java.lang.String anneeDeb;
        java.time.LocalDateTime dateSaisieObs;
        java.lang.String idEns;
    }

    /** Primary key. */
    protected static final String PK = "EspObservationEnseignantPkObservationEnseignant";

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
    @Column(name="DATE_SAISIE_OBS", nullable=false)
    private LocalDateTime dateSaisieObs;
    @Id
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;
    @Column(name="ID_RESP", length=10)
    private String idResp;
    @Column(name="QUALITE_RESP", length=2)
    private String qualiteResp;
    @Column(name="OBSERVATION", length=2000)
    private String observation;

    /** Default constructor. */
    public EspObservationEnseignant() {
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
     * Access method for dateSaisieObs.
     *
     * @return the current value of dateSaisieObs
     */
    public LocalDateTime getDateSaisieObs() {
        return dateSaisieObs;
    }

    /**
     * Setter method for dateSaisieObs.
     *
     * @param aDateSaisieObs the new value for dateSaisieObs
     */
    public void setDateSaisieObs(LocalDateTime aDateSaisieObs) {
        dateSaisieObs = aDateSaisieObs;
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
     * Access method for idResp.
     *
     * @return the current value of idResp
     */
    public String getIdResp() {
        return idResp;
    }

    /**
     * Setter method for idResp.
     *
     * @param aIdResp the new value for idResp
     */
    public void setIdResp(String aIdResp) {
        idResp = aIdResp;
    }

    /**
     * Access method for qualiteResp.
     *
     * @return the current value of qualiteResp
     */
    public String getQualiteResp() {
        return qualiteResp;
    }

    /**
     * Setter method for qualiteResp.
     *
     * @param aQualiteResp the new value for qualiteResp
     */
    public void setQualiteResp(String aQualiteResp) {
        qualiteResp = aQualiteResp;
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
     * Compares the key for this instance with another EspObservationEnseignant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspObservationEnseignant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspObservationEnseignant)) {
            return false;
        }
        EspObservationEnseignant that = (EspObservationEnseignant) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myDateSaisieObs = this.getDateSaisieObs();
        Object yourDateSaisieObs = that.getDateSaisieObs();
        if (myDateSaisieObs==null ? yourDateSaisieObs!=null : !myDateSaisieObs.equals(yourDateSaisieObs)) {
            return false;
        }
        Object myIdEns = this.getIdEns();
        Object yourIdEns = that.getIdEns();
        if (myIdEns==null ? yourIdEns!=null : !myIdEns.equals(yourIdEns)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspObservationEnseignant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspObservationEnseignant)) return false;
        return this.equalKeys(other) && ((EspObservationEnseignant)other).equalKeys(this);
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
        if (getDateSaisieObs() == null) {
            i = 0;
        } else {
            i = getDateSaisieObs().hashCode();
        }
        result = 37*result + i;
        if (getIdEns() == null) {
            i = 0;
        } else {
            i = getIdEns().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspObservationEnseignant |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" dateSaisieObs=").append(getDateSaisieObs());
        sb.append(" idEns=").append(getIdEns());
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
        ret.put("dateSaisieObs", getDateSaisieObs());
        ret.put("idEns", getIdEns());
        return ret;
    }

}
