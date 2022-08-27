// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="ESP_SESSION")
public class EspSession implements Serializable {

    /** Primary key. */
    protected static final String PK = "idAdmin";

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
    @Column(name="ID_ADMIN", unique=true, nullable=false, precision=10)
    private BigDecimal idAdmin;
    @Column(name="TYPE", nullable=false, precision=10)
    private BigDecimal type;
    @Column(name="PWD", length=255)
    private String pwd;
    @Column(name="LGN", length=255)
    private String lgn;
    @Column(name="ESPENS_ID_ENS", length=255)
    private String espensIdEns;

    /** Default constructor. */
    public EspSession() {
        super();
    }

    /**
     * Access method for idAdmin.
     *
     * @return the current value of idAdmin
     */
    public BigDecimal getIdAdmin() {
        return idAdmin;
    }

    /**
     * Setter method for idAdmin.
     *
     * @param aIdAdmin the new value for idAdmin
     */
    public void setIdAdmin(BigDecimal aIdAdmin) {
        idAdmin = aIdAdmin;
    }

    /**
     * Access method for type.
     *
     * @return the current value of type
     */
    public BigDecimal getType() {
        return type;
    }

    /**
     * Setter method for type.
     *
     * @param aType the new value for type
     */
    public void setType(BigDecimal aType) {
        type = aType;
    }

    /**
     * Access method for pwd.
     *
     * @return the current value of pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Setter method for pwd.
     *
     * @param aPwd the new value for pwd
     */
    public void setPwd(String aPwd) {
        pwd = aPwd;
    }

    /**
     * Access method for lgn.
     *
     * @return the current value of lgn
     */
    public String getLgn() {
        return lgn;
    }

    /**
     * Setter method for lgn.
     *
     * @param aLgn the new value for lgn
     */
    public void setLgn(String aLgn) {
        lgn = aLgn;
    }

    /**
     * Access method for espensIdEns.
     *
     * @return the current value of espensIdEns
     */
    public String getEspensIdEns() {
        return espensIdEns;
    }

    /**
     * Setter method for espensIdEns.
     *
     * @param aEspensIdEns the new value for espensIdEns
     */
    public void setEspensIdEns(String aEspensIdEns) {
        espensIdEns = aEspensIdEns;
    }

    /**
     * Compares the key for this instance with another EspSession.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspSession and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspSession)) {
            return false;
        }
        EspSession that = (EspSession) other;
        Object myIdAdmin = this.getIdAdmin();
        Object yourIdAdmin = that.getIdAdmin();
        if (myIdAdmin==null ? yourIdAdmin!=null : !myIdAdmin.equals(yourIdAdmin)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspSession.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspSession)) return false;
        return this.equalKeys(other) && ((EspSession)other).equalKeys(this);
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
        if (getIdAdmin() == null) {
            i = 0;
        } else {
            i = getIdAdmin().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspSession |");
        sb.append(" idAdmin=").append(getIdAdmin());
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
        ret.put("idAdmin", getIdAdmin());
        return ret;
    }

}
