// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class NoteS12018 implements Serializable {

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
    @Column(name="CODEMATI", length=10)
    private String codemati;
    @Column(name="LIBEMATIFR", length=50)
    private String libematifr;
    @Column(name="COEFEPRE", length=20)
    private String coefepre;
    @Column(name="RANGMATI", length=20)
    private String rangmati;
    @Column(name="MOYEMATI", length=20)
    private String moyemati;
    @Column(name="CODEPERIEXAM", length=20)
    private String codeperiexam;
    @Column(name="NUMEEPRE", length=20)
    private String numeepre;
    @Column(name="LIBETYPEEPREFR", length=50)
    private String libetypeeprefr;
    @Column(name="ID_ET", length=10)
    private String idEt;
    @Column(name="IDENELEV", length=20)
    private String idenelev;
    @Column(name="NOTEEPRE", length=20)
    private String noteepre;
    @Column(name="CODETYPEEPRE", length=50)
    private String codetypeepre;

    /** Default constructor. */
    public NoteS12018() {
        super();
    }

    /**
     * Access method for codemati.
     *
     * @return the current value of codemati
     */
    public String getCodemati() {
        return codemati;
    }

    /**
     * Setter method for codemati.
     *
     * @param aCodemati the new value for codemati
     */
    public void setCodemati(String aCodemati) {
        codemati = aCodemati;
    }

    /**
     * Access method for libematifr.
     *
     * @return the current value of libematifr
     */
    public String getLibematifr() {
        return libematifr;
    }

    /**
     * Setter method for libematifr.
     *
     * @param aLibematifr the new value for libematifr
     */
    public void setLibematifr(String aLibematifr) {
        libematifr = aLibematifr;
    }

    /**
     * Access method for coefepre.
     *
     * @return the current value of coefepre
     */
    public String getCoefepre() {
        return coefepre;
    }

    /**
     * Setter method for coefepre.
     *
     * @param aCoefepre the new value for coefepre
     */
    public void setCoefepre(String aCoefepre) {
        coefepre = aCoefepre;
    }

    /**
     * Access method for rangmati.
     *
     * @return the current value of rangmati
     */
    public String getRangmati() {
        return rangmati;
    }

    /**
     * Setter method for rangmati.
     *
     * @param aRangmati the new value for rangmati
     */
    public void setRangmati(String aRangmati) {
        rangmati = aRangmati;
    }

    /**
     * Access method for moyemati.
     *
     * @return the current value of moyemati
     */
    public String getMoyemati() {
        return moyemati;
    }

    /**
     * Setter method for moyemati.
     *
     * @param aMoyemati the new value for moyemati
     */
    public void setMoyemati(String aMoyemati) {
        moyemati = aMoyemati;
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
     * Access method for numeepre.
     *
     * @return the current value of numeepre
     */
    public String getNumeepre() {
        return numeepre;
    }

    /**
     * Setter method for numeepre.
     *
     * @param aNumeepre the new value for numeepre
     */
    public void setNumeepre(String aNumeepre) {
        numeepre = aNumeepre;
    }

    /**
     * Access method for libetypeeprefr.
     *
     * @return the current value of libetypeeprefr
     */
    public String getLibetypeeprefr() {
        return libetypeeprefr;
    }

    /**
     * Setter method for libetypeeprefr.
     *
     * @param aLibetypeeprefr the new value for libetypeeprefr
     */
    public void setLibetypeeprefr(String aLibetypeeprefr) {
        libetypeeprefr = aLibetypeeprefr;
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
     * Access method for noteepre.
     *
     * @return the current value of noteepre
     */
    public String getNoteepre() {
        return noteepre;
    }

    /**
     * Setter method for noteepre.
     *
     * @param aNoteepre the new value for noteepre
     */
    public void setNoteepre(String aNoteepre) {
        noteepre = aNoteepre;
    }

    /**
     * Access method for codetypeepre.
     *
     * @return the current value of codetypeepre
     */
    public String getCodetypeepre() {
        return codetypeepre;
    }

    /**
     * Setter method for codetypeepre.
     *
     * @param aCodetypeepre the new value for codetypeepre
     */
    public void setCodetypeepre(String aCodetypeepre) {
        codetypeepre = aCodetypeepre;
    }

}
