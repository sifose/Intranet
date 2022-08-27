// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class AaPwdEns implements Serializable {

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

    @Column(name="NOM", length=20)
    private String nom;
    @Column(name="PNOM", length=20)
    private String pnom;
    @Id
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="AA", length=15)
    private String aa;

    /** Default constructor. */
    public AaPwdEns() {
        super();
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
     * Access method for aa.
     *
     * @return the current value of aa
     */
    public String getAa() {
        return aa;
    }

    /**
     * Setter method for aa.
     *
     * @param aAa the new value for aa
     */
    public void setAa(String aAa) {
        aa = aAa;
    }

}
