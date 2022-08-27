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

@Entity(name="ETAT_PAIEMENT")
@IdClass(EtatPaiement.EtatPaiementId.class)
public class EtatPaiement implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EtatPaiementId implements Serializable {
        java.lang.String idEt;
        java.lang.String anneeDeb;
        java.lang.String ordernumber;
    }

    /** Primary key. */
    protected static final String PK = "EtatPaiementEtatPaiementPk";

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
    @Column(name="ID_ET", nullable=false, length=20)
    private String idEt;
    @Column(name="EXPIRATION", length=20)
    private String expiration;
    @Column(name="CARDHOLDERNAME", length=20)
    private String cardholdername;
    @Column(name="DEPOSITAMOUNT", length=20)
    private String depositamount;
    @Column(name="CURRENCY", length=20)
    private String currency;
    @Column(name="AUTHCODE", length=20)
    private String authcode;
    @Column(name="ERRORCODE", length=20)
    private String errorcode;
    @Column(name="ERRORMESSAGE", nullable=false, length=2000)
    private String errormessage;
    @Column(name="ORDERSTATUS", length=20)
    private String orderstatus;
    @Id
    @Column(name="ORDERNUMBER", nullable=false, length=20)
    private String ordernumber;
    @Column(name="PAN", length=20)
    private String pan;
    @Column(name="AMOUNT", length=20)
    private String amount;
    @Column(name="IP", length=20)
    private String ip;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=20)
    private String anneeDeb;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;

    /** Default constructor. */
    public EtatPaiement() {
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
     * Access method for expiration.
     *
     * @return the current value of expiration
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * Setter method for expiration.
     *
     * @param aExpiration the new value for expiration
     */
    public void setExpiration(String aExpiration) {
        expiration = aExpiration;
    }

    /**
     * Access method for cardholdername.
     *
     * @return the current value of cardholdername
     */
    public String getCardholdername() {
        return cardholdername;
    }

    /**
     * Setter method for cardholdername.
     *
     * @param aCardholdername the new value for cardholdername
     */
    public void setCardholdername(String aCardholdername) {
        cardholdername = aCardholdername;
    }

    /**
     * Access method for depositamount.
     *
     * @return the current value of depositamount
     */
    public String getDepositamount() {
        return depositamount;
    }

    /**
     * Setter method for depositamount.
     *
     * @param aDepositamount the new value for depositamount
     */
    public void setDepositamount(String aDepositamount) {
        depositamount = aDepositamount;
    }

    /**
     * Access method for currency.
     *
     * @return the current value of currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter method for currency.
     *
     * @param aCurrency the new value for currency
     */
    public void setCurrency(String aCurrency) {
        currency = aCurrency;
    }

    /**
     * Access method for authcode.
     *
     * @return the current value of authcode
     */
    public String getAuthcode() {
        return authcode;
    }

    /**
     * Setter method for authcode.
     *
     * @param aAuthcode the new value for authcode
     */
    public void setAuthcode(String aAuthcode) {
        authcode = aAuthcode;
    }

    /**
     * Access method for errorcode.
     *
     * @return the current value of errorcode
     */
    public String getErrorcode() {
        return errorcode;
    }

    /**
     * Setter method for errorcode.
     *
     * @param aErrorcode the new value for errorcode
     */
    public void setErrorcode(String aErrorcode) {
        errorcode = aErrorcode;
    }

    /**
     * Access method for errormessage.
     *
     * @return the current value of errormessage
     */
    public String getErrormessage() {
        return errormessage;
    }

    /**
     * Setter method for errormessage.
     *
     * @param aErrormessage the new value for errormessage
     */
    public void setErrormessage(String aErrormessage) {
        errormessage = aErrormessage;
    }

    /**
     * Access method for orderstatus.
     *
     * @return the current value of orderstatus
     */
    public String getOrderstatus() {
        return orderstatus;
    }

    /**
     * Setter method for orderstatus.
     *
     * @param aOrderstatus the new value for orderstatus
     */
    public void setOrderstatus(String aOrderstatus) {
        orderstatus = aOrderstatus;
    }

    /**
     * Access method for ordernumber.
     *
     * @return the current value of ordernumber
     */
    public String getOrdernumber() {
        return ordernumber;
    }

    /**
     * Setter method for ordernumber.
     *
     * @param aOrdernumber the new value for ordernumber
     */
    public void setOrdernumber(String aOrdernumber) {
        ordernumber = aOrdernumber;
    }

    /**
     * Access method for pan.
     *
     * @return the current value of pan
     */
    public String getPan() {
        return pan;
    }

    /**
     * Setter method for pan.
     *
     * @param aPan the new value for pan
     */
    public void setPan(String aPan) {
        pan = aPan;
    }

    /**
     * Access method for amount.
     *
     * @return the current value of amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Setter method for amount.
     *
     * @param aAmount the new value for amount
     */
    public void setAmount(String aAmount) {
        amount = aAmount;
    }

    /**
     * Access method for ip.
     *
     * @return the current value of ip
     */
    public String getIp() {
        return ip;
    }

    /**
     * Setter method for ip.
     *
     * @param aIp the new value for ip
     */
    public void setIp(String aIp) {
        ip = aIp;
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
     * Compares the key for this instance with another EtatPaiement.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EtatPaiement and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EtatPaiement)) {
            return false;
        }
        EtatPaiement that = (EtatPaiement) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myOrdernumber = this.getOrdernumber();
        Object yourOrdernumber = that.getOrdernumber();
        if (myOrdernumber==null ? yourOrdernumber!=null : !myOrdernumber.equals(yourOrdernumber)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EtatPaiement.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EtatPaiement)) return false;
        return this.equalKeys(other) && ((EtatPaiement)other).equalKeys(this);
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
        if (getIdEt() == null) {
            i = 0;
        } else {
            i = getIdEt().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getOrdernumber() == null) {
            i = 0;
        } else {
            i = getOrdernumber().hashCode();
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
        StringBuffer sb = new StringBuffer("[EtatPaiement |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" ordernumber=").append(getOrdernumber());
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
        ret.put("idEt", getIdEt());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("ordernumber", getOrdernumber());
        return ret;
    }

}
