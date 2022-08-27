// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class LiaisonNavScoNumtel implements Serializable {

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
    @Column(name="NUMCOMPTE", length=20)
    private String numcompte;
    @Column(name="NUM_TEL", length=30)
    private String numTel;
    @Column(name="NAME", length=50)
    private String name;
    @Column(name="NAME2", length=50)
    private String name2;

    /** Default constructor. */
    public LiaisonNavScoNumtel() {
        super();
    }

    /**
     * Access method for numcompte.
     *
     * @return the current value of numcompte
     */
    public String getNumcompte() {
        return numcompte;
    }

    /**
     * Setter method for numcompte.
     *
     * @param aNumcompte the new value for numcompte
     */
    public void setNumcompte(String aNumcompte) {
        numcompte = aNumcompte;
    }

    /**
     * Access method for numTel.
     *
     * @return the current value of numTel
     */
    public String getNumTel() {
        return numTel;
    }

    /**
     * Setter method for numTel.
     *
     * @param aNumTel the new value for numTel
     */
    public void setNumTel(String aNumTel) {
        numTel = aNumTel;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for name2.
     *
     * @return the current value of name2
     */
    public String getName2() {
        return name2;
    }

    /**
     * Setter method for name2.
     *
     * @param aName2 the new value for name2
     */
    public void setName2(String aName2) {
        name2 = aName2;
    }

}
