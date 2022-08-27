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

@Entity(name="ESP_WHITE_LIST")
public class EspWhiteList implements Serializable {

    /** Primary key. */
    protected static final String PK = "idEt";

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
    @Column(name="ID_ET", unique=true, nullable=false, length=10)
    private String idEt;
    @Column(name="NUM_CPT", length=20)
    private String numCpt;
    @Column(name="NOM_ET", length=30)
    private String nomEt;
    @Column(name="PNOM_ET", length=30)
    private String pnomEt;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Column(name="MONT_FRAIS", precision=10, scale=3)
    private BigDecimal montFrais;
    @Column(name="MONT_REGLE", precision=10, scale=3)
    private BigDecimal montRegle;
    @Column(name="DATE_LIMITE")
    private LocalDateTime dateLimite;

    /** Default constructor. */
    public EspWhiteList() {
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
     * Access method for numCpt.
     *
     * @return the current value of numCpt
     */
    public String getNumCpt() {
        return numCpt;
    }

    /**
     * Setter method for numCpt.
     *
     * @param aNumCpt the new value for numCpt
     */
    public void setNumCpt(String aNumCpt) {
        numCpt = aNumCpt;
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
     * Access method for montFrais.
     *
     * @return the current value of montFrais
     */
    public BigDecimal getMontFrais() {
        return montFrais;
    }

    /**
     * Setter method for montFrais.
     *
     * @param aMontFrais the new value for montFrais
     */
    public void setMontFrais(BigDecimal aMontFrais) {
        montFrais = aMontFrais;
    }

    /**
     * Access method for montRegle.
     *
     * @return the current value of montRegle
     */
    public BigDecimal getMontRegle() {
        return montRegle;
    }

    /**
     * Setter method for montRegle.
     *
     * @param aMontRegle the new value for montRegle
     */
    public void setMontRegle(BigDecimal aMontRegle) {
        montRegle = aMontRegle;
    }

    /**
     * Access method for dateLimite.
     *
     * @return the current value of dateLimite
     */
    public LocalDateTime getDateLimite() {
        return dateLimite;
    }

    /**
     * Setter method for dateLimite.
     *
     * @param aDateLimite the new value for dateLimite
     */
    public void setDateLimite(LocalDateTime aDateLimite) {
        dateLimite = aDateLimite;
    }

    /**
     * Compares the key for this instance with another EspWhiteList.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspWhiteList and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspWhiteList)) {
            return false;
        }
        EspWhiteList that = (EspWhiteList) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspWhiteList.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspWhiteList)) return false;
        return this.equalKeys(other) && ((EspWhiteList)other).equalKeys(this);
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
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EspWhiteList |");
        sb.append(" idEt=").append(getIdEt());
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
        return ret;
    }

}
