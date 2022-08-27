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

@Entity(name="ESP_MOY_MODULE_ET_SEMESTRIEL")
@IdClass(EspMoyModuleEtSemestriel.EspMoyModuleEtSemestrielId.class)
public class EspMoyModuleEtSemestriel implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspMoyModuleEtSemestrielId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String idEt;
        java.lang.String codeModule;
        java.math.BigDecimal semestre;
    }

    /** Primary key. */
    protected static final String PK = "EspMoyModuleEtSemestrielPkMoyModuleSemestriel";

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
    @Column(name="SEMESTRE", nullable=false, precision=1)
    private BigDecimal semestre;
    @Id
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Id
    @Column(name="CODE_MODULE", nullable=false, length=10)
    private String codeModule;
    @Column(name="DESIGNATION_MODULE", length=50)
    private String designationModule;
    @Column(name="NB_HEURES", precision=3)
    private BigDecimal nbHeures;
    @Column(name="COEF", precision=2)
    private BigDecimal coef;
    @Column(name="TYPE_MOY", length=1)
    private String typeMoy;
    @Column(name="MOYENNE", precision=10, scale=2)
    private BigDecimal moyenne;
    @Column(name="DATE_DERN_MAJ")
    private LocalDateTime dateDernMaj;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Column(name="CODE_UE", length=14)
    private String codeUe;

    /** Default constructor. */
    public EspMoyModuleEtSemestriel() {
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
     * Access method for designationModule.
     *
     * @return the current value of designationModule
     */
    public String getDesignationModule() {
        return designationModule;
    }

    /**
     * Setter method for designationModule.
     *
     * @param aDesignationModule the new value for designationModule
     */
    public void setDesignationModule(String aDesignationModule) {
        designationModule = aDesignationModule;
    }

    /**
     * Access method for nbHeures.
     *
     * @return the current value of nbHeures
     */
    public BigDecimal getNbHeures() {
        return nbHeures;
    }

    /**
     * Setter method for nbHeures.
     *
     * @param aNbHeures the new value for nbHeures
     */
    public void setNbHeures(BigDecimal aNbHeures) {
        nbHeures = aNbHeures;
    }

    /**
     * Access method for coef.
     *
     * @return the current value of coef
     */
    public BigDecimal getCoef() {
        return coef;
    }

    /**
     * Setter method for coef.
     *
     * @param aCoef the new value for coef
     */
    public void setCoef(BigDecimal aCoef) {
        coef = aCoef;
    }

    /**
     * Access method for typeMoy.
     *
     * @return the current value of typeMoy
     */
    public String getTypeMoy() {
        return typeMoy;
    }

    /**
     * Setter method for typeMoy.
     *
     * @param aTypeMoy the new value for typeMoy
     */
    public void setTypeMoy(String aTypeMoy) {
        typeMoy = aTypeMoy;
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
     * Access method for dateDernMaj.
     *
     * @return the current value of dateDernMaj
     */
    public LocalDateTime getDateDernMaj() {
        return dateDernMaj;
    }

    /**
     * Setter method for dateDernMaj.
     *
     * @param aDateDernMaj the new value for dateDernMaj
     */
    public void setDateDernMaj(LocalDateTime aDateDernMaj) {
        dateDernMaj = aDateDernMaj;
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
     * Access method for codeUe.
     *
     * @return the current value of codeUe
     */
    public String getCodeUe() {
        return codeUe;
    }

    /**
     * Setter method for codeUe.
     *
     * @param aCodeUe the new value for codeUe
     */
    public void setCodeUe(String aCodeUe) {
        codeUe = aCodeUe;
    }

    /**
     * Compares the key for this instance with another EspMoyModuleEtSemestriel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspMoyModuleEtSemestriel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspMoyModuleEtSemestriel)) {
            return false;
        }
        EspMoyModuleEtSemestriel that = (EspMoyModuleEtSemestriel) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myCodeModule = this.getCodeModule();
        Object yourCodeModule = that.getCodeModule();
        if (myCodeModule==null ? yourCodeModule!=null : !myCodeModule.equals(yourCodeModule)) {
            return false;
        }
        Object mySemestre = this.getSemestre();
        Object yourSemestre = that.getSemestre();
        if (mySemestre==null ? yourSemestre!=null : !mySemestre.equals(yourSemestre)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspMoyModuleEtSemestriel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspMoyModuleEtSemestriel)) return false;
        return this.equalKeys(other) && ((EspMoyModuleEtSemestriel)other).equalKeys(this);
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
        if (getIdEt() == null) {
            i = 0;
        } else {
            i = getIdEt().hashCode();
        }
        result = 37*result + i;
        if (getCodeModule() == null) {
            i = 0;
        } else {
            i = getCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getSemestre() == null) {
            i = 0;
        } else {
            i = getSemestre().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspMoyModuleEtSemestriel |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" idEt=").append(getIdEt());
        sb.append(" codeModule=").append(getCodeModule());
        sb.append(" semestre=").append(getSemestre());
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
        ret.put("idEt", getIdEt());
        ret.put("codeModule", getCodeModule());
        ret.put("semestre", getSemestre());
        return ret;
    }

}
