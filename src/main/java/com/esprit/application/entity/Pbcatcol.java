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
@Table(name="PBCATCOL", indexes={@Index(name="pbcatcolPbsyscatcoldictIdx", columnList="PBC_TNAM,PBC_OWNR,PBC_CNAM", unique=true)})
public class Pbcatcol implements Serializable {

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
    @Column(name="PBC_TNAM", nullable=false, length=30)
    private String pbcTnam;
    @Column(name="PBC_TID", precision=38)
    private BigDecimal pbcTid;
    @Column(name="PBC_OWNR", nullable=false, length=30)
    private String pbcOwnr;
    @Column(name="PBC_CNAM", nullable=false, length=30)
    private String pbcCnam;
    @Column(name="PBC_CID", precision=38)
    private BigDecimal pbcCid;
    @Column(name="PBC_LABL", length=254)
    private String pbcLabl;
    @Column(name="PBC_LPOS", precision=38)
    private BigDecimal pbcLpos;
    @Column(name="PBC_HDR", length=254)
    private String pbcHdr;
    @Column(name="PBC_HPOS", precision=38)
    private BigDecimal pbcHpos;
    @Column(name="PBC_JTFY", precision=38)
    private BigDecimal pbcJtfy;
    @Column(name="PBC_MASK", length=31)
    private String pbcMask;
    @Column(name="PBC_CASE", precision=38)
    private BigDecimal pbcCase;
    @Column(name="PBC_HGHT", precision=38)
    private BigDecimal pbcHght;
    @Column(name="PBC_WDTH", precision=38)
    private BigDecimal pbcWdth;
    @Column(name="PBC_PTRN", length=31)
    private String pbcPtrn;
    @Column(name="PBC_BMAP", length=1)
    private String pbcBmap;
    @Column(name="PBC_INIT", length=254)
    private String pbcInit;
    @Column(name="PBC_CMNT", length=254)
    private String pbcCmnt;
    @Column(name="PBC_EDIT", length=31)
    private String pbcEdit;
    @Column(name="PBC_TAG", length=254)
    private String pbcTag;

    /** Default constructor. */
    public Pbcatcol() {
        super();
    }

    /**
     * Access method for pbcTnam.
     *
     * @return the current value of pbcTnam
     */
    public String getPbcTnam() {
        return pbcTnam;
    }

    /**
     * Setter method for pbcTnam.
     *
     * @param aPbcTnam the new value for pbcTnam
     */
    public void setPbcTnam(String aPbcTnam) {
        pbcTnam = aPbcTnam;
    }

    /**
     * Access method for pbcTid.
     *
     * @return the current value of pbcTid
     */
    public BigDecimal getPbcTid() {
        return pbcTid;
    }

    /**
     * Setter method for pbcTid.
     *
     * @param aPbcTid the new value for pbcTid
     */
    public void setPbcTid(BigDecimal aPbcTid) {
        pbcTid = aPbcTid;
    }

    /**
     * Access method for pbcOwnr.
     *
     * @return the current value of pbcOwnr
     */
    public String getPbcOwnr() {
        return pbcOwnr;
    }

    /**
     * Setter method for pbcOwnr.
     *
     * @param aPbcOwnr the new value for pbcOwnr
     */
    public void setPbcOwnr(String aPbcOwnr) {
        pbcOwnr = aPbcOwnr;
    }

    /**
     * Access method for pbcCnam.
     *
     * @return the current value of pbcCnam
     */
    public String getPbcCnam() {
        return pbcCnam;
    }

    /**
     * Setter method for pbcCnam.
     *
     * @param aPbcCnam the new value for pbcCnam
     */
    public void setPbcCnam(String aPbcCnam) {
        pbcCnam = aPbcCnam;
    }

    /**
     * Access method for pbcCid.
     *
     * @return the current value of pbcCid
     */
    public BigDecimal getPbcCid() {
        return pbcCid;
    }

    /**
     * Setter method for pbcCid.
     *
     * @param aPbcCid the new value for pbcCid
     */
    public void setPbcCid(BigDecimal aPbcCid) {
        pbcCid = aPbcCid;
    }

    /**
     * Access method for pbcLabl.
     *
     * @return the current value of pbcLabl
     */
    public String getPbcLabl() {
        return pbcLabl;
    }

    /**
     * Setter method for pbcLabl.
     *
     * @param aPbcLabl the new value for pbcLabl
     */
    public void setPbcLabl(String aPbcLabl) {
        pbcLabl = aPbcLabl;
    }

    /**
     * Access method for pbcLpos.
     *
     * @return the current value of pbcLpos
     */
    public BigDecimal getPbcLpos() {
        return pbcLpos;
    }

    /**
     * Setter method for pbcLpos.
     *
     * @param aPbcLpos the new value for pbcLpos
     */
    public void setPbcLpos(BigDecimal aPbcLpos) {
        pbcLpos = aPbcLpos;
    }

    /**
     * Access method for pbcHdr.
     *
     * @return the current value of pbcHdr
     */
    public String getPbcHdr() {
        return pbcHdr;
    }

