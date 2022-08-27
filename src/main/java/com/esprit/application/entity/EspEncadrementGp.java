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
public class EspEncadrementGp implements Serializable {

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

    @Column(name="ID_PROJET", nullable=false, length=10)
    private String idProjet;
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="TYPE_PROJET", nullable=false, length=2)
    private String typeProjet;
    @Column(name="ID_ENS", nullable=false, length=100)
    private String idEns;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Column(name="DATE_ENC")
    private LocalDateTime dateEnc;
    @Column(name="HEURE_DEB")
    private LocalDateTime heureDeb;
    @Column(name="HEURE_FIN")
    private LocalDateTime heureFin;
    @Column(name="DUREE")
    private LocalDateTime duree;
    @Column(name="AV_TECH", precision=3)
    private BigDecimal avTech;
    @Column(name="AV_ANG", precision=3)
    private BigDecimal avAng;
    @Column(name="AV_FR", precision=3)
    private BigDecimal avFr;
    @Column(name="AV_RAPPORT", precision=3)
    private BigDecimal avRapport;
    @Column(name="AV_CC", precision=3)
    private BigDecimal avCc;
    @Column(name="COMPORTEMENT", length=2)
    private String comportement;
    @Column(name="REMARQUE_OBS", length=2000)
    private String remarqueObs;
    @Column(name="TRAVAUX_DEMANDE", length=2000)
    private String travauxDemande;
    @Column(name="NOTE_GROUPE", precision=3)
    private BigDecimal noteGroupe;
    @Column(name="ID_GROUPE_PROJET", length=2000)
    private String idGroupeProjet;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspEncadrementGp() {
        super();
    }

    /**
     * Access method for idProjet.
     *
     * @return the current value of idProjet
     */
    public String getIdProjet() {
        return idProjet;
    }

    /**
     * Setter method for idProjet.
     *
     * @param aIdProjet the new value for idProjet
     */
    public void setIdProjet(String aIdProjet) {
        idProjet = aIdProjet;
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
     * Access method for typeProjet.
     *
     * @return the current value of typeProjet
     */
    public String getTypeProjet() {
        return typeProjet;
    }

    /**
     * Setter method for typeProjet.
     *
     * @param aTypeProjet the new value for typeProjet
     */
    public void setTypeProjet(String aTypeProjet) {
        typeProjet = aTypeProjet;
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
     * Access method for dateEnc.
     *
     * @return the current value of dateEnc
     */
    public LocalDateTime getDateEnc() {
        return dateEnc;
    }

    /**
     * Setter method for dateEnc.
     *
     * @param aDateEnc the new value for dateEnc
     */
    public void setDateEnc(LocalDateTime aDateEnc) {
        dateEnc = aDateEnc;
    }

    /**
     * Access method for heureDeb.
     *
     * @return the current value of heureDeb
     */
    public LocalDateTime getHeureDeb() {
        return heureDeb;
    }

    /**
     * Setter method for heureDeb.
     *
     * @param aHeureDeb the new value for heureDeb
     */
    public void setHeureDeb(LocalDateTime aHeureDeb) {
        heureDeb = aHeureDeb;
    }

    /**
     * Access method for heureFin.
     *
     * @return the current value of heureFin
     */
    public LocalDateTime getHeureFin() {
        return heureFin;
    }

    /**
     * Setter method for heureFin.
     *
     * @param aHeureFin the new value for heureFin
     */
    public void setHeureFin(LocalDateTime aHeureFin) {
        heureFin = aHeureFin;
    }

    /**
     * Access method for duree.
     *
     * @return the current value of duree
     */
    public LocalDateTime getDuree() {
        return duree;
    }

    /**
     * Setter method for duree.
     *
     * @param aDuree the new value for duree
     */
    public void setDuree(LocalDateTime aDuree) {
        duree = aDuree;
    }

    /**
     * Access method for avTech.
     *
     * @return the current value of avTech
     */
    public BigDecimal getAvTech() {
        return avTech;
    }

    /**
     * Setter method for avTech.
     *
     * @param aAvTech the new value for avTech
     */
    public void setAvTech(BigDecimal aAvTech) {
        avTech = aAvTech;
    }

    /**
     * Access method for avAng.
     *
     * @return the current value of avAng
     */
    public BigDecimal getAvAng() {
        return avAng;
    }

    /**
     * Setter method for avAng.
     *
     * @param aAvAng the new value for avAng
     */
    public void setAvAng(BigDecimal aAvAng) {
        avAng = aAvAng;
    }

    /**
     * Access method for avFr.
     *
     * @return the current value of avFr
     */
    public BigDecimal getAvFr() {
        return avFr;
    }

    /**
     * Setter method for avFr.
     *
     * @param aAvFr the new value for avFr
     */
    public void setAvFr(BigDecimal aAvFr) {
        avFr = aAvFr;
    }

    /**
     * Access method for avRapport.
     *
     * @return the current value of avRapport
     */
    public BigDecimal getAvRapport() {
        return avRapport;
    }

    /**
     * Setter method for avRapport.
     *
     * @param aAvRapport the new value for avRapport
     */
    public void setAvRapport(BigDecimal aAvRapport) {
        avRapport = aAvRapport;
    }

    /**
     * Access method for avCc.
     *
     * @return the current value of avCc
     */
    public BigDecimal getAvCc() {
        return avCc;
    }

    /**
     * Setter method for avCc.
     *
     * @param aAvCc the new value for avCc
     */
    public void setAvCc(BigDecimal aAvCc) {
        avCc = aAvCc;
    }

    /**
     * Access method for comportement.
     *
     * @return the current value of comportement
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter method for comportement.
     *
     * @param aComportement the new value for comportement
     */
    public void setComportement(String aComportement) {
        comportement = aComportement;
    }

    /**
     * Access method for remarqueObs.
     *
     * @return the current value of remarqueObs
     */
    public String getRemarqueObs() {
        return remarqueObs;
    }

    /**
     * Setter method for remarqueObs.
     *
     * @param aRemarqueObs the new value for remarqueObs
     */
    public void setRemarqueObs(String aRemarqueObs) {
        remarqueObs = aRemarqueObs;
    }

    /**
     * Access method for travauxDemande.
     *
     * @return the current value of travauxDemande
     */
    public String getTravauxDemande() {
        return travauxDemande;
    }

    /**
     * Setter method for travauxDemande.
     *
     * @param aTravauxDemande the new value for travauxDemande
     */
    public void setTravauxDemande(String aTravauxDemande) {
        travauxDemande = aTravauxDemande;
    }

    /**
     * Access method for noteGroupe.
     *
     * @return the current value of noteGroupe
     */
    public BigDecimal getNoteGroupe() {
        return noteGroupe;
    }

    /**
     * Setter method for noteGroupe.
     *
     * @param aNoteGroupe the new value for noteGroupe
     */
    public void setNoteGroupe(BigDecimal aNoteGroupe) {
        noteGroupe = aNoteGroupe;
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
