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
public class EspImportscore implements Serializable {

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
    @Column(name="MATRICULE", length=10)
    private String matricule;
    @Column(name="NOTE_ANG", length=18)
    private String noteAng;
    @Column(name="NOTE_FRAN", length=18)
    private String noteFran;
    @Column(name="NOTEQI", length=18)
    private String noteqi;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspImportscore() {
        super();
    }

    /**
     * Access method for matricule.
     *
     * @return the current value of matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * Setter method for matricule.
     *
     * @param aMatricule the new value for matricule
     */
    public void setMatricule(String aMatricule) {
        matricule = aMatricule;
    }

    /**
     * Access method for noteAng.
     *
     * @return the current value of noteAng
     */
    public String getNoteAng() {
        return noteAng;
    }

    /**
     * Setter method for noteAng.
     *
     * @param aNoteAng the new value for noteAng
     */
    public void setNoteAng(String aNoteAng) {
        noteAng = aNoteAng;
    }

    /**
     * Access method for noteFran.
     *
     * @return the current value of noteFran
     */
    public String getNoteFran() {
        return noteFran;
    }

    /**
     * Setter method for noteFran.
     *
     * @param aNoteFran the new value for noteFran
     */
    public void setNoteFran(String aNoteFran) {
        noteFran = aNoteFran;
    }

    /**
     * Access method for noteqi.
     *
     * @return the current value of noteqi
     */
    public String getNoteqi() {
        return noteqi;
    }

    /**
     * Setter method for noteqi.
     *
     * @param aNoteqi the new value for noteqi
     */
    public void setNoteqi(String aNoteqi) {
        noteqi = aNoteqi;
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
