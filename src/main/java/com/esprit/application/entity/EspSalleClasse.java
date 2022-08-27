// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class EspSalleClasse implements Serializable {

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
    @Column(name="ID", nullable=false, precision=126)
    private double id;
    @Column(name="ANNEE_DEB", precision=126)
    private double anneeDeb;
    @Column(name="CODE_CL", length=255)
    private String codeCl;
    @Column(name="SALLE", length=255)
    private String salle;

    /** Default constructor. */
    public EspSalleClasse() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public double getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(double aId) {
        id = aId;
    }

    /**
     * Access method for anneeDeb.
     *
     * @return the current value of anneeDeb
     */
    public double getAnneeDeb() {
        return anneeDeb;
    }

    /**
     * Setter method for anneeDeb.
     *
     * @param aAnneeDeb the new value for anneeDeb
     */
    public void setAnneeDeb(double aAnneeDeb) {
        anneeDeb = aAnneeDeb;
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
     * Access method for salle.
     *
     * @return the current value of salle
     */
    public String getSalle() {
        return salle;
    }

    /**
     * Setter method for salle.
     *
     * @param aSalle the new value for salle
     */
    public void setSalle(String aSalle) {
        salle = aSalle;
    }

}
