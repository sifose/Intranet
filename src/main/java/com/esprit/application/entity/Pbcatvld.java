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

@Embeddable
@Table(name="PBCATVLD", indexes={@Index(name="PBCATVLD_PBV_NAME_IX", columnList="PBV_NAME", unique=true)})
public class Pbcatvld implements Serializable {

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
    @Column(name="PBV_NAME", unique=true, length=30)
    private String pbvName;
    @Column(name="PBV_VALD", length=254)
    private String pbvVald;
    @Column(name="PBV_TYPE", precision=38)
    private BigDecimal pbvType;
    @Column(name="PBV_CNTR", precision=38)
    private BigDecimal pbvCntr;
    @Column(name="PBV_MSG", length=254)
    private String pbvMsg;

    /** Default constructor. */
    public Pbcatvld() {
        super();
    }

    /**
     * Access method for pbvName.
     *
     * @return the current value of pbvName
     */
    public String getPbvName() {
        return pbvName;
    }

    /**
     * Setter method for pbvName.
     *
     * @param aPbvName the new value for pbvName
     */
    public void setPbvName(String aPbvName) {
        pbvName = aPbvName;
    }

    /**
     * Access method for pbvVald.
     *
     * @return the current value of pbvVald
     */
    public String getPbvVald() {
        return pbvVald;
    }

    /**
     * Setter method for pbvVald.
     *
     * @param aPbvVald the new value for pbvVald
     */
    public void setPbvVald(String aPbvVald) {
        pbvVald = aPbvVald;
    }

    /**
     * Access method for pbvType.
     *
     * @return the current value of pbvType
     */
    public BigDecimal getPbvType() {
        return pbvType;
    }

    /**
     * Setter method for pbvType.
     *
     * @param aPbvType the new value for pbvType
     */
    public void setPbvType(BigDecimal aPbvType) {
        pbvType = aPbvType;
    }

    /**
     * Access method for pbvCntr.
     *
     * @return the current value of pbvCntr
     */
    public BigDecimal getPbvCntr() {
        return pbvCntr;
    }

    /**
     * Setter method for pbvCntr.
     *
     * @param aPbvCntr the new value for pbvCntr
     */
    public void setPbvCntr(BigDecimal aPbvCntr) {
        pbvCntr = aPbvCntr;
    }

    /**
     * Access method for pbvMsg.
     *
     * @return the current value of pbvMsg
     */
    public String getPbvMsg() {
        return pbvMsg;
    }

    /**
     * Setter method for pbvMsg.
     *
     * @param aPbvMsg the new value for pbvMsg
     */
    public void setPbvMsg(String aPbvMsg) {
        pbvMsg = aPbvMsg;
    }

}
