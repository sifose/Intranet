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

@Entity(name="ESP_AUDIT_ADMISSION")
@IdClass(EspAuditAdmission.EspAuditAdmissionId.class)
public class EspAuditAdmission implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspAuditAdmissionId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String idEt;
        java.time.LocalDateTime dateOp;
    }

    /** Primary key. */
    protected static final String PK = "EspAuditAdmissionPkAuditAdmission";

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
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Id
    @Column(name="DATE_OP", nullable=false)
    private LocalDateTime dateOp;
    @Column(name="COM_COL", length=20)
    private String comCol;
    @Column(name="VAL_INIT", length=20)
    private String valInit;
    @Column(name="VAL_FINAL", length=20)
    private String valFinal;
    @Column(name="ADRESSE_IP", length=20)
    private String adresseIp;
    @Column(name="NOM_MACHINE", length=30)
    private String nomMachine;

    /** Default constructor. */
    public EspAuditAdmission() {
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
     * Access method for comCol.
     *
     * @return the current value of comCol
     */
    public String getComCol() {
        return comCol;
    }

    /**
     * Setter method for comCol.
     *
     * @param aComCol the new value for comCol
     */
    public void setComCol(String aComCol) {
        comCol = aComCol;
    }

    /**
     * Access method for valInit.
     *
     * @return the current value of valInit
     */
    public String getValInit() {
        return valInit;
    }

    /**
     * Setter method for valInit.
     *
     * @param aValInit the new value for valInit
     */
    public void setValInit(String aValInit) {
        valInit = aValInit;
    }

    /**
     * Access method for valFinal.
     *
     * @return the current value of valFinal
     */
    public String getValFinal() {
        return valFinal;
    }

    /**
     * Setter method for valFinal.
     *
     * @param aValFinal the new value for valFinal
     */
    public void setValFinal(String aValFinal) {
        valFinal = aValFinal;
    }

    /**
     * Access method for adresseIp.
     *
     * @return the current value of adresseIp
     */
    public String getAdresseIp() {
        return adresseIp;
    }

    /**
     * Setter method for adresseIp.
     *
     * @param aAdresseIp the new value for adresseIp
     */
    public void setAdresseIp(String aAdresseIp) {
        adresseIp = aAdresseIp;
    }

    /**
     * Access method for nomMachine.
     *
     * @return the current value of nomMachine
     */
    public String getNomMachine() {
        return nomMachine;
    }

    /**
     * Setter method for nomMachine.
     *
     * @param aNomMachine the new value for nomMachine
     */
    public void setNomMachine(String aNomMachine) {
        nomMachine = aNomMachine;
    }

    /**
     * Compares the key for this instance with another EspAuditAdmission.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspAuditAdmission and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspAuditAdmission)) {
            return false;
        }
        EspAuditAdmission that = (EspAuditAdmission) other;
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
        Object myDateOp = this.getDateOp();
        Object yourDateOp = that.getDateOp();
        if (myDateOp==null ? yourDateOp!=null : !myDateOp.equals(yourDateOp)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspAuditAdmission.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspAuditAdmission)) return false;
        return this.equalKeys(other) && ((EspAuditAdmission)other).equalKeys(this);
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
        if (getDateOp() == null) {
            i = 0;
        } else {
            i = getDateOp().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspAuditAdmission |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" idEt=").append(getIdEt());
        sb.append(" dateOp=").append(getDateOp());
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
        ret.put("dateOp", getDateOp());
        return ret;
    }

}
