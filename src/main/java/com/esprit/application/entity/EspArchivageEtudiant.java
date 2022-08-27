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

@Entity(name="ESP_ARCHIVAGE_ETUDIANT")
@IdClass(EspArchivageEtudiant.EspArchivageEtudiantId.class)
public class EspArchivageEtudiant implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspArchivageEtudiantId implements Serializable {
        java.lang.String idEt;
        java.lang.String typeArchivage;
        java.time.LocalDateTime dateArchivage;
    }

    /** Primary key. */
    protected static final String PK = "EspArchivageEtudiantPkArchivageEt";

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
    @Column(name="TYPE_ARCHIVAGE", nullable=false, length=1)
    private String typeArchivage;
    @Id
    @Column(name="DATE_ARCHIVAGE", nullable=false)
    private LocalDateTime dateArchivage;
    @Column(name="MOTIF_ARCHIVAGE", length=2)
    private String motifArchivage;
    @Column(name="RESP_ARCHIVAGE", length=20)
    private String respArchivage;
    @Column(name="IP_RCHIVAGE", length=20)
    private String ipRchivage;
    @Column(name="MACHINE_ARCHIVAGE", length=40)
    private String machineArchivage;

    /** Default constructor. */
    public EspArchivageEtudiant() {
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
     * Access method for typeArchivage.
     *
     * @return the current value of typeArchivage
     */
    public String getTypeArchivage() {
        return typeArchivage;
    }

    /**
     * Setter method for typeArchivage.
     *
     * @param aTypeArchivage the new value for typeArchivage
     */
    public void setTypeArchivage(String aTypeArchivage) {
        typeArchivage = aTypeArchivage;
    }

    /**
     * Access method for dateArchivage.
     *
     * @return the current value of dateArchivage
     */
    public LocalDateTime getDateArchivage() {
        return dateArchivage;
    }

    /**
     * Setter method for dateArchivage.
     *
     * @param aDateArchivage the new value for dateArchivage
     */
    public void setDateArchivage(LocalDateTime aDateArchivage) {
        dateArchivage = aDateArchivage;
    }

    /**
     * Access method for motifArchivage.
     *
     * @return the current value of motifArchivage
     */
    public String getMotifArchivage() {
        return motifArchivage;
    }

    /**
     * Setter method for motifArchivage.
     *
     * @param aMotifArchivage the new value for motifArchivage
     */
    public void setMotifArchivage(String aMotifArchivage) {
        motifArchivage = aMotifArchivage;
    }

    /**
     * Access method for respArchivage.
     *
     * @return the current value of respArchivage
     */
    public String getRespArchivage() {
        return respArchivage;
    }

    /**
     * Setter method for respArchivage.
     *
     * @param aRespArchivage the new value for respArchivage
     */
    public void setRespArchivage(String aRespArchivage) {
        respArchivage = aRespArchivage;
    }

    /**
     * Access method for ipRchivage.
     *
     * @return the current value of ipRchivage
     */
    public String getIpRchivage() {
        return ipRchivage;
    }

    /**
     * Setter method for ipRchivage.
     *
     * @param aIpRchivage the new value for ipRchivage
     */
    public void setIpRchivage(String aIpRchivage) {
        ipRchivage = aIpRchivage;
    }

    /**
     * Access method for machineArchivage.
     *
     * @return the current value of machineArchivage
     */
    public String getMachineArchivage() {
        return machineArchivage;
    }

    /**
     * Setter method for machineArchivage.
     *
     * @param aMachineArchivage the new value for machineArchivage
     */
    public void setMachineArchivage(String aMachineArchivage) {
        machineArchivage = aMachineArchivage;
    }

    /**
     * Compares the key for this instance with another EspArchivageEtudiant.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspArchivageEtudiant and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspArchivageEtudiant)) {
            return false;
        }
        EspArchivageEtudiant that = (EspArchivageEtudiant) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myTypeArchivage = this.getTypeArchivage();
        Object yourTypeArchivage = that.getTypeArchivage();
        if (myTypeArchivage==null ? yourTypeArchivage!=null : !myTypeArchivage.equals(yourTypeArchivage)) {
            return false;
        }
        Object myDateArchivage = this.getDateArchivage();
        Object yourDateArchivage = that.getDateArchivage();
        if (myDateArchivage==null ? yourDateArchivage!=null : !myDateArchivage.equals(yourDateArchivage)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspArchivageEtudiant.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspArchivageEtudiant)) return false;
        return this.equalKeys(other) && ((EspArchivageEtudiant)other).equalKeys(this);
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
        if (getTypeArchivage() == null) {
            i = 0;
        } else {
            i = getTypeArchivage().hashCode();
        }
        result = 37*result + i;
        if (getDateArchivage() == null) {
            i = 0;
        } else {
            i = getDateArchivage().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspArchivageEtudiant |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" typeArchivage=").append(getTypeArchivage());
        sb.append(" dateArchivage=").append(getDateArchivage());
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
        ret.put("typeArchivage", getTypeArchivage());
        ret.put("dateArchivage", getDateArchivage());
        return ret;
    }

}
