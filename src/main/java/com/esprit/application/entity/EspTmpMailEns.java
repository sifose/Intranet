// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class EspTmpMailEns implements Serializable {

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
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="MAIL_ENS", length=50)
    private String mailEns;

    /** Default constructor. */
    public EspTmpMailEns() {
        super();
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
     * Access method for mailEns.
     *
     * @return the current value of mailEns
     */
    public String getMailEns() {
        return mailEns;
    }

    /**
     * Setter method for mailEns.
     *
     * @param aMailEns the new value for mailEns
     */
    public void setMailEns(String aMailEns) {
        mailEns = aMailEns;
    }

}
