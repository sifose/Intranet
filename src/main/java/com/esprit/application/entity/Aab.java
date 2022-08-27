// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;


@Entity
public class Aab implements Serializable {

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
    @Column(name="NIVEAU_SCOLAIRES", nullable=false, length=20)
    private String niveauScolaires;
    @Column(name="DATE_SAISIE", length=8)
    private String dateSaisie;
    @Column(name="DATE_MODIF", length=1)
    private String dateModif;
    @Column(name="DOMAINE_ENSEIGEMENT", length=200)
    private String domaineEnseigement;
    @Column(name="PRIODE", length=1)
    private String priode;
    @Column(name="UE_ENSEIGNEMENT", length=4000)
    private String ueEnseignement;
    @Column(name="DESCRIPTION_UE", length=4000)
    private String descriptionUe;

    /** Default constructor. */
    public Aab() {
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
     * Access method for dateSaisie.
     *
     * @return the current value of dateSaisie
     */
    public String getDateSaisie() {
        return dateSaisie;
    }

    /**
     * Setter method for dateSaisie.
     *
     * @param aDateSaisie the new value for dateSaisie
     */
    public void setDateSaisie(String aDateSaisie) {
        dateSaisie = aDateSaisie;
    }

    /**
     * Access method for dateModif.
     *
     * @return the current value of dateModif
     */
    public String getDateModif() {
        return dateModif;
    }

    /**
     * Setter method for dateModif.
     *
     * @param aDateModif the new value for dateModif
     */
    public void setDateModif(String aDateModif) {
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
    public String getPriode() {
        return priode;
    }

    /**
     * Setter method for priode.
     *
     * @param aPriode the new value for priode
     */
    public void setPriode(String aPriode) {
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

}
