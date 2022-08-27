// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class EspEtudiant2013 implements Serializable {

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
    @Column(name="NUM_CIN_PASSEPORT", length=30)
    private String numCinPasseport;
    @Column(name="NOM_ET", length=30)
    private String nomEt;
    @Column(name="PNOM_ET", length=30)
    private String pnomEt;
    @Column(name="E_MAIL_ET", length=60)
    private String eMailEt;
    @Column(name="TEL_ET", length=120)
    private String telEt;
    @Column(name="ADRESSE_ET", length=100)
    private String adresseEt;
    @Column(name="SPECIALITE_ESP_ET", length=2)
    private String specialiteEspEt;
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Column(name="ADRESSE_MAIL_ESP", length=50)
    private String adresseMailEsp;
    @Column(name="CODE_CL_PREC", length=10)
    private String codeClPrec;
    @Column(name="ID", nullable=false, precision=19)
    private BigDecimal id;

    /** Default constructor. */
    public EspEtudiant2013() {
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
     * Access method for numCinPasseport.
     *
     * @return the current value of numCinPasseport
     */
    public String getNumCinPasseport() {
        return numCinPasseport;
    }

    /**
     * Setter method for numCinPasseport.
     *
     * @param aNumCinPasseport the new value for numCinPasseport
     */
    public void setNumCinPasseport(String aNumCinPasseport) {
        numCinPasseport = aNumCinPasseport;
    }

    /**
     * Access method for nomEt.
     *
     * @return the current value of nomEt
     */
    public String getNomEt() {
        return nomEt;
    }

    /**
     * Setter method for nomEt.
     *
     * @param aNomEt the new value for nomEt
     */
    public void setNomEt(String aNomEt) {
        nomEt = aNomEt;
    }

    /**
     * Access method for pnomEt.
     *
     * @return the current value of pnomEt
     */
    public String getPnomEt() {
        return pnomEt;
    }

    /**
     * Setter method for pnomEt.
     *
     * @param aPnomEt the new value for pnomEt
     */
    public void setPnomEt(String aPnomEt) {
        pnomEt = aPnomEt;
    }

    /**
     * Access method for eMailEt.
     *
     * @return the current value of eMailEt
     */
    public String getEMailEt() {
        return eMailEt;
    }

    /**
     * Setter method for eMailEt.
     *
     * @param aEMailEt the new value for eMailEt
     */
    public void setEMailEt(String aEMailEt) {
        eMailEt = aEMailEt;
    }

    /**
     * Access method for telEt.
     *
     * @return the current value of telEt
     */
    public String getTelEt() {
        return telEt;
    }

    /**
     * Setter method for telEt.
     *
     * @param aTelEt the new value for telEt
     */
    public void setTelEt(String aTelEt) {
        telEt = aTelEt;
    }

    /**
     * Access method for adresseEt.
     *
     * @return the current value of adresseEt
     */
    public String getAdresseEt() {
        return adresseEt;
    }

    /**
     * Setter method for adresseEt.
     *
     * @param aAdresseEt the new value for adresseEt
     */
    public void setAdresseEt(String aAdresseEt) {
        adresseEt = aAdresseEt;
    }

    /**
     * Access method for specialiteEspEt.
     *
     * @return the current value of specialiteEspEt
     */
    public String getSpecialiteEspEt() {
        return specialiteEspEt;
    }

    /**
     * Setter method for specialiteEspEt.
     *
     * @param aSpecialiteEspEt the new value for specialiteEspEt
     */
    public void setSpecialiteEspEt(String aSpecialiteEspEt) {
        specialiteEspEt = aSpecialiteEspEt;
    }

    /**
     * Access method for codeCl.
     *
     * @return the current value of codeCl
     */
    public String getCodeCl() {
        return codeCl;
    }

    /**
     * Setter method for codeCl.
     *
     * @param aCodeCl the new value for codeCl
     */
    public void setCodeCl(String aCodeCl) {
        codeCl = aCodeCl;
    }

    /**
     * Access method for adresseMailEsp.
     *
     * @return the current value of adresseMailEsp
     */
    public String getAdresseMailEsp() {
        return adresseMailEsp;
    }

    /**
     * Setter method for adresseMailEsp.
     *
     * @param aAdresseMailEsp the new value for adresseMailEsp
     */
    public void setAdresseMailEsp(String aAdresseMailEsp) {
        adresseMailEsp = aAdresseMailEsp;
    }

    /**
     * Access method for codeClPrec.
     *
     * @return the current value of codeClPrec
     */
    public String getCodeClPrec() {
        return codeClPrec;
    }

    /**
     * Setter method for codeClPrec.
     *
     * @param aCodeClPrec the new value for codeClPrec
     */
    public void setCodeClPrec(String aCodeClPrec) {
        codeClPrec = aCodeClPrec;
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
