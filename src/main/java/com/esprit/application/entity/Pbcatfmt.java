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
@Table(name="PBCATFMT", indexes={@Index(name="PBCATFMT_PBF_NAME_IX", columnList="PBF_NAME", unique=true)})
public class Pbcatfmt implements Serializable {

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
    @Column(name="PBF_NAME", unique=true, length=30)
    private String pbfName;
    @Column(name="PBF_FRMT", length=254)
    private String pbfFrmt;
    @Column(name="PBF_TYPE", nullable=false, precision=38)
    private BigDecimal pbfType;
    @Column(name="PBF_CNTR", precision=38)
    private BigDecimal pbfCntr;

    /** Default constructor. */
    public Pbcatfmt() {
        super();
    }

    /**
     * Access method for pbfName.
     *
     * @return the current value of pbfName
     */
    public String getPbfName() {
        return pbfName;
    }

    /**
     * Setter method for pbfName.
     *
     * @param aPbfName the new value for pbfName
     */
    public void setPbfName(String aPbfName) {
        pbfName = aPbfName;
    }

    /**
     * Access method for pbfFrmt.
     *
     * @return the current value of pbfFrmt
     */
    public String getPbfFrmt() {
        return pbfFrmt;
    }

    /**
     * Setter method for pbfFrmt.
     *
     * @param aPbfFrmt the new value for pbfFrmt
     */
    public void setPbfFrmt(String aPbfFrmt) {
        pbfFrmt = aPbfFrmt;
    }

    /**
     * Access method for pbfType.
     *
     * @return the current value of pbfType
     */
    public BigDecimal getPbfType() {
        return pbfType;
    }

    /**
     * Setter method for pbfType.
     *
     * @param aPbfType the new value for pbfType
     */
    public void setPbfType(BigDecimal aPbfType) {
        pbfType = aPbfType;
    }

    /**
     * Access method for pbfCntr.
     *
     * @return the current value of pbfCntr
     */
    public BigDecimal getPbfCntr() {
        return pbfCntr;
    }

    /**
     * Setter method for pbfCntr.
     *
     * @param aPbfCntr the new value for pbfCntr
     */
    public void setPbfCntr(BigDecimal aPbfCntr) {
        pbfCntr = aPbfCntr;
    }

}
