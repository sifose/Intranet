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
@Table(name="ESP_NOTE_FRANCAIS_S2", indexes={@Index(name="ESP_NOTE_FRANCAIS_S2_ID_MOODLE_IX", columnList="ID_MOODLE", unique=true)})
public class EspNoteFrancaisS2 implements Serializable {

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

    @Column(name="ID_MOODLE", unique=true, length=255)
    private String idMoodle;
    @Column(name="NOTE_FRANCAIS", length=255)
    private String noteFrancais;
    @Column(name="ID_ET", length=10)
    private String idEt;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspNoteFrancaisS2() {
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
     * Access method for noteFrancais.
     *
     * @return the current value of noteFrancais
     */
    public String getNoteFrancais() {
        return noteFrancais;
    }

    /**
     * Setter method for noteFrancais.
     *
     * @param aNoteFrancais the new value for noteFrancais
     */
    public void setNoteFrancais(String aNoteFrancais) {
        noteFrancais = aNoteFrancais;
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
