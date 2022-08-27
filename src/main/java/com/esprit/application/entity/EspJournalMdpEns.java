// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class EspJournalMdpEns implements Serializable {

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
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;
    @Column(name="DATE_MODIF")
    private LocalDateTime dateModif;
    @Column(name="OLD_MDP", length=10)
    private String oldMdp;
    @Column(name="NEW_MDP", length=10)
    private String newMdp;
    @Column(name="IP_MODIF", length=20)
    private String ipModif;
    @Column(name="MACHINE_MODIF", length=30)
    private String machineModif;

    /** Default constructor. */
    public EspJournalMdpEns() {
        super();
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
     * Access method for dateModif.
     *
     * @return the current value of dateModif
     */
    public LocalDateTime getDateModif() {
        return dateModif;
    }

    /**
     * Setter method for dateModif.
     *
     * @param aDateModif the new value for dateModif
     */
    public void setDateModif(LocalDateTime aDateModif) {
        dateModif = aDateModif;
    }

    /**
     * Access method for oldMdp.
     *
     * @return the current value of oldMdp
     */
    public String getOldMdp() {
        return oldMdp;
    }

    /**
     * Setter method for oldMdp.
     *
     * @param aOldMdp the new value for oldMdp
     */
    public void setOldMdp(String aOldMdp) {
        oldMdp = aOldMdp;
    }

    /**
     * Access method for newMdp.
     *
     * @return the current value of newMdp
     */
    public String getNewMdp() {
        return newMdp;
    }

    /**
     * Setter method for newMdp.
     *
     * @param aNewMdp the new value for newMdp
     */
    public void setNewMdp(String aNewMdp) {
        newMdp = aNewMdp;
    }

    /**
     * Access method for ipModif.
     *
     * @return the current value of ipModif
     */
    public String getIpModif() {
        return ipModif;
    }

    /**
     * Setter method for ipModif.
     *
     * @param aIpModif the new value for ipModif
     */
    public void setIpModif(String aIpModif) {
        ipModif = aIpModif;
    }

    /**
     * Access method for machineModif.
     *
     * @return the current value of machineModif
     */
    public String getMachineModif() {
        return machineModif;
    }

    /**
     * Setter method for machineModif.
     *
     * @param aMachineModif the new value for machineModif
     */
    public void setMachineModif(String aMachineModif) {
        machineModif = aMachineModif;
    }

}
