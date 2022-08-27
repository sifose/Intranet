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
public class EspAdmission implements Serializable {

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

    @Column(name="ANNEE_DEB", length=255)
    private String anneeDeb;
    @Column(name="NUM_LOT", precision=10)
    private BigDecimal numLot;
    @Id
    @Column(name="ID", nullable=false, precision=10)
    private BigDecimal id;
    @Column(name="ID_ET", length=255)
    private String idEt;
    @Column(name="NOM_ET", length=255)
    private String nomEt;
    @Column(name="PNOM_ET", length=255)
    private String pnomEt;
    @Column(name="DATE_NAIS_ET", length=255)
    private String dateNaisEt;
    @Column(name="CYCLE_ET", precision=15)
    private BigDecimal cycleEt;
    @Column(name="NATURE_BAC", precision=15)
    private BigDecimal natureBac;
    @Column(name="DATE_BAC", length=255)
    private String dateBac;
    @Column(name="ETAB_BAC", length=255)
    private String etabBac;
    @Column(name="NIVEAU_DIPLOME_SUP_ET", precision=15)
    private BigDecimal niveauDiplomeSupEt;
    @Column(name="ETAB_ORIGINE", length=255)
    private String etabOrigine;
    @Column(name="SPECIALITE_ESP_ET", precision=15)
    private BigDecimal specialiteEspEt;
    @Column(name="NIVEAU_ACCES", precision=15)
    private BigDecimal niveauAcces;
    @Column(name="CODE_SPEC_ORIGINE", length=255)
    private String codeSpecOrigine;
    @Column(name="LIB_SPEC_ORIGINE", length=255)
    private String libSpecOrigine;
    @Column(name="MOY_BAC_ET", precision=15)
    private BigDecimal moyBacEt;
    @Column(name="ANNEE_BAC", precision=15)
    private BigDecimal anneeBac;
    @Column(name="ID_ET2", length=10)
    private String idEt2;
    @Column(name="ENTRETIEN", precision=15)
    private BigDecimal entretien;
    @Column(name="ANGLAIS", precision=15)
    private BigDecimal anglais;
    @Column(name="FRANCAIS", precision=15)
    private BigDecimal francais;
    @Column(name="QI", precision=15)
    private BigDecimal qi;
    @Column(name="COLONNE1", precision=15)
    private BigDecimal colonne1;
    @Column(name="SCOREAGEBAC", precision=15)
    private BigDecimal scoreagebac;
    @Column(name="SCOREMOYBAC", precision=15)
    private BigDecimal scoremoybac;
    @Column(name="COLONNE2", precision=15)
    private BigDecimal colonne2;
    @Column(name="SCOREBAC", precision=15)
    private BigDecimal scorebac;
    @Column(name="FR_SCORE", precision=15, scale=6)
    private BigDecimal frScore;
    @Column(name="ANG_SCORE", precision=15, scale=6)
    private BigDecimal angScore;
    @Column(name="QI_SCORE", precision=15, scale=6)
    private BigDecimal qiScore;
    @Column(name="SCOREEXAM", precision=15, scale=6)
    private BigDecimal scoreexam;
    @Column(name="SCOREENTRETIEN", precision=15, scale=6)
    private BigDecimal scoreentretien;
    @Column(name="SCOREFINALENTRETIEN", precision=15, scale=6)
    private BigDecimal scorefinalentretien;
    @Column(name="CHAMP33", length=255)
    private String champ33;
    @Column(name="SCORE_FINAL", precision=10, scale=6)
    private BigDecimal scoreFinal;

