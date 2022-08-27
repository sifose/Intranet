// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="COMMENTAIRE")
public class Commentaire implements Serializable {

    /** Primary key. */
    protected static final String PK = "idCommentaire";

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
    @Column(name="ID_COMMENTAIRE", unique=true, nullable=false, precision=10)
    private BigDecimal idCommentaire;
    @Column(name="COMMENTAIRE_TEXT", length=255)
    private String commentaireText;
    @Column(name="ABSENCE", nullable=false, precision=10)
    private BigDecimal absence;
    @ManyToOne
    @JoinColumn(name="ETD_ID_ET")
    private EspEtudiant espEtudiant;

    /** Default constructor. */
    public Commentaire() {
        super();
    }

    /**
     * Access method for idCommentaire.
     *
     * @return the current value of idCommentaire
     */
    public BigDecimal getIdCommentaire() {
        return idCommentaire;
    }

    /**
     * Setter method for idCommentaire.
     *
     * @param aIdCommentaire the new value for idCommentaire
     */
    public void setIdCommentaire(BigDecimal aIdCommentaire) {
        idCommentaire = aIdCommentaire;
    }

    /**
     * Access method for commentaireText.
     *
     * @return the current value of commentaireText
     */
    public String getCommentaireText() {
        return commentaireText;
    }

    /**
     * Setter method for commentaireText.
     *
     * @param aCommentaireText the new value for commentaireText
     */
    public void setCommentaireText(String aCommentaireText) {
        commentaireText = aCommentaireText;
    }

    /**
     * Access method for absence.
     *
     * @return the current value of absence
     */
    public BigDecimal getAbsence() {
        return absence;
    }

    /**
     * Setter method for absence.
     *
     * @param aAbsence the new value for absence
     */
    public void setAbsence(BigDecimal aAbsence) {
        absence = aAbsence;
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
     * Compares the key for this instance with another Commentaire.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Commentaire and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Commentaire)) {
            return false;
        }
        Commentaire that = (Commentaire) other;
        Object myIdCommentaire = this.getIdCommentaire();
        Object yourIdCommentaire = that.getIdCommentaire();
        if (myIdCommentaire==null ? yourIdCommentaire!=null : !myIdCommentaire.equals(yourIdCommentaire)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Commentaire.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Commentaire)) return false;
        return this.equalKeys(other) && ((Commentaire)other).equalKeys(this);
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
        if (getIdCommentaire() == null) {
            i = 0;
        } else {
            i = getIdCommentaire().hashCode();
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
        StringBuffer sb = new StringBuffer("[Commentaire |");
        sb.append(" idCommentaire=").append(getIdCommentaire());
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
        ret.put("idCommentaire", getIdCommentaire());
        return ret;
    }

}
