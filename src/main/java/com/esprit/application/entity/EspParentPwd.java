// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class EspParentPwd implements Serializable {

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
    @Column(name="ID_ET", length=20)
    private String idEt;
    @Column(name="PWD_ET", length=20)
    private String pwdEt;

    /** Default constructor. */
    public EspParentPwd() {
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
     * Access method for pwdEt.
     *
     * @return the current value of pwdEt
     */
    public String getPwdEt() {
        return pwdEt;
    }

    /**
     * Setter method for pwdEt.
     *
     * @param aPwdEt the new value for pwdEt
     */
    public void setPwdEt(String aPwdEt) {
        pwdEt = aPwdEt;
    }

}
