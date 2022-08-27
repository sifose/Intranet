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

@Entity(name="ESP_JOURNAL_OP_RUBRIQUE")
public class EspJournalOpRubrique implements Serializable {

    /** Primary key. */
    protected static final String PK = "anneeDeb";

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
    @Column(name="ANNEE_DEB", unique=true, nullable=false, length=4)
    private String anneeDeb;
    @Column(name="ID_ET", length=10)
    private String idEt;
    @Column(name="CODE_RUB", length=10)
    private String codeRub;
    @Column(name="DATE_OP")
    private LocalDateTime dateOp;
    @Column(name="TYPE_OP", length=1)
    private String typeOp;
    @Column(name="OLD_VALUE", precision=18, scale=6)
    private BigDecimal oldValue;
    @Column(name="NEW_VALUE", precision=18, scale=6)
    private BigDecimal newValue;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;

    /** Default constructor. */
    public EspJournalOpRubrique() {
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
     * Access method for codeRub.
     *
     * @return the current value of codeRub
     */
    public String getCodeRub() {
        return codeRub;
    }

    /**
     * Setter method for codeRub.
     *
     * @param aCodeRub the new value for codeRub
     */
    public void setCodeRub(String aCodeRub) {
        codeRub = aCodeRub;
    }

    /**
     * Access method for dateOp.
     *
     * @return the current value of dateOp
     */
    public LocalDateTime getDateOp() {
        return dateOp;
    }

    /**
     * Setter method for dateOp.
     *
     * @param aDateOp the new value for dateOp
     */
    public void setDateOp(LocalDateTime aDateOp) {
        dateOp = aDateOp;
    }

    /**
     * Access method for typeOp.
     *
     * @return the current value of typeOp
     */
    public String getTypeOp() {
        return typeOp;
    }

    /**
     * Setter method for typeOp.
     *
     * @param aTypeOp the new value for typeOp
     */
    public void setTypeOp(String aTypeOp) {
        typeOp = aTypeOp;
    }

    /**
     * Access method for oldValue.
     *
     * @return the current value of oldValue
     */
    public BigDecimal getOldValue() {
        return oldValue;
    }

    /**
     * Setter method for oldValue.
     *
     * @param aOldValue the new value for oldValue
     */
    public void setOldValue(BigDecimal aOldValue) {
        oldValue = aOldValue;
    }

    /**
     * Access method for newValue.
     *
     * @return the current value of newValue
     */
    public BigDecimal getNewValue() {
        return newValue;
    }

    /**
     * Setter method for newValue.
     *
     * @param aNewValue the new value for newValue
     */
    public void setNewValue(BigDecimal aNewValue) {
        newValue = aNewValue;
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
     * Compares the key for this instance with another EspJournalOpRubrique.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspJournalOpRubrique and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspJournalOpRubrique)) {
            return false;
        }
        EspJournalOpRubrique that = (EspJournalOpRubrique) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspJournalOpRubrique.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspJournalOpRubrique)) return false;
        return this.equalKeys(other) && ((EspJournalOpRubrique)other).equalKeys(this);
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
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EspJournalOpRubrique |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
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
        return ret;
    }

}
