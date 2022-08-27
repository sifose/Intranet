// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="DECID")
public class Decid implements Serializable {

    /** Primary key. */
    protected static final String PK = "idDecid";

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
    @Column(name="ID_DECID", unique=true, nullable=false, length=100)
    private String idDecid;
    @Column(name="NOM_DECID", length=100)
    private String nomDecid;
    @Column(name="TITRE_DECID", length=100)
    private String titreDecid;
    @Column(name="ETAT_DECID", length=100)
    private String etatDecid;
    @Column(name="PWD_DECID", nullable=false, length=100)
    private String pwdDecid;

    /** Default constructor. */
    public Decid() {
        super();
    }

    /**
     * Access method for idDecid.
     *
     * @return the current value of idDecid
     */
    public String getIdDecid() {
        return idDecid;
    }

    /**
     * Setter method for idDecid.
     *
     * @param aIdDecid the new value for idDecid
     */
    public void setIdDecid(String aIdDecid) {
        idDecid = aIdDecid;
    }

    /**
     * Access method for nomDecid.
     *
     * @return the current value of nomDecid
     */
    public String getNomDecid() {
        return nomDecid;
    }

    /**
     * Setter method for nomDecid.
     *
     * @param aNomDecid the new value for nomDecid
     */
    public void setNomDecid(String aNomDecid) {
        nomDecid = aNomDecid;
    }

    /**
     * Access method for titreDecid.
     *
     * @return the current value of titreDecid
     */
    public String getTitreDecid() {
        return titreDecid;
    }

    /**
     * Setter method for titreDecid.
     *
     * @param aTitreDecid the new value for titreDecid
     */
    public void setTitreDecid(String aTitreDecid) {
        titreDecid = aTitreDecid;
    }

    /**
     * Access method for etatDecid.
     *
     * @return the current value of etatDecid
     */
    public String getEtatDecid() {
        return etatDecid;
    }

    /**
     * Setter method for etatDecid.
     *
     * @param aEtatDecid the new value for etatDecid
     */
    public void setEtatDecid(String aEtatDecid) {
        etatDecid = aEtatDecid;
    }

    /**
     * Access method for pwdDecid.
     *
     * @return the current value of pwdDecid
     */
    public String getPwdDecid() {
        return pwdDecid;
    }

    /**
     * Setter method for pwdDecid.
     *
     * @param aPwdDecid the new value for pwdDecid
     */
    public void setPwdDecid(String aPwdDecid) {
        pwdDecid = aPwdDecid;
    }

    /**
     * Compares the key for this instance with another Decid.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Decid and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Decid)) {
            return false;
        }
        Decid that = (Decid) other;
        Object myIdDecid = this.getIdDecid();
        Object yourIdDecid = that.getIdDecid();
        if (myIdDecid==null ? yourIdDecid!=null : !myIdDecid.equals(yourIdDecid)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Decid.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Decid)) return false;
        return this.equalKeys(other) && ((Decid)other).equalKeys(this);
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
        if (getIdDecid() == null) {
            i = 0;
        } else {
            i = getIdDecid().hashCode();
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
        StringBuffer sb = new StringBuffer("[Decid |");
        sb.append(" idDecid=").append(getIdDecid());
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
        ret.put("idDecid", getIdDecid());
        return ret;
    }

}
