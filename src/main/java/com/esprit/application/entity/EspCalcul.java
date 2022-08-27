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
public class EspCalcul implements Serializable {

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
    @Column(name="SCORE_ENTRETIEN", precision=10, scale=6)
    private BigDecimal scoreEntretien;
    @Column(name="SCORE_DOSSIER", precision=10, scale=6)
    private BigDecimal scoreDossier;
    @Column(name="SCORE_TEST", precision=10, scale=6)
    private BigDecimal scoreTest;
    @Column(name="SCORE_FINAL", precision=10, scale=6)
    private BigDecimal scoreFinal;
    @Column(name="SCORE_FRANCAIS", precision=10, scale=6)
    private BigDecimal scoreFrancais;
    @Column(name="SCORE_ANGLAIS", precision=10, scale=6)
    private BigDecimal scoreAnglais;
    @Column(name="SCORE_QI", precision=10, scale=6)
    private BigDecimal scoreQi;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspCalcul() {
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
     * Access method for scoreEntretien.
     *
     * @return the current value of scoreEntretien
     */
    public BigDecimal getScoreEntretien() {
        return scoreEntretien;
    }

    /**
     * Setter method for scoreEntretien.
     *
     * @param aScoreEntretien the new value for scoreEntretien
     */
    public void setScoreEntretien(BigDecimal aScoreEntretien) {
        scoreEntretien = aScoreEntretien;
    }

    /**
     * Access method for scoreDossier.
     *
     * @return the current value of scoreDossier
     */
    public BigDecimal getScoreDossier() {
        return scoreDossier;
    }

    /**
     * Setter method for scoreDossier.
     *
     * @param aScoreDossier the new value for scoreDossier
     */
    public void setScoreDossier(BigDecimal aScoreDossier) {
        scoreDossier = aScoreDossier;
    }

    /**
     * Access method for scoreTest.
     *
     * @return the current value of scoreTest
     */
    public BigDecimal getScoreTest() {
        return scoreTest;
    }

    /**
     * Setter method for scoreTest.
     *
     * @param aScoreTest the new value for scoreTest
     */
    public void setScoreTest(BigDecimal aScoreTest) {
        scoreTest = aScoreTest;
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
     * Access method for scoreFrancais.
     *
     * @return the current value of scoreFrancais
     */
    public BigDecimal getScoreFrancais() {
        return scoreFrancais;
    }

    /**
     * Setter method for scoreFrancais.
     *
     * @param aScoreFrancais the new value for scoreFrancais
     */
    public void setScoreFrancais(BigDecimal aScoreFrancais) {
        scoreFrancais = aScoreFrancais;
    }

    /**
     * Access method for scoreAnglais.
     *
     * @return the current value of scoreAnglais
     */
    public BigDecimal getScoreAnglais() {
        return scoreAnglais;
    }

    /**
     * Setter method for scoreAnglais.
     *
     * @param aScoreAnglais the new value for scoreAnglais
     */
    public void setScoreAnglais(BigDecimal aScoreAnglais) {
        scoreAnglais = aScoreAnglais;
    }

    /**
     * Access method for scoreQi.
     *
     * @return the current value of scoreQi
     */
    public BigDecimal getScoreQi() {
        return scoreQi;
    }

    /**
     * Setter method for scoreQi.
     *
     * @param aScoreQi the new value for scoreQi
     */
    public void setScoreQi(BigDecimal aScoreQi) {
        scoreQi = aScoreQi;
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
