// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="ESP_LOGIN")
public class EspLogin implements Serializable {

    /** Primary key. */
    protected static final String PK = "idlogin";

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
    @Column(name="IDLOGIN", unique=true, nullable=false, length=20)
    private String idlogin;
    @Column(name="PASSWORD", length=20)
    private String password;
    @Column(name="LOGIN", length=20)
    private String login;

    /** Default constructor. */
    public EspLogin() {
        super();
    }

    /**
     * Access method for idlogin.
     *
     * @return the current value of idlogin
     */
    public String getIdlogin() {
        return idlogin;
    }

    /**
     * Setter method for idlogin.
     *
     * @param aIdlogin the new value for idlogin
     */
    public void setIdlogin(String aIdlogin) {
        idlogin = aIdlogin;
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
     * Access method for login.
     *
     * @return the current value of login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Setter method for login.
     *
     * @param aLogin the new value for login
     */
    public void setLogin(String aLogin) {
        login = aLogin;
    }

    /**
     * Compares the key for this instance with another EspLogin.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspLogin and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspLogin)) {
            return false;
        }
        EspLogin that = (EspLogin) other;
        Object myIdlogin = this.getIdlogin();
        Object yourIdlogin = that.getIdlogin();
        if (myIdlogin==null ? yourIdlogin!=null : !myIdlogin.equals(yourIdlogin)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspLogin.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspLogin)) return false;
        return this.equalKeys(other) && ((EspLogin)other).equalKeys(this);
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
        if (getIdlogin() == null) {
            i = 0;
        } else {
            i = getIdlogin().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspLogin |");
        sb.append(" idlogin=").append(getIdlogin());
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
        ret.put("idlogin", getIdlogin());
        return ret;
    }

}
