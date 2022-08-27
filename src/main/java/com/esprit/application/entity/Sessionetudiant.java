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

@Entity(name="SESSIONETUDIANT")
public class Sessionetudiant implements Serializable {

    /** Primary key. */
    protected static final String PK = "idsessionet";

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
    @Column(name="IDSESSIONET", unique=true, nullable=false, precision=10)
    private BigDecimal idsessionet;
    @Column(name="PASSWORD", length=255)
    private String password;
    @Column(name="MATRICULE", length=255)
    private String matricule;
    @Column(name="EMAIL", length=255)
    private String email;

    /** Default constructor. */
    public Sessionetudiant() {
        super();
    }

    /**
     * Access method for idsessionet.
     *
     * @return the current value of idsessionet
     */
    public BigDecimal getIdsessionet() {
        return idsessionet;
    }

    /**
     * Setter method for idsessionet.
     *
     * @param aIdsessionet the new value for idsessionet
     */
    public void setIdsessionet(BigDecimal aIdsessionet) {
        idsessionet = aIdsessionet;
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
     * Access method for matricule.
     *
     * @return the current value of matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * Setter method for matricule.
     *
     * @param aMatricule the new value for matricule
     */
    public void setMatricule(String aMatricule) {
        matricule = aMatricule;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Compares the key for this instance with another Sessionetudiant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Sessionetudiant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Sessionetudiant)) {
            return false;
        }
        Sessionetudiant that = (Sessionetudiant) other;
        Object myIdsessionet = this.getIdsessionet();
        Object yourIdsessionet = that.getIdsessionet();
        if (myIdsessionet==null ? yourIdsessionet!=null : !myIdsessionet.equals(yourIdsessionet)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Sessionetudiant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Sessionetudiant)) return false;
        return this.equalKeys(other) && ((Sessionetudiant)other).equalKeys(this);
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
        if (getIdsessionet() == null) {
            i = 0;
        } else {
            i = getIdsessionet().hashCode();
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
        StringBuffer sb = new StringBuffer("[Sessionetudiant |");
        sb.append(" idsessionet=").append(getIdsessionet());
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
        ret.put("idsessionet", getIdsessionet());
        return ret;
    }

}
