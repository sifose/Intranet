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

@Entity(name="ESP_MOY_UE_ETUDIANT")
@IdClass(EspMoyUeEtudiant.EspMoyUeEtudiantId.class)
public class EspMoyUeEtudiant implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspMoyUeEtudiantId implements Serializable {
        EspUe espUe;
        EspEtudiant espEtudiant;
        java.lang.String codeCl;
   
        java.lang.String typeMoy;
    }

    /** Primary key. */
    protected static final String PK = "EspMoyUeEtudiantPkMoyUeEt";

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
    @Column(name="NB_ECTS", precision=6, scale=2)
    private BigDecimal nbEcts;
    @Id
    @Column(name="TYPE_MOY", nullable=false, length=1)
    private String typeMoy;
    @Column(name="MOYENNE", precision=10, scale=2)
    private BigDecimal moyenne;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Column(name="CHA_CODE_STR", nullable=false, length=14)
    private String chaCodeStr;
    @ManyToOne(optional=false)
    @Id
    @JoinColumns ({
    @JoinColumn(name="ANNEE_DEB", nullable=false),
   
    @JoinColumn(name="CODE_UE", nullable=false) })
    private EspUe espUe;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ID_ET", nullable=false)
    private EspEtudiant espEtudiant;

    /** Default constructor. */
    public EspMoyUeEtudiant() {
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
     * Access method for chaCodeStr.
     *
     * @return the current value of chaCodeStr
     */
    public String getChaCodeStr() {
        return chaCodeStr;
    }

    /**
     * Setter method for chaCodeStr.
     *
     * @param aChaCodeStr the new value for chaCodeStr
     */
    public void setChaCodeStr(String aChaCodeStr) {
        chaCodeStr = aChaCodeStr;
    }

    /**
     * Access method for espUe.
     *
     * @return the current value of espUe
     */
    public EspUe getEspUe() {
        return espUe;
    }

    /**
     * Setter method for espUe.
     *
     * @param aEspUe the new value for espUe
     */
    public void setEspUe(EspUe aEspUe) {
        espUe = aEspUe;
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

    /** Temporary value holder for group key fragment espUeCodeUe */
    private transient String tempEspUeCodeUe;

    /**
     * Gets the key fragment codeUe for member espUe.
     * If this.espUe is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspUeCodeUe.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspUe
     */
    public String getEspUeCodeUe() {
        return (getEspUe() == null ? tempEspUeCodeUe : getEspUe().getCodeUe());
    }

    /**
     * Sets the key fragment codeUe from member espUe.
     * If this.espUe is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspUeCodeUe.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeUe New value for the key fragment
     * @see EspUe
     */
    public void setEspUeCodeUe(String aCodeUe) {
        if (getEspUe() == null) {
            tempEspUeCodeUe = aCodeUe;
        } else {
            getEspUe().setCodeUe(aCodeUe);
        }
    }

    /** Temporary value holder for group key fragment espUeAnneeDeb */
    private transient String tempEspUeAnneeDeb;

    /**
     * Gets the key fragment anneeDeb for member espUe.
     * If this.espUe is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspUeAnneeDeb.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspUe
     */
    public String getEspUeAnneeDeb() {
        return (getEspUe() == null ? tempEspUeAnneeDeb : getEspUe().getAnneeDeb());
    }

    /**
     * Sets the key fragment anneeDeb from member espUe.
     * If this.espUe is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspUeAnneeDeb.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAnneeDeb New value for the key fragment
     * @see EspUe
     */
    public void setEspUeAnneeDeb(String aAnneeDeb) {
        if (getEspUe() == null) {
            tempEspUeAnneeDeb = aAnneeDeb;
        } else {
            getEspUe().setAnneeDeb(aAnneeDeb);
        }
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

    /** Temporary value holder for group key fragment espUe2CodeUe */
    private transient String tempEspUe2CodeUe;

  

    /**
     * Compares the key for this instance with another EspMoyUeEtudiant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspMoyUeEtudiant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspMoyUeEtudiant)) {
            return false;
        }
        EspMoyUeEtudiant that = (EspMoyUeEtudiant) other;
        Object myEspUeCodeUe = this.getEspUeCodeUe();
        Object yourEspUeCodeUe = that.getEspUeCodeUe();
        if (myEspUeCodeUe==null ? yourEspUeCodeUe!=null : !myEspUeCodeUe.equals(yourEspUeCodeUe)) {
            return false;
        }
        Object myEspUeAnneeDeb = this.getEspUeAnneeDeb();
        Object yourEspUeAnneeDeb = that.getEspUeAnneeDeb();
        if (myEspUeAnneeDeb==null ? yourEspUeAnneeDeb!=null : !myEspUeAnneeDeb.equals(yourEspUeAnneeDeb)) {
            return false;
        }
        Object myEspEtudiantIdEt = this.getEspEtudiantIdEt();
        Object yourEspEtudiantIdEt = that.getEspEtudiantIdEt();
        if (myEspEtudiantIdEt==null ? yourEspEtudiantIdEt!=null : !myEspEtudiantIdEt.equals(yourEspEtudiantIdEt)) {
            return false;
        }
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
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
     * Compares this instance with another EspMoyUeEtudiant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspMoyUeEtudiant)) return false;
        return this.equalKeys(other) && ((EspMoyUeEtudiant)other).equalKeys(this);
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
        if (getEspUeCodeUe() == null) {
            i = 0;
        } else {
            i = getEspUeCodeUe().hashCode();
        }
        result = 37*result + i;
        if (getEspUeAnneeDeb() == null) {
            i = 0;
        } else {
            i = getEspUeAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getEspEtudiantIdEt() == null) {
            i = 0;
        } else {
            i = getEspEtudiantIdEt().hashCode();
        }
        result = 37*result + i;
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspMoyUeEtudiant |");
        sb.append(" espUeCodeUe=").append(getEspUeCodeUe());
        sb.append(" espUeAnneeDeb=").append(getEspUeAnneeDeb());
        sb.append(" espEtudiantIdEt=").append(getEspEtudiantIdEt());
        sb.append(" codeCl=").append(getCodeCl());
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
        ret.put("espUeCodeUe", getEspUeCodeUe());
        ret.put("espUeAnneeDeb", getEspUeAnneeDeb());
        ret.put("espEtudiantIdEt", getEspEtudiantIdEt());
        ret.put("codeCl", getCodeCl());
        ret.put("typeMoy", getTypeMoy());
        return ret;
    }

}
