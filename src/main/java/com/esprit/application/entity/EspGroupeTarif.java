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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_GROUPE_TARIF")
@IdClass(EspGroupeTarif.EspGroupeTarifId.class)
public class EspGroupeTarif implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspGroupeTarifId implements Serializable {
        EspSaisonUniversitaire espSaisonUniversitaire;
        java.lang.String codeGrp;
    }

    /** Primary key. */
    protected static final String PK = "EspGroupeTarifPkGroupeTarif";

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
    @Column(name="CODE_GRP", nullable=false, length=2)
    private String codeGrp;
    @Column(name="LIBELLE_GRP", length=50)
    private String libelleGrp;
    @Column(name="MONTANT_TARIF", precision=18, scale=6)
    private BigDecimal montantTarif;
    @Column(name="MONTANT_TRANCHE1", precision=18, scale=6)
    private BigDecimal montantTranche1;
    @Column(name="ECHEANCE_TRANCHE1")
    private LocalDateTime echeanceTranche1;
    @Column(name="MONTANT_TRANCHE2", precision=18, scale=6)
    private BigDecimal montantTranche2;
    @Column(name="ECHEANCE_TRANCHE2")
    private LocalDateTime echeanceTranche2;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="DATE_MAJ")
    private LocalDateTime dateMaj;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ANNEE_DEB", nullable=false)
    private EspSaisonUniversitaire espSaisonUniversitaire;

    /** Default constructor. */
    public EspGroupeTarif() {
        super();
    }

    /**
     * Access method for codeGrp.
     *
     * @return the current value of codeGrp
     */
    public String getCodeGrp() {
        return codeGrp;
    }

    /**
     * Setter method for codeGrp.
     *
     * @param aCodeGrp the new value for codeGrp
     */
    public void setCodeGrp(String aCodeGrp) {
        codeGrp = aCodeGrp;
    }

    /**
     * Access method for libelleGrp.
     *
     * @return the current value of libelleGrp
     */
    public String getLibelleGrp() {
        return libelleGrp;
    }

    /**
     * Setter method for libelleGrp.
     *
     * @param aLibelleGrp the new value for libelleGrp
     */
    public void setLibelleGrp(String aLibelleGrp) {
        libelleGrp = aLibelleGrp;
    }

    /**
     * Access method for montantTarif.
     *
     * @return the current value of montantTarif
     */
    public BigDecimal getMontantTarif() {
        return montantTarif;
    }

    /**
     * Setter method for montantTarif.
     *
     * @param aMontantTarif the new value for montantTarif
     */
    public void setMontantTarif(BigDecimal aMontantTarif) {
        montantTarif = aMontantTarif;
    }

    /**
     * Access method for montantTranche1.
     *
     * @return the current value of montantTranche1
     */
    public BigDecimal getMontantTranche1() {
        return montantTranche1;
    }

    /**
     * Setter method for montantTranche1.
     *
     * @param aMontantTranche1 the new value for montantTranche1
     */
    public void setMontantTranche1(BigDecimal aMontantTranche1) {
        montantTranche1 = aMontantTranche1;
    }

    /**
     * Access method for echeanceTranche1.
     *
     * @return the current value of echeanceTranche1
     */
    public LocalDateTime getEcheanceTranche1() {
        return echeanceTranche1;
    }

    /**
     * Setter method for echeanceTranche1.
     *
     * @param aEcheanceTranche1 the new value for echeanceTranche1
     */
    public void setEcheanceTranche1(LocalDateTime aEcheanceTranche1) {
        echeanceTranche1 = aEcheanceTranche1;
    }

    /**
     * Access method for montantTranche2.
     *
     * @return the current value of montantTranche2
     */
    public BigDecimal getMontantTranche2() {
        return montantTranche2;
    }

    /**
     * Setter method for montantTranche2.
     *
     * @param aMontantTranche2 the new value for montantTranche2
     */
    public void setMontantTranche2(BigDecimal aMontantTranche2) {
        montantTranche2 = aMontantTranche2;
    }

    /**
     * Access method for echeanceTranche2.
     *
     * @return the current value of echeanceTranche2
     */
    public LocalDateTime getEcheanceTranche2() {
        return echeanceTranche2;
    }

    /**
     * Setter method for echeanceTranche2.
     *
     * @param aEcheanceTranche2 the new value for echeanceTranche2
     */
    public void setEcheanceTranche2(LocalDateTime aEcheanceTranche2) {
        echeanceTranche2 = aEcheanceTranche2;
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
     * Access method for dateMaj.
     *
     * @return the current value of dateMaj
     */
    public LocalDateTime getDateMaj() {
        return dateMaj;
    }

    /**
     * Setter method for dateMaj.
     *
     * @param aDateMaj the new value for dateMaj
     */
    public void setDateMaj(LocalDateTime aDateMaj) {
        dateMaj = aDateMaj;
    }

    /**
     * Access method for espSaisonUniversitaire.
     *
     * @return the current value of espSaisonUniversitaire
     */
    public EspSaisonUniversitaire getEspSaisonUniversitaire() {
        return espSaisonUniversitaire;
    }

    /**
     * Setter method for espSaisonUniversitaire.
     *
     * @param aEspSaisonUniversitaire the new value for espSaisonUniversitaire
     */
    public void setEspSaisonUniversitaire(EspSaisonUniversitaire aEspSaisonUniversitaire) {
        espSaisonUniversitaire = aEspSaisonUniversitaire;
    }

    /** Temporary value holder for group key fragment espSaisonUniversitaireAnneeDeb */
    private transient String tempEspSaisonUniversitaireAnneeDeb;

    /**
     * Gets the key fragment anneeDeb for member espSaisonUniversitaire.
     * If this.espSaisonUniversitaire is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspSaisonUniversitaireAnneeDeb.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspSaisonUniversitaire
     */
    public String getEspSaisonUniversitaireAnneeDeb() {
        return (getEspSaisonUniversitaire() == null ? tempEspSaisonUniversitaireAnneeDeb : getEspSaisonUniversitaire().getAnneeDeb());
    }

    /**
     * Sets the key fragment anneeDeb from member espSaisonUniversitaire.
     * If this.espSaisonUniversitaire is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspSaisonUniversitaireAnneeDeb.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAnneeDeb New value for the key fragment
     * @see EspSaisonUniversitaire
     */
    public void setEspSaisonUniversitaireAnneeDeb(String aAnneeDeb) {
        if (getEspSaisonUniversitaire() == null) {
            tempEspSaisonUniversitaireAnneeDeb = aAnneeDeb;
        } else {
            getEspSaisonUniversitaire().setAnneeDeb(aAnneeDeb);
        }
    }

    /**
     * Compares the key for this instance with another EspGroupeTarif.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspGroupeTarif and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspGroupeTarif)) {
            return false;
        }
        EspGroupeTarif that = (EspGroupeTarif) other;
        Object myEspSaisonUniversitaireAnneeDeb = this.getEspSaisonUniversitaireAnneeDeb();
        Object yourEspSaisonUniversitaireAnneeDeb = that.getEspSaisonUniversitaireAnneeDeb();
        if (myEspSaisonUniversitaireAnneeDeb==null ? yourEspSaisonUniversitaireAnneeDeb!=null : !myEspSaisonUniversitaireAnneeDeb.equals(yourEspSaisonUniversitaireAnneeDeb)) {
            return false;
        }
        Object myCodeGrp = this.getCodeGrp();
        Object yourCodeGrp = that.getCodeGrp();
        if (myCodeGrp==null ? yourCodeGrp!=null : !myCodeGrp.equals(yourCodeGrp)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspGroupeTarif.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspGroupeTarif)) return false;
        return this.equalKeys(other) && ((EspGroupeTarif)other).equalKeys(this);
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
        if (getEspSaisonUniversitaireAnneeDeb() == null) {
            i = 0;
        } else {
            i = getEspSaisonUniversitaireAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getCodeGrp() == null) {
            i = 0;
        } else {
            i = getCodeGrp().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspGroupeTarif |");
        sb.append(" espSaisonUniversitaireAnneeDeb=").append(getEspSaisonUniversitaireAnneeDeb());
        sb.append(" codeGrp=").append(getCodeGrp());
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
        ret.put("espSaisonUniversitaireAnneeDeb", getEspSaisonUniversitaireAnneeDeb());
        ret.put("codeGrp", getCodeGrp());
        return ret;
    }

}
