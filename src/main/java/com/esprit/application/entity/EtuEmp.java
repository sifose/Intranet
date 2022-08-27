// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity
public class EtuEmp implements Serializable {

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

    @Column(name="CODEMPLOI", nullable=false, precision=19)
    private BigDecimal codemploi;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;
    @ManyToOne(optional=false)
    @JoinColumn(name="IDET", nullable=false)
    private EspEtudiant espEtudiant;

    /** Default constructor. */
    public EtuEmp() {
        super();
    }

    /**
     * Access method for codemploi.
     *
     * @return the current value of codemploi
     */
    public BigDecimal getCodemploi() {
        return codemploi;
    }

    /**
     * Setter method for codemploi.
     *
     * @param aCodemploi the new value for codemploi
     */
    public void setCodemploi(BigDecimal aCodemploi) {
        codemploi = aCodemploi;
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

    /**
     * Access method for espEtudiant.
     *
     * @return the current value of espEtudiant
     */
    public EspEtudiant getEspEtudiant() {
        return espEtudiant;
    }

    /**
     * Setter method for espEtudiant.
     *
     * @param aEspEtudiant the new value for espEtudiant
     */
    public void setEspEtudiant(EspEtudiant aEspEtudiant) {
        espEtudiant = aEspEtudiant;
    }

}
