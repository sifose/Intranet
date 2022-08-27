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
import javax.persistence.Version;

@Entity(name="ESP_PROJET_N")
public class EspProjetN implements Serializable {

    /** Primary key. */
    protected static final String PK = "idProjet";

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

    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Id
    @Column(name="ID_PROJET", unique=true, nullable=false, length=10)
    private String idProjet;
    @Column(name="NOM_PROJET", length=100)
    private String nomProjet;
    @Column(name="CODE_MODULE", length=10)
    private String codeModule;
    @Column(name="TYPE_PROJET", nullable=false, length=2)
    private String typeProjet;
    @Column(name="DESCRIPTION_PROJET", length=1000)
    private String descriptionProjet;
    @Column(name="TECHNOLOGIES", length=2)
    private String technologies;
    @Column(name="METHODOLOGIE", length=2)
    private String methodologie;
    @Column(name="DUREE", precision=2)
    private BigDecimal duree;
    @Column(name="SEMESTRE", precision=1)
    private BigDecimal semestre;
    @Column(name="PERIODE", precision=1)
    private BigDecimal periode;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="CODE_CL", length=20)
    private String codeCl;
    @Column(name="ID_ENS", length=20)
    private String idEns;

    /** Default constructor. */
    public EspProjetN() {
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
     * Access method for idProjet.
     *
     * @return the current value of idProjet
     */
    public String getIdProjet() {
        return idProjet;
    }

    /**
     * Setter method for idProjet.
     *
     * @param aIdProjet the new value for idProjet
     */
    public void setIdProjet(String aIdProjet) {
        idProjet = aIdProjet;
    }

    /**
     * Access method for nomProjet.
     *
     * @return the current value of nomProjet
     */
    public String getNomProjet() {
        return nomProjet;
    }

    /**
     * Setter method for nomProjet.
     *
     * @param aNomProjet the new value for nomProjet
     */
    public void setNomProjet(String aNomProjet) {
        nomProjet = aNomProjet;
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
     * Access method for typeProjet.
     *
     * @return the current value of typeProjet
     */
    public String getTypeProjet() {
        return typeProjet;
    }

    /**
     * Setter method for typeProjet.
     *
     * @param aTypeProjet the new value for typeProjet
     */
    public void setTypeProjet(String aTypeProjet) {
        typeProjet = aTypeProjet;
    }

    /**
     * Access method for descriptionProjet.
     *
     * @return the current value of descriptionProjet
     */
    public String getDescriptionProjet() {
        return descriptionProjet;
    }

    /**
     * Setter method for descriptionProjet.
     *
     * @param aDescriptionProjet the new value for descriptionProjet
     */
    public void setDescriptionProjet(String aDescriptionProjet) {
        descriptionProjet = aDescriptionProjet;
    }

    /**
     * Access method for technologies.
     *
     * @return the current value of technologies
     */
    public String getTechnologies() {
        return technologies;
    }

    /**
     * Setter method for technologies.
     *
     * @param aTechnologies the new value for technologies
     */
    public void setTechnologies(String aTechnologies) {
        technologies = aTechnologies;
    }

    /**
     * Access method for methodologie.
     *
     * @return the current value of methodologie
     */
    public String getMethodologie() {
        return methodologie;
    }

    /**
     * Setter method for methodologie.
     *
     * @param aMethodologie the new value for methodologie
     */
    public void setMethodologie(String aMethodologie) {
        methodologie = aMethodologie;
    }

    /**
     * Access method for duree.
     *
     * @return the current value of duree
     */
    public BigDecimal getDuree() {
        return duree;
    }

    /**
     * Setter method for duree.
     *
     * @param aDuree the new value for duree
     */
    public void setDuree(BigDecimal aDuree) {
        duree = aDuree;
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
     * Access method for periode.
     *
     * @return the current value of periode
     */
    public BigDecimal getPeriode() {
        return periode;
    }

    /**
     * Setter method for periode.
     *
     * @param aPeriode the new value for periode
     */
    public void setPeriode(BigDecimal aPeriode) {
        periode = aPeriode;
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
     * Compares the key for this instance with another EspProjetN.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspProjetN and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspProjetN)) {
            return false;
        }
        EspProjetN that = (EspProjetN) other;
        Object myIdProjet = this.getIdProjet();
        Object yourIdProjet = that.getIdProjet();
        if (myIdProjet==null ? yourIdProjet!=null : !myIdProjet.equals(yourIdProjet)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspProjetN.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspProjetN)) return false;
        return this.equalKeys(other) && ((EspProjetN)other).equalKeys(this);
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
        if (getIdProjet() == null) {
            i = 0;
        } else {
            i = getIdProjet().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspProjetN |");
        sb.append(" idProjet=").append(getIdProjet());
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
        ret.put("idProjet", getIdProjet());
        return ret;
    }

}
