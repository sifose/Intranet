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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_ABSENCE")
public class EspAbsence implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

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
    @Column(name="ID", unique=true, nullable=false, precision=38)
    private BigDecimal id;
    @Column(name="ID_PROF", length=10)
    private String idProf;
    @Column(name="ID_CLASSE", length=10)
    private String idClasse;
    @Column(name="JUSTIFIER", length=100)
    private String justifier;
    @Column(name="MOTIF", length=100)
    private String motif;
    @Column(name="CRENAUX", precision=38)
    private BigDecimal crenaux;
    @Column(name="ID_DATE")
    private LocalDateTime idDate;
    @Column(name="ANNEE_DEB", length=10)
    private String anneeDeb;
    @Column(name="SEMESTRE", length=20)
    private String semestre;
    @Column(name="REMARQUE", length=50)
    private String remarque;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @ManyToOne
    @JoinColumn(name="ID_ELEVE")
    private EspEtudiant espEtudiant;
    @ManyToOne
    @JoinColumn(name="ID_MAT")
    private EspModule espModule;

    /** Default constructor. */
    public EspAbsence() {
        super();
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(BigDecimal aId) {
        id = aId;
    }

    /**
     * Access method for idProf.
     *
     * @return the current value of idProf
     */
    public String getIdProf() {
        return idProf;
    }

    /**
     * Setter method for idProf.
     *
     * @param aIdProf the new value for idProf
     */
    public void setIdProf(String aIdProf) {
        idProf = aIdProf;
    }

    /**
     * Access method for idClasse.
     *
     * @return the current value of idClasse
     */
    public String getIdClasse() {
        return idClasse;
    }

    /**
     * Setter method for idClasse.
     *
     * @param aIdClasse the new value for idClasse
     */
    public void setIdClasse(String aIdClasse) {
        idClasse = aIdClasse;
    }

    /**
     * Access method for justifier.
     *
     * @return the current value of justifier
     */
    public String getJustifier() {
        return justifier;
    }

    /**
     * Setter method for justifier.
     *
     * @param aJustifier the new value for justifier
     */
    public void setJustifier(String aJustifier) {
        justifier = aJustifier;
    }

    /**
     * Access method for motif.
     *
     * @return the current value of motif
     */
    public String getMotif() {
        return motif;
    }

    /**
     * Setter method for motif.
     *
     * @param aMotif the new value for motif
     */
    public void setMotif(String aMotif) {
        motif = aMotif;
    }

    /**
     * Access method for crenaux.
     *
     * @return the current value of crenaux
     */
    public BigDecimal getCrenaux() {
        return crenaux;
    }

    /**
     * Setter method for crenaux.
     *
     * @param aCrenaux the new value for crenaux
     */
    public void setCrenaux(BigDecimal aCrenaux) {
        crenaux = aCrenaux;
    }

    /**
     * Access method for idDate.
     *
     * @return the current value of idDate
     */
    public LocalDateTime getIdDate() {
        return idDate;
    }

    /**
     * Setter method for idDate.
     *
     * @param aIdDate the new value for idDate
     */
    public void setIdDate(LocalDateTime aIdDate) {
        idDate = aIdDate;
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
     * Access method for semestre.
     *
     * @return the current value of semestre
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * Setter method for semestre.
     *
     * @param aSemestre the new value for semestre
     */
    public void setSemestre(String aSemestre) {
        semestre = aSemestre;
    }

    /**
     * Access method for remarque.
     *
     * @return the current value of remarque
     */
    public String getRemarque() {
        return remarque;
    }

    /**
     * Setter method for remarque.
     *
     * @param aRemarque the new value for remarque
     */
    public void setRemarque(String aRemarque) {
        remarque = aRemarque;
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

    /**
     * Compares the key for this instance with another EspAbsence.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspAbsence and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspAbsence)) {
            return false;
        }
        EspAbsence that = (EspAbsence) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspAbsence.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspAbsence)) return false;
        return this.equalKeys(other) && ((EspAbsence)other).equalKeys(this);
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
        if (getId() == null) {
            i = 0;
        } else {
            i = getId().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspAbsence |");
        sb.append(" id=").append(getId());
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
        ret.put("id", getId());
        return ret;
    }

}
