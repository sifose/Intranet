// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Version;

@Embeddable
public class EspDetailResultat implements Serializable {

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

    @Column(name="CODEMATI", length=4)
    private String codemati;
    @Column(name="LIBEMATIFR", length=20)
    private String libematifr;
    @Column(name="COEFMATI", length=3)
    private String coefmati;
    @Column(name="TYPEEP", length=18)
    private String typeep;
    @Column(name="ID_ET", length=10)
    private String idEt;
    @Column(name="RANGMATI", length=2)
    private String rangmati;
    @Column(name="NOM_ENS", length=20)
    private String nomEns;
    @Column(name="PROJECTWORK", length=5)
    private String projectwork;
    @Column(name="ORAL", length=5)
    private String oral;
    @Column(name="MOYENNEORAUX", length=5)
    private String moyenneoraux;
    @Column(name="ACTIVITESDIVERSES", length=5)
    private String activitesdiverses;
    @Column(name="EFFORT", length=5)
    private String effort;
    @Column(name="NOTESUIVI", length=2)
    private String notesuivi;
    @Column(name="TEST", length=5)
    private String test;
    @Column(name="TP1", length=2)
    private String tp1;
    @Column(name="TP2", length=2)
    private String tp2;
    @Column(name="DC1", length=5)
    private String dc1;
    @Column(name="DC2", length=5)
    private String dc2;
    @Column(name="DS", length=5)
    private String ds;
    @Column(name="MOYEMATI", length=7)
    private String moyemati;

    /** Default constructor. */
    public EspDetailResultat() {
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
     * Access method for coefmati.
     *
     * @return the current value of coefmati
     */
    public String getCoefmati() {
        return coefmati;
    }

    /**
     * Setter method for coefmati.
     *
     * @param aCoefmati the new value for coefmati
     */
    public void setCoefmati(String aCoefmati) {
        coefmati = aCoefmati;
    }

    /**
     * Access method for typeep.
     *
     * @return the current value of typeep
     */
    public String getTypeep() {
        return typeep;
    }

    /**
     * Setter method for typeep.
     *
     * @param aTypeep the new value for typeep
     */
    public void setTypeep(String aTypeep) {
        typeep = aTypeep;
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
     * Access method for projectwork.
     *
     * @return the current value of projectwork
     */
    public String getProjectwork() {
        return projectwork;
    }

    /**
     * Setter method for projectwork.
     *
     * @param aProjectwork the new value for projectwork
     */
    public void setProjectwork(String aProjectwork) {
        projectwork = aProjectwork;
    }

    /**
     * Access method for oral.
     *
     * @return the current value of oral
     */
    public String getOral() {
        return oral;
    }

    /**
     * Setter method for oral.
     *
     * @param aOral the new value for oral
     */
    public void setOral(String aOral) {
        oral = aOral;
    }

    /**
     * Access method for moyenneoraux.
     *
     * @return the current value of moyenneoraux
     */
    public String getMoyenneoraux() {
        return moyenneoraux;
    }

    /**
     * Setter method for moyenneoraux.
     *
     * @param aMoyenneoraux the new value for moyenneoraux
     */
    public void setMoyenneoraux(String aMoyenneoraux) {
        moyenneoraux = aMoyenneoraux;
    }

    /**
     * Access method for activitesdiverses.
     *
     * @return the current value of activitesdiverses
     */
    public String getActivitesdiverses() {
        return activitesdiverses;
    }

    /**
     * Setter method for activitesdiverses.
     *
     * @param aActivitesdiverses the new value for activitesdiverses
     */
    public void setActivitesdiverses(String aActivitesdiverses) {
        activitesdiverses = aActivitesdiverses;
    }

    /**
     * Access method for effort.
     *
     * @return the current value of effort
     */
    public String getEffort() {
        return effort;
    }

    /**
     * Setter method for effort.
     *
     * @param aEffort the new value for effort
     */
    public void setEffort(String aEffort) {
        effort = aEffort;
    }

    /**
     * Access method for notesuivi.
     *
     * @return the current value of notesuivi
     */
    public String getNotesuivi() {
        return notesuivi;
    }

    /**
     * Setter method for notesuivi.
     *
     * @param aNotesuivi the new value for notesuivi
     */
    public void setNotesuivi(String aNotesuivi) {
        notesuivi = aNotesuivi;
    }

    /**
     * Access method for test.
     *
     * @return the current value of test
     */
    public String getTest() {
        return test;
    }

    /**
     * Setter method for test.
     *
     * @param aTest the new value for test
     */
    public void setTest(String aTest) {
        test = aTest;
    }

    /**
     * Access method for tp1.
     *
     * @return the current value of tp1
     */
    public String getTp1() {
        return tp1;
    }

    /**
     * Setter method for tp1.
     *
     * @param aTp1 the new value for tp1
     */
    public void setTp1(String aTp1) {
        tp1 = aTp1;
    }

    /**
     * Access method for tp2.
     *
     * @return the current value of tp2
     */
    public String getTp2() {
        return tp2;
    }

    /**
     * Setter method for tp2.
     *
     * @param aTp2 the new value for tp2
     */
    public void setTp2(String aTp2) {
        tp2 = aTp2;
    }

    /**
     * Access method for dc1.
     *
     * @return the current value of dc1
     */
    public String getDc1() {
        return dc1;
    }

    /**
     * Setter method for dc1.
     *
     * @param aDc1 the new value for dc1
     */
    public void setDc1(String aDc1) {
        dc1 = aDc1;
    }

    /**
     * Access method for dc2.
     *
     * @return the current value of dc2
     */
    public String getDc2() {
        return dc2;
    }

    /**
     * Setter method for dc2.
     *
     * @param aDc2 the new value for dc2
     */
    public void setDc2(String aDc2) {
        dc2 = aDc2;
    }

    /**
     * Access method for ds.
     *
     * @return the current value of ds
     */
    public String getDs() {
        return ds;
    }

    /**
     * Setter method for ds.
     *
     * @param aDs the new value for ds
     */
    public void setDs(String aDs) {
        ds = aDs;
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

}
