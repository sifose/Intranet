// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Entity(name="ESP_MODULE_ETUDIANT")
@IdClass(EspModuleEtudiant.EspModuleEtudiantId.class)
public class EspModuleEtudiant implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspModuleEtudiantId implements Serializable {
        EspEtudiant espEtudiant;
        EspModule espModule;
        java.lang.String numPanier;
        java.lang.String codeCl;
        EspExamen espExamen;
    }

    /** Primary key. */
    protected static final String PK = "EspModuleEtudiantPkEspModuleEtudiant";

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
    @Column(name="NUM_PANIER", nullable=false, length=5)
    private String numPanier;
    @Id
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Column(name="MOYENNE_PRINCIPALE", precision=7, scale=4)
    private BigDecimal moyennePrincipale;
    @Column(name="MOYENNE_RAT", precision=7, scale=4)
    private BigDecimal moyenneRat;
    @Column(name="SITUATION", length=1)
    private String situation;
    @Column(name="NB_ABSCENCE", precision=38)
    private BigDecimal nbAbscence;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ID_ET", nullable=false)
    private EspEtudiant espEtudiant;
    @ManyToOne(optional=false)
    @Id
    @JoinColumns ({
    @JoinColumn(name="ANNEE_DEB", nullable=false),
    @JoinColumn(name="NUM_SESSION"),
    @JoinColumn(name="ANNEE_FIN", nullable=false) })
    private EspExamen espExamen;
    
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_MODULE", nullable=false)
    private EspModule espModule;

    /** Default constructor. */
    public EspModuleEtudiant() {
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
     * Access method for moyennePrincipale.
     *
     * @return the current value of moyennePrincipale
     */
    public BigDecimal getMoyennePrincipale() {
        return moyennePrincipale;
    }

    /**
     * Setter method for moyennePrincipale.
     *
     * @param aMoyennePrincipale the new value for moyennePrincipale
     */
    public void setMoyennePrincipale(BigDecimal aMoyennePrincipale) {
        moyennePrincipale = aMoyennePrincipale;
    }

    /**
     * Access method for moyenneRat.
     *
     * @return the current value of moyenneRat
     */
    public BigDecimal getMoyenneRat() {
        return moyenneRat;
    }

    /**
     * Setter method for moyenneRat.
     *
     * @param aMoyenneRat the new value for moyenneRat
     */
    public void setMoyenneRat(BigDecimal aMoyenneRat) {
        moyenneRat = aMoyenneRat;
    }

    /**
     * Access method for situation.
     *
     * @return the current value of situation
     */
    public String getSituation() {
        return situation;
    }

    /**
     * Setter method for situation.
     *
     * @param aSituation the new value for situation
     */
    public void setSituation(String aSituation) {
        situation = aSituation;
    }

    /**
     * Access method for nbAbscence.
     *
     * @return the current value of nbAbscence
     */
    public BigDecimal getNbAbscence() {
        return nbAbscence;
    }

    /**
     * Setter method for nbAbscence.
     *
     * @param aNbAbscence the new value for nbAbscence
     */
    public void setNbAbscence(BigDecimal aNbAbscence) {
        nbAbscence = aNbAbscence;
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
     * Access method for espExamen.
     *
     * @return the current value of espExamen
     */
    public EspExamen getEspExamen() {
        return espExamen;
    }

    /**
     * Setter method for espExamen.
     *
     * @param aEspExamen the new value for espExamen
     */
    public void setEspExamen(EspExamen aEspExamen) {
        espExamen = aEspExamen;
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

    /** Temporary value holder for group key fragment espEtudiantIdEt */
    private transient String tempEspEtudiantIdEt;

    /**
     * Gets the key fragment idEt for member espEtudiant.
     * If this.espEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspEtudiantIdEt.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspEtudiant
     */
    public String getEspEtudiantIdEt() {
        return (getEspEtudiant() == null ? tempEspEtudiantIdEt : getEspEtudiant().getIdEt());
    }

    /**
     * Sets the key fragment idEt from member espEtudiant.
     * If this.espEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspEtudiantIdEt.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdEt New value for the key fragment
     * @see EspEtudiant
     */
    public void setEspEtudiantIdEt(String aIdEt) {
        if (getEspEtudiant() == null) {
            tempEspEtudiantIdEt = aIdEt;
        } else {
            getEspEtudiant().setIdEt(aIdEt);
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

    /** Temporary value holder for group key fragment espExamenNumSession */
    private transient BigDecimal tempEspExamenNumSession;

    /**
     * Gets the key fragment numSession for member espExamen.
     * If this.espExamen is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspExamenNumSession.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspExamen
     */
    public BigDecimal getEspExamenNumSession() {
        return (getEspExamen() == null ? tempEspExamenNumSession : getEspExamen().getNumSession());
    }

    /**
     * Sets the key fragment numSession from member espExamen.
     * If this.espExamen is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspExamenNumSession.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aNumSession New value for the key fragment
     * @see EspExamen
     */
    public void setEspExamenNumSession(BigDecimal aNumSession) {
        if (getEspExamen() == null) {
            tempEspExamenNumSession = aNumSession;
        } else {
            getEspExamen().setNumSession(aNumSession);
        }
    }

    /** Temporary value holder for group key fragment espExamenEspSaisonUniversitaireAnneeDeb */
    private transient String tempEspExamenEspSaisonUniversitaireAnneeDeb;

    /**
     * Gets the key fragment anneeDeb for member espExamen.
     * If this.espExamen is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspExamenEspSaisonUniversitaireAnneeDeb.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspSaisonUniversitaire
     */
    public String getEspExamenEspSaisonUniversitaireAnneeDeb() {
        return (getEspExamen() == null ? tempEspExamenEspSaisonUniversitaireAnneeDeb : getEspExamen().getEspSaisonUniversitaireAnneeDeb());
    }

    /**
     * Sets the key fragment anneeDeb from member espExamen.
     * If this.espExamen is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspExamenEspSaisonUniversitaireAnneeDeb.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAnneeDeb New value for the key fragment
     * @see EspSaisonUniversitaire
     */
    public void setEspExamenEspSaisonUniversitaireAnneeDeb(String aAnneeDeb) {
        if (getEspExamen() == null) {
            tempEspExamenEspSaisonUniversitaireAnneeDeb = aAnneeDeb;
        } else {
            getEspExamen().setEspSaisonUniversitaireAnneeDeb(aAnneeDeb);
        }
    }

    /** Temporary value holder for group key fragment espExamenAnneeFin */
    private transient String tempEspExamenAnneeFin;

    /**
     * Gets the key fragment anneeFin for member espExamen.
     * If this.espExamen is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspExamenAnneeFin.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspExamen
     */
    public String getEspExamenAnneeFin() {
        return (getEspExamen() == null ? tempEspExamenAnneeFin : getEspExamen().getAnneeFin());
    }

    /**
     * Sets the key fragment anneeFin from member espExamen.
     * If this.espExamen is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspExamenAnneeFin.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAnneeFin New value for the key fragment
     * @see EspExamen
     */
    public void setEspExamenAnneeFin(String aAnneeFin) {
        if (getEspExamen() == null) {
            tempEspExamenAnneeFin = aAnneeFin;
        } else {
            getEspExamen().setAnneeFin(aAnneeFin);
        }
    }

    /** Temporary value holder for group key fragment espExamen2NumSession */
    private transient BigDecimal tempEspExamen2NumSession;

  

    /**
     * Compares the key for this instance with another EspModuleEtudiant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspModuleEtudiant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspModuleEtudiant)) {
            return false;
        }
        EspModuleEtudiant that = (EspModuleEtudiant) other;
        Object myEspEtudiantIdEt = this.getEspEtudiantIdEt();
        Object yourEspEtudiantIdEt = that.getEspEtudiantIdEt();
        if (myEspEtudiantIdEt==null ? yourEspEtudiantIdEt!=null : !myEspEtudiantIdEt.equals(yourEspEtudiantIdEt)) {
            return false;
        }
        Object myEspModuleCodeModule = this.getEspModuleCodeModule();
        Object yourEspModuleCodeModule = that.getEspModuleCodeModule();
        if (myEspModuleCodeModule==null ? yourEspModuleCodeModule!=null : !myEspModuleCodeModule.equals(yourEspModuleCodeModule)) {
            return false;
        }
        Object myNumPanier = this.getNumPanier();
        Object yourNumPanier = that.getNumPanier();
        if (myNumPanier==null ? yourNumPanier!=null : !myNumPanier.equals(yourNumPanier)) {
            return false;
        }
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        Object myEspExamenNumSession = this.getEspExamenNumSession();
        Object yourEspExamenNumSession = that.getEspExamenNumSession();
        if (myEspExamenNumSession==null ? yourEspExamenNumSession!=null : !myEspExamenNumSession.equals(yourEspExamenNumSession)) {
            return false;
        }
        Object myEspExamenEspSaisonUniversitaireAnneeDeb = this.getEspExamenEspSaisonUniversitaireAnneeDeb();
        Object yourEspExamenEspSaisonUniversitaireAnneeDeb = that.getEspExamenEspSaisonUniversitaireAnneeDeb();
        if (myEspExamenEspSaisonUniversitaireAnneeDeb==null ? yourEspExamenEspSaisonUniversitaireAnneeDeb!=null : !myEspExamenEspSaisonUniversitaireAnneeDeb.equals(yourEspExamenEspSaisonUniversitaireAnneeDeb)) {
            return false;
        }
        Object myEspExamenAnneeFin = this.getEspExamenAnneeFin();
        Object yourEspExamenAnneeFin = that.getEspExamenAnneeFin();
        if (myEspExamenAnneeFin==null ? yourEspExamenAnneeFin!=null : !myEspExamenAnneeFin.equals(yourEspExamenAnneeFin)) {
            return false;
        }
      
        
        return true;
    }

    /**
     * Compares this instance with another EspModuleEtudiant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspModuleEtudiant)) return false;
        return this.equalKeys(other) && ((EspModuleEtudiant)other).equalKeys(this);
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
        if (getEspEtudiantIdEt() == null) {
            i = 0;
        } else {
            i = getEspEtudiantIdEt().hashCode();
        }
        result = 37*result + i;
        if (getEspModuleCodeModule() == null) {
            i = 0;
        } else {
            i = getEspModuleCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getNumPanier() == null) {
            i = 0;
        } else {
            i = getNumPanier().hashCode();
        }
        result = 37*result + i;
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getEspExamenNumSession() == null) {
            i = 0;
        } else {
            i = getEspExamenNumSession().hashCode();
        }
        result = 37*result + i;
        if (getEspExamenEspSaisonUniversitaireAnneeDeb() == null) {
            i = 0;
        } else {
            i = getEspExamenEspSaisonUniversitaireAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getEspExamenAnneeFin() == null) {
            i = 0;
        } else {
            i = getEspExamenAnneeFin().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspModuleEtudiant |");
        sb.append(" espEtudiantIdEt=").append(getEspEtudiantIdEt());
        sb.append(" espModuleCodeModule=").append(getEspModuleCodeModule());
        sb.append(" numPanier=").append(getNumPanier());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" espExamenNumSession=").append(getEspExamenNumSession());
        sb.append(" espExamenEspSaisonUniversitaireAnneeDeb=").append(getEspExamenEspSaisonUniversitaireAnneeDeb());
        sb.append(" espExamenAnneeFin=").append(getEspExamenAnneeFin());
        
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
        ret.put("espEtudiantIdEt", getEspEtudiantIdEt());
        ret.put("espModuleCodeModule", getEspModuleCodeModule());
        ret.put("numPanier", getNumPanier());
        ret.put("codeCl", getCodeCl());
        ret.put("espExamenNumSession", getEspExamenNumSession());
        ret.put("espExamenEspSaisonUniversitaireAnneeDeb", getEspExamenEspSaisonUniversitaireAnneeDeb());
        ret.put("espExamenAnneeFin", getEspExamenAnneeFin());
        return ret;
    }

}
