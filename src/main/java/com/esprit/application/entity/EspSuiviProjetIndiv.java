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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_SUIVI_PROJET_INDIV")
@IdClass(EspSuiviProjetIndiv.EspSuiviProjetIndivId.class)
public class EspSuiviProjetIndiv implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspSuiviProjetIndivId implements Serializable {
        EspAffGroupEtudiant espAffGroupEtudiant;
        java.time.LocalDateTime dateSuivi;
    }

    /** Primary key. */
    protected static final String PK = "EspSuiviProjetIndivPkSuiviEt";

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
    @Column(name="DATE_SUIVI", nullable=false)
    private LocalDateTime dateSuivi;
    @Column(name="HEURE_DEB", length=4)
    private String heureDeb;
    @Column(name="HEURE_FIN", length=4)
    private String heureFin;
    @Column(name="NOTE_COMM", precision=5, scale=2)
    private BigDecimal noteComm;
    @Column(name="NOTE_TECHNIQUE", precision=5, scale=2)
    private BigDecimal noteTechnique;
    @Column(name="NOTE_REDACTION", precision=5, scale=2)
    private BigDecimal noteRedaction;
    @Column(name="NOTE_MOTIVATION", precision=5, scale=2)
    private BigDecimal noteMotivation;
    @Column(name="ABSENT", length=1)
    private String absent;
    @Column(name="OBSERVATION", length=100)
    private String observation;
    @ManyToOne(optional=false)
    @Id
    @JoinColumns ({
    @JoinColumn(name="ID_GROUPE", nullable=false),
    @JoinColumn(name="ANNEE_DEB", nullable=false),
    @JoinColumn(name="ID_ET", nullable=false) })
    private EspAffGroupEtudiant espAffGroupEtudiant;

    /** Default constructor. */
    public EspSuiviProjetIndiv() {
        super();
    }

    /**
     * Access method for dateSuivi.
     *
     * @return the current value of dateSuivi
     */
    public LocalDateTime getDateSuivi() {
        return dateSuivi;
    }

    /**
     * Setter method for dateSuivi.
     *
     * @param aDateSuivi the new value for dateSuivi
     */
    public void setDateSuivi(LocalDateTime aDateSuivi) {
        dateSuivi = aDateSuivi;
    }

    /**
     * Access method for heureDeb.
     *
     * @return the current value of heureDeb
     */
    public String getHeureDeb() {
        return heureDeb;
    }

    /**
     * Setter method for heureDeb.
     *
     * @param aHeureDeb the new value for heureDeb
     */
    public void setHeureDeb(String aHeureDeb) {
        heureDeb = aHeureDeb;
    }

    /**
     * Access method for heureFin.
     *
     * @return the current value of heureFin
     */
    public String getHeureFin() {
        return heureFin;
    }

    /**
     * Setter method for heureFin.
     *
     * @param aHeureFin the new value for heureFin
     */
    public void setHeureFin(String aHeureFin) {
        heureFin = aHeureFin;
    }

    /**
     * Access method for noteComm.
     *
     * @return the current value of noteComm
     */
    public BigDecimal getNoteComm() {
        return noteComm;
    }

    /**
     * Setter method for noteComm.
     *
     * @param aNoteComm the new value for noteComm
     */
    public void setNoteComm(BigDecimal aNoteComm) {
        noteComm = aNoteComm;
    }

    /**
     * Access method for noteTechnique.
     *
     * @return the current value of noteTechnique
     */
    public BigDecimal getNoteTechnique() {
        return noteTechnique;
    }

    /**
     * Setter method for noteTechnique.
     *
     * @param aNoteTechnique the new value for noteTechnique
     */
    public void setNoteTechnique(BigDecimal aNoteTechnique) {
        noteTechnique = aNoteTechnique;
    }

    /**
     * Access method for noteRedaction.
     *
     * @return the current value of noteRedaction
     */
    public BigDecimal getNoteRedaction() {
        return noteRedaction;
    }

    /**
     * Setter method for noteRedaction.
     *
     * @param aNoteRedaction the new value for noteRedaction
     */
    public void setNoteRedaction(BigDecimal aNoteRedaction) {
        noteRedaction = aNoteRedaction;
    }

    /**
     * Access method for noteMotivation.
     *
     * @return the current value of noteMotivation
     */
    public BigDecimal getNoteMotivation() {
        return noteMotivation;
    }

    /**
     * Setter method for noteMotivation.
     *
     * @param aNoteMotivation the new value for noteMotivation
     */
    public void setNoteMotivation(BigDecimal aNoteMotivation) {
        noteMotivation = aNoteMotivation;
    }

    /**
     * Access method for absent.
     *
     * @return the current value of absent
     */
    public String getAbsent() {
        return absent;
    }

    /**
     * Setter method for absent.
     *
     * @param aAbsent the new value for absent
     */
    public void setAbsent(String aAbsent) {
        absent = aAbsent;
    }

    /**
     * Access method for observation.
     *
     * @return the current value of observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * Setter method for observation.
     *
     * @param aObservation the new value for observation
     */
    public void setObservation(String aObservation) {
        observation = aObservation;
    }

    /**
     * Access method for espAffGroupEtudiant.
     *
     * @return the current value of espAffGroupEtudiant
     */
    public EspAffGroupEtudiant getEspAffGroupEtudiant() {
        return espAffGroupEtudiant;
    }

    /**
     * Setter method for espAffGroupEtudiant.
     *
     * @param aEspAffGroupEtudiant the new value for espAffGroupEtudiant
     */
    public void setEspAffGroupEtudiant(EspAffGroupEtudiant aEspAffGroupEtudiant) {
        espAffGroupEtudiant = aEspAffGroupEtudiant;
    }

  
    

    /** Temporary value holder for group key fragment espAffGroupEtudiantEspGroupeProjetAnneeDeb */
    private transient String tempEspAffGroupEtudiantEspGroupeProjetAnneeDeb;

    /**
     * Gets the key fragment anneeDeb for member espAffGroupEtudiant.
     * If this.espAffGroupEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspAffGroupEtudiantEspGroupeProjetAnneeDeb.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspGroupeProjet
     */
    public String getEspAffGroupEtudiantEspGroupeProjetAnneeDeb() {
        return (getEspAffGroupEtudiant() == null ? tempEspAffGroupEtudiantEspGroupeProjetAnneeDeb : getEspAffGroupEtudiant().getEspGroupeProjetAnneeDeb());
    }

    /**
     * Sets the key fragment anneeDeb from member espAffGroupEtudiant.
     * If this.espAffGroupEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspAffGroupEtudiantEspGroupeProjetAnneeDeb.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAnneeDeb New value for the key fragment
     * @see EspGroupeProjet
     */
    public void setEspAffGroupEtudiantEspGroupeProjetAnneeDeb(String aAnneeDeb) {
        if (getEspAffGroupEtudiant() == null) {
            tempEspAffGroupEtudiantEspGroupeProjetAnneeDeb = aAnneeDeb;
        } else {
            getEspAffGroupEtudiant().setEspGroupeProjetAnneeDeb(aAnneeDeb);
        }
    }

    /** Temporary value holder for group key fragment espAffGroupEtudiantEspGroupeProjet2IdGroupe */
    private transient String tempEspAffGroupEtudiantEspGroupeProjet2IdGroupe;

 



    /** Temporary value holder for group key fragment espAffGroupEtudiantIdEt */
    private transient String tempEspAffGroupEtudiantIdEt;

    /**
     * Gets the key fragment idEt for member espAffGroupEtudiant.
     * If this.espAffGroupEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspAffGroupEtudiantIdEt.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspAffGroupEtudiant
     */
    public String getEspAffGroupEtudiantIdEt() {
        return (getEspAffGroupEtudiant() == null ? tempEspAffGroupEtudiantIdEt : getEspAffGroupEtudiant().getIdEt());
    }

    /**
     * Sets the key fragment idEt from member espAffGroupEtudiant.
     * If this.espAffGroupEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspAffGroupEtudiantIdEt.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdEt New value for the key fragment
     * @see EspAffGroupEtudiant
     */
    public void setEspAffGroupEtudiantIdEt(String aIdEt) {
        if (getEspAffGroupEtudiant() == null) {
            tempEspAffGroupEtudiantIdEt = aIdEt;
        } else {
            getEspAffGroupEtudiant().setIdEt(aIdEt);
        }
    }

    /** Temporary value holder for group key fragment espAffGroupEtudiant2EspGroupeProjetIdGroupe */
    private transient String tempEspAffGroupEtudiant2EspGroupeProjetIdGroupe;

  
    /**
     * Compares the key for this instance with another EspSuiviProjetIndiv.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspSuiviProjetIndiv and the key objects are equal
     */
   
    
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EspSuiviProjetIndiv |");
        sb.append(" espAffGroupEtudiantEspGroupeProjetAnneeDeb=").append(getEspAffGroupEtudiantEspGroupeProjetAnneeDeb());
        sb.append(" espAffGroupEtudiantIdEt=").append(getEspAffGroupEtudiantIdEt());
        sb.append(" dateSuivi=").append(getDateSuivi());
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
        ret.put("espAffGroupEtudiantIdEt", getEspAffGroupEtudiantIdEt());
        ret.put("dateSuivi", getDateSuivi());
        return ret;
    }

}
