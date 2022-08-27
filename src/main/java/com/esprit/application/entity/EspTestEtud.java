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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_TEST_ETUD")
@IdClass(EspTestEtud.EspTestEtudId.class)
public class EspTestEtud implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspTestEtudId implements Serializable {
        EspEtudiant espEtudiant;
        java.time.LocalDateTime dateChoix;
    }

    /** Primary key. */
    protected static final String PK = "EspTestEtudEspTestEtudPk";

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

    @Column(name="TYPE_CHOIX", length=20)
    private String typeChoix;
    @Id
    @Column(name="DATE_CHOIX", nullable=false)
    private LocalDateTime dateChoix;
    @Column(name="TYPE_TEST", length=1)
    private String typeTest;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ID_ET", nullable=false)
    private EspEtudiant espEtudiant;

    /** Default constructor. */
    public EspTestEtud() {
        super();
    }

    /**
     * Access method for typeChoix.
     *
     * @return the current value of typeChoix
     */
    public String getTypeChoix() {
        return typeChoix;
    }

    /**
     * Setter method for typeChoix.
     *
     * @param aTypeChoix the new value for typeChoix
     */
    public void setTypeChoix(String aTypeChoix) {
        typeChoix = aTypeChoix;
    }

    /**
     * Access method for dateChoix.
     *
     * @return the current value of dateChoix
     */
    public LocalDateTime getDateChoix() {
        return dateChoix;
    }

    /**
     * Setter method for dateChoix.
     *
     * @param aDateChoix the new value for dateChoix
     */
    public void setDateChoix(LocalDateTime aDateChoix) {
        dateChoix = aDateChoix;
    }

    /**
     * Access method for typeTest.
     *
     * @return the current value of typeTest
     */
    public String getTypeTest() {
        return typeTest;
    }

    /**
     * Setter method for typeTest.
     *
     * @param aTypeTest the new value for typeTest
     */
    public void setTypeTest(String aTypeTest) {
        typeTest = aTypeTest;
    }

    /**
     * Access method for espEtudiant.
     *
     * @return the current value of espEtudiant
     */
    public EspEtudiant getEspEtudiant() {
        return espEtudiant;
    }

    /**
     * Setter method for espEtudiant.
     *
     * @param aEspEtudiant the new value for espEtudiant
     */
    public void setEspEtudiant(EspEtudiant aEspEtudiant) {
        espEtudiant = aEspEtudiant;
    }

    /** Temporary value holder for group key fragment espEtudiantIdEt */
    private transient String tempEspEtudiantIdEt;

    /**
     * Gets the key fragment idEt for member espEtudiant.
     * If this.espEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspEtudiantIdEt.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspEtudiant
     */
    public String getEspEtudiantIdEt() {
        return (getEspEtudiant() == null ? tempEspEtudiantIdEt : getEspEtudiant().getIdEt());
    }

    /**
     * Sets the key fragment idEt from member espEtudiant.
     * If this.espEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspEtudiantIdEt.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdEt New value for the key fragment
     * @see EspEtudiant
     */
    public void setEspEtudiantIdEt(String aIdEt) {
        if (getEspEtudiant() == null) {
            tempEspEtudiantIdEt = aIdEt;
        } else {
            getEspEtudiant().setIdEt(aIdEt);
        }
    }

    /**
     * Compares the key for this instance with another EspTestEtud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspTestEtud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspTestEtud)) {
            return false;
        }
        EspTestEtud that = (EspTestEtud) other;
        Object myEspEtudiantIdEt = this.getEspEtudiantIdEt();
        Object yourEspEtudiantIdEt = that.getEspEtudiantIdEt();
        if (myEspEtudiantIdEt==null ? yourEspEtudiantIdEt!=null : !myEspEtudiantIdEt.equals(yourEspEtudiantIdEt)) {
            return false;
        }
        Object myDateChoix = this.getDateChoix();
        Object yourDateChoix = that.getDateChoix();
        if (myDateChoix==null ? yourDateChoix!=null : !myDateChoix.equals(yourDateChoix)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspTestEtud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspTestEtud)) return false;
        return this.equalKeys(other) && ((EspTestEtud)other).equalKeys(this);
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
        if (getEspEtudiantIdEt() == null) {
            i = 0;
        } else {
            i = getEspEtudiantIdEt().hashCode();
        }
        result = 37*result + i;
        if (getDateChoix() == null) {
            i = 0;
        } else {
            i = getDateChoix().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspTestEtud |");
        sb.append(" espEtudiantIdEt=").append(getEspEtudiantIdEt());
        sb.append(" dateChoix=").append(getDateChoix());
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
        ret.put("espEtudiantIdEt", getEspEtudiantIdEt());
        ret.put("dateChoix", getDateChoix());
        return ret;
    }

}
