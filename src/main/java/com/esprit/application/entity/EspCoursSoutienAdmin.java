// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="ESP_COURS_SOUTIEN_ADMIN")
@IdClass(EspCoursSoutienAdmin.EspCoursSoutienAdminId.class)
public class EspCoursSoutienAdmin implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspCoursSoutienAdminId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String codeCl;
        java.math.BigDecimal semestre;
        java.lang.String jour;
        java.math.BigDecimal numSeance;
    }

    /** Primary key. */
    protected static final String PK = "EspCoursSoutienAdminEspCoursSoutienAdminPk";

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
    @Column(name="ANNEE_DEB", nullable=false, length=20)
    private String anneeDeb;
    @Id
    @Column(name="CODE_CL", nullable=false, length=20)
    private String codeCl;
    @Id
    @Column(name="SEMESTRE", nullable=false, precision=1)
    private BigDecimal semestre;
    @Column(name="CODE_MODULE", nullable=false, length=20)
    private String codeModule;
    @Id
    @Column(name="JOUR", nullable=false, length=20)
    private String jour;
    @Id
    @Column(name="NUM_SEANCE", nullable=false, precision=1)
    private BigDecimal numSeance;

    /** Default constructor. */
    public EspCoursSoutienAdmin() {
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
     * Access method for jour.
     *
     * @return the current value of jour
     */
    public String getJour() {
        return jour;
    }

    /**
     * Setter method for jour.
     *
     * @param aJour the new value for jour
     */
    public void setJour(String aJour) {
        jour = aJour;
    }

    /**
     * Access method for numSeance.
     *
     * @return the current value of numSeance
     */
    public BigDecimal getNumSeance() {
        return numSeance;
    }

    /**
     * Setter method for numSeance.
     *
     * @param aNumSeance the new value for numSeance
     */
    public void setNumSeance(BigDecimal aNumSeance) {
        numSeance = aNumSeance;
    }

    /**
     * Compares the key for this instance with another EspCoursSoutienAdmin.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspCoursSoutienAdmin and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspCoursSoutienAdmin)) {
            return false;
        }
        EspCoursSoutienAdmin that = (EspCoursSoutienAdmin) other;
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
        Object mySemestre = this.getSemestre();
        Object yourSemestre = that.getSemestre();
        if (mySemestre==null ? yourSemestre!=null : !mySemestre.equals(yourSemestre)) {
            return false;
        }
        Object myJour = this.getJour();
        Object yourJour = that.getJour();
        if (myJour==null ? yourJour!=null : !myJour.equals(yourJour)) {
            return false;
        }
        Object myNumSeance = this.getNumSeance();
        Object yourNumSeance = that.getNumSeance();
        if (myNumSeance==null ? yourNumSeance!=null : !myNumSeance.equals(yourNumSeance)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspCoursSoutienAdmin.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspCoursSoutienAdmin)) return false;
        return this.equalKeys(other) && ((EspCoursSoutienAdmin)other).equalKeys(this);
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
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getSemestre() == null) {
            i = 0;
        } else {
            i = getSemestre().hashCode();
        }
        result = 37*result + i;
        if (getJour() == null) {
            i = 0;
        } else {
            i = getJour().hashCode();
        }
        result = 37*result + i;
        if (getNumSeance() == null) {
            i = 0;
        } else {
            i = getNumSeance().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspCoursSoutienAdmin |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" semestre=").append(getSemestre());
        sb.append(" jour=").append(getJour());
        sb.append(" numSeance=").append(getNumSeance());
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
        ret.put("codeCl", getCodeCl());
        ret.put("semestre", getSemestre());
        ret.put("jour", getJour());
        ret.put("numSeance", getNumSeance());
        return ret;
    }

}
