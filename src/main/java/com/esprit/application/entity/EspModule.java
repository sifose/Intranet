// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ESP_MODULE")
public class EspModule implements Serializable {

    /** Primary key. */
    protected static final String PK = "codeModule";

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
    @Column(name="CODE_MODULE", unique=true, nullable=false, length=10)
    private String codeModule;
    @Column(name="DESIGNATION", length=50)
    private String designation;
    @Column(name="DESCRIPTION", length=1000)
    private String description;
    @Column(name="NB_HEURES", precision=5, scale=1)
    private BigDecimal nbHeures;
    @Column(name="ETAT", length=1)
    private String etat;
    @Column(name="COEF", precision=3, scale=1)
    private BigDecimal coef;
    @Column(name="NUM_PANIER", length=5)
    private String numPanier;
    @Column(name="A_EVALUER", length=1)
    private String aEvaluer;
    @Column(name="TYPE_EPREUVE", length=2)
    private String typeEpreuve;
    @Column(name="CODE_MATIERE_EDUSERV", length=10)
    private String codeMatiereEduserv;
   // @OneToMany(mappedBy="espModule")
   // private Set<EspAffectationEmploi> espAffectationEmploi;
  //  @OneToMany(mappedBy="espModule")
  //  private Set<EspAbsenceList> espAbsenceList;
  //  @OneToMany(mappedBy="espModule")
  //  private Set<EspAbsence> espAbsence;
 //   @OneToMany(mappedBy="espModule")
   // private Set<EspAbsenceEnseignant> espAbsenceEnseignant;
    @OneToMany(mappedBy="espModule")
  //  private Set<EspDetailContrat> espDetailContrat;
    //@OneToMany(mappedBy="espModule")
 //   private Set<EspEnteteNote> espEnteteNote;
   // @OneToMany(mappedBy="espModule")
//    private Set<EspEnteteAbsence> espEnteteAbsence;
 //   @OneToMany(mappedBy="espModule")
   // private Set<EspEvaluation> espEvaluation;
   // @OneToMany(mappedBy="espModule")
   // private Set<EspModulePanierClasseSaiso> espModulePanierClasseSaiso;
  //  @OneToMany(mappedBy="espModule")
    //private Set<EspModuleEtudiant> espModuleEtudiant;
  //  @OneToMany(mappedBy="espModule")
 //   private Set<EspProjet> espProjet;
   // @OneToMany(mappedBy="espModule")
  //  private Set<EspMoyModuleEtudiant> espMoyModuleEtudiant;
 //   @OneToMany(mappedBy="espModule")
   // private Set<EspNoteRat> espNoteRat;
  //  @OneToMany(mappedBy="espModule")
   // private Set<EspSeanceEns> espSeanceEns;
    @ManyToOne
    @JoinColumn(name="UP")
    private EspUp espUp;

    /** Default constructor. */
    public EspModule() {
        super();
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
     * Access method for designation.
     *
     * @return the current value of designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Setter method for designation.
     *
     * @param aDesignation the new value for designation
     */
    public void setDesignation(String aDesignation) {
        designation = aDesignation;
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
     * Access method for etat.
     *
     * @return the current value of etat
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Setter method for etat.
     *
     * @param aEtat the new value for etat
     */
    public void setEtat(String aEtat) {
        etat = aEtat;
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
     * Access method for aEvaluer.
     *
     * @return the current value of aEvaluer
     */
    public String getAEvaluer() {
        return aEvaluer;
    }

    /**
     * Setter method for aEvaluer.
     *
     * @param aAEvaluer the new value for aEvaluer
     */
    public void setAEvaluer(String aAEvaluer) {
        aEvaluer = aAEvaluer;
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
     * Access method for codeMatiereEduserv.
     *
     * @return the current value of codeMatiereEduserv
     */
    public String getCodeMatiereEduserv() {
        return codeMatiereEduserv;
    }

    /**
     * Setter method for codeMatiereEduserv.
     *
     * @param aCodeMatiereEduserv the new value for codeMatiereEduserv
     */
    public void setCodeMatiereEduserv(String aCodeMatiereEduserv) {
        codeMatiereEduserv = aCodeMatiereEduserv;
    }

 

    /**
     * Access method for espUp.
     *
     * @return the current value of espUp
     */
    public EspUp getEspUp() {
        return espUp;
    }

    /**
     * Setter method for espUp.
     *
     * @param aEspUp the new value for espUp
     */
    public void setEspUp(EspUp aEspUp) {
        espUp = aEspUp;
    }

    /**
     * Compares the key for this instance with another EspModule.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspModule and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspModule)) {
            return false;
        }
        EspModule that = (EspModule) other;
        Object myCodeModule = this.getCodeModule();
        Object yourCodeModule = that.getCodeModule();
        if (myCodeModule==null ? yourCodeModule!=null : !myCodeModule.equals(yourCodeModule)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspModule.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspModule)) return false;
        return this.equalKeys(other) && ((EspModule)other).equalKeys(this);
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
        if (getCodeModule() == null) {
            i = 0;
        } else {
            i = getCodeModule().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspModule |");
        sb.append(" codeModule=").append(getCodeModule());
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
        ret.put("codeModule", getCodeModule());
        return ret;
    }

}
