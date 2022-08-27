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
@Table(name="ESP_FICHE_PFE", indexes={@Index(name="ESP_FICHE_PFE_IDFICHE_IX", columnList="IDFICHE", unique=true)})
public class EspFichePfe implements Serializable {

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
    @Column(name="IDFICHE", unique=true, nullable=false, precision=10)
    private BigDecimal idfiche;
    @Column(name="ANNEE", length=255)
    private String annee;
    @Column(name="CAUSE", length=2000)
    private String cause;
    @Column(name="CONVENTION", nullable=false, precision=1)
    private BigDecimal convention;
    @Column(name="DATEDEBUTTRAITEMENT")
    private LocalDateTime datedebuttraitement;
    @Column(name="DATEDEBUTTRAITEMENTENSEIGNANT")
    private LocalDateTime datedebuttraitementenseignant;
    @Column(name="DATEDECISION")
    private LocalDateTime datedecision;
    @Column(name="DATEDEPOT")
    private LocalDateTime datedepot;
    @Column(name="DATEVALIDATIONENCADRANT")
    private LocalDateTime datevalidationencadrant;
    @Column(name="DESCRIPTIONPROJET", length=2000)
    private String descriptionprojet;
    @Column(name="ETAT", length=255)
    private String etat;
    @Column(name="REJETFICHE", length=255)
    private String rejetfiche;
    @Column(name="SOUTENANCE", nullable=false, precision=1)
    private BigDecimal soutenance;
    @Column(name="TITREPROJET", length=2000)
    private String titreprojet;
    @Column(name="VALIDATIONENCADRANT", nullable=false, precision=1)
    private BigDecimal validationencadrant;
    @Column(name="ANNULATIONFICHEPFE_ID", precision=10)
    private BigDecimal annulationfichepfeId;
    @Column(name="CHEFFILIERE_CODE", length=255)
    private String cheffiliereCode;
    @Column(name="COENCADRANT_CODE", length=255)
    private String coencadrantCode;
    @Column(name="DECISION_CODE", length=255)
    private String decisionCode;
    @Column(name="DIRECTIONSTAGE_CODE", length=255)
    private String directionstageCode;
    @Column(name="ENCADRANT_CODE", length=255)
    private String encadrantCode;
    @Column(name="ENSEIGNANAT_CODE", length=255)
    private String enseignanatCode;
    @Column(name="ENSEIGNANT_CODE", length=255)
    private String enseignantCode;
    @Column(name="ETUDIANT_CODE", length=255)
    private String etudiantCode;
    @Column(name="SOCIETE_IDSOCIETE", precision=10)
    private BigDecimal societeIdsociete;
    @Column(name="RAPPORTEUR_CODE", length=10)
    private String rapporteurCode;
    @Column(name="SECTEUR", length=20)
    private String secteur;
    @Column(name="SECT_IDSECTEUR", precision=10)
    private BigDecimal sectIdsecteur;
    @Column(name="IDSESSION", precision=10)
    private BigDecimal idsession;
    @Column(name="MOTIFENSEIGNANT", length=500)
    private String motifenseignant;
    @Column(name="DATERELANCE")
    private LocalDateTime daterelance;
    @Column(name="AUTORISATION_F", length=255)
    private String autorisationF;
    @Column(name="AUTORISATION_P", length=255)
    private String autorisationP;
    @Column(name="FINANCE", length=2)
    private String finance;
    @Column(name="MOTIF_NON_COMPLET", length=500)
    private String motifNonComplet;
    @Column(name="PEDAGOGIQUE", length=2)
    private String pedagogique;
    @Column(name="MOTIF_REJET_TECH", length=1000)
    private String motifRejetTech;
    @Column(name="ASOUTENIR", precision=1)
    private BigDecimal asoutenir;
    @Column(name="ATTENTE", length=255)
    private String attente;
    @Column(name="CONFIDENTIEL", length=2)
    private String confidentiel;
    @Column(name="DATE_DEPOT_DOSSIER")
    private LocalDateTime dateDepotDossier;
    @Column(name="BINOME_CODE", length=255)
    private String binomeCode;

    /** Default constructor. */
    public EspFichePfe() {
        super();
    }

