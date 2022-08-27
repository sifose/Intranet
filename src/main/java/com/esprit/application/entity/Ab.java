// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Ab implements Serializable {

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

    @Column(name="PWD_P", length=26)
    private String pwdP;
    @Id
    @Column(name="ID_ET", length=26)
    private String idEt;
    @Column(name="NOM", length=35)
    private String nom;
    @Column(name="PNOM", length=35)
    private String pnom;
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public Ab() {
        super();
    }

    /**
     * Access method for pwdP.
     *
     * @return the current value of pwdP
     */
    public String getPwdP() {
        return pwdP;
    }

    /**
     * Setter method for pwdP.
     *
     * @param aPwdP the new value for pwdP
     */
    public void setPwdP(String aPwdP) {
        pwdP = aPwdP;
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
     * Access method for nom.
     *
     * @return the current value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter method for nom.
     *
     * @param aNom the new value for nom
     */
    public void setNom(String aNom) {
        nom = aNom;
    }

    /**
     * Access method for pnom.
     *
     * @return the current value of pnom
     */
    public String getPnom() {
        return pnom;
    }

    /**
     * Setter method for pnom.
     *
     * @param aPnom the new value for pnom
     */
    public void setPnom(String aPnom) {
        pnom = aPnom;
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(BigDecimal aId) {
        id = aId;
    }

}
