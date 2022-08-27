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

@Entity(name="ESP_AIDE_COURS")
@IdClass(EspAideCours.EspAideCoursId.class)
public class EspAideCours implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspAideCoursId implements Serializable {
        java.lang.String idEt;
        java.lang.String codeCl;
        java.lang.String codeModule;
        java.time.LocalDateTime dateCours;
    }

    /** Primary key. */
    protected static final String PK = "EspAideCoursEspAideCoursPk";

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
    @Column(name="ID_ET", nullable=false, length=30)
    private String idEt;
    @Column(name="NIVEAU_ACCEES", length=20)
    private String niveauAccees;
    @Id
    @Column(name="CODE_CL", nullable=false, length=20)
    private String codeCl;
    @Id
    @Column(name="CODE_MODULE", nullable=false, length=20)
    private String codeModule;
    @Id
    @Column(name="DATE_COURS", nullable=false)
    private LocalDateTime dateCours;
    @Column(name="HEUR_DEBUT", length=20)
    private String heurDebut;
    @Column(name="HEUR_FIN", length=20)
    private String heurFin;

    /** Default constructor. */
    public EspAideCours() {
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
     * Access method for niveauAccees.
     *
     * @return the current value of niveauAccees
     */
    public String getNiveauAccees() {
        return niveauAccees;
    }

    /**
     * Setter method for niveauAccees.
     *
     * @param aNiveauAccees the new value for niveauAccees
     */
    public void setNiveauAccees(String aNiveauAccees) {
        niveauAccees = aNiveauAccees;
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
     * Access method for dateCours.
     *
     * @return the current value of dateCours
     */
    public LocalDateTime getDateCours() {
        return dateCours;
    }

    /**
     * Setter method for dateCours.
     *
     * @param aDateCours the new value for dateCours
     */
    public void setDateCours(LocalDateTime aDateCours) {
        dateCours = aDateCours;
    }

    /**
     * Access method for heurDebut.
     *
     * @return the current value of heurDebut
     */
    public String getHeurDebut() {
        return heurDebut;
    }

    /**
     * Setter method for heurDebut.
     *
     * @param aHeurDebut the new value for heurDebut
     */
    public void setHeurDebut(String aHeurDebut) {
        heurDebut = aHeurDebut;
    }

    /**
     * Access method for heurFin.
     *
     * @return the current value of heurFin
     */
    public String getHeurFin() {
        return heurFin;
    }

    /**
     * Setter method for heurFin.
     *
     * @param aHeurFin the new value for heurFin
     */
    public void setHeurFin(String aHeurFin) {
        heurFin = aHeurFin;
    }

    /**
     * Compares the key for this instance with another EspAideCours.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspAideCours and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspAideCours)) {
            return false;
        }
        EspAideCours that = (EspAideCours) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
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
        Object myDateCours = this.getDateCours();
        Object yourDateCours = that.getDateCours();
        if (myDateCours==null ? yourDateCours!=null : !myDateCours.equals(yourDateCours)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspAideCours.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspAideCours)) return false;
        return this.equalKeys(other) && ((EspAideCours)other).equalKeys(this);
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
        if (getDateCours() == null) {
            i = 0;
        } else {
            i = getDateCours().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspAideCours |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" codeModule=").append(getCodeModule());
        sb.append(" dateCours=").append(getDateCours());
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
        ret.put("codeCl", getCodeCl());
        ret.put("codeModule", getCodeModule());
        ret.put("dateCours", getDateCours());
        return ret;
    }

}
