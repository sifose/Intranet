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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_ABSENCE_LIST")
public class EspAbsenceList implements Serializable {

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

    @Id
    @Column(name="ID", unique=true, nullable=false, precision=38)
    private BigDecimal id;
    @Column(name="DT")
    private LocalDateTime dt;
    @Column(name="IDPROF", length=10)
    private String idprof;
    @Column(name="IDCLASSE", length=10)
    private String idclasse;
    @Column(name="IDCRENEAU", length=20)
    private String idcreneau;
    @Column(name="IDAGENT", length=20)
    private String idagent;
    @Column(name="SEMESTRE", length=20)
    private String semestre;
    @Column(name="ANNEE_DEB", length=10)
    private String anneeDeb;
    @ManyToOne
    @JoinColumn(name="IDMODULE")
    private EspModule espModule;

    /** Default constructor. */
    public EspAbsenceList() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(BigDecimal aId) {
        id = aId;
    }

    /**
     * Access method for dt.
     *
     * @return the current value of dt
     */
    public LocalDateTime getDt() {
        return dt;
    }

    /**
     * Setter method for dt.
     *
     * @param aDt the new value for dt
     */
    public void setDt(LocalDateTime aDt) {
        dt = aDt;
    }

    /**
     * Access method for idprof.
     *
     * @return the current value of idprof
     */
    public String getIdprof() {
        return idprof;
    }

    /**
     * Setter method for idprof.
     *
     * @param aIdprof the new value for idprof
     */
    public void setIdprof(String aIdprof) {
        idprof = aIdprof;
    }

    /**
     * Access method for idclasse.
     *
     * @return the current value of idclasse
     */
    public String getIdclasse() {
        return idclasse;
    }

    /**
     * Setter method for idclasse.
     *
     * @param aIdclasse the new value for idclasse
     */
    public void setIdclasse(String aIdclasse) {
        idclasse = aIdclasse;
    }

    /**
     * Access method for idcreneau.
     *
     * @return the current value of idcreneau
     */
    public String getIdcreneau() {
        return idcreneau;
    }

    /**
     * Setter method for idcreneau.
     *
     * @param aIdcreneau the new value for idcreneau
     */
    public void setIdcreneau(String aIdcreneau) {
        idcreneau = aIdcreneau;
    }

    /**
     * Access method for idagent.
     *
     * @return the current value of idagent
     */
    public String getIdagent() {
        return idagent;
    }

    /**
     * Setter method for idagent.
     *
     * @param aIdagent the new value for idagent
     */
    public void setIdagent(String aIdagent) {
        idagent = aIdagent;
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

    /**
     * Compares the key for this instance with another EspAbsenceList.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspAbsenceList and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspAbsenceList)) {
            return false;
        }
        EspAbsenceList that = (EspAbsenceList) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspAbsenceList.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspAbsenceList)) return false;
        return this.equalKeys(other) && ((EspAbsenceList)other).equalKeys(this);
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
        if (getId() == null) {
            i = 0;
        } else {
            i = getId().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspAbsenceList |");
        sb.append(" id=").append(getId());
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
        ret.put("id", getId());
        return ret;
    }

}
