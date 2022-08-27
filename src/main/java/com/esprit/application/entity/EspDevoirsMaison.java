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

@Entity(name="ESP_DEVOIRS_MAISON")
@IdClass(EspDevoirsMaison.EspDevoirsMaisonId.class)
public class EspDevoirsMaison implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspDevoirsMaisonId implements Serializable {
        java.lang.String idEns;
        java.lang.String anneeDeb;
        java.lang.String codeCl;
        java.lang.String codeModule;
    }

    /** Primary key. */
    protected static final String PK = "EspDevoirsMaisonEspDevoirsMaisonPk";

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
    @Column(name="ID_ENS", nullable=false, length=50)
    private String idEns;
    @Id
    @Column(name="CODE_CL", nullable=false, length=50)
    private String codeCl;
    @Id
    @Column(name="CODE_MODULE", nullable=false, length=50)
    private String codeModule;
    @Column(name="TITRE", length=500)
    private String titre;
    @Column(name="SUJET", length=2000)
    private String sujet;
    @Column(name="DATE_SAISIE", nullable=false)
    private LocalDateTime dateSaisie;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="DATE_CT", length=20)
    private String dateCt;
    @Column(name="NUM_SEANCE", length=20)
    private String numSeance;

    /** Default constructor. */
    public EspDevoirsMaison() {
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
     * Access method for titre.
     *
     * @return the current value of titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Setter method for titre.
     *
     * @param aTitre the new value for titre
     */
    public void setTitre(String aTitre) {
        titre = aTitre;
    }

    /**
     * Access method for sujet.
     *
     * @return the current value of sujet
     */
    public String getSujet() {
        return sujet;
    }

    /**
     * Setter method for sujet.
     *
     * @param aSujet the new value for sujet
     */
    public void setSujet(String aSujet) {
        sujet = aSujet;
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
     * Access method for dateCt.
     *
     * @return the current value of dateCt
     */
    public String getDateCt() {
        return dateCt;
    }

    /**
     * Setter method for dateCt.
     *
     * @param aDateCt the new value for dateCt
     */
    public void setDateCt(String aDateCt) {
        dateCt = aDateCt;
    }

    /**
     * Access method for numSeance.
     *
     * @return the current value of numSeance
     */
    public String getNumSeance() {
        return numSeance;
    }

    /**
     * Setter method for numSeance.
     *
     * @param aNumSeance the new value for numSeance
     */
    public void setNumSeance(String aNumSeance) {
        numSeance = aNumSeance;
    }

    /**
     * Compares the key for this instance with another EspDevoirsMaison.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspDevoirsMaison and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspDevoirsMaison)) {
            return false;
        }
        EspDevoirsMaison that = (EspDevoirsMaison) other;
        Object myIdEns = this.getIdEns();
        Object yourIdEns = that.getIdEns();
        if (myIdEns==null ? yourIdEns!=null : !myIdEns.equals(yourIdEns)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        Object myCodeModule = this.getCodeModule();
        Object yourCodeModule = that.getCodeModule();
        if (myCodeModule==null ? yourCodeModule!=null : !myCodeModule.equals(yourCodeModule)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspDevoirsMaison.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspDevoirsMaison)) return false;
        return this.equalKeys(other) && ((EspDevoirsMaison)other).equalKeys(this);
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
        if (getIdEns() == null) {
            i = 0;
        } else {
            i = getIdEns().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getCodeModule() == null) {
            i = 0;
        } else {
            i = getCodeModule().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspDevoirsMaison |");
        sb.append(" idEns=").append(getIdEns());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" codeModule=").append(getCodeModule());
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
        ret.put("idEns", getIdEns());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("codeCl", getCodeCl());
        ret.put("codeModule", getCodeModule());
        return ret;
    }

}