    /** Default constructor. */
    public EspAdmission() {
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
    public String getDateNaisEt() {
        return dateNaisEt;
    }

    /**
     * Setter method for dateNaisEt.
     *
     * @param aDateNaisEt the new value for dateNaisEt
     */
    public void setDateNaisEt(String aDateNaisEt) {
        dateNaisEt = aDateNaisEt;
    }

    /**
     * Access method for cycleEt.
     *
     * @return the current value of cycleEt
     */
    public BigDecimal getCycleEt() {
        return cycleEt;
    }

    /**
     * Setter method for cycleEt.
     *
     * @param aCycleEt the new value for cycleEt
     */
    public void setCycleEt(BigDecimal aCycleEt) {
        cycleEt = aCycleEt;
    }

    /**
     * Access method for natureBac.
     *
     * @return the current value of natureBac
     */
    public BigDecimal getNatureBac() {
        return natureBac;
    }

    /**
     * Setter method for natureBac.
     *
     * @param aNatureBac the new value for natureBac
     */
    public void setNatureBac(BigDecimal aNatureBac) {
        natureBac = aNatureBac;
    }

    /**
     * Access method for dateBac.
     *
     * @return the current value of dateBac
     */
    public String getDateBac() {
        return dateBac;
    }

    /**
     * Setter method for dateBac.
     *
     * @param aDateBac the new value for dateBac
     */
    public void setDateBac(String aDateBac) {
        dateBac = aDateBac;
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
    public BigDecimal getSpecialiteEspEt() {
        return specialiteEspEt;
    }

    /**
     * Setter method for specialiteEspEt.
     *
     * @param aSpecialiteEspEt the new value for specialiteEspEt
     */
    public void setSpecialiteEspEt(BigDecimal aSpecialiteEspEt) {
        specialiteEspEt = aSpecialiteEspEt;
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
     * Access method for moyBacEt.
     *
     * @return the current value of moyBacEt
     */
    public BigDecimal getMoyBacEt() {
        return moyBacEt;
    }

    /**
     * Setter method for moyBacEt.
     *
     * @param aMoyBacEt the new value for moyBacEt
     */
    public void setMoyBacEt(BigDecimal aMoyBacEt) {
        moyBacEt = aMoyBacEt;
    }

    /**
     * Access method for anneeBac.
     *
     * @return the current value of anneeBac
     */
    public BigDecimal getAnneeBac() {
        return anneeBac;
    }

    /**
     * Setter method for anneeBac.
     *
     * @param aAnneeBac the new value for anneeBac
     */
    public void setAnneeBac(BigDecimal aAnneeBac) {
        anneeBac = aAnneeBac;
    }

    /**
     * Access method for idEt2.
     *
     * @return the current value of idEt2
     */
    public String getIdEt2() {
        return idEt2;
    }

    /**
     * Setter method for idEt2.
     *
     * @param aIdEt2 the new value for idEt2
     */
    public void setIdEt2(String aIdEt2) {
        idEt2 = aIdEt2;
    }

    /**
     * Access method for entretien.
     *
     * @return the current value of entretien
     */
    public BigDecimal getEntretien() {
        return entretien;
    }

    /**
     * Setter method for entretien.
     *
     * @param aEntretien the new value for entretien
     */
    public void setEntretien(BigDecimal aEntretien) {
        entretien = aEntretien;
    }

    /**
     * Access method for anglais.
     *
     * @return the current value of anglais
     */
    public BigDecimal getAnglais() {
        return anglais;
    }

    /**
     * Setter method for anglais.
     *
     * @param aAnglais the new value for anglais
     */
    public void setAnglais(BigDecimal aAnglais) {
        anglais = aAnglais;
    }

    /**
     * Access method for francais.
     *
     * @return the current value of francais
     */
    public BigDecimal getFrancais() {
        return francais;
    }

    /**
     * Setter method for francais.
     *
     * @param aFrancais the new value for francais
     */
    public void setFrancais(BigDecimal aFrancais) {
        francais = aFrancais;
    }

    /**
     * Access method for qi.
     *
     * @return the current value of qi
     */
    public BigDecimal getQi() {
        return qi;
    }

    /**
     * Setter method for qi.
     *
     * @param aQi the new value for qi
     */
    public void setQi(BigDecimal aQi) {
        qi = aQi;
    }

    /**
     * Access method for colonne1.
     *
     * @return the current value of colonne1
     */
    public BigDecimal getColonne1() {
        return colonne1;
    }

    /**
     * Setter method for colonne1.
     *
     * @param aColonne1 the new value for colonne1
     */
    public void setColonne1(BigDecimal aColonne1) {
        colonne1 = aColonne1;
    }

    /**
     * Access method for scoreagebac.
     *
     * @return the current value of scoreagebac
     */
    public BigDecimal getScoreagebac() {
        return scoreagebac;
    }

    /**
     * Setter method for scoreagebac.
     *
     * @param aScoreagebac the new value for scoreagebac
     */
    public void setScoreagebac(BigDecimal aScoreagebac) {
        scoreagebac = aScoreagebac;
    }

    /**
     * Access method for scoremoybac.
     *
     * @return the current value of scoremoybac
     */
    public BigDecimal getScoremoybac() {
        return scoremoybac;
    }

    /**
     * Setter method for scoremoybac.
     *
     * @param aScoremoybac the new value for scoremoybac
     */
    public void setScoremoybac(BigDecimal aScoremoybac) {
        scoremoybac = aScoremoybac;
    }

    /**
     * Access method for colonne2.
     *
     * @return the current value of colonne2
     */
    public BigDecimal getColonne2() {
        return colonne2;
    }

    /**
     * Setter method for colonne2.
     *
     * @param aColonne2 the new value for colonne2
     */
    public void setColonne2(BigDecimal aColonne2) {
        colonne2 = aColonne2;
    }

    /**
     * Access method for scorebac.
     *
     * @return the current value of scorebac
     */
    public BigDecimal getScorebac() {
        return scorebac;
    }

    /**
     * Setter method for scorebac.
     *
     * @param aScorebac the new value for scorebac
     */
    public void setScorebac(BigDecimal aScorebac) {
        scorebac = aScorebac;
    }

    /**
     * Access method for frScore.
     *
     * @return the current value of frScore
     */
    public BigDecimal getFrScore() {
        return frScore;
    }

    /**
     * Setter method for frScore.
     *
     * @param aFrScore the new value for frScore
     */
    public void setFrScore(BigDecimal aFrScore) {
        frScore = aFrScore;
    }

    /**
     * Access method for angScore.
     *
     * @return the current value of angScore
     */
    public BigDecimal getAngScore() {
        return angScore;
    }

    /**
     * Setter method for angScore.
     *
     * @param aAngScore the new value for angScore
     */
    public void setAngScore(BigDecimal aAngScore) {
        angScore = aAngScore;
    }

    /**
     * Access method for qiScore.
     *
     * @return the current value of qiScore
     */
    public BigDecimal getQiScore() {
        return qiScore;
    }

    /**
     * Setter method for qiScore.
     *
     * @param aQiScore the new value for qiScore
     */
    public void setQiScore(BigDecimal aQiScore) {
        qiScore = aQiScore;
    }

    /**
     * Access method for scoreexam.
     *
     * @return the current value of scoreexam
     */
    public BigDecimal getScoreexam() {
        return scoreexam;
    }

    /**
     * Setter method for scoreexam.
     *
     * @param aScoreexam the new value for scoreexam
     */
    public void setScoreexam(BigDecimal aScoreexam) {
        scoreexam = aScoreexam;
    }

    /**
     * Access method for scoreentretien.
     *
     * @return the current value of scoreentretien
     */
    public BigDecimal getScoreentretien() {
        return scoreentretien;
    }

    /**
     * Setter method for scoreentretien.
     *
     * @param aScoreentretien the new value for scoreentretien
     */
    public void setScoreentretien(BigDecimal aScoreentretien) {
        scoreentretien = aScoreentretien;
    }

    /**
     * Access method for scorefinalentretien.
     *
     * @return the current value of scorefinalentretien
     */
    public BigDecimal getScorefinalentretien() {
        return scorefinalentretien;
    }

    /**
     * Setter method for scorefinalentretien.
     *
     * @param aScorefinalentretien the new value for scorefinalentretien
     */
    public void setScorefinalentretien(BigDecimal aScorefinalentretien) {
        scorefinalentretien = aScorefinalentretien;
    }

    /**
     * Access method for champ33.
     *
     * @return the current value of champ33
     */
    public String getChamp33() {
        return champ33;
    }

    /**
     * Setter method for champ33.
     *
     * @param aChamp33 the new value for champ33
     */
    public void setChamp33(String aChamp33) {
        champ33 = aChamp33;
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

}