    /**
     * Setter method for pbcHdr.
     *
     * @param aPbcHdr the new value for pbcHdr
     */
    public void setPbcHdr(String aPbcHdr) {
        pbcHdr = aPbcHdr;
    }

    /**
     * Access method for pbcHpos.
     *
     * @return the current value of pbcHpos
     */
    public BigDecimal getPbcHpos() {
        return pbcHpos;
    }

    /**
     * Setter method for pbcHpos.
     *
     * @param aPbcHpos the new value for pbcHpos
     */
    public void setPbcHpos(BigDecimal aPbcHpos) {
        pbcHpos = aPbcHpos;
    }

    /**
     * Access method for pbcJtfy.
     *
     * @return the current value of pbcJtfy
     */
    public BigDecimal getPbcJtfy() {
        return pbcJtfy;
    }

    /**
     * Setter method for pbcJtfy.
     *
     * @param aPbcJtfy the new value for pbcJtfy
     */
    public void setPbcJtfy(BigDecimal aPbcJtfy) {
        pbcJtfy = aPbcJtfy;
    }

    /**
     * Access method for pbcMask.
     *
     * @return the current value of pbcMask
     */
    public String getPbcMask() {
        return pbcMask;
    }

    /**
     * Setter method for pbcMask.
     *
     * @param aPbcMask the new value for pbcMask
     */
    public void setPbcMask(String aPbcMask) {
        pbcMask = aPbcMask;
    }

    /**
     * Access method for pbcCase.
     *
     * @return the current value of pbcCase
     */
    public BigDecimal getPbcCase() {
        return pbcCase;
    }

    /**
     * Setter method for pbcCase.
     *
     * @param aPbcCase the new value for pbcCase
     */
    public void setPbcCase(BigDecimal aPbcCase) {
        pbcCase = aPbcCase;
    }

    /**
     * Access method for pbcHght.
     *
     * @return the current value of pbcHght
     */
    public BigDecimal getPbcHght() {
        return pbcHght;
    }

    /**
     * Setter method for pbcHght.
     *
     * @param aPbcHght the new value for pbcHght
     */
    public void setPbcHght(BigDecimal aPbcHght) {
        pbcHght = aPbcHght;
    }

    /**
     * Access method for pbcWdth.
     *
     * @return the current value of pbcWdth
     */
    public BigDecimal getPbcWdth() {
        return pbcWdth;
    }

    /**
     * Setter method for pbcWdth.
     *
     * @param aPbcWdth the new value for pbcWdth
     */
    public void setPbcWdth(BigDecimal aPbcWdth) {
        pbcWdth = aPbcWdth;
    }

    /**
     * Access method for pbcPtrn.
     *
     * @return the current value of pbcPtrn
     */
    public String getPbcPtrn() {
        return pbcPtrn;
    }

    /**
     * Setter method for pbcPtrn.
     *
     * @param aPbcPtrn the new value for pbcPtrn
     */
    public void setPbcPtrn(String aPbcPtrn) {
        pbcPtrn = aPbcPtrn;
    }

    /**
     * Access method for pbcBmap.
     *
     * @return the current value of pbcBmap
     */
    public String getPbcBmap() {
        return pbcBmap;
    }

    /**
     * Setter method for pbcBmap.
     *
     * @param aPbcBmap the new value for pbcBmap
     */
    public void setPbcBmap(String aPbcBmap) {
        pbcBmap = aPbcBmap;
    }

    /**
     * Access method for pbcInit.
     *
     * @return the current value of pbcInit
     */
    public String getPbcInit() {
        return pbcInit;
    }

    /**
     * Setter method for pbcInit.
     *
     * @param aPbcInit the new value for pbcInit
     */
    public void setPbcInit(String aPbcInit) {
        pbcInit = aPbcInit;
    }

    /**
     * Access method for pbcCmnt.
     *
     * @return the current value of pbcCmnt
     */
    public String getPbcCmnt() {
        return pbcCmnt;
    }

    /**
     * Setter method for pbcCmnt.
     *
     * @param aPbcCmnt the new value for pbcCmnt
     */
    public void setPbcCmnt(String aPbcCmnt) {
        pbcCmnt = aPbcCmnt;
    }

    /**
     * Access method for pbcEdit.
     *
     * @return the current value of pbcEdit
     */
    public String getPbcEdit() {
        return pbcEdit;
    }

    /**
     * Setter method for pbcEdit.
     *
     * @param aPbcEdit the new value for pbcEdit
     */
    public void setPbcEdit(String aPbcEdit) {
        pbcEdit = aPbcEdit;
    }

    /**
     * Access method for pbcTag.
     *
     * @return the current value of pbcTag
     */
    public String getPbcTag() {
        return pbcTag;
    }

    /**
     * Setter method for pbcTag.
     *
     * @param aPbcTag the new value for pbcTag
     */
    public void setPbcTag(String aPbcTag) {
        pbcTag = aPbcTag;
    }

}
