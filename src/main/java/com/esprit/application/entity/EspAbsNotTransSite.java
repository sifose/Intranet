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
public class EspAbsNotTransSite implements Serializable {

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
    @Column(name="ID_ET", length=10)
    private String idEt;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Column(name="DATE_SEANCE", length=10)
    private String dateSeance;
    @Column(name="NUM_SEANCE", precision=1)
    private BigDecimal numSeance;
    @Column(name="CODE_MODULE", length=10)
    private String codeModule;
    @Column(name="JUSTIF_NOT_TRANSF", length=200)
    private String justifNotTransf;
    @Column(name="TRANSFERRRED", length=1)
    private String transferrred;
    @Column(name="DATE_TRANSF")
    private LocalDateTime dateTransf;
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspAbsNotTransSite() {
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
     * Access method for codeCl.
     *
     * @return the current value of codeCl
     */
    public String getCodeCl() {
        return codeCl;
    }

    /**
     * Setter method for codeCl.
     *
     * @param aCodeCl the new value for codeCl
     */
    public void setCodeCl(String aCodeCl) {
        codeCl = aCodeCl;
    }

    /**
     * Access method for dateSeance.
     *
     * @return the current value of dateSeance
     */
    public String getDateSeance() {
        return dateSeance;
    }

    /**
     * Setter method for dateSeance.
     *
     * @param aDateSeance the new value for dateSeance
     */
    public void setDateSeance(String aDateSeance) {
        dateSeance = aDateSeance;
    }

    /**
     * Access method for numSeance.
     *
     * @return the current value of numSeance
     */
    public BigDecimal getNumSeance() {
        return numSeance;
    }

    /**
     * Setter method for numSeance.
     *
     * @param aNumSeance the new value for numSeance
     */
    public void setNumSeance(BigDecimal aNumSeance) {
        numSeance = aNumSeance;
    }

    /**
     * Access method for codeModule.
     *
     * @return the current value of codeModule
     */
    public String getCodeModule() {
        return codeModule;
    }

    /**
     * Setter method for codeModule.
     *
     * @param aCodeModule the new value for codeModule
     */
    public void setCodeModule(String aCodeModule) {
        codeModule = aCodeModule;
    }

    /**
     * Access method for justifNotTransf.
     *
     * @return the current value of justifNotTransf
     */
    public String getJustifNotTransf() {
        return justifNotTransf;
    }

    /**
     * Setter method for justifNotTransf.
     *
     * @param aJustifNotTransf the new value for justifNotTransf
     */
    public void setJustifNotTransf(String aJustifNotTransf) {
        justifNotTransf = aJustifNotTransf;
    }

    /**
     * Access method for transferrred.
     *
     * @return the current value of transferrred
     */
    public String getTransferrred() {
        return transferrred;
    }

    /**
     * Setter method for transferrred.
     *
     * @param aTransferrred the new value for transferrred
     */
    public void setTransferrred(String aTransferrred) {
        transferrred = aTransferrred;
    }

    /**
     * Access method for dateTransf.
     *
     * @return the current value of dateTransf
     */
    public LocalDateTime getDateTransf() {
        return dateTransf;
    }

    /**
     * Setter method for dateTransf.
     *
     * @param aDateTransf the new value for dateTransf
     */
    public void setDateTransf(LocalDateTime aDateTransf) {
        dateTransf = aDateTransf;
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
