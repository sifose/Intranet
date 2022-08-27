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

@Entity(name="DEMANDE_ATTESTATION_ALFIKR")
@IdClass(DemandeAttestationAlfikr.DemandeAttestationAlfikrId.class)
public class DemandeAttestationAlfikr implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class DemandeAttestationAlfikrId implements Serializable {
        java.lang.String idEt;
        java.time.LocalDateTime dateSaisie;
    }

    /** Primary key. */
    protected static final String PK = "DemandeAttestationAlfikrDemandeAttestationAlfikrPk";

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
    @Column(name="ID_ET", nullable=false, length=15)
    private String idEt;
    @Column(name="CODE_CL", length=50)
    private String codeCl;
    @Column(name="JOUR_SORTIE")
    private LocalDateTime jourSortie;
    @Column(name="HEURE", length=500)
    private String heure;
    @Column(name="NOM_PRENOM_PERE_ET", length=500)
    private String nomPrenomPereEt;
    @Column(name="NOM_PERE_ET", length=200)
    private String nomPereEt;
    @Column(name="PRENOM_PERE_ET", length=200)
    private String prenomPereEt;
    @Column(name="NUMERO_CIN_PERE", length=20)
    private String numeroCinPere;
    @Column(name="TYPE_DEMANDE", length=20)
    private String typeDemande;
    @Column(name="CODE_MODULE", length=15)
    private String codeModule;
    @Column(name="ID_ENS", length=15)
    private String idEns;
    @Column(name="CAUSE_ABSECE", length=4000)
    private String causeAbsece;
    @Id
    @Column(name="DATE_SAISIE", nullable=false)
    private LocalDateTime dateSaisie;
    @Column(name="ANNEE_DEB", length=4)
    private String anneeDeb;

    /** Default constructor. */
    public DemandeAttestationAlfikr() {
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
     * Access method for jourSortie.
     *
     * @return the current value of jourSortie
     */
    public LocalDateTime getJourSortie() {
        return jourSortie;
    }

    /**
     * Setter method for jourSortie.
     *
     * @param aJourSortie the new value for jourSortie
     */
    public void setJourSortie(LocalDateTime aJourSortie) {
        jourSortie = aJourSortie;
    }

    /**
     * Access method for heure.
     *
     * @return the current value of heure
     */
    public String getHeure() {
        return heure;
    }

    /**
     * Setter method for heure.
     *
     * @param aHeure the new value for heure
     */
    public void setHeure(String aHeure) {
        heure = aHeure;
    }

    /**
     * Access method for nomPrenomPereEt.
     *
     * @return the current value of nomPrenomPereEt
     */
    public String getNomPrenomPereEt() {
        return nomPrenomPereEt;
    }

    /**
     * Setter method for nomPrenomPereEt.
     *
     * @param aNomPrenomPereEt the new value for nomPrenomPereEt
     */
    public void setNomPrenomPereEt(String aNomPrenomPereEt) {
        nomPrenomPereEt = aNomPrenomPereEt;
    }

    /**
     * Access method for nomPereEt.
     *
     * @return the current value of nomPereEt
     */
    public String getNomPereEt() {
        return nomPereEt;
    }

    /**
     * Setter method for nomPereEt.
     *
     * @param aNomPereEt the new value for nomPereEt
     */
    public void setNomPereEt(String aNomPereEt) {
        nomPereEt = aNomPereEt;
    }

    /**
     * Access method for prenomPereEt.
     *
     * @return the current value of prenomPereEt
     */
    public String getPrenomPereEt() {
        return prenomPereEt;
    }

    /**
     * Setter method for prenomPereEt.
     *
     * @param aPrenomPereEt the new value for prenomPereEt
     */
    public void setPrenomPereEt(String aPrenomPereEt) {
        prenomPereEt = aPrenomPereEt;
    }

    /**
     * Access method for numeroCinPere.
     *
     * @return the current value of numeroCinPere
     */
    public String getNumeroCinPere() {
        return numeroCinPere;
    }

    /**
     * Setter method for numeroCinPere.
     *
     * @param aNumeroCinPere the new value for numeroCinPere
     */
    public void setNumeroCinPere(String aNumeroCinPere) {
        numeroCinPere = aNumeroCinPere;
    }

    /**
     * Access method for typeDemande.
     *
     * @return the current value of typeDemande
     */
    public String getTypeDemande() {
        return typeDemande;
    }

    /**
     * Setter method for typeDemande.
     *
     * @param aTypeDemande the new value for typeDemande
     */
    public void setTypeDemande(String aTypeDemande) {
        typeDemande = aTypeDemande;
    }

    /**
     * Access method for codeModule.
     *
     * @return the current value of codeModule
     */
    public String getCodeModule() {
        return codeModule;
    }

    /**
     * Setter method for codeModule.
     *
     * @param aCodeModule the new value for codeModule
     */
    public void setCodeModule(String aCodeModule) {
        codeModule = aCodeModule;
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
     * Access method for causeAbsece.
     *
     * @return the current value of causeAbsece
     */
    public String getCauseAbsece() {
        return causeAbsece;
    }

    /**
     * Setter method for causeAbsece.
     *
     * @param aCauseAbsece the new value for causeAbsece
     */
    public void setCauseAbsece(String aCauseAbsece) {
        causeAbsece = aCauseAbsece;
    }

    /**
     * Access method for dateSaisie.
     *
     * @return the current value of dateSaisie
     */
    public LocalDateTime getDateSaisie() {
        return dateSaisie;
    }

    /**
     * Setter method for dateSaisie.
     *
     * @param aDateSaisie the new value for dateSaisie
     */
    public void setDateSaisie(LocalDateTime aDateSaisie) {
        dateSaisie = aDateSaisie;
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
     * Compares the key for this instance with another DemandeAttestationAlfikr.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class DemandeAttestationAlfikr and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DemandeAttestationAlfikr)) {
            return false;
        }
        DemandeAttestationAlfikr that = (DemandeAttestationAlfikr) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myDateSaisie = this.getDateSaisie();
        Object yourDateSaisie = that.getDateSaisie();
        if (myDateSaisie==null ? yourDateSaisie!=null : !myDateSaisie.equals(yourDateSaisie)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another DemandeAttestationAlfikr.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DemandeAttestationAlfikr)) return false;
        return this.equalKeys(other) && ((DemandeAttestationAlfikr)other).equalKeys(this);
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
        if (getDateSaisie() == null) {
            i = 0;
        } else {
            i = getDateSaisie().hashCode();
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
        StringBuffer sb = new StringBuffer("[DemandeAttestationAlfikr |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" dateSaisie=").append(getDateSaisie());
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
        ret.put("dateSaisie", getDateSaisie());
        return ret;
    }

}