    /**
     * Access method for idfiche.
     *
     * @return the current value of idfiche
     */
    public BigDecimal getIdfiche() {
        return idfiche;
    }

    /**
     * Setter method for idfiche.
     *
     * @param aIdfiche the new value for idfiche
     */
    public void setIdfiche(BigDecimal aIdfiche) {
        idfiche = aIdfiche;
    }

    /**
     * Access method for annee.
     *
     * @return the current value of annee
     */
    public String getAnnee() {
        return annee;
    }

    /**
     * Setter method for annee.
     *
     * @param aAnnee the new value for annee
     */
    public void setAnnee(String aAnnee) {
        annee = aAnnee;
    }

    /**
     * Access method for cause.
     *
     * @return the current value of cause
     */
    public String getCause() {
        return cause;
    }

    /**
     * Setter method for cause.
     *
     * @param aCause the new value for cause
     */
    public void setCause(String aCause) {
        cause = aCause;
    }

    /**
     * Access method for convention.
     *
     * @return the current value of convention
     */
    public BigDecimal getConvention() {
        return convention;
    }

    /**
     * Setter method for convention.
     *
     * @param aConvention the new value for convention
     */
    public void setConvention(BigDecimal aConvention) {
        convention = aConvention;
    }

    /**
     * Access method for datedebuttraitement.
     *
     * @return the current value of datedebuttraitement
     */
    public LocalDateTime getDatedebuttraitement() {
        return datedebuttraitement;
    }

    /**
     * Setter method for datedebuttraitement.
     *
     * @param aDatedebuttraitement the new value for datedebuttraitement
     */
    public void setDatedebuttraitement(LocalDateTime aDatedebuttraitement) {
        datedebuttraitement = aDatedebuttraitement;
    }

    /**
     * Access method for datedebuttraitementenseignant.
     *
     * @return the current value of datedebuttraitementenseignant
     */
    public LocalDateTime getDatedebuttraitementenseignant() {
        return datedebuttraitementenseignant;
    }

    /**
     * Setter method for datedebuttraitementenseignant.
     *
     * @param aDatedebuttraitementenseignant the new value for datedebuttraitementenseignant
     */
    public void setDatedebuttraitementenseignant(LocalDateTime aDatedebuttraitementenseignant) {
        datedebuttraitementenseignant = aDatedebuttraitementenseignant;
    }

    /**
     * Access method for datedecision.
     *
     * @return the current value of datedecision
     */
    public LocalDateTime getDatedecision() {
        return datedecision;
    }

    /**
     * Setter method for datedecision.
     *
     * @param aDatedecision the new value for datedecision
     */
    public void setDatedecision(LocalDateTime aDatedecision) {
        datedecision = aDatedecision;
    }

    /**
     * Access method for datedepot.
     *
     * @return the current value of datedepot
     */
    public LocalDateTime getDatedepot() {
        return datedepot;
    }

    /**
     * Setter method for datedepot.
     *
     * @param aDatedepot the new value for datedepot
     */
    public void setDatedepot(LocalDateTime aDatedepot) {
        datedepot = aDatedepot;
    }

    /**
     * Access method for datevalidationencadrant.
     *
     * @return the current value of datevalidationencadrant
     */
    public LocalDateTime getDatevalidationencadrant() {
        return datevalidationencadrant;
    }

    /**
     * Setter method for datevalidationencadrant.
     *
     * @param aDatevalidationencadrant the new value for datevalidationencadrant
     */
    public void setDatevalidationencadrant(LocalDateTime aDatevalidationencadrant) {
        datevalidationencadrant = aDatevalidationencadrant;
    }

    /**
     * Access method for descriptionprojet.
     *
     * @return the current value of descriptionprojet
     */
    public String getDescriptionprojet() {
        return descriptionprojet;
    }

    /**
     * Setter method for descriptionprojet.
     *
     * @param aDescriptionprojet the new value for descriptionprojet
     */
    public void setDescriptionprojet(String aDescriptionprojet) {
        descriptionprojet = aDescriptionprojet;
    }

