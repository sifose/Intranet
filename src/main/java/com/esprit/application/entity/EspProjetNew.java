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
@Table(name="ESP_PROJET_NEW", indexes={@Index(name="espProjetNewEspProjetNewX", columnList="ANNEE_DEB,ID_PROJET,TYPE_PROJET", unique=true)})
public class EspProjetNew implements Serializable {

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
    @Id
    @Column(name="ID_PROJET", nullable=false, length=10)
    private String idProjet;
    @Column(name="NOM_PROJET", length=100)
    private String nomProjet;
    @Column(name="CODE_MODULE", length=10)
    private String codeModule;
    @Column(name="TYPE_PROJET", nullable=false, length=2)
    private String typeProjet;
    @Column(name="DESCRIPTION_PROJET", length=1000)
    private String descriptionProjet;
    @Column(name="TECHNOLOGIES", length=2)
    private String technologies;
    @Column(name="METHODOLOGIE", length=2)
    private String methodologie;
    @Column(name="NIVEAU_ETUDIANT", precision=1)
    private BigDecimal niveauEtudiant;
    @Column(name="DUREE", precision=2)
    private BigDecimal duree;
    @Column(name="SEMESTRE", precision=1)
    private BigDecimal semestre;
    @Column(name="PERIODE", precision=1)
    private BigDecimal periode;
    @Column(name="ID_GROUPE_PROJET", length=100)
    private String idGroupeProjet;
    @Column(name="CODE_CL", length=20)
    private String codeCl;

    /** Default constructor. */
    public EspProjetNew() {
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
     * Access method for nomProjet.
     *
     * @return the current value of nomProjet
     */
    public String getNomProjet() {
        return nomProjet;
    }

    /**
     * Setter method for nomProjet.
     *
     * @param aNomProjet the new value for nomProjet
     */
    public void setNomProjet(String aNomProjet) {
        nomProjet = aNomProjet;
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
     * Access method for descriptionProjet.
     *
     * @return the current value of descriptionProjet
     */
    public String getDescriptionProjet() {
        return descriptionProjet;
    }

    /**
     * Setter method for descriptionProjet.
     *
     * @param aDescriptionProjet the new value for descriptionProjet
     */
    public void setDescriptionProjet(String aDescriptionProjet) {
        descriptionProjet = aDescriptionProjet;
    }

    /**
     * Access method for technologies.
     *
     * @return the current value of technologies
     */
    public String getTechnologies() {
        return technologies;
    }

    /**
     * Setter method for technologies.
     *
     * @param aTechnologies the new value for technologies
     */
    public void setTechnologies(String aTechnologies) {
        technologies = aTechnologies;
    }

    /**
     * Access method for methodologie.
     *
     * @return the current value of methodologie
     */
    public String getMethodologie() {
        return methodologie;
    }

    /**
     * Setter method for methodologie.
     *
     * @param aMethodologie the new value for methodologie
     */
    public void setMethodologie(String aMethodologie) {
        methodologie = aMethodologie;
    }

    /**
     * Access method for niveauEtudiant.
     *
     * @return the current value of niveauEtudiant
     */
    public BigDecimal getNiveauEtudiant() {
        return niveauEtudiant;
    }

    /**
     * Setter method for niveauEtudiant.
     *
     * @param aNiveauEtudiant the new value for niveauEtudiant
     */
    public void setNiveauEtudiant(BigDecimal aNiveauEtudiant) {
        niveauEtudiant = aNiveauEtudiant;
    }

    /**
     * Access method for duree.
     *
     * @return the current value of duree
     */
    public BigDecimal getDuree() {
        return duree;
    }

    /**
     * Setter method for duree.
     *
     * @param aDuree the new value for duree
     */
    public void setDuree(BigDecimal aDuree) {
        duree = aDuree;
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
     * Access method for periode.
     *
     * @return the current value of periode
     */
    public BigDecimal getPeriode() {
        return periode;
    }

    /**
     * Setter method for periode.
     *
     * @param aPeriode the new value for periode
     */
    public void setPeriode(BigDecimal aPeriode) {
        periode = aPeriode;
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

}
