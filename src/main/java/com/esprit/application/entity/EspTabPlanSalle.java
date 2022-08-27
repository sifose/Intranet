// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="ESP_TAB_PLAN_SALLE")
public class EspTabPlanSalle implements Serializable {

    /** Primary key. */
    protected static final String PK = "critereTri";

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

    @Column(name="GROUPE", precision=1)
    private BigDecimal groupe;
    @Column(name="ANNEE_DEB", length=4)
    private String anneeDeb;
    @Column(name="ANNEE_FIN", length=4)
    private String anneeFin;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Column(name="ID_ET", length=10)
    private String idEt;
    @Column(name="NOM_ET", length=30)
    private String nomEt;
    @Column(name="PNOM_ET", length=30)
    private String pnomEt;
    @Id
    @Column(name="CRITERE_TRI", unique=true, nullable=false, precision=10)
    private BigDecimal critereTri;

    /** Default constructor. */
    public EspTabPlanSalle() {
        super();
    }

    /**
     * Access method for groupe.
     *
     * @return the current value of groupe
     */
    public BigDecimal getGroupe() {
        return groupe;
    }

    /**
     * Setter method for groupe.
     *
     * @param aGroupe the new value for groupe
     */
    public void setGroupe(BigDecimal aGroupe) {
        groupe = aGroupe;
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
     * Access method for anneeFin.
     *
     * @return the current value of anneeFin
     */
    public String getAnneeFin() {
        return anneeFin;
    }

    /**
     * Setter method for anneeFin.
     *
     * @param aAnneeFin the new value for anneeFin
     */
    public void setAnneeFin(String aAnneeFin) {
        anneeFin = aAnneeFin;
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
     * Access method for nomEt.
     *
     * @return the current value of nomEt
     */
    public String getNomEt() {
        return nomEt;
    }

    /**
     * Setter method for nomEt.
     *
     * @param aNomEt the new value for nomEt
     */
    public void setNomEt(String aNomEt) {
        nomEt = aNomEt;
    }

    /**
     * Access method for pnomEt.
     *
     * @return the current value of pnomEt
     */
    public String getPnomEt() {
        return pnomEt;
    }

    /**
     * Setter method for pnomEt.
     *
     * @param aPnomEt the new value for pnomEt
     */
    public void setPnomEt(String aPnomEt) {
        pnomEt = aPnomEt;
    }

    /**
     * Access method for critereTri.
     *
     * @return the current value of critereTri
     */
    public BigDecimal getCritereTri() {
        return critereTri;
    }

    /**
     * Setter method for critereTri.
     *
     * @param aCritereTri the new value for critereTri
     */
    public void setCritereTri(BigDecimal aCritereTri) {
        critereTri = aCritereTri;
    }

    /**
     * Compares the key for this instance with another EspTabPlanSalle.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspTabPlanSalle and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspTabPlanSalle)) {
            return false;
        }
        EspTabPlanSalle that = (EspTabPlanSalle) other;
        Object myCritereTri = this.getCritereTri();
        Object yourCritereTri = that.getCritereTri();
        if (myCritereTri==null ? yourCritereTri!=null : !myCritereTri.equals(yourCritereTri)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspTabPlanSalle.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspTabPlanSalle)) return false;
        return this.equalKeys(other) && ((EspTabPlanSalle)other).equalKeys(this);
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
        if (getCritereTri() == null) {
            i = 0;
        } else {
            i = getCritereTri().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspTabPlanSalle |");
        sb.append(" critereTri=").append(getCritereTri());
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
        ret.put("critereTri", getCritereTri());
        return ret;
    }

}
