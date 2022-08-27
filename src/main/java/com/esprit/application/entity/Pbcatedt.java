// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="PBCATEDT", indexes={@Index(name="pbcatedtPbsyspbeIdx", columnList="PBE_NAME,PBE_SEQN", unique=true)})
public class Pbcatedt implements Serializable {

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
    @Column(name="PBE_NAME", length=30)
    private String pbeName;
    @Column(name="PBE_EDIT", length=254)
    private String pbeEdit;
    @Column(name="PBE_TYPE", precision=38)
    private BigDecimal pbeType;
    @Column(name="PBE_CNTR", precision=38)
    private BigDecimal pbeCntr;
    @Column(name="PBE_SEQN", precision=38)
    private BigDecimal pbeSeqn;
    @Column(name="PBE_FLAG", precision=38)
    private BigDecimal pbeFlag;
    @Column(name="PBE_WORK", length=32)
    private String pbeWork;

    /** Default constructor. */
    public Pbcatedt() {
        super();
    }

    /**
     * Access method for pbeName.
     *
     * @return the current value of pbeName
     */
    public String getPbeName() {
        return pbeName;
    }

    /**
     * Setter method for pbeName.
     *
     * @param aPbeName the new value for pbeName
     */
    public void setPbeName(String aPbeName) {
        pbeName = aPbeName;
    }

    /**
     * Access method for pbeEdit.
     *
     * @return the current value of pbeEdit
     */
    public String getPbeEdit() {
        return pbeEdit;
    }

    /**
     * Setter method for pbeEdit.
     *
     * @param aPbeEdit the new value for pbeEdit
     */
    public void setPbeEdit(String aPbeEdit) {
        pbeEdit = aPbeEdit;
    }

    /**
     * Access method for pbeType.
     *
     * @return the current value of pbeType
     */
    public BigDecimal getPbeType() {
        return pbeType;
    }

    /**
     * Setter method for pbeType.
     *
     * @param aPbeType the new value for pbeType
     */
    public void setPbeType(BigDecimal aPbeType) {
        pbeType = aPbeType;
    }

    /**
     * Access method for pbeCntr.
     *
     * @return the current value of pbeCntr
     */
    public BigDecimal getPbeCntr() {
        return pbeCntr;
    }

    /**
     * Setter method for pbeCntr.
     *
     * @param aPbeCntr the new value for pbeCntr
     */
    public void setPbeCntr(BigDecimal aPbeCntr) {
        pbeCntr = aPbeCntr;
    }

    /**
     * Access method for pbeSeqn.
     *
     * @return the current value of pbeSeqn
     */
    public BigDecimal getPbeSeqn() {
        return pbeSeqn;
    }

    /**
     * Setter method for pbeSeqn.
     *
     * @param aPbeSeqn the new value for pbeSeqn
     */
    public void setPbeSeqn(BigDecimal aPbeSeqn) {
        pbeSeqn = aPbeSeqn;
    }

    /**
     * Access method for pbeFlag.
     *
     * @return the current value of pbeFlag
     */
    public BigDecimal getPbeFlag() {
        return pbeFlag;
    }

    /**
     * Setter method for pbeFlag.
     *
     * @param aPbeFlag the new value for pbeFlag
     */
    public void setPbeFlag(BigDecimal aPbeFlag) {
        pbeFlag = aPbeFlag;
    }

    /**
     * Access method for pbeWork.
     *
     * @return the current value of pbeWork
     */
    public String getPbeWork() {
        return pbeWork;
    }

    /**
     * Setter method for pbeWork.
     *
     * @param aPbeWork the new value for pbeWork
     */
    public void setPbeWork(String aPbeWork) {
        pbeWork = aPbeWork;
    }

}
