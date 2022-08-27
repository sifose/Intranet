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

@Entity(name="AFFECTATION_EXAMEN")
@IdClass(AffectationExamen.AffectationExamenId.class)
public class AffectationExamen implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class AffectationExamenId implements Serializable {
        EspModulePanierClasseSaiso espModulePanierClasseSaiso;
        Salle salle;
    }

    /** Primary key. */
    protected static final String PK = "AffectationExamenAffectationExamenPk";

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

    @Column(name="HEURE", nullable=false, length=20)
    private String heure;
    @Column(name="DATE_EXAMEN", nullable=false)
    private LocalDateTime dateExamen;
    @Column(name="NOMBRE_HEURE_EXAMEN", nullable=false)
    private BigDecimal nombreHeureExamen;
    @Column(name="ID_ENS", nullable=false, length=20)
    private String idEns;
    @ManyToOne(optional=false)
    @Id
    @JoinColumns ({
    @JoinColumn(name="CODE_MODULE", nullable=false),
    @JoinColumn(name="CODE_CL", nullable=false),
    @JoinColumn(name="ANNEE_DEB", nullable=false),
   @JoinColumn(name="NUM_SEMESTRE", nullable=false) })
    private EspModulePanierClasseSaiso espModulePanierClasseSaiso;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="SALLE", nullable=false)
    private Salle salle;

    /** Default constructor. */
    public AffectationExamen() {
        super();
    }

    /**
     * Access method for heure.
     *
     * @return the current value of heure
     */
    public String getHeure() {
        return heure;
    }

    /**
     * Setter method for heure.
     *
     * @param aHeure the new value for heure
     */
    public void setHeure(String aHeure) {
        heure = aHeure;
    }

    /**
     * Access method for dateExamen.
     *
     * @return the current value of dateExamen
     */
    public LocalDateTime getDateExamen() {
        return dateExamen;
    }

    /**
     * Setter method for dateExamen.
     *
     * @param aDateExamen the new value for dateExamen
     */
    public void setDateExamen(LocalDateTime aDateExamen) {
        dateExamen = aDateExamen;
    }

    /**
     * Access method for nombreHeureExamen.
     *
     * @return the current value of nombreHeureExamen
     */
    public BigDecimal getNombreHeureExamen() {
        return nombreHeureExamen;
    }

    /**
     * Setter method for nombreHeureExamen.
     *
     * @param aNombreHeureExamen the new value for nombreHeureExamen
     */
    public void setNombreHeureExamen(BigDecimal aNombreHeureExamen) {
        nombreHeureExamen = aNombreHeureExamen;
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
     * Access method for espModulePanierClasseSaiso.
     *
     * @return the current value of espModulePanierClasseSaiso
     */
    public EspModulePanierClasseSaiso getEspModulePanierClasseSaiso() {
        return espModulePanierClasseSaiso;
    }

    /**
     * Setter method for espModulePanierClasseSaiso.
     *
     * @param aEspModulePanierClasseSaiso the new value for espModulePanierClasseSaiso
     */
    public void setEspModulePanierClasseSaiso(EspModulePanierClasseSaiso aEspModulePanierClasseSaiso) {
        espModulePanierClasseSaiso = aEspModulePanierClasseSaiso;
    }

   
    /**
     * Access method for salle.
     *
     * @return the current value of salle
     */
    public Salle getSalle() {
        return salle;
    }

    /**
     * Setter method for salle.
     *
     * @param aSalle the new value for salle
     */
    public void setSalle(Salle aSalle) {
        salle = aSalle;
    }

    /** Temporary value holder for group key fragment espModulePanierClasseSaiso4EspModuleCodeModule */
    private transient String tempEspModulePanierClasseSaiso4EspModuleCodeModule;

   
    /** Temporary value holder for group key fragment espModulePanierClasseSaisoEspModuleCodeModule */
    private transient String tempEspModulePanierClasseSaisoEspModuleCodeModule;

    /**
     * Gets the key fragment codeModule for member espModulePanierClasseSaiso.
     * If this.espModulePanierClasseSaiso is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspModulePanierClasseSaisoEspModuleCodeModule.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspModule
     */
    public String getEspModulePanierClasseSaisoEspModuleCodeModule() {
        return (getEspModulePanierClasseSaiso() == null ? tempEspModulePanierClasseSaisoEspModuleCodeModule : getEspModulePanierClasseSaiso().getEspModuleCodeModule());
    }

    /**
     * Sets the key fragment codeModule from member espModulePanierClasseSaiso.
     * If this.espModulePanierClasseSaiso is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspModulePanierClasseSaisoEspModuleCodeModule.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeModule New value for the key fragment
     * @see EspModule
     */
    public void setEspModulePanierClasseSaisoEspModuleCodeModule(String aCodeModule) {
        if (getEspModulePanierClasseSaiso() == null) {
            tempEspModulePanierClasseSaisoEspModuleCodeModule = aCodeModule;
        } else {
            getEspModulePanierClasseSaiso().setEspModuleCodeModule(aCodeModule);
        }
    }

    /** Temporary value holder for group key fragment espModulePanierClasseSaisoCodeCl */
    private transient String tempEspModulePanierClasseSaisoCodeCl;

    /**
     * Gets the key fragment codeCl for member espModulePanierClasseSaiso.
     * If this.espModulePanierClasseSaiso is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspModulePanierClasseSaisoCodeCl.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspModulePanierClasseSaiso
     */
    public String getEspModulePanierClasseSaisoCodeCl() {
        return (getEspModulePanierClasseSaiso() == null ? tempEspModulePanierClasseSaisoCodeCl : getEspModulePanierClasseSaiso().getCodeCl());
    }

    /**
     * Sets the key fragment codeCl from member espModulePanierClasseSaiso.
     * If this.espModulePanierClasseSaiso is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspModulePanierClasseSaisoCodeCl.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeCl New value for the key fragment
     * @see EspModulePanierClasseSaiso
     */
    public void setEspModulePanierClasseSaisoCodeCl(String aCodeCl) {
        if (getEspModulePanierClasseSaiso() == null) {
            tempEspModulePanierClasseSaisoCodeCl = aCodeCl;
        } else {
            getEspModulePanierClasseSaiso().setCodeCl(aCodeCl);
        }
    }

    /** Temporary value holder for group key fragment espModulePanierClasseSaisoAnneeDeb */
    private transient String tempEspModulePanierClasseSaisoAnneeDeb;

    /**
     * Gets the key fragment anneeDeb for member espModulePanierClasseSaiso.
     * If this.espModulePanierClasseSaiso is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspModulePanierClasseSaisoAnneeDeb.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspModulePanierClasseSaiso
     */
    public String getEspModulePanierClasseSaisoAnneeDeb() {
        return (getEspModulePanierClasseSaiso() == null ? tempEspModulePanierClasseSaisoAnneeDeb : getEspModulePanierClasseSaiso().getAnneeDeb());
    }

    /**
     * Sets the key fragment anneeDeb from member espModulePanierClasseSaiso.
     * If this.espModulePanierClasseSaiso is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspModulePanierClasseSaisoAnneeDeb.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAnneeDeb New value for the key fragment
     * @see EspModulePanierClasseSaiso
     */
    public void setEspModulePanierClasseSaisoAnneeDeb(String aAnneeDeb) {
        if (getEspModulePanierClasseSaiso() == null) {
            tempEspModulePanierClasseSaisoAnneeDeb = aAnneeDeb;
        } else {
            getEspModulePanierClasseSaiso().setAnneeDeb(aAnneeDeb);
        }
    }

    /** Temporary value holder for group key fragment espModulePanierClasseSaisoNumSemestre */
    private transient BigDecimal tempEspModulePanierClasseSaisoNumSemestre;

    /**
     * Gets the key fragment numSemestre for member espModulePanierClasseSaiso.
     * If this.espModulePanierClasseSaiso is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspModulePanierClasseSaisoNumSemestre.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspModulePanierClasseSaiso
     */
    public BigDecimal getEspModulePanierClasseSaisoNumSemestre() {
        return (getEspModulePanierClasseSaiso() == null ? tempEspModulePanierClasseSaisoNumSemestre : getEspModulePanierClasseSaiso().getNumSemestre());
    }

    /**
     * Sets the key fragment numSemestre from member espModulePanierClasseSaiso.
     * If this.espModulePanierClasseSaiso is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspModulePanierClasseSaisoNumSemestre.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aNumSemestre New value for the key fragment
     * @see EspModulePanierClasseSaiso
     */
    public void setEspModulePanierClasseSaisoNumSemestre(BigDecimal aNumSemestre) {
        if (getEspModulePanierClasseSaiso() == null) {
            tempEspModulePanierClasseSaisoNumSemestre = aNumSemestre;
        } else {
            getEspModulePanierClasseSaiso().setNumSemestre(aNumSemestre);
        }
    }

    /** Temporary value holder for group key fragment salleCodeSalle */
    private transient String tempSalleCodeSalle;

    /**
     * Gets the key fragment codeSalle for member salle.
     * If this.salle is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setSalleCodeSalle.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Salle
     */
    public String getSalleCodeSalle() {
        return (getSalle() == null ? tempSalleCodeSalle : getSalle().getCodeSalle());
    }

    /**
     * Sets the key fragment codeSalle from member salle.
     * If this.salle is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getSalleCodeSalle.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeSalle New value for the key fragment
     * @see Salle
     */
    public void setSalleCodeSalle(String aCodeSalle) {
        if (getSalle() == null) {
            tempSalleCodeSalle = aCodeSalle;
        } else {
            getSalle().setCodeSalle(aCodeSalle);
        }
    }

    /**
     * Compares the key for this instance with another AffectationExamen.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AffectationExamen and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AffectationExamen)) {
            return false;
        }
        AffectationExamen that = (AffectationExamen) other;
       
        Object myEspModulePanierClasseSaisoEspModuleCodeModule = this.getEspModulePanierClasseSaisoEspModuleCodeModule();
        Object yourEspModulePanierClasseSaisoEspModuleCodeModule = that.getEspModulePanierClasseSaisoEspModuleCodeModule();
        if (myEspModulePanierClasseSaisoEspModuleCodeModule==null ? yourEspModulePanierClasseSaisoEspModuleCodeModule!=null : !myEspModulePanierClasseSaisoEspModuleCodeModule.equals(yourEspModulePanierClasseSaisoEspModuleCodeModule)) {
            return false;
        }
        Object myEspModulePanierClasseSaisoCodeCl = this.getEspModulePanierClasseSaisoCodeCl();
        Object yourEspModulePanierClasseSaisoCodeCl = that.getEspModulePanierClasseSaisoCodeCl();
        if (myEspModulePanierClasseSaisoCodeCl==null ? yourEspModulePanierClasseSaisoCodeCl!=null : !myEspModulePanierClasseSaisoCodeCl.equals(yourEspModulePanierClasseSaisoCodeCl)) {
            return false;
        }
        Object myEspModulePanierClasseSaisoAnneeDeb = this.getEspModulePanierClasseSaisoAnneeDeb();
        Object yourEspModulePanierClasseSaisoAnneeDeb = that.getEspModulePanierClasseSaisoAnneeDeb();
        if (myEspModulePanierClasseSaisoAnneeDeb==null ? yourEspModulePanierClasseSaisoAnneeDeb!=null : !myEspModulePanierClasseSaisoAnneeDeb.equals(yourEspModulePanierClasseSaisoAnneeDeb)) {
            return false;
        }
        Object myEspModulePanierClasseSaisoNumSemestre = this.getEspModulePanierClasseSaisoNumSemestre();
        Object yourEspModulePanierClasseSaisoNumSemestre = that.getEspModulePanierClasseSaisoNumSemestre();
        if (myEspModulePanierClasseSaisoNumSemestre==null ? yourEspModulePanierClasseSaisoNumSemestre!=null : !myEspModulePanierClasseSaisoNumSemestre.equals(yourEspModulePanierClasseSaisoNumSemestre)) {
            return false;
        }
        Object mySalleCodeSalle = this.getSalleCodeSalle();
        Object yourSalleCodeSalle = that.getSalleCodeSalle();
        if (mySalleCodeSalle==null ? yourSalleCodeSalle!=null : !mySalleCodeSalle.equals(yourSalleCodeSalle)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AffectationExamen.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AffectationExamen)) return false;
        return this.equalKeys(other) && ((AffectationExamen)other).equalKeys(this);
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
        
        if (getEspModulePanierClasseSaisoEspModuleCodeModule() == null) {
            i = 0;
        } else {
            i = getEspModulePanierClasseSaisoEspModuleCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getEspModulePanierClasseSaisoCodeCl() == null) {
            i = 0;
        } else {
            i = getEspModulePanierClasseSaisoCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getEspModulePanierClasseSaisoAnneeDeb() == null) {
            i = 0;
        } else {
            i = getEspModulePanierClasseSaisoAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getEspModulePanierClasseSaisoNumSemestre() == null) {
            i = 0;
        } else {
            i = getEspModulePanierClasseSaisoNumSemestre().hashCode();
        }
        result = 37*result + i;
        if (getSalleCodeSalle() == null) {
            i = 0;
        } else {
            i = getSalleCodeSalle().hashCode();
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
        StringBuffer sb = new StringBuffer("[AffectationExamen |");
        sb.append(" espModulePanierClasseSaisoEspModuleCodeModule=").append(getEspModulePanierClasseSaisoEspModuleCodeModule());
        sb.append(" espModulePanierClasseSaisoCodeCl=").append(getEspModulePanierClasseSaisoCodeCl());
        sb.append(" espModulePanierClasseSaisoAnneeDeb=").append(getEspModulePanierClasseSaisoAnneeDeb());
        sb.append(" espModulePanierClasseSaisoNumSemestre=").append(getEspModulePanierClasseSaisoNumSemestre());
        sb.append(" salleCodeSalle=").append(getSalleCodeSalle());
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
        ret.put("espModulePanierClasseSaisoEspModuleCodeModule", getEspModulePanierClasseSaisoEspModuleCodeModule());
        ret.put("espModulePanierClasseSaisoCodeCl", getEspModulePanierClasseSaisoCodeCl());
        ret.put("espModulePanierClasseSaisoAnneeDeb", getEspModulePanierClasseSaisoAnneeDeb());
        ret.put("espModulePanierClasseSaisoNumSemestre", getEspModulePanierClasseSaisoNumSemestre());
        ret.put("salleCodeSalle", getSalleCodeSalle());
        return ret;
    }

}
