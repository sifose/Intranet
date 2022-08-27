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

@Entity(name="ESP_DOMAINE_ENSEIGNEMENT")
@IdClass(EspDomaineEnseignement.EspDomaineEnseignementId.class)
public class EspDomaineEnseignement implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspDomaineEnseignementId implements Serializable {
        java.math.BigDecimal priode;
        java.lang.String anneeDeb;
        java.math.BigDecimal niveauScolaires;
        java.lang.String domaineEnseigement;
        java.lang.String ueEnseignement;
    }

    /** Primary key. */
    protected static final String PK = "EspDomaineEnseignementEspDomaineEnseignementPk";

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
    @Column(name="ANNEE_DEB", nullable=false, length=20)
    private String anneeDeb;
    @Id
    @Column(name="NIVEAU_SCOLAIRES", nullable=false)
    private BigDecimal niveauScolaires;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="DATE_MODIF")
    private LocalDateTime dateModif;
    @Id
    @Column(name="DOMAINE_ENSEIGEMENT", nullable=false, length=200)
    private String domaineEnseigement;
    @Id
    @Column(name="PRIODE", nullable=false)
    private BigDecimal priode;
    @Id
    @Column(name="UE_ENSEIGNEMENT", nullable=false, length=4000)
    private String ueEnseignement;
    @Column(name="DESCRIPTION_UE", length=4000)
    private String descriptionUe;

    /** Default constructor. */
    public EspDomaineEnseignement() {
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
     * Access method for niveauScolaires.
     *
     * @return the current value of niveauScolaires
     */
    public BigDecimal getNiveauScolaires() {
        return niveauScolaires;
    }

    /**
     * Setter method for niveauScolaires.
     *
     * @param aNiveauScolaires the new value for niveauScolaires
     */
    public void setNiveauScolaires(BigDecimal aNiveauScolaires) {
        niveauScolaires = aNiveauScolaires;
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
     * Access method for dateModif.
     *
     * @return the current value of dateModif
     */
    public LocalDateTime getDateModif() {
        return dateModif;
    }

    /**
     * Setter method for dateModif.
     *
     * @param aDateModif the new value for dateModif
     */
    public void setDateModif(LocalDateTime aDateModif) {
        dateModif = aDateModif;
    }

    /**
     * Access method for domaineEnseigement.
     *
     * @return the current value of domaineEnseigement
     */
    public String getDomaineEnseigement() {
        return domaineEnseigement;
    }

    /**
     * Setter method for domaineEnseigement.
     *
     * @param aDomaineEnseigement the new value for domaineEnseigement
     */
    public void setDomaineEnseigement(String aDomaineEnseigement) {
        domaineEnseigement = aDomaineEnseigement;
    }

    /**
     * Access method for priode.
     *
     * @return the current value of priode
     */
    public BigDecimal getPriode() {
        return priode;
    }

    /**
     * Setter method for priode.
     *
     * @param aPriode the new value for priode
     */
    public void setPriode(BigDecimal aPriode) {
        priode = aPriode;
    }

    /**
     * Access method for ueEnseignement.
     *
     * @return the current value of ueEnseignement
     */
    public String getUeEnseignement() {
        return ueEnseignement;
    }

    /**
     * Setter method for ueEnseignement.
     *
     * @param aUeEnseignement the new value for ueEnseignement
     */
    public void setUeEnseignement(String aUeEnseignement) {
        ueEnseignement = aUeEnseignement;
    }

    /**
     * Access method for descriptionUe.
     *
     * @return the current value of descriptionUe
     */
    public String getDescriptionUe() {
        return descriptionUe;
    }

    /**
     * Setter method for descriptionUe.
     *
     * @param aDescriptionUe the new value for descriptionUe
     */
    public void setDescriptionUe(String aDescriptionUe) {
        descriptionUe = aDescriptionUe;
    }

    /**
     * Compares the key for this instance with another EspDomaineEnseignement.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspDomaineEnseignement and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspDomaineEnseignement)) {
            return false;
        }
        EspDomaineEnseignement that = (EspDomaineEnseignement) other;
        Object myPriode = this.getPriode();
        Object yourPriode = that.getPriode();
        if (myPriode==null ? yourPriode!=null : !myPriode.equals(yourPriode)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myNiveauScolaires = this.getNiveauScolaires();
        Object yourNiveauScolaires = that.getNiveauScolaires();
        if (myNiveauScolaires==null ? yourNiveauScolaires!=null : !myNiveauScolaires.equals(yourNiveauScolaires)) {
            return false;
        }
        Object myDomaineEnseigement = this.getDomaineEnseigement();
        Object yourDomaineEnseigement = that.getDomaineEnseigement();
        if (myDomaineEnseigement==null ? yourDomaineEnseigement!=null : !myDomaineEnseigement.equals(yourDomaineEnseigement)) {
            return false;
        }
        Object myUeEnseignement = this.getUeEnseignement();
        Object yourUeEnseignement = that.getUeEnseignement();
        if (myUeEnseignement==null ? yourUeEnseignement!=null : !myUeEnseignement.equals(yourUeEnseignement)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspDomaineEnseignement.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspDomaineEnseignement)) return false;
        return this.equalKeys(other) && ((EspDomaineEnseignement)other).equalKeys(this);
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
        if (getPriode() == null) {
            i = 0;
        } else {
            i = getPriode().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getNiveauScolaires() == null) {
            i = 0;
        } else {
            i = getNiveauScolaires().hashCode();
        }
        result = 37*result + i;
        if (getDomaineEnseigement() == null) {
            i = 0;
        } else {
            i = getDomaineEnseigement().hashCode();
        }
        result = 37*result + i;
        if (getUeEnseignement() == null) {
            i = 0;
        } else {
            i = getUeEnseignement().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspDomaineEnseignement |");
        sb.append(" priode=").append(getPriode());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" niveauScolaires=").append(getNiveauScolaires());
        sb.append(" domaineEnseigement=").append(getDomaineEnseigement());
        sb.append(" ueEnseignement=").append(getUeEnseignement());
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
        ret.put("priode", getPriode());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("niveauScolaires", getNiveauScolaires());
        ret.put("domaineEnseigement", getDomaineEnseigement());
        ret.put("ueEnseignement", getUeEnseignement());
        return ret;
    }

}
