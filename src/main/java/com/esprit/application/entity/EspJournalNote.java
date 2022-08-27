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
public class EspJournalNote implements Serializable {

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

    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Column(name="CODE_MODULE", nullable=false, length=10)
    private String codeModule;
    @Column(name="SEMESTRE", precision=1)
    private BigDecimal semestre;
    @Column(name="ID_ET", length=10)
    private String idEt;
    @Column(name="TYPE_OP", length=1)
    private String typeOp;
    @Column(name="DATE_OP")
    private LocalDateTime dateOp;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Column(name="OLD_NOTE_CC", precision=5, scale=2)
    private BigDecimal oldNoteCc;
    @Column(name="NEW_NOTE_CC", precision=5, scale=2)
    private BigDecimal newNoteCc;
    @Column(name="OLD_NOTE_TP", precision=5, scale=2)
    private BigDecimal oldNoteTp;
    @Column(name="NEW_NOTE_TP", precision=5, scale=2)
    private BigDecimal newNoteTp;
    @Column(name="OLD_NOTE_EXAM", precision=5, scale=2)
    private BigDecimal oldNoteExam;
    @Column(name="NEW_NOTE_EXAM", precision=5, scale=2)
    private BigDecimal newNoteExam;
    @Column(name="IP_ADDRESS", length=20)
    private String ipAddress;
    @Column(name="NOM_MACHINE", length=30)
    private String nomMachine;
    @Column(name="TYPE_NOTE", length=1)
    private String typeNote;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspJournalNote() {
        super();
    }

    /**
     * Access method for anneeDeb.
     *
     * @return the current value of anneeDeb
     */
    public String getAnneeDeb() {
        return anneeDeb;
    }

    /**
     * Setter method for anneeDeb.
     *
     * @param aAnneeDeb the new value for anneeDeb
     */
    public void setAnneeDeb(String aAnneeDeb) {
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
     * Access method for codeModule.
     *
     * @return the current value of codeModule
     */
    public String getCodeModule() {
        return codeModule;
    }

    /**
     * Setter method for codeModule.
     *
     * @param aCodeModule the new value for codeModule
     */
    public void setCodeModule(String aCodeModule) {
        codeModule = aCodeModule;
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
     * Access method for typeOp.
     *
     * @return the current value of typeOp
     */
    public String getTypeOp() {
        return typeOp;
    }

    /**
     * Setter method for typeOp.
     *
     * @param aTypeOp the new value for typeOp
     */
    public void setTypeOp(String aTypeOp) {
        typeOp = aTypeOp;
    }

    /**
     * Access method for dateOp.
     *
     * @return the current value of dateOp
     */
    public LocalDateTime getDateOp() {
        return dateOp;
    }

    /**
     * Setter method for dateOp.
     *
     * @param aDateOp the new value for dateOp
     */
    public void setDateOp(LocalDateTime aDateOp) {
        dateOp = aDateOp;
    }

    /**
     * Access method for utilisateur.
     *
     * @return the current value of utilisateur
     */
    public String getUtilisateur() {
        return utilisateur;
    }

    /**
     * Setter method for utilisateur.
     *
     * @param aUtilisateur the new value for utilisateur
     */
    public void setUtilisateur(String aUtilisateur) {
        utilisateur = aUtilisateur;
    }

    /**
     * Access method for oldNoteCc.
     *
     * @return the current value of oldNoteCc
     */
    public BigDecimal getOldNoteCc() {
        return oldNoteCc;
    }

    /**
     * Setter method for oldNoteCc.
     *
     * @param aOldNoteCc the new value for oldNoteCc
     */
    public void setOldNoteCc(BigDecimal aOldNoteCc) {
        oldNoteCc = aOldNoteCc;
    }

    /**
     * Access method for newNoteCc.
     *
     * @return the current value of newNoteCc
     */
    public BigDecimal getNewNoteCc() {
        return newNoteCc;
    }

    /**
     * Setter method for newNoteCc.
     *
     * @param aNewNoteCc the new value for newNoteCc
     */
    public void setNewNoteCc(BigDecimal aNewNoteCc) {
        newNoteCc = aNewNoteCc;
    }

    /**
     * Access method for oldNoteTp.
     *
     * @return the current value of oldNoteTp
     */
    public BigDecimal getOldNoteTp() {
        return oldNoteTp;
    }

    /**
     * Setter method for oldNoteTp.
     *
     * @param aOldNoteTp the new value for oldNoteTp
     */
    public void setOldNoteTp(BigDecimal aOldNoteTp) {
        oldNoteTp = aOldNoteTp;
    }

    /**
     * Access method for newNoteTp.
     *
     * @return the current value of newNoteTp
     */
    public BigDecimal getNewNoteTp() {
        return newNoteTp;
    }

    /**
     * Setter method for newNoteTp.
     *
     * @param aNewNoteTp the new value for newNoteTp
     */
    public void setNewNoteTp(BigDecimal aNewNoteTp) {
        newNoteTp = aNewNoteTp;
    }

    /**
     * Access method for oldNoteExam.
     *
     * @return the current value of oldNoteExam
     */
    public BigDecimal getOldNoteExam() {
        return oldNoteExam;
    }

    /**
     * Setter method for oldNoteExam.
     *
     * @param aOldNoteExam the new value for oldNoteExam
     */
    public void setOldNoteExam(BigDecimal aOldNoteExam) {
        oldNoteExam = aOldNoteExam;
    }

    /**
     * Access method for newNoteExam.
     *
     * @return the current value of newNoteExam
     */
    public BigDecimal getNewNoteExam() {
        return newNoteExam;
    }

    /**
     * Setter method for newNoteExam.
     *
     * @param aNewNoteExam the new value for newNoteExam
     */
    public void setNewNoteExam(BigDecimal aNewNoteExam) {
        newNoteExam = aNewNoteExam;
    }

    /**
     * Access method for ipAddress.
     *
     * @return the current value of ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Setter method for ipAddress.
     *
     * @param aIpAddress the new value for ipAddress
     */
    public void setIpAddress(String aIpAddress) {
        ipAddress = aIpAddress;
    }

    /**
     * Access method for nomMachine.
     *
     * @return the current value of nomMachine
     */
    public String getNomMachine() {
        return nomMachine;
    }

    /**
     * Setter method for nomMachine.
     *
     * @param aNomMachine the new value for nomMachine
     */
    public void setNomMachine(String aNomMachine) {
        nomMachine = aNomMachine;
    }

    /**
     * Access method for typeNote.
     *
     * @return the current value of typeNote
     */
    public String getTypeNote() {
        return typeNote;
    }

    /**
     * Setter method for typeNote.
     *
     * @param aTypeNote the new value for typeNote
     */
    public void setTypeNote(String aTypeNote) {
        typeNote = aTypeNote;
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
