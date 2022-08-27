// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class EspEvaluationScolaires implements Serializable {

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
    @Column(name="APPRENTISSAGE", nullable=false)
    private BigDecimal apprentissage;
    @Column(name="CODE_DE", nullable=false, length=50)
    private String codeDe;
    @Column(name="UE", nullable=false, length=4000)
    private String ue;
    @Column(name="ANNEE_DEB", nullable=false, length=20)
    private String anneeDeb;
    @Column(name="DATE_SAISAIE")
    private LocalDateTime dateSaisaie;
    @Column(name="DATE_MODIF")
    private LocalDateTime dateModif;
    @Column(name="PRIODE", nullable=false)
    private BigDecimal priode;
    @Column(name="NIVEAU_SCOLAIRES", nullable=false)
    private BigDecimal niveauScolaires;
    @Column(name="ID_ENS", nullable=false, length=20)
    private String idEns;

    /** Default constructor. */
    public EspEvaluationScolaires() {
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
     * Access method for apprentissage.
     *
     * @return the current value of apprentissage
     */
    public BigDecimal getApprentissage() {
        return apprentissage;
    }

    /**
     * Setter method for apprentissage.
     *
     * @param aApprentissage the new value for apprentissage
     */
    public void setApprentissage(BigDecimal aApprentissage) {
        apprentissage = aApprentissage;
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
     * Access method for ue.
     *
     * @return the current value of ue
     */
    public String getUe() {
        return ue;
    }

    /**
     * Setter method for ue.
     *
     * @param aUe the new value for ue
     */
    public void setUe(String aUe) {
        ue = aUe;
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
     * Access method for idEns.
     *
     * @return the current value of idEns
     */
    public String getIdEns() {
        return idEns;
    }

    /**
     * Setter method for idEns.
     *
     * @param aIdEns the new value for idEns
     */
    public void setIdEns(String aIdEns) {
        idEns = aIdEns;
    }

}