    /**
     * Access method for etat.
     *
     * @return the current value of etat
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Setter method for etat.
     *
     * @param aEtat the new value for etat
     */
    public void setEtat(String aEtat) {
        etat = aEtat;
    }

    /**
     * Access method for rejetfiche.
     *
     * @return the current value of rejetfiche
     */
    public String getRejetfiche() {
        return rejetfiche;
    }

    /**
     * Setter method for rejetfiche.
     *
     * @param aRejetfiche the new value for rejetfiche
     */
    public void setRejetfiche(String aRejetfiche) {
        rejetfiche = aRejetfiche;
    }

    /**
     * Access method for soutenance.
     *
     * @return the current value of soutenance
     */
    public BigDecimal getSoutenance() {
        return soutenance;
    }

    /**
     * Setter method for soutenance.
     *
     * @param aSoutenance the new value for soutenance
     */
    public void setSoutenance(BigDecimal aSoutenance) {
        soutenance = aSoutenance;
    }

    /**
     * Access method for titreprojet.
     *
     * @return the current value of titreprojet
     */
    public String getTitreprojet() {
        return titreprojet;
    }

    /**
     * Setter method for titreprojet.
     *
     * @param aTitreprojet the new value for titreprojet
     */
    public void setTitreprojet(String aTitreprojet) {
        titreprojet = aTitreprojet;
    }

    /**
     * Access method for validationencadrant.
     *
     * @return the current value of validationencadrant
     */
    public BigDecimal getValidationencadrant() {
        return validationencadrant;
    }

    /**
     * Setter method for validationencadrant.
     *
     * @param aValidationencadrant the new value for validationencadrant
     */
    public void setValidationencadrant(BigDecimal aValidationencadrant) {
        validationencadrant = aValidationencadrant;
    }

    /**
     * Access method for annulationfichepfeId.
     *
     * @return the current value of annulationfichepfeId
     */
    public BigDecimal getAnnulationfichepfeId() {
        return annulationfichepfeId;
    }

    /**
     * Setter method for annulationfichepfeId.
     *
     * @param aAnnulationfichepfeId the new value for annulationfichepfeId
     */
    public void setAnnulationfichepfeId(BigDecimal aAnnulationfichepfeId) {
        annulationfichepfeId = aAnnulationfichepfeId;
    }

    /**
     * Access method for cheffiliereCode.
     *
     * @return the current value of cheffiliereCode
     */
    public String getCheffiliereCode() {
        return cheffiliereCode;
    }

    /**
     * Setter method for cheffiliereCode.
     *
     * @param aCheffiliereCode the new value for cheffiliereCode
     */
    public void setCheffiliereCode(String aCheffiliereCode) {
        cheffiliereCode = aCheffiliereCode;
    }

    /**
     * Access method for coencadrantCode.
     *
     * @return the current value of coencadrantCode
     */
    public String getCoencadrantCode() {
        return coencadrantCode;
    }

    /**
     * Setter method for coencadrantCode.
     *
     * @param aCoencadrantCode the new value for coencadrantCode
     */
    public void setCoencadrantCode(String aCoencadrantCode) {
        coencadrantCode = aCoencadrantCode;
    }

    /**
     * Access method for decisionCode.
     *
     * @return the current value of decisionCode
     */
    public String getDecisionCode() {
        return decisionCode;
    }

    /**
     * Setter method for decisionCode.
     *
     * @param aDecisionCode the new value for decisionCode
     */
    public void setDecisionCode(String aDecisionCode) {
        decisionCode = aDecisionCode;
    }

    /**
     * Access method for directionstageCode.
     *
     * @return the current value of directionstageCode
     */
    public String getDirectionstageCode() {
        return directionstageCode;
    }

    /**
     * Setter method for directionstageCode.
     *
     * @param aDirectionstageCode the new value for directionstageCode
     */
    public void setDirectionstageCode(String aDirectionstageCode) {
        directionstageCode = aDirectionstageCode;
    }

    /**
     * Access method for encadrantCode.
     *
     * @return the current value of encadrantCode
     */
    public String getEncadrantCode() {
        return encadrantCode;
    }

