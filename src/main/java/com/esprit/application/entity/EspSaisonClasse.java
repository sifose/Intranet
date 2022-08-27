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

@Entity(name="ESP_SAISON_CLASSE")
@IdClass(EspSaisonClasse.EspSaisonClasseId.class)
public class EspSaisonClasse implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspSaisonClasseId implements Serializable {
        EspSaisonUniversitaire espSaisonUniversitaire;
        java.math.BigDecimal semestre;
        Classe classe;
    }

    /** Primary key. */
    protected static final String PK = "EspSaisonClassePkEspSaisonClasse";

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

    @Column(name="ANNEE_FIN", length=4)
    private String anneeFin;
    @Column(name="DATE_DEMARRAGE")
    private LocalDateTime dateDemarrage;
    @Column(name="DESCRIPTION", length=300)
    private String description;
    @Column(name="NB_ETUDIANT", precision=2)
    private BigDecimal nbEtudiant;
    @Column(name="SALLE_PRINCIPALE", length=10)
    private String sallePrincipale;
    @Column(name="SALLE_SECONDAIRE_1", length=10)
    private String salleSecondaire1;
    @Column(name="SALLE_SECONDAIRE_2", length=10)
    private String salleSecondaire2;
    @Column(name="NATURE", length=1)
    private String nature;
    @Column(name="TYPE_CLASSE", length=2)
    private String typeClasse;
    @Column(name="NB_SEANCE", precision=1)
    private BigDecimal nbSeance;
    @Column(name="CLASSE_ENTREPRISE", length=1)
    private String classeEntreprise;
    @Id
    @Column(name="SEMESTRE", nullable=false, precision=1)
    private BigDecimal semestre;
    @Column(name="CL_ECLATE", length=1)
    private String clEclate;
    @Column(name="DATE_ECLATEMENT")
    private LocalDateTime dateEclatement;
    @Column(name="NUMPROMOTIONCS", precision=4)
    private BigDecimal numpromotioncs;
    @Column(name="CLASSE_S2", length=1)
    private String classeS2;
    @Column(name="CODE_CLS1", length=10)
    private String codeCls1;
    @Column(name="CL_AVEC_DISPENSE", length=1)
    private String clAvecDispense;
    @Column(name="PV_SP_SAVED", length=1)
    private String pvSpSaved;
    @Column(name="PV_SR_SAVED", length=1)
    private String pvSrSaved;
    @Column(name="NIVEAU_ACCES", precision=1)
    private BigDecimal niveauAcces;
    @Column(name="FILIERE", length=2)
    private String filiere;
    @Column(name="TYPE_PV", length=1)
    private String typePv;
   // @OneToMany(mappedBy="espSaisonClasse")
   // private Set<EspInscription> espInscription;
    @OneToMany(mappedBy="espSaisonClasse")
    private Set<EspRemarqueAbsence> espRemarqueAbsence;
    
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_CL", nullable=false)
    private Classe classe;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ANNEE_DEB", nullable=false)
    private EspSaisonUniversitaire espSaisonUniversitaire;

    /** Default constructor. */
    public EspSaisonClasse() {
        super();
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
     * Access method for dateDemarrage.
     *
     * @return the current value of dateDemarrage
     */
    public LocalDateTime getDateDemarrage() {
        return dateDemarrage;
    }

    /**
     * Setter method for dateDemarrage.
     *
     * @param aDateDemarrage the new value for dateDemarrage
     */
    public void setDateDemarrage(LocalDateTime aDateDemarrage) {
        dateDemarrage = aDateDemarrage;
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
     * Access method for nbEtudiant.
     *
     * @return the current value of nbEtudiant
     */
    public BigDecimal getNbEtudiant() {
        return nbEtudiant;
    }

    /**
     * Setter method for nbEtudiant.
     *
     * @param aNbEtudiant the new value for nbEtudiant
     */
    public void setNbEtudiant(BigDecimal aNbEtudiant) {
        nbEtudiant = aNbEtudiant;
    }

    /**
     * Access method for sallePrincipale.
     *
     * @return the current value of sallePrincipale
     */
    public String getSallePrincipale() {
        return sallePrincipale;
    }

    /**
     * Setter method for sallePrincipale.
     *
     * @param aSallePrincipale the new value for sallePrincipale
     */
    public void setSallePrincipale(String aSallePrincipale) {
        sallePrincipale = aSallePrincipale;
    }

    /**
     * Access method for salleSecondaire1.
     *
     * @return the current value of salleSecondaire1
     */
    public String getSalleSecondaire1() {
        return salleSecondaire1;
    }

    /**
     * Setter method for salleSecondaire1.
     *
     * @param aSalleSecondaire1 the new value for salleSecondaire1
     */
    public void setSalleSecondaire1(String aSalleSecondaire1) {
        salleSecondaire1 = aSalleSecondaire1;
    }

    /**
     * Access method for salleSecondaire2.
     *
     * @return the current value of salleSecondaire2
     */
    public String getSalleSecondaire2() {
        return salleSecondaire2;
    }

    /**
     * Setter method for salleSecondaire2.
     *
     * @param aSalleSecondaire2 the new value for salleSecondaire2
     */
    public void setSalleSecondaire2(String aSalleSecondaire2) {
        salleSecondaire2 = aSalleSecondaire2;
    }

    /**
     * Access method for nature.
     *
     * @return the current value of nature
     */
    public String getNature() {
        return nature;
    }

    /**
     * Setter method for nature.
     *
     * @param aNature the new value for nature
     */
    public void setNature(String aNature) {
        nature = aNature;
    }

    /**
     * Access method for typeClasse.
     *
     * @return the current value of typeClasse
     */
    public String getTypeClasse() {
        return typeClasse;
    }

    /**
     * Setter method for typeClasse.
     *
     * @param aTypeClasse the new value for typeClasse
     */
    public void setTypeClasse(String aTypeClasse) {
        typeClasse = aTypeClasse;
    }

    /**
     * Access method for nbSeance.
     *
     * @return the current value of nbSeance
     */
    public BigDecimal getNbSeance() {
        return nbSeance;
    }

    /**
     * Setter method for nbSeance.
     *
     * @param aNbSeance the new value for nbSeance
     */
    public void setNbSeance(BigDecimal aNbSeance) {
        nbSeance = aNbSeance;
    }

    /**
     * Access method for classeEntreprise.
     *
     * @return the current value of classeEntreprise
     */
    public String getClasseEntreprise() {
        return classeEntreprise;
    }

    /**
     * Setter method for classeEntreprise.
     *
     * @param aClasseEntreprise the new value for classeEntreprise
     */
    public void setClasseEntreprise(String aClasseEntreprise) {
        classeEntreprise = aClasseEntreprise;
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
     * Access method for clEclate.
     *
     * @return the current value of clEclate
     */
    public String getClEclate() {
        return clEclate;
    }

    /**
     * Setter method for clEclate.
     *
     * @param aClEclate the new value for clEclate
     */
    public void setClEclate(String aClEclate) {
        clEclate = aClEclate;
    }

    /**
     * Access method for dateEclatement.
     *
     * @return the current value of dateEclatement
     */
    public LocalDateTime getDateEclatement() {
        return dateEclatement;
    }

    /**
     * Setter method for dateEclatement.
     *
     * @param aDateEclatement the new value for dateEclatement
     */
    public void setDateEclatement(LocalDateTime aDateEclatement) {
        dateEclatement = aDateEclatement;
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
     * Access method for classeS2.
     *
     * @return the current value of classeS2
     */
    public String getClasseS2() {
        return classeS2;
    }

    /**
     * Setter method for classeS2.
     *
     * @param aClasseS2 the new value for classeS2
     */
    public void setClasseS2(String aClasseS2) {
        classeS2 = aClasseS2;
    }

    /**
     * Access method for codeCls1.
     *
     * @return the current value of codeCls1
     */
    public String getCodeCls1() {
        return codeCls1;
    }

    /**
     * Setter method for codeCls1.
     *
     * @param aCodeCls1 the new value for codeCls1
     */
    public void setCodeCls1(String aCodeCls1) {
        codeCls1 = aCodeCls1;
    }

    /**
     * Access method for clAvecDispense.
     *
     * @return the current value of clAvecDispense
     */
    public String getClAvecDispense() {
        return clAvecDispense;
    }

    /**
     * Setter method for clAvecDispense.
     *
     * @param aClAvecDispense the new value for clAvecDispense
     */
    public void setClAvecDispense(String aClAvecDispense) {
        clAvecDispense = aClAvecDispense;
    }

    /**
     * Access method for pvSpSaved.
     *
     * @return the current value of pvSpSaved
     */
    public String getPvSpSaved() {
        return pvSpSaved;
    }

    /**
     * Setter method for pvSpSaved.
     *
     * @param aPvSpSaved the new value for pvSpSaved
     */
    public void setPvSpSaved(String aPvSpSaved) {
        pvSpSaved = aPvSpSaved;
    }

    /**
     * Access method for pvSrSaved.
     *
     * @return the current value of pvSrSaved
     */
    public String getPvSrSaved() {
        return pvSrSaved;
    }

    /**
     * Setter method for pvSrSaved.
     *
     * @param aPvSrSaved the new value for pvSrSaved
     */
    public void setPvSrSaved(String aPvSrSaved) {
        pvSrSaved = aPvSrSaved;
    }

    /**
     * Access method for niveauAcces.
     *
     * @return the current value of niveauAcces
     */
    public BigDecimal getNiveauAcces() {
        return niveauAcces;
    }

    /**
     * Setter method for niveauAcces.
     *
     * @param aNiveauAcces the new value for niveauAcces
     */
    public void setNiveauAcces(BigDecimal aNiveauAcces) {
        niveauAcces = aNiveauAcces;
    }

    /**
     * Access method for filiere.
     *
     * @return the current value of filiere
     */
    public String getFiliere() {
        return filiere;
    }

    /**
     * Setter method for filiere.
     *
     * @param aFiliere the new value for filiere
     */
    public void setFiliere(String aFiliere) {
        filiere = aFiliere;
    }

    /**
     * Access method for typePv.
     *
     * @return the current value of typePv
     */
    public String getTypePv() {
        return typePv;
    }

    /**
     * Setter method for typePv.
     *
     * @param aTypePv the new value for typePv
     */
    public void setTypePv(String aTypePv) {
        typePv = aTypePv;
    }

    /**
     * Access method for espInscription.
     *
     * @return the current value of espInscription
     */
 //   public Set<EspInscription> getEspInscription() {
   //     return espInscription;
    //}

    /**
     * Setter method for espInscription.
     *
     * @param aEspInscription the new value for espInscription
     */
//    public void setEspInscription(Set<EspInscription> aEspInscription) {
  //      espInscription = aEspInscription;
    //}

    /**
  

    /**
     * Access method for espRemarqueAbsence.
     *
     * @return the current value of espRemarqueAbsence
     */
    public Set<EspRemarqueAbsence> getEspRemarqueAbsence() {
        return espRemarqueAbsence;
    }

    /**
     * Setter method for espRemarqueAbsence.
     *
     * @param aEspRemarqueAbsence the new value for espRemarqueAbsence
     */
    public void setEspRemarqueAbsence(Set<EspRemarqueAbsence> aEspRemarqueAbsence) {
        espRemarqueAbsence = aEspRemarqueAbsence;
    }

   

    /**
     * Access method for classe.
     *
     * @return the current value of classe
     */
    public Classe getClasse() {
        return classe;
    }

    /**
     * Setter method for classe.
     *
     * @param aClasse the new value for classe
     */
    public void setClasse(Classe aClasse) {
        classe = aClasse;
    }

    /**
     * Access method for espSaisonUniversitaire.
     *
     * @return the current value of espSaisonUniversitaire
     */
    public EspSaisonUniversitaire getEspSaisonUniversitaire() {
        return espSaisonUniversitaire;
    }

    /**
     * Setter method for espSaisonUniversitaire.
     *
     * @param aEspSaisonUniversitaire the new value for espSaisonUniversitaire
     */
    public void setEspSaisonUniversitaire(EspSaisonUniversitaire aEspSaisonUniversitaire) {
        espSaisonUniversitaire = aEspSaisonUniversitaire;
    }

    /** Temporary value holder for group key fragment espSaisonUniversitaireAnneeDeb */
    private transient String tempEspSaisonUniversitaireAnneeDeb;

    /**
     * Gets the key fragment anneeDeb for member espSaisonUniversitaire.
     * If this.espSaisonUniversitaire is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspSaisonUniversitaireAnneeDeb.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspSaisonUniversitaire
     */
    public String getEspSaisonUniversitaireAnneeDeb() {
        return (getEspSaisonUniversitaire() == null ? tempEspSaisonUniversitaireAnneeDeb : getEspSaisonUniversitaire().getAnneeDeb());
    }

    /**
     * Sets the key fragment anneeDeb from member espSaisonUniversitaire.
     * If this.espSaisonUniversitaire is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspSaisonUniversitaireAnneeDeb.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAnneeDeb New value for the key fragment
     * @see EspSaisonUniversitaire
     */
    public void setEspSaisonUniversitaireAnneeDeb(String aAnneeDeb) {
        if (getEspSaisonUniversitaire() == null) {
            tempEspSaisonUniversitaireAnneeDeb = aAnneeDeb;
        } else {
            getEspSaisonUniversitaire().setAnneeDeb(aAnneeDeb);
        }
    }

    /** Temporary value holder for group key fragment classeCodeCl */
    private transient String tempClasseCodeCl;

    /**
     * Gets the key fragment codeCl for member classe.
     * If this.classe is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setClasseCodeCl.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Classe
     */
    public String getClasseCodeCl() {
        return (getClasse() == null ? tempClasseCodeCl : getClasse().getCodeCl());
    }

    /**
     * Sets the key fragment codeCl from member classe.
     * If this.classe is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getClasseCodeCl.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeCl New value for the key fragment
     * @see Classe
     */
    public void setClasseCodeCl(String aCodeCl) {
        if (getClasse() == null) {
            tempClasseCodeCl = aCodeCl;
        } else {
            getClasse().setCodeCl(aCodeCl);
        }
    }

    /**
     * Compares the key for this instance with another EspSaisonClasse.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspSaisonClasse and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspSaisonClasse)) {
            return false;
        }
        EspSaisonClasse that = (EspSaisonClasse) other;
        Object myEspSaisonUniversitaireAnneeDeb = this.getEspSaisonUniversitaireAnneeDeb();
        Object yourEspSaisonUniversitaireAnneeDeb = that.getEspSaisonUniversitaireAnneeDeb();
        if (myEspSaisonUniversitaireAnneeDeb==null ? yourEspSaisonUniversitaireAnneeDeb!=null : !myEspSaisonUniversitaireAnneeDeb.equals(yourEspSaisonUniversitaireAnneeDeb)) {
            return false;
        }
        Object mySemestre = this.getSemestre();
        Object yourSemestre = that.getSemestre();
        if (mySemestre==null ? yourSemestre!=null : !mySemestre.equals(yourSemestre)) {
            return false;
        }
        Object myClasseCodeCl = this.getClasseCodeCl();
        Object yourClasseCodeCl = that.getClasseCodeCl();
        if (myClasseCodeCl==null ? yourClasseCodeCl!=null : !myClasseCodeCl.equals(yourClasseCodeCl)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspSaisonClasse.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspSaisonClasse)) return false;
        return this.equalKeys(other) && ((EspSaisonClasse)other).equalKeys(this);
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
        if (getEspSaisonUniversitaireAnneeDeb() == null) {
            i = 0;
        } else {
            i = getEspSaisonUniversitaireAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getSemestre() == null) {
            i = 0;
        } else {
            i = getSemestre().hashCode();
        }
        result = 37*result + i;
        if (getClasseCodeCl() == null) {
            i = 0;
        } else {
            i = getClasseCodeCl().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspSaisonClasse |");
        sb.append(" espSaisonUniversitaireAnneeDeb=").append(getEspSaisonUniversitaireAnneeDeb());
        sb.append(" semestre=").append(getSemestre());
        sb.append(" classeCodeCl=").append(getClasseCodeCl());
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
        ret.put("espSaisonUniversitaireAnneeDeb", getEspSaisonUniversitaireAnneeDeb());
        ret.put("semestre", getSemestre());
        ret.put("classeCodeCl", getClasseCodeCl());
        return ret;
    }

}
