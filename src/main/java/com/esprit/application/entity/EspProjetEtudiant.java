// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="ESP_PROJET_ETUDIANT")
@IdClass(EspProjetEtudiant.EspProjetEtudiantId.class)
public class EspProjetEtudiant implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspProjetEtudiantId implements Serializable {
        java.lang.String idProjet;
        java.lang.String idEt;
    }

    /** Primary key. */
    protected static final String PK = "EspProjetEtudiantKeyProjEt";

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
    @Column(name="ID_PROJET", nullable=false, length=10)
    private String idProjet;
    @Id
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;

    /** Default constructor. */
    public EspProjetEtudiant() {
        super();
    }

    /**
     * Access method for idProjet.
     *
     * @return the current value of idProjet
     */
    public String getIdProjet() {
        return idProjet;
    }

    /**
     * Setter method for idProjet.
     *
     * @param aIdProjet the new value for idProjet
     */
    public void setIdProjet(String aIdProjet) {
        idProjet = aIdProjet;
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
     * Access method for dateSaisie.
     *
     * @return the current value of dateSaisie
     */
    public LocalDateTime getDateSaisie() {
        return dateSaisie;
    }

    /**
     * Setter method for dateSaisie.
     *
     * @param aDateSaisie the new value for dateSaisie
     */
    public void setDateSaisie(LocalDateTime aDateSaisie) {
        dateSaisie = aDateSaisie;
    }

    /**
     * Compares the key for this instance with another EspProjetEtudiant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspProjetEtudiant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspProjetEtudiant)) {
            return false;
        }
        EspProjetEtudiant that = (EspProjetEtudiant) other;
        Object myIdProjet = this.getIdProjet();
        Object yourIdProjet = that.getIdProjet();
        if (myIdProjet==null ? yourIdProjet!=null : !myIdProjet.equals(yourIdProjet)) {
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
     * Compares this instance with another EspProjetEtudiant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspProjetEtudiant)) return false;
        return this.equalKeys(other) && ((EspProjetEtudiant)other).equalKeys(this);
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
        if (getIdProjet() == null) {
            i = 0;
        } else {
            i = getIdProjet().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspProjetEtudiant |");
        sb.append(" idProjet=").append(getIdProjet());
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
        ret.put("idProjet", getIdProjet());
        ret.put("idEt", getIdEt());
        return ret;
    }

}
