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

@Entity(name="ESP_APPRECIATION")
@IdClass(EspAppreciation.EspAppreciationId.class)
public class EspAppreciation implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspAppreciationId implements Serializable {
        java.lang.String idEt;
        java.lang.String anneeDeb;
        java.math.BigDecimal priode;
        java.lang.String codeDe;
        java.lang.String niveauScolaires;
        java.lang.String codeUe;
    }

    /** Primary key. */
    protected static final String PK = "EspAppreciationEspAppreciationPk";

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
    @Column(name="ID_ET", nullable=false, length=20)
    private String idEt;
    @Column(name="APRECIATION", length=4000)
    private String apreciation;
    @Column(name="REMEDIATION", length=4000)
    private String remediation;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=20)
    private String anneeDeb;
    @Id
    @Column(name="PRIODE", nullable=false)
    private BigDecimal priode;
    @Column(name="DATE_SAISAIE", nullable=false)
    private LocalDateTime dateSaisaie;
    @Column(name="DATE_MODIF", nullable=false)
    private LocalDateTime dateModif;
    @Id
    @Column(name="CODE_DE", nullable=false, length=20)
    private String codeDe;
    @Id
    @Column(name="NIVEAU_SCOLAIRES", nullable=false, length=20)
    private String niveauScolaires;
    @Id
    @Column(name="CODE_UE", nullable=false, length=20)
    private String codeUe;

    /** Default constructor. */
    public EspAppreciation() {
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
     * Access method for apreciation.
     *
     * @return the current value of apreciation
     */
    public String getApreciation() {
        return apreciation;
    }

    /**
     * Setter method for apreciation.
     *
     * @param aApreciation the new value for apreciation
     */
    public void setApreciation(String aApreciation) {
        apreciation = aApreciation;
    }

    /**
     * Access method for remediation.
     *
     * @return the current value of remediation
     */
    public String getRemediation() {
        return remediation;
    }

    /**
     * Setter method for remediation.
     *
     * @param aRemediation the new value for remediation
     */
    public void setRemediation(String aRemediation) {
        remediation = aRemediation;
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
     * Access method for dateSaisaie.
     *
     * @return the current value of dateSaisaie
     */
    public LocalDateTime getDateSaisaie() {
        return dateSaisaie;
    }

    /**
     * Setter method for dateSaisaie.
     *
     * @param aDateSaisaie the new value for dateSaisaie
     */
    public void setDateSaisaie(LocalDateTime aDateSaisaie) {
        dateSaisaie = aDateSaisaie;
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
     * Access method for codeDe.
     *
     * @return the current value of codeDe
     */
    public String getCodeDe() {
        return codeDe;
    }

    /**
     * Setter method for codeDe.
     *
     * @param aCodeDe the new value for codeDe
     */
    public void setCodeDe(String aCodeDe) {
        codeDe = aCodeDe;
    }

    /**
     * Access method for niveauScolaires.
     *
     * @return the current value of niveauScolaires
     */
    public String getNiveauScolaires() {
        return niveauScolaires;
    }

    /**
     * Setter method for niveauScolaires.
     *
     * @param aNiveauScolaires the new value for niveauScolaires
     */
    public void setNiveauScolaires(String aNiveauScolaires) {
        niveauScolaires = aNiveauScolaires;
    }

    /**
     * Access method for codeUe.
     *
     * @return the current value of codeUe
     */
    public String getCodeUe() {
        return codeUe;
    }

    /**
     * Setter method for codeUe.
     *
     * @param aCodeUe the new value for codeUe
     */
    public void setCodeUe(String aCodeUe) {
        codeUe = aCodeUe;
    }

    /**
     * Compares the key for this instance with another EspAppreciation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspAppreciation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspAppreciation)) {
            return false;
        }
        EspAppreciation that = (EspAppreciation) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myPriode = this.getPriode();
        Object yourPriode = that.getPriode();
        if (myPriode==null ? yourPriode!=null : !myPriode.equals(yourPriode)) {
            return false;
        }
        Object myCodeDe = this.getCodeDe();
        Object yourCodeDe = that.getCodeDe();
        if (myCodeDe==null ? yourCodeDe!=null : !myCodeDe.equals(yourCodeDe)) {
            return false;
        }
        Object myNiveauScolaires = this.getNiveauScolaires();
        Object yourNiveauScolaires = that.getNiveauScolaires();
        if (myNiveauScolaires==null ? yourNiveauScolaires!=null : !myNiveauScolaires.equals(yourNiveauScolaires)) {
            return false;
        }
        Object myCodeUe = this.getCodeUe();
        Object yourCodeUe = that.getCodeUe();
        if (myCodeUe==null ? yourCodeUe!=null : !myCodeUe.equals(yourCodeUe)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspAppreciation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspAppreciation)) return false;
        return this.equalKeys(other) && ((EspAppreciation)other).equalKeys(this);
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
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getPriode() == null) {
            i = 0;
        } else {
            i = getPriode().hashCode();
        }
        result = 37*result + i;
        if (getCodeDe() == null) {
            i = 0;
        } else {
            i = getCodeDe().hashCode();
        }
        result = 37*result + i;
        if (getNiveauScolaires() == null) {
            i = 0;
        } else {
            i = getNiveauScolaires().hashCode();
        }
        result = 37*result + i;
        if (getCodeUe() == null) {
            i = 0;
        } else {
            i = getCodeUe().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspAppreciation |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" priode=").append(getPriode());
        sb.append(" codeDe=").append(getCodeDe());
        sb.append(" niveauScolaires=").append(getNiveauScolaires());
        sb.append(" codeUe=").append(getCodeUe());
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
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("priode", getPriode());
        ret.put("codeDe", getCodeDe());
        ret.put("niveauScolaires", getNiveauScolaires());
        ret.put("codeUe", getCodeUe());
        return ret;
    }

}
