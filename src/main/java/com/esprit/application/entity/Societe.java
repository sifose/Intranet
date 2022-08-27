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
import javax.persistence.Version;

@Entity(name="SOCIETE")
public class Societe implements Serializable {

    /** Primary key. */
    protected static final String PK = "codeSoc";

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
    @Column(name="CODE_SOC", unique=true, nullable=false, length=2)
    private String codeSoc;
    @Column(name="NOM_SOC", length=100)
    private String nomSoc;
    @Column(name="ADR_SOC", length=40)
    private String adrSoc;
    @Column(name="TEL_SOC", length=20)
    private String telSoc;
    @Column(name="FAX_SOC", length=20)
    private String faxSoc;
    @Column(name="SIGLE", length=530)
    private String sigle;
    @Column(name="E_MAIL", length=50)
    private String eMail;
    @Column(name="CODE_POSTAL", length=4)
    private String codePostal;
    @Column(name="DATE_CR")
    private LocalDateTime dateCr;
    @Column(name="DATE_MAJ")
    private LocalDateTime dateMaj;
    @Column(name="VILLE", length=40)
    private String ville;
    @Column(name="RIB", length=25)
    private String rib;
    @Column(name="CODE_TVA", length=15)
    private String codeTva;
    @Column(name="BANQUE", length=20)
    private String banque;
    @Column(name="RC", length=15)
    private String rc;
    @Column(name="CODE_RGLT_COMPTANT", length=3)
    private String codeRgltComptant;
    @Column(name="CODE_RGLT_ESPECE", length=3)
    private String codeRgltEspece;
    @Column(name="ANNEE_DEB", length=4)
    private String anneeDeb;
    @Column(name="ANNEE_FIN", length=4)
    private String anneeFin;
    @Column(name="TAUX_EXAM", precision=5, scale=2)
    private BigDecimal tauxExam;
    @Column(name="TAUX_DS", precision=5, scale=2)
    private BigDecimal tauxDs;
    @Column(name="TAUX_TP", precision=5, scale=2)
    private BigDecimal tauxTp;
    @Column(name="TAUX_ORALE", precision=5, scale=2)
    private BigDecimal tauxOrale;
    @Column(name="NB_MAX_ABS_MODULE", precision=38)
    private BigDecimal nbMaxAbsModule;
    @Column(name="NB_SCEANCE_JOUR", precision=38)
    private BigDecimal nbSceanceJour;
    @Column(name="SYMBOLE", length=10)
    private String symbole;
    @Column(name="TIMB_FISCAL", precision=6, scale=3)
    private BigDecimal timbFiscal;
    @Column(name="TIMBRE_FISCAL", precision=6, scale=3)
    private BigDecimal timbreFiscal;
    @Column(name="DATE_DEBUT_SAISON")
    private LocalDateTime dateDebutSaison;
    @Column(name="NUM_SEMESTRE_ACTUEL", precision=1)
    private BigDecimal numSemestreActuel;
    @Column(name="CHEMIN_FICHIER_DONNEE", length=100)
    private String cheminFichierDonnee;
    @Column(name="TAUX_EXAM_WITH_CC", precision=5, scale=2)
    private BigDecimal tauxExamWithCc;
    @Column(name="TAUX_EXAM_WITH_TP_CC", precision=5, scale=2)
    private BigDecimal tauxExamWithTpCc;
    @Column(name="MIN_MOY_RESUSSITE", precision=5, scale=2)
    private BigDecimal minMoyResussite;
    @Column(name="BI_RACHAT", precision=5, scale=2)
    private BigDecimal biRachat;
    @Column(name="BS_RACHAT", precision=5, scale=2)
    private BigDecimal bsRachat;
    @Column(name="ID_VACATAIRE", length=16)
    private String idVacataire;
    @Column(name="GERER_SEMESTRE", length=1)
    private String gererSemestre;
    @Column(name="FR_SCOLARITE_CS", precision=18, scale=6)
    private BigDecimal frScolariteCs;
    @Column(name="FR_SCOLARITE_CJ", precision=18, scale=6)
    private BigDecimal frScolariteCj;
    @Column(name="MIN_PANIER", precision=5, scale=2)
    private BigDecimal minPanier;
    @Column(name="ID_DIRET", length=16)
    private String idDiret;
    @Column(name="ID_SERV_SCOLAIRE", length=16)
    private String idServScolaire;
    @Column(name="LIAISON_FINANCIER", length=1)
    private String liaisonFinancier;
    @Column(name="TAUX_RGLT", precision=10, scale=3)
    private BigDecimal tauxRglt;
    @Column(name="LIAISON_SITE", length=1)
    private String liaisonSite;
    @Column(name="NUMPROMOTIONCS", precision=4)
    private BigDecimal numpromotioncs;
    @Column(name="DATEDEMARRAGECS")
    private LocalDateTime datedemarragecs;
    @Column(name="CONTROL_BALCKLISTE", length=1)
    private String controlBalckliste;
    @Column(name="MAX_VAL_CREDIT_ACCEPTE", precision=18, scale=6)
    private BigDecimal maxValCreditAccepte;
    @Column(name="MAX_TAUX_CREDIT_ACCEPTE", precision=5, scale=2)
    private BigDecimal maxTauxCreditAccepte;
    @Column(name="CREDIT_MAX", precision=18, scale=6)
    private BigDecimal creditMax;
    @Column(name="ACTIVE_DISPENSE_AUTO", length=1)
    private String activeDispenseAuto;
    @Column(name="ACTIVE_MP_ENS", length=1)
    private String activeMpEns;
    @Column(name="ACTIVE_MODULE_OPT", length=1)
    private String activeModuleOpt;
    @Column(name="VERROU_RESUL", length=1)
    private String verrouResul;
    @Column(name="TOT_ECTS_ADMIS", precision=5, scale=2)
    private BigDecimal totEctsAdmis;
    @Column(name="QUOTA_ECTS_NV", precision=5, scale=2)
    private BigDecimal quotaEctsNv;
    @Column(name="ACTIVER_TAUX_ABSENCE", length=1)
    private String activerTauxAbsence;
    @Column(name="TAUX_MAX_ABSENCE", precision=5, scale=2)
    private BigDecimal tauxMaxAbsence;
    @Column(name="NBH_SEMAINE", precision=4, scale=1)
    private BigDecimal nbhSemaine;
    @Column(name="BLOCK_OTHER_RAT", length=1)
    private String blockOtherRat;
    @Column(name="CTRL_FIN_STAT", length=1)
    private String ctrlFinStat;
    @Column(name="CTRL_CONFORM_ECTS", precision=1)
    private BigDecimal ctrlConformEcts;
    @Column(name="VERROU_PL_ETUDE", length=1)
    private String verrouPlEtude;
    @Column(name="ANNEE_ADMISSION", length=4)
    private String anneeAdmission;

