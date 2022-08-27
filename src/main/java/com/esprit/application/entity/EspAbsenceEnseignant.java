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
@Table(name="ESP_ABSENCE_ENSEIGNANT", indexes={@Index(name="espAbsenceEnseignantPkAbsenceEns", columnList="ID_ENS,CODE_MODULE,ANNEE_DEB,CODE_CL,DATE", unique=true)})
public class EspAbsenceEnseignant implements Serializable {

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
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;
    @Column(name="DATE", nullable=false)
    private LocalDateTime date;
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Column(name="NUM_SCEANCE", nullable=false, precision=1)
    private BigDecimal numSceance;
    @Column(name="MOTIF", nullable=false, length=300)
    private String motif;
    @Column(name="NB_HEURES", precision=2)
    private BigDecimal nbHeures;
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="TYPE_ABS", length=1)
    private String typeAbs;
    @Column(name="CODE_MOTIF", length=2)
    private String codeMotif;
    @Column(name="NB_MINUTES", precision=2)
    private BigDecimal nbMinutes;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Column(name="SEMESTRE", precision=1)
    private BigDecimal semestre;
    @Column(name="OBSERVATION", length=500)
    private String observation;
    @Column(name="IDABSENS", nullable=false, precision=19)
    private BigDecimal idabsens;
    @Column(name="DATEABSENS")
    private LocalDateTime dateabsens;
    @Column(name="IDENS", length=255)
    private String idens;
    @Column(name="USERID", nullable=false, precision=19)
    private BigDecimal userid;
    @Column(name="EMPLOI", precision=19)
    private BigDecimal emploi;
    @ManyToOne(optional=false)
    @JoinColumn(name="CODE_MODULE", nullable=false)
    private EspModule espModule;

    /** Default constructor. */
    public EspAbsenceEnseignant() {
        super();
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
     * Access method for date.
     *
     * @return the current value of date
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * Setter method for date.
     *
     * @param aDate the new value for date
     */
    public void setDate(LocalDateTime aDate) {
        date = aDate;
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
     * Access method for numSceance.
     *
     * @return the current value of numSceance
     */
    public BigDecimal getNumSceance() {
        return numSceance;
    }

    /**
     * Setter method for numSceance.
     *
     * @param aNumSceance the new value for numSceance
     */
    public void setNumSceance(BigDecimal aNumSceance) {
        numSceance = aNumSceance;
    }

    /**
     * Access method for motif.
     *
     * @return the current value of motif
     */
    public String getMotif() {
        return motif;
    }

    /**
     * Setter method for motif.
     *
     * @param aMotif the new value for motif
     */
    public void setMotif(String aMotif) {
        motif = aMotif;
    }

    /**
     * Access method for nbHeures.
     *
     * @return the current value of nbHeures
     */
    public BigDecimal getNbHeures() {
        return nbHeures;
    }

    /**
     * Setter method for nbHeures.
     *
     * @param aNbHeures the new value for nbHeures
     */
    public void setNbHeures(BigDecimal aNbHeures) {
        nbHeures = aNbHeures;
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
     * Access method for typeAbs.
     *
     * @return the current value of typeAbs
     */
    public String getTypeAbs() {
        return typeAbs;
    }

    /**
     * Setter method for typeAbs.
     *
     * @param aTypeAbs the new value for typeAbs
     */
    public void setTypeAbs(String aTypeAbs) {
        typeAbs = aTypeAbs;
    }

    /**
     * Access method for codeMotif.
     *
     * @return the current value of codeMotif
     */
    public String getCodeMotif() {
        return codeMotif;
    }

    /**
     * Setter method for codeMotif.
     *
     * @param aCodeMotif the new value for codeMotif
     */
    public void setCodeMotif(String aCodeMotif) {
        codeMotif = aCodeMotif;
    }

    /**
     * Access method for nbMinutes.
     *
     * @return the current value of nbMinutes
     */
    public BigDecimal getNbMinutes() {
        return nbMinutes;
    }

    /**
     * Setter method for nbMinutes.
     *
     * @param aNbMinutes the new value for nbMinutes
     */
    public void setNbMinutes(BigDecimal aNbMinutes) {
        nbMinutes = aNbMinutes;
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
     * Access method for idabsens.
     *
     * @return the current value of idabsens
     */
    public BigDecimal getIdabsens() {
        return idabsens;
    }

    /**
     * Setter method for idabsens.
     *
     * @param aIdabsens the new value for idabsens
     */
    public void setIdabsens(BigDecimal aIdabsens) {
        idabsens = aIdabsens;
    }

    /**
     * Access method for dateabsens.
     *
     * @return the current value of dateabsens
     */
    public LocalDateTime getDateabsens() {
        return dateabsens;
    }

    /**
     * Setter method for dateabsens.
     *
     * @param aDateabsens the new value for dateabsens
     */
    public void setDateabsens(LocalDateTime aDateabsens) {
        dateabsens = aDateabsens;
    }

    /**
     * Access method for idens.
     *
     * @return the current value of idens
     */
    public String getIdens() {
        return idens;
    }

    /**
     * Setter method for idens.
     *
     * @param aIdens the new value for idens
     */
    public void setIdens(String aIdens) {
        idens = aIdens;
    }

    /**
     * Access method for userid.
     *
     * @return the current value of userid
     */
    public BigDecimal getUserid() {
        return userid;
    }

    /**
     * Setter method for userid.
     *
     * @param aUserid the new value for userid
     */
    public void setUserid(BigDecimal aUserid) {
        userid = aUserid;
    }

    /**
     * Access method for emploi.
     *
     * @return the current value of emploi
     */
    public BigDecimal getEmploi() {
        return emploi;
    }

    /**
     * Setter method for emploi.
     *
     * @param aEmploi the new value for emploi
     */
    public void setEmploi(BigDecimal aEmploi) {
        emploi = aEmploi;
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

}
