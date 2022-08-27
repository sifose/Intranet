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
public class AValidationNote implements Serializable {

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
    @Column(name="CODE_CL", length=20)
    private String codeCl;
    @Column(name="MODULE", length=20)
    private String module;
    @Column(name="SEMESTRE")
    private BigDecimal semestre;
    @Column(name="V_DATE")
    private LocalDateTime vDate;

    /** Default constructor. */
    public AValidationNote() {
        super();
    }

    /**
     * Access method for codeCl.
     *
     * @return the current value of codeCl
     */
    public String getCodeCl() {
        return codeCl;
    }

    /**
     * Setter method for codeCl.
     *
     * @param aCodeCl the new value for codeCl
     */
    public void setCodeCl(String aCodeCl) {
        codeCl = aCodeCl;
    }

    /**
     * Access method for module.
     *
     * @return the current value of module
     */
    public String getModule() {
        return module;
    }

    /**
     * Setter method for module.
     *
     * @param aModule the new value for module
     */
    public void setModule(String aModule) {
        module = aModule;
    }

    /**
     * Access method for semestre.
     *
     * @return the current value of semestre
     */
    public BigDecimal getSemestre() {
        return semestre;
    }

    /**
     * Setter method for semestre.
     *
     * @param aSemestre the new value for semestre
     */
    public void setSemestre(BigDecimal aSemestre) {
        semestre = aSemestre;
    }

    /**
     * Access method for vDate.
     *
     * @return the current value of vDate
     */
    public LocalDateTime getVDate() {
        return vDate;
    }

    /**
     * Setter method for vDate.
     *
     * @param aVDate the new value for vDate
     */
    public void setVDate(LocalDateTime aVDate) {
        vDate = aVDate;
    }

}