    /** Default constructor. */
    public Societe() {
        super();
    }

    /**
     * Access method for codeSoc.
     *
     * @return the current value of codeSoc
     */
    public String getCodeSoc() {
        return codeSoc;
    }

    /**
     * Setter method for codeSoc.
     *
     * @param aCodeSoc the new value for codeSoc
     */
    public void setCodeSoc(String aCodeSoc) {
        codeSoc = aCodeSoc;
    }

    /**
     * Access method for nomSoc.
     *
     * @return the current value of nomSoc
     */
    public String getNomSoc() {
        return nomSoc;
    }

    /**
     * Setter method for nomSoc.
     *
     * @param aNomSoc the new value for nomSoc
     */
    public void setNomSoc(String aNomSoc) {
        nomSoc = aNomSoc;
    }

    /**
     * Access method for adrSoc.
     *
     * @return the current value of adrSoc
     */
    public String getAdrSoc() {
        return adrSoc;
    }

    /**
     * Setter method for adrSoc.
     *
     * @param aAdrSoc the new value for adrSoc
     */
    public void setAdrSoc(String aAdrSoc) {
        adrSoc = aAdrSoc;
    }

    /**
     * Access method for telSoc.
     *
     * @return the current value of telSoc
     */
    public String getTelSoc() {
        return telSoc;
    }

    /**
     * Setter method for telSoc.
     *
     * @param aTelSoc the new value for telSoc
     */
    public void setTelSoc(String aTelSoc) {
        telSoc = aTelSoc;
    }

    /**
     * Access method for faxSoc.
     *
     * @return the current value of faxSoc
     */
    public String getFaxSoc() {
        return faxSoc;
    }

