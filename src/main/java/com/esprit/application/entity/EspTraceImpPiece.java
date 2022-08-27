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

@Entity(name="ESP_TRACE_IMP_PIECE")
@IdClass(EspTraceImpPiece.EspTraceImpPieceId.class)
public class EspTraceImpPiece implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspTraceImpPieceId implements Serializable {
        java.lang.String anneeDeb;
        java.math.BigDecimal numImp;
    }

    /** Primary key. */
    protected static final String PK = "EspTraceImpPiecePkTraceImp";

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
    @Column(name="NUM_IMP", nullable=false, precision=10)
    private BigDecimal numImp;
    @Column(name="DATE_IMP")
    private LocalDateTime dateImp;
    @Column(name="TYPE_PIECE", length=2)
    private String typePiece;
    @Column(name="USER_IMP", length=15)
    private String userImp;
    @Column(name="MACHINE_IMP", length=20)
    private String machineImp;
    @Column(name="IP_IMP", length=20)
    private String ipImp;
    @Column(name="ID_ET", length=10)
    private String idEt;

    /** Default constructor. */
    public EspTraceImpPiece() {
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
     * Access method for numImp.
     *
     * @return the current value of numImp
     */
    public BigDecimal getNumImp() {
        return numImp;
    }

    /**
     * Setter method for numImp.
     *
     * @param aNumImp the new value for numImp
     */
    public void setNumImp(BigDecimal aNumImp) {
        numImp = aNumImp;
    }

    /**
     * Access method for dateImp.
     *
     * @return the current value of dateImp
     */
    public LocalDateTime getDateImp() {
        return dateImp;
    }

    /**
     * Setter method for dateImp.
     *
     * @param aDateImp the new value for dateImp
     */
    public void setDateImp(LocalDateTime aDateImp) {
        dateImp = aDateImp;
    }

    /**
     * Access method for typePiece.
     *
     * @return the current value of typePiece
     */
    public String getTypePiece() {
        return typePiece;
    }

    /**
     * Setter method for typePiece.
     *
     * @param aTypePiece the new value for typePiece
     */
    public void setTypePiece(String aTypePiece) {
        typePiece = aTypePiece;
    }

    /**
     * Access method for userImp.
     *
     * @return the current value of userImp
     */
    public String getUserImp() {
        return userImp;
    }

    /**
     * Setter method for userImp.
     *
     * @param aUserImp the new value for userImp
     */
    public void setUserImp(String aUserImp) {
        userImp = aUserImp;
    }

    /**
     * Access method for machineImp.
     *
     * @return the current value of machineImp
     */
    public String getMachineImp() {
        return machineImp;
    }

    /**
     * Setter method for machineImp.
     *
     * @param aMachineImp the new value for machineImp
     */
    public void setMachineImp(String aMachineImp) {
        machineImp = aMachineImp;
    }

    /**
     * Access method for ipImp.
     *
     * @return the current value of ipImp
     */
    public String getIpImp() {
        return ipImp;
    }

    /**
     * Setter method for ipImp.
     *
     * @param aIpImp the new value for ipImp
     */
    public void setIpImp(String aIpImp) {
        ipImp = aIpImp;
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
     * Compares the key for this instance with another EspTraceImpPiece.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspTraceImpPiece and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspTraceImpPiece)) {
            return false;
        }
        EspTraceImpPiece that = (EspTraceImpPiece) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myNumImp = this.getNumImp();
        Object yourNumImp = that.getNumImp();
        if (myNumImp==null ? yourNumImp!=null : !myNumImp.equals(yourNumImp)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspTraceImpPiece.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspTraceImpPiece)) return false;
        return this.equalKeys(other) && ((EspTraceImpPiece)other).equalKeys(this);
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
        if (getNumImp() == null) {
            i = 0;
        } else {
            i = getNumImp().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspTraceImpPiece |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" numImp=").append(getNumImp());
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
        ret.put("numImp", getNumImp());
        return ret;
    }

}
