// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_MOY_MODULE_ETUDIANT")
@IdClass(EspMoyModuleEtudiant.EspMoyModuleEtudiantId.class)
public class EspMoyModuleEtudiant implements Serializable {
    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspMoyModuleEtudiantId implements Serializable {
        EspMoyPanierEtudiant espMoyPanierEtudiant;
        
        EspModule espModule;
   
        java.lang.String codeCl;
    }

    /** Primary key. */
    protected static final String PK = "EspMoyModuleEtudiantPkMoyModuleEt";

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
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Column(name="NIVEAU_ACCES", precision=1)
    private BigDecimal niveauAcces;
    @Column(name="DESIGNATION_MODULE", length=100)
    private String designationModule;
    @Column(name="NB_HEURES", precision=3)
    private BigDecimal nbHeures;
    @Column(name="COEF", precision=5, scale=2)
    private BigDecimal coef;
    @Column(name="MOYENNE", precision=10, scale=2)
    private BigDecimal moyenne;
    @Column(name="DATE_DERN_MAJ")
    private LocalDateTime dateDernMaj;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Column(name="CODE_UE", length=14)
    private String codeUe;
    @ManyToOne(optional=false)
    @Id
    @JoinColumns ({
    @JoinColumn(name="ANNEE_DEB", nullable=false),
    @JoinColumn(name="ID_ET", nullable=false),
    @JoinColumn(name="NUM_PANIER"),
    @JoinColumn(name="TYPE_MOY", nullable=false) })
    private EspMoyPanierEtudiant espMoyPanierEtudiant;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_MODULE", nullable=false)
    private EspModule espModule;