    /**
     * Setter method for faxSoc.
     *
     * @param aFaxSoc the new value for faxSoc
     */
    public void setFaxSoc(String aFaxSoc) {
        faxSoc = aFaxSoc;
    }

    /**
     * Access method for sigle.
     *
     * @return the current value of sigle
     */
    public String getSigle() {
        return sigle;
    }

    /**
     * Setter method for sigle.
     *
     * @param aSigle the new value for sigle
     */
    public void setSigle(String aSigle) {
        sigle = aSigle;
    }

    /**
     * Access method for eMail.
     *
     * @return the current value of eMail
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Setter method for eMail.
     *
     * @param aEMail the new value for eMail
     */
    public void setEMail(String aEMail) {
        eMail = aEMail;
    }

    /**
     * Access method for codePostal.
     *
     * @return the current value of codePostal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * Setter method for codePostal.
     *
     * @param aCodePostal the new value for codePostal
     */
    public void setCodePostal(String aCodePostal) {
        codePostal = aCodePostal;
    }

    /**
     * Access method for dateCr.
     *
     * @return the current value of dateCr
     */
    public LocalDateTime getDateCr() {
        return dateCr;
    }

    /**
     * Setter method for dateCr.
     *
     * @param aDateCr the new value for dateCr
     */
    public void setDateCr(LocalDateTime aDateCr) {
        dateCr = aDateCr;
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
     * Access method for ville.
     *
     * @return the current value of ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * Setter method for ville.
     *
     * @param aVille the new value for ville
     */
    public void setVille(String aVille) {
        ville = aVille;
    }

    /**
     * Access method for rib.
     *
     * @return the current value of rib
     */
    public String getRib() {
        return rib;
    }

    /**
     * Setter method for rib.
     *
     * @param aRib the new value for rib
     */
    public void setRib(String aRib) {
        rib = aRib;
    }

    /**
     * Access method for codeTva.
     *
     * @return the current value of codeTva
     */
    public String getCodeTva() {
        return codeTva;
    }

    /**
     * Setter method for codeTva.
     *
     * @param aCodeTva the new value for codeTva
     */
    public void setCodeTva(String aCodeTva) {
        codeTva = aCodeTva;
    }

    /**
     * Access method for banque.
     *
     * @return the current value of banque
     */
    public String getBanque() {
        return banque;
    }

    /**
     * Setter method for banque.
     *
     * @param aBanque the new value for banque
     */
    public void setBanque(String aBanque) {
        banque = aBanque;
    }

    /**
     * Access method for rc.
     *
     * @return the current value of rc
     */
    public String getRc() {
        return rc;
    }

    /**
     * Setter method for rc.
     *
     * @param aRc the new value for rc
     */
    public void setRc(String aRc) {
        rc = aRc;
    }

    /**
     * Access method for codeRgltComptant.
     *
     * @return the current value of codeRgltComptant
     */
    public String getCodeRgltComptant() {
        return codeRgltComptant;
    }

    /**
     * Setter method for codeRgltComptant.
     *
     * @param aCodeRgltComptant the new value for codeRgltComptant
     */
    public void setCodeRgltComptant(String aCodeRgltComptant) {
        codeRgltComptant = aCodeRgltComptant;
    }

    /**
     * Access method for codeRgltEspece.
     *
     * @return the current value of codeRgltEspece
     */
    public String getCodeRgltEspece() {
        return codeRgltEspece;
    }

    /**
     * Setter method for codeRgltEspece.
     *
     * @param aCodeRgltEspece the new value for codeRgltEspece
     */
    public void setCodeRgltEspece(String aCodeRgltEspece) {
        codeRgltEspece = aCodeRgltEspece;
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
     * Access method for anneeFin.
     *
     * @return the current value of anneeFin
     */
    public String getAnneeFin() {
        return anneeFin;
    }

    /**
     * Setter method for anneeFin.
     *
     * @param aAnneeFin the new value for anneeFin
     */
    public void setAnneeFin(String aAnneeFin) {
        anneeFin = aAnneeFin;
    }

    /**
     * Access method for tauxExam.
     *
     * @return the current value of tauxExam
     */
    public BigDecimal getTauxExam() {
        return tauxExam;
    }

    /**
     * Setter method for tauxExam.
     *
     * @param aTauxExam the new value for tauxExam
     */
    public void setTauxExam(BigDecimal aTauxExam) {
        tauxExam = aTauxExam;
    }

    /**
     * Access method for tauxDs.
     *
     * @return the current value of tauxDs
     */
    public BigDecimal getTauxDs() {
        return tauxDs;
    }

    /**
     * Setter method for tauxDs.
     *
     * @param aTauxDs the new value for tauxDs
     */
    public void setTauxDs(BigDecimal aTauxDs) {
        tauxDs = aTauxDs;
    }

    /**
     * Access method for tauxTp.
     *
     * @return the current value of tauxTp
     */
    public BigDecimal getTauxTp() {
        return tauxTp;
    }

    /**
     * Setter method for tauxTp.
     *
     * @param aTauxTp the new value for tauxTp
     */
    public void setTauxTp(BigDecimal aTauxTp) {
        tauxTp = aTauxTp;
    }

    /**
     * Access method for tauxOrale.
     *
     * @return the current value of tauxOrale
     */
    public BigDecimal getTauxOrale() {
        return tauxOrale;
    }

    /**
     * Setter method for tauxOrale.
     *
     * @param aTauxOrale the new value for tauxOrale
     */
    public void setTauxOrale(BigDecimal aTauxOrale) {
        tauxOrale = aTauxOrale;
    }

    /**
     * Access method for nbMaxAbsModule.
     *
     * @return the current value of nbMaxAbsModule
     */
    public BigDecimal getNbMaxAbsModule() {
        return nbMaxAbsModule;
    }

    /**
     * Setter method for nbMaxAbsModule.
     *
     * @param aNbMaxAbsModule the new value for nbMaxAbsModule
     */
    public void setNbMaxAbsModule(BigDecimal aNbMaxAbsModule) {
        nbMaxAbsModule = aNbMaxAbsModule;
    }

    /**
     * Access method for nbSceanceJour.
     *
     * @return the current value of nbSceanceJour
     */
    public BigDecimal getNbSceanceJour() {
        return nbSceanceJour;
    }

    /**
     * Setter method for nbSceanceJour.
     *
     * @param aNbSceanceJour the new value for nbSceanceJour
     */
    public void setNbSceanceJour(BigDecimal aNbSceanceJour) {
        nbSceanceJour = aNbSceanceJour;
    }

    /**
     * Access method for symbole.
     *
     * @return the current value of symbole
     */
    public String getSymbole() {
        return symbole;
    }

    /**
     * Setter method for symbole.
     *
     * @param aSymbole the new value for symbole
     */
    public void setSymbole(String aSymbole) {
        symbole = aSymbole;
    }

    /**
     * Access method for timbFiscal.
     *
     * @return the current value of timbFiscal
     */
    public BigDecimal getTimbFiscal() {
        return timbFiscal;
    }

    /**
     * Setter method for timbFiscal.
     *
     * @param aTimbFiscal the new value for timbFiscal
     */
    public void setTimbFiscal(BigDecimal aTimbFiscal) {
        timbFiscal = aTimbFiscal;
    }

    /**
     * Access method for timbreFiscal.
     *
     * @return the current value of timbreFiscal
     */
    public BigDecimal getTimbreFiscal() {
        return timbreFiscal;
    }

    /**
     * Setter method for timbreFiscal.
     *
     * @param aTimbreFiscal the new value for timbreFiscal
     */
    public void setTimbreFiscal(BigDecimal aTimbreFiscal) {
        timbreFiscal = aTimbreFiscal;
    }

    /**
     * Access method for dateDebutSaison.
     *
     * @return the current value of dateDebutSaison
     */
    public LocalDateTime getDateDebutSaison() {
        return dateDebutSaison;
    }

    /**
     * Setter method for dateDebutSaison.
     *
     * @param aDateDebutSaison the new value for dateDebutSaison
     */
    public void setDateDebutSaison(LocalDateTime aDateDebutSaison) {
        dateDebutSaison = aDateDebutSaison;
    }

    /**
     * Access method for numSemestreActuel.
     *
     * @return the current value of numSemestreActuel
     */
    public BigDecimal getNumSemestreActuel() {
        return numSemestreActuel;
    }

    /**
     * Setter method for numSemestreActuel.
     *
     * @param aNumSemestreActuel the new value for numSemestreActuel
     */
    public void setNumSemestreActuel(BigDecimal aNumSemestreActuel) {
        numSemestreActuel = aNumSemestreActuel;
    }

    /**
     * Access method for cheminFichierDonnee.
     *
     * @return the current value of cheminFichierDonnee
     */
    public String getCheminFichierDonnee() {
        return cheminFichierDonnee;
    }

    /**
     * Setter method for cheminFichierDonnee.
     *
     * @param aCheminFichierDonnee the new value for cheminFichierDonnee
     */
    public void setCheminFichierDonnee(String aCheminFichierDonnee) {
        cheminFichierDonnee = aCheminFichierDonnee;
    }

    /**
     * Access method for tauxExamWithCc.
     *
     * @return the current value of tauxExamWithCc
     */
    public BigDecimal getTauxExamWithCc() {
        return tauxExamWithCc;
    }

    /**
     * Setter method for tauxExamWithCc.
     *
     * @param aTauxExamWithCc the new value for tauxExamWithCc
     */
    public void setTauxExamWithCc(BigDecimal aTauxExamWithCc) {
        tauxExamWithCc = aTauxExamWithCc;
    }

    /**
     * Access method for tauxExamWithTpCc.
     *
     * @return the current value of tauxExamWithTpCc
     */
    public BigDecimal getTauxExamWithTpCc() {
        return tauxExamWithTpCc;
    }

    /**
     * Setter method for tauxExamWithTpCc.
     *
     * @param aTauxExamWithTpCc the new value for tauxExamWithTpCc
     */
    public void setTauxExamWithTpCc(BigDecimal aTauxExamWithTpCc) {
        tauxExamWithTpCc = aTauxExamWithTpCc;
    }

    /**
     * Access method for minMoyResussite.
     *
     * @return the current value of minMoyResussite
     */
    public BigDecimal getMinMoyResussite() {
        return minMoyResussite;
    }

    /**
     * Setter method for minMoyResussite.
     *
     * @param aMinMoyResussite the new value for minMoyResussite
     */
    public void setMinMoyResussite(BigDecimal aMinMoyResussite) {
        minMoyResussite = aMinMoyResussite;
    }

    /**
     * Access method for biRachat.
     *
     * @return the current value of biRachat
     */
    public BigDecimal getBiRachat() {
        return biRachat;
    }

    /**
     * Setter method for biRachat.
     *
     * @param aBiRachat the new value for biRachat
     */
    public void setBiRachat(BigDecimal aBiRachat) {
        biRachat = aBiRachat;
    }

    /**
     * Access method for bsRachat.
     *
     * @return the current value of bsRachat
     */
    public BigDecimal getBsRachat() {
        return bsRachat;
    }

    /**
     * Setter method for bsRachat.
     *
     * @param aBsRachat the new value for bsRachat
     */
    public void setBsRachat(BigDecimal aBsRachat) {
        bsRachat = aBsRachat;
    }

    /**
     * Access method for idVacataire.
     *
     * @return the current value of idVacataire
     */
    public String getIdVacataire() {
        return idVacataire;
    }

    /**
     * Setter method for idVacataire.
     *
     * @param aIdVacataire the new value for idVacataire
     */
    public void setIdVacataire(String aIdVacataire) {
        idVacataire = aIdVacataire;
    }

    /**
     * Access method for gererSemestre.
     *
     * @return the current value of gererSemestre
     */
    public String getGererSemestre() {
        return gererSemestre;
    }

    /**
     * Setter method for gererSemestre.
     *
     * @param aGererSemestre the new value for gererSemestre
     */
    public void setGererSemestre(String aGererSemestre) {
        gererSemestre = aGererSemestre;
    }

    /**
     * Access method for frScolariteCs.
     *
     * @return the current value of frScolariteCs
     */
    public BigDecimal getFrScolariteCs() {
        return frScolariteCs;
    }

    /**
     * Setter method for frScolariteCs.
     *
     * @param aFrScolariteCs the new value for frScolariteCs
     */
    public void setFrScolariteCs(BigDecimal aFrScolariteCs) {
        frScolariteCs = aFrScolariteCs;
    }

    /**
     * Access method for frScolariteCj.
     *
     * @return the current value of frScolariteCj
     */
    public BigDecimal getFrScolariteCj() {
        return frScolariteCj;
    }

    /**
     * Setter method for frScolariteCj.
     *
     * @param aFrScolariteCj the new value for frScolariteCj
     */
    public void setFrScolariteCj(BigDecimal aFrScolariteCj) {
        frScolariteCj = aFrScolariteCj;
    }

    /**
     * Access method for minPanier.
     *
     * @return the current value of minPanier
     */
    public BigDecimal getMinPanier() {
        return minPanier;
    }

    /**
     * Setter method for minPanier.
     *
     * @param aMinPanier the new value for minPanier
     */
    public void setMinPanier(BigDecimal aMinPanier) {
        minPanier = aMinPanier;
    }

    /**
     * Access method for idDiret.
     *
     * @return the current value of idDiret
     */
    public String getIdDiret() {
        return idDiret;
    }

    /**
     * Setter method for idDiret.
     *
     * @param aIdDiret the new value for idDiret
     */
    public void setIdDiret(String aIdDiret) {
        idDiret = aIdDiret;
    }

    /**
     * Access method for idServScolaire.
     *
     * @return the current value of idServScolaire
     */
    public String getIdServScolaire() {
        return idServScolaire;
    }

    /**
     * Setter method for idServScolaire.
     *
     * @param aIdServScolaire the new value for idServScolaire
     */
    public void setIdServScolaire(String aIdServScolaire) {
        idServScolaire = aIdServScolaire;
    }

    /**
     * Access method for liaisonFinancier.
     *
     * @return the current value of liaisonFinancier
     */
    public String getLiaisonFinancier() {
        return liaisonFinancier;
    }

    /**
     * Setter method for liaisonFinancier.
     *
     * @param aLiaisonFinancier the new value for liaisonFinancier
     */
    public void setLiaisonFinancier(String aLiaisonFinancier) {
        liaisonFinancier = aLiaisonFinancier;
    }

    /**
     * Access method for tauxRglt.
     *
     * @return the current value of tauxRglt
     */
    public BigDecimal getTauxRglt() {
        return tauxRglt;
    }

    /**
     * Setter method for tauxRglt.
     *
     * @param aTauxRglt the new value for tauxRglt
     */
    public void setTauxRglt(BigDecimal aTauxRglt) {
        tauxRglt = aTauxRglt;
    }

    /**
     * Access method for liaisonSite.
     *
     * @return the current value of liaisonSite
     */
    public String getLiaisonSite() {
        return liaisonSite;
    }

    /**
     * Setter method for liaisonSite.
     *
     * @param aLiaisonSite the new value for liaisonSite
     */
    public void setLiaisonSite(String aLiaisonSite) {
        liaisonSite = aLiaisonSite;
    }

    /**
     * Access method for numpromotioncs.
     *
     * @return the current value of numpromotioncs
     */
    public BigDecimal getNumpromotioncs() {
        return numpromotioncs;
    }

    /**
     * Setter method for numpromotioncs.
     *
     * @param aNumpromotioncs the new value for numpromotioncs
     */
    public void setNumpromotioncs(BigDecimal aNumpromotioncs) {
        numpromotioncs = aNumpromotioncs;
    }

    /**
     * Access method for datedemarragecs.
     *
     * @return the current value of datedemarragecs
     */
    public LocalDateTime getDatedemarragecs() {
        return datedemarragecs;
    }

    /**
     * Setter method for datedemarragecs.
     *
     * @param aDatedemarragecs the new value for datedemarragecs
     */
    public void setDatedemarragecs(LocalDateTime aDatedemarragecs) {
        datedemarragecs = aDatedemarragecs;
    }

    /**
     * Access method for controlBalckliste.
     *
     * @return the current value of controlBalckliste
     */
    public String getControlBalckliste() {
        return controlBalckliste;
    }

    /**
     * Setter method for controlBalckliste.
     *
     * @param aControlBalckliste the new value for controlBalckliste
     */
    public void setControlBalckliste(String aControlBalckliste) {
        controlBalckliste = aControlBalckliste;
    }

    /**
     * Access method for maxValCreditAccepte.
     *
     * @return the current value of maxValCreditAccepte
     */
    public BigDecimal getMaxValCreditAccepte() {
        return maxValCreditAccepte;
    }

    /**
     * Setter method for maxValCreditAccepte.
     *
     * @param aMaxValCreditAccepte the new value for maxValCreditAccepte
     */
    public void setMaxValCreditAccepte(BigDecimal aMaxValCreditAccepte) {
        maxValCreditAccepte = aMaxValCreditAccepte;
    }

    /**
     * Access method for maxTauxCreditAccepte.
     *
     * @return the current value of maxTauxCreditAccepte
     */
    public BigDecimal getMaxTauxCreditAccepte() {
        return maxTauxCreditAccepte;
    }

    /**
     * Setter method for maxTauxCreditAccepte.
     *
     * @param aMaxTauxCreditAccepte the new value for maxTauxCreditAccepte
     */
    public void setMaxTauxCreditAccepte(BigDecimal aMaxTauxCreditAccepte) {
        maxTauxCreditAccepte = aMaxTauxCreditAccepte;
    }

    /**
     * Access method for creditMax.
     *
     * @return the current value of creditMax
     */
    public BigDecimal getCreditMax() {
        return creditMax;
    }

    /**
     * Setter method for creditMax.
     *
     * @param aCreditMax the new value for creditMax
     */
    public void setCreditMax(BigDecimal aCreditMax) {
        creditMax = aCreditMax;
    }

    /**
     * Access method for activeDispenseAuto.
     *
     * @return the current value of activeDispenseAuto
     */
    public String getActiveDispenseAuto() {
        return activeDispenseAuto;
    }

    /**
     * Setter method for activeDispenseAuto.
     *
     * @param aActiveDispenseAuto the new value for activeDispenseAuto
     */
    public void setActiveDispenseAuto(String aActiveDispenseAuto) {
        activeDispenseAuto = aActiveDispenseAuto;
    }

    /**
     * Access method for activeMpEns.
     *
     * @return the current value of activeMpEns
     */
    public String getActiveMpEns() {
        return activeMpEns;
    }

    /**
     * Setter method for activeMpEns.
     *
     * @param aActiveMpEns the new value for activeMpEns
     */
    public void setActiveMpEns(String aActiveMpEns) {
        activeMpEns = aActiveMpEns;
    }

    /**
     * Access method for activeModuleOpt.
     *
     * @return the current value of activeModuleOpt
     */
    public String getActiveModuleOpt() {
        return activeModuleOpt;
    }

    /**
     * Setter method for activeModuleOpt.
     *
     * @param aActiveModuleOpt the new value for activeModuleOpt
     */
    public void setActiveModuleOpt(String aActiveModuleOpt) {
        activeModuleOpt = aActiveModuleOpt;
    }

    /**
     * Access method for verrouResul.
     *
     * @return the current value of verrouResul
     */
    public String getVerrouResul() {
        return verrouResul;
    }

    /**
     * Setter method for verrouResul.
     *
     * @param aVerrouResul the new value for verrouResul
     */
    public void setVerrouResul(String aVerrouResul) {
        verrouResul = aVerrouResul;
    }

    /**
     * Access method for totEctsAdmis.
     *
     * @return the current value of totEctsAdmis
     */
    public BigDecimal getTotEctsAdmis() {
        return totEctsAdmis;
    }

    /**
     * Setter method for totEctsAdmis.
     *
     * @param aTotEctsAdmis the new value for totEctsAdmis
     */
    public void setTotEctsAdmis(BigDecimal aTotEctsAdmis) {
        totEctsAdmis = aTotEctsAdmis;
    }

    /**
     * Access method for quotaEctsNv.
     *
     * @return the current value of quotaEctsNv
     */
    public BigDecimal getQuotaEctsNv() {
        return quotaEctsNv;
    }

    /**
     * Setter method for quotaEctsNv.
     *
     * @param aQuotaEctsNv the new value for quotaEctsNv
     */
    public void setQuotaEctsNv(BigDecimal aQuotaEctsNv) {
        quotaEctsNv = aQuotaEctsNv;
    }

    /**
     * Access method for activerTauxAbsence.
     *
     * @return the current value of activerTauxAbsence
     */
    public String getActiverTauxAbsence() {
        return activerTauxAbsence;
    }

    /**
     * Setter method for activerTauxAbsence.
     *
     * @param aActiverTauxAbsence the new value for activerTauxAbsence
     */
    public void setActiverTauxAbsence(String aActiverTauxAbsence) {
        activerTauxAbsence = aActiverTauxAbsence;
    }

    /**
     * Access method for tauxMaxAbsence.
     *
     * @return the current value of tauxMaxAbsence
     */
    public BigDecimal getTauxMaxAbsence() {
        return tauxMaxAbsence;
    }

    /**
     * Setter method for tauxMaxAbsence.
     *
     * @param aTauxMaxAbsence the new value for tauxMaxAbsence
     */
    public void setTauxMaxAbsence(BigDecimal aTauxMaxAbsence) {
        tauxMaxAbsence = aTauxMaxAbsence;
    }

    /**
     * Access method for nbhSemaine.
     *
     * @return the current value of nbhSemaine
     */
    public BigDecimal getNbhSemaine() {
        return nbhSemaine;
    }

    /**
     * Setter method for nbhSemaine.
     *
     * @param aNbhSemaine the new value for nbhSemaine
     */
    public void setNbhSemaine(BigDecimal aNbhSemaine) {
        nbhSemaine = aNbhSemaine;
    }

    /**
     * Access method for blockOtherRat.
     *
     * @return the current value of blockOtherRat
     */
    public String getBlockOtherRat() {
        return blockOtherRat;
    }

    /**
     * Setter method for blockOtherRat.
     *
     * @param aBlockOtherRat the new value for blockOtherRat
     */
    public void setBlockOtherRat(String aBlockOtherRat) {
        blockOtherRat = aBlockOtherRat;
    }

    /**
     * Access method for ctrlFinStat.
     *
     * @return the current value of ctrlFinStat
     */
    public String getCtrlFinStat() {
        return ctrlFinStat;
    }

    /**
     * Setter method for ctrlFinStat.
     *
     * @param aCtrlFinStat the new value for ctrlFinStat
     */
    public void setCtrlFinStat(String aCtrlFinStat) {
        ctrlFinStat = aCtrlFinStat;
    }

    /**
     * Access method for ctrlConformEcts.
     *
     * @return the current value of ctrlConformEcts
     */
    public BigDecimal getCtrlConformEcts() {
        return ctrlConformEcts;
    }

    /**
     * Setter method for ctrlConformEcts.
     *
     * @param aCtrlConformEcts the new value for ctrlConformEcts
     */
    public void setCtrlConformEcts(BigDecimal aCtrlConformEcts) {
        ctrlConformEcts = aCtrlConformEcts;
    }

    /**
     * Access method for verrouPlEtude.
     *
     * @return the current value of verrouPlEtude
     */
    public String getVerrouPlEtude() {
        return verrouPlEtude;
    }

    /**
     * Setter method for verrouPlEtude.
     *
     * @param aVerrouPlEtude the new value for verrouPlEtude
     */
    public void setVerrouPlEtude(String aVerrouPlEtude) {
        verrouPlEtude = aVerrouPlEtude;
    }

    /**
     * Access method for anneeAdmission.
     *
     * @return the current value of anneeAdmission
     */
    public String getAnneeAdmission() {
        return anneeAdmission;
    }

    /**
     * Setter method for anneeAdmission.
     *
     * @param aAnneeAdmission the new value for anneeAdmission
     */
    public void setAnneeAdmission(String aAnneeAdmission) {
        anneeAdmission = aAnneeAdmission;
    }

    /**
     * Compares the key for this instance with another Societe.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Societe and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Societe)) {
            return false;
        }
        Societe that = (Societe) other;
        Object myCodeSoc = this.getCodeSoc();
        Object yourCodeSoc = that.getCodeSoc();
        if (myCodeSoc==null ? yourCodeSoc!=null : !myCodeSoc.equals(yourCodeSoc)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Societe.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Societe)) return false;
        return this.equalKeys(other) && ((Societe)other).equalKeys(this);
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
        if (getCodeSoc() == null) {
            i = 0;
        } else {
            i = getCodeSoc().hashCode();
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
        StringBuffer sb = new StringBuffer("[Societe |");
        sb.append(" codeSoc=").append(getCodeSoc());
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
        ret.put("codeSoc", getCodeSoc());
        return ret;
    }

}
