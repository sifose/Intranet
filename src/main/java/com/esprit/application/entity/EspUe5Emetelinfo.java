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
public class EspUe5Emetelinfo implements Serializable {

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

    @Column(name="CODE_UE", length=14)
    private String codeUe;
    @Column(name="LIB_UE", length=100)
    private String libUe;
    @Column(name="NB_ECTS", precision=3)
    private BigDecimal nbEcts;
    @Column(name="CHARGE_H", precision=3)
    private BigDecimal chargeH;
    @Column(name="CODE_FILIERE", length=2)
    private String codeFiliere;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspUe5Emetelinfo() {
        super();
    }

    /**
     * Access method for codeUe.
     *
     * @return the current value of codeUe
     */
    public String getCodeUe() {
        return codeUe;
    }

    /**
     * Setter method for codeUe.
     *
     * @param aCodeUe the new value for codeUe
     */
    public void setCodeUe(String aCodeUe) {
        codeUe = aCodeUe;
    }

    /**
     * Access method for libUe.
     *
     * @return the current value of libUe
     */
    public String getLibUe() {
        return libUe;
    }

    /**
     * Setter method for libUe.
     *
     * @param aLibUe the new value for libUe
     */
    public void setLibUe(String aLibUe) {
        libUe = aLibUe;
    }

    /**
     * Access method for nbEcts.
     *
     * @return the current value of nbEcts
     */
    public BigDecimal getNbEcts() {
        return nbEcts;
    }

    /**
     * Setter method for nbEcts.
     *
     * @param aNbEcts the new value for nbEcts
     */
    public void setNbEcts(BigDecimal aNbEcts) {
        nbEcts = aNbEcts;
    }

    /**
     * Access method for chargeH.
     *
     * @return the current value of chargeH
     */
    public BigDecimal getChargeH() {
        return chargeH;
    }

    /**
     * Setter method for chargeH.
     *
     * @param aChargeH the new value for chargeH
     */
    public void setChargeH(BigDecimal aChargeH) {
        chargeH = aChargeH;
    }

    /**
     * Access method for codeFiliere.
     *
     * @return the current value of codeFiliere
     */
    public String getCodeFiliere() {
        return codeFiliere;
    }

    /**
     * Setter method for codeFiliere.
     *
     * @param aCodeFiliere the new value for codeFiliere
     */
    public void setCodeFiliere(String aCodeFiliere) {
        codeFiliere = aCodeFiliere;
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
