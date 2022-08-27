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

@Entity(name="ESP_REMARQUE_ABSENCE")
@IdClass(EspRemarqueAbsence.EspRemarqueAbsenceId.class)
public class EspRemarqueAbsence implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspRemarqueAbsenceId implements Serializable {
        EspSaisonClasse espSaisonClasse;
  
        EspEtudiant espEtudiant;
        java.lang.String idEns;
        java.time.LocalDateTime dateRemarque;
    }

    /** Primary key. */
    protected static final String PK = "EspRemarqueAbsencePkEspRemarque";

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
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;
    @Id
    @Column(name="DATE_REMARQUE", nullable=false)
    private LocalDateTime dateRemarque;
    @Column(name="LIBELLE_REMARQUE", length=2000)
    private String libelleRemarque;
    @Column(name="ETAT_CONVOCATION", length=30)
    private String etatConvocation;
    @ManyToOne(optional=false)
    @Id
    @JoinColumns ({
    @JoinColumn(name="ANNEE_DEB", nullable=false),
    @JoinColumn(name="SEMESTRE", nullable=false),
    @JoinColumn(name="CODE_CL", nullable=false) })
    private EspSaisonClasse espSaisonClasse;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ID_ET", nullable=false)
    private EspEtudiant espEtudiant;

    /** Default constructor. */
    public EspRemarqueAbsence() {
        super();
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
     * Access method for dateRemarque.
     *
     * @return the current value of dateRemarque
     */
    public LocalDateTime getDateRemarque() {
        return dateRemarque;
    }

    /**
     * Setter method for dateRemarque.
     *
     * @param aDateRemarque the new value for dateRemarque
     */
    public void setDateRemarque(LocalDateTime aDateRemarque) {
        dateRemarque = aDateRemarque;
    }

    /**
     * Access method for libelleRemarque.
     *
     * @return the current value of libelleRemarque
     */
    public String getLibelleRemarque() {
        return libelleRemarque;
    }

    /**
     * Setter method for libelleRemarque.
     *
     * @param aLibelleRemarque the new value for libelleRemarque
     */
    public void setLibelleRemarque(String aLibelleRemarque) {
        libelleRemarque = aLibelleRemarque;
    }

    /**
     * Access method for etatConvocation.
     *
     * @return the current value of etatConvocation
     */
    public String getEtatConvocation() {
        return etatConvocation;
    }

    /**
     * Setter method for etatConvocation.
     *
     * @param aEtatConvocation the new value for etatConvocation
     */
    public void setEtatConvocation(String aEtatConvocation) {
        etatConvocation = aEtatConvocation;
    }

    /**
     * Access method for espSaisonClasse.
     *
     * @return the current value of espSaisonClasse
     */
    public EspSaisonClasse getEspSaisonClasse() {
        return espSaisonClasse;
    }

    /**
     * Setter method for espSaisonClasse.
     *
     * @param aEspSaisonClasse the new value for espSaisonClasse
     */
    public void setEspSaisonClasse(EspSaisonClasse aEspSaisonClasse) {
        espSaisonClasse = aEspSaisonClasse;
    }

    /**
   


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

    /** Temporary value holder for group key fragment espSaisonClasseEspSaisonUniversitaireAnneeDeb */
    private transient String tempEspSaisonClasseEspSaisonUniversitaireAnneeDeb;

    /**
     * Gets the key fragment anneeDeb for member espSaisonClasse.
     * If this.espSaisonClasse is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspSaisonClasseEspSaisonUniversitaireAnneeDeb.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspSaisonUniversitaire
     */
    public String getEspSaisonClasseEspSaisonUniversitaireAnneeDeb() {
        return (getEspSaisonClasse() == null ? tempEspSaisonClasseEspSaisonUniversitaireAnneeDeb : getEspSaisonClasse().getEspSaisonUniversitaireAnneeDeb());
    }

    /**
     * Sets the key fragment anneeDeb from member espSaisonClasse.
     * If this.espSaisonClasse is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspSaisonClasseEspSaisonUniversitaireAnneeDeb.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAnneeDeb New value for the key fragment
     * @see EspSaisonUniversitaire
     */
    public void setEspSaisonClasseEspSaisonUniversitaireAnneeDeb(String aAnneeDeb) {
        if (getEspSaisonClasse() == null) {
            tempEspSaisonClasseEspSaisonUniversitaireAnneeDeb = aAnneeDeb;
        } else {
            getEspSaisonClasse().setEspSaisonUniversitaireAnneeDeb(aAnneeDeb);
        }
    }

    /** Temporary value holder for group key fragment espSaisonClasseSemestre */
    private transient BigDecimal tempEspSaisonClasseSemestre;

    /**
     * Gets the key fragment semestre for member espSaisonClasse.
     * If this.espSaisonClasse is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspSaisonClasseSemestre.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspSaisonClasse
     */
    public BigDecimal getEspSaisonClasseSemestre() {
        return (getEspSaisonClasse() == null ? tempEspSaisonClasseSemestre : getEspSaisonClasse().getSemestre());
    }

    /**
     * Sets the key fragment semestre from member espSaisonClasse.
     * If this.espSaisonClasse is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspSaisonClasseSemestre.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aSemestre New value for the key fragment
     * @see EspSaisonClasse
     */
    public void setEspSaisonClasseSemestre(BigDecimal aSemestre) {
        if (getEspSaisonClasse() == null) {
            tempEspSaisonClasseSemestre = aSemestre;
        } else {
            getEspSaisonClasse().setSemestre(aSemestre);
        }
    }

    /** Temporary value holder for group key fragment espSaisonClasseClasseCodeCl */
    private transient String tempEspSaisonClasseClasseCodeCl;

    /**
     * Gets the key fragment codeCl for member espSaisonClasse.
     * If this.espSaisonClasse is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspSaisonClasseClasseCodeCl.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Classe
     */
    public String getEspSaisonClasseClasseCodeCl() {
        return (getEspSaisonClasse() == null ? tempEspSaisonClasseClasseCodeCl : getEspSaisonClasse().getClasseCodeCl());
    }

    /**
     * Sets the key fragment codeCl from member espSaisonClasse.
     * If this.espSaisonClasse is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspSaisonClasseClasseCodeCl.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeCl New value for the key fragment
     * @see Classe
     */
    public void setEspSaisonClasseClasseCodeCl(String aCodeCl) {
        if (getEspSaisonClasse() == null) {
            tempEspSaisonClasseClasseCodeCl = aCodeCl;
        } else {
            getEspSaisonClasse().setClasseCodeCl(aCodeCl);
        }
    }

    /** Temporary value holder for group key fragment espSaisonClasse2EspSaisonUniversitaireAnneeDeb */
    private transient String tempEspSaisonClasse2EspSaisonUniversitaireAnneeDeb;

    /**
   
    /** Temporary value holder for group key fragment espEtudiantIdEt */
    private transient String tempEspEtudiantIdEt;

    /**
     * Gets the key fragment idEt for member espEtudiant.
     * If this.espEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspEtudiantIdEt.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspEtudiant
     */
    public String getEspEtudiantIdEt() {
        return (getEspEtudiant() == null ? tempEspEtudiantIdEt : getEspEtudiant().getIdEt());
    }

    /**
     * Sets the key fragment idEt from member espEtudiant.
     * If this.espEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspEtudiantIdEt.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdEt New value for the key fragment
     * @see EspEtudiant
     */
    public void setEspEtudiantIdEt(String aIdEt) {
        if (getEspEtudiant() == null) {
            tempEspEtudiantIdEt = aIdEt;
        } else {
            getEspEtudiant().setIdEt(aIdEt);
        }
    }

    /** Temporary value holder for group key fragment espSaisonClasse3EspSaisonUniversitaireAnneeDeb */
    private transient String tempEspSaisonClasse3EspSaisonUniversitaireAnneeDeb;

   
   
    /**
     * Compares the key for this instance with another EspRemarqueAbsence.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspRemarqueAbsence and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspRemarqueAbsence)) {
            return false;
        }
        EspRemarqueAbsence that = (EspRemarqueAbsence) other;
        Object myEspSaisonClasseEspSaisonUniversitaireAnneeDeb = this.getEspSaisonClasseEspSaisonUniversitaireAnneeDeb();
        Object yourEspSaisonClasseEspSaisonUniversitaireAnneeDeb = that.getEspSaisonClasseEspSaisonUniversitaireAnneeDeb();
        if (myEspSaisonClasseEspSaisonUniversitaireAnneeDeb==null ? yourEspSaisonClasseEspSaisonUniversitaireAnneeDeb!=null : !myEspSaisonClasseEspSaisonUniversitaireAnneeDeb.equals(yourEspSaisonClasseEspSaisonUniversitaireAnneeDeb)) {
            return false;
        }
        Object myEspSaisonClasseSemestre = this.getEspSaisonClasseSemestre();
        Object yourEspSaisonClasseSemestre = that.getEspSaisonClasseSemestre();
        if (myEspSaisonClasseSemestre==null ? yourEspSaisonClasseSemestre!=null : !myEspSaisonClasseSemestre.equals(yourEspSaisonClasseSemestre)) {
            return false;
        }
        Object myEspSaisonClasseClasseCodeCl = this.getEspSaisonClasseClasseCodeCl();
        Object yourEspSaisonClasseClasseCodeCl = that.getEspSaisonClasseClasseCodeCl();
        if (myEspSaisonClasseClasseCodeCl==null ? yourEspSaisonClasseClasseCodeCl!=null : !myEspSaisonClasseClasseCodeCl.equals(yourEspSaisonClasseClasseCodeCl)) {
            return false;
        
        }
        Object myEspEtudiantIdEt = this.getEspEtudiantIdEt();
        Object yourEspEtudiantIdEt = that.getEspEtudiantIdEt();
        if (myEspEtudiantIdEt==null ? yourEspEtudiantIdEt!=null : !myEspEtudiantIdEt.equals(yourEspEtudiantIdEt)) {
            return false;
        }
        Object myIdEns = this.getIdEns();
        Object yourIdEns = that.getIdEns();
        if (myIdEns==null ? yourIdEns!=null : !myIdEns.equals(yourIdEns)) {
            return false;
        }
        Object myDateRemarque = this.getDateRemarque();
        Object yourDateRemarque = that.getDateRemarque();
        if (myDateRemarque==null ? yourDateRemarque!=null : !myDateRemarque.equals(yourDateRemarque)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspRemarqueAbsence.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspRemarqueAbsence)) return false;
        return this.equalKeys(other) && ((EspRemarqueAbsence)other).equalKeys(this);
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
        if (getEspSaisonClasseEspSaisonUniversitaireAnneeDeb() == null) {
            i = 0;
        } else {
            i = getEspSaisonClasseEspSaisonUniversitaireAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getEspSaisonClasseSemestre() == null) {
            i = 0;
        } else {
            i = getEspSaisonClasseSemestre().hashCode();
        }
        result = 37*result + i;
        if (getEspSaisonClasseClasseCodeCl() == null) {
            i = 0;
        } else {
            i = getEspSaisonClasseClasseCodeCl().hashCode();
        }
        result = 37*result + i;
        
        if (getEspEtudiantIdEt() == null) {
            i = 0;
        } else {
            i = getEspEtudiantIdEt().hashCode();
        }
        result = 37*result + i;
       
        if (getIdEns() == null) {
            i = 0;
        } else {
            i = getIdEns().hashCode();
        }
        result = 37*result + i;
        if (getDateRemarque() == null) {
            i = 0;
        } else {
            i = getDateRemarque().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspRemarqueAbsence |");
        sb.append(" espSaisonClasseEspSaisonUniversitaireAnneeDeb=").append(getEspSaisonClasseEspSaisonUniversitaireAnneeDeb());
        sb.append(" espSaisonClasseSemestre=").append(getEspSaisonClasseSemestre());
        sb.append(" espSaisonClasseClasseCodeCl=").append(getEspSaisonClasseClasseCodeCl());
        sb.append(" espEtudiantIdEt=").append(getEspEtudiantIdEt());
        sb.append(" idEns=").append(getIdEns());
        sb.append(" dateRemarque=").append(getDateRemarque());
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
        ret.put("espSaisonClasseEspSaisonUniversitaireAnneeDeb", getEspSaisonClasseEspSaisonUniversitaireAnneeDeb());
        ret.put("espSaisonClasseSemestre", getEspSaisonClasseSemestre());
        ret.put("espSaisonClasseClasseCodeCl", getEspSaisonClasseClasseCodeCl());
        ret.put("espEtudiantIdEt", getEspEtudiantIdEt());
        ret.put("idEns", getIdEns());
        ret.put("dateRemarque", getDateRemarque());
        return ret;
    }

}