    /**
     * Setter method for encadrantCode.
     *
     * @param aEncadrantCode the new value for encadrantCode
     */
    public void setEncadrantCode(String aEncadrantCode) {
        encadrantCode = aEncadrantCode;
    }

    /**
     * Access method for enseignanatCode.
     *
     * @return the current value of enseignanatCode
     */
    public String getEnseignanatCode() {
        return enseignanatCode;
    }

    /**
     * Setter method for enseignanatCode.
     *
     * @param aEnseignanatCode the new value for enseignanatCode
     */
    public void setEnseignanatCode(String aEnseignanatCode) {
        enseignanatCode = aEnseignanatCode;
    }

    /**
     * Access method for enseignantCode.
     *
     * @return the current value of enseignantCode
     */
    public String getEnseignantCode() {
        return enseignantCode;
    }

    /**
     * Setter method for enseignantCode.
     *
     * @param aEnseignantCode the new value for enseignantCode
     */
    public void setEnseignantCode(String aEnseignantCode) {
        enseignantCode = aEnseignantCode;
    }

    /**
     * Access method for etudiantCode.
     *
     * @return the current value of etudiantCode
     */
    public String getEtudiantCode() {
        return etudiantCode;
    }

    /**
     * Setter method for etudiantCode.
     *
     * @param aEtudiantCode the new value for etudiantCode
     */
    public void setEtudiantCode(String aEtudiantCode) {
        etudiantCode = aEtudiantCode;
    }

    /**
     * Access method for societeIdsociete.
     *
     * @return the current value of societeIdsociete
     */
    public BigDecimal getSocieteIdsociete() {
        return societeIdsociete;
    }

    /**
     * Setter method for societeIdsociete.
     *
     * @param aSocieteIdsociete the new value for societeIdsociete
     */
    public void setSocieteIdsociete(BigDecimal aSocieteIdsociete) {
        societeIdsociete = aSocieteIdsociete;
    }

    /**
     * Access method for rapporteurCode.
     *
     * @return the current value of rapporteurCode
     */
    public String getRapporteurCode() {
        return rapporteurCode;
    }

    /**
     * Setter method for rapporteurCode.
     *
     * @param aRapporteurCode the new value for rapporteurCode
     */
    public void setRapporteurCode(String aRapporteurCode) {
        rapporteurCode = aRapporteurCode;
    }

    /**
     * Access method for secteur.
     *
     * @return the current value of secteur
     */
    public String getSecteur() {
        return secteur;
    }

    /**
     * Setter method for secteur.
     *
     * @param aSecteur the new value for secteur
     */
    public void setSecteur(String aSecteur) {
        secteur = aSecteur;
    }

    /**
     * Access method for sectIdsecteur.
     *
     * @return the current value of sectIdsecteur
     */
    public BigDecimal getSectIdsecteur() {
        return sectIdsecteur;
    }

    /**
     * Setter method for sectIdsecteur.
     *
     * @param aSectIdsecteur the new value for sectIdsecteur
     */
    public void setSectIdsecteur(BigDecimal aSectIdsecteur) {
        sectIdsecteur = aSectIdsecteur;
    }

    /**
     * Access method for idsession.
     *
     * @return the current value of idsession
     */
    public BigDecimal getIdsession() {
        return idsession;
    }

    /**
     * Setter method for idsession.
     *
     * @param aIdsession the new value for idsession
     */
    public void setIdsession(BigDecimal aIdsession) {
        idsession = aIdsession;
    }

    /**
     * Access method for motifenseignant.
     *
     * @return the current value of motifenseignant
     */
    public String getMotifenseignant() {
        return motifenseignant;
    }

    /**
     * Setter method for motifenseignant.
     *
     * @param aMotifenseignant the new value for motifenseignant
     */
    public void setMotifenseignant(String aMotifenseignant) {
        motifenseignant = aMotifenseignant;
    }

    /**
     * Access method for daterelance.
     *
     * @return the current value of daterelance
     */
    public LocalDateTime getDaterelance() {
        return daterelance;
    }

    /**
     * Setter method for daterelance.
     *
     * @param aDaterelance the new value for daterelance
     */
    public void setDaterelance(LocalDateTime aDaterelance) {
        daterelance = aDaterelance;
    }

