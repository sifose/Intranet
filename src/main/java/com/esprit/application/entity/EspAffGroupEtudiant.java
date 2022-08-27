// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ESP_AFF_GROUP_ETUDIANT")
@IdClass(EspAffGroupEtudiant.EspAffGroupEtudiantId.class)
public class EspAffGroupEtudiant implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspAffGroupEtudiantId implements Serializable {
        EspGroupeProjet espGroupeProjet;
        java.lang.String idEt;
    }

    /** Primary key. */
    protected static final String PK = "EspAffGroupEtudiantPkAffGr";

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
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Column(name="DATE_AFFECTATION")
    private LocalDateTime dateAffectation;
    @ManyToOne(optional=false)
    @Id
    @JoinColumns ({
    @JoinColumn(name="ID_GROUPE", nullable=false),
    
    @JoinColumn(name="ANNEE_DEB", nullable=false) })
    private EspGroupeProjet espGroupeProjet;
    @OneToMany(mappedBy="espAffGroupEtudiant")
    private Set<EspSuiviProjetIndiv> espSuiviProjetIndiv;

    /** Default constructor. */
    public EspAffGroupEtudiant() {
        super();
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
     * Access method for dateAffectation.
     *
     * @return the current value of dateAffectation
     */
    public LocalDateTime getDateAffectation() {
        return dateAffectation;
    }

    /**
     * Setter method for dateAffectation.
     *
     * @param aDateAffectation the new value for dateAffectation
     */
    public void setDateAffectation(LocalDateTime aDateAffectation) {
        dateAffectation = aDateAffectation;
    }

    /**
     * Access method for espGroupeProjet.
     *
     * @return the current value of espGroupeProjet
     */
    public EspGroupeProjet getEspGroupeProjet() {
        return espGroupeProjet;
    }

    /**
     * Setter method for espGroupeProjet.
     *
     * @param aEspGroupeProjet the new value for espGroupeProjet
     */
    public void setEspGroupeProjet(EspGroupeProjet aEspGroupeProjet) {
        espGroupeProjet = aEspGroupeProjet;
    }

   

    /**
     * Access method for espSuiviProjetIndiv.
     *
     * @return the current value of espSuiviProjetIndiv
     */
    public Set<EspSuiviProjetIndiv> getEspSuiviProjetIndiv() {
        return espSuiviProjetIndiv;
    }

    /**
     * Setter method for espSuiviProjetIndiv.
     *
     * @param aEspSuiviProjetIndiv the new value for espSuiviProjetIndiv
     */
    public void setEspSuiviProjetIndiv(Set<EspSuiviProjetIndiv> aEspSuiviProjetIndiv) {
        espSuiviProjetIndiv = aEspSuiviProjetIndiv;
    }


    /** Temporary value holder for group key fragment espGroupeProjetIdGroupe */
    private transient String tempEspGroupeProjetIdGroupe;

    /**
     * Gets the key fragment idGroupe for member espGroupeProjet.
     * If this.espGroupeProjet is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspGroupeProjetIdGroupe.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspGroupeProjet
     */
    public String getEspGroupeProjetIdGroupe() {
        return (getEspGroupeProjet() == null ? tempEspGroupeProjetIdGroupe : getEspGroupeProjet().getIdGroupe());
    }

    /**
     * Sets the key fragment idGroupe from member espGroupeProjet.
     * If this.espGroupeProjet is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspGroupeProjetIdGroupe.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdGroupe New value for the key fragment
     * @see EspGroupeProjet
     */
    public void setEspGroupeProjetIdGroupe(String aIdGroupe) {
        if (getEspGroupeProjet() == null) {
            tempEspGroupeProjetIdGroupe = aIdGroupe;
        } else {
            getEspGroupeProjet().setIdGroupe(aIdGroupe);
        }
    }

    /** Temporary value holder for group key fragment espGroupeProjetAnneeDeb */
    private transient String tempEspGroupeProjetAnneeDeb;

    /**
     * Gets the key fragment anneeDeb for member espGroupeProjet.
     * If this.espGroupeProjet is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspGroupeProjetAnneeDeb.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspGroupeProjet
     */
    public String getEspGroupeProjetAnneeDeb() {
        return (getEspGroupeProjet() == null ? tempEspGroupeProjetAnneeDeb : getEspGroupeProjet().getAnneeDeb());
    }

    /**
     * Sets the key fragment anneeDeb from member espGroupeProjet.
     * If this.espGroupeProjet is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspGroupeProjetAnneeDeb.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAnneeDeb New value for the key fragment
     * @see EspGroupeProjet
     */
    public void setEspGroupeProjetAnneeDeb(String aAnneeDeb) {
        if (getEspGroupeProjet() == null) {
            tempEspGroupeProjetAnneeDeb = aAnneeDeb;
        } else {
            getEspGroupeProjet().setAnneeDeb(aAnneeDeb);
        }
    }

    /** Temporary value holder for group key fragment espGroupeProjet2IdGroupe */
    private transient String tempEspGroupeProjet2IdGroupe;

   
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspAffGroupEtudiant)) {
            return false;
        }
        EspAffGroupEtudiant that = (EspAffGroupEtudiant) other;
        Object myEspGroupeProjetIdGroupe = this.getEspGroupeProjetIdGroupe();
        Object yourEspGroupeProjetIdGroupe = that.getEspGroupeProjetIdGroupe();
        if (myEspGroupeProjetIdGroupe==null ? yourEspGroupeProjetIdGroupe!=null : !myEspGroupeProjetIdGroupe.equals(yourEspGroupeProjetIdGroupe)) {
            return false;
        }
        Object myEspGroupeProjetAnneeDeb = this.getEspGroupeProjetAnneeDeb();
        Object yourEspGroupeProjetAnneeDeb = that.getEspGroupeProjetAnneeDeb();
        if (myEspGroupeProjetAnneeDeb==null ? yourEspGroupeProjetAnneeDeb!=null : !myEspGroupeProjetAnneeDeb.equals(yourEspGroupeProjetAnneeDeb)) {
            return false;
        }
       
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspAffGroupEtudiant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspAffGroupEtudiant)) return false;
        return this.equalKeys(other) && ((EspAffGroupEtudiant)other).equalKeys(this);
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
        if (getEspGroupeProjetIdGroupe() == null) {
            i = 0;
        } else {
            i = getEspGroupeProjetIdGroupe().hashCode();
        }
        result = 37*result + i;
        if (getEspGroupeProjetAnneeDeb() == null) {
            i = 0;
        } else {
            i = getEspGroupeProjetAnneeDeb().hashCode();
        }
        result = 37*result + i;
        
        if (getIdEt() == null) {
            i = 0;
        } else {
            i = getIdEt().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspAffGroupEtudiant |");
        sb.append(" espGroupeProjetIdGroupe=").append(getEspGroupeProjetIdGroupe());
        sb.append(" espGroupeProjetAnneeDeb=").append(getEspGroupeProjetAnneeDeb());
        sb.append(" idEt=").append(getIdEt());
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
        ret.put("espGroupeProjetIdGroupe", getEspGroupeProjetIdGroupe());
        ret.put("espGroupeProjetAnneeDeb", getEspGroupeProjetAnneeDeb());
        ret.put("idEt", getIdEt());
        return ret;
    }

}
