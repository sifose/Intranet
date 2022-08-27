// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
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

@Entity(name="ESP_GROUPE_PROJET")
@IdClass(EspGroupeProjet.EspGroupeProjetId.class)
public class EspGroupeProjet implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspGroupeProjetId implements Serializable {
        java.lang.String idGroupe;
        java.lang.String anneeDeb;
    }

    /** Primary key. */
    protected static final String PK = "EspGroupeProjetPkGroupePr";

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
    @Column(name="ID_GROUPE", nullable=false, length=10)
    private String idGroupe;
    @Column(name="NOM_GROUPE", length=30)
    private String nomGroupe;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=10)
    private String anneeDeb;
    @OneToMany(mappedBy="espGroupeProjet")
    private Set<EspAffGroupEtudiant> espAffGroupEtudiant;
    
    @ManyToOne
    @JoinColumn(name="CODE_CL")
    private Classe classe;
    @ManyToOne
    @JoinColumn(name="ID_PROJET")
    private EspProjet espProjet;

    /** Default constructor. */
    public EspGroupeProjet() {
        super();
    }

    /**
     * Access method for idGroupe.
     *
     * @return the current value of idGroupe
     */
    public String getIdGroupe() {
        return idGroupe;
    }

    /**
     * Setter method for idGroupe.
     *
     * @param aIdGroupe the new value for idGroupe
     */
    public void setIdGroupe(String aIdGroupe) {
        idGroupe = aIdGroupe;
    }

    /**
     * Access method for nomGroupe.
     *
     * @return the current value of nomGroupe
     */
    public String getNomGroupe() {
        return nomGroupe;
    }

    /**
     * Setter method for nomGroupe.
     *
     * @param aNomGroupe the new value for nomGroupe
     */
    public void setNomGroupe(String aNomGroupe) {
        nomGroupe = aNomGroupe;
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
     * Access method for espAffGroupEtudiant.
     *
     * @return the current value of espAffGroupEtudiant
     */
    public Set<EspAffGroupEtudiant> getEspAffGroupEtudiant() {
        return espAffGroupEtudiant;
    }

    /**
     * Setter method for espAffGroupEtudiant.
     *
     * @param aEspAffGroupEtudiant the new value for espAffGroupEtudiant
     */
    public void setEspAffGroupEtudiant(Set<EspAffGroupEtudiant> aEspAffGroupEtudiant) {
        espAffGroupEtudiant = aEspAffGroupEtudiant;
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
     * Access method for espProjet.
     *
     * @return the current value of espProjet
     */
    public EspProjet getEspProjet() {
        return espProjet;
    }

    /**
     * Setter method for espProjet.
     *
     * @param aEspProjet the new value for espProjet
     */
    public void setEspProjet(EspProjet aEspProjet) {
        espProjet = aEspProjet;
    }

    /**
     * Compares the key for this instance with another EspGroupeProjet.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspGroupeProjet and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspGroupeProjet)) {
            return false;
        }
        EspGroupeProjet that = (EspGroupeProjet) other;
        Object myIdGroupe = this.getIdGroupe();
        Object yourIdGroupe = that.getIdGroupe();
        if (myIdGroupe==null ? yourIdGroupe!=null : !myIdGroupe.equals(yourIdGroupe)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspGroupeProjet.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspGroupeProjet)) return false;
        return this.equalKeys(other) && ((EspGroupeProjet)other).equalKeys(this);
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
        if (getIdGroupe() == null) {
            i = 0;
        } else {
            i = getIdGroupe().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspGroupeProjet |");
        sb.append(" idGroupe=").append(getIdGroupe());
        sb.append(" anneeDeb=").append(getAnneeDeb());
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
        ret.put("idGroupe", getIdGroupe());
        ret.put("anneeDeb", getAnneeDeb());
        return ret;
    }

}
