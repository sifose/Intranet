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

@Entity(name="ESP_COMPORTEMENT_DISCPLINE")
@IdClass(EspComportementDiscpline.EspComportementDiscplineId.class)
public class EspComportementDiscpline implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspComportementDiscplineId implements Serializable {
        java.time.LocalDateTime dateSaisie;
        java.lang.String idEt;
        java.lang.String idEns;
        java.lang.String codeModule;
        java.lang.String anneeDeb;
        java.lang.String codeCl;
    }

    /** Primary key. */
    protected static final String PK = "EspComportementDiscplineEspComportementDiscplinePk";

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
    @Column(name="DATE_SAISIE", nullable=false)
    private LocalDateTime dateSaisie;
    @Id
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Id
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;
    @Id
    @Column(name="CODE_MODULE", nullable=false, length=10)
    private String codeModule;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="SEMESTRE", length=1)
    private String semestre;
    @Column(name="OBS_COMPORTEMENT", length=2000)
    private String obsComportement;
    @Column(name="OBS_DISPLINE", length=2000)
    private String obsDispline;
    @Column(name="OBSERVATION", length=2000)
    private String observation;
    @Id
    @Column(name="CODE_CL", nullable=false, length=20)
    private String codeCl;
    @Column(name="DATE_ENREG")
    private LocalDateTime dateEnreg;

    /** Default constructor. */
    public EspComportementDiscpline() {
        super();
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
    public String getSemestre() {
        return semestre;
    }

    /**
     * Setter method for semestre.
     *
     * @param aSemestre the new value for semestre
     */
    public void setSemestre(String aSemestre) {
        semestre = aSemestre;
    }

    /**
     * Access method for obsComportement.
     *
     * @return the current value of obsComportement
     */
    public String getObsComportement() {
        return obsComportement;
    }

    /**
     * Setter method for obsComportement.
     *
     * @param aObsComportement the new value for obsComportement
     */
    public void setObsComportement(String aObsComportement) {
        obsComportement = aObsComportement;
    }

    /**
     * Access method for obsDispline.
     *
     * @return the current value of obsDispline
     */
    public String getObsDispline() {
        return obsDispline;
    }

    /**
     * Setter method for obsDispline.
     *
     * @param aObsDispline the new value for obsDispline
     */
    public void setObsDispline(String aObsDispline) {
        obsDispline = aObsDispline;
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
     * Access method for dateEnreg.
     *
     * @return the current value of dateEnreg
     */
    public LocalDateTime getDateEnreg() {
        return dateEnreg;
    }

    /**
     * Setter method for dateEnreg.
     *
     * @param aDateEnreg the new value for dateEnreg
     */
    public void setDateEnreg(LocalDateTime aDateEnreg) {
        dateEnreg = aDateEnreg;
    }

    /**
     * Compares the key for this instance with another EspComportementDiscpline.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspComportementDiscpline and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspComportementDiscpline)) {
            return false;
        }
        EspComportementDiscpline that = (EspComportementDiscpline) other;
        Object myDateSaisie = this.getDateSaisie();
        Object yourDateSaisie = that.getDateSaisie();
        if (myDateSaisie==null ? yourDateSaisie!=null : !myDateSaisie.equals(yourDateSaisie)) {
            return false;
        }
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
     * Compares this instance with another EspComportementDiscpline.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspComportementDiscpline)) return false;
        return this.equalKeys(other) && ((EspComportementDiscpline)other).equalKeys(this);
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
        if (getDateSaisie() == null) {
            i = 0;
        } else {
            i = getDateSaisie().hashCode();
        }
        result = 37*result + i;
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
        StringBuffer sb = new StringBuffer("[EspComportementDiscpline |");
        sb.append(" dateSaisie=").append(getDateSaisie());
        sb.append(" idEt=").append(getIdEt());
        sb.append(" idEns=").append(getIdEns());
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
        ret.put("dateSaisie", getDateSaisie());
        ret.put("idEt", getIdEt());
        ret.put("idEns", getIdEns());
        ret.put("codeModule", getCodeModule());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("codeCl", getCodeCl());
        return ret;
    }

}
