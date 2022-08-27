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

@Entity(name="ESP_DESCPLINE")
@IdClass(EspDescpline.EspDescplineId.class)
public class EspDescpline implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspDescplineId implements Serializable {
        java.lang.String anneeDeb;
        java.math.BigDecimal niveauScolaires;
        java.lang.String domaineEns;
    }

    /** Primary key. */
    protected static final String PK = "EspDescplineEspDescplinePk";

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
    @Column(name="DATE_MODIF", nullable=false)
    private LocalDateTime dateModif;
    @Column(name="DATE_SAISIE", nullable=false)
    private LocalDateTime dateSaisie;
    @Id
    @Column(name="DOMAINE_ENS", nullable=false, length=2)
    private String domaineEns;

    /** Default constructor. */
    public EspDescpline() {
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
     * Access method for domaineEns.
     *
     * @return the current value of domaineEns
     */
    public String getDomaineEns() {
        return domaineEns;
    }

    /**
     * Setter method for domaineEns.
     *
     * @param aDomaineEns the new value for domaineEns
     */
    public void setDomaineEns(String aDomaineEns) {
        domaineEns = aDomaineEns;
    }

    /**
     * Compares the key for this instance with another EspDescpline.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspDescpline and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspDescpline)) {
            return false;
        }
        EspDescpline that = (EspDescpline) other;
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
        Object myDomaineEns = this.getDomaineEns();
        Object yourDomaineEns = that.getDomaineEns();
        if (myDomaineEns==null ? yourDomaineEns!=null : !myDomaineEns.equals(yourDomaineEns)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspDescpline.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspDescpline)) return false;
        return this.equalKeys(other) && ((EspDescpline)other).equalKeys(this);
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
        if (getDomaineEns() == null) {
            i = 0;
        } else {
            i = getDomaineEns().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspDescpline |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" niveauScolaires=").append(getNiveauScolaires());
        sb.append(" domaineEns=").append(getDomaineEns());
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
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("niveauScolaires", getNiveauScolaires());
        ret.put("domaineEns", getDomaineEns());
        return ret;
    }

}
