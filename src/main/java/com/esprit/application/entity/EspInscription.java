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

@Entity(name="ESP_INSCRIPTION")
@IdClass(EspInscription.EspInscriptionId.class)
public class EspInscription implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspInscriptionId implements Serializable {
        EspSaisonUniversitaire espSaisonUniversitaire;
        EspEtudiant espEtudiant;
    }

    /** Primary key. */
    protected static final String PK = "EspInscriptionPkEspInscription";

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

    @Column(name="ANNEE_FIN", length=4)
    private String anneeFin;
    @Column(name="COUT_ANNUEL", precision=18, scale=6)
    private BigDecimal coutAnnuel;
    @Column(name="FRAIS_INS", precision=18, scale=6)
    private BigDecimal fraisIns;
    @Column(name="TYPE_RGLT", length=2)
    private String typeRglt;
    @Column(name="MODE_RGLT", length=2)
    private String modeRglt;
    @Column(name="CODE_DEV", length=4)
    private String codeDev;
    @Column(name="COUT_DEV", precision=18, scale=6)
    private BigDecimal coutDev;
    @Column(name="SIT_RGLT", length=1)
    private String sitRglt;
    @Column(name="CREDIT_RGLT", precision=18, scale=6)
    private BigDecimal creditRglt;
    @Column(name="NB_CREDIT_MODULE", precision=38)
    private BigDecimal nbCreditModule;
    @Column(name="MOY_SEM1", precision=7, scale=4)
    private BigDecimal moySem1;
    @Column(name="MOY_SEM2", precision=7, scale=4)
    private BigDecimal moySem2;
    @Column(name="MOY_GENERAL", precision=7, scale=4)
    private BigDecimal moyGeneral;
    @Column(name="RESULTAT", length=2)
    private String resultat;
    @Column(name="NIVEAU_ACCEES", precision=1)
    private BigDecimal niveauAccees;
    @Column(name="TYPE_INSC", length=1)
    private String typeInsc;
    @Column(name="NIV_LANGUE", length=5)
    private String nivLangue;
    @Column(name="CODE_CL_LANGUE", length=10)
    private String codeClLangue;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Column(name="DERN_UTILISATEUR", length=16)
    private String dernUtilisateur;
    @Column(name="DATE_PREINSC")
    private LocalDateTime datePreinsc;
    @Column(name="DATE_INSC")
    private LocalDateTime dateInsc;
    @Column(name="CODE_CL1", length=10)
    private String codeCl1;
    @Column(name="CODE_CL2", length=10)
    private String codeCl2;
    @Column(name="MOY_RATT", precision=5, scale=2)
    private BigDecimal moyRatt;
    @Column(name="OBSERVATION", length=2000)
    private String observation;
    @Column(name="NUMPROMOTIONCS", precision=4)
    private BigDecimal numpromotioncs;
    @Column(name="CODE_DECISION_SESSION_P", length=2)
    private String codeDecisionSessionP;
    @Column(name="LIB_DECISION_SESSION_P", length=200)
    private String libDecisionSessionP;
    @Column(name="CODE_DECISION_SESSION_RAT", length=2)
    private String codeDecisionSessionRat;
    @Column(name="LIB_DECISION_SESSION_RAT", length=500)
    private String libDecisionSessionRat;
    @Column(name="NB_IMP_ATTEST_REUSSITE", precision=2)
    private BigDecimal nbImpAttestReussite;
    @Column(name="DATE_LAST_MAJ_DECISION_PRINC")
    private LocalDateTime dateLastMajDecisionPrinc;
    @Column(name="DATE_LAST_MAJ_DECISION_RATT")
    private LocalDateTime dateLastMajDecisionRatt;
    @Column(name="CREDIT_ANT", length=20)
    private String creditAnt;
    @Column(name="NB_IMP_RELEVE", precision=2)
    private BigDecimal nbImpReleve;
    @Column(name="ETAT_ENTRETIEN", length=1)
    private String etatEntretien;
    @Column(name="DATE_LAST_MODIF_RAT2")
    private LocalDateTime dateLastModifRat2;
    @Column(name="MOY_RAT2", precision=5, scale=2)
    private BigDecimal moyRat2;
    @Column(name="CODE_DECISION_SESSION_RAT2", length=2)
    private String codeDecisionSessionRat2;
    @Column(name="LIB_DECISION_SESSION_RAT2", length=200)
    private String libDecisionSessionRat2;
    @Column(name="ADMIS_RACH", length=1)
    private String admisRach;
    @Column(name="MOY_RAT_AV_RACH", precision=10, scale=2)
    private BigDecimal moyRatAvRach;
    @Column(name="ADMIS_TS", length=1)
    private String admisTs;
    @Column(name="DATE_LIM_PROLONG_RGLT")
    private LocalDateTime dateLimProlongRglt;
    @Column(name="NIV_ACQUIS_FRANCAIS", length=2)
    private String nivAcquisFrancais;
    @Column(name="MAJ_NIVEAU_DEFINITIF", precision=1)
    private BigDecimal majNiveauDefinitif;
    @Column(name="RESERVE", length=1)
    private String reserve;
    @Column(name="NB_ECTS_SP", precision=6, scale=2)
    private BigDecimal nbEctsSp;
    @Column(name="NB_ECTS_SR", precision=6, scale=2)
    private BigDecimal nbEctsSr;
    @Column(name="NIV_ACQUIS_ANGLAIS", length=2)
    private String nivAcquisAnglais;
    @Column(name="DATE_TEST_FR")
    private LocalDateTime dateTestFr;
    @Column(name="DATE_TEST_ANG")
    private LocalDateTime dateTestAng;
    @Column(name="PREP_TOEIC", nullable=false, length=1)
    private String prepToeic;
    @Column(name="TEST_TOEIC", nullable=false, length=1)
    private String testToeic;
    @Column(name="ETAT_INS_TEST_NIV", nullable=false, length=1)
    private String etatInsTestNiv;
    @Column(name="CONFIRM_REINSCRIPTION", length=1)
    private String confirmReinscription;
    @Column(name="GROUPE_TARIF", length=20)
    private String groupeTarif;
    @Column(name="NUM_ANNEXE", precision=2)
    private BigDecimal numAnnexe;
    @Column(name="NUM_ANNUEL_DIPLOME", precision=4)
    private BigDecimal numAnnuelDiplome;
    @Column(name="MOY_GEN_AV_PFE_SP", precision=10, scale=3)
    private BigDecimal moyGenAvPfeSp;
    @Column(name="MOY_GEN_AV_PFE_SR", precision=10, scale=3)
    private BigDecimal moyGenAvPfeSr;
    @Column(name="ETAT_FINANCIER", precision=1)
    private BigDecimal etatFinancier;
    
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ID_ET", nullable=false)
    private EspEtudiant espEtudiant;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ANNEE_DEB", nullable=false)
    private EspSaisonUniversitaire espSaisonUniversitaire;

    /** Default constructor. */
    public EspInscription() {
        super();
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
     * Access method for coutAnnuel.
     *
     * @return the current value of coutAnnuel
     */
    public BigDecimal getCoutAnnuel() {
        return coutAnnuel;
    }

    /**
     * Setter method for coutAnnuel.
     *
     * @param aCoutAnnuel the new value for coutAnnuel
     */
    public void setCoutAnnuel(BigDecimal aCoutAnnuel) {
        coutAnnuel = aCoutAnnuel;
    }

    /**
     * Access method for fraisIns.
     *
     * @return the current value of fraisIns
     */
    public BigDecimal getFraisIns() {
        return fraisIns;
    }

    /**
     * Setter method for fraisIns.
     *
     * @param aFraisIns the new value for fraisIns
     */
    public void setFraisIns(BigDecimal aFraisIns) {
        fraisIns = aFraisIns;
    }

    /**
     * Access method for typeRglt.
     *
     * @return the current value of typeRglt
     */
    public String getTypeRglt() {
        return typeRglt;
    }

    /**
     * Setter method for typeRglt.
     *
     * @param aTypeRglt the new value for typeRglt
     */
    public void setTypeRglt(String aTypeRglt) {
        typeRglt = aTypeRglt;
    }

    /**
     * Access method for modeRglt.
     *
     * @return the current value of modeRglt
     */
    public String getModeRglt() {
        return modeRglt;
    }

    /**
     * Setter method for modeRglt.
     *
     * @param aModeRglt the new value for modeRglt
     */
    public void setModeRglt(String aModeRglt) {
        modeRglt = aModeRglt;
    }

    /**
     * Access method for codeDev.
     *
     * @return the current value of codeDev
     */
    public String getCodeDev() {
        return codeDev;
    }

    /**
     * Setter method for codeDev.
     *
     * @param aCodeDev the new value for codeDev
     */
    public void setCodeDev(String aCodeDev) {
        codeDev = aCodeDev;
    }

    /**
     * Access method for coutDev.
     *
     * @return the current value of coutDev
     */
    public BigDecimal getCoutDev() {
        return coutDev;
    }

    /**
     * Setter method for coutDev.
     *
     * @param aCoutDev the new value for coutDev
     */
    public void setCoutDev(BigDecimal aCoutDev) {
        coutDev = aCoutDev;
    }

    /**
     * Access method for sitRglt.
     *
     * @return the current value of sitRglt
     */
    public String getSitRglt() {
        return sitRglt;
    }

    /**
     * Setter method for sitRglt.
     *
     * @param aSitRglt the new value for sitRglt
     */
    public void setSitRglt(String aSitRglt) {
        sitRglt = aSitRglt;
    }

    /**
     * Access method for creditRglt.
     *
     * @return the current value of creditRglt
     */
    public BigDecimal getCreditRglt() {
        return creditRglt;
    }

    /**
     * Setter method for creditRglt.
     *
     * @param aCreditRglt the new value for creditRglt
     */
    public void setCreditRglt(BigDecimal aCreditRglt) {
        creditRglt = aCreditRglt;
    }

    /**
     * Access method for nbCreditModule.
     *
     * @return the current value of nbCreditModule
     */
    public BigDecimal getNbCreditModule() {
        return nbCreditModule;
    }

    /**
     * Setter method for nbCreditModule.
     *
     * @param aNbCreditModule the new value for nbCreditModule
     */
    public void setNbCreditModule(BigDecimal aNbCreditModule) {
        nbCreditModule = aNbCreditModule;
    }

    /**
     * Access method for moySem1.
     *
     * @return the current value of moySem1
     */
    public BigDecimal getMoySem1() {
        return moySem1;
    }

    /**
     * Setter method for moySem1.
     *
     * @param aMoySem1 the new value for moySem1
     */
    public void setMoySem1(BigDecimal aMoySem1) {
        moySem1 = aMoySem1;
    }

    /**
     * Access method for moySem2.
     *
     * @return the current value of moySem2
     */
    public BigDecimal getMoySem2() {
        return moySem2;
    }

    /**
     * Setter method for moySem2.
     *
     * @param aMoySem2 the new value for moySem2
     */
    public void setMoySem2(BigDecimal aMoySem2) {
        moySem2 = aMoySem2;
    }

    /**
     * Access method for moyGeneral.
     *
     * @return the current value of moyGeneral
     */
    public BigDecimal getMoyGeneral() {
        return moyGeneral;
    }

    /**
     * Setter method for moyGeneral.
     *
     * @param aMoyGeneral the new value for moyGeneral
     */
    public void setMoyGeneral(BigDecimal aMoyGeneral) {
        moyGeneral = aMoyGeneral;
    }

    /**
     * Access method for resultat.
     *
     * @return the current value of resultat
     */
    public String getResultat() {
        return resultat;
    }

    /**
     * Setter method for resultat.
     *
     * @param aResultat the new value for resultat
     */
    public void setResultat(String aResultat) {
        resultat = aResultat;
    }

    /**
     * Access method for niveauAccees.
     *
     * @return the current value of niveauAccees
     */
    public BigDecimal getNiveauAccees() {
        return niveauAccees;
    }

    /**
     * Setter method for niveauAccees.
     *
     * @param aNiveauAccees the new value for niveauAccees
     */
    public void setNiveauAccees(BigDecimal aNiveauAccees) {
        niveauAccees = aNiveauAccees;
    }

    /**
     * Access method for typeInsc.
     *
     * @return the current value of typeInsc
     */
    public String getTypeInsc() {
        return typeInsc;
    }

    /**
     * Setter method for typeInsc.
     *
     * @param aTypeInsc the new value for typeInsc
     */
    public void setTypeInsc(String aTypeInsc) {
        typeInsc = aTypeInsc;
    }

    /**
     * Access method for nivLangue.
     *
     * @return the current value of nivLangue
     */
    public String getNivLangue() {
        return nivLangue;
    }

    /**
     * Setter method for nivLangue.
     *
     * @param aNivLangue the new value for nivLangue
     */
    public void setNivLangue(String aNivLangue) {
        nivLangue = aNivLangue;
    }

    /**
     * Access method for codeClLangue.
     *
     * @return the current value of codeClLangue
     */
    public String getCodeClLangue() {
        return codeClLangue;
    }

    /**
     * Setter method for codeClLangue.
     *
     * @param aCodeClLangue the new value for codeClLangue
     */
    public void setCodeClLangue(String aCodeClLangue) {
        codeClLangue = aCodeClLangue;
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
     * Access method for dernUtilisateur.
     *
     * @return the current value of dernUtilisateur
     */
    public String getDernUtilisateur() {
        return dernUtilisateur;
    }

    /**
     * Setter method for dernUtilisateur.
     *
     * @param aDernUtilisateur the new value for dernUtilisateur
     */
    public void setDernUtilisateur(String aDernUtilisateur) {
        dernUtilisateur = aDernUtilisateur;
    }

    /**
     * Access method for datePreinsc.
     *
     * @return the current value of datePreinsc
     */
    public LocalDateTime getDatePreinsc() {
        return datePreinsc;
    }

    /**
     * Setter method for datePreinsc.
     *
     * @param aDatePreinsc the new value for datePreinsc
     */
    public void setDatePreinsc(LocalDateTime aDatePreinsc) {
        datePreinsc = aDatePreinsc;
    }

    /**
     * Access method for dateInsc.
     *
     * @return the current value of dateInsc
     */
    public LocalDateTime getDateInsc() {
        return dateInsc;
    }

    /**
     * Setter method for dateInsc.
     *
     * @param aDateInsc the new value for dateInsc
     */
    public void setDateInsc(LocalDateTime aDateInsc) {
        dateInsc = aDateInsc;
    }

    /**
     * Access method for codeCl1.
     *
     * @return the current value of codeCl1
     */
    public String getCodeCl1() {
        return codeCl1;
    }

    /**
     * Setter method for codeCl1.
     *
     * @param aCodeCl1 the new value for codeCl1
     */
    public void setCodeCl1(String aCodeCl1) {
        codeCl1 = aCodeCl1;
    }

    /**
     * Access method for codeCl2.
     *
     * @return the current value of codeCl2
     */
    public String getCodeCl2() {
        return codeCl2;
    }

    /**
     * Setter method for codeCl2.
     *
     * @param aCodeCl2 the new value for codeCl2
     */
    public void setCodeCl2(String aCodeCl2) {
        codeCl2 = aCodeCl2;
    }

    /**
     * Access method for moyRatt.
     *
     * @return the current value of moyRatt
     */
    public BigDecimal getMoyRatt() {
        return moyRatt;
    }

    /**
     * Setter method for moyRatt.
     *
     * @param aMoyRatt the new value for moyRatt
     */
    public void setMoyRatt(BigDecimal aMoyRatt) {
        moyRatt = aMoyRatt;
    }

    /**
     * Access method for observation.
     *
     * @return the current value of observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * Setter method for observation.
     *
     * @param aObservation the new value for observation
     */
    public void setObservation(String aObservation) {
        observation = aObservation;
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
     * Access method for codeDecisionSessionP.
     *
     * @return the current value of codeDecisionSessionP
     */
    public String getCodeDecisionSessionP() {
        return codeDecisionSessionP;
    }

    /**
     * Setter method for codeDecisionSessionP.
     *
     * @param aCodeDecisionSessionP the new value for codeDecisionSessionP
     */
    public void setCodeDecisionSessionP(String aCodeDecisionSessionP) {
        codeDecisionSessionP = aCodeDecisionSessionP;
    }

    /**
     * Access method for libDecisionSessionP.
     *
     * @return the current value of libDecisionSessionP
     */
    public String getLibDecisionSessionP() {
        return libDecisionSessionP;
    }

    /**
     * Setter method for libDecisionSessionP.
     *
     * @param aLibDecisionSessionP the new value for libDecisionSessionP
     */
    public void setLibDecisionSessionP(String aLibDecisionSessionP) {
        libDecisionSessionP = aLibDecisionSessionP;
    }

    /**
     * Access method for codeDecisionSessionRat.
     *
     * @return the current value of codeDecisionSessionRat
     */
    public String getCodeDecisionSessionRat() {
        return codeDecisionSessionRat;
    }

    /**
     * Setter method for codeDecisionSessionRat.
     *
     * @param aCodeDecisionSessionRat the new value for codeDecisionSessionRat
     */
    public void setCodeDecisionSessionRat(String aCodeDecisionSessionRat) {
        codeDecisionSessionRat = aCodeDecisionSessionRat;
    }

    /**
     * Access method for libDecisionSessionRat.
     *
     * @return the current value of libDecisionSessionRat
     */
    public String getLibDecisionSessionRat() {
        return libDecisionSessionRat;
    }

    /**
     * Setter method for libDecisionSessionRat.
     *
     * @param aLibDecisionSessionRat the new value for libDecisionSessionRat
     */
    public void setLibDecisionSessionRat(String aLibDecisionSessionRat) {
        libDecisionSessionRat = aLibDecisionSessionRat;
    }

    /**
     * Access method for nbImpAttestReussite.
     *
     * @return the current value of nbImpAttestReussite
     */
    public BigDecimal getNbImpAttestReussite() {
        return nbImpAttestReussite;
    }

    /**
     * Setter method for nbImpAttestReussite.
     *
     * @param aNbImpAttestReussite the new value for nbImpAttestReussite
     */
    public void setNbImpAttestReussite(BigDecimal aNbImpAttestReussite) {
        nbImpAttestReussite = aNbImpAttestReussite;
    }

    /**
     * Access method for dateLastMajDecisionPrinc.
     *
     * @return the current value of dateLastMajDecisionPrinc
     */
    public LocalDateTime getDateLastMajDecisionPrinc() {
        return dateLastMajDecisionPrinc;
    }

    /**
     * Setter method for dateLastMajDecisionPrinc.
     *
     * @param aDateLastMajDecisionPrinc the new value for dateLastMajDecisionPrinc
     */
    public void setDateLastMajDecisionPrinc(LocalDateTime aDateLastMajDecisionPrinc) {
        dateLastMajDecisionPrinc = aDateLastMajDecisionPrinc;
    }

    /**
     * Access method for dateLastMajDecisionRatt.
     *
     * @return the current value of dateLastMajDecisionRatt
     */
    public LocalDateTime getDateLastMajDecisionRatt() {
        return dateLastMajDecisionRatt;
    }

    /**
     * Setter method for dateLastMajDecisionRatt.
     *
     * @param aDateLastMajDecisionRatt the new value for dateLastMajDecisionRatt
     */
    public void setDateLastMajDecisionRatt(LocalDateTime aDateLastMajDecisionRatt) {
        dateLastMajDecisionRatt = aDateLastMajDecisionRatt;
    }

    /**
     * Access method for creditAnt.
     *
     * @return the current value of creditAnt
     */
    public String getCreditAnt() {
        return creditAnt;
    }

    /**
     * Setter method for creditAnt.
     *
     * @param aCreditAnt the new value for creditAnt
     */
    public void setCreditAnt(String aCreditAnt) {
        creditAnt = aCreditAnt;
    }

    /**
     * Access method for nbImpReleve.
     *
     * @return the current value of nbImpReleve
     */
    public BigDecimal getNbImpReleve() {
        return nbImpReleve;
    }

    /**
     * Setter method for nbImpReleve.
     *
     * @param aNbImpReleve the new value for nbImpReleve
     */
    public void setNbImpReleve(BigDecimal aNbImpReleve) {
        nbImpReleve = aNbImpReleve;
    }

    /**
     * Access method for etatEntretien.
     *
     * @return the current value of etatEntretien
     */
    public String getEtatEntretien() {
        return etatEntretien;
    }

    /**
     * Setter method for etatEntretien.
     *
     * @param aEtatEntretien the new value for etatEntretien
     */
    public void setEtatEntretien(String aEtatEntretien) {
        etatEntretien = aEtatEntretien;
    }

    /**
     * Access method for dateLastModifRat2.
     *
     * @return the current value of dateLastModifRat2
     */
    public LocalDateTime getDateLastModifRat2() {
        return dateLastModifRat2;
    }

    /**
     * Setter method for dateLastModifRat2.
     *
     * @param aDateLastModifRat2 the new value for dateLastModifRat2
     */
    public void setDateLastModifRat2(LocalDateTime aDateLastModifRat2) {
        dateLastModifRat2 = aDateLastModifRat2;
    }

    /**
     * Access method for moyRat2.
     *
     * @return the current value of moyRat2
     */
    public BigDecimal getMoyRat2() {
        return moyRat2;
    }

    /**
     * Setter method for moyRat2.
     *
     * @param aMoyRat2 the new value for moyRat2
     */
    public void setMoyRat2(BigDecimal aMoyRat2) {
        moyRat2 = aMoyRat2;
    }

    /**
     * Access method for codeDecisionSessionRat2.
     *
     * @return the current value of codeDecisionSessionRat2
     */
    public String getCodeDecisionSessionRat2() {
        return codeDecisionSessionRat2;
    }

    /**
     * Setter method for codeDecisionSessionRat2.
     *
     * @param aCodeDecisionSessionRat2 the new value for codeDecisionSessionRat2
     */
    public void setCodeDecisionSessionRat2(String aCodeDecisionSessionRat2) {
        codeDecisionSessionRat2 = aCodeDecisionSessionRat2;
    }

    /**
     * Access method for libDecisionSessionRat2.
     *
     * @return the current value of libDecisionSessionRat2
     */
    public String getLibDecisionSessionRat2() {
        return libDecisionSessionRat2;
    }

    /**
     * Setter method for libDecisionSessionRat2.
     *
     * @param aLibDecisionSessionRat2 the new value for libDecisionSessionRat2
     */
    public void setLibDecisionSessionRat2(String aLibDecisionSessionRat2) {
        libDecisionSessionRat2 = aLibDecisionSessionRat2;
    }

    /**
     * Access method for admisRach.
     *
     * @return the current value of admisRach
     */
    public String getAdmisRach() {
        return admisRach;
    }

    /**
     * Setter method for admisRach.
     *
     * @param aAdmisRach the new value for admisRach
     */
    public void setAdmisRach(String aAdmisRach) {
        admisRach = aAdmisRach;
    }

    /**
     * Access method for moyRatAvRach.
     *
     * @return the current value of moyRatAvRach
     */
    public BigDecimal getMoyRatAvRach() {
        return moyRatAvRach;
    }

    /**
     * Setter method for moyRatAvRach.
     *
     * @param aMoyRatAvRach the new value for moyRatAvRach
     */
    public void setMoyRatAvRach(BigDecimal aMoyRatAvRach) {
        moyRatAvRach = aMoyRatAvRach;
    }

    /**
     * Access method for admisTs.
     *
     * @return the current value of admisTs
     */
    public String getAdmisTs() {
        return admisTs;
    }

    /**
     * Setter method for admisTs.
     *
     * @param aAdmisTs the new value for admisTs
     */
    public void setAdmisTs(String aAdmisTs) {
        admisTs = aAdmisTs;
    }

    /**
     * Access method for dateLimProlongRglt.
     *
     * @return the current value of dateLimProlongRglt
     */
    public LocalDateTime getDateLimProlongRglt() {
        return dateLimProlongRglt;
    }

    /**
     * Setter method for dateLimProlongRglt.
     *
     * @param aDateLimProlongRglt the new value for dateLimProlongRglt
     */
    public void setDateLimProlongRglt(LocalDateTime aDateLimProlongRglt) {
        dateLimProlongRglt = aDateLimProlongRglt;
    }

    /**
     * Access method for nivAcquisFrancais.
     *
     * @return the current value of nivAcquisFrancais
     */
    public String getNivAcquisFrancais() {
        return nivAcquisFrancais;
    }

    /**
     * Setter method for nivAcquisFrancais.
     *
     * @param aNivAcquisFrancais the new value for nivAcquisFrancais
     */
    public void setNivAcquisFrancais(String aNivAcquisFrancais) {
        nivAcquisFrancais = aNivAcquisFrancais;
    }

    /**
     * Access method for majNiveauDefinitif.
     *
     * @return the current value of majNiveauDefinitif
     */
    public BigDecimal getMajNiveauDefinitif() {
        return majNiveauDefinitif;
    }

    /**
     * Setter method for majNiveauDefinitif.
     *
     * @param aMajNiveauDefinitif the new value for majNiveauDefinitif
     */
    public void setMajNiveauDefinitif(BigDecimal aMajNiveauDefinitif) {
        majNiveauDefinitif = aMajNiveauDefinitif;
    }

    /**
     * Access method for reserve.
     *
     * @return the current value of reserve
     */
    public String getReserve() {
        return reserve;
    }

    /**
     * Setter method for reserve.
     *
     * @param aReserve the new value for reserve
     */
    public void setReserve(String aReserve) {
        reserve = aReserve;
    }

    /**
     * Access method for nbEctsSp.
     *
     * @return the current value of nbEctsSp
     */
    public BigDecimal getNbEctsSp() {
        return nbEctsSp;
    }

    /**
     * Setter method for nbEctsSp.
     *
     * @param aNbEctsSp the new value for nbEctsSp
     */
    public void setNbEctsSp(BigDecimal aNbEctsSp) {
        nbEctsSp = aNbEctsSp;
    }

    /**
     * Access method for nbEctsSr.
     *
     * @return the current value of nbEctsSr
     */
    public BigDecimal getNbEctsSr() {
        return nbEctsSr;
    }

    /**
     * Setter method for nbEctsSr.
     *
     * @param aNbEctsSr the new value for nbEctsSr
     */
    public void setNbEctsSr(BigDecimal aNbEctsSr) {
        nbEctsSr = aNbEctsSr;
    }

    /**
     * Access method for nivAcquisAnglais.
     *
     * @return the current value of nivAcquisAnglais
     */
    public String getNivAcquisAnglais() {
        return nivAcquisAnglais;
    }

    /**
     * Setter method for nivAcquisAnglais.
     *
     * @param aNivAcquisAnglais the new value for nivAcquisAnglais
     */
    public void setNivAcquisAnglais(String aNivAcquisAnglais) {
        nivAcquisAnglais = aNivAcquisAnglais;
    }

    /**
     * Access method for dateTestFr.
     *
     * @return the current value of dateTestFr
     */
    public LocalDateTime getDateTestFr() {
        return dateTestFr;
    }

    /**
     * Setter method for dateTestFr.
     *
     * @param aDateTestFr the new value for dateTestFr
     */
    public void setDateTestFr(LocalDateTime aDateTestFr) {
        dateTestFr = aDateTestFr;
    }

    /**
     * Access method for dateTestAng.
     *
     * @return the current value of dateTestAng
     */
    public LocalDateTime getDateTestAng() {
        return dateTestAng;
    }

    /**
     * Setter method for dateTestAng.
     *
     * @param aDateTestAng the new value for dateTestAng
     */
    public void setDateTestAng(LocalDateTime aDateTestAng) {
        dateTestAng = aDateTestAng;
    }

    /**
     * Access method for prepToeic.
     *
     * @return the current value of prepToeic
     */
    public String getPrepToeic() {
        return prepToeic;
    }

    /**
     * Setter method for prepToeic.
     *
     * @param aPrepToeic the new value for prepToeic
     */
    public void setPrepToeic(String aPrepToeic) {
        prepToeic = aPrepToeic;
    }

    /**
     * Access method for testToeic.
     *
     * @return the current value of testToeic
     */
    public String getTestToeic() {
        return testToeic;
    }

    /**
     * Setter method for testToeic.
     *
     * @param aTestToeic the new value for testToeic
     */
    public void setTestToeic(String aTestToeic) {
        testToeic = aTestToeic;
    }

    /**
     * Access method for etatInsTestNiv.
     *
     * @return the current value of etatInsTestNiv
     */
    public String getEtatInsTestNiv() {
        return etatInsTestNiv;
    }

    /**
     * Setter method for etatInsTestNiv.
     *
     * @param aEtatInsTestNiv the new value for etatInsTestNiv
     */
    public void setEtatInsTestNiv(String aEtatInsTestNiv) {
        etatInsTestNiv = aEtatInsTestNiv;
    }

    /**
     * Access method for confirmReinscription.
     *
     * @return the current value of confirmReinscription
     */
    public String getConfirmReinscription() {
        return confirmReinscription;
    }

    /**
     * Setter method for confirmReinscription.
     *
     * @param aConfirmReinscription the new value for confirmReinscription
     */
    public void setConfirmReinscription(String aConfirmReinscription) {
        confirmReinscription = aConfirmReinscription;
    }

    /**
     * Access method for groupeTarif.
     *
     * @return the current value of groupeTarif
     */
    public String getGroupeTarif() {
        return groupeTarif;
    }

    /**
     * Setter method for groupeTarif.
     *
     * @param aGroupeTarif the new value for groupeTarif
     */
    public void setGroupeTarif(String aGroupeTarif) {
        groupeTarif = aGroupeTarif;
    }

    /**
     * Access method for numAnnexe.
     *
     * @return the current value of numAnnexe
     */
    public BigDecimal getNumAnnexe() {
        return numAnnexe;
    }

    /**
     * Setter method for numAnnexe.
     *
     * @param aNumAnnexe the new value for numAnnexe
     */
    public void setNumAnnexe(BigDecimal aNumAnnexe) {
        numAnnexe = aNumAnnexe;
    }

    /**
     * Access method for numAnnuelDiplome.
     *
     * @return the current value of numAnnuelDiplome
     */
    public BigDecimal getNumAnnuelDiplome() {
        return numAnnuelDiplome;
    }

    /**
     * Setter method for numAnnuelDiplome.
     *
     * @param aNumAnnuelDiplome the new value for numAnnuelDiplome
     */
    public void setNumAnnuelDiplome(BigDecimal aNumAnnuelDiplome) {
        numAnnuelDiplome = aNumAnnuelDiplome;
    }

    /**
     * Access method for moyGenAvPfeSp.
     *
     * @return the current value of moyGenAvPfeSp
     */
    public BigDecimal getMoyGenAvPfeSp() {
        return moyGenAvPfeSp;
    }

    /**
     * Setter method for moyGenAvPfeSp.
     *
     * @param aMoyGenAvPfeSp the new value for moyGenAvPfeSp
     */
    public void setMoyGenAvPfeSp(BigDecimal aMoyGenAvPfeSp) {
        moyGenAvPfeSp = aMoyGenAvPfeSp;
    }

    /**
     * Access method for moyGenAvPfeSr.
     *
     * @return the current value of moyGenAvPfeSr
     */
    public BigDecimal getMoyGenAvPfeSr() {
        return moyGenAvPfeSr;
    }

    /**
     * Setter method for moyGenAvPfeSr.
     *
     * @param aMoyGenAvPfeSr the new value for moyGenAvPfeSr
     */
    public void setMoyGenAvPfeSr(BigDecimal aMoyGenAvPfeSr) {
        moyGenAvPfeSr = aMoyGenAvPfeSr;
    }

    /**
     * Access method for etatFinancier.
     *
     * @return the current value of etatFinancier
     */
    public BigDecimal getEtatFinancier() {
        return etatFinancier;
    }

    /**
     * Setter method for etatFinancier.
     *
     * @param aEtatFinancier the new value for etatFinancier
     */
    public void setEtatFinancier(BigDecimal aEtatFinancier) {
        etatFinancier = aEtatFinancier;
    }

}