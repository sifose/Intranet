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
@Table(name="ESP_CRITERE_EVAL", indexes={@Index(name="ESP_CRITERE_EVAL_CODE_CRITERE_IX", columnList="CODE_CRITERE", unique=true)})
public class EspCritereEval implements Serializable {

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
    
    @Column(name="CODE_CRITERE", unique=true, nullable=false, length=10)
    private String codeCritere;
    @Column(name="LIB_CRITERE", length=30)
    private String libCritere;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspCritereEval() {
        super();
    }

    /**
     * Access method for codeCritere.
     *
     * @return the current value of codeCritere
     */
    public String getCodeCritere() {
        return codeCritere;
    }

    /**
     * Setter method for codeCritere.
     *
     * @param aCodeCritere the new value for codeCritere
     */
    public void setCodeCritere(String aCodeCritere) {
        codeCritere = aCodeCritere;
    }

    /**
     * Access method for libCritere.
     *
     * @return the current value of libCritere
     */
    public String getLibCritere() {
        return libCritere;
    }

    /**
     * Setter method for libCritere.
     *
     * @param aLibCritere the new value for libCritere
     */
    public void setLibCritere(String aLibCritere) {
        libCritere = aLibCritere;
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
