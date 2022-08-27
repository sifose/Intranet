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

@Entity(name="QUITUS")
public class Quitus implements Serializable {

    /** Primary key. */
    protected static final String PK = "idquitus";

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
    @Column(name="IDQUITUS", unique=true, nullable=false, precision=10)
    private BigDecimal idquitus;
    @Column(name="ENCADEUR", length=255)
    private String encadeur;
    @Column(name="COMITE", length=255)
    private String comite;
    @Column(name="ETATFINANCIER", length=255)
    private String etatfinancier;
    @Column(name="CREDIT", length=255)
    private String credit;
    @Column(name="DEPOTRAPPORT", length=255)
    private String depotrapport;
    @ManyToOne
    @JoinColumn(name="ETD_ID_ET")
    private EspEtudiant espEtudiant;

    /** Default constructor. */
    public Quitus() {
        super();
    }

    /**
     * Access method for idquitus.
     *
     * @return the current value of idquitus
     */
    public BigDecimal getIdquitus() {
        return idquitus;
    }

    /**
     * Setter method for idquitus.
     *
     * @param aIdquitus the new value for idquitus
     */
    public void setIdquitus(BigDecimal aIdquitus) {
        idquitus = aIdquitus;
    }

    /**
     * Access method for encadeur.
     *
     * @return the current value of encadeur
     */
    public String getEncadeur() {
        return encadeur;
    }

    /**
     * Setter method for encadeur.
     *
     * @param aEncadeur the new value for encadeur
     */
    public void setEncadeur(String aEncadeur) {
        encadeur = aEncadeur;
    }

    /**
     * Access method for comite.
     *
     * @return the current value of comite
     */
    public String getComite() {
        return comite;
    }

    /**
     * Setter method for comite.
     *
     * @param aComite the new value for comite
     */
    public void setComite(String aComite) {
        comite = aComite;
    }

    /**
     * Access method for etatfinancier.
     *
     * @return the current value of etatfinancier
     */
    public String getEtatfinancier() {
        return etatfinancier;
    }

    /**
     * Setter method for etatfinancier.
     *
     * @param aEtatfinancier the new value for etatfinancier
     */
    public void setEtatfinancier(String aEtatfinancier) {
        etatfinancier = aEtatfinancier;
    }

    /**
     * Access method for credit.
     *
     * @return the current value of credit
     */
    public String getCredit() {
        return credit;
    }

    /**
     * Setter method for credit.
     *
     * @param aCredit the new value for credit
     */
    public void setCredit(String aCredit) {
        credit = aCredit;
    }

    /**
     * Access method for depotrapport.
     *
     * @return the current value of depotrapport
     */
    public String getDepotrapport() {
        return depotrapport;
    }

    /**
     * Setter method for depotrapport.
     *
     * @param aDepotrapport the new value for depotrapport
     */
    public void setDepotrapport(String aDepotrapport) {
        depotrapport = aDepotrapport;
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
     * Compares the key for this instance with another Quitus.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Quitus and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Quitus)) {
            return false;
        }
        Quitus that = (Quitus) other;
        Object myIdquitus = this.getIdquitus();
        Object yourIdquitus = that.getIdquitus();
        if (myIdquitus==null ? yourIdquitus!=null : !myIdquitus.equals(yourIdquitus)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Quitus.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Quitus)) return false;
        return this.equalKeys(other) && ((Quitus)other).equalKeys(this);
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
        if (getIdquitus() == null) {
            i = 0;
        } else {
            i = getIdquitus().hashCode();
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
        StringBuffer sb = new StringBuffer("[Quitus |");
        sb.append(" idquitus=").append(getIdquitus());
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
        ret.put("idquitus", getIdquitus());
        return ret;
    }

}
