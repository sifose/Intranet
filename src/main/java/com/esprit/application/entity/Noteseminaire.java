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

@Entity(name="NOTESEMINAIRE")
public class Noteseminaire implements Serializable {

    /** Primary key. */
    protected static final String PK = "idnote";

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
    @Column(name="IDNOTE", unique=true, nullable=false, precision=10)
    private BigDecimal idnote;
    @Column(name="NOTE", nullable=false, precision=126)
    private double note;
    @Column(name="NOTECONTROLE", nullable=false, precision=126)
    private double notecontrole;
    @ManyToOne
    @JoinColumn(name="SEMINAIRE_IDSEMINAIRE")
    private Seminaire seminaire;
    @ManyToOne
    @JoinColumn(name="ETUDIANT_ID_ET")
    private EspEtudiant espEtudiant;

    /** Default constructor. */
    public Noteseminaire() {
        super();
    }

    /**
     * Access method for idnote.
     *
     * @return the current value of idnote
     */
    public BigDecimal getIdnote() {
        return idnote;
    }

    /**
     * Setter method for idnote.
     *
     * @param aIdnote the new value for idnote
     */
    public void setIdnote(BigDecimal aIdnote) {
        idnote = aIdnote;
    }

    /**
     * Access method for note.
     *
     * @return the current value of note
     */
    public double getNote() {
        return note;
    }

    /**
     * Setter method for note.
     *
     * @param aNote the new value for note
     */
    public void setNote(double aNote) {
        note = aNote;
    }

    /**
     * Access method for notecontrole.
     *
     * @return the current value of notecontrole
     */
    public double getNotecontrole() {
        return notecontrole;
    }

    /**
     * Setter method for notecontrole.
     *
     * @param aNotecontrole the new value for notecontrole
     */
    public void setNotecontrole(double aNotecontrole) {
        notecontrole = aNotecontrole;
    }

    /**
     * Access method for seminaire.
     *
     * @return the current value of seminaire
     */
    public Seminaire getSeminaire() {
        return seminaire;
    }

    /**
     * Setter method for seminaire.
     *
     * @param aSeminaire the new value for seminaire
     */
    public void setSeminaire(Seminaire aSeminaire) {
        seminaire = aSeminaire;
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
     * Compares the key for this instance with another Noteseminaire.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Noteseminaire and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Noteseminaire)) {
            return false;
        }
        Noteseminaire that = (Noteseminaire) other;
        Object myIdnote = this.getIdnote();
        Object yourIdnote = that.getIdnote();
        if (myIdnote==null ? yourIdnote!=null : !myIdnote.equals(yourIdnote)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Noteseminaire.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Noteseminaire)) return false;
        return this.equalKeys(other) && ((Noteseminaire)other).equalKeys(this);
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
        if (getIdnote() == null) {
            i = 0;
        } else {
            i = getIdnote().hashCode();
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
        StringBuffer sb = new StringBuffer("[Noteseminaire |");
        sb.append(" idnote=").append(getIdnote());
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
        ret.put("idnote", getIdnote());
        return ret;
    }

}
