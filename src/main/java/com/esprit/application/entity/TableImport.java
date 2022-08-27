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
public class TableImport implements Serializable {

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

    @Column(name="ID_ET", length=10)
    private String idEt;
    @Column(name="NIV_ACQUIS_ANGLAIS", length=2)
    private String nivAcquisAnglais;
    @Column(name="NIV_ACQUIS_FRANCAIS", length=2)
    private String nivAcquisFrancais;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public TableImport() {
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
     * Access method for nivAcquisAnglais.
     *
     * @return the current value of nivAcquisAnglais
     */
    public String getNivAcquisAnglais() {
        return nivAcquisAnglais;
    }

    /**
     * Setter method for nivAcquisAnglais.
     *
     * @param aNivAcquisAnglais the new value for nivAcquisAnglais
     */
    public void setNivAcquisAnglais(String aNivAcquisAnglais) {
        nivAcquisAnglais = aNivAcquisAnglais;
    }

    /**
     * Access method for nivAcquisFrancais.
     *
     * @return the current value of nivAcquisFrancais
     */
    public String getNivAcquisFrancais() {
        return nivAcquisFrancais;
    }

    /**
     * Setter method for nivAcquisFrancais.
     *
     * @param aNivAcquisFrancais the new value for nivAcquisFrancais
     */
    public void setNivAcquisFrancais(String aNivAcquisFrancais) {
        nivAcquisFrancais = aNivAcquisFrancais;
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
