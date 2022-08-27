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
import javax.persistence.Version;

@Entity(name="ESP_TEMP_ETUDIANT_ENREG")
public class EspTempEtudiantEnreg implements Serializable {

    /** Primary key. */
    protected static final String PK = "idEt";

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
    @Column(name="ID_ET", unique=true, nullable=false, length=16)
    private String idEt;
    @Column(name="ID_ENS_ENTRETIEN", length=10)
    private String idEnsEntretien;
    @Column(name="SCORE_ENTRETIEN", precision=10, scale=6)
    private BigDecimal scoreEntretien;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;

    /** Default constructor. */
    public EspTempEtudiantEnreg() {
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
     * Access method for idEnsEntretien.
     *
     * @return the current value of idEnsEntretien
     */
    public String getIdEnsEntretien() {
        return idEnsEntretien;
    }

    /**
     * Setter method for idEnsEntretien.
     *
     * @param aIdEnsEntretien the new value for idEnsEntretien
     */
    public void setIdEnsEntretien(String aIdEnsEntretien) {
        idEnsEntretien = aIdEnsEntretien;
    }

    /**
     * Access method for scoreEntretien.
     *
     * @return the current value of scoreEntretien
     */
    public BigDecimal getScoreEntretien() {
        return scoreEntretien;
    }

    /**
     * Setter method for scoreEntretien.
     *
     * @param aScoreEntretien the new value for scoreEntretien
     */
    public void setScoreEntretien(BigDecimal aScoreEntretien) {
        scoreEntretien = aScoreEntretien;
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
     * Compares the key for this instance with another EspTempEtudiantEnreg.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspTempEtudiantEnreg and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspTempEtudiantEnreg)) {
            return false;
        }
        EspTempEtudiantEnreg that = (EspTempEtudiantEnreg) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspTempEtudiantEnreg.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspTempEtudiantEnreg)) return false;
        return this.equalKeys(other) && ((EspTempEtudiantEnreg)other).equalKeys(this);
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
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EspTempEtudiantEnreg |");
        sb.append(" idEt=").append(getIdEt());
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
        return ret;
    }

}