    /** Default constructor. */
    public EspMoyModuleEtudiant() {
        super();
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
     * Access method for designationModule.
     *
     * @return the current value of designationModule
     */
    public String getDesignationModule() {
        return designationModule;
    }

    /**
     * Setter method for designationModule.
     *
     * @param aDesignationModule the new value for designationModule
     */
    public void setDesignationModule(String aDesignationModule) {
        designationModule = aDesignationModule;
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
     * Access method for dateDernMaj.
     *
     * @return the current value of dateDernMaj
     */
    public LocalDateTime getDateDernMaj() {
        return dateDernMaj;
    }

    /**
     * Setter method for dateDernMaj.
     *
     * @param aDateDernMaj the new value for dateDernMaj
     */
    public void setDateDernMaj(LocalDateTime aDateDernMaj) {
        dateDernMaj = aDateDernMaj;
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
     * Access method for espMoyPanierEtudiant.
     *
     * @return the current value of espMoyPanierEtudiant
     */
    public EspMoyPanierEtudiant getEspMoyPanierEtudiant() {
        return espMoyPanierEtudiant;
    }

    /**
     * Setter method for espMoyPanierEtudiant.
     *
     * @param aEspMoyPanierEtudiant the new value for espMoyPanierEtudiant
     */
    public void setEspMoyPanierEtudiant(EspMoyPanierEtudiant aEspMoyPanierEtudiant) {
        espMoyPanierEtudiant = aEspMoyPanierEtudiant;
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

    /** Temporary value holder for group key fragment espMoyPanierEtudiantAnneeDeb */
    private transient String tempEspMoyPanierEtudiantAnneeDeb;

    /**
     * Gets the key fragment anneeDeb for member espMoyPanierEtudiant.
     * If this.espMoyPanierEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspMoyPanierEtudiantAnneeDeb.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspMoyPanierEtudiant
     */
    public String getEspMoyPanierEtudiantAnneeDeb() {
        return (getEspMoyPanierEtudiant() == null ? tempEspMoyPanierEtudiantAnneeDeb : getEspMoyPanierEtudiant().getAnneeDeb());
    }

    /**
     * Sets the key fragment anneeDeb from member espMoyPanierEtudiant.
     * If this.espMoyPanierEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspMoyPanierEtudiantAnneeDeb.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAnneeDeb New value for the key fragment
     * @see EspMoyPanierEtudiant
     */
    public void setEspMoyPanierEtudiantAnneeDeb(String aAnneeDeb) {
        if (getEspMoyPanierEtudiant() == null) {
            tempEspMoyPanierEtudiantAnneeDeb = aAnneeDeb;
        } else {
            getEspMoyPanierEtudiant().setAnneeDeb(aAnneeDeb);
        }
    }

    /** Temporary value holder for group key fragment espMoyPanierEtudiantIdEt */
    private transient String tempEspMoyPanierEtudiantIdEt;

    /**
     * Gets the key fragment idEt for member espMoyPanierEtudiant.
     * If this.espMoyPanierEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspMoyPanierEtudiantIdEt.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspMoyPanierEtudiant
     */
    public String getEspMoyPanierEtudiantIdEt() {
        return (getEspMoyPanierEtudiant() == null ? tempEspMoyPanierEtudiantIdEt : getEspMoyPanierEtudiant().getIdEt());
    }

    /**
     * Sets the key fragment idEt from member espMoyPanierEtudiant.
     * If this.espMoyPanierEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspMoyPanierEtudiantIdEt.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdEt New value for the key fragment
     * @see EspMoyPanierEtudiant
     */
    public void setEspMoyPanierEtudiantIdEt(String aIdEt) {
        if (getEspMoyPanierEtudiant() == null) {
            tempEspMoyPanierEtudiantIdEt = aIdEt;
        } else {
            getEspMoyPanierEtudiant().setIdEt(aIdEt);
        }
    }

    /** Temporary value holder for group key fragment espMoyPanierEtudiantNumPanier */
    private transient String tempEspMoyPanierEtudiantNumPanier;

    /**
     * Gets the key fragment numPanier for member espMoyPanierEtudiant.
     * If this.espMoyPanierEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspMoyPanierEtudiantNumPanier.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspMoyPanierEtudiant
     */
    public String getEspMoyPanierEtudiantNumPanier() {
        return (getEspMoyPanierEtudiant() == null ? tempEspMoyPanierEtudiantNumPanier : getEspMoyPanierEtudiant().getNumPanier());
    }

    /**
     * Sets the key fragment numPanier from member espMoyPanierEtudiant.
     * If this.espMoyPanierEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspMoyPanierEtudiantNumPanier.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aNumPanier New value for the key fragment
     * @see EspMoyPanierEtudiant
     */
    public void setEspMoyPanierEtudiantNumPanier(String aNumPanier) {
        if (getEspMoyPanierEtudiant() == null) {
            tempEspMoyPanierEtudiantNumPanier = aNumPanier;
        } else {
            getEspMoyPanierEtudiant().setNumPanier(aNumPanier);
        }
    }

    /** Temporary value holder for group key fragment espMoyPanierEtudiantTypeMoy */
    private transient String tempEspMoyPanierEtudiantTypeMoy;

    /**
     * Gets the key fragment typeMoy for member espMoyPanierEtudiant.
     * If this.espMoyPanierEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspMoyPanierEtudiantTypeMoy.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspMoyPanierEtudiant
     */
    public String getEspMoyPanierEtudiantTypeMoy() {
        return (getEspMoyPanierEtudiant() == null ? tempEspMoyPanierEtudiantTypeMoy : getEspMoyPanierEtudiant().getTypeMoy());
    }

    /**
     * Sets the key fragment typeMoy from member espMoyPanierEtudiant.
     * If this.espMoyPanierEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspMoyPanierEtudiantTypeMoy.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aTypeMoy New value for the key fragment
     * @see EspMoyPanierEtudiant
     */
    public void setEspMoyPanierEtudiantTypeMoy(String aTypeMoy) {
        if (getEspMoyPanierEtudiant() == null) {
            tempEspMoyPanierEtudiantTypeMoy = aTypeMoy;
        } else {
            getEspMoyPanierEtudiant().setTypeMoy(aTypeMoy);
        }
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

    /** Temporary value holder for group key fragment espMoyPanierEtudiant4AnneeDeb */
    private transient String tempEspMoyPanierEtudiant4AnneeDeb;

    

  

    /**
     * Compares the key for this instance with another EspMoyModuleEtudiant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspMoyModuleEtudiant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspMoyModuleEtudiant)) {
            return false;
        }
        EspMoyModuleEtudiant that = (EspMoyModuleEtudiant) other;
        Object myEspMoyPanierEtudiantAnneeDeb = this.getEspMoyPanierEtudiantAnneeDeb();
        Object yourEspMoyPanierEtudiantAnneeDeb = that.getEspMoyPanierEtudiantAnneeDeb();
        if (myEspMoyPanierEtudiantAnneeDeb==null ? yourEspMoyPanierEtudiantAnneeDeb!=null : !myEspMoyPanierEtudiantAnneeDeb.equals(yourEspMoyPanierEtudiantAnneeDeb)) {
            return false;
        }
        Object myEspMoyPanierEtudiantIdEt = this.getEspMoyPanierEtudiantIdEt();
        Object yourEspMoyPanierEtudiantIdEt = that.getEspMoyPanierEtudiantIdEt();
        if (myEspMoyPanierEtudiantIdEt==null ? yourEspMoyPanierEtudiantIdEt!=null : !myEspMoyPanierEtudiantIdEt.equals(yourEspMoyPanierEtudiantIdEt)) {
            return false;
        }
        Object myEspMoyPanierEtudiantNumPanier = this.getEspMoyPanierEtudiantNumPanier();
        Object yourEspMoyPanierEtudiantNumPanier = that.getEspMoyPanierEtudiantNumPanier();
        if (myEspMoyPanierEtudiantNumPanier==null ? yourEspMoyPanierEtudiantNumPanier!=null : !myEspMoyPanierEtudiantNumPanier.equals(yourEspMoyPanierEtudiantNumPanier)) {
            return false;
        }
        Object myEspMoyPanierEtudiantTypeMoy = this.getEspMoyPanierEtudiantTypeMoy();
        Object yourEspMoyPanierEtudiantTypeMoy = that.getEspMoyPanierEtudiantTypeMoy();
        if (myEspMoyPanierEtudiantTypeMoy==null ? yourEspMoyPanierEtudiantTypeMoy!=null : !myEspMoyPanierEtudiantTypeMoy.equals(yourEspMoyPanierEtudiantTypeMoy)) {
            return false;
        }
       
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspMoyModuleEtudiant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspMoyModuleEtudiant)) return false;
        return this.equalKeys(other) && ((EspMoyModuleEtudiant)other).equalKeys(this);
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
        if (getEspMoyPanierEtudiantAnneeDeb() == null) {
            i = 0;
        } else {
            i = getEspMoyPanierEtudiantAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getEspMoyPanierEtudiantIdEt() == null) {
            i = 0;
        } else {
            i = getEspMoyPanierEtudiantIdEt().hashCode();
        }
        result = 37*result + i;
        if (getEspMoyPanierEtudiantNumPanier() == null) {
            i = 0;
        } else {
            i = getEspMoyPanierEtudiantNumPanier().hashCode();
        }
        result = 37*result + i;
        if (getEspMoyPanierEtudiantTypeMoy() == null) {
            i = 0;
        } else {
            i = getEspMoyPanierEtudiantTypeMoy().hashCode();
        }
        result = 37*result + i;
       
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
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EspMoyModuleEtudiant |");
        sb.append(" espMoyPanierEtudiantAnneeDeb=").append(getEspMoyPanierEtudiantAnneeDeb());
        sb.append(" espMoyPanierEtudiantIdEt=").append(getEspMoyPanierEtudiantIdEt());
        sb.append(" espMoyPanierEtudiantNumPanier=").append(getEspMoyPanierEtudiantNumPanier());
        sb.append(" espMoyPanierEtudiantTypeMoy=").append(getEspMoyPanierEtudiantTypeMoy());
        sb.append(" espModuleCodeModule=").append(getEspModuleCodeModule());
        sb.append(" codeCl=").append(getCodeCl());
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
        ret.put("espMoyPanierEtudiantAnneeDeb", getEspMoyPanierEtudiantAnneeDeb());
        ret.put("espMoyPanierEtudiantIdEt", getEspMoyPanierEtudiantIdEt());
        ret.put("espMoyPanierEtudiantNumPanier", getEspMoyPanierEtudiantNumPanier());
        ret.put("espMoyPanierEtudiantTypeMoy", getEspMoyPanierEtudiantTypeMoy());
        ret.put("espModuleCodeModule", getEspModuleCodeModule());
        ret.put("codeCl", getCodeCl());
        return ret;
    }

}
