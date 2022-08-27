// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ESP_ETUDIANT")
public class EspEtudiant implements Serializable {

    /** Primary key. */
    protected static final String PK = "idEt";

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
    @Column(name="ID_ET", unique=true, nullable=false, length=10)
    private String idEt;
    @Column(name="NOM_ET", length=30)
    private String nomEt;
    @Column(name="PNOM_ET", length=30)
    private String pnomEt;
    @Column(name="DATE_NAIS_ET")
    private LocalDateTime dateNaisEt;
    @Column(name="LIEU_NAIS_ET", length=30)
    private String lieuNaisEt;
    @Column(name="NATURE_ET", length=2)
    private String natureEt;
    @Column(name="FONCTION_ET", length=30)
    private String fonctionEt;
    @Column(name="ADRESSE_ET", length=100)
    private String adresseEt;
    @Column(name="TEL_ET", length=120)
    private String telEt;
    @Column(name="TEL_PARENT_ET", length=30)
    private String telParentEt;
    @Column(name="E_MAIL_ET", length=60)
    private String eMailEt;
    @Column(name="CYCLE_ET", length=2)
    private String cycleEt;
    @Column(name="NATURE_BAC", length=2)
    private String natureBac;
    @Column(name="DATE_BAC")
    private LocalDateTime dateBac;
    @Column(name="NUM_BAC_ET", length=20)
    private String numBacEt;
    @Column(name="ETAB_BAC", length=100)
    private String etabBac;
    @Column(name="DIPLOME_SUP_ET", length=100)
    private String diplomeSupEt;
    @Column(name="NIVEAU_DIPLOME_SUP_ET", precision=38)
    private BigDecimal niveauDiplomeSupEt;
    @Column(name="ETAB_ORIGINE", length=100)
    private String etabOrigine;
    @Column(name="SPECIALITE_ESP_ET", length=2)
    private String specialiteEspEt;
    @Column(name="DATE_ENTREE_ESP_ET")
    private LocalDateTime dateEntreeEspEt;
    @Column(name="ANNEE_ENTREE_ESP_ET", length=4)
    private String anneeEntreeEspEt;
    @Column(name="CLASSE_COURANTE_ET", length=10)
    private String classeCouranteEt;
    @Column(name="SITUATION_FINANCIERE_ET", length=2)
    private String situationFinanciereEt;
    @Column(name="NIVEAU_COURANT_ET", precision=1)
    private BigDecimal niveauCourantEt;
    @Column(name="MOYENNE_DERN_SEMESTRE_ET", precision=5, scale=2)
    private BigDecimal moyenneDernSemestreEt;
    @Column(name="RESULTAT_FINAL_ET", length=2)
    private String resultatFinalEt;
    @Column(name="DIPLOME_OBTENU_ESP_ET", length=2)
    private String diplomeObtenuEspEt;
    @Column(name="DATE_SORTIE_ET")
    private LocalDateTime dateSortieEt;
    @Column(name="OBSERVATION_ET", length=1000)
    private String observationEt;
    @Column(name="SEXE", length=1)
    private String sexe;
    @Column(name="NATIONALITE", length=20)
    private String nationalite;
    @Column(name="NUM_CIN_PASSEPORT", length=30)
    private String numCinPasseport;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="DATE_DERN_MODIF")
    private LocalDateTime dateDernModif;
    @Column(name="AGENT", length=10)
    private String agent;
    @Column(name="NUM_ORD", length=10)
    private String numOrd;
    @Column(name="DATE_DELIVRANCE")
    private LocalDateTime dateDelivrance;
    @Column(name="LIEU_DELIVRANCE", length=30)
    private String lieuDelivrance;
    @Column(name="NIVEAU_ACCES", precision=1)
    private BigDecimal niveauAcces;
    @Column(name="NATURE_COURS", length=2)
    private String natureCours;
    @Column(name="NATURE_PIECE_ID", length=1)
    private String naturePieceId;
    @Column(name="ADRESSE_PARENT", length=100)
    private String adresseParent;
    @Column(name="CP_PARENT", length=6)
    private String cpParent;
    @Column(name="VILLE_PARENT", length=30)
    private String villeParent;
    @Column(name="PAYS_PARENT", length=30)
    private String paysParent;
    @Column(name="CP_ET", length=6)
    private String cpEt;
    @Column(name="VILLE_ET", length=30)
    private String villeEt;
    @Column(name="PAYS_ET", length=30)
    private String paysEt;
    @Column(name="E_MAIL_PARENT", length=60)
    private String eMailParent;
    @Column(name="TEL_PARENT", length=40)
    private String telParent;
    @Column(name="TYPE_ENREG_ET", length=1)
    private String typeEnregEt;
    @Column(name="DATE_LIEU_NAIS", length=50)
    private String dateLieuNais;
    @Column(name="CODE_ETAB_ORIGINE", length=3)
    private String codeEtabOrigine;
    @Column(name="CODE_SPEC_ORIGINE", length=3)
    private String codeSpecOrigine;
    @Column(name="LIB_SPEC_ORIGINE", length=100)
    private String libSpecOrigine;
    @Column(name="CLASSE_PREC_ET", length=10)
    private String classePrecEt;
    @Column(name="ID_ET_ORIGIN", length=10)
    private String idEtOrigin;
    @Column(name="ETAT", length=1)
    private String etat;
    @Column(name="JUSTIF_ETAT", length=2)
    private String justifEtat;
    @Column(name="LIB_JUSTIF_ETAT", length=30)
    private String libJustifEtat;
    @Column(name="ID_ET_NEW", length=10)
    private String idEtNew;
    @Column(name="ID_ET_ORIGINE", length=10)
    private String idEtOrigine;
    @Column(name="DATE_LAST_CHANGE_ETAT")
    private LocalDateTime dateLastChangeEtat;
    @Column(name="DERN_UTILISATEUR", length=16)
    private String dernUtilisateur;
    @Column(name="NUMCOMPTE", length=10)
    private String numcompte;
    @Column(name="BANQUE", length=50)
    private String banque;
    @Column(name="RIB_BANQUE", length=22)
    private String ribBanque;
    @Column(name="MP08", length=10)
    private String mp08;
    @Column(name="TYPE_ET", length=1)
    private String typeEt;
    @Column(name="CODE_NATIONALITE", length=2)
    private String codeNationalite;
    @Column(name="NUMPROMOTIONCS", precision=4)
    private BigDecimal numpromotioncs;
    @Column(name="CODE_DECISION_SESSION_P_AP1", length=2)
    private String codeDecisionSessionPAp1;
    @Column(name="LIB_DECISION_SESSION_P_AP1", length=200)
    private String libDecisionSessionPAp1;
    @Column(name="CODE_DECISION_SESSION_R_AP1", length=2)
    private String codeDecisionSessionRAp1;
    @Column(name="LIB_DECISION_SESSION_R_AP1", length=200)
    private String libDecisionSessionRAp1;
    @Column(name="CODE_DECISION_SESSION_P_AP2", length=2)
    private String codeDecisionSessionPAp2;
    @Column(name="LIB_DECISION_SESSION_P_AP2", length=200)
    private String libDecisionSessionPAp2;
    @Column(name="CODE_DECISION_SESSION_R_AP2", length=2)
    private String codeDecisionSessionRAp2;
    @Column(name="LIB_DECISION_SESSION_R_AP2", length=200)
    private String libDecisionSessionRAp2;
    @Column(name="CODE_DECISION_SESSION_P_AP3", length=2)
    private String codeDecisionSessionPAp3;
    @Column(name="LIB_DECISION_SESSION_P_AP3", length=200)
    private String libDecisionSessionPAp3;
    @Column(name="CODE_DECISION_SESSION_R_AP3", length=2)
    private String codeDecisionSessionRAp3;
    @Column(name="LIB_DECISION_SESSION_R_AP3", length=200)
    private String libDecisionSessionRAp3;
    @Column(name="MOY_P_AP1", precision=5, scale=2)
    private BigDecimal moyPAp1;
    @Column(name="MOY_R_AP1", precision=5, scale=2)
    private BigDecimal moyRAp1;
    @Column(name="MOY_P_AP2", precision=5, scale=2)
    private BigDecimal moyPAp2;
    @Column(name="MOY_R_AP2", precision=5, scale=2)
    private BigDecimal moyRAp2;
    @Column(name="MOY_P_AP3", precision=5, scale=2)
    private BigDecimal moyPAp3;
    @Column(name="MOY_R_AP3", precision=5, scale=2)
    private BigDecimal moyRAp3;
    @Column(name="NB_IMP_RELEVE", precision=2)
    private BigDecimal nbImpReleve;
    @Column(name="CODE_BARRE", length=20)
    private String codeBarre;
    @Column(name="MOY_BAC_ET", length=20)
    private String moyBacEt;
    @Column(name="LOGIN", length=50)
    private String login;
    @Column(name="PASSWORD", length=50)
    private String password;
    @Column(name="FONCTION_PERE_ET", length=50)
    private String fonctionPereEt;
    @Column(name="FONCTION_MERE_ET", length=50)
    private String fonctionMereEt;
    @Column(name="TEL_MERE_ET", length=20)
    private String telMereEt;
    @Column(name="TEL_PERE_ET", length=20)
    private String telPereEt;
    @Column(name="EMAIL_PERE_ET", length=100)
    private String emailPereEt;
    @Column(name="EMAIL_MERE_ET", length=100)
    private String emailMereEt;
    @Column(name="NOM_PERE_ET", length=50)
    private String nomPereEt;
    @Column(name="NOM_MERE_ET", length=50)
    private String nomMereEt;
    @Column(name="ANNEE_BAC", length=10)
    private String anneeBac;
    @Column(name="ANNEE_DIPLOME", length=10)
    private String anneeDiplome;
    @Column(name="MOY_BAC_ET2", precision=5, scale=2)
    private BigDecimal moyBacEt2;
    @Column(name="ENTRETIEN_ANGLAIS", precision=5, scale=2)
    private BigDecimal entretienAnglais;
    @Column(name="ENTRETIEN_FRANCAIS", precision=5, scale=2)
    private BigDecimal entretienFrancais;
    @Column(name="ENS_ID_ENS", length=255)
    private String ensIdEns;
    @Column(name="FK_ENS", length=255)
    private String fkEns;
    @Column(name="FK_ENSEI", length=255)
    private String fkEnsei;
    @Column(name="TEL_ET1", precision=20)
    private BigDecimal telEt1;
    @Column(name="MOY_BAC", precision=5, scale=2)
    private BigDecimal moyBac;
    @Column(name="FILIERE_PREPA", length=2)
    private String filierePrepa;
    @Column(name="LIB_FILIERE_PREPA", length=20)
    private String libFilierePrepa;
    @Column(name="DATEENTR", length=20)
    private String dateentr;
    @Column(name="SCORE_FINAL", precision=10, scale=3)
    private BigDecimal scoreFinal;
    @Column(name="SCORE_MIN_ADMIN", precision=10, scale=3)
    private BigDecimal scoreMinAdmin;
    @Column(name="USER_TRANSF_PREINSCRIT", length=16)
    private String userTransfPreinscrit;
    @Column(name="DATE_TRANSF_PREINSCRIT")
    private LocalDateTime dateTransfPreinscrit;
    @Column(name="NUM_LOT", precision=1)
    private BigDecimal numLot;
    @Column(name="RECOMMANDATION", length=1)
    private String recommandation;
    @Column(name="GOUVERNORAT", length=20)
    private String gouvernorat;
    @Column(name="ADRESSE_MAIL_ESP", length=50)
    private String adresseMailEsp;
    @Column(name="PWD_ET", length=20)
    private String pwdEt;
    @Column(name="PWD_ET_INIT", length=20)
    private String pwdEtInit;
    @Column(name="SUIVI_PARTICULIER", length=1)
    private String suiviParticulier;
    @Column(name="NIVEAU_COURANT_ANG", length=2)
    private String niveauCourantAng;
    @Column(name="NIVEAU_COURANT_FR", length=2)
    private String niveauCourantFr;
    @Column(name="ID_ELEVE_EDUSERV", length=10)
    private String idEleveEduserv;
    @Column(name="PWD_PARENT", length=20)
    private String pwdParent;
    @Column(name="GROUPE_TARIF", length=20)
    private String groupeTarif;
    @Column(name="CODE_RFID", length=20)
    private String codeRfid;
    @Column(name="CHOIX_A_B", length=2)
    private String choixAB;
    @Column(name="CODE_GOUVERNORAT", length=2)
    private String codeGouvernorat;
   
   
    @ManyToOne
    @JoinColumn(name="CODE_CL")
    private Classe classe;
   

    /** Default constructor. */
    public EspEtudiant() {
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
     * Access method for dateNaisEt.
     *
     * @return the current value of dateNaisEt
     */
    public LocalDateTime getDateNaisEt() {
        return dateNaisEt;
    }

    /**
     * Setter method for dateNaisEt.
     *
     * @param aDateNaisEt the new value for dateNaisEt
     */
    public void setDateNaisEt(LocalDateTime aDateNaisEt) {
        dateNaisEt = aDateNaisEt;
    }

    /**
     * Access method for lieuNaisEt.
     *
     * @return the current value of lieuNaisEt
     */
    public String getLieuNaisEt() {
        return lieuNaisEt;
    }

    /**
     * Setter method for lieuNaisEt.
     *
     * @param aLieuNaisEt the new value for lieuNaisEt
     */
    public void setLieuNaisEt(String aLieuNaisEt) {
        lieuNaisEt = aLieuNaisEt;
    }

    /**
     * Access method for natureEt.
     *
     * @return the current value of natureEt
     */
    public String getNatureEt() {
        return natureEt;
    }

    /**
     * Setter method for natureEt.
     *
     * @param aNatureEt the new value for natureEt
     */
    public void setNatureEt(String aNatureEt) {
        natureEt = aNatureEt;
    }

    /**
     * Access method for fonctionEt.
     *
     * @return the current value of fonctionEt
     */
    public String getFonctionEt() {
        return fonctionEt;
    }

    /**
     * Setter method for fonctionEt.
     *
     * @param aFonctionEt the new value for fonctionEt
     */
    public void setFonctionEt(String aFonctionEt) {
        fonctionEt = aFonctionEt;
    }

    /**
     * Access method for adresseEt.
     *
     * @return the current value of adresseEt
     */
    public String getAdresseEt() {
        return adresseEt;
    }

    /**
     * Setter method for adresseEt.
     *
     * @param aAdresseEt the new value for adresseEt
     */
    public void setAdresseEt(String aAdresseEt) {
        adresseEt = aAdresseEt;
    }

    /**
     * Access method for telEt.
     *
     * @return the current value of telEt
     */
    public String getTelEt() {
        return telEt;
    }

    /**
     * Setter method for telEt.
     *
     * @param aTelEt the new value for telEt
     */
    public void setTelEt(String aTelEt) {
        telEt = aTelEt;
    }

    /**
     * Access method for telParentEt.
     *
     * @return the current value of telParentEt
     */
    public String getTelParentEt() {
        return telParentEt;
    }

    /**
     * Setter method for telParentEt.
     *
     * @param aTelParentEt the new value for telParentEt
     */
    public void setTelParentEt(String aTelParentEt) {
        telParentEt = aTelParentEt;
    }

    /**
     * Access method for eMailEt.
     *
     * @return the current value of eMailEt
     */
    public String getEMailEt() {
        return eMailEt;
    }

    /**
     * Setter method for eMailEt.
     *
     * @param aEMailEt the new value for eMailEt
     */
    public void setEMailEt(String aEMailEt) {
        eMailEt = aEMailEt;
    }

    /**
     * Access method for cycleEt.
     *
     * @return the current value of cycleEt
     */
    public String getCycleEt() {
        return cycleEt;
    }

    /**
     * Setter method for cycleEt.
     *
     * @param aCycleEt the new value for cycleEt
     */
    public void setCycleEt(String aCycleEt) {
        cycleEt = aCycleEt;
    }

    /**
     * Access method for natureBac.
     *
     * @return the current value of natureBac
     */
    public String getNatureBac() {
        return natureBac;
    }

    /**
     * Setter method for natureBac.
     *
     * @param aNatureBac the new value for natureBac
     */
    public void setNatureBac(String aNatureBac) {
        natureBac = aNatureBac;
    }

    /**
     * Access method for dateBac.
     *
     * @return the current value of dateBac
     */
    public LocalDateTime getDateBac() {
        return dateBac;
    }

    /**
     * Setter method for dateBac.
     *
     * @param aDateBac the new value for dateBac
     */
    public void setDateBac(LocalDateTime aDateBac) {
        dateBac = aDateBac;
    }

    /**
     * Access method for numBacEt.
     *
     * @return the current value of numBacEt
     */
    public String getNumBacEt() {
        return numBacEt;
    }

    /**
     * Setter method for numBacEt.
     *
     * @param aNumBacEt the new value for numBacEt
     */
    public void setNumBacEt(String aNumBacEt) {
        numBacEt = aNumBacEt;
    }

    /**
     * Access method for etabBac.
     *
     * @return the current value of etabBac
     */
    public String getEtabBac() {
        return etabBac;
    }

    /**
     * Setter method for etabBac.
     *
     * @param aEtabBac the new value for etabBac
     */
    public void setEtabBac(String aEtabBac) {
        etabBac = aEtabBac;
    }

    /**
     * Access method for diplomeSupEt.
     *
     * @return the current value of diplomeSupEt
     */
    public String getDiplomeSupEt() {
        return diplomeSupEt;
    }

    /**
     * Setter method for diplomeSupEt.
     *
     * @param aDiplomeSupEt the new value for diplomeSupEt
     */
    public void setDiplomeSupEt(String aDiplomeSupEt) {
        diplomeSupEt = aDiplomeSupEt;
    }

    /**
     * Access method for niveauDiplomeSupEt.
     *
     * @return the current value of niveauDiplomeSupEt
     */
    public BigDecimal getNiveauDiplomeSupEt() {
        return niveauDiplomeSupEt;
    }

    /**
     * Setter method for niveauDiplomeSupEt.
     *
     * @param aNiveauDiplomeSupEt the new value for niveauDiplomeSupEt
     */
    public void setNiveauDiplomeSupEt(BigDecimal aNiveauDiplomeSupEt) {
        niveauDiplomeSupEt = aNiveauDiplomeSupEt;
    }

    /**
     * Access method for etabOrigine.
     *
     * @return the current value of etabOrigine
     */
    public String getEtabOrigine() {
        return etabOrigine;
    }

    /**
     * Setter method for etabOrigine.
     *
     * @param aEtabOrigine the new value for etabOrigine
     */
    public void setEtabOrigine(String aEtabOrigine) {
        etabOrigine = aEtabOrigine;
    }

    /**
     * Access method for specialiteEspEt.
     *
     * @return the current value of specialiteEspEt
     */
    public String getSpecialiteEspEt() {
        return specialiteEspEt;
    }

    /**
     * Setter method for specialiteEspEt.
     *
     * @param aSpecialiteEspEt the new value for specialiteEspEt
     */
    public void setSpecialiteEspEt(String aSpecialiteEspEt) {
        specialiteEspEt = aSpecialiteEspEt;
    }

    /**
     * Access method for dateEntreeEspEt.
     *
     * @return the current value of dateEntreeEspEt
     */
    public LocalDateTime getDateEntreeEspEt() {
        return dateEntreeEspEt;
    }

    /**
     * Setter method for dateEntreeEspEt.
     *
     * @param aDateEntreeEspEt the new value for dateEntreeEspEt
     */
    public void setDateEntreeEspEt(LocalDateTime aDateEntreeEspEt) {
        dateEntreeEspEt = aDateEntreeEspEt;
    }

    /**
     * Access method for anneeEntreeEspEt.
     *
     * @return the current value of anneeEntreeEspEt
     */
    public String getAnneeEntreeEspEt() {
        return anneeEntreeEspEt;
    }

    /**
     * Setter method for anneeEntreeEspEt.
     *
     * @param aAnneeEntreeEspEt the new value for anneeEntreeEspEt
     */
    public void setAnneeEntreeEspEt(String aAnneeEntreeEspEt) {
        anneeEntreeEspEt = aAnneeEntreeEspEt;
    }

    /**
     * Access method for classeCouranteEt.
     *
     * @return the current value of classeCouranteEt
     */
    public String getClasseCouranteEt() {
        return classeCouranteEt;
    }

    /**
     * Setter method for classeCouranteEt.
     *
     * @param aClasseCouranteEt the new value for classeCouranteEt
     */
    public void setClasseCouranteEt(String aClasseCouranteEt) {
        classeCouranteEt = aClasseCouranteEt;
    }

    /**
     * Access method for situationFinanciereEt.
     *
     * @return the current value of situationFinanciereEt
     */
    public String getSituationFinanciereEt() {
        return situationFinanciereEt;
    }

    /**
     * Setter method for situationFinanciereEt.
     *
     * @param aSituationFinanciereEt the new value for situationFinanciereEt
     */
    public void setSituationFinanciereEt(String aSituationFinanciereEt) {
        situationFinanciereEt = aSituationFinanciereEt;
    }

    /**
     * Access method for niveauCourantEt.
     *
     * @return the current value of niveauCourantEt
     */
    public BigDecimal getNiveauCourantEt() {
        return niveauCourantEt;
    }

    /**
     * Setter method for niveauCourantEt.
     *
     * @param aNiveauCourantEt the new value for niveauCourantEt
     */
    public void setNiveauCourantEt(BigDecimal aNiveauCourantEt) {
        niveauCourantEt = aNiveauCourantEt;
    }

    /**
     * Access method for moyenneDernSemestreEt.
     *
     * @return the current value of moyenneDernSemestreEt
     */
    public BigDecimal getMoyenneDernSemestreEt() {
        return moyenneDernSemestreEt;
    }

    /**
     * Setter method for moyenneDernSemestreEt.
     *
     * @param aMoyenneDernSemestreEt the new value for moyenneDernSemestreEt
     */
    public void setMoyenneDernSemestreEt(BigDecimal aMoyenneDernSemestreEt) {
        moyenneDernSemestreEt = aMoyenneDernSemestreEt;
    }

    /**
     * Access method for resultatFinalEt.
     *
     * @return the current value of resultatFinalEt
     */
    public String getResultatFinalEt() {
        return resultatFinalEt;
    }

    /**
     * Setter method for resultatFinalEt.
     *
     * @param aResultatFinalEt the new value for resultatFinalEt
     */
    public void setResultatFinalEt(String aResultatFinalEt) {
        resultatFinalEt = aResultatFinalEt;
    }

    /**
     * Access method for diplomeObtenuEspEt.
     *
     * @return the current value of diplomeObtenuEspEt
     */
    public String getDiplomeObtenuEspEt() {
        return diplomeObtenuEspEt;
    }

    /**
     * Setter method for diplomeObtenuEspEt.
     *
     * @param aDiplomeObtenuEspEt the new value for diplomeObtenuEspEt
     */
    public void setDiplomeObtenuEspEt(String aDiplomeObtenuEspEt) {
        diplomeObtenuEspEt = aDiplomeObtenuEspEt;
    }

    /**
     * Access method for dateSortieEt.
     *
     * @return the current value of dateSortieEt
     */
    public LocalDateTime getDateSortieEt() {
        return dateSortieEt;
    }

    /**
     * Setter method for dateSortieEt.
     *
     * @param aDateSortieEt the new value for dateSortieEt
     */
    public void setDateSortieEt(LocalDateTime aDateSortieEt) {
        dateSortieEt = aDateSortieEt;
    }

    /**
     * Access method for observationEt.
     *
     * @return the current value of observationEt
     */
    public String getObservationEt() {
        return observationEt;
    }

    /**
     * Setter method for observationEt.
     *
     * @param aObservationEt the new value for observationEt
     */
    public void setObservationEt(String aObservationEt) {
        observationEt = aObservationEt;
    }

    /**
     * Access method for sexe.
     *
     * @return the current value of sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * Setter method for sexe.
     *
     * @param aSexe the new value for sexe
     */
    public void setSexe(String aSexe) {
        sexe = aSexe;
    }

    /**
     * Access method for nationalite.
     *
     * @return the current value of nationalite
     */
    public String getNationalite() {
        return nationalite;
    }

    /**
     * Setter method for nationalite.
     *
     * @param aNationalite the new value for nationalite
     */
    public void setNationalite(String aNationalite) {
        nationalite = aNationalite;
    }

    /**
     * Access method for numCinPasseport.
     *
     * @return the current value of numCinPasseport
     */
    public String getNumCinPasseport() {
        return numCinPasseport;
    }

    /**
     * Setter method for numCinPasseport.
     *
     * @param aNumCinPasseport the new value for numCinPasseport
     */
    public void setNumCinPasseport(String aNumCinPasseport) {
        numCinPasseport = aNumCinPasseport;
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
     * Access method for dateDernModif.
     *
     * @return the current value of dateDernModif
     */
    public LocalDateTime getDateDernModif() {
        return dateDernModif;
    }

    /**
     * Setter method for dateDernModif.
     *
     * @param aDateDernModif the new value for dateDernModif
     */
    public void setDateDernModif(LocalDateTime aDateDernModif) {
        dateDernModif = aDateDernModif;
    }

    /**
     * Access method for agent.
     *
     * @return the current value of agent
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Setter method for agent.
     *
     * @param aAgent the new value for agent
     */
    public void setAgent(String aAgent) {
        agent = aAgent;
    }

    /**
     * Access method for numOrd.
     *
     * @return the current value of numOrd
     */
    public String getNumOrd() {
        return numOrd;
    }

    /**
     * Setter method for numOrd.
     *
     * @param aNumOrd the new value for numOrd
     */
    public void setNumOrd(String aNumOrd) {
        numOrd = aNumOrd;
    }

    /**
     * Access method for dateDelivrance.
     *
     * @return the current value of dateDelivrance
     */
    public LocalDateTime getDateDelivrance() {
        return dateDelivrance;
    }

    /**
     * Setter method for dateDelivrance.
     *
     * @param aDateDelivrance the new value for dateDelivrance
     */
    public void setDateDelivrance(LocalDateTime aDateDelivrance) {
        dateDelivrance = aDateDelivrance;
    }

    /**
     * Access method for lieuDelivrance.
     *
     * @return the current value of lieuDelivrance
     */
    public String getLieuDelivrance() {
        return lieuDelivrance;
    }

    /**
     * Setter method for lieuDelivrance.
     *
     * @param aLieuDelivrance the new value for lieuDelivrance
     */
    public void setLieuDelivrance(String aLieuDelivrance) {
        lieuDelivrance = aLieuDelivrance;
    }

    /**
     * Access method for niveauAcces.
     *
     * @return the current value of niveauAcces
     */
    public BigDecimal getNiveauAcces() {
        return niveauAcces;
    }

    /**
     * Setter method for niveauAcces.
     *
     * @param aNiveauAcces the new value for niveauAcces
     */
    public void setNiveauAcces(BigDecimal aNiveauAcces) {
        niveauAcces = aNiveauAcces;
    }

    /**
     * Access method for natureCours.
     *
     * @return the current value of natureCours
     */
    public String getNatureCours() {
        return natureCours;
    }

    /**
     * Setter method for natureCours.
     *
     * @param aNatureCours the new value for natureCours
     */
    public void setNatureCours(String aNatureCours) {
        natureCours = aNatureCours;
    }

    /**
     * Access method for naturePieceId.
     *
     * @return the current value of naturePieceId
     */
    public String getNaturePieceId() {
        return naturePieceId;
    }

    /**
     * Setter method for naturePieceId.
     *
     * @param aNaturePieceId the new value for naturePieceId
     */
    public void setNaturePieceId(String aNaturePieceId) {
        naturePieceId = aNaturePieceId;
    }

    /**
     * Access method for adresseParent.
     *
     * @return the current value of adresseParent
     */
    public String getAdresseParent() {
        return adresseParent;
    }

    /**
     * Setter method for adresseParent.
     *
     * @param aAdresseParent the new value for adresseParent
     */
    public void setAdresseParent(String aAdresseParent) {
        adresseParent = aAdresseParent;
    }

    /**
     * Access method for cpParent.
     *
     * @return the current value of cpParent
     */
    public String getCpParent() {
        return cpParent;
    }

    /**
     * Setter method for cpParent.
     *
     * @param aCpParent the new value for cpParent
     */
    public void setCpParent(String aCpParent) {
        cpParent = aCpParent;
    }

    /**
     * Access method for villeParent.
     *
     * @return the current value of villeParent
     */
    public String getVilleParent() {
        return villeParent;
    }

    /**
     * Setter method for villeParent.
     *
     * @param aVilleParent the new value for villeParent
     */
    public void setVilleParent(String aVilleParent) {
        villeParent = aVilleParent;
    }

    /**
     * Access method for paysParent.
     *
     * @return the current value of paysParent
     */
    public String getPaysParent() {
        return paysParent;
    }

    /**
     * Setter method for paysParent.
     *
     * @param aPaysParent the new value for paysParent
     */
    public void setPaysParent(String aPaysParent) {
        paysParent = aPaysParent;
    }

    /**
     * Access method for cpEt.
     *
     * @return the current value of cpEt
     */
    public String getCpEt() {
        return cpEt;
    }

    /**
     * Setter method for cpEt.
     *
     * @param aCpEt the new value for cpEt
     */
    public void setCpEt(String aCpEt) {
        cpEt = aCpEt;
    }

    /**
     * Access method for villeEt.
     *
     * @return the current value of villeEt
     */
    public String getVilleEt() {
        return villeEt;
    }

    /**
     * Setter method for villeEt.
     *
     * @param aVilleEt the new value for villeEt
     */
    public void setVilleEt(String aVilleEt) {
        villeEt = aVilleEt;
    }

    /**
     * Access method for paysEt.
     *
     * @return the current value of paysEt
     */
    public String getPaysEt() {
        return paysEt;
    }

    /**
     * Setter method for paysEt.
     *
     * @param aPaysEt the new value for paysEt
     */
    public void setPaysEt(String aPaysEt) {
        paysEt = aPaysEt;
    }

    /**
     * Access method for eMailParent.
     *
     * @return the current value of eMailParent
     */
    public String getEMailParent() {
        return eMailParent;
    }

    /**
     * Setter method for eMailParent.
     *
     * @param aEMailParent the new value for eMailParent
     */
    public void setEMailParent(String aEMailParent) {
        eMailParent = aEMailParent;
    }

    /**
     * Access method for telParent.
     *
     * @return the current value of telParent
     */
    public String getTelParent() {
        return telParent;
    }

    /**
     * Setter method for telParent.
     *
     * @param aTelParent the new value for telParent
     */
    public void setTelParent(String aTelParent) {
        telParent = aTelParent;
    }

    /**
     * Access method for typeEnregEt.
     *
     * @return the current value of typeEnregEt
     */
    public String getTypeEnregEt() {
        return typeEnregEt;
    }

    /**
     * Setter method for typeEnregEt.
     *
     * @param aTypeEnregEt the new value for typeEnregEt
     */
    public void setTypeEnregEt(String aTypeEnregEt) {
        typeEnregEt = aTypeEnregEt;
    }

    /**
     * Access method for dateLieuNais.
     *
     * @return the current value of dateLieuNais
     */
    public String getDateLieuNais() {
        return dateLieuNais;
    }

    /**
     * Setter method for dateLieuNais.
     *
     * @param aDateLieuNais the new value for dateLieuNais
     */
    public void setDateLieuNais(String aDateLieuNais) {
        dateLieuNais = aDateLieuNais;
    }

    /**
     * Access method for codeEtabOrigine.
     *
     * @return the current value of codeEtabOrigine
     */
    public String getCodeEtabOrigine() {
        return codeEtabOrigine;
    }

    /**
     * Setter method for codeEtabOrigine.
     *
     * @param aCodeEtabOrigine the new value for codeEtabOrigine
     */
    public void setCodeEtabOrigine(String aCodeEtabOrigine) {
        codeEtabOrigine = aCodeEtabOrigine;
    }

    /**
     * Access method for codeSpecOrigine.
     *
     * @return the current value of codeSpecOrigine
     */
    public String getCodeSpecOrigine() {
        return codeSpecOrigine;
    }

    /**
     * Setter method for codeSpecOrigine.
     *
     * @param aCodeSpecOrigine the new value for codeSpecOrigine
     */
    public void setCodeSpecOrigine(String aCodeSpecOrigine) {
        codeSpecOrigine = aCodeSpecOrigine;
    }

    /**
     * Access method for libSpecOrigine.
     *
     * @return the current value of libSpecOrigine
     */
    public String getLibSpecOrigine() {
        return libSpecOrigine;
    }

    /**
     * Setter method for libSpecOrigine.
     *
     * @param aLibSpecOrigine the new value for libSpecOrigine
     */
    public void setLibSpecOrigine(String aLibSpecOrigine) {
        libSpecOrigine = aLibSpecOrigine;
    }

    /**
     * Access method for classePrecEt.
     *
     * @return the current value of classePrecEt
     */
    public String getClassePrecEt() {
        return classePrecEt;
    }

    /**
     * Setter method for classePrecEt.
     *
     * @param aClassePrecEt the new value for classePrecEt
     */
    public void setClassePrecEt(String aClassePrecEt) {
        classePrecEt = aClassePrecEt;
    }

    /**
     * Access method for idEtOrigin.
     *
     * @return the current value of idEtOrigin
     */
    public String getIdEtOrigin() {
        return idEtOrigin;
    }

    /**
     * Setter method for idEtOrigin.
     *
     * @param aIdEtOrigin the new value for idEtOrigin
     */
    public void setIdEtOrigin(String aIdEtOrigin) {
        idEtOrigin = aIdEtOrigin;
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
     * Access method for justifEtat.
     *
     * @return the current value of justifEtat
     */
    public String getJustifEtat() {
        return justifEtat;
    }

    /**
     * Setter method for justifEtat.
     *
     * @param aJustifEtat the new value for justifEtat
     */
    public void setJustifEtat(String aJustifEtat) {
        justifEtat = aJustifEtat;
    }

    /**
     * Access method for libJustifEtat.
     *
     * @return the current value of libJustifEtat
     */
    public String getLibJustifEtat() {
        return libJustifEtat;
    }

    /**
     * Setter method for libJustifEtat.
     *
     * @param aLibJustifEtat the new value for libJustifEtat
     */
    public void setLibJustifEtat(String aLibJustifEtat) {
        libJustifEtat = aLibJustifEtat;
    }

    /**
     * Access method for idEtNew.
     *
     * @return the current value of idEtNew
     */
    public String getIdEtNew() {
        return idEtNew;
    }

    /**
     * Setter method for idEtNew.
     *
     * @param aIdEtNew the new value for idEtNew
     */
    public void setIdEtNew(String aIdEtNew) {
        idEtNew = aIdEtNew;
    }

    /**
     * Access method for idEtOrigine.
     *
     * @return the current value of idEtOrigine
     */
    public String getIdEtOrigine() {
        return idEtOrigine;
    }

    /**
     * Setter method for idEtOrigine.
     *
     * @param aIdEtOrigine the new value for idEtOrigine
     */
    public void setIdEtOrigine(String aIdEtOrigine) {
        idEtOrigine = aIdEtOrigine;
    }

    /**
     * Access method for dateLastChangeEtat.
     *
     * @return the current value of dateLastChangeEtat
     */
    public LocalDateTime getDateLastChangeEtat() {
        return dateLastChangeEtat;
    }

    /**
     * Setter method for dateLastChangeEtat.
     *
     * @param aDateLastChangeEtat the new value for dateLastChangeEtat
     */
    public void setDateLastChangeEtat(LocalDateTime aDateLastChangeEtat) {
        dateLastChangeEtat = aDateLastChangeEtat;
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
     * Access method for numcompte.
     *
     * @return the current value of numcompte
     */
    public String getNumcompte() {
        return numcompte;
    }

    /**
     * Setter method for numcompte.
     *
     * @param aNumcompte the new value for numcompte
     */
    public void setNumcompte(String aNumcompte) {
        numcompte = aNumcompte;
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
     * Access method for ribBanque.
     *
     * @return the current value of ribBanque
     */
    public String getRibBanque() {
        return ribBanque;
    }

    /**
     * Setter method for ribBanque.
     *
     * @param aRibBanque the new value for ribBanque
     */
    public void setRibBanque(String aRibBanque) {
        ribBanque = aRibBanque;
    }

    /**
     * Access method for mp08.
     *
     * @return the current value of mp08
     */
    public String getMp08() {
        return mp08;
    }

    /**
     * Setter method for mp08.
     *
     * @param aMp08 the new value for mp08
     */
    public void setMp08(String aMp08) {
        mp08 = aMp08;
    }

    /**
     * Access method for typeEt.
     *
     * @return the current value of typeEt
     */
    public String getTypeEt() {
        return typeEt;
    }

    /**
     * Setter method for typeEt.
     *
     * @param aTypeEt the new value for typeEt
     */
    public void setTypeEt(String aTypeEt) {
        typeEt = aTypeEt;
    }

    /**
     * Access method for codeNationalite.
     *
     * @return the current value of codeNationalite
     */
    public String getCodeNationalite() {
        return codeNationalite;
    }

    /**
     * Setter method for codeNationalite.
     *
     * @param aCodeNationalite the new value for codeNationalite
     */
    public void setCodeNationalite(String aCodeNationalite) {
        codeNationalite = aCodeNationalite;
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
     * Access method for codeDecisionSessionPAp1.
     *
     * @return the current value of codeDecisionSessionPAp1
     */
    public String getCodeDecisionSessionPAp1() {
        return codeDecisionSessionPAp1;
    }

    /**
     * Setter method for codeDecisionSessionPAp1.
     *
     * @param aCodeDecisionSessionPAp1 the new value for codeDecisionSessionPAp1
     */
    public void setCodeDecisionSessionPAp1(String aCodeDecisionSessionPAp1) {
        codeDecisionSessionPAp1 = aCodeDecisionSessionPAp1;
    }

    /**
     * Access method for libDecisionSessionPAp1.
     *
     * @return the current value of libDecisionSessionPAp1
     */
    public String getLibDecisionSessionPAp1() {
        return libDecisionSessionPAp1;
    }

    /**
     * Setter method for libDecisionSessionPAp1.
     *
     * @param aLibDecisionSessionPAp1 the new value for libDecisionSessionPAp1
     */
    public void setLibDecisionSessionPAp1(String aLibDecisionSessionPAp1) {
        libDecisionSessionPAp1 = aLibDecisionSessionPAp1;
    }

    /**
     * Access method for codeDecisionSessionRAp1.
     *
     * @return the current value of codeDecisionSessionRAp1
     */
    public String getCodeDecisionSessionRAp1() {
        return codeDecisionSessionRAp1;
    }

    /**
     * Setter method for codeDecisionSessionRAp1.
     *
     * @param aCodeDecisionSessionRAp1 the new value for codeDecisionSessionRAp1
     */
    public void setCodeDecisionSessionRAp1(String aCodeDecisionSessionRAp1) {
        codeDecisionSessionRAp1 = aCodeDecisionSessionRAp1;
    }

    /**
     * Access method for libDecisionSessionRAp1.
     *
     * @return the current value of libDecisionSessionRAp1
     */
    public String getLibDecisionSessionRAp1() {
        return libDecisionSessionRAp1;
    }

    /**
     * Setter method for libDecisionSessionRAp1.
     *
     * @param aLibDecisionSessionRAp1 the new value for libDecisionSessionRAp1
     */
    public void setLibDecisionSessionRAp1(String aLibDecisionSessionRAp1) {
        libDecisionSessionRAp1 = aLibDecisionSessionRAp1;
    }

    /**
     * Access method for codeDecisionSessionPAp2.
     *
     * @return the current value of codeDecisionSessionPAp2
     */
    public String getCodeDecisionSessionPAp2() {
        return codeDecisionSessionPAp2;
    }

    /**
     * Setter method for codeDecisionSessionPAp2.
     *
     * @param aCodeDecisionSessionPAp2 the new value for codeDecisionSessionPAp2
     */
    public void setCodeDecisionSessionPAp2(String aCodeDecisionSessionPAp2) {
        codeDecisionSessionPAp2 = aCodeDecisionSessionPAp2;
    }

    /**
     * Access method for libDecisionSessionPAp2.
     *
     * @return the current value of libDecisionSessionPAp2
     */
    public String getLibDecisionSessionPAp2() {
        return libDecisionSessionPAp2;
    }

    /**
     * Setter method for libDecisionSessionPAp2.
     *
     * @param aLibDecisionSessionPAp2 the new value for libDecisionSessionPAp2
     */
    public void setLibDecisionSessionPAp2(String aLibDecisionSessionPAp2) {
        libDecisionSessionPAp2 = aLibDecisionSessionPAp2;
    }

    /**
     * Access method for codeDecisionSessionRAp2.
     *
     * @return the current value of codeDecisionSessionRAp2
     */
    public String getCodeDecisionSessionRAp2() {
        return codeDecisionSessionRAp2;
    }

    /**
     * Setter method for codeDecisionSessionRAp2.
     *
     * @param aCodeDecisionSessionRAp2 the new value for codeDecisionSessionRAp2
     */
    public void setCodeDecisionSessionRAp2(String aCodeDecisionSessionRAp2) {
        codeDecisionSessionRAp2 = aCodeDecisionSessionRAp2;
    }

    /**
     * Access method for libDecisionSessionRAp2.
     *
     * @return the current value of libDecisionSessionRAp2
     */
    public String getLibDecisionSessionRAp2() {
        return libDecisionSessionRAp2;
    }

    /**
     * Setter method for libDecisionSessionRAp2.
     *
     * @param aLibDecisionSessionRAp2 the new value for libDecisionSessionRAp2
     */
    public void setLibDecisionSessionRAp2(String aLibDecisionSessionRAp2) {
        libDecisionSessionRAp2 = aLibDecisionSessionRAp2;
    }

    /**
     * Access method for codeDecisionSessionPAp3.
     *
     * @return the current value of codeDecisionSessionPAp3
     */
    public String getCodeDecisionSessionPAp3() {
        return codeDecisionSessionPAp3;
    }

    /**
     * Setter method for codeDecisionSessionPAp3.
     *
     * @param aCodeDecisionSessionPAp3 the new value for codeDecisionSessionPAp3
     */
    public void setCodeDecisionSessionPAp3(String aCodeDecisionSessionPAp3) {
        codeDecisionSessionPAp3 = aCodeDecisionSessionPAp3;
    }

    /**
     * Access method for libDecisionSessionPAp3.
     *
     * @return the current value of libDecisionSessionPAp3
     */
    public String getLibDecisionSessionPAp3() {
        return libDecisionSessionPAp3;
    }

    /**
     * Setter method for libDecisionSessionPAp3.
     *
     * @param aLibDecisionSessionPAp3 the new value for libDecisionSessionPAp3
     */
    public void setLibDecisionSessionPAp3(String aLibDecisionSessionPAp3) {
        libDecisionSessionPAp3 = aLibDecisionSessionPAp3;
    }

    /**
     * Access method for codeDecisionSessionRAp3.
     *
     * @return the current value of codeDecisionSessionRAp3
     */
    public String getCodeDecisionSessionRAp3() {
        return codeDecisionSessionRAp3;
    }

    /**
     * Setter method for codeDecisionSessionRAp3.
     *
     * @param aCodeDecisionSessionRAp3 the new value for codeDecisionSessionRAp3
     */
    public void setCodeDecisionSessionRAp3(String aCodeDecisionSessionRAp3) {
        codeDecisionSessionRAp3 = aCodeDecisionSessionRAp3;
    }

    /**
     * Access method for libDecisionSessionRAp3.
     *
     * @return the current value of libDecisionSessionRAp3
     */
    public String getLibDecisionSessionRAp3() {
        return libDecisionSessionRAp3;
    }

    /**
     * Setter method for libDecisionSessionRAp3.
     *
     * @param aLibDecisionSessionRAp3 the new value for libDecisionSessionRAp3
     */
    public void setLibDecisionSessionRAp3(String aLibDecisionSessionRAp3) {
        libDecisionSessionRAp3 = aLibDecisionSessionRAp3;
    }

    /**
     * Access method for moyPAp1.
     *
     * @return the current value of moyPAp1
     */
    public BigDecimal getMoyPAp1() {
        return moyPAp1;
    }

    /**
     * Setter method for moyPAp1.
     *
     * @param aMoyPAp1 the new value for moyPAp1
     */
    public void setMoyPAp1(BigDecimal aMoyPAp1) {
        moyPAp1 = aMoyPAp1;
    }

    /**
     * Access method for moyRAp1.
     *
     * @return the current value of moyRAp1
     */
    public BigDecimal getMoyRAp1() {
        return moyRAp1;
    }

    /**
     * Setter method for moyRAp1.
     *
     * @param aMoyRAp1 the new value for moyRAp1
     */
    public void setMoyRAp1(BigDecimal aMoyRAp1) {
        moyRAp1 = aMoyRAp1;
    }

    /**
     * Access method for moyPAp2.
     *
     * @return the current value of moyPAp2
     */
    public BigDecimal getMoyPAp2() {
        return moyPAp2;
    }

    /**
     * Setter method for moyPAp2.
     *
     * @param aMoyPAp2 the new value for moyPAp2
     */
    public void setMoyPAp2(BigDecimal aMoyPAp2) {
        moyPAp2 = aMoyPAp2;
    }

    /**
     * Access method for moyRAp2.
     *
     * @return the current value of moyRAp2
     */
    public BigDecimal getMoyRAp2() {
        return moyRAp2;
    }

    /**
     * Setter method for moyRAp2.
     *
     * @param aMoyRAp2 the new value for moyRAp2
     */
    public void setMoyRAp2(BigDecimal aMoyRAp2) {
        moyRAp2 = aMoyRAp2;
    }

    /**
     * Access method for moyPAp3.
     *
     * @return the current value of moyPAp3
     */
    public BigDecimal getMoyPAp3() {
        return moyPAp3;
    }

    /**
     * Setter method for moyPAp3.
     *
     * @param aMoyPAp3 the new value for moyPAp3
     */
    public void setMoyPAp3(BigDecimal aMoyPAp3) {
        moyPAp3 = aMoyPAp3;
    }

    /**
     * Access method for moyRAp3.
     *
     * @return the current value of moyRAp3
     */
    public BigDecimal getMoyRAp3() {
        return moyRAp3;
    }

    /**
     * Setter method for moyRAp3.
     *
     * @param aMoyRAp3 the new value for moyRAp3
     */
    public void setMoyRAp3(BigDecimal aMoyRAp3) {
        moyRAp3 = aMoyRAp3;
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
     * Access method for codeBarre.
     *
     * @return the current value of codeBarre
     */
    public String getCodeBarre() {
        return codeBarre;
    }

    /**
     * Setter method for codeBarre.
     *
     * @param aCodeBarre the new value for codeBarre
     */
    public void setCodeBarre(String aCodeBarre) {
        codeBarre = aCodeBarre;
    }

    /**
     * Access method for moyBacEt.
     *
     * @return the current value of moyBacEt
     */
    public String getMoyBacEt() {
        return moyBacEt;
    }

    /**
     * Setter method for moyBacEt.
     *
     * @param aMoyBacEt the new value for moyBacEt
     */
    public void setMoyBacEt(String aMoyBacEt) {
        moyBacEt = aMoyBacEt;
    }

    /**
     * Access method for login.
     *
     * @return the current value of login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Setter method for login.
     *
     * @param aLogin the new value for login
     */
    public void setLogin(String aLogin) {
        login = aLogin;
    }

    /**
     * Access method for password.
     *
     * @return the current value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for password.
     *
     * @param aPassword the new value for password
     */
    public void setPassword(String aPassword) {
        password = aPassword;
    }

    /**
     * Access method for fonctionPereEt.
     *
     * @return the current value of fonctionPereEt
     */
    public String getFonctionPereEt() {
        return fonctionPereEt;
    }

    /**
     * Setter method for fonctionPereEt.
     *
     * @param aFonctionPereEt the new value for fonctionPereEt
     */
    public void setFonctionPereEt(String aFonctionPereEt) {
        fonctionPereEt = aFonctionPereEt;
    }

    /**
     * Access method for fonctionMereEt.
     *
     * @return the current value of fonctionMereEt
     */
    public String getFonctionMereEt() {
        return fonctionMereEt;
    }

    /**
     * Setter method for fonctionMereEt.
     *
     * @param aFonctionMereEt the new value for fonctionMereEt
     */
    public void setFonctionMereEt(String aFonctionMereEt) {
        fonctionMereEt = aFonctionMereEt;
    }

    /**
     * Access method for telMereEt.
     *
     * @return the current value of telMereEt
     */
    public String getTelMereEt() {
        return telMereEt;
    }

    /**
     * Setter method for telMereEt.
     *
     * @param aTelMereEt the new value for telMereEt
     */
    public void setTelMereEt(String aTelMereEt) {
        telMereEt = aTelMereEt;
    }

    /**
     * Access method for telPereEt.
     *
     * @return the current value of telPereEt
     */
    public String getTelPereEt() {
        return telPereEt;
    }

    /**
     * Setter method for telPereEt.
     *
     * @param aTelPereEt the new value for telPereEt
     */
    public void setTelPereEt(String aTelPereEt) {
        telPereEt = aTelPereEt;
    }

    /**
     * Access method for emailPereEt.
     *
     * @return the current value of emailPereEt
     */
    public String getEmailPereEt() {
        return emailPereEt;
    }

    /**
     * Setter method for emailPereEt.
     *
     * @param aEmailPereEt the new value for emailPereEt
     */
    public void setEmailPereEt(String aEmailPereEt) {
        emailPereEt = aEmailPereEt;
    }

    /**
     * Access method for emailMereEt.
     *
     * @return the current value of emailMereEt
     */
    public String getEmailMereEt() {
        return emailMereEt;
    }

    /**
     * Setter method for emailMereEt.
     *
     * @param aEmailMereEt the new value for emailMereEt
     */
    public void setEmailMereEt(String aEmailMereEt) {
        emailMereEt = aEmailMereEt;
    }

    /**
     * Access method for nomPereEt.
     *
     * @return the current value of nomPereEt
     */
    public String getNomPereEt() {
        return nomPereEt;
    }

    /**
     * Setter method for nomPereEt.
     *
     * @param aNomPereEt the new value for nomPereEt
     */
    public void setNomPereEt(String aNomPereEt) {
        nomPereEt = aNomPereEt;
    }

    /**
     * Access method for nomMereEt.
     *
     * @return the current value of nomMereEt
     */
    public String getNomMereEt() {
        return nomMereEt;
    }

    /**
     * Setter method for nomMereEt.
     *
     * @param aNomMereEt the new value for nomMereEt
     */
    public void setNomMereEt(String aNomMereEt) {
        nomMereEt = aNomMereEt;
    }

    /**
     * Access method for anneeBac.
     *
     * @return the current value of anneeBac
     */
    public String getAnneeBac() {
        return anneeBac;
    }

    /**
     * Setter method for anneeBac.
     *
     * @param aAnneeBac the new value for anneeBac
     */
    public void setAnneeBac(String aAnneeBac) {
        anneeBac = aAnneeBac;
    }

    /**
     * Access method for anneeDiplome.
     *
     * @return the current value of anneeDiplome
     */
    public String getAnneeDiplome() {
        return anneeDiplome;
    }

    /**
     * Setter method for anneeDiplome.
     *
     * @param aAnneeDiplome the new value for anneeDiplome
     */
    public void setAnneeDiplome(String aAnneeDiplome) {
        anneeDiplome = aAnneeDiplome;
    }

    /**
     * Access method for moyBacEt2.
     *
     * @return the current value of moyBacEt2
     */
    public BigDecimal getMoyBacEt2() {
        return moyBacEt2;
    }

    /**
     * Setter method for moyBacEt2.
     *
     * @param aMoyBacEt2 the new value for moyBacEt2
     */
    public void setMoyBacEt2(BigDecimal aMoyBacEt2) {
        moyBacEt2 = aMoyBacEt2;
    }

    /**
     * Access method for entretienAnglais.
     *
     * @return the current value of entretienAnglais
     */
    public BigDecimal getEntretienAnglais() {
        return entretienAnglais;
    }

    /**
     * Setter method for entretienAnglais.
     *
     * @param aEntretienAnglais the new value for entretienAnglais
     */
    public void setEntretienAnglais(BigDecimal aEntretienAnglais) {
        entretienAnglais = aEntretienAnglais;
    }

    /**
     * Access method for entretienFrancais.
     *
     * @return the current value of entretienFrancais
     */
    public BigDecimal getEntretienFrancais() {
        return entretienFrancais;
    }

    /**
     * Setter method for entretienFrancais.
     *
     * @param aEntretienFrancais the new value for entretienFrancais
     */
    public void setEntretienFrancais(BigDecimal aEntretienFrancais) {
        entretienFrancais = aEntretienFrancais;
    }

    /**
     * Access method for ensIdEns.
     *
     * @return the current value of ensIdEns
     */
    public String getEnsIdEns() {
        return ensIdEns;
    }

    /**
     * Setter method for ensIdEns.
     *
     * @param aEnsIdEns the new value for ensIdEns
     */
    public void setEnsIdEns(String aEnsIdEns) {
        ensIdEns = aEnsIdEns;
    }

    /**
     * Access method for fkEns.
     *
     * @return the current value of fkEns
     */
    public String getFkEns() {
        return fkEns;
    }

    /**
     * Setter method for fkEns.
     *
     * @param aFkEns the new value for fkEns
     */
    public void setFkEns(String aFkEns) {
        fkEns = aFkEns;
    }

    /**
     * Access method for fkEnsei.
     *
     * @return the current value of fkEnsei
     */
    public String getFkEnsei() {
        return fkEnsei;
    }

    /**
     * Setter method for fkEnsei.
     *
     * @param aFkEnsei the new value for fkEnsei
     */
    public void setFkEnsei(String aFkEnsei) {
        fkEnsei = aFkEnsei;
    }

    /**
     * Access method for telEt1.
     *
     * @return the current value of telEt1
     */
    public BigDecimal getTelEt1() {
        return telEt1;
    }

    /**
     * Setter method for telEt1.
     *
     * @param aTelEt1 the new value for telEt1
     */
    public void setTelEt1(BigDecimal aTelEt1) {
        telEt1 = aTelEt1;
    }

    /**
     * Access method for moyBac.
     *
     * @return the current value of moyBac
     */
    public BigDecimal getMoyBac() {
        return moyBac;
    }

    /**
     * Setter method for moyBac.
     *
     * @param aMoyBac the new value for moyBac
     */
    public void setMoyBac(BigDecimal aMoyBac) {
        moyBac = aMoyBac;
    }

    /**
     * Access method for filierePrepa.
     *
     * @return the current value of filierePrepa
     */
    public String getFilierePrepa() {
        return filierePrepa;
    }

    /**
     * Setter method for filierePrepa.
     *
     * @param aFilierePrepa the new value for filierePrepa
     */
    public void setFilierePrepa(String aFilierePrepa) {
        filierePrepa = aFilierePrepa;
    }

    /**
     * Access method for libFilierePrepa.
     *
     * @return the current value of libFilierePrepa
     */
    public String getLibFilierePrepa() {
        return libFilierePrepa;
    }

    /**
     * Setter method for libFilierePrepa.
     *
     * @param aLibFilierePrepa the new value for libFilierePrepa
     */
    public void setLibFilierePrepa(String aLibFilierePrepa) {
        libFilierePrepa = aLibFilierePrepa;
    }

    /**
     * Access method for dateentr.
     *
     * @return the current value of dateentr
     */
    public String getDateentr() {
        return dateentr;
    }

    /**
     * Setter method for dateentr.
     *
     * @param aDateentr the new value for dateentr
     */
    public void setDateentr(String aDateentr) {
        dateentr = aDateentr;
    }

    /**
     * Access method for scoreFinal.
     *
     * @return the current value of scoreFinal
     */
    public BigDecimal getScoreFinal() {
        return scoreFinal;
    }

    /**
     * Setter method for scoreFinal.
     *
     * @param aScoreFinal the new value for scoreFinal
     */
    public void setScoreFinal(BigDecimal aScoreFinal) {
        scoreFinal = aScoreFinal;
    }

    /**
     * Access method for scoreMinAdmin.
     *
     * @return the current value of scoreMinAdmin
     */
    public BigDecimal getScoreMinAdmin() {
        return scoreMinAdmin;
    }

    /**
     * Setter method for scoreMinAdmin.
     *
     * @param aScoreMinAdmin the new value for scoreMinAdmin
     */
    public void setScoreMinAdmin(BigDecimal aScoreMinAdmin) {
        scoreMinAdmin = aScoreMinAdmin;
    }

    /**
     * Access method for userTransfPreinscrit.
     *
     * @return the current value of userTransfPreinscrit
     */
    public String getUserTransfPreinscrit() {
        return userTransfPreinscrit;
    }

    /**
     * Setter method for userTransfPreinscrit.
     *
     * @param aUserTransfPreinscrit the new value for userTransfPreinscrit
     */
    public void setUserTransfPreinscrit(String aUserTransfPreinscrit) {
        userTransfPreinscrit = aUserTransfPreinscrit;
    }

    /**
     * Access method for dateTransfPreinscrit.
     *
     * @return the current value of dateTransfPreinscrit
     */
    public LocalDateTime getDateTransfPreinscrit() {
        return dateTransfPreinscrit;
    }

    /**
     * Setter method for dateTransfPreinscrit.
     *
     * @param aDateTransfPreinscrit the new value for dateTransfPreinscrit
     */
    public void setDateTransfPreinscrit(LocalDateTime aDateTransfPreinscrit) {
        dateTransfPreinscrit = aDateTransfPreinscrit;
    }

    /**
     * Access method for numLot.
     *
     * @return the current value of numLot
     */
    public BigDecimal getNumLot() {
        return numLot;
    }

    /**
     * Setter method for numLot.
     *
     * @param aNumLot the new value for numLot
     */
    public void setNumLot(BigDecimal aNumLot) {
        numLot = aNumLot;
    }

    /**
     * Access method for recommandation.
     *
     * @return the current value of recommandation
     */
    public String getRecommandation() {
        return recommandation;
    }

    /**
     * Setter method for recommandation.
     *
     * @param aRecommandation the new value for recommandation
     */
    public void setRecommandation(String aRecommandation) {
        recommandation = aRecommandation;
    }

    /**
     * Access method for gouvernorat.
     *
     * @return the current value of gouvernorat
     */
    public String getGouvernorat() {
        return gouvernorat;
    }

    /**
     * Setter method for gouvernorat.
     *
     * @param aGouvernorat the new value for gouvernorat
     */
    public void setGouvernorat(String aGouvernorat) {
        gouvernorat = aGouvernorat;
    }

    /**
     * Access method for adresseMailEsp.
     *
     * @return the current value of adresseMailEsp
     */
    public String getAdresseMailEsp() {
        return adresseMailEsp;
    }

    /**
     * Setter method for adresseMailEsp.
     *
     * @param aAdresseMailEsp the new value for adresseMailEsp
     */
    public void setAdresseMailEsp(String aAdresseMailEsp) {
        adresseMailEsp = aAdresseMailEsp;
    }

    /**
     * Access method for pwdEt.
     *
     * @return the current value of pwdEt
     */
    public String getPwdEt() {
        return pwdEt;
    }

    /**
     * Setter method for pwdEt.
     *
     * @param aPwdEt the new value for pwdEt
     */
    public void setPwdEt(String aPwdEt) {
        pwdEt = aPwdEt;
    }

    /**
     * Access method for pwdEtInit.
     *
     * @return the current value of pwdEtInit
     */
    public String getPwdEtInit() {
        return pwdEtInit;
    }

    /**
     * Setter method for pwdEtInit.
     *
     * @param aPwdEtInit the new value for pwdEtInit
     */
    public void setPwdEtInit(String aPwdEtInit) {
        pwdEtInit = aPwdEtInit;
    }

    /**
     * Access method for suiviParticulier.
     *
     * @return the current value of suiviParticulier
     */
    public String getSuiviParticulier() {
        return suiviParticulier;
    }

    /**
     * Setter method for suiviParticulier.
     *
     * @param aSuiviParticulier the new value for suiviParticulier
     */
    public void setSuiviParticulier(String aSuiviParticulier) {
        suiviParticulier = aSuiviParticulier;
    }

    /**
     * Access method for niveauCourantAng.
     *
     * @return the current value of niveauCourantAng
     */
    public String getNiveauCourantAng() {
        return niveauCourantAng;
    }

    /**
     * Setter method for niveauCourantAng.
     *
     * @param aNiveauCourantAng the new value for niveauCourantAng
     */
    public void setNiveauCourantAng(String aNiveauCourantAng) {
        niveauCourantAng = aNiveauCourantAng;
    }

    /**
     * Access method for niveauCourantFr.
     *
     * @return the current value of niveauCourantFr
     */
    public String getNiveauCourantFr() {
        return niveauCourantFr;
    }

    /**
     * Setter method for niveauCourantFr.
     *
     * @param aNiveauCourantFr the new value for niveauCourantFr
     */
    public void setNiveauCourantFr(String aNiveauCourantFr) {
        niveauCourantFr = aNiveauCourantFr;
    }

    /**
     * Access method for idEleveEduserv.
     *
     * @return the current value of idEleveEduserv
     */
    public String getIdEleveEduserv() {
        return idEleveEduserv;
    }

    /**
     * Setter method for idEleveEduserv.
     *
     * @param aIdEleveEduserv the new value for idEleveEduserv
     */
    public void setIdEleveEduserv(String aIdEleveEduserv) {
        idEleveEduserv = aIdEleveEduserv;
    }

    /**
     * Access method for pwdParent.
     *
     * @return the current value of pwdParent
     */
    public String getPwdParent() {
        return pwdParent;
    }

    /**
     * Setter method for pwdParent.
     *
     * @param aPwdParent the new value for pwdParent
     */
    public void setPwdParent(String aPwdParent) {
        pwdParent = aPwdParent;
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
     * Access method for codeRfid.
     *
     * @return the current value of codeRfid
     */
    public String getCodeRfid() {
        return codeRfid;
    }

    /**
     * Setter method for codeRfid.
     *
     * @param aCodeRfid the new value for codeRfid
     */
    public void setCodeRfid(String aCodeRfid) {
        codeRfid = aCodeRfid;
    }

    /**
     * Access method for choixAB.
     *
     * @return the current value of choixAB
     */
    public String getChoixAB() {
        return choixAB;
    }

    /**
     * Setter method for choixAB.
     *
     * @param aChoixAB the new value for choixAB
     */
    public void setChoixAB(String aChoixAB) {
        choixAB = aChoixAB;
    }

    /**
     * Access method for codeGouvernorat.
     *
     * @return the current value of codeGouvernorat
     */
    public String getCodeGouvernorat() {
        return codeGouvernorat;
    }

    /**
     * Setter method for codeGouvernorat.
     *
     * @param aCodeGouvernorat the new value for codeGouvernorat
     */
    public void setCodeGouvernorat(String aCodeGouvernorat) {
        codeGouvernorat = aCodeGouvernorat;
    }

    /**
     * Access method for espEtudiantSeminaire.
     *
     * @return the current value of espEtudiantSeminaire
     */
 

    /**
   
    /**
     * Access method for classe.
     *
     * @return the current value of classe
     */
    public Classe getClasse() {
        return classe;
    }

    /**
     * Setter method for classe.
     *
     * @param aClasse the new value for classe
     */
    public void setClasse(Classe aClasse) {
        classe = aClasse;
    }

   

    /**
     * Compares the key for this instance with another EspEtudiant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspEtudiant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspEtudiant)) {
            return false;
        }
        EspEtudiant that = (EspEtudiant) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspEtudiant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspEtudiant)) return false;
        return this.equalKeys(other) && ((EspEtudiant)other).equalKeys(this);
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
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EspEtudiant |");
        sb.append(" idEt=").append(getIdEt());
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
        return ret;
    }

}
