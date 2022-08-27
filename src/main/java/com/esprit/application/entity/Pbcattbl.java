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
@Table(name="PBCATTBL", indexes={@Index(name="pbcattblPbsyscatpbtIdx", columnList="PBT_TNAM,PBT_OWNR", unique=true)})
public class Pbcattbl implements Serializable {

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
    @Column(name="PBT_TNAM", nullable=false, length=30)
    private String pbtTnam;
    @Column(name="PBT_TID", precision=38)
    private BigDecimal pbtTid;
    @Column(name="PBT_OWNR", nullable=false, length=30)
    private String pbtOwnr;
    @Column(name="PBD_FHGT", precision=38)
    private BigDecimal pbdFhgt;
    @Column(name="PBD_FWGT", precision=38)
    private BigDecimal pbdFwgt;
    @Column(name="PBD_FITL", length=1)
    private String pbdFitl;
    @Column(name="PBD_FUNL", length=1)
    private String pbdFunl;
    @Column(name="PBD_FCHR", precision=38)
    private BigDecimal pbdFchr;
    @Column(name="PBD_FPTC", precision=38)
    private BigDecimal pbdFptc;
    @Column(name="PBD_FFCE", length=18)
    private String pbdFfce;
    @Column(name="PBH_FHGT", precision=38)
    private BigDecimal pbhFhgt;
    @Column(name="PBH_FWGT", precision=38)
    private BigDecimal pbhFwgt;
    @Column(name="PBH_FITL", length=1)
    private String pbhFitl;
    @Column(name="PBH_FUNL", length=1)
    private String pbhFunl;
    @Column(name="PBH_FCHR", precision=38)
    private BigDecimal pbhFchr;
    @Column(name="PBH_FPTC", precision=38)
    private BigDecimal pbhFptc;
    @Column(name="PBH_FFCE", length=18)
    private String pbhFfce;
    @Column(name="PBL_FHGT", precision=38)
    private BigDecimal pblFhgt;
    @Column(name="PBL_FWGT", precision=38)
    private BigDecimal pblFwgt;
    @Column(name="PBL_FITL", length=1)
    private String pblFitl;
    @Column(name="PBL_FUNL", length=1)
    private String pblFunl;
    @Column(name="PBL_FCHR", precision=38)
    private BigDecimal pblFchr;
    @Column(name="PBL_FPTC", precision=38)
    private BigDecimal pblFptc;
    @Column(name="PBL_FFCE", length=18)
    private String pblFfce;
    @Column(name="PBT_CMNT", length=254)
    private String pbtCmnt;

    /** Default constructor. */
    public Pbcattbl() {
        super();
    }

    /**
     * Access method for pbtTnam.
     *
     * @return the current value of pbtTnam
     */
    public String getPbtTnam() {
        return pbtTnam;
    }

    /**
     * Setter method for pbtTnam.
     *
     * @param aPbtTnam the new value for pbtTnam
     */
    public void setPbtTnam(String aPbtTnam) {
        pbtTnam = aPbtTnam;
    }

    /**
     * Access method for pbtTid.
     *
     * @return the current value of pbtTid
     */
    public BigDecimal getPbtTid() {
        return pbtTid;
    }

    /**
     * Setter method for pbtTid.
     *
     * @param aPbtTid the new value for pbtTid
     */
    public void setPbtTid(BigDecimal aPbtTid) {
        pbtTid = aPbtTid;
    }

    /**
     * Access method for pbtOwnr.
     *
     * @return the current value of pbtOwnr
     */
    public String getPbtOwnr() {
        return pbtOwnr;
    }

    /**
     * Setter method for pbtOwnr.
     *
     * @param aPbtOwnr the new value for pbtOwnr
     */
    public void setPbtOwnr(String aPbtOwnr) {
        pbtOwnr = aPbtOwnr;
    }

    /**
     * Access method for pbdFhgt.
     *
     * @return the current value of pbdFhgt
     */
    public BigDecimal getPbdFhgt() {
        return pbdFhgt;
    }

    /**
     * Setter method for pbdFhgt.
     *
     * @param aPbdFhgt the new value for pbdFhgt
     */
    public void setPbdFhgt(BigDecimal aPbdFhgt) {
        pbdFhgt = aPbdFhgt;
    }

