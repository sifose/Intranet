// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class EspNoteQiS2New implements Serializable {

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

    @Column(name="ID_MOODLE", length=255)
    private String idMoodle;
    @Column(name="NOTE_QI", length=255)
    private String noteQi;
    @Column(name="ID_ET", length=10)
    private String idEt;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspNoteQiS2New() {
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
     * Access method for noteQi.
     *
     * @return the current value of noteQi
     */
    public String getNoteQi() {
        return noteQi;
    }

    /**
     * Setter method for noteQi.
     *
     * @param aNoteQi the new value for noteQi
     */
    public void setNoteQi(String aNoteQi) {
        noteQi = aNoteQi;
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
