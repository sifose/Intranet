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

@Entity(name="ESP_TRACE_CORRECT_NUMCPT")
@IdClass(EspTraceCorrectNumcpt.EspTraceCorrectNumcptId.class)
public class EspTraceCorrectNumcpt implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspTraceCorrectNumcptId implements Serializable {
        java.lang.String idEt;
        java.time.LocalDateTime dateCorrect;
        java.lang.String typeCorrect;
    }

    /** Primary key. */
    protected static final String PK = "EspTraceCorrectNumcptPkTracEeCorrectNumcpt";

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
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Id
    @Column(name="DATE_CORRECT", nullable=false)
    private LocalDateTime dateCorrect;
    @Id
    @Column(name="TYPE_CORRECT", nullable=false, length=2)
    private String typeCorrect;
    @Column(name="OLD_NUMCPT", length=10)
    private String oldNumcpt;
    @Column(name="NEW_NUMCPT", length=10)
    private String newNumcpt;

    /** Default constructor. */
    public EspTraceCorrectNumcpt() {
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
     * Access method for dateCorrect.
     *
     * @return the current value of dateCorrect
     */
    public LocalDateTime getDateCorrect() {
        return dateCorrect;
    }

    /**
     * Setter method for dateCorrect.
     *
     * @param aDateCorrect the new value for dateCorrect
     */
    public void setDateCorrect(LocalDateTime aDateCorrect) {
        dateCorrect = aDateCorrect;
    }

    /**
     * Access method for typeCorrect.
     *
     * @return the current value of typeCorrect
     */
    public String getTypeCorrect() {
        return typeCorrect;
    }

    /**
     * Setter method for typeCorrect.
     *
     * @param aTypeCorrect the new value for typeCorrect
     */
    public void setTypeCorrect(String aTypeCorrect) {
        typeCorrect = aTypeCorrect;
    }

    /**
     * Access method for oldNumcpt.
     *
     * @return the current value of oldNumcpt
     */
    public String getOldNumcpt() {
        return oldNumcpt;
    }

    /**
     * Setter method for oldNumcpt.
     *
     * @param aOldNumcpt the new value for oldNumcpt
     */
    public void setOldNumcpt(String aOldNumcpt) {
        oldNumcpt = aOldNumcpt;
    }

    /**
     * Access method for newNumcpt.
     *
     * @return the current value of newNumcpt
     */
    public String getNewNumcpt() {
        return newNumcpt;
    }

    /**
     * Setter method for newNumcpt.
     *
     * @param aNewNumcpt the new value for newNumcpt
     */
    public void setNewNumcpt(String aNewNumcpt) {
        newNumcpt = aNewNumcpt;
    }

    /**
     * Compares the key for this instance with another EspTraceCorrectNumcpt.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspTraceCorrectNumcpt and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspTraceCorrectNumcpt)) {
            return false;
        }
        EspTraceCorrectNumcpt that = (EspTraceCorrectNumcpt) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myDateCorrect = this.getDateCorrect();
        Object yourDateCorrect = that.getDateCorrect();
        if (myDateCorrect==null ? yourDateCorrect!=null : !myDateCorrect.equals(yourDateCorrect)) {
            return false;
        }
        Object myTypeCorrect = this.getTypeCorrect();
        Object yourTypeCorrect = that.getTypeCorrect();
        if (myTypeCorrect==null ? yourTypeCorrect!=null : !myTypeCorrect.equals(yourTypeCorrect)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspTraceCorrectNumcpt.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspTraceCorrectNumcpt)) return false;
        return this.equalKeys(other) && ((EspTraceCorrectNumcpt)other).equalKeys(this);
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
        if (getDateCorrect() == null) {
            i = 0;
        } else {
            i = getDateCorrect().hashCode();
        }
        result = 37*result + i;
        if (getTypeCorrect() == null) {
            i = 0;
        } else {
            i = getTypeCorrect().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspTraceCorrectNumcpt |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" dateCorrect=").append(getDateCorrect());
        sb.append(" typeCorrect=").append(getTypeCorrect());
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
        ret.put("dateCorrect", getDateCorrect());
        ret.put("typeCorrect", getTypeCorrect());
        return ret;
    }

}
