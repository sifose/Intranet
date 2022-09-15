// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Blob;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="ESP_ENSEIGNANT")
public class EspEnseignant implements Serializable {

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
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="NOM_ENS", length=30)
    private String nomEns;
    @Column(name="TYPE_ENS", length=1)
    private String typeEns;
    @Column(name="DATE_REC")
    private LocalDateTime dateRec;
    @Column(name="NIVEAU", length=2)
    private String niveau;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="DATE_DERN_MODIF")
    private LocalDateTime dateDernModif;
    @Column(name="ETAT", length=1)
    private String etat;
    @Column(name="OBSERVATION", length=300)
    private String observation;
    @Column(name="PWD_ENS", length=10)
    private String pwdEns;
    @Column(name="PRENOM_ENS", length=30)
    private String prenomEns;
    @Column(name="CIN", precision=8)
    private BigDecimal cin;
    @Column(name="SEXE_ENS", length=1)
    private String sexeEns;
    @Column(name="ETAT_CIVIL_ENS", length=5)
    private String etatCivilEns;
    @Column(name="TEL1", length=10)
    private String tel1;
    @Column(name="TEL2", length=10)
    private String tel2;
    @Column(name="CNSS_ENS", length=20)
    private String cnssEns;
    @Column(name="DN_ENS")
    private LocalDateTime dnEns;
    @Column(name="DE_ENS")
    private LocalDateTime deEns;
    @Column(name="DS_ENS")
    private LocalDateTime dsEns;
    @Column(name="CHEFCOMITE", precision=10)
    private BigDecimal chefcomite;
    @Column(name="COMITE_ID_GRP", precision=10)
    private BigDecimal comiteIdGrp;
    @Column(name="FK_CMT", precision=10)
    private BigDecimal fkCmt;
    @Column(name="TYPE_UP", length=1)
    private String typeUp;
    @Column(name="UP", length=20)
    private String up;
    @Column(name="DATE_DEB_UP")
    private LocalDateTime dateDebUp;
    @Column(name="MAIL_ENS", length=50)
    private String mailEns;
    @Column(name="CODE_GRADE_ENTREE", length=2)
    private String codeGradeEntree;
    @Column(name="LIB_GRADE_ENTREE", length=300)
    private String libGradeEntree;
    @Column(name="CODE_GRADE_ACTUEL", length=2)
    private String codeGradeActuel;
    @Column(name="LIB_GRADE_ACTUELLE", length=300)
    private String libGradeActuelle;
    @Column(name="ORGANISME", length=1)
    private String organisme;
    @Column(name="PWD_INIT", length=10)
    private String pwdInit;
    @Column(name="CODE_DEPT", length=2)
    private String codeDept;
    @Column(name="CHEF_DEPT", length=1)
    private String chefDept;
    @Column(name="CODE_ENS_EDUSERV", length=10)
    private String codeEnsEduserv;
    @Column(name="NOM", length=30)
    private String nom;
    @Column(name="PNOM", length=30)
    private String pnom;
    @Column(name="DIPLOME", length=20)
    private String diplome;
    @Column(name="IMAGE", length=4000)
    private Blob image;

    /** Default constructor. */
    public EspEnseignant() {
        super();
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

    /**
     * Access method for nomEns.
     *
     * @return the current value of nomEns
     */
    public String getNomEns() {
        return nomEns;
    }

    /**
     * Setter method for nomEns.
     *
     * @param aNomEns the new value for nomEns
     */
    public void setNomEns(String aNomEns) {
        nomEns = aNomEns;
    }

    /**
     * Access method for typeEns.
     *
     * @return the current value of typeEns
     */
    public String getTypeEns() {
        return typeEns;
    }

    /**
     * Setter method for typeEns.
     *
     * @param aTypeEns the new value for typeEns
     */
    public void setTypeEns(String aTypeEns) {
        typeEns = aTypeEns;
    }

    /**
     * Access method for dateRec.
     *
     * @return the current value of dateRec
     */
    public LocalDateTime getDateRec() {
        return dateRec;
    }

    /**
     * Setter method for dateRec.
     *
     * @param aDateRec the new value for dateRec
     */
    public void setDateRec(LocalDateTime aDateRec) {
        dateRec = aDateRec;
    }

    /**
     * Access method for niveau.
     *
     * @return the current value of niveau
     */
    public String getNiveau() {
        return niveau;
    }

    /**
     * Setter method for niveau.
     *
     * @param aNiveau the new value for niveau
     */
    public void setNiveau(String aNiveau) {
        niveau = aNiveau;
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
     * Access method for pwdEns.
     *
     * @return the current value of pwdEns
     */
    public String getPwdEns() {
        return pwdEns;
    }

    /**
     * Setter method for pwdEns.
     *
     * @param aPwdEns the new value for pwdEns
     */
    public void setPwdEns(String aPwdEns) {
        pwdEns = aPwdEns;
    }

    /**
     * Access method for prenomEns.
     *
     * @return the current value of prenomEns
     */
    public String getPrenomEns() {
        return prenomEns;
    }

    /**
     * Setter method for prenomEns.
     *
     * @param aPrenomEns the new value for prenomEns
     */
    public void setPrenomEns(String aPrenomEns) {
        prenomEns = aPrenomEns;
    }

    /**
     * Access method for cin.
     *
     * @return the current value of cin
     */
    public BigDecimal getCin() {
        return cin;
    }

    /**
     * Setter method for cin.
     *
     * @param aCin the new value for cin
     */
    public void setCin(BigDecimal aCin) {
        cin = aCin;
    }

    /**
     * Access method for sexeEns.
     *
     * @return the current value of sexeEns
     */
    public String getSexeEns() {
        return sexeEns;
    }

    /**
     * Setter method for sexeEns.
     *
     * @param aSexeEns the new value for sexeEns
     */
    public void setSexeEns(String aSexeEns) {
        sexeEns = aSexeEns;
    }

    /**
     * Access method for etatCivilEns.
     *
     * @return the current value of etatCivilEns
     */
    public String getEtatCivilEns() {
        return etatCivilEns;
    }

    /**
     * Setter method for etatCivilEns.
     *
     * @param aEtatCivilEns the new value for etatCivilEns
     */
    public void setEtatCivilEns(String aEtatCivilEns) {
        etatCivilEns = aEtatCivilEns;
    }

    /**
     * Access method for tel1.
     *
     * @return the current value of tel1
     */
    public String getTel1() {
        return tel1;
    }

    /**
     * Setter method for tel1.
     *
     * @param aTel1 the new value for tel1
     */
    public void setTel1(String aTel1) {
        tel1 = aTel1;
    }

    /**
     * Access method for tel2.
     *
     * @return the current value of tel2
     */
    public String getTel2() {
        return tel2;
    }

    /**
     * Setter method for tel2.
     *
     * @param aTel2 the new value for tel2
     */
    public void setTel2(String aTel2) {
        tel2 = aTel2;
    }

    /**
     * Access method for cnssEns.
     *
     * @return the current value of cnssEns
     */
    public String getCnssEns() {
        return cnssEns;
    }

    /**
     * Setter method for cnssEns.
     *
     * @param aCnssEns the new value for cnssEns
     */
    public void setCnssEns(String aCnssEns) {
        cnssEns = aCnssEns;
    }

    /**
     * Access method for dnEns.
     *
     * @return the current value of dnEns
     */
    public LocalDateTime getDnEns() {
        return dnEns;
    }

    /**
     * Setter method for dnEns.
     *
     * @param aDnEns the new value for dnEns
     */
    public void setDnEns(LocalDateTime aDnEns) {
        dnEns = aDnEns;
    }

    /**
     * Access method for deEns.
     *
     * @return the current value of deEns
     */
    public LocalDateTime getDeEns() {
        return deEns;
    }

    /**
     * Setter method for deEns.
     *
     * @param aDeEns the new value for deEns
     */
    public void setDeEns(LocalDateTime aDeEns) {
        deEns = aDeEns;
    }

    /**
     * Access method for dsEns.
     *
     * @return the current value of dsEns
     */
    public LocalDateTime getDsEns() {
        return dsEns;
    }

    /**
     * Setter method for dsEns.
     *
     * @param aDsEns the new value for dsEns
     */
    public void setDsEns(LocalDateTime aDsEns) {
        dsEns = aDsEns;
    }

    /**
     * Access method for chefcomite.
     *
     * @return the current value of chefcomite
     */
    public BigDecimal getChefcomite() {
        return chefcomite;
    }

    /**
     * Setter method for chefcomite.
     *
     * @param aChefcomite the new value for chefcomite
     */
    public void setChefcomite(BigDecimal aChefcomite) {
        chefcomite = aChefcomite;
    }

    /**
     * Access method for comiteIdGrp.
     *
     * @return the current value of comiteIdGrp
     */
    public BigDecimal getComiteIdGrp() {
        return comiteIdGrp;
    }

    /**
     * Setter method for comiteIdGrp.
     *
     * @param aComiteIdGrp the new value for comiteIdGrp
     */
    public void setComiteIdGrp(BigDecimal aComiteIdGrp) {
        comiteIdGrp = aComiteIdGrp;
    }

    /**
     * Access method for fkCmt.
     *
     * @return the current value of fkCmt
     */
    public BigDecimal getFkCmt() {
        return fkCmt;
    }

    /**
     * Setter method for fkCmt.
     *
     * @param aFkCmt the new value for fkCmt
     */
    public void setFkCmt(BigDecimal aFkCmt) {
        fkCmt = aFkCmt;
    }

    /**
     * Access method for typeUp.
     *
     * @return the current value of typeUp
     */
    public String getTypeUp() {
        return typeUp;
    }

    /**
     * Setter method for typeUp.
     *
     * @param aTypeUp the new value for typeUp
     */
    public void setTypeUp(String aTypeUp) {
        typeUp = aTypeUp;
    }

    /**
     * Access method for up.
     *
     * @return the current value of up
     */
    public String getUp() {
        return up;
    }

    /**
     * Setter method for up.
     *
     * @param aUp the new value for up
     */
    public void setUp(String aUp) {
        up = aUp;
    }

    /**
     * Access method for dateDebUp.
     *
     * @return the current value of dateDebUp
     */
    public LocalDateTime getDateDebUp() {
        return dateDebUp;
    }

    /**
     * Setter method for dateDebUp.
     *
     * @param aDateDebUp the new value for dateDebUp
     */
    public void setDateDebUp(LocalDateTime aDateDebUp) {
        dateDebUp = aDateDebUp;
    }

    /**
     * Access method for mailEns.
     *
     * @return the current value of mailEns
     */
    public String getMailEns() {
        return mailEns;
    }

    /**
     * Setter method for mailEns.
     *
     * @param aMailEns the new value for mailEns
     */
    public void setMailEns(String aMailEns) {
        mailEns = aMailEns;
    }

    /**
     * Access method for codeGradeEntree.
     *
     * @return the current value of codeGradeEntree
     */
    public String getCodeGradeEntree() {
        return codeGradeEntree;
    }

    /**
     * Setter method for codeGradeEntree.
     *
     * @param aCodeGradeEntree the new value for codeGradeEntree
     */
    public void setCodeGradeEntree(String aCodeGradeEntree) {
        codeGradeEntree = aCodeGradeEntree;
    }

    /**
     * Access method for libGradeEntree.
     *
     * @return the current value of libGradeEntree
     */
    public String getLibGradeEntree() {
        return libGradeEntree;
    }

    /**
     * Setter method for libGradeEntree.
     *
     * @param aLibGradeEntree the new value for libGradeEntree
     */
    public void setLibGradeEntree(String aLibGradeEntree) {
        libGradeEntree = aLibGradeEntree;
    }

    /**
     * Access method for codeGradeActuel.
     *
     * @return the current value of codeGradeActuel
     */
    public String getCodeGradeActuel() {
        return codeGradeActuel;
    }

    /**
     * Setter method for codeGradeActuel.
     *
     * @param aCodeGradeActuel the new value for codeGradeActuel
     */
    public void setCodeGradeActuel(String aCodeGradeActuel) {
        codeGradeActuel = aCodeGradeActuel;
    }

    /**
     * Access method for libGradeActuelle.
     *
     * @return the current value of libGradeActuelle
     */
    public String getLibGradeActuelle() {
        return libGradeActuelle;
    }

    /**
     * Setter method for libGradeActuelle.
     *
     * @param aLibGradeActuelle the new value for libGradeActuelle
     */
    public void setLibGradeActuelle(String aLibGradeActuelle) {
        libGradeActuelle = aLibGradeActuelle;
    }

    /**
     * Access method for organisme.
     *
     * @return the current value of organisme
     */
    public String getOrganisme() {
        return organisme;
    }

    /**
     * Setter method for organisme.
     *
     * @param aOrganisme the new value for organisme
     */
    public void setOrganisme(String aOrganisme) {
        organisme = aOrganisme;
    }

    /**
     * Access method for pwdInit.
     *
     * @return the current value of pwdInit
     */
    public String getPwdInit() {
        return pwdInit;
    }

    /**
     * Setter method for pwdInit.
     *
     * @param aPwdInit the new value for pwdInit
     */
    public void setPwdInit(String aPwdInit) {
        pwdInit = aPwdInit;
    }

    /**
     * Access method for codeDept.
     *
     * @return the current value of codeDept
     */
    public String getCodeDept() {
        return codeDept;
    }

    /**
     * Setter method for codeDept.
     *
     * @param aCodeDept the new value for codeDept
     */
    public void setCodeDept(String aCodeDept) {
        codeDept = aCodeDept;
    }

    /**
     * Access method for chefDept.
     *
     * @return the current value of chefDept
     */
    public String getChefDept() {
        return chefDept;
    }

    /**
     * Setter method for chefDept.
     *
     * @param aChefDept the new value for chefDept
     */
    public void setChefDept(String aChefDept) {
        chefDept = aChefDept;
    }

    /**
     * Access method for codeEnsEduserv.
     *
     * @return the current value of codeEnsEduserv
     */
    public String getCodeEnsEduserv() {
        return codeEnsEduserv;
    }

    /**
     * Setter method for codeEnsEduserv.
     *
     * @param aCodeEnsEduserv the new value for codeEnsEduserv
     */
    public void setCodeEnsEduserv(String aCodeEnsEduserv) {
        codeEnsEduserv = aCodeEnsEduserv;
    }

    /**
     * Access method for nom.
     *
     * @return the current value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter method for nom.
     *
     * @param aNom the new value for nom
     */
    public void setNom(String aNom) {
        nom = aNom;
    }

    /**
     * Access method for pnom.
     *
     * @return the current value of pnom
     */
    public String getPnom() {
        return pnom;
    }

    /**
     * Setter method for pnom.
     *
     * @param aPnom the new value for pnom
     */
    public void setPnom(String aPnom) {
        pnom = aPnom;
    }

    /**
     * Access method for diplome.
     *
     * @return the current value of diplome
     */
    public String getDiplome() {
        return diplome;
    }

    /**
     * Setter method for diplome.
     *
     * @param aDiplome the new value for diplome
     */
    public void setDiplome(String aDiplome) {
        diplome = aDiplome;
    }

    /**
     * Access method for image.
     *
     * @return the current value of image
     */
    public Blob getImage() {
        return image;
    }

    /**
     * Setter method for image.
     *
     * @param aImage the new value for image
     */
    public void setImage(Blob aImage) {
        image = aImage;
    }

}
