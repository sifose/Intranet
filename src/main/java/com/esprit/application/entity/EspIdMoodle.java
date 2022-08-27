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
@Table(name="ESP_ID_MOODLE", indexes={@Index(name="ESP_ID_MOODLE_ID_MOODLE_IX", columnList="ID_MOODLE", unique=true)})
public class EspIdMoodle implements Serializable {

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
    @Column(name="ID_MOODLE", unique=true, length=16)
    private String idMoodle;
    @Column(name="F7", length=10)
    private String f7;
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspIdMoodle() {
        super();
    }

    /**
     * Access method for idMoodle.
     *
     * @return the current value of idMoodle
     */
    public String getIdMoodle() {
        return idMoodle;
    }

    /**
     * Setter method for idMoodle.
     *
     * @param aIdMoodle the new value for idMoodle
     */
    public void setIdMoodle(String aIdMoodle) {
        idMoodle = aIdMoodle;
    }

    /**
     * Access method for f7.
     *
     * @return the current value of f7
     */
    public String getF7() {
        return f7;
    }

    /**
     * Setter method for f7.
     *
     * @param aF7 the new value for f7
     */
    public void setF7(String aF7) {
        f7 = aF7;
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
