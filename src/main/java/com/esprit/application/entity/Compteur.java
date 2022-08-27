// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class Compteur implements Serializable {

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
    @Column(name="CODE_CPT", length=2)
    private String codeCpt;
    @Column(name="LIB_CPT", length=20)
    private String libCpt;
    @Column(name="DATE_CR")
    private LocalDateTime dateCr;
    @Column(name="DATE_LAST_MODIF")
    private LocalDateTime dateLastModif;
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public Compteur() {
        super();
    }

    /**
     * Access method for codeCpt.
     *
     * @return the current value of codeCpt
     */
    public String getCodeCpt() {
        return codeCpt;
    }

    /**
     * Setter method for codeCpt.
     *
     * @param aCodeCpt the new value for codeCpt
     */
    public void setCodeCpt(String aCodeCpt) {
        codeCpt = aCodeCpt;
    }

    /**
     * Access method for libCpt.
     *
     * @return the current value of libCpt
     */
    public String getLibCpt() {
        return libCpt;
    }

    /**
     * Setter method for libCpt.
     *
     * @param aLibCpt the new value for libCpt
     */
    public void setLibCpt(String aLibCpt) {
        libCpt = aLibCpt;
    }

    /**
     * Access method for dateCr.
     *
     * @return the current value of dateCr
     */
    public LocalDateTime getDateCr() {
        return dateCr;
    }

    /**
     * Setter method for dateCr.
     *
     * @param aDateCr the new value for dateCr
     */
    public void setDateCr(LocalDateTime aDateCr) {
        dateCr = aDateCr;
    }

    /**
     * Access method for dateLastModif.
     *
     * @return the current value of dateLastModif
     */
    public LocalDateTime getDateLastModif() {
        return dateLastModif;
    }

    /**
     * Setter method for dateLastModif.
     *
     * @param aDateLastModif the new value for dateLastModif
     */
    public void setDateLastModif(LocalDateTime aDateLastModif) {
        dateLastModif = aDateLastModif;
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
