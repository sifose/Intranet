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
public class EspEtudiantNoteGroupe implements Serializable {

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
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Column(name="NOTE_ET", nullable=false, precision=3)
    private BigDecimal noteEt;
    @Column(name="ID_ENS", length=100)
    private String idEns;
    @Column(name="REMARQUE", length=2000)
    private String remarque;
    @Column(name="ABS_ET", length=20)
    private String absEt;
    @Column(name="DATE_EVAL")
    private LocalDateTime dateEval;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspEtudiantNoteGroupe() {
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
     * Access method for noteEt.
     *
     * @return the current value of noteEt
     */
    public BigDecimal getNoteEt() {
        return noteEt;
    }

    /**
     * Setter method for noteEt.
     *
     * @param aNoteEt the new value for noteEt
     */
    public void setNoteEt(BigDecimal aNoteEt) {
        noteEt = aNoteEt;
    }

    /**
     * Access method for idEns.
     *
     * @return the current value of idEns
     */
    public String getIdEns() {
        return idEns;
    }

    /**
     * Setter method for idEns.
     *
     * @param aIdEns the new value for idEns
     */
    public void setIdEns(String aIdEns) {
        idEns = aIdEns;
    }

    /**
     * Access method for remarque.
     *
     * @return the current value of remarque
     */
    public String getRemarque() {
        return remarque;
    }

    /**
     * Setter method for remarque.
     *
     * @param aRemarque the new value for remarque
     */
    public void setRemarque(String aRemarque) {
        remarque = aRemarque;
    }

    /**
     * Access method for absEt.
     *
     * @return the current value of absEt
     */
    public String getAbsEt() {
        return absEt;
    }

    /**
     * Setter method for absEt.
     *
     * @param aAbsEt the new value for absEt
     */
    public void setAbsEt(String aAbsEt) {
        absEt = aAbsEt;
    }

    /**
     * Access method for dateEval.
     *
     * @return the current value of dateEval
     */
    public LocalDateTime getDateEval() {
        return dateEval;
    }

    /**
     * Setter method for dateEval.
     *
     * @param aDateEval the new value for dateEval
     */
    public void setDateEval(LocalDateTime aDateEval) {
        dateEval = aDateEval;
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
