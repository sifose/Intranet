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
import javax.persistence.Version;

@Entity(name="RECLAMATIONN")
public class Reclamationn implements Serializable {

    /** Primary key. */
    protected static final String PK = "idReclamtion";

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

    @Column(name="NOM_ENS", nullable=false, length=30)
    private String nomEns;
    @Column(name="ID_ENTETE_RECLAMATION")
    private BigDecimal idEnteteReclamation;
    @Id
    @Column(name="ID_RECLAMTION", unique=true, nullable=false)
    private BigDecimal idReclamtion;
    @Column(name="TRAITER", nullable=false, length=20)
    private String traiter;
    @Column(name="DATE_TRAITEMENT", nullable=false)
    private LocalDateTime dateTraitement;
    @Column(name="DESCRIPTION", nullable=false, length=500)
    private String description;
    @Column(name="UTILISATEUR", nullable=false, length=20)
    private String utilisateur;

    /** Default constructor. */
    public Reclamationn() {
        super();
    }

    /**
     * Access method for nomEns.
     *
     * @return the current value of nomEns
     */
    public String getNomEns() {
        return nomEns;
    }

    /**
     * Setter method for nomEns.
     *
     * @param aNomEns the new value for nomEns
     */
    public void setNomEns(String aNomEns) {
        nomEns = aNomEns;
    }

    /**
     * Access method for idEnteteReclamation.
     *
     * @return the current value of idEnteteReclamation
     */
    public BigDecimal getIdEnteteReclamation() {
        return idEnteteReclamation;
    }

    /**
     * Setter method for idEnteteReclamation.
     *
     * @param aIdEnteteReclamation the new value for idEnteteReclamation
     */
    public void setIdEnteteReclamation(BigDecimal aIdEnteteReclamation) {
        idEnteteReclamation = aIdEnteteReclamation;
    }

    /**
     * Access method for idReclamtion.
     *
     * @return the current value of idReclamtion
     */
    public BigDecimal getIdReclamtion() {
        return idReclamtion;
    }

    /**
     * Setter method for idReclamtion.
     *
     * @param aIdReclamtion the new value for idReclamtion
     */
    public void setIdReclamtion(BigDecimal aIdReclamtion) {
        idReclamtion = aIdReclamtion;
    }

    /**
     * Access method for traiter.
     *
     * @return the current value of traiter
     */
    public String getTraiter() {
        return traiter;
    }

    /**
     * Setter method for traiter.
     *
     * @param aTraiter the new value for traiter
     */
    public void setTraiter(String aTraiter) {
        traiter = aTraiter;
    }

    /**
     * Access method for dateTraitement.
     *
     * @return the current value of dateTraitement
     */
    public LocalDateTime getDateTraitement() {
        return dateTraitement;
    }

    /**
     * Setter method for dateTraitement.
     *
     * @param aDateTraitement the new value for dateTraitement
     */
    public void setDateTraitement(LocalDateTime aDateTraitement) {
        dateTraitement = aDateTraitement;
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
     * Compares the key for this instance with another Reclamationn.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Reclamationn and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Reclamationn)) {
            return false;
        }
        Reclamationn that = (Reclamationn) other;
        Object myIdReclamtion = this.getIdReclamtion();
        Object yourIdReclamtion = that.getIdReclamtion();
        if (myIdReclamtion==null ? yourIdReclamtion!=null : !myIdReclamtion.equals(yourIdReclamtion)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Reclamationn.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Reclamationn)) return false;
        return this.equalKeys(other) && ((Reclamationn)other).equalKeys(this);
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
        if (getIdReclamtion() == null) {
            i = 0;
        } else {
            i = getIdReclamtion().hashCode();
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
        StringBuffer sb = new StringBuffer("[Reclamationn |");
        sb.append(" idReclamtion=").append(getIdReclamtion());
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
        ret.put("idReclamtion", getIdReclamtion());
        return ret;
    }

}