    /**
     * Access method for pbdFwgt.
     *
     * @return the current value of pbdFwgt
     */
    public BigDecimal getPbdFwgt() {
        return pbdFwgt;
    }

    /**
     * Setter method for pbdFwgt.
     *
     * @param aPbdFwgt the new value for pbdFwgt
     */
    public void setPbdFwgt(BigDecimal aPbdFwgt) {
        pbdFwgt = aPbdFwgt;
    }

    /**
     * Access method for pbdFitl.
     *
     * @return the current value of pbdFitl
     */
    public String getPbdFitl() {
        return pbdFitl;
    }

    /**
     * Setter method for pbdFitl.
     *
     * @param aPbdFitl the new value for pbdFitl
     */
    public void setPbdFitl(String aPbdFitl) {
        pbdFitl = aPbdFitl;
    }

    /**
     * Access method for pbdFunl.
     *
     * @return the current value of pbdFunl
     */
    public String getPbdFunl() {
        return pbdFunl;
    }

    /**
     * Setter method for pbdFunl.
     *
     * @param aPbdFunl the new value for pbdFunl
     */
    public void setPbdFunl(String aPbdFunl) {
        pbdFunl = aPbdFunl;
    }

    /**
     * Access method for pbdFchr.
     *
     * @return the current value of pbdFchr
     */
    public BigDecimal getPbdFchr() {
        return pbdFchr;
    }

    /**
     * Setter method for pbdFchr.
     *
     * @param aPbdFchr the new value for pbdFchr
     */
    public void setPbdFchr(BigDecimal aPbdFchr) {
        pbdFchr = aPbdFchr;
    }

    /**
     * Access method for pbdFptc.
     *
     * @return the current value of pbdFptc
     */
    public BigDecimal getPbdFptc() {
        return pbdFptc;
    }

    /**
     * Setter method for pbdFptc.
     *
     * @param aPbdFptc the new value for pbdFptc
     */
    public void setPbdFptc(BigDecimal aPbdFptc) {
        pbdFptc = aPbdFptc;
    }

    /**
     * Access method for pbdFfce.
     *
     * @return the current value of pbdFfce
     */
    public String getPbdFfce() {
        return pbdFfce;
    }

    /**
     * Setter method for pbdFfce.
     *
     * @param aPbdFfce the new value for pbdFfce
     */
    public void setPbdFfce(String aPbdFfce) {
        pbdFfce = aPbdFfce;
    }

    /**
     * Access method for pbhFhgt.
     *
     * @return the current value of pbhFhgt
     */
    public BigDecimal getPbhFhgt() {
        return pbhFhgt;
    }

    /**
     * Setter method for pbhFhgt.
     *
     * @param aPbhFhgt the new value for pbhFhgt
     */
    public void setPbhFhgt(BigDecimal aPbhFhgt) {
        pbhFhgt = aPbhFhgt;
    }

    /**
     * Access method for pbhFwgt.
     *
     * @return the current value of pbhFwgt
     */
    public BigDecimal getPbhFwgt() {
        return pbhFwgt;
    }

    /**
     * Setter method for pbhFwgt.
     *
     * @param aPbhFwgt the new value for pbhFwgt
     */
    public void setPbhFwgt(BigDecimal aPbhFwgt) {
        pbhFwgt = aPbhFwgt;
    }

    /**
     * Access method for pbhFitl.
     *
     * @return the current value of pbhFitl
     */
    public String getPbhFitl() {
        return pbhFitl;
    }

    /**
     * Setter method for pbhFitl.
     *
     * @param aPbhFitl the new value for pbhFitl
     */
    public void setPbhFitl(String aPbhFitl) {
        pbhFitl = aPbhFitl;
    }

    /**
     * Access method for pbhFunl.
     *
     * @return the current value of pbhFunl
     */
    public String getPbhFunl() {
        return pbhFunl;
    }

    /**
     * Setter method for pbhFunl.
     *
     * @param aPbhFunl the new value for pbhFunl
     */
    public void setPbhFunl(String aPbhFunl) {
        pbhFunl = aPbhFunl;
    }

    /**
     * Access method for pbhFchr.
     *
     * @return the current value of pbhFchr
     */
    public BigDecimal getPbhFchr() {
        return pbhFchr;
    }

