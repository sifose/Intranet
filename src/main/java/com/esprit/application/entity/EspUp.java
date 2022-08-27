// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ESP_UP")
public class EspUp implements Serializable {

    /** Primary key. */
    protected static final String PK = "up";

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
    @Column(name="UP", unique=true, nullable=false, length=20)
    private String up;
    @Column(name="DESIGNANTION", length=50)
    private String designantion;
    @Column(name="CODE_DEPT", length=10)
    private String codeDept;
    @OneToMany(mappedBy="espUp")
    private Set<EspModule> espModule;

    /** Default constructor. */
    public EspUp() {
        super();
    }

    /**
     * Access method for up.
     *
     * @return the current value of up
     */
    public String getUp() {
        return up;
    }

    /**
     * Setter method for up.
     *
     * @param aUp the new value for up
     */
    public void setUp(String aUp) {
        up = aUp;
    }

    /**
     * Access method for designantion.
     *
     * @return the current value of designantion
     */
    public String getDesignantion() {
        return designantion;
    }

    /**
     * Setter method for designantion.
     *
     * @param aDesignantion the new value for designantion
     */
    public void setDesignantion(String aDesignantion) {
        designantion = aDesignantion;
    }

    /**
     * Access method for codeDept.
     *
     * @return the current value of codeDept
     */
    public String getCodeDept() {
        return codeDept;
    }

    /**
     * Setter method for codeDept.
     *
     * @param aCodeDept the new value for codeDept
     */
    public void setCodeDept(String aCodeDept) {
        codeDept = aCodeDept;
    }

    /**
     * Access method for espModule.
     *
     * @return the current value of espModule
     */
    public Set<EspModule> getEspModule() {
        return espModule;
    }

    /**
     * Setter method for espModule.
     *
     * @param aEspModule the new value for espModule
     */
    public void setEspModule(Set<EspModule> aEspModule) {
        espModule = aEspModule;
    }

    /**
     * Compares the key for this instance with another EspUp.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspUp and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspUp)) {
            return false;
        }
        EspUp that = (EspUp) other;
        Object myUp = this.getUp();
        Object yourUp = that.getUp();
        if (myUp==null ? yourUp!=null : !myUp.equals(yourUp)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspUp.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspUp)) return false;
        return this.equalKeys(other) && ((EspUp)other).equalKeys(this);
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
        if (getUp() == null) {
            i = 0;
        } else {
            i = getUp().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspUp |");
        sb.append(" up=").append(getUp());
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
        ret.put("up", getUp());
        return ret;
    }

}
