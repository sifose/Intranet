// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class EspAuditConnexion implements Serializable {

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

    @Column(name="DATE_CONNECT")
    private LocalDateTime dateConnect;
    @Column(name="UTILISATEUR", length=20)
    private String utilisateur;
    @Column(name="NOM_PROGRAM", length=20)
    private String nomProgram;
    @Column(name="ADRESSE_IP", length=20)
    private String adresseIp;
    @Column(name="NOM_MACHINE", length=20)
    private String nomMachine;
    @Id
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspAuditConnexion() {
        super();
    }

    /**
     * Access method for dateConnect.
     *
     * @return the current value of dateConnect
     */
    public LocalDateTime getDateConnect() {
        return dateConnect;
    }

    /**
     * Setter method for dateConnect.
     *
     * @param aDateConnect the new value for dateConnect
     */
    public void setDateConnect(LocalDateTime aDateConnect) {
        dateConnect = aDateConnect;
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
     * Access method for nomProgram.
     *
     * @return the current value of nomProgram
     */
    public String getNomProgram() {
        return nomProgram;
    }

    /**
     * Setter method for nomProgram.
     *
     * @param aNomProgram the new value for nomProgram
     */
    public void setNomProgram(String aNomProgram) {
        nomProgram = aNomProgram;
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
     * Access method for id.
     *
     * @return the current value of id
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(BigDecimal aId) {
        id = aId;
    }

}
