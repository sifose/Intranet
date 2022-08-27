// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="ESP_CONTRAT")
public class EspContrat implements Serializable {

    /** Primary key. */
    protected static final String PK = "numord";

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
    @Column(name="NUMORD", unique=true, nullable=false, length=10)
    private String numord;
    @Column(name="ANNEE", nullable=false, length=4)
    private String annee;
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;
    @Column(name="DATE_ETAB", nullable=false)
    private LocalDateTime dateEtab;
    @Column(name="DIPLOME", nullable=false, length=2)
    private String diplome;
    @Column(name="GRADE", nullable=false, length=2)
    private String grade;
    @Column(name="INSTITUTION", nullable=false, length=40)
    private String institution;

    /** Default constructor. */
    public EspContrat() {
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
     * Access method for annee.
     *
     * @return the current value of annee
     */
    public String getAnnee() {
        return annee;
    }

    /**
     * Setter method for annee.
     *
     * @param aAnnee the new value for annee
     */
    public void setAnnee(String aAnnee) {
        annee = aAnnee;
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
     * Access method for dateEtab.
     *
     * @return the current value of dateEtab
     */
    public LocalDateTime getDateEtab() {
        return dateEtab;
    }

    /**
     * Setter method for dateEtab.
     *
     * @param aDateEtab the new value for dateEtab
     */
    public void setDateEtab(LocalDateTime aDateEtab) {
        dateEtab = aDateEtab;
    }

    /**
     * Access method for diplome.
     *
     * @return the current value of diplome
     */
    public String getDiplome() {
        return diplome;
    }

    /**
     * Setter method for diplome.
     *
     * @param aDiplome the new value for diplome
     */
    public void setDiplome(String aDiplome) {
        diplome = aDiplome;
    }

    /**
     * Access method for grade.
     *
     * @return the current value of grade
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Setter method for grade.
     *
     * @param aGrade the new value for grade
     */
    public void setGrade(String aGrade) {
        grade = aGrade;
    }

    /**
     * Access method for institution.
     *
     * @return the current value of institution
     */
    public String getInstitution() {
        return institution;
    }

    /**
     * Setter method for institution.
     *
     * @param aInstitution the new value for institution
     */
    public void setInstitution(String aInstitution) {
        institution = aInstitution;
    }

    /**
     * Compares the key for this instance with another EspContrat.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspContrat and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspContrat)) {
            return false;
        }
        EspContrat that = (EspContrat) other;
        Object myNumord = this.getNumord();
        Object yourNumord = that.getNumord();
        if (myNumord==null ? yourNumord!=null : !myNumord.equals(yourNumord)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspContrat.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspContrat)) return false;
        return this.equalKeys(other) && ((EspContrat)other).equalKeys(this);
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
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EspContrat |");
        sb.append(" numord=").append(getNumord());
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
        return ret;
    }

}
