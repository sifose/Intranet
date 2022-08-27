// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_REGLEMENT_ONLINE")
@IdClass(EspReglementOnline.EspReglementOnlineId.class)
public class EspReglementOnline implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspReglementOnlineId implements Serializable {
        EspEtudiant espEtudiant;
        java.lang.String anneeDeb;
        java.time.LocalDateTime dateRglt;
    }

    /** Primary key. */
    protected static final String PK = "EspReglementOnlinePkReglement";

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
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Id
    @Column(name="DATE_RGLT", nullable=false)
    private LocalDateTime dateRglt;
    @Column(name="MOTIF_RGLT", length=50)
    private String motifRglt;
    @Column(name="ANNEE_RGLT", length=4)
    private String anneeRglt;
    @Column(name="RGLT_VERIDFIE", length=1)
    private String rgltVeridfie;
    @Column(name="COMPTABILISE", length=1)
    private String comptabilise;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ID_ET", nullable=false)
    private EspEtudiant espEtudiant;

    /** Default constructor. */
    public EspReglementOnline() {
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
     * Access method for dateRglt.
     *
     * @return the current value of dateRglt
     */
    public LocalDateTime getDateRglt() {
        return dateRglt;
    }

    /**
     * Setter method for dateRglt.
     *
     * @param aDateRglt the new value for dateRglt
     */
    public void setDateRglt(LocalDateTime aDateRglt) {
        dateRglt = aDateRglt;
    }

    /**
     * Access method for motifRglt.
     *
     * @return the current value of motifRglt
     */
    public String getMotifRglt() {
        return motifRglt;
    }

    /**
     * Setter method for motifRglt.
     *
     * @param aMotifRglt the new value for motifRglt
     */
    public void setMotifRglt(String aMotifRglt) {
        motifRglt = aMotifRglt;
    }

    /**
     * Access method for anneeRglt.
     *
     * @return the current value of anneeRglt
     */
    public String getAnneeRglt() {
        return anneeRglt;
    }

    /**
     * Setter method for anneeRglt.
     *
     * @param aAnneeRglt the new value for anneeRglt
     */
    public void setAnneeRglt(String aAnneeRglt) {
        anneeRglt = aAnneeRglt;
    }

    /**
     * Access method for rgltVeridfie.
     *
     * @return the current value of rgltVeridfie
     */
    public String getRgltVeridfie() {
        return rgltVeridfie;
    }

    /**
     * Setter method for rgltVeridfie.
     *
     * @param aRgltVeridfie the new value for rgltVeridfie
     */
    public void setRgltVeridfie(String aRgltVeridfie) {
        rgltVeridfie = aRgltVeridfie;
    }

    /**
     * Access method for comptabilise.
     *
     * @return the current value of comptabilise
     */
    public String getComptabilise() {
        return comptabilise;
    }

    /**
     * Setter method for comptabilise.
     *
     * @param aComptabilise the new value for comptabilise
     */
    public void setComptabilise(String aComptabilise) {
        comptabilise = aComptabilise;
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

    /** Temporary value holder for group key fragment espEtudiantIdEt */
    private transient String tempEspEtudiantIdEt;

    /**
     * Gets the key fragment idEt for member espEtudiant.
     * If this.espEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspEtudiantIdEt.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspEtudiant
     */
    public String getEspEtudiantIdEt() {
        return (getEspEtudiant() == null ? tempEspEtudiantIdEt : getEspEtudiant().getIdEt());
    }

    /**
     * Sets the key fragment idEt from member espEtudiant.
     * If this.espEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspEtudiantIdEt.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdEt New value for the key fragment
     * @see EspEtudiant
     */
    public void setEspEtudiantIdEt(String aIdEt) {
        if (getEspEtudiant() == null) {
            tempEspEtudiantIdEt = aIdEt;
        } else {
            getEspEtudiant().setIdEt(aIdEt);
        }
    }

    /**
     * Compares the key for this instance with another EspReglementOnline.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspReglementOnline and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspReglementOnline)) {
            return false;
        }
        EspReglementOnline that = (EspReglementOnline) other;
        Object myEspEtudiantIdEt = this.getEspEtudiantIdEt();
        Object yourEspEtudiantIdEt = that.getEspEtudiantIdEt();
        if (myEspEtudiantIdEt==null ? yourEspEtudiantIdEt!=null : !myEspEtudiantIdEt.equals(yourEspEtudiantIdEt)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myDateRglt = this.getDateRglt();
        Object yourDateRglt = that.getDateRglt();
        if (myDateRglt==null ? yourDateRglt!=null : !myDateRglt.equals(yourDateRglt)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspReglementOnline.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspReglementOnline)) return false;
        return this.equalKeys(other) && ((EspReglementOnline)other).equalKeys(this);
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
        if (getEspEtudiantIdEt() == null) {
            i = 0;
        } else {
            i = getEspEtudiantIdEt().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getDateRglt() == null) {
            i = 0;
        } else {
            i = getDateRglt().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspReglementOnline |");
        sb.append(" espEtudiantIdEt=").append(getEspEtudiantIdEt());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" dateRglt=").append(getDateRglt());
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
        ret.put("espEtudiantIdEt", getEspEtudiantIdEt());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("dateRglt", getDateRglt());
        return ret;
    }

}
