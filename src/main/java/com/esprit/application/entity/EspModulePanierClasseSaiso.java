// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ESP_MODULE_PANIER_CLASSE_SAISO")
@IdClass(EspModulePanierClasseSaiso.EspModulePanierClasseSaisoId.class)
public class EspModulePanierClasseSaiso implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspModulePanierClasseSaisoId implements Serializable {
        EspModule espModule;
        java.lang.String codeCl;
        java.lang.String anneeDeb;
        java.math.BigDecimal numSemestre;
    }

    /** Primary key. */
    protected static final String PK = "EspModulePanierClasseSaisoPkModuleClasseSaison";

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

    @Column(name="NUM_PANIER", length=5)
    private String numPanier;
    @Id
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="ANNEE_FIN", length=4)
    private String anneeFin;
    @Column(name="DESCRIPTION", length=500)
    private String description;
    @Column(name="NB_HEURES", precision=5, scale=1)
    private BigDecimal nbHeures;
    @Column(name="COEF", precision=4, scale=2)
    private BigDecimal coef;
    @Id
    @Column(name="NUM_SEMESTRE", nullable=false, precision=38)
    private BigDecimal numSemestre;
    @Column(name="NUM_PERIODFE", precision=38)
    private BigDecimal numPeriodfe;
    @Column(name="DATE_DEBUT")
    private LocalDateTime dateDebut;
    @Column(name="DATE_FIN")
    private LocalDateTime dateFin;
    @Column(name="DATE_EXAMEN")
    private LocalDateTime dateExamen;
    @Column(name="DATE_RATTRAPAGE")
    private LocalDateTime dateRattrapage;
    @Column(name="NB_HORAIRE_REALISES", precision=38)
    private BigDecimal nbHoraireRealises;
    @Column(name="ACOMPTABILISER", length=1)
    private String acomptabiliser;
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="ID_ENS2", length=10)
    private String idEns2;
    @Column(name="NB_HEURES_ENS", precision=5, scale=1)
    private BigDecimal nbHeuresEns;
    @Column(name="NB_HEURES_ENS2", precision=5, scale=1)
    private BigDecimal nbHeuresEns2;
    @Column(name="SURVEILLANT", length=10)
    private String surveillant;
    @Column(name="HEURE_EXAM", length=5)
    private String heureExam;
    @Column(name="SALLE_EXAM", length=10)
    private String salleExam;
    @Column(name="SURVEILLANT2", length=10)
    private String surveillant2;
    @Column(name="SALLE_EXAM2", length=10)
    private String salleExam2;
    @Column(name="PERIODE", precision=38)
    private BigDecimal periode;
    @Column(name="NUMPROMOTIONCS", precision=4)
    private BigDecimal numpromotioncs;
    @Column(name="AP_CS", precision=1)
    private BigDecimal apCs;
    @Column(name="CHARGE_P1", precision=5, scale=1)
    private BigDecimal chargeP1;
    @Column(name="CHARGE_P2", precision=5, scale=1)
    private BigDecimal chargeP2;
    @Column(name="CHARGE_ENS1_P1", precision=5, scale=1)
    private BigDecimal chargeEns1P1;
    @Column(name="CHARGE_ENS1_P2", precision=5, scale=1)
    private BigDecimal chargeEns1P2;
    @Column(name="CHARGE_ENS2_P1", precision=5, scale=1)
    private BigDecimal chargeEns2P1;
    @Column(name="CHARGE_ENS2_P2", precision=5, scale=1)
    private BigDecimal chargeEns2P2;
    @Column(name="SEANCE_UNIQUE", length=1)
    private String seanceUnique;
    @Column(name="ID_ENS3", length=10)
    private String idEns3;
    @Column(name="ID_ENS4", length=10)
    private String idEns4;
    @Column(name="ID_ENS5", length=10)
    private String idEns5;
    @Column(name="CHARGE_ENS3_P1", precision=5, scale=1)
    private BigDecimal chargeEns3P1;
    @Column(name="CHARGE_ENS3_P2", precision=5, scale=1)
    private BigDecimal chargeEns3P2;
    @Column(name="CHARGE_ENS4_P1", precision=5, scale=1)
    private BigDecimal chargeEns4P1;
    @Column(name="CHARGE_ENS4_P2", precision=5, scale=1)
    private BigDecimal chargeEns4P2;
    @Column(name="CHARGE_ENS5_P1", precision=5, scale=1)
    private BigDecimal chargeEns5P1;
    @Column(name="CHARGE_ENS5_P2", precision=5, scale=1)
    private BigDecimal chargeEns5P2;
    @Column(name="CODE_UE", length=14)
    private String codeUe;
    @Column(name="NB_ECTS", precision=3)
    private BigDecimal nbEcts;
    @Column(name="TYPE_EPREUVE", length=2)
    private String typeEpreuve;
    @Column(name="CHARGEP1ADD", precision=19, scale=2)
    private BigDecimal chargep1Add;
    @Column(name="CHARGEP2ADD", precision=19, scale=2)
    private BigDecimal chargep2Add;
    @Column(name="CODE_PLAN", precision=19)
    private BigDecimal codePlan;
    @Column(name="NBHEURADD", precision=19, scale=2)
    private BigDecimal nbheuradd;
    @Column(name="SALLE", length=255)
    private String salle;
    @Column(name="EXISTE_CC", length=1)
    private String existeCc;
    @Column(name="EXISTE_TP", length=1)
    private String existeTp;
    @Column(name="CALCUL_RAT", length=2)
    private String calculRat;
    @Column(name="HEURE_RAT", length=5)
    private String heureRat;
    @Column(name="DATE_RAT")
    private LocalDateTime dateRat;
    @Column(name="DESIGNATION_NEW", length=50)
    private String designationNew;
    @Column(name="UTILISATEUR", length=20)
    private String utilisateur;
    @OneToMany(mappedBy="espModulePanierClasseSaiso")
    private Set<AffectationExamen> affectationExamen;
    
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_MODULE", nullable=false)
    private EspModule espModule;

    /** Default constructor. */
    public EspModulePanierClasseSaiso() {
        super();
    }

    /**
     * Access method for numPanier.
     *
     * @return the current value of numPanier
     */
    public String getNumPanier() {
        return numPanier;
    }

    /**
     * Setter method for numPanier.
     *
     * @param aNumPanier the new value for numPanier
     */
    public void setNumPanier(String aNumPanier) {
        numPanier = aNumPanier;
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
     * Access method for anneeFin.
     *
     * @return the current value of anneeFin
     */
    public String getAnneeFin() {
        return anneeFin;
    }

    /**
     * Setter method for anneeFin.
     *
     * @param aAnneeFin the new value for anneeFin
     */
    public void setAnneeFin(String aAnneeFin) {
        anneeFin = aAnneeFin;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
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
     * Access method for coef.
     *
     * @return the current value of coef
     */
    public BigDecimal getCoef() {
        return coef;
    }

    /**
     * Setter method for coef.
     *
     * @param aCoef the new value for coef
     */
    public void setCoef(BigDecimal aCoef) {
        coef = aCoef;
    }

    /**
     * Access method for numSemestre.
     *
     * @return the current value of numSemestre
     */
    public BigDecimal getNumSemestre() {
        return numSemestre;
    }

    /**
     * Setter method for numSemestre.
     *
     * @param aNumSemestre the new value for numSemestre
     */
    public void setNumSemestre(BigDecimal aNumSemestre) {
        numSemestre = aNumSemestre;
    }

    /**
     * Access method for numPeriodfe.
     *
     * @return the current value of numPeriodfe
     */
    public BigDecimal getNumPeriodfe() {
        return numPeriodfe;
    }

    /**
     * Setter method for numPeriodfe.
     *
     * @param aNumPeriodfe the new value for numPeriodfe
     */
    public void setNumPeriodfe(BigDecimal aNumPeriodfe) {
        numPeriodfe = aNumPeriodfe;
    }

    /**
     * Access method for dateDebut.
     *
     * @return the current value of dateDebut
     */
    public LocalDateTime getDateDebut() {
        return dateDebut;
    }

    /**
     * Setter method for dateDebut.
     *
     * @param aDateDebut the new value for dateDebut
     */
    public void setDateDebut(LocalDateTime aDateDebut) {
        dateDebut = aDateDebut;
    }

    /**
     * Access method for dateFin.
     *
     * @return the current value of dateFin
     */
    public LocalDateTime getDateFin() {
        return dateFin;
    }

    /**
     * Setter method for dateFin.
     *
     * @param aDateFin the new value for dateFin
     */
    public void setDateFin(LocalDateTime aDateFin) {
        dateFin = aDateFin;
    }

    /**
     * Access method for dateExamen.
     *
     * @return the current value of dateExamen
     */
    public LocalDateTime getDateExamen() {
        return dateExamen;
    }

    /**
     * Setter method for dateExamen.
     *
     * @param aDateExamen the new value for dateExamen
     */
    public void setDateExamen(LocalDateTime aDateExamen) {
        dateExamen = aDateExamen;
    }

    /**
     * Access method for dateRattrapage.
     *
     * @return the current value of dateRattrapage
     */
    public LocalDateTime getDateRattrapage() {
        return dateRattrapage;
    }

    /**
     * Setter method for dateRattrapage.
     *
     * @param aDateRattrapage the new value for dateRattrapage
     */
    public void setDateRattrapage(LocalDateTime aDateRattrapage) {
        dateRattrapage = aDateRattrapage;
    }

    /**
     * Access method for nbHoraireRealises.
     *
     * @return the current value of nbHoraireRealises
     */
    public BigDecimal getNbHoraireRealises() {
        return nbHoraireRealises;
    }

    /**
     * Setter method for nbHoraireRealises.
     *
     * @param aNbHoraireRealises the new value for nbHoraireRealises
     */
    public void setNbHoraireRealises(BigDecimal aNbHoraireRealises) {
        nbHoraireRealises = aNbHoraireRealises;
    }

    /**
     * Access method for acomptabiliser.
     *
     * @return the current value of acomptabiliser
     */
    public String getAcomptabiliser() {
        return acomptabiliser;
    }

    /**
     * Setter method for acomptabiliser.
     *
     * @param aAcomptabiliser the new value for acomptabiliser
     */
    public void setAcomptabiliser(String aAcomptabiliser) {
        acomptabiliser = aAcomptabiliser;
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
     * Access method for idEns2.
     *
     * @return the current value of idEns2
     */
    public String getIdEns2() {
        return idEns2;
    }

    /**
     * Setter method for idEns2.
     *
     * @param aIdEns2 the new value for idEns2
     */
    public void setIdEns2(String aIdEns2) {
        idEns2 = aIdEns2;
    }

    /**
     * Access method for nbHeuresEns.
     *
     * @return the current value of nbHeuresEns
     */
    public BigDecimal getNbHeuresEns() {
        return nbHeuresEns;
    }

    /**
     * Setter method for nbHeuresEns.
     *
     * @param aNbHeuresEns the new value for nbHeuresEns
     */
    public void setNbHeuresEns(BigDecimal aNbHeuresEns) {
        nbHeuresEns = aNbHeuresEns;
    }

    /**
     * Access method for nbHeuresEns2.
     *
     * @return the current value of nbHeuresEns2
     */
    public BigDecimal getNbHeuresEns2() {
        return nbHeuresEns2;
    }

    /**
     * Setter method for nbHeuresEns2.
     *
     * @param aNbHeuresEns2 the new value for nbHeuresEns2
     */
    public void setNbHeuresEns2(BigDecimal aNbHeuresEns2) {
        nbHeuresEns2 = aNbHeuresEns2;
    }

    /**
     * Access method for surveillant.
     *
     * @return the current value of surveillant
     */
    public String getSurveillant() {
        return surveillant;
    }

    /**
     * Setter method for surveillant.
     *
     * @param aSurveillant the new value for surveillant
     */
    public void setSurveillant(String aSurveillant) {
        surveillant = aSurveillant;
    }

    /**
     * Access method for heureExam.
     *
     * @return the current value of heureExam
     */
    public String getHeureExam() {
        return heureExam;
    }

    /**
     * Setter method for heureExam.
     *
     * @param aHeureExam the new value for heureExam
     */
    public void setHeureExam(String aHeureExam) {
        heureExam = aHeureExam;
    }

    /**
     * Access method for salleExam.
     *
     * @return the current value of salleExam
     */
    public String getSalleExam() {
        return salleExam;
    }

    /**
     * Setter method for salleExam.
     *
     * @param aSalleExam the new value for salleExam
     */
    public void setSalleExam(String aSalleExam) {
        salleExam = aSalleExam;
    }

    /**
     * Access method for surveillant2.
     *
     * @return the current value of surveillant2
     */
    public String getSurveillant2() {
        return surveillant2;
    }

    /**
     * Setter method for surveillant2.
     *
     * @param aSurveillant2 the new value for surveillant2
     */
    public void setSurveillant2(String aSurveillant2) {
        surveillant2 = aSurveillant2;
    }

    /**
     * Access method for salleExam2.
     *
     * @return the current value of salleExam2
     */
    public String getSalleExam2() {
        return salleExam2;
    }

    /**
     * Setter method for salleExam2.
     *
     * @param aSalleExam2 the new value for salleExam2
     */
    public void setSalleExam2(String aSalleExam2) {
        salleExam2 = aSalleExam2;
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
     * Access method for numpromotioncs.
     *
     * @return the current value of numpromotioncs
     */
    public BigDecimal getNumpromotioncs() {
        return numpromotioncs;
    }

    /**
     * Setter method for numpromotioncs.
     *
     * @param aNumpromotioncs the new value for numpromotioncs
     */
    public void setNumpromotioncs(BigDecimal aNumpromotioncs) {
        numpromotioncs = aNumpromotioncs;
    }

    /**
     * Access method for apCs.
     *
     * @return the current value of apCs
     */
    public BigDecimal getApCs() {
        return apCs;
    }

    /**
     * Setter method for apCs.
     *
     * @param aApCs the new value for apCs
     */
    public void setApCs(BigDecimal aApCs) {
        apCs = aApCs;
    }

    /**
     * Access method for chargeP1.
     *
     * @return the current value of chargeP1
     */
    public BigDecimal getChargeP1() {
        return chargeP1;
    }

    /**
     * Setter method for chargeP1.
     *
     * @param aChargeP1 the new value for chargeP1
     */
    public void setChargeP1(BigDecimal aChargeP1) {
        chargeP1 = aChargeP1;
    }

    /**
     * Access method for chargeP2.
     *
     * @return the current value of chargeP2
     */
    public BigDecimal getChargeP2() {
        return chargeP2;
    }

    /**
     * Setter method for chargeP2.
     *
     * @param aChargeP2 the new value for chargeP2
     */
    public void setChargeP2(BigDecimal aChargeP2) {
        chargeP2 = aChargeP2;
    }

    /**
     * Access method for chargeEns1P1.
     *
     * @return the current value of chargeEns1P1
     */
    public BigDecimal getChargeEns1P1() {
        return chargeEns1P1;
    }

    /**
     * Setter method for chargeEns1P1.
     *
     * @param aChargeEns1P1 the new value for chargeEns1P1
     */
    public void setChargeEns1P1(BigDecimal aChargeEns1P1) {
        chargeEns1P1 = aChargeEns1P1;
    }

    /**
     * Access method for chargeEns1P2.
     *
     * @return the current value of chargeEns1P2
     */
    public BigDecimal getChargeEns1P2() {
        return chargeEns1P2;
    }

    /**
     * Setter method for chargeEns1P2.
     *
     * @param aChargeEns1P2 the new value for chargeEns1P2
     */
    public void setChargeEns1P2(BigDecimal aChargeEns1P2) {
        chargeEns1P2 = aChargeEns1P2;
    }

    /**
     * Access method for chargeEns2P1.
     *
     * @return the current value of chargeEns2P1
     */
    public BigDecimal getChargeEns2P1() {
        return chargeEns2P1;
    }

    /**
     * Setter method for chargeEns2P1.
     *
     * @param aChargeEns2P1 the new value for chargeEns2P1
     */
    public void setChargeEns2P1(BigDecimal aChargeEns2P1) {
        chargeEns2P1 = aChargeEns2P1;
    }

    /**
     * Access method for chargeEns2P2.
     *
     * @return the current value of chargeEns2P2
     */
    public BigDecimal getChargeEns2P2() {
        return chargeEns2P2;
    }

    /**
     * Setter method for chargeEns2P2.
     *
     * @param aChargeEns2P2 the new value for chargeEns2P2
     */
    public void setChargeEns2P2(BigDecimal aChargeEns2P2) {
        chargeEns2P2 = aChargeEns2P2;
    }

    /**
     * Access method for seanceUnique.
     *
     * @return the current value of seanceUnique
     */
    public String getSeanceUnique() {
        return seanceUnique;
    }

    /**
     * Setter method for seanceUnique.
     *
     * @param aSeanceUnique the new value for seanceUnique
     */
    public void setSeanceUnique(String aSeanceUnique) {
        seanceUnique = aSeanceUnique;
    }

    /**
     * Access method for idEns3.
     *
     * @return the current value of idEns3
     */
    public String getIdEns3() {
        return idEns3;
    }

    /**
     * Setter method for idEns3.
     *
     * @param aIdEns3 the new value for idEns3
     */
    public void setIdEns3(String aIdEns3) {
        idEns3 = aIdEns3;
    }

    /**
     * Access method for idEns4.
     *
     * @return the current value of idEns4
     */
    public String getIdEns4() {
        return idEns4;
    }

    /**
     * Setter method for idEns4.
     *
     * @param aIdEns4 the new value for idEns4
     */
    public void setIdEns4(String aIdEns4) {
        idEns4 = aIdEns4;
    }

    /**
     * Access method for idEns5.
     *
     * @return the current value of idEns5
     */
    public String getIdEns5() {
        return idEns5;
    }

    /**
     * Setter method for idEns5.
     *
     * @param aIdEns5 the new value for idEns5
     */
    public void setIdEns5(String aIdEns5) {
        idEns5 = aIdEns5;
    }

    /**
     * Access method for chargeEns3P1.
     *
     * @return the current value of chargeEns3P1
     */
    public BigDecimal getChargeEns3P1() {
        return chargeEns3P1;
    }

    /**
     * Setter method for chargeEns3P1.
     *
     * @param aChargeEns3P1 the new value for chargeEns3P1
     */
    public void setChargeEns3P1(BigDecimal aChargeEns3P1) {
        chargeEns3P1 = aChargeEns3P1;
    }

    /**
     * Access method for chargeEns3P2.
     *
     * @return the current value of chargeEns3P2
     */
    public BigDecimal getChargeEns3P2() {
        return chargeEns3P2;
    }

    /**
     * Setter method for chargeEns3P2.
     *
     * @param aChargeEns3P2 the new value for chargeEns3P2
     */
    public void setChargeEns3P2(BigDecimal aChargeEns3P2) {
        chargeEns3P2 = aChargeEns3P2;
    }

    /**
     * Access method for chargeEns4P1.
     *
     * @return the current value of chargeEns4P1
     */
    public BigDecimal getChargeEns4P1() {
        return chargeEns4P1;
    }

    /**
     * Setter method for chargeEns4P1.
     *
     * @param aChargeEns4P1 the new value for chargeEns4P1
     */
    public void setChargeEns4P1(BigDecimal aChargeEns4P1) {
        chargeEns4P1 = aChargeEns4P1;
    }

    /**
     * Access method for chargeEns4P2.
     *
     * @return the current value of chargeEns4P2
     */
    public BigDecimal getChargeEns4P2() {
        return chargeEns4P2;
    }

    /**
     * Setter method for chargeEns4P2.
     *
     * @param aChargeEns4P2 the new value for chargeEns4P2
     */
    public void setChargeEns4P2(BigDecimal aChargeEns4P2) {
        chargeEns4P2 = aChargeEns4P2;
    }

    /**
     * Access method for chargeEns5P1.
     *
     * @return the current value of chargeEns5P1
     */
    public BigDecimal getChargeEns5P1() {
        return chargeEns5P1;
    }

    /**
     * Setter method for chargeEns5P1.
     *
     * @param aChargeEns5P1 the new value for chargeEns5P1
     */
    public void setChargeEns5P1(BigDecimal aChargeEns5P1) {
        chargeEns5P1 = aChargeEns5P1;
    }

    /**
     * Access method for chargeEns5P2.
     *
     * @return the current value of chargeEns5P2
     */
    public BigDecimal getChargeEns5P2() {
        return chargeEns5P2;
    }

    /**
     * Setter method for chargeEns5P2.
     *
     * @param aChargeEns5P2 the new value for chargeEns5P2
     */
    public void setChargeEns5P2(BigDecimal aChargeEns5P2) {
        chargeEns5P2 = aChargeEns5P2;
    }

    /**
     * Access method for codeUe.
     *
     * @return the current value of codeUe
     */
    public String getCodeUe() {
        return codeUe;
    }

    /**
     * Setter method for codeUe.
     *
     * @param aCodeUe the new value for codeUe
     */
    public void setCodeUe(String aCodeUe) {
        codeUe = aCodeUe;
    }

    /**
     * Access method for nbEcts.
     *
     * @return the current value of nbEcts
     */
    public BigDecimal getNbEcts() {
        return nbEcts;
    }

    /**
     * Setter method for nbEcts.
     *
     * @param aNbEcts the new value for nbEcts
     */
    public void setNbEcts(BigDecimal aNbEcts) {
        nbEcts = aNbEcts;
    }

    /**
     * Access method for typeEpreuve.
     *
     * @return the current value of typeEpreuve
     */
    public String getTypeEpreuve() {
        return typeEpreuve;
    }

    /**
     * Setter method for typeEpreuve.
     *
     * @param aTypeEpreuve the new value for typeEpreuve
     */
    public void setTypeEpreuve(String aTypeEpreuve) {
        typeEpreuve = aTypeEpreuve;
    }

    /**
     * Access method for chargep1Add.
     *
     * @return the current value of chargep1Add
     */
    public BigDecimal getChargep1Add() {
        return chargep1Add;
    }

    /**
     * Setter method for chargep1Add.
     *
     * @param aChargep1Add the new value for chargep1Add
     */
    public void setChargep1Add(BigDecimal aChargep1Add) {
        chargep1Add = aChargep1Add;
    }

    /**
     * Access method for chargep2Add.
     *
     * @return the current value of chargep2Add
     */
    public BigDecimal getChargep2Add() {
        return chargep2Add;
    }

    /**
     * Setter method for chargep2Add.
     *
     * @param aChargep2Add the new value for chargep2Add
     */
    public void setChargep2Add(BigDecimal aChargep2Add) {
        chargep2Add = aChargep2Add;
    }

    /**
     * Access method for codePlan.
     *
     * @return the current value of codePlan
     */
    public BigDecimal getCodePlan() {
        return codePlan;
    }

    /**
     * Setter method for codePlan.
     *
     * @param aCodePlan the new value for codePlan
     */
    public void setCodePlan(BigDecimal aCodePlan) {
        codePlan = aCodePlan;
    }

    /**
     * Access method for nbheuradd.
     *
     * @return the current value of nbheuradd
     */
    public BigDecimal getNbheuradd() {
        return nbheuradd;
    }

    /**
     * Setter method for nbheuradd.
     *
     * @param aNbheuradd the new value for nbheuradd
     */
    public void setNbheuradd(BigDecimal aNbheuradd) {
        nbheuradd = aNbheuradd;
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

    /**
     * Access method for existeCc.
     *
     * @return the current value of existeCc
     */
    public String getExisteCc() {
        return existeCc;
    }

    /**
     * Setter method for existeCc.
     *
     * @param aExisteCc the new value for existeCc
     */
    public void setExisteCc(String aExisteCc) {
        existeCc = aExisteCc;
    }

    /**
     * Access method for existeTp.
     *
     * @return the current value of existeTp
     */
    public String getExisteTp() {
        return existeTp;
    }

    /**
     * Setter method for existeTp.
     *
     * @param aExisteTp the new value for existeTp
     */
    public void setExisteTp(String aExisteTp) {
        existeTp = aExisteTp;
    }

    /**
     * Access method for calculRat.
     *
     * @return the current value of calculRat
     */
    public String getCalculRat() {
        return calculRat;
    }

    /**
     * Setter method for calculRat.
     *
     * @param aCalculRat the new value for calculRat
     */
    public void setCalculRat(String aCalculRat) {
        calculRat = aCalculRat;
    }

    /**
     * Access method for heureRat.
     *
     * @return the current value of heureRat
     */
    public String getHeureRat() {
        return heureRat;
    }

    /**
     * Setter method for heureRat.
     *
     * @param aHeureRat the new value for heureRat
     */
    public void setHeureRat(String aHeureRat) {
        heureRat = aHeureRat;
    }

    /**
     * Access method for dateRat.
     *
     * @return the current value of dateRat
     */
    public LocalDateTime getDateRat() {
        return dateRat;
    }

    /**
     * Setter method for dateRat.
     *
     * @param aDateRat the new value for dateRat
     */
    public void setDateRat(LocalDateTime aDateRat) {
        dateRat = aDateRat;
    }

    /**
     * Access method for designationNew.
     *
     * @return the current value of designationNew
     */
    public String getDesignationNew() {
        return designationNew;
    }

    /**
     * Setter method for designationNew.
     *
     * @param aDesignationNew the new value for designationNew
     */
    public void setDesignationNew(String aDesignationNew) {
        designationNew = aDesignationNew;
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
     * Access method for affectationExamen.
     *
     * @return the current value of affectationExamen
     */
    public Set<AffectationExamen> getAffectationExamen() {
        return affectationExamen;
    }

    /**
     * Setter method for affectationExamen.
     *
     * @param aAffectationExamen the new value for affectationExamen
     */
    public void setAffectationExamen(Set<AffectationExamen> aAffectationExamen) {
        affectationExamen = aAffectationExamen;
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

    /** Temporary value holder for group key fragment espModuleCodeModule */
    private transient String tempEspModuleCodeModule;

    /**
     * Gets the key fragment codeModule for member espModule.
     * If this.espModule is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspModuleCodeModule.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspModule
     */
    public String getEspModuleCodeModule() {
        return (getEspModule() == null ? tempEspModuleCodeModule : getEspModule().getCodeModule());
    }

    /**
     * Sets the key fragment codeModule from member espModule.
     * If this.espModule is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspModuleCodeModule.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeModule New value for the key fragment
     * @see EspModule
     */
    public void setEspModuleCodeModule(String aCodeModule) {
        if (getEspModule() == null) {
            tempEspModuleCodeModule = aCodeModule;
        } else {
            getEspModule().setCodeModule(aCodeModule);
        }
    }

    /**
     * Compares the key for this instance with another EspModulePanierClasseSaiso.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspModulePanierClasseSaiso and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspModulePanierClasseSaiso)) {
            return false;
        }
        EspModulePanierClasseSaiso that = (EspModulePanierClasseSaiso) other;
        Object myEspModuleCodeModule = this.getEspModuleCodeModule();
        Object yourEspModuleCodeModule = that.getEspModuleCodeModule();
        if (myEspModuleCodeModule==null ? yourEspModuleCodeModule!=null : !myEspModuleCodeModule.equals(yourEspModuleCodeModule)) {
            return false;
        }
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myNumSemestre = this.getNumSemestre();
        Object yourNumSemestre = that.getNumSemestre();
        if (myNumSemestre==null ? yourNumSemestre!=null : !myNumSemestre.equals(yourNumSemestre)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspModulePanierClasseSaiso.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspModulePanierClasseSaiso)) return false;
        return this.equalKeys(other) && ((EspModulePanierClasseSaiso)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        if (getEspModuleCodeModule() == null) {
            i = 0;
        } else {
            i = getEspModuleCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getNumSemestre() == null) {
            i = 0;
        } else {
            i = getNumSemestre().hashCode();
        }
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EspModulePanierClasseSaiso |");
        sb.append(" espModuleCodeModule=").append(getEspModuleCodeModule());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" numSemestre=").append(getNumSemestre());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("espModuleCodeModule", getEspModuleCodeModule());
        ret.put("codeCl", getCodeCl());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("numSemestre", getNumSemestre());
        return ret;
    }

}
