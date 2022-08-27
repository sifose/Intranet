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
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_CONVOCATION")
@IdClass(EspConvocation.EspConvocationId.class)
public class EspConvocation implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspConvocationId implements Serializable {
        java.lang.String anneeDeb;
        EspEtudiant espEtudiant;
        java.time.LocalDateTime dateGeneration;
    }

    /** Primary key. */
    protected static final String PK = "EspConvocationPkConvocation";

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
    @Column(name="ANNEE_DEB", nullable=false, length=10)
    private String anneeDeb;
    @Column(name="DATE_CONVOCATION")
    private LocalDateTime dateConvocation;
    @Column(name="MOTIF_CONVOCATION", length=2)
    private String motifConvocation;
    @Column(name="MODE_CONVOCATION", length=2)
    private String modeConvocation;
    @Column(name="REPONSE_ET", length=1)
    private String reponseEt;
    @Column(name="DATE_RECEPTION")
    private LocalDateTime dateReception;
    @Column(name="CONVOCATION_PARENT", length=1)
    private String convocationParent;
    @Column(name="OBSERVATION", length=1000)
    private String observation;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Column(name="GENERATION", length=1)
    private String generation;
    @Column(name="DATE_ENVOI_MAIL_TEL")
    private LocalDateTime dateEnvoiMailTel;
    @Id
    @Column(name="DATE_GENERATION", nullable=false)
    private LocalDateTime dateGeneration;
    @Column(name="MOIS_GEN", length=2)
    private String moisGen;
    @Column(name="MOYENNE", precision=5, scale=2)
    private BigDecimal moyenne;
    @Column(name="NB_MIN_JOUR", precision=3)
    private BigDecimal nbMinJour;
    @Column(name="NB_MIN_SEANCE", precision=3)
    private BigDecimal nbMinSeance;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ID_ET", nullable=false)
    private EspEtudiant espEtudiant;

    /** Default constructor. */
    public EspConvocation() {
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
     * Access method for dateConvocation.
     *
     * @return the current value of dateConvocation
     */
    public LocalDateTime getDateConvocation() {
        return dateConvocation;
    }

    /**
     * Setter method for dateConvocation.
     *
     * @param aDateConvocation the new value for dateConvocation
     */
    public void setDateConvocation(LocalDateTime aDateConvocation) {
        dateConvocation = aDateConvocation;
    }

    /**
     * Access method for motifConvocation.
     *
     * @return the current value of motifConvocation
     */
    public String getMotifConvocation() {
        return motifConvocation;
    }

    /**
     * Setter method for motifConvocation.
     *
     * @param aMotifConvocation the new value for motifConvocation
     */
    public void setMotifConvocation(String aMotifConvocation) {
        motifConvocation = aMotifConvocation;
    }

    /**
     * Access method for modeConvocation.
     *
     * @return the current value of modeConvocation
     */
    public String getModeConvocation() {
        return modeConvocation;
    }

    /**
     * Setter method for modeConvocation.
     *
     * @param aModeConvocation the new value for modeConvocation
     */
    public void setModeConvocation(String aModeConvocation) {
        modeConvocation = aModeConvocation;
    }

    /**
     * Access method for reponseEt.
     *
     * @return the current value of reponseEt
     */
    public String getReponseEt() {
        return reponseEt;
    }

    /**
     * Setter method for reponseEt.
     *
     * @param aReponseEt the new value for reponseEt
     */
    public void setReponseEt(String aReponseEt) {
        reponseEt = aReponseEt;
    }

    /**
     * Access method for dateReception.
     *
     * @return the current value of dateReception
     */
    public LocalDateTime getDateReception() {
        return dateReception;
    }

    /**
     * Setter method for dateReception.
     *
     * @param aDateReception the new value for dateReception
     */
    public void setDateReception(LocalDateTime aDateReception) {
        dateReception = aDateReception;
    }

    /**
     * Access method for convocationParent.
     *
     * @return the current value of convocationParent
     */
    public String getConvocationParent() {
        return convocationParent;
    }

    /**
     * Setter method for convocationParent.
     *
     * @param aConvocationParent the new value for convocationParent
     */
    public void setConvocationParent(String aConvocationParent) {
        convocationParent = aConvocationParent;
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
     * Access method for generation.
     *
     * @return the current value of generation
     */
    public String getGeneration() {
        return generation;
    }

    /**
     * Setter method for generation.
     *
     * @param aGeneration the new value for generation
     */
    public void setGeneration(String aGeneration) {
        generation = aGeneration;
    }

    /**
     * Access method for dateEnvoiMailTel.
     *
     * @return the current value of dateEnvoiMailTel
     */
    public LocalDateTime getDateEnvoiMailTel() {
        return dateEnvoiMailTel;
    }

    /**
     * Setter method for dateEnvoiMailTel.
     *
     * @param aDateEnvoiMailTel the new value for dateEnvoiMailTel
     */
    public void setDateEnvoiMailTel(LocalDateTime aDateEnvoiMailTel) {
        dateEnvoiMailTel = aDateEnvoiMailTel;
    }

    /**
     * Access method for dateGeneration.
     *
     * @return the current value of dateGeneration
     */
    public LocalDateTime getDateGeneration() {
        return dateGeneration;
    }

    /**
     * Setter method for dateGeneration.
     *
     * @param aDateGeneration the new value for dateGeneration
     */
    public void setDateGeneration(LocalDateTime aDateGeneration) {
        dateGeneration = aDateGeneration;
    }

    /**
     * Access method for moisGen.
     *
     * @return the current value of moisGen
     */
    public String getMoisGen() {
        return moisGen;
    }

    /**
     * Setter method for moisGen.
     *
     * @param aMoisGen the new value for moisGen
     */
    public void setMoisGen(String aMoisGen) {
        moisGen = aMoisGen;
    }

    /**
     * Access method for moyenne.
     *
     * @return the current value of moyenne
     */
    public BigDecimal getMoyenne() {
        return moyenne;
    }

    /**
     * Setter method for moyenne.
     *
     * @param aMoyenne the new value for moyenne
     */
    public void setMoyenne(BigDecimal aMoyenne) {
        moyenne = aMoyenne;
    }

    /**
     * Access method for nbMinJour.
     *
     * @return the current value of nbMinJour
     */
    public BigDecimal getNbMinJour() {
        return nbMinJour;
    }

    /**
     * Setter method for nbMinJour.
     *
     * @param aNbMinJour the new value for nbMinJour
     */
    public void setNbMinJour(BigDecimal aNbMinJour) {
        nbMinJour = aNbMinJour;
    }

    /**
     * Access method for nbMinSeance.
     *
     * @return the current value of nbMinSeance
     */
    public BigDecimal getNbMinSeance() {
        return nbMinSeance;
    }

    /**
     * Setter method for nbMinSeance.
     *
     * @param aNbMinSeance the new value for nbMinSeance
     */
    public void setNbMinSeance(BigDecimal aNbMinSeance) {
        nbMinSeance = aNbMinSeance;
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

    /**
     * Compares the key for this instance with another EspConvocation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspConvocation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspConvocation)) {
            return false;
        }
        EspConvocation that = (EspConvocation) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myEspEtudiantIdEt = this.getEspEtudiantIdEt();
        Object yourEspEtudiantIdEt = that.getEspEtudiantIdEt();
        if (myEspEtudiantIdEt==null ? yourEspEtudiantIdEt!=null : !myEspEtudiantIdEt.equals(yourEspEtudiantIdEt)) {
            return false;
        }
        Object myDateGeneration = this.getDateGeneration();
        Object yourDateGeneration = that.getDateGeneration();
        if (myDateGeneration==null ? yourDateGeneration!=null : !myDateGeneration.equals(yourDateGeneration)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspConvocation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspConvocation)) return false;
        return this.equalKeys(other) && ((EspConvocation)other).equalKeys(this);
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
        if (getEspEtudiantIdEt() == null) {
            i = 0;
        } else {
            i = getEspEtudiantIdEt().hashCode();
        }
        result = 37*result + i;
        if (getDateGeneration() == null) {
            i = 0;
        } else {
            i = getDateGeneration().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspConvocation |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" espEtudiantIdEt=").append(getEspEtudiantIdEt());
        sb.append(" dateGeneration=").append(getDateGeneration());
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
        ret.put("espEtudiantIdEt", getEspEtudiantIdEt());
        ret.put("dateGeneration", getDateGeneration());
        return ret;
    }

}
