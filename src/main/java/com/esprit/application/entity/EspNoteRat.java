// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="ESP_NOTE_RAT", indexes={@Index(name="espNoteRatPkNoteRat", columnList="ANNEE_DEB,CODE_MODULE,DATE_DEROULEMENT,ID_ET,TYPE_RAT", unique=true)})
public class EspNoteRat implements Serializable {

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
    @Column(name="DATE_DEROULEMENT")
    private LocalDateTime dateDeroulement;
    @Id
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Column(name="SEMESTRE", precision=1)
    private BigDecimal semestre;
    @Column(name="NOTE", precision=5, scale=2)
    private BigDecimal note;
    @Column(name="NB_HEURE", precision=2)
    private BigDecimal nbHeure;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Column(name="OBSERVATION", length=300)
    private String observation;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="TYPE_RAT", length=1)
    private String typeRat;
    @Column(name="ANNEE_CREDIT", length=4)
    private String anneeCredit;
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;
    @ManyToOne(optional=false)
    @JoinColumn(name="ID_ET", nullable=false)
    private EspEtudiant espEtudiant;
    @ManyToOne(optional=false)
    @JoinColumn(name="CODE_MODULE", nullable=false)
    private EspModule espModule;

    /** Default constructor. */
    public EspNoteRat() {
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
     * Access method for dateDeroulement.
     *
     * @return the current value of dateDeroulement
     */
    public LocalDateTime getDateDeroulement() {
        return dateDeroulement;
    }

    /**
     * Setter method for dateDeroulement.
     *
     * @param aDateDeroulement the new value for dateDeroulement
     */
    public void setDateDeroulement(LocalDateTime aDateDeroulement) {
        dateDeroulement = aDateDeroulement;
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
     * Access method for note.
     *
     * @return the current value of note
     */
    public BigDecimal getNote() {
        return note;
    }

    /**
     * Setter method for note.
     *
     * @param aNote the new value for note
     */
    public void setNote(BigDecimal aNote) {
        note = aNote;
    }

    /**
     * Access method for nbHeure.
     *
     * @return the current value of nbHeure
     */
    public BigDecimal getNbHeure() {
        return nbHeure;
    }

    /**
     * Setter method for nbHeure.
     *
     * @param aNbHeure the new value for nbHeure
     */
    public void setNbHeure(BigDecimal aNbHeure) {
        nbHeure = aNbHeure;
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
     * Access method for observation.
     *
     * @return the current value of observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * Setter method for observation.
     *
     * @param aObservation the new value for observation
     */
    public void setObservation(String aObservation) {
        observation = aObservation;
    }

    /**
     * Access method for dateSaisie.
     *
     * @return the current value of dateSaisie
     */
    public LocalDateTime getDateSaisie() {
        return dateSaisie;
    }

    /**
     * Setter method for dateSaisie.
     *
     * @param aDateSaisie the new value for dateSaisie
     */
    public void setDateSaisie(LocalDateTime aDateSaisie) {
        dateSaisie = aDateSaisie;
    }

    /**
     * Access method for typeRat.
     *
     * @return the current value of typeRat
     */
    public String getTypeRat() {
        return typeRat;
    }

    /**
     * Setter method for typeRat.
     *
     * @param aTypeRat the new value for typeRat
     */
    public void setTypeRat(String aTypeRat) {
        typeRat = aTypeRat;
    }

    /**
     * Access method for anneeCredit.
     *
     * @return the current value of anneeCredit
     */
    public String getAnneeCredit() {
        return anneeCredit;
    }

    /**
     * Setter method for anneeCredit.
     *
     * @param aAnneeCredit the new value for anneeCredit
     */
    public void setAnneeCredit(String aAnneeCredit) {
        anneeCredit = aAnneeCredit;
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

    /**
     * Access method for espEtudiant.
     *
     * @return the current value of espEtudiant
     */
    public EspEtudiant getEspEtudiant() {
        return espEtudiant;
    }

    /**
     * Setter method for espEtudiant.
     *
     * @param aEspEtudiant the new value for espEtudiant
     */
    public void setEspEtudiant(EspEtudiant aEspEtudiant) {
        espEtudiant = aEspEtudiant;
    }

    /**
     * Access method for espModule.
     *
     * @return the current value of espModule
     */
    public EspModule getEspModule() {
        return espModule;
    }

    /**
     * Setter method for espModule.
     *
     * @param aEspModule the new value for espModule
     */
    public void setEspModule(EspModule aEspModule) {
        espModule = aEspModule;
    }

    /**
     * Gets the group fragment codeModule for member espModule.
     *
     * @return Current value of the group fragment
     * @see EspModule
     */
    public String getEspModuleCodeModule() {
        return (getEspModule() == null ? null : getEspModule().getCodeModule());
    }

    /**
     * Sets the group fragment codeModule from member espModule.
     *
     * @param aCodeModule New value for the group fragment
     * @see EspModule
     */
    public void setEspModuleCodeModule(String aCodeModule) {
        if (getEspModule() != null) {
            getEspModule().setCodeModule(aCodeModule);
        }
    }

    /**
     * Gets the group fragment idEt for member espEtudiant.
     *
     * @return Current value of the group fragment
     * @see EspEtudiant
     */
    public String getEspEtudiantIdEt() {
        return (getEspEtudiant() == null ? null : getEspEtudiant().getIdEt());
    }

    /**
     * Sets the group fragment idEt from member espEtudiant.
     *
     * @param aIdEt New value for the group fragment
     * @see EspEtudiant
     */
    public void setEspEtudiantIdEt(String aIdEt) {
        if (getEspEtudiant() != null) {
            getEspEtudiant().setIdEt(aIdEt);
        }
    }

}
