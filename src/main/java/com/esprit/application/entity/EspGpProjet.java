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
public class EspGpProjet implements Serializable {

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

    @Column(name="ID_GROUPE_PROJET", nullable=false, length=20)
    private String idGroupeProjet;
    @Column(name="NOM_GROUPE", nullable=false, length=20)
    private String nomGroupe;
    @Column(name="SUJET", nullable=false, length=2000)
    private String sujet;
    @Column(name="NUM_GROUPE", nullable=false, precision=3)
    private BigDecimal numGroupe;
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspGpProjet() {
        super();
    }

    /**
     * Access method for idGroupeProjet.
     *
     * @return the current value of idGroupeProjet
     */
    public String getIdGroupeProjet() {
        return idGroupeProjet;
    }

    /**
     * Setter method for idGroupeProjet.
     *
     * @param aIdGroupeProjet the new value for idGroupeProjet
     */
    public void setIdGroupeProjet(String aIdGroupeProjet) {
        idGroupeProjet = aIdGroupeProjet;
    }

    /**
     * Access method for nomGroupe.
     *
     * @return the current value of nomGroupe
     */
    public String getNomGroupe() {
        return nomGroupe;
    }

    /**
     * Setter method for nomGroupe.
     *
     * @param aNomGroupe the new value for nomGroupe
     */
    public void setNomGroupe(String aNomGroupe) {
        nomGroupe = aNomGroupe;
    }

    /**
     * Access method for sujet.
     *
     * @return the current value of sujet
     */
    public String getSujet() {
        return sujet;
    }

    /**
     * Setter method for sujet.
     *
     * @param aSujet the new value for sujet
     */
    public void setSujet(String aSujet) {
        sujet = aSujet;
    }

    /**
     * Access method for numGroupe.
     *
     * @return the current value of numGroupe
     */
    public BigDecimal getNumGroupe() {
        return numGroupe;
    }

    /**
     * Setter method for numGroupe.
     *
     * @param aNumGroupe the new value for numGroupe
     */
    public void setNumGroupe(BigDecimal aNumGroupe) {
        numGroupe = aNumGroupe;
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
