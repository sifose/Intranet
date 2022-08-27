// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="ESP_CREDIT_PANIER", indexes={@Index(name="espCreditPanierEspCreditPanierX", columnList="ID_ET,NIVEAU_ET_CREDIT,NUM_PANIER,ANNEE_DEB,TYPE_CREDIT", unique=true)})
public class EspCreditPanier implements Serializable {

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

    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="SEMESTRE", precision=1)
    private BigDecimal semestre;
    @Id
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Column(name="NUM_PANIER", nullable=false, length=5)
    private String numPanier;
    @Column(name="LIB_PANIER", length=200)
    private String libPanier;
    @Column(name="TYPE_CREDIT", nullable=false, length=1)
    private String typeCredit;
    @Column(name="ETAT_CREDIT", length=1)
    private String etatCredit;
    @Column(name="DATE_VALIDATION")
    private LocalDateTime dateValidation;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Column(name="NIVEAU_ET_CREDIT", nullable=false, precision=1)
    private BigDecimal niveauEtCredit;

    /** Default constructor. */
    public EspCreditPanier() {
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
     * Access method for semestre.
     *
     * @return the current value of semestre
     */
    public BigDecimal getSemestre() {
        return semestre;
    }

    /**
     * Setter method for semestre.
     *
     * @param aSemestre the new value for semestre
     */
    public void setSemestre(BigDecimal aSemestre) {
        semestre = aSemestre;
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
     * Access method for numPanier.
     *
     * @return the current value of numPanier
     */
    public String getNumPanier() {
        return numPanier;
    }

    /**
     * Setter method for numPanier.
     *
     * @param aNumPanier the new value for numPanier
     */
    public void setNumPanier(String aNumPanier) {
        numPanier = aNumPanier;
    }

    /**
     * Access method for libPanier.
     *
     * @return the current value of libPanier
     */
    public String getLibPanier() {
        return libPanier;
    }

    /**
     * Setter method for libPanier.
     *
     * @param aLibPanier the new value for libPanier
     */
    public void setLibPanier(String aLibPanier) {
        libPanier = aLibPanier;
    }

    /**
     * Access method for typeCredit.
     *
     * @return the current value of typeCredit
     */
    public String getTypeCredit() {
        return typeCredit;
    }

    /**
     * Setter method for typeCredit.
     *
     * @param aTypeCredit the new value for typeCredit
     */
    public void setTypeCredit(String aTypeCredit) {
        typeCredit = aTypeCredit;
    }

    /**
     * Access method for etatCredit.
     *
     * @return the current value of etatCredit
     */
    public String getEtatCredit() {
        return etatCredit;
    }

    /**
     * Setter method for etatCredit.
     *
     * @param aEtatCredit the new value for etatCredit
     */
    public void setEtatCredit(String aEtatCredit) {
        etatCredit = aEtatCredit;
    }

    /**
     * Access method for dateValidation.
     *
     * @return the current value of dateValidation
     */
    public LocalDateTime getDateValidation() {
        return dateValidation;
    }

    /**
     * Setter method for dateValidation.
     *
     * @param aDateValidation the new value for dateValidation
     */
    public void setDateValidation(LocalDateTime aDateValidation) {
        dateValidation = aDateValidation;
    }

    /**
     * Access method for utilisateur.
     *
     * @return the current value of utilisateur
     */
    public String getUtilisateur() {
        return utilisateur;
    }

    /**
     * Setter method for utilisateur.
     *
     * @param aUtilisateur the new value for utilisateur
     */
    public void setUtilisateur(String aUtilisateur) {
        utilisateur = aUtilisateur;
    }

    /**
     * Access method for niveauEtCredit.
     *
     * @return the current value of niveauEtCredit
     */
    public BigDecimal getNiveauEtCredit() {
        return niveauEtCredit;
    }

    /**
     * Setter method for niveauEtCredit.
     *
     * @param aNiveauEtCredit the new value for niveauEtCredit
     */
    public void setNiveauEtCredit(BigDecimal aNiveauEtCredit) {
        niveauEtCredit = aNiveauEtCredit;
    }

}
