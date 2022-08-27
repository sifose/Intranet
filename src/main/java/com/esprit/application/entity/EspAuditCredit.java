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
import javax.persistence.Version;

@Entity(name="ESP_AUDIT_CREDIT")
@IdClass(EspAuditCredit.EspAuditCreditId.class)
public class EspAuditCredit implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspAuditCreditId implements Serializable {
        java.lang.String anneeDeb;
        java.time.LocalDateTime dateOp;
    }

    /** Primary key. */
    protected static final String PK = "EspAuditCreditPkEspAuditCredit";

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
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="OLD_VAL_CREDIT", precision=10, scale=3)
    private BigDecimal oldValCredit;
    @Column(name="NEW_VAL_CREDIT", precision=10, scale=3)
    private BigDecimal newValCredit;
    @Column(name="ADRESSE_IP", length=20)
    private String adresseIp;
    @Column(name="MACHINE", length=40)
    private String machine;
    @Id
    @Column(name="DATE_OP", nullable=false)
    private LocalDateTime dateOp;

    /** Default constructor. */
    public EspAuditCredit() {
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
     * Access method for oldValCredit.
     *
     * @return the current value of oldValCredit
     */
    public BigDecimal getOldValCredit() {
        return oldValCredit;
    }

    /**
     * Setter method for oldValCredit.
     *
     * @param aOldValCredit the new value for oldValCredit
     */
    public void setOldValCredit(BigDecimal aOldValCredit) {
        oldValCredit = aOldValCredit;
    }

    /**
     * Access method for newValCredit.
     *
     * @return the current value of newValCredit
     */
    public BigDecimal getNewValCredit() {
        return newValCredit;
    }

    /**
     * Setter method for newValCredit.
     *
     * @param aNewValCredit the new value for newValCredit
     */
    public void setNewValCredit(BigDecimal aNewValCredit) {
        newValCredit = aNewValCredit;
    }

    /**
     * Access method for adresseIp.
     *
     * @return the current value of adresseIp
     */
    public String getAdresseIp() {
        return adresseIp;
    }

    /**
     * Setter method for adresseIp.
     *
     * @param aAdresseIp the new value for adresseIp
     */
    public void setAdresseIp(String aAdresseIp) {
        adresseIp = aAdresseIp;
    }

    /**
     * Access method for machine.
     *
     * @return the current value of machine
     */
    public String getMachine() {
        return machine;
    }

    /**
     * Setter method for machine.
     *
     * @param aMachine the new value for machine
     */
    public void setMachine(String aMachine) {
        machine = aMachine;
    }

    /**
     * Access method for dateOp.
     *
     * @return the current value of dateOp
     */
    public LocalDateTime getDateOp() {
        return dateOp;
    }

    /**
     * Setter method for dateOp.
     *
     * @param aDateOp the new value for dateOp
     */
    public void setDateOp(LocalDateTime aDateOp) {
        dateOp = aDateOp;
    }

    /**
     * Compares the key for this instance with another EspAuditCredit.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspAuditCredit and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspAuditCredit)) {
            return false;
        }
        EspAuditCredit that = (EspAuditCredit) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myDateOp = this.getDateOp();
        Object yourDateOp = that.getDateOp();
        if (myDateOp==null ? yourDateOp!=null : !myDateOp.equals(yourDateOp)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspAuditCredit.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspAuditCredit)) return false;
        return this.equalKeys(other) && ((EspAuditCredit)other).equalKeys(this);
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
        if (getDateOp() == null) {
            i = 0;
        } else {
            i = getDateOp().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspAuditCredit |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" dateOp=").append(getDateOp());
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
        ret.put("dateOp", getDateOp());
        return ret;
    }

}
