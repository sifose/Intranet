// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;


@Entity
public class EspBlacklist implements Serializable {

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

    @Column(name="ID_ET", length=10)
    private String idEt;
    @Column(name="NUM_CPT", length=20)
    private String numCpt;
    @Column(name="NOM_ET", length=30)
    private String nomEt;
    @Column(name="PNOM_ET", length=30)
    private String pnomEt;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Column(name="MONT_FRAIS", precision=10, scale=3)
    private BigDecimal montFrais;
    @Column(name="MONT_REGLE", precision=10, scale=3)
    private BigDecimal montRegle;
    @Column(name="TAUX_60", precision=10, scale=3)
    private BigDecimal taux60;
    @Column(name="RESTE_SUR_TAUX60", precision=10, scale=3)
    private BigDecimal resteSurTaux60;
    @Column(name="CA_ANNUEL", precision=10, scale=3)
    private BigDecimal caAnnuel;
    @Column(name="PAIEMENT", precision=10, scale=3)
    private BigDecimal paiement;
    @Column(name="SOLDE_ACTUEL", precision=10, scale=3)
    private BigDecimal soldeActuel;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspBlacklist() {
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
     * Access method for numCpt.
     *
     * @return the current value of numCpt
     */
    public String getNumCpt() {
        return numCpt;
    }

    /**
     * Setter method for numCpt.
     *
     * @param aNumCpt the new value for numCpt
     */
    public void setNumCpt(String aNumCpt) {
        numCpt = aNumCpt;
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
     * Access method for pnomEt.
     *
     * @return the current value of pnomEt
     */
    public String getPnomEt() {
        return pnomEt;
    }

    /**
     * Setter method for pnomEt.
     *
     * @param aPnomEt the new value for pnomEt
     */
    public void setPnomEt(String aPnomEt) {
        pnomEt = aPnomEt;
    }

    /**
     * Access method for codeCl.
     *
     * @return the current value of codeCl
     */
    public String getCodeCl() {
        return codeCl;
    }

    /**
     * Setter method for codeCl.
     *
     * @param aCodeCl the new value for codeCl
     */
    public void setCodeCl(String aCodeCl) {
        codeCl = aCodeCl;
    }

    /**
     * Access method for montFrais.
     *
     * @return the current value of montFrais
     */
    public BigDecimal getMontFrais() {
        return montFrais;
    }

    /**
     * Setter method for montFrais.
     *
     * @param aMontFrais the new value for montFrais
     */
    public void setMontFrais(BigDecimal aMontFrais) {
        montFrais = aMontFrais;
    }

    /**
     * Access method for montRegle.
     *
     * @return the current value of montRegle
     */
    public BigDecimal getMontRegle() {
        return montRegle;
    }

    /**
     * Setter method for montRegle.
     *
     * @param aMontRegle the new value for montRegle
     */
    public void setMontRegle(BigDecimal aMontRegle) {
        montRegle = aMontRegle;
    }

    /**
     * Access method for taux60.
     *
     * @return the current value of taux60
     */
    public BigDecimal getTaux60() {
        return taux60;
    }

    /**
     * Setter method for taux60.
     *
     * @param aTaux60 the new value for taux60
     */
    public void setTaux60(BigDecimal aTaux60) {
        taux60 = aTaux60;
    }

    /**
     * Access method for resteSurTaux60.
     *
     * @return the current value of resteSurTaux60
     */
    public BigDecimal getResteSurTaux60() {
        return resteSurTaux60;
    }

    /**
     * Setter method for resteSurTaux60.
     *
     * @param aResteSurTaux60 the new value for resteSurTaux60
     */
    public void setResteSurTaux60(BigDecimal aResteSurTaux60) {
        resteSurTaux60 = aResteSurTaux60;
    }

    /**
     * Access method for caAnnuel.
     *
     * @return the current value of caAnnuel
     */
    public BigDecimal getCaAnnuel() {
        return caAnnuel;
    }

    /**
     * Setter method for caAnnuel.
     *
     * @param aCaAnnuel the new value for caAnnuel
     */
    public void setCaAnnuel(BigDecimal aCaAnnuel) {
        caAnnuel = aCaAnnuel;
    }

    /**
     * Access method for paiement.
     *
     * @return the current value of paiement
     */
    public BigDecimal getPaiement() {
        return paiement;
    }

    /**
     * Setter method for paiement.
     *
     * @param aPaiement the new value for paiement
     */
    public void setPaiement(BigDecimal aPaiement) {
        paiement = aPaiement;
    }

    /**
     * Access method for soldeActuel.
     *
     * @return the current value of soldeActuel
     */
    public BigDecimal getSoldeActuel() {
        return soldeActuel;
    }

    /**
     * Setter method for soldeActuel.
     *
     * @param aSoldeActuel the new value for soldeActuel
     */
    public void setSoldeActuel(BigDecimal aSoldeActuel) {
        soldeActuel = aSoldeActuel;
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(BigDecimal aId) {
        id = aId;
    }

}