    /**
     * Setter method for pbhFchr.
     *
     * @param aPbhFchr the new value for pbhFchr
     */
    public void setPbhFchr(BigDecimal aPbhFchr) {
        pbhFchr = aPbhFchr;
    }

    /**
     * Access method for pbhFptc.
     *
     * @return the current value of pbhFptc
     */
    public BigDecimal getPbhFptc() {
        return pbhFptc;
    }

    /**
     * Setter method for pbhFptc.
     *
     * @param aPbhFptc the new value for pbhFptc
     */
    public void setPbhFptc(BigDecimal aPbhFptc) {
        pbhFptc = aPbhFptc;
    }

    /**
     * Access method for pbhFfce.
     *
     * @return the current value of pbhFfce
     */
    public String getPbhFfce() {
        return pbhFfce;
    }

    /**
     * Setter method for pbhFfce.
     *
     * @param aPbhFfce the new value for pbhFfce
     */
    public void setPbhFfce(String aPbhFfce) {
        pbhFfce = aPbhFfce;
    }

    /**
     * Access method for pblFhgt.
     *
     * @return the current value of pblFhgt
     */
    public BigDecimal getPblFhgt() {
        return pblFhgt;
    }

    /**
     * Setter method for pblFhgt.
     *
     * @param aPblFhgt the new value for pblFhgt
     */
    public void setPblFhgt(BigDecimal aPblFhgt) {
        pblFhgt = aPblFhgt;
    }

    /**
     * Access method for pblFwgt.
     *
     * @return the current value of pblFwgt
     */
    public BigDecimal getPblFwgt() {
        return pblFwgt;
    }

    /**
     * Setter method for pblFwgt.
     *
     * @param aPblFwgt the new value for pblFwgt
     */
    public void setPblFwgt(BigDecimal aPblFwgt) {
        pblFwgt = aPblFwgt;
    }

    /**
     * Access method for pblFitl.
     *
     * @return the current value of pblFitl
     */
    public String getPblFitl() {
        return pblFitl;
    }

    /**
     * Setter method for pblFitl.
     *
     * @param aPblFitl the new value for pblFitl
     */
    public void setPblFitl(String aPblFitl) {
        pblFitl = aPblFitl;
    }

    /**
     * Access method for pblFunl.
     *
     * @return the current value of pblFunl
     */
    public String getPblFunl() {
        return pblFunl;
    }

    /**
     * Setter method for pblFunl.
     *
     * @param aPblFunl the new value for pblFunl
     */
    public void setPblFunl(String aPblFunl) {
        pblFunl = aPblFunl;
    }

    /**
     * Access method for pblFchr.
     *
     * @return the current value of pblFchr
     */
    public BigDecimal getPblFchr() {
        return pblFchr;
    }

    /**
     * Setter method for pblFchr.
     *
     * @param aPblFchr the new value for pblFchr
     */
    public void setPblFchr(BigDecimal aPblFchr) {
        pblFchr = aPblFchr;
    }

    /**
     * Access method for pblFptc.
     *
     * @return the current value of pblFptc
     */
    public BigDecimal getPblFptc() {
        return pblFptc;
    }

    /**
     * Setter method for pblFptc.
     *
     * @param aPblFptc the new value for pblFptc
     */
    public void setPblFptc(BigDecimal aPblFptc) {
        pblFptc = aPblFptc;
    }

    /**
     * Access method for pblFfce.
     *
     * @return the current value of pblFfce
     */
    public String getPblFfce() {
        return pblFfce;
    }

    /**
     * Setter method for pblFfce.
     *
     * @param aPblFfce the new value for pblFfce
     */
    public void setPblFfce(String aPblFfce) {
        pblFfce = aPblFfce;
    }

    /**
     * Access method for pbtCmnt.
     *
     * @return the current value of pbtCmnt
     */
    public String getPbtCmnt() {
        return pbtCmnt;
    }

    /**
     * Setter method for pbtCmnt.
     *
     * @param aPbtCmnt the new value for pbtCmnt
     */
    public void setPbtCmnt(String aPbtCmnt) {
        pbtCmnt = aPbtCmnt;
    }

}
