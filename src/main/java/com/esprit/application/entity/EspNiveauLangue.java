// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="ESP_NIVEAU_LANGUE", indexes={@Index(name="espNiveauLangueEspNiveauLangueX", columnList="ID_ET,DATE_NIVEAU,LANGUE", unique=true)})
public class EspNiveauLangue implements Serializable {

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
    @Column(name="LANGUE", nullable=false, length=20)
    private String langue;
    @Column(name="ANCIEN_NIVEAU", length=20)
    private String ancienNiveau;
    @Column(name="NIVEAU_ACTUEL", length=20)
    private String niveauActuel;
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="DATE_NIVEAU", nullable=false)
    private LocalDateTime dateNiveau;

    /** Default constructor. */
    public EspNiveauLangue() {
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
     * Access method for langue.
     *
     * @return the current value of langue
     */
    public String getLangue() {
        return langue;
    }

    /**
     * Setter method for langue.
     *
     * @param aLangue the new value for langue
     */
    public void setLangue(String aLangue) {
        langue = aLangue;
    }

    /**
     * Access method for ancienNiveau.
     *
     * @return the current value of ancienNiveau
     */
    public String getAncienNiveau() {
        return ancienNiveau;
    }

    /**
     * Setter method for ancienNiveau.
     *
     * @param aAncienNiveau the new value for ancienNiveau
     */
    public void setAncienNiveau(String aAncienNiveau) {
        ancienNiveau = aAncienNiveau;
    }

    /**
     * Access method for niveauActuel.
     *
     * @return the current value of niveauActuel
     */
    public String getNiveauActuel() {
        return niveauActuel;
    }

    /**
     * Setter method for niveauActuel.
     *
     * @param aNiveauActuel the new value for niveauActuel
     */
    public void setNiveauActuel(String aNiveauActuel) {
        niveauActuel = aNiveauActuel;
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
     * Access method for dateNiveau.
     *
     * @return the current value of dateNiveau
     */
    public LocalDateTime getDateNiveau() {
        return dateNiveau;
    }

    /**
     * Setter method for dateNiveau.
     *
     * @param aDateNiveau the new value for dateNiveau
     */
    public void setDateNiveau(LocalDateTime aDateNiveau) {
        dateNiveau = aDateNiveau;
    }

}
