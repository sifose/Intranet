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
import javax.persistence.Version;

@Entity(name="ESP_ENTETE_NOTE_RAT")
@IdClass(EspEnteteNoteRat.EspEnteteNoteRatId.class)
public class EspEnteteNoteRat implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspEnteteNoteRatId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String codeModule;
        java.lang.String typeRat;
        java.time.LocalDateTime dateDeroulement;
    }

    /** Primary key. */
    protected static final String PK = "EspEnteteNoteRatPkEnteteNoteRat";

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
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Id
    @Column(name="CODE_MODULE", nullable=false, length=10)
    private String codeModule;
    @Id
    @Column(name="TYPE_RAT", nullable=false, length=1)
    private String typeRat;
    @Id
    @Column(name="DATE_DEROULEMENT", nullable=false)
    private LocalDateTime dateDeroulement;
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="SEMESTRE", precision=1)
    private BigDecimal semestre;
    @Column(name="NB_HEURE", precision=3, scale=1)
    private BigDecimal nbHeure;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Column(name="OBSERVATION", length=500)
    private String observation;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;

    /** Default constructor. */
    public EspEnteteNoteRat() {
        super();
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
     * Access method for codeModule.
     *
     * @return the current value of codeModule
     */
    public String getCodeModule() {
        return codeModule;
    }

    /**
     * Setter method for codeModule.
     *
     * @param aCodeModule the new value for codeModule
     */
    public void setCodeModule(String aCodeModule) {
        codeModule = aCodeModule;
    }

    /**
     * Access method for typeRat.
     *
     * @return the current value of typeRat
     */
    public String getTypeRat() {
        return typeRat;
    }

    /**
     * Setter method for typeRat.
     *
     * @param aTypeRat the new value for typeRat
     */
    public void setTypeRat(String aTypeRat) {
        typeRat = aTypeRat;
    }

    /**
     * Access method for dateDeroulement.
     *
     * @return the current value of dateDeroulement
     */
    public LocalDateTime getDateDeroulement() {
        return dateDeroulement;
    }

    /**
     * Setter method for dateDeroulement.
     *
     * @param aDateDeroulement the new value for dateDeroulement
     */
    public void setDateDeroulement(LocalDateTime aDateDeroulement) {
        dateDeroulement = aDateDeroulement;
    }

    /**
     * Access method for idEns.
     *
     * @return the current value of idEns
     */
    public String getIdEns() {
        return idEns;
    }

    /**
     * Setter method for idEns.
     *
     * @param aIdEns the new value for idEns
     */
    public void setIdEns(String aIdEns) {
        idEns = aIdEns;
    }

    /**
     * Access method for semestre.
     *
     * @return the current value of semestre
     */
    public BigDecimal getSemestre() {
        return semestre;
    }

    /**
     * Setter method for semestre.
     *
     * @param aSemestre the new value for semestre
     */
    public void setSemestre(BigDecimal aSemestre) {
        semestre = aSemestre;
    }

    /**
     * Access method for nbHeure.
     *
     * @return the current value of nbHeure
     */
    public BigDecimal getNbHeure() {
        return nbHeure;
    }

    /**
     * Setter method for nbHeure.
     *
     * @param aNbHeure the new value for nbHeure
     */
    public void setNbHeure(BigDecimal aNbHeure) {
        nbHeure = aNbHeure;
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
     * Compares the key for this instance with another EspEnteteNoteRat.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspEnteteNoteRat and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspEnteteNoteRat)) {
            return false;
        }
        EspEnteteNoteRat that = (EspEnteteNoteRat) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myCodeModule = this.getCodeModule();
        Object yourCodeModule = that.getCodeModule();
        if (myCodeModule==null ? yourCodeModule!=null : !myCodeModule.equals(yourCodeModule)) {
            return false;
        }
        Object myTypeRat = this.getTypeRat();
        Object yourTypeRat = that.getTypeRat();
        if (myTypeRat==null ? yourTypeRat!=null : !myTypeRat.equals(yourTypeRat)) {
            return false;
        }
        Object myDateDeroulement = this.getDateDeroulement();
        Object yourDateDeroulement = that.getDateDeroulement();
        if (myDateDeroulement==null ? yourDateDeroulement!=null : !myDateDeroulement.equals(yourDateDeroulement)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspEnteteNoteRat.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspEnteteNoteRat)) return false;
        return this.equalKeys(other) && ((EspEnteteNoteRat)other).equalKeys(this);
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
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getCodeModule() == null) {
            i = 0;
        } else {
            i = getCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getTypeRat() == null) {
            i = 0;
        } else {
            i = getTypeRat().hashCode();
        }
        result = 37*result + i;
        if (getDateDeroulement() == null) {
            i = 0;
        } else {
            i = getDateDeroulement().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspEnteteNoteRat |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" codeModule=").append(getCodeModule());
        sb.append(" typeRat=").append(getTypeRat());
        sb.append(" dateDeroulement=").append(getDateDeroulement());
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
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("codeModule", getCodeModule());
        ret.put("typeRat", getTypeRat());
        ret.put("dateDeroulement", getDateDeroulement());
        return ret;
    }

}
