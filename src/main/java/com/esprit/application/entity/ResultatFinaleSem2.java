// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="RESULTAT_FINALE_SEM2")
@IdClass(ResultatFinaleSem2.ResultatFinaleSem2Id.class)
public class ResultatFinaleSem2 implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class ResultatFinaleSem2Id implements Serializable {
        java.lang.String idenelev;
        java.lang.String codeperiexam;
    }

    /** Primary key. */
    protected static final String PK = "ResultatFinaleSem2ResultatFinaleSem2Pk";

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
    @Column(name="IDENELEV", nullable=false, length=10)
    private String idenelev;
    @Id
    @Column(name="CODEPERIEXAM", nullable=false, length=5)
    private String codeperiexam;
    @Column(name="MOYEPERIEXAM", length=10)
    private String moyeperiexam;
    @Column(name="RANGPERIEXAM", length=5)
    private String rangperiexam;
    @Column(name="CODEDECICONS", length=5)
    private String codedecicons;
    @Column(name="CODESECTORIE", length=5)
    private String codesectorie;
    @Column(name="OBSECONS", length=5)
    private String obsecons;
    @Column(name="CODEPRIX", length=5)
    private String codeprix;
    @Column(name="MOYEEXAMNATI", length=5)
    private String moyeexamnati;
    @Column(name="CODEMENTEXAM", length=5)
    private String codementexam;
    @Column(name="CODEETAB", length=10)
    private String codeetab;
    @Column(name="CODECONDASSI", length=5)
    private String codecondassi;

    /** Default constructor. */
    public ResultatFinaleSem2() {
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

    /**
     * Compares the key for this instance with another ResultatFinaleSem2.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ResultatFinaleSem2 and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ResultatFinaleSem2)) {
            return false;
        }
        ResultatFinaleSem2 that = (ResultatFinaleSem2) other;
        Object myIdenelev = this.getIdenelev();
        Object yourIdenelev = that.getIdenelev();
        if (myIdenelev==null ? yourIdenelev!=null : !myIdenelev.equals(yourIdenelev)) {
            return false;
        }
        Object myCodeperiexam = this.getCodeperiexam();
        Object yourCodeperiexam = that.getCodeperiexam();
        if (myCodeperiexam==null ? yourCodeperiexam!=null : !myCodeperiexam.equals(yourCodeperiexam)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ResultatFinaleSem2.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ResultatFinaleSem2)) return false;
        return this.equalKeys(other) && ((ResultatFinaleSem2)other).equalKeys(this);
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
        if (getIdenelev() == null) {
            i = 0;
        } else {
            i = getIdenelev().hashCode();
        }
        result = 37*result + i;
        if (getCodeperiexam() == null) {
            i = 0;
        } else {
            i = getCodeperiexam().hashCode();
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
        StringBuffer sb = new StringBuffer("[ResultatFinaleSem2 |");
        sb.append(" idenelev=").append(getIdenelev());
        sb.append(" codeperiexam=").append(getCodeperiexam());
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
        ret.put("idenelev", getIdenelev());
        ret.put("codeperiexam", getCodeperiexam());
        return ret;
    }

}
