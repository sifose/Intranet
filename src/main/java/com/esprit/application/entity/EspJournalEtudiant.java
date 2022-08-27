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

@Entity(name="ESP_JOURNAL_ETUDIANT")
@IdClass(EspJournalEtudiant.EspJournalEtudiantId.class)
public class EspJournalEtudiant implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspJournalEtudiantId implements Serializable {
        java.lang.String idEt;
        java.lang.String nomColonne;
        java.lang.String typeOp;
        java.time.LocalDateTime dateOp;
    }

    /** Primary key. */
    protected static final String PK = "EspJournalEtudiantPkEspJournalEtudiant";

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
    @Id
    @Column(name="NOM_COLONNE", nullable=false, length=40)
    private String nomColonne;
    @Id
    @Column(name="TYPE_OP", nullable=false, length=1)
    private String typeOp;
    @Id
    @Column(name="DATE_OP", nullable=false)
    private LocalDateTime dateOp;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Column(name="VALEUR_INIT", length=30)
    private String valeurInit;
    @Column(name="VALEUR_FINAL", length=30)
    private String valeurFinal;

    /** Default constructor. */
    public EspJournalEtudiant() {
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
     * Access method for nomColonne.
     *
     * @return the current value of nomColonne
     */
    public String getNomColonne() {
        return nomColonne;
    }

    /**
     * Setter method for nomColonne.
     *
     * @param aNomColonne the new value for nomColonne
     */
    public void setNomColonne(String aNomColonne) {
        nomColonne = aNomColonne;
    }

    /**
     * Access method for typeOp.
     *
     * @return the current value of typeOp
     */
    public String getTypeOp() {
        return typeOp;
    }

    /**
     * Setter method for typeOp.
     *
     * @param aTypeOp the new value for typeOp
     */
    public void setTypeOp(String aTypeOp) {
        typeOp = aTypeOp;
    }

    /**
     * Access method for dateOp.
     *
     * @return the current value of dateOp
     */
    public LocalDateTime getDateOp() {
        return dateOp;
    }

    /**
     * Setter method for dateOp.
     *
     * @param aDateOp the new value for dateOp
     */
    public void setDateOp(LocalDateTime aDateOp) {
        dateOp = aDateOp;
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
     * Access method for valeurInit.
     *
     * @return the current value of valeurInit
     */
    public String getValeurInit() {
        return valeurInit;
    }

    /**
     * Setter method for valeurInit.
     *
     * @param aValeurInit the new value for valeurInit
     */
    public void setValeurInit(String aValeurInit) {
        valeurInit = aValeurInit;
    }

    /**
     * Access method for valeurFinal.
     *
     * @return the current value of valeurFinal
     */
    public String getValeurFinal() {
        return valeurFinal;
    }

    /**
     * Setter method for valeurFinal.
     *
     * @param aValeurFinal the new value for valeurFinal
     */
    public void setValeurFinal(String aValeurFinal) {
        valeurFinal = aValeurFinal;
    }

    /**
     * Compares the key for this instance with another EspJournalEtudiant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspJournalEtudiant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspJournalEtudiant)) {
            return false;
        }
        EspJournalEtudiant that = (EspJournalEtudiant) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myNomColonne = this.getNomColonne();
        Object yourNomColonne = that.getNomColonne();
        if (myNomColonne==null ? yourNomColonne!=null : !myNomColonne.equals(yourNomColonne)) {
            return false;
        }
        Object myTypeOp = this.getTypeOp();
        Object yourTypeOp = that.getTypeOp();
        if (myTypeOp==null ? yourTypeOp!=null : !myTypeOp.equals(yourTypeOp)) {
            return false;
        }
        Object myDateOp = this.getDateOp();
        Object yourDateOp = that.getDateOp();
        if (myDateOp==null ? yourDateOp!=null : !myDateOp.equals(yourDateOp)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspJournalEtudiant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspJournalEtudiant)) return false;
        return this.equalKeys(other) && ((EspJournalEtudiant)other).equalKeys(this);
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
        if (getIdEt() == null) {
            i = 0;
        } else {
            i = getIdEt().hashCode();
        }
        result = 37*result + i;
        if (getNomColonne() == null) {
            i = 0;
        } else {
            i = getNomColonne().hashCode();
        }
        result = 37*result + i;
        if (getTypeOp() == null) {
            i = 0;
        } else {
            i = getTypeOp().hashCode();
        }
        result = 37*result + i;
        if (getDateOp() == null) {
            i = 0;
        } else {
            i = getDateOp().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspJournalEtudiant |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" nomColonne=").append(getNomColonne());
        sb.append(" typeOp=").append(getTypeOp());
        sb.append(" dateOp=").append(getDateOp());
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
        ret.put("idEt", getIdEt());
        ret.put("nomColonne", getNomColonne());
        ret.put("typeOp", getTypeOp());
        ret.put("dateOp", getDateOp());
        return ret;
    }

}
