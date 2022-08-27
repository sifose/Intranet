// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="ESP_ORIENTATION")
@IdClass(EspOrientation.EspOrientationId.class)
public class EspOrientation implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspOrientationId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String idEt;
    }

    /** Primary key. */
    protected static final String PK = "EspOrientationPkEspOrientation";

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
    @Column(name="ANNEE_DEB", nullable=false, length=255)
    private String anneeDeb;
    @Id
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Column(name="CH1", length=50)
    private String ch1;
    @Column(name="CH2", length=50)
    private String ch2;
    @Column(name="CH3", length=50)
    private String ch3;
    @Column(name="CH4", length=50)
    private String ch4;
    @Column(name="SPECIALITE", length=20)
    private String specialite;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="CH5", length=50)
    private String ch5;
    @Column(name="CH6", length=50)
    private String ch6;
    @Column(name="CH7", length=50)
    private String ch7;
    @Column(name="CH8", length=50)
    private String ch8;
    @Column(name="CHFINAL", length=50)
    private String chfinal;

    /** Default constructor. */
    public EspOrientation() {
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
     * Access method for ch1.
     *
     * @return the current value of ch1
     */
    public String getCh1() {
        return ch1;
    }

    /**
     * Setter method for ch1.
     *
     * @param aCh1 the new value for ch1
     */
    public void setCh1(String aCh1) {
        ch1 = aCh1;
    }

    /**
     * Access method for ch2.
     *
     * @return the current value of ch2
     */
    public String getCh2() {
        return ch2;
    }

    /**
     * Setter method for ch2.
     *
     * @param aCh2 the new value for ch2
     */
    public void setCh2(String aCh2) {
        ch2 = aCh2;
    }

    /**
     * Access method for ch3.
     *
     * @return the current value of ch3
     */
    public String getCh3() {
        return ch3;
    }

    /**
     * Setter method for ch3.
     *
     * @param aCh3 the new value for ch3
     */
    public void setCh3(String aCh3) {
        ch3 = aCh3;
    }

    /**
     * Access method for ch4.
     *
     * @return the current value of ch4
     */
    public String getCh4() {
        return ch4;
    }

    /**
     * Setter method for ch4.
     *
     * @param aCh4 the new value for ch4
     */
    public void setCh4(String aCh4) {
        ch4 = aCh4;
    }

    /**
     * Access method for specialite.
     *
     * @return the current value of specialite
     */
    public String getSpecialite() {
        return specialite;
    }

    /**
     * Setter method for specialite.
     *
     * @param aSpecialite the new value for specialite
     */
    public void setSpecialite(String aSpecialite) {
        specialite = aSpecialite;
    }

    /**
     * Access method for codeCl.
     *
     * @return the current value of codeCl
     */
    public String getCodeCl() {
        return codeCl;
    }

    /**
     * Setter method for codeCl.
     *
     * @param aCodeCl the new value for codeCl
     */
    public void setCodeCl(String aCodeCl) {
        codeCl = aCodeCl;
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
     * Access method for ch5.
     *
     * @return the current value of ch5
     */
    public String getCh5() {
        return ch5;
    }

    /**
     * Setter method for ch5.
     *
     * @param aCh5 the new value for ch5
     */
    public void setCh5(String aCh5) {
        ch5 = aCh5;
    }

    /**
     * Access method for ch6.
     *
     * @return the current value of ch6
     */
    public String getCh6() {
        return ch6;
    }

    /**
     * Setter method for ch6.
     *
     * @param aCh6 the new value for ch6
     */
    public void setCh6(String aCh6) {
        ch6 = aCh6;
    }

    /**
     * Access method for ch7.
     *
     * @return the current value of ch7
     */
    public String getCh7() {
        return ch7;
    }

    /**
     * Setter method for ch7.
     *
     * @param aCh7 the new value for ch7
     */
    public void setCh7(String aCh7) {
        ch7 = aCh7;
    }

    /**
     * Access method for ch8.
     *
     * @return the current value of ch8
     */
    public String getCh8() {
        return ch8;
    }

    /**
     * Setter method for ch8.
     *
     * @param aCh8 the new value for ch8
     */
    public void setCh8(String aCh8) {
        ch8 = aCh8;
    }

    /**
     * Access method for chfinal.
     *
     * @return the current value of chfinal
     */
    public String getChfinal() {
        return chfinal;
    }

    /**
     * Setter method for chfinal.
     *
     * @param aChfinal the new value for chfinal
     */
    public void setChfinal(String aChfinal) {
        chfinal = aChfinal;
    }

    /**
     * Compares the key for this instance with another EspOrientation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspOrientation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspOrientation)) {
            return false;
        }
        EspOrientation that = (EspOrientation) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspOrientation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspOrientation)) return false;
        return this.equalKeys(other) && ((EspOrientation)other).equalKeys(this);
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
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
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
        StringBuffer sb = new StringBuffer("[EspOrientation |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
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
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("idEt", getIdEt());
        return ret;
    }

}