    /**
     * Access method for autorisationF.
     *
     * @return the current value of autorisationF
     */
    public String getAutorisationF() {
        return autorisationF;
    }

    /**
     * Setter method for autorisationF.
     *
     * @param aAutorisationF the new value for autorisationF
     */
    public void setAutorisationF(String aAutorisationF) {
        autorisationF = aAutorisationF;
    }

    /**
     * Access method for autorisationP.
     *
     * @return the current value of autorisationP
     */
    public String getAutorisationP() {
        return autorisationP;
    }

    /**
     * Setter method for autorisationP.
     *
     * @param aAutorisationP the new value for autorisationP
     */
    public void setAutorisationP(String aAutorisationP) {
        autorisationP = aAutorisationP;
    }

    /**
     * Access method for finance.
     *
     * @return the current value of finance
     */
    public String getFinance() {
        return finance;
    }

    /**
     * Setter method for finance.
     *
     * @param aFinance the new value for finance
     */
    public void setFinance(String aFinance) {
        finance = aFinance;
    }

    /**
     * Access method for motifNonComplet.
     *
     * @return the current value of motifNonComplet
     */
    public String getMotifNonComplet() {
        return motifNonComplet;
    }

    /**
     * Setter method for motifNonComplet.
     *
     * @param aMotifNonComplet the new value for motifNonComplet
     */
    public void setMotifNonComplet(String aMotifNonComplet) {
        motifNonComplet = aMotifNonComplet;
    }

    /**
     * Access method for pedagogique.
     *
     * @return the current value of pedagogique
     */
    public String getPedagogique() {
        return pedagogique;
    }

    /**
     * Setter method for pedagogique.
     *
     * @param aPedagogique the new value for pedagogique
     */
    public void setPedagogique(String aPedagogique) {
        pedagogique = aPedagogique;
    }

    /**
     * Access method for motifRejetTech.
     *
     * @return the current value of motifRejetTech
     */
    public String getMotifRejetTech() {
        return motifRejetTech;
    }

    /**
     * Setter method for motifRejetTech.
     *
     * @param aMotifRejetTech the new value for motifRejetTech
     */
    public void setMotifRejetTech(String aMotifRejetTech) {
        motifRejetTech = aMotifRejetTech;
    }

    /**
     * Access method for asoutenir.
     *
     * @return the current value of asoutenir
     */
    public BigDecimal getAsoutenir() {
        return asoutenir;
    }

    /**
     * Setter method for asoutenir.
     *
     * @param aAsoutenir the new value for asoutenir
     */
    public void setAsoutenir(BigDecimal aAsoutenir) {
        asoutenir = aAsoutenir;
    }

    /**
     * Access method for attente.
     *
     * @return the current value of attente
     */
    public String getAttente() {
        return attente;
    }

    /**
     * Setter method for attente.
     *
     * @param aAttente the new value for attente
     */
    public void setAttente(String aAttente) {
        attente = aAttente;
    }

    /**
     * Access method for confidentiel.
     *
     * @return the current value of confidentiel
     */
    public String getConfidentiel() {
        return confidentiel;
    }

    /**
     * Setter method for confidentiel.
     *
     * @param aConfidentiel the new value for confidentiel
     */
    public void setConfidentiel(String aConfidentiel) {
        confidentiel = aConfidentiel;
    }

    /**
     * Access method for dateDepotDossier.
     *
     * @return the current value of dateDepotDossier
     */
    public LocalDateTime getDateDepotDossier() {
        return dateDepotDossier;
    }

    /**
     * Setter method for dateDepotDossier.
     *
     * @param aDateDepotDossier the new value for dateDepotDossier
     */
    public void setDateDepotDossier(LocalDateTime aDateDepotDossier) {
        dateDepotDossier = aDateDepotDossier;
    }

    /**
     * Access method for binomeCode.
     *
     * @return the current value of binomeCode
     */
    public String getBinomeCode() {
        return binomeCode;
    }

    /**
     * Setter method for binomeCode.
     *
     * @param aBinomeCode the new value for binomeCode
     */
    public void setBinomeCode(String aBinomeCode) {
        binomeCode = aBinomeCode;
    }

}
