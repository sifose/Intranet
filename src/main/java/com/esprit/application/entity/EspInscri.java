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

@Entity(name="ESP_INSCRI")
public class EspInscri implements Serializable {

    /** Primary key. */
    protected static final String PK = "idInscription";

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
    @Column(name="ID_INSCRIPTION", unique=true, nullable=false)
    private BigDecimal idInscription;
    @Column(name="NOM_ET", nullable=false, length=20)
    private String nomEt;
    @Column(name="PRENOM_ET", nullable=false, length=20)
    private String prenomEt;
    @Column(name="ADRESSE_ET", nullable=false, length=100)
    private String adresseEt;
    @Column(name="DATE_MISEJOUR", nullable=false)
    private LocalDateTime dateMisejour;
    @Column(name="DATE_INS", nullable=false)
    private LocalDateTime dateIns;
    @Column(name="HEURE_INS", nullable=false, length=20)
    private String heureIns;
    @Column(name="NOM_JETON", nullable=false, length=20)
    private String nomJeton;
    @Column(name="ID_ET", nullable=false, length=20)
    private String idEt;

    /** Default constructor. */
    public EspInscri() {
        super();
    }

    /**
     * Access method for idInscription.
     *
     * @return the current value of idInscription
     */
    public BigDecimal getIdInscription() {
        return idInscription;
    }

    /**
     * Setter method for idInscription.
     *
     * @param aIdInscription the new value for idInscription
     */
    public void setIdInscription(BigDecimal aIdInscription) {
        idInscription = aIdInscription;
    }

    /**
     * Access method for nomEt.
     *
     * @return the current value of nomEt
     */
    public String getNomEt() {
        return nomEt;
    }

    /**
     * Setter method for nomEt.
     *
     * @param aNomEt the new value for nomEt
     */
    public void setNomEt(String aNomEt) {
        nomEt = aNomEt;
    }

    /**
     * Access method for prenomEt.
     *
     * @return the current value of prenomEt
     */
    public String getPrenomEt() {
        return prenomEt;
    }

    /**
     * Setter method for prenomEt.
     *
     * @param aPrenomEt the new value for prenomEt
     */
    public void setPrenomEt(String aPrenomEt) {
        prenomEt = aPrenomEt;
    }

    /**
     * Access method for adresseEt.
     *
     * @return the current value of adresseEt
     */
    public String getAdresseEt() {
        return adresseEt;
    }

    /**
     * Setter method for adresseEt.
     *
     * @param aAdresseEt the new value for adresseEt
     */
    public void setAdresseEt(String aAdresseEt) {
        adresseEt = aAdresseEt;
    }

    /**
     * Access method for dateMisejour.
     *
     * @return the current value of dateMisejour
     */
    public LocalDateTime getDateMisejour() {
        return dateMisejour;
    }

    /**
     * Setter method for dateMisejour.
     *
     * @param aDateMisejour the new value for dateMisejour
     */
    public void setDateMisejour(LocalDateTime aDateMisejour) {
        dateMisejour = aDateMisejour;
    }

    /**
     * Access method for dateIns.
     *
     * @return the current value of dateIns
     */
    public LocalDateTime getDateIns() {
        return dateIns;
    }

    /**
     * Setter method for dateIns.
     *
     * @param aDateIns the new value for dateIns
     */
    public void setDateIns(LocalDateTime aDateIns) {
        dateIns = aDateIns;
    }

    /**
     * Access method for heureIns.
     *
     * @return the current value of heureIns
     */
    public String getHeureIns() {
        return heureIns;
    }

    /**
     * Setter method for heureIns.
     *
     * @param aHeureIns the new value for heureIns
     */
    public void setHeureIns(String aHeureIns) {
        heureIns = aHeureIns;
    }

    /**
     * Access method for nomJeton.
     *
     * @return the current value of nomJeton
     */
    public String getNomJeton() {
        return nomJeton;
    }

    /**
     * Setter method for nomJeton.
     *
     * @param aNomJeton the new value for nomJeton
     */
    public void setNomJeton(String aNomJeton) {
        nomJeton = aNomJeton;
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
     * Compares the key for this instance with another EspInscri.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspInscri and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspInscri)) {
            return false;
        }
        EspInscri that = (EspInscri) other;
        Object myIdInscription = this.getIdInscription();
        Object yourIdInscription = that.getIdInscription();
        if (myIdInscription==null ? yourIdInscription!=null : !myIdInscription.equals(yourIdInscription)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspInscri.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspInscri)) return false;
        return this.equalKeys(other) && ((EspInscri)other).equalKeys(this);
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
        if (getIdInscription() == null) {
            i = 0;
        } else {
            i = getIdInscription().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspInscri |");
        sb.append(" idInscription=").append(getIdInscription());
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
        ret.put("idInscription", getIdInscription());
        return ret;
    }

}
