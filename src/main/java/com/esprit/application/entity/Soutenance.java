// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="SOUTENANCE")
public class Soutenance implements Serializable {

    /** Primary key. */
    protected static final String PK = "soutenanceid";

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
    @Column(name="SOUTENANCEID", unique=true, nullable=false, precision=10)
    private BigDecimal soutenanceid;
    @Column(name="DTE", length=255)
    private String dte;
    @Column(name="JURY", precision=10)
    private BigDecimal jury;
    @Column(name="HEURE", length=255)
    private String heure;
    @Column(name="REPPORTEUR", length=255)
    private String repporteur;
    @Column(name="ETAT", nullable=false, precision=1)
    private BigDecimal etat;
    @Column(name="IDRAPPORTEUR", length=255)
    private String idrapporteur;
    @ManyToOne
    @JoinColumn(name="PR_ID")
    private Presidentjury presidentjury;
    @ManyToOne
    @JoinColumn(name="ET_ID_ET")
    private EspEtudiant espEtudiant;
    @ManyToOne
    @JoinColumn(name="SESSIONSOUTENANCE_IDSOUTENANCE")
    private Sessionsoutenance sessionsoutenance;

    /** Default constructor. */
    public Soutenance() {
        super();
    }

    /**
     * Access method for soutenanceid.
     *
     * @return the current value of soutenanceid
     */
    public BigDecimal getSoutenanceid() {
        return soutenanceid;
    }

    /**
     * Setter method for soutenanceid.
     *
     * @param aSoutenanceid the new value for soutenanceid
     */
    public void setSoutenanceid(BigDecimal aSoutenanceid) {
        soutenanceid = aSoutenanceid;
    }

    /**
     * Access method for dte.
     *
     * @return the current value of dte
     */
    public String getDte() {
        return dte;
    }

    /**
     * Setter method for dte.
     *
     * @param aDte the new value for dte
     */
    public void setDte(String aDte) {
        dte = aDte;
    }

    /**
     * Access method for jury.
     *
     * @return the current value of jury
     */
    public BigDecimal getJury() {
        return jury;
    }

    /**
     * Setter method for jury.
     *
     * @param aJury the new value for jury
     */
    public void setJury(BigDecimal aJury) {
        jury = aJury;
    }

    /**
     * Access method for heure.
     *
     * @return the current value of heure
     */
    public String getHeure() {
        return heure;
    }

    /**
     * Setter method for heure.
     *
     * @param aHeure the new value for heure
     */
    public void setHeure(String aHeure) {
        heure = aHeure;
    }

    /**
     * Access method for repporteur.
     *
     * @return the current value of repporteur
     */
    public String getRepporteur() {
        return repporteur;
    }

    /**
     * Setter method for repporteur.
     *
     * @param aRepporteur the new value for repporteur
     */
    public void setRepporteur(String aRepporteur) {
        repporteur = aRepporteur;
    }

    /**
     * Access method for etat.
     *
     * @return the current value of etat
     */
    public BigDecimal getEtat() {
        return etat;
    }

    /**
     * Setter method for etat.
     *
     * @param aEtat the new value for etat
     */
    public void setEtat(BigDecimal aEtat) {
        etat = aEtat;
    }

    /**
     * Access method for idrapporteur.
     *
     * @return the current value of idrapporteur
     */
    public String getIdrapporteur() {
        return idrapporteur;
    }

    /**
     * Setter method for idrapporteur.
     *
     * @param aIdrapporteur the new value for idrapporteur
     */
    public void setIdrapporteur(String aIdrapporteur) {
        idrapporteur = aIdrapporteur;
    }

    /**
     * Access method for presidentjury.
     *
     * @return the current value of presidentjury
     */
    public Presidentjury getPresidentjury() {
        return presidentjury;
    }

    /**
     * Setter method for presidentjury.
     *
     * @param aPresidentjury the new value for presidentjury
     */
    public void setPresidentjury(Presidentjury aPresidentjury) {
        presidentjury = aPresidentjury;
    }

    /**
     * Access method for espEtudiant.
     *
     * @return the current value of espEtudiant
     */
    public EspEtudiant getEspEtudiant() {
        return espEtudiant;
    }

    /**
     * Setter method for espEtudiant.
     *
     * @param aEspEtudiant the new value for espEtudiant
     */
    public void setEspEtudiant(EspEtudiant aEspEtudiant) {
        espEtudiant = aEspEtudiant;
    }

    /**
     * Access method for sessionsoutenance.
     *
     * @return the current value of sessionsoutenance
     */
    public Sessionsoutenance getSessionsoutenance() {
        return sessionsoutenance;
    }

    /**
     * Setter method for sessionsoutenance.
     *
     * @param aSessionsoutenance the new value for sessionsoutenance
     */
    public void setSessionsoutenance(Sessionsoutenance aSessionsoutenance) {
        sessionsoutenance = aSessionsoutenance;
    }

    /**
     * Compares the key for this instance with another Soutenance.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Soutenance and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Soutenance)) {
            return false;
        }
        Soutenance that = (Soutenance) other;
        Object mySoutenanceid = this.getSoutenanceid();
        Object yourSoutenanceid = that.getSoutenanceid();
        if (mySoutenanceid==null ? yourSoutenanceid!=null : !mySoutenanceid.equals(yourSoutenanceid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Soutenance.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Soutenance)) return false;
        return this.equalKeys(other) && ((Soutenance)other).equalKeys(this);
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
        if (getSoutenanceid() == null) {
            i = 0;
        } else {
            i = getSoutenanceid().hashCode();
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
        StringBuffer sb = new StringBuffer("[Soutenance |");
        sb.append(" soutenanceid=").append(getSoutenanceid());
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
        ret.put("soutenanceid", getSoutenanceid());
        return ret;
    }

}
