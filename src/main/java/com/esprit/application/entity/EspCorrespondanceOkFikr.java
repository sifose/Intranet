// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class EspCorrespondanceOkFikr implements Serializable {

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
    @Column(name="CODE_CLIENT", length=15)
    private String codeClient;
    @Column(name="COMPTE_CLIENT", length=20)
    private String compteClient;

    /** Default constructor. */
    public EspCorrespondanceOkFikr() {
        super();
    }

    /**
     * Access method for codeClient.
     *
     * @return the current value of codeClient
     */
    public String getCodeClient() {
        return codeClient;
    }

    /**
     * Setter method for codeClient.
     *
     * @param aCodeClient the new value for codeClient
     */
    public void setCodeClient(String aCodeClient) {
        codeClient = aCodeClient;
    }

    /**
     * Access method for compteClient.
     *
     * @return the current value of compteClient
     */
    public String getCompteClient() {
        return compteClient;
    }

    /**
     * Setter method for compteClient.
     *
     * @param aCompteClient the new value for compteClient
     */
    public void setCompteClient(String aCompteClient) {
        compteClient = aCompteClient;
    }

}
