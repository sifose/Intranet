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
public class EspToeicNb implements Serializable {

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

    @Column(name="DATETEST")
    private LocalDateTime datetest;
    @Column(name="NBMAX", precision=25)
    private BigDecimal nbmax;
    @Column(name="NB_CONDIDATS_FR", precision=25)
    private BigDecimal nbCondidatsFr;
    @Column(name="NB_CONDIDATS_ANG", precision=25)
    private BigDecimal nbCondidatsAng;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspToeicNb() {
        super();
    }

    /**
     * Access method for datetest.
     *
     * @return the current value of datetest
     */
    public LocalDateTime getDatetest() {
        return datetest;
    }

    /**
     * Setter method for datetest.
     *
     * @param aDatetest the new value for datetest
     */
    public void setDatetest(LocalDateTime aDatetest) {
        datetest = aDatetest;
    }

    /**
     * Access method for nbmax.
     *
     * @return the current value of nbmax
     */
    public BigDecimal getNbmax() {
        return nbmax;
    }

    /**
     * Setter method for nbmax.
     *
     * @param aNbmax the new value for nbmax
     */
    public void setNbmax(BigDecimal aNbmax) {
        nbmax = aNbmax;
    }

    /**
     * Access method for nbCondidatsFr.
     *
     * @return the current value of nbCondidatsFr
     */
    public BigDecimal getNbCondidatsFr() {
        return nbCondidatsFr;
    }

    /**
     * Setter method for nbCondidatsFr.
     *
     * @param aNbCondidatsFr the new value for nbCondidatsFr
     */
    public void setNbCondidatsFr(BigDecimal aNbCondidatsFr) {
        nbCondidatsFr = aNbCondidatsFr;
    }

    /**
     * Access method for nbCondidatsAng.
     *
     * @return the current value of nbCondidatsAng
     */
    public BigDecimal getNbCondidatsAng() {
        return nbCondidatsAng;
    }

    /**
     * Setter method for nbCondidatsAng.
     *
     * @param aNbCondidatsAng the new value for nbCondidatsAng
     */
    public void setNbCondidatsAng(BigDecimal aNbCondidatsAng) {
        nbCondidatsAng = aNbCondidatsAng;
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
