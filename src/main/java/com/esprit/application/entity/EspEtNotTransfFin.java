// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="ESP_ET_NOT_TRANSF_FIN")
public class EspEtNotTransfFin implements Serializable {

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
    @Column(name="NUMCOMPTE", length=10)
    private String numcompte;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="JUSTIF_NOT_TRANSF", length=200)
    private String justifNotTransf;
    @Column(name="TRANSFERRRED", length=1)
    private String transferrred;
    @Column(name="DATE_TRANSF")
    private LocalDateTime dateTransf;

    /** Default constructor. */
    public EspEtNotTransfFin() {
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
     * Access method for numcompte.
     *
     * @return the current value of numcompte
     */
    public String getNumcompte() {
        return numcompte;
    }

    /**
     * Setter method for numcompte.
     *
     * @param aNumcompte the new value for numcompte
     */
    public void setNumcompte(String aNumcompte) {
        numcompte = aNumcompte;
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
     * Access method for justifNotTransf.
     *
     * @return the current value of justifNotTransf
     */
    public String getJustifNotTransf() {
        return justifNotTransf;
    }

    /**
     * Setter method for justifNotTransf.
     *
     * @param aJustifNotTransf the new value for justifNotTransf
     */
    public void setJustifNotTransf(String aJustifNotTransf) {
        justifNotTransf = aJustifNotTransf;
    }

    /**
     * Access method for transferrred.
     *
     * @return the current value of transferrred
     */
    public String getTransferrred() {
        return transferrred;
    }

    /**
     * Setter method for transferrred.
     *
     * @param aTransferrred the new value for transferrred
     */
    public void setTransferrred(String aTransferrred) {
        transferrred = aTransferrred;
    }

    /**
     * Access method for dateTransf.
     *
     * @return the current value of dateTransf
     */
    public LocalDateTime getDateTransf() {
        return dateTransf;
    }

    /**
     * Setter method for dateTransf.
     *
     * @param aDateTransf the new value for dateTransf
     */
    public void setDateTransf(LocalDateTime aDateTransf) {
        dateTransf = aDateTransf;
    }

    /**
     * Compares the key for this instance with another EspEtNotTransfFin.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspEtNotTransfFin and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspEtNotTransfFin)) {
            return false;
        }
        EspEtNotTransfFin that = (EspEtNotTransfFin) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspEtNotTransfFin.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspEtNotTransfFin)) return false;
        return this.equalKeys(other) && ((EspEtNotTransfFin)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[EspEtNotTransfFin |");
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
