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
import javax.persistence.Version;

@Entity(name="HISTORIQUE_PAIEMENT")
public class HistoriquePaiement implements Serializable {

    /** Primary key. */
    protected static final String PK = "ordernumber";

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

    @Column(name="ID_ET", length=12)
    private String idEt;
    @Column(name="USERNAME", length=100)
    private String username;
    @Column(name="AMOUNT", length=100)
    private String amount;
    @Column(name="ANNEE_DEB", length=4)
    private String anneeDeb;
    @Id
    @Column(name="ORDERNUMBER", unique=true, nullable=false, precision=25)
    private BigDecimal ordernumber;
    @Column(name="RETURNURL", length=500)
    private String returnurl;
    @Column(name="CURRENCY", length=100)
    private String currency;
    @Column(name="PASSWORD", length=100)
    private String password;
    @Column(name="ETAT", length=1)
    private String etat;
    @Column(name="DATE_PAIEMENT")
    private LocalDateTime datePaiement;
    @Column(name="ORDERID", length=200)
    private String orderid;

    /** Default constructor. */
    public HistoriquePaiement() {
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
     * Access method for username.
     *
     * @return the current value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter method for username.
     *
     * @param aUsername the new value for username
     */
    public void setUsername(String aUsername) {
        username = aUsername;
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
     * Access method for ordernumber.
     *
     * @return the current value of ordernumber
     */
    public BigDecimal getOrdernumber() {
        return ordernumber;
    }

    /**
     * Setter method for ordernumber.
     *
     * @param aOrdernumber the new value for ordernumber
     */
    public void setOrdernumber(BigDecimal aOrdernumber) {
        ordernumber = aOrdernumber;
    }

    /**
     * Access method for returnurl.
     *
     * @return the current value of returnurl
     */
    public String getReturnurl() {
        return returnurl;
    }

    /**
     * Setter method for returnurl.
     *
     * @param aReturnurl the new value for returnurl
     */
    public void setReturnurl(String aReturnurl) {
        returnurl = aReturnurl;
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
     * Access method for password.
     *
     * @return the current value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for password.
     *
     * @param aPassword the new value for password
     */
    public void setPassword(String aPassword) {
        password = aPassword;
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
     * Access method for datePaiement.
     *
     * @return the current value of datePaiement
     */
    public LocalDateTime getDatePaiement() {
        return datePaiement;
    }

    /**
     * Setter method for datePaiement.
     *
     * @param aDatePaiement the new value for datePaiement
     */
    public void setDatePaiement(LocalDateTime aDatePaiement) {
        datePaiement = aDatePaiement;
    }

    /**
     * Access method for orderid.
     *
     * @return the current value of orderid
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * Setter method for orderid.
     *
     * @param aOrderid the new value for orderid
     */
    public void setOrderid(String aOrderid) {
        orderid = aOrderid;
    }

    /**
     * Compares the key for this instance with another HistoriquePaiement.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class HistoriquePaiement and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof HistoriquePaiement)) {
            return false;
        }
        HistoriquePaiement that = (HistoriquePaiement) other;
        Object myOrdernumber = this.getOrdernumber();
        Object yourOrdernumber = that.getOrdernumber();
        if (myOrdernumber==null ? yourOrdernumber!=null : !myOrdernumber.equals(yourOrdernumber)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another HistoriquePaiement.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof HistoriquePaiement)) return false;
        return this.equalKeys(other) && ((HistoriquePaiement)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[HistoriquePaiement |");
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
        ret.put("ordernumber", getOrdernumber());
        return ret;
    }

}
