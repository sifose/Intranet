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

@Entity(name="ESP_AFFECTATION_EMPLOI")
@IdClass(EspAffectationEmploi.EspAffectationEmploiId.class)
public class EspAffectationEmploi implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspAffectationEmploiId implements Serializable {
        java.math.BigDecimal codeEmploi;
        java.lang.String anneeDeb;
    }

    /** Primary key. */
    protected static final String PK = "EspAffectationEmploiEspAffectationEmploiPk";

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
    @Column(name="CODE_EMPLOI", nullable=false, precision=25)
    private BigDecimal codeEmploi;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;
    @Column(name="SALLE_PRINCIPALE", length=10)
    private String sallePrincipale;
    @Column(name="JOURS")
    private LocalDateTime jours;
    @Column(name="CREN_1")
    private BigDecimal cren1;
    @Column(name="CREN_2")
    private BigDecimal cren2;
    @Column(name="ETAT", length=1)
    private String etat;
    @Column(name="ID_ENS2", length=10)
    private String idEns2;
    @Column(name="ID_ENS3", length=10)
    private String idEns3;
    @Column(name="ID_ENS4", length=10)
    private String idEns4;
    @ManyToOne(optional=false)
    @JoinColumn(name="CODE_MODULE", nullable=false)
    private EspModule espModule;

    /** Default constructor. */
    public EspAffectationEmploi() {
        super();
    }

    /**
     * Access method for codeEmploi.
     *
     * @return the current value of codeEmploi
     */
    public BigDecimal getCodeEmploi() {
        return codeEmploi;
    }

    /**
     * Setter method for codeEmploi.
     *
     * @param aCodeEmploi the new value for codeEmploi
     */
    public void setCodeEmploi(BigDecimal aCodeEmploi) {
        codeEmploi = aCodeEmploi;
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
     * Access method for sallePrincipale.
     *
     * @return the current value of sallePrincipale
     */
    public String getSallePrincipale() {
        return sallePrincipale;
    }

    /**
     * Setter method for sallePrincipale.
     *
     * @param aSallePrincipale the new value for sallePrincipale
     */
    public void setSallePrincipale(String aSallePrincipale) {
        sallePrincipale = aSallePrincipale;
    }

    /**
     * Access method for jours.
     *
     * @return the current value of jours
     */
    public LocalDateTime getJours() {
        return jours;
    }

    /**
     * Setter method for jours.
     *
     * @param aJours the new value for jours
     */
    public void setJours(LocalDateTime aJours) {
        jours = aJours;
    }

    /**
     * Access method for cren1.
     *
     * @return the current value of cren1
     */
    public BigDecimal getCren1() {
        return cren1;
    }

    /**
     * Setter method for cren1.
     *
     * @param aCren1 the new value for cren1
     */
    public void setCren1(BigDecimal aCren1) {
        cren1 = aCren1;
    }

    /**
     * Access method for cren2.
     *
     * @return the current value of cren2
     */
    public BigDecimal getCren2() {
        return cren2;
    }

    /**
     * Setter method for cren2.
     *
     * @param aCren2 the new value for cren2
     */
    public void setCren2(BigDecimal aCren2) {
        cren2 = aCren2;
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
     * Access method for idEns2.
     *
     * @return the current value of idEns2
     */
    public String getIdEns2() {
        return idEns2;
    }

    /**
     * Setter method for idEns2.
     *
     * @param aIdEns2 the new value for idEns2
     */
    public void setIdEns2(String aIdEns2) {
        idEns2 = aIdEns2;
    }

    /**
     * Access method for idEns3.
     *
     * @return the current value of idEns3
     */
    public String getIdEns3() {
        return idEns3;
    }

    /**
     * Setter method for idEns3.
     *
     * @param aIdEns3 the new value for idEns3
     */
    public void setIdEns3(String aIdEns3) {
        idEns3 = aIdEns3;
    }

    /**
     * Access method for idEns4.
     *
     * @return the current value of idEns4
     */
    public String getIdEns4() {
        return idEns4;
    }

    /**
     * Setter method for idEns4.
     *
     * @param aIdEns4 the new value for idEns4
     */
    public void setIdEns4(String aIdEns4) {
        idEns4 = aIdEns4;
    }

    /**
     * Access method for espModule.
     *
     * @return the current value of espModule
     */
    public EspModule getEspModule() {
        return espModule;
    }

    /**
     * Setter method for espModule.
     *
     * @param aEspModule the new value for espModule
     */
    public void setEspModule(EspModule aEspModule) {
        espModule = aEspModule;
    }

    /**
     * Compares the key for this instance with another EspAffectationEmploi.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspAffectationEmploi and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspAffectationEmploi)) {
            return false;
        }
        EspAffectationEmploi that = (EspAffectationEmploi) other;
        Object myCodeEmploi = this.getCodeEmploi();
        Object yourCodeEmploi = that.getCodeEmploi();
        if (myCodeEmploi==null ? yourCodeEmploi!=null : !myCodeEmploi.equals(yourCodeEmploi)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspAffectationEmploi.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspAffectationEmploi)) return false;
        return this.equalKeys(other) && ((EspAffectationEmploi)other).equalKeys(this);
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
        if (getCodeEmploi() == null) {
            i = 0;
        } else {
            i = getCodeEmploi().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspAffectationEmploi |");
        sb.append(" codeEmploi=").append(getCodeEmploi());
        sb.append(" anneeDeb=").append(getAnneeDeb());
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
        ret.put("codeEmploi", getCodeEmploi());
        ret.put("anneeDeb", getAnneeDeb());
        return ret;
    }

}
