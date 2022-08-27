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

@Entity(name="ESP_DISPONIBILITE_ENS")
@IdClass(EspDisponibiliteEns.EspDisponibiliteEnsId.class)
public class EspDisponibiliteEns implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspDisponibiliteEnsId implements Serializable {
        java.lang.String idDispo;
        java.lang.String anneeDeb;
    }

    /** Primary key. */
    protected static final String PK = "EspDisponibiliteEnsPkDispo";

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
    @Column(name="ID_DISPO", nullable=false, length=20)
    private String idDispo;
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="SEANCE_D")
    private BigDecimal seanceD;
    @Column(name="SEANCE_F")
    private BigDecimal seanceF;
    @Column(name="JOURS")
    private LocalDateTime jours;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=20)
    private String anneeDeb;
    @Column(name="DISPONIBLE", length=1)
    private String disponible;

    /** Default constructor. */
    public EspDisponibiliteEns() {
        super();
    }

    /**
     * Access method for idDispo.
     *
     * @return the current value of idDispo
     */
    public String getIdDispo() {
        return idDispo;
    }

    /**
     * Setter method for idDispo.
     *
     * @param aIdDispo the new value for idDispo
     */
    public void setIdDispo(String aIdDispo) {
        idDispo = aIdDispo;
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
     * Access method for seanceD.
     *
     * @return the current value of seanceD
     */
    public BigDecimal getSeanceD() {
        return seanceD;
    }

    /**
     * Setter method for seanceD.
     *
     * @param aSeanceD the new value for seanceD
     */
    public void setSeanceD(BigDecimal aSeanceD) {
        seanceD = aSeanceD;
    }

    /**
     * Access method for seanceF.
     *
     * @return the current value of seanceF
     */
    public BigDecimal getSeanceF() {
        return seanceF;
    }

    /**
     * Setter method for seanceF.
     *
     * @param aSeanceF the new value for seanceF
     */
    public void setSeanceF(BigDecimal aSeanceF) {
        seanceF = aSeanceF;
    }

    /**
     * Access method for jours.
     *
     * @return the current value of jours
     */
    public LocalDateTime getJours() {
        return jours;
    }

    /**
     * Setter method for jours.
     *
     * @param aJours the new value for jours
     */
    public void setJours(LocalDateTime aJours) {
        jours = aJours;
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
     * Access method for disponible.
     *
     * @return the current value of disponible
     */
    public String getDisponible() {
        return disponible;
    }

    /**
     * Setter method for disponible.
     *
     * @param aDisponible the new value for disponible
     */
    public void setDisponible(String aDisponible) {
        disponible = aDisponible;
    }

    /**
     * Compares the key for this instance with another EspDisponibiliteEns.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspDisponibiliteEns and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspDisponibiliteEns)) {
            return false;
        }
        EspDisponibiliteEns that = (EspDisponibiliteEns) other;
        Object myIdDispo = this.getIdDispo();
        Object yourIdDispo = that.getIdDispo();
        if (myIdDispo==null ? yourIdDispo!=null : !myIdDispo.equals(yourIdDispo)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspDisponibiliteEns.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspDisponibiliteEns)) return false;
        return this.equalKeys(other) && ((EspDisponibiliteEns)other).equalKeys(this);
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
        if (getIdDispo() == null) {
            i = 0;
        } else {
            i = getIdDispo().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspDisponibiliteEns |");
        sb.append(" idDispo=").append(getIdDispo());
        sb.append(" anneeDeb=").append(getAnneeDeb());
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
        ret.put("idDispo", getIdDispo());
        ret.put("anneeDeb", getAnneeDeb());
        return ret;
    }

}
