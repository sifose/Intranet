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

@Entity(name="ESP_DIRECTION")
public class EspDirection implements Serializable {

    /** Primary key. */
    protected static final String PK = "idDr";

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
    @Column(name="ID_DR", unique=true, nullable=false, length=20)
    private String idDr;
    @Column(name="NOM_DR", nullable=false, length=20)
    private String nomDr;
    @Column(name="PNOM_DR", nullable=false, length=20)
    private String pnomDr;
    @Column(name="TITRE_DR", nullable=false, length=500)
    private String titreDr;
    @Column(name="DATE_REC")
    private LocalDateTime dateRec;
    @Column(name="ADRESSE_MAIL_ESP", nullable=false, length=50)
    private String adresseMailEsp;
    @Column(name="TEL", nullable=false, length=20)
    private String tel;
    @Column(name="DIPLOME", nullable=false, length=100)
    private String diplome;
    @Column(name="CIN_PASS", nullable=false, length=20)
    private String cinPass;

    /** Default constructor. */
    public EspDirection() {
        super();
    }

    /**
     * Access method for idDr.
     *
     * @return the current value of idDr
     */
    public String getIdDr() {
        return idDr;
    }

    /**
     * Setter method for idDr.
     *
     * @param aIdDr the new value for idDr
     */
    public void setIdDr(String aIdDr) {
        idDr = aIdDr;
    }

    /**
     * Access method for nomDr.
     *
     * @return the current value of nomDr
     */
    public String getNomDr() {
        return nomDr;
    }

    /**
     * Setter method for nomDr.
     *
     * @param aNomDr the new value for nomDr
     */
    public void setNomDr(String aNomDr) {
        nomDr = aNomDr;
    }

    /**
     * Access method for pnomDr.
     *
     * @return the current value of pnomDr
     */
    public String getPnomDr() {
        return pnomDr;
    }

    /**
     * Setter method for pnomDr.
     *
     * @param aPnomDr the new value for pnomDr
     */
    public void setPnomDr(String aPnomDr) {
        pnomDr = aPnomDr;
    }

    /**
     * Access method for titreDr.
     *
     * @return the current value of titreDr
     */
    public String getTitreDr() {
        return titreDr;
    }

    /**
     * Setter method for titreDr.
     *
     * @param aTitreDr the new value for titreDr
     */
    public void setTitreDr(String aTitreDr) {
        titreDr = aTitreDr;
    }

    /**
     * Access method for dateRec.
     *
     * @return the current value of dateRec
     */
    public LocalDateTime getDateRec() {
        return dateRec;
    }

    /**
     * Setter method for dateRec.
     *
     * @param aDateRec the new value for dateRec
     */
    public void setDateRec(LocalDateTime aDateRec) {
        dateRec = aDateRec;
    }

    /**
     * Access method for adresseMailEsp.
     *
     * @return the current value of adresseMailEsp
     */
    public String getAdresseMailEsp() {
        return adresseMailEsp;
    }

    /**
     * Setter method for adresseMailEsp.
     *
     * @param aAdresseMailEsp the new value for adresseMailEsp
     */
    public void setAdresseMailEsp(String aAdresseMailEsp) {
        adresseMailEsp = aAdresseMailEsp;
    }

    /**
     * Access method for tel.
     *
     * @return the current value of tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * Setter method for tel.
     *
     * @param aTel the new value for tel
     */
    public void setTel(String aTel) {
        tel = aTel;
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
     * Access method for cinPass.
     *
     * @return the current value of cinPass
     */
    public String getCinPass() {
        return cinPass;
    }

    /**
     * Setter method for cinPass.
     *
     * @param aCinPass the new value for cinPass
     */
    public void setCinPass(String aCinPass) {
        cinPass = aCinPass;
    }

    /**
     * Compares the key for this instance with another EspDirection.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspDirection and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspDirection)) {
            return false;
        }
        EspDirection that = (EspDirection) other;
        Object myIdDr = this.getIdDr();
        Object yourIdDr = that.getIdDr();
        if (myIdDr==null ? yourIdDr!=null : !myIdDr.equals(yourIdDr)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspDirection.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspDirection)) return false;
        return this.equalKeys(other) && ((EspDirection)other).equalKeys(this);
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
        if (getIdDr() == null) {
            i = 0;
        } else {
            i = getIdDr().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspDirection |");
        sb.append(" idDr=").append(getIdDr());
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
        ret.put("idDr", getIdDr());
        return ret;
    }

}
