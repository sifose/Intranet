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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ESP_MOY_PANIER_ETUDIANT")
@IdClass(EspMoyPanierEtudiant.EspMoyPanierEtudiantId.class)
public class EspMoyPanierEtudiant implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspMoyPanierEtudiantId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String idEt;
        java.lang.String numPanier;
        java.lang.String typeMoy;
    }

    /** Primary key. */
    protected static final String PK = "EspMoyPanierEtudiantPkMoyPanierEt";

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
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Id
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Id
    @Column(name="NUM_PANIER", nullable=false, length=5)
    private String numPanier;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Column(name="NIVEAU_ACCES", precision=1)
    private BigDecimal niveauAcces;
    @Column(name="DESIGNATION_PANIER", length=50)
    private String designationPanier;
    @Column(name="NB_HEURES", precision=3)
    private BigDecimal nbHeures;
    @Column(name="COEF", precision=5, scale=2)
    private BigDecimal coef;
    @Id
    @Column(name="TYPE_MOY", nullable=false, length=1)
    private String typeMoy;
    @Column(name="MOYENNE", precision=10, scale=2)
    private BigDecimal moyenne;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @ManyToOne
    @JoinColumn(name="ET_ID_ET")
    private EspEtudiant espEtudiant;
    @OneToMany(mappedBy="espMoyPanierEtudiant")
    private Set<EspMoyModuleEtudiant> espMoyModuleEtudiant;
   

    /** Default constructor. */
    public EspMoyPanierEtudiant() {
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
     * Access method for designationPanier.
     *
     * @return the current value of designationPanier
     */
    public String getDesignationPanier() {
        return designationPanier;
    }

    /**
     * Setter method for designationPanier.
     *
     * @param aDesignationPanier the new value for designationPanier
     */
    public void setDesignationPanier(String aDesignationPanier) {
        designationPanier = aDesignationPanier;
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
     * Access method for typeMoy.
     *
     * @return the current value of typeMoy
     */
    public String getTypeMoy() {
        return typeMoy;
    }

    /**
     * Setter method for typeMoy.
     *
     * @param aTypeMoy the new value for typeMoy
     */
    public void setTypeMoy(String aTypeMoy) {
        typeMoy = aTypeMoy;
    }

    /**
     * Access method for moyenne.
     *
     * @return the current value of moyenne
     */
    public BigDecimal getMoyenne() {
        return moyenne;
    }

    /**
     * Setter method for moyenne.
     *
     * @param aMoyenne the new value for moyenne
     */
    public void setMoyenne(BigDecimal aMoyenne) {
        moyenne = aMoyenne;
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
     * Access method for espMoyModuleEtudiant.
     *
     * @return the current value of espMoyModuleEtudiant
     */
    public Set<EspMoyModuleEtudiant> getEspMoyModuleEtudiant() {
        return espMoyModuleEtudiant;
    }

    /**
     * Setter method for espMoyModuleEtudiant.
     *
     * @param aEspMoyModuleEtudiant the new value for espMoyModuleEtudiant
     */
    public void setEspMoyModuleEtudiant(Set<EspMoyModuleEtudiant> aEspMoyModuleEtudiant) {
        espMoyModuleEtudiant = aEspMoyModuleEtudiant;
    }

  

    /**
     * Compares the key for this instance with another EspMoyPanierEtudiant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspMoyPanierEtudiant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspMoyPanierEtudiant)) {
            return false;
        }
        EspMoyPanierEtudiant that = (EspMoyPanierEtudiant) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myNumPanier = this.getNumPanier();
        Object yourNumPanier = that.getNumPanier();
        if (myNumPanier==null ? yourNumPanier!=null : !myNumPanier.equals(yourNumPanier)) {
            return false;
        }
        Object myTypeMoy = this.getTypeMoy();
        Object yourTypeMoy = that.getTypeMoy();
        if (myTypeMoy==null ? yourTypeMoy!=null : !myTypeMoy.equals(yourTypeMoy)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspMoyPanierEtudiant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspMoyPanierEtudiant)) return false;
        return this.equalKeys(other) && ((EspMoyPanierEtudiant)other).equalKeys(this);
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
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getIdEt() == null) {
            i = 0;
        } else {
            i = getIdEt().hashCode();
        }
        result = 37*result + i;
        if (getNumPanier() == null) {
            i = 0;
        } else {
            i = getNumPanier().hashCode();
        }
        result = 37*result + i;
        if (getTypeMoy() == null) {
            i = 0;
        } else {
            i = getTypeMoy().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspMoyPanierEtudiant |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" idEt=").append(getIdEt());
        sb.append(" numPanier=").append(getNumPanier());
        sb.append(" typeMoy=").append(getTypeMoy());
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
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("idEt", getIdEt());
        ret.put("numPanier", getNumPanier());
        ret.put("typeMoy", getTypeMoy());
        return ret;
    }

}
