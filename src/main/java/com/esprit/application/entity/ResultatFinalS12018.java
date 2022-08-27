// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class ResultatFinalS12018 implements Serializable {

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
    @Column(name="IDENELEV", length=10)
    private String idenelev;
    @Column(name="CODEPERIEXAM", length=10)
    private String codeperiexam;
    @Column(name="MOYEPERIEXAM", length=10)
    private String moyeperiexam;
    @Column(name="RANGPERIEXAM", length=10)
    private String rangperiexam;
    @Column(name="CODEDECICONS", length=10)
    private String codedecicons;
    @Column(name="CODESECTORIE", length=10)
    private String codesectorie;
    @Column(name="OBSECONS", length=10)
    private String obsecons;
    @Column(name="CODEPRIX", length=10)
    private String codeprix;
    @Column(name="MOYEEXAMNATI", length=10)
    private String moyeexamnati;
    @Column(name="CODEMENTEXAM", length=10)
    private String codementexam;
    @Column(name="CODEETAB", length=10)
    private String codeetab;
    @Column(name="CODECONDASSI", length=10)
    private String codecondassi;

    /** Default constructor. */
    public ResultatFinalS12018() {
        super();
    }

    /**
     * Access method for idenelev.
     *
     * @return the current value of idenelev
     */
    public String getIdenelev() {
        return idenelev;
    }

    /**
     * Setter method for idenelev.
     *
     * @param aIdenelev the new value for idenelev
     */
    public void setIdenelev(String aIdenelev) {
        idenelev = aIdenelev;
    }

    /**
     * Access method for codeperiexam.
     *
     * @return the current value of codeperiexam
     */
    public String getCodeperiexam() {
        return codeperiexam;
    }

    /**
     * Setter method for codeperiexam.
     *
     * @param aCodeperiexam the new value for codeperiexam
     */
    public void setCodeperiexam(String aCodeperiexam) {
        codeperiexam = aCodeperiexam;
    }

    /**
     * Access method for moyeperiexam.
     *
     * @return the current value of moyeperiexam
     */
    public String getMoyeperiexam() {
        return moyeperiexam;
    }

    /**
     * Setter method for moyeperiexam.
     *
     * @param aMoyeperiexam the new value for moyeperiexam
     */
    public void setMoyeperiexam(String aMoyeperiexam) {
        moyeperiexam = aMoyeperiexam;
    }

    /**
     * Access method for rangperiexam.
     *
     * @return the current value of rangperiexam
     */
    public String getRangperiexam() {
        return rangperiexam;
    }

    /**
     * Setter method for rangperiexam.
     *
     * @param aRangperiexam the new value for rangperiexam
     */
    public void setRangperiexam(String aRangperiexam) {
        rangperiexam = aRangperiexam;
    }

    /**
     * Access method for codedecicons.
     *
     * @return the current value of codedecicons
     */
    public String getCodedecicons() {
        return codedecicons;
    }

    /**
     * Setter method for codedecicons.
     *
     * @param aCodedecicons the new value for codedecicons
     */
    public void setCodedecicons(String aCodedecicons) {
        codedecicons = aCodedecicons;
    }

    /**
     * Access method for codesectorie.
     *
     * @return the current value of codesectorie
     */
    public String getCodesectorie() {
        return codesectorie;
    }

    /**
     * Setter method for codesectorie.
     *
     * @param aCodesectorie the new value for codesectorie
     */
    public void setCodesectorie(String aCodesectorie) {
        codesectorie = aCodesectorie;
    }

    /**
     * Access method for obsecons.
     *
     * @return the current value of obsecons
     */
    public String getObsecons() {
        return obsecons;
    }

    /**
     * Setter method for obsecons.
     *
     * @param aObsecons the new value for obsecons
     */
    public void setObsecons(String aObsecons) {
        obsecons = aObsecons;
    }

    /**
     * Access method for codeprix.
     *
     * @return the current value of codeprix
     */
    public String getCodeprix() {
        return codeprix;
    }

    /**
     * Setter method for codeprix.
     *
     * @param aCodeprix the new value for codeprix
     */
    public void setCodeprix(String aCodeprix) {
        codeprix = aCodeprix;
    }

    /**
     * Access method for moyeexamnati.
     *
     * @return the current value of moyeexamnati
     */
    public String getMoyeexamnati() {
        return moyeexamnati;
    }

    /**
     * Setter method for moyeexamnati.
     *
     * @param aMoyeexamnati the new value for moyeexamnati
     */
    public void setMoyeexamnati(String aMoyeexamnati) {
        moyeexamnati = aMoyeexamnati;
    }

    /**
     * Access method for codementexam.
     *
     * @return the current value of codementexam
     */
    public String getCodementexam() {
        return codementexam;
    }

    /**
     * Setter method for codementexam.
     *
     * @param aCodementexam the new value for codementexam
     */
    public void setCodementexam(String aCodementexam) {
        codementexam = aCodementexam;
    }

    /**
     * Access method for codeetab.
     *
     * @return the current value of codeetab
     */
    public String getCodeetab() {
        return codeetab;
    }

    /**
     * Setter method for codeetab.
     *
     * @param aCodeetab the new value for codeetab
     */
    public void setCodeetab(String aCodeetab) {
        codeetab = aCodeetab;
    }

    /**
     * Access method for codecondassi.
     *
     * @return the current value of codecondassi
     */
    public String getCodecondassi() {
        return codecondassi;
    }

    /**
     * Setter method for codecondassi.
     *
     * @param aCodecondassi the new value for codecondassi
     */
    public void setCodecondassi(String aCodecondassi) {
        codecondassi = aCodecondassi;
    }

}
