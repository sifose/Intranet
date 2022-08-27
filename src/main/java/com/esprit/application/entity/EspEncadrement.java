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

@Entity(name="ESP_ENCADREMENT")
@IdClass(EspEncadrement.EspEncadrementId.class)
public class EspEncadrement implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspEncadrementId implements Serializable {
        java.lang.String idProjet;
        java.lang.String idEt;
        java.time.LocalDateTime dateEnc;
    }

    /** Primary key. */
    protected static final String PK = "EspEncadrementConstraint18";

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
    @Column(name="ID_PROJET", nullable=false, length=10)
    private String idProjet;
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="TYPE_PROJET", nullable=false, length=2)
    private String typeProjet;
    @Id
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Id
    @Column(name="DATE_ENC", nullable=false)
    private LocalDateTime dateEnc;
    @Column(name="HEURE_DEB")
    private LocalDateTime heureDeb;
    @Column(name="HEURE_FIN")
    private LocalDateTime heureFin;
    @Column(name="DUREE")
    private LocalDateTime duree;
    @Column(name="AV_TECH", precision=3)
    private BigDecimal avTech;
    @Column(name="AV_ANG", length=2)
    private String avAng;
    @Column(name="AV_FR", length=20)
    private String avFr;
    @Column(name="AV_RAPPORT", precision=3)
    private BigDecimal avRapport;
    @Column(name="AV_CC", precision=3)
    private BigDecimal avCc;
    @Column(name="COMPORTEMENT", length=2)
    private String comportement;
    @Column(name="REMARQUE_OBS", length=2000)
    private String remarqueObs;
    @Column(name="TRAVAUX_DEMANDE", length=2000)
    private String travauxDemande;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="OBS_TECH", length=200)
    private String obsTech;
    @Column(name="OBS_ANGLAIS", length=200)
    private String obsAnglais;
    @Column(name="OBS_CC", length=200)
    private String obsCc;
    @Column(name="OBS_FRANCAIS", length=200)
    private String obsFrancais;
    @Column(name="OBS_RAPPORT", length=200)
    private String obsRapport;

    /** Default constructor. */
    public EspEncadrement() {
        super();
    }

    /**
     * Access method for idProjet.
     *
     * @return the current value of idProjet
     */
    public String getIdProjet() {
        return idProjet;
    }

    /**
     * Setter method for idProjet.
     *
     * @param aIdProjet the new value for idProjet
     */
    public void setIdProjet(String aIdProjet) {
        idProjet = aIdProjet;
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
     * Access method for typeProjet.
     *
     * @return the current value of typeProjet
     */
    public String getTypeProjet() {
        return typeProjet;
    }

    /**
     * Setter method for typeProjet.
     *
     * @param aTypeProjet the new value for typeProjet
     */
    public void setTypeProjet(String aTypeProjet) {
        typeProjet = aTypeProjet;
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
     * Access method for dateEnc.
     *
     * @return the current value of dateEnc
     */
    public LocalDateTime getDateEnc() {
        return dateEnc;
    }

    /**
     * Setter method for dateEnc.
     *
     * @param aDateEnc the new value for dateEnc
     */
    public void setDateEnc(LocalDateTime aDateEnc) {
        dateEnc = aDateEnc;
    }

    /**
     * Access method for heureDeb.
     *
     * @return the current value of heureDeb
     */
    public LocalDateTime getHeureDeb() {
        return heureDeb;
    }

    /**
     * Setter method for heureDeb.
     *
     * @param aHeureDeb the new value for heureDeb
     */
    public void setHeureDeb(LocalDateTime aHeureDeb) {
        heureDeb = aHeureDeb;
    }

    /**
     * Access method for heureFin.
     *
     * @return the current value of heureFin
     */
    public LocalDateTime getHeureFin() {
        return heureFin;
    }

    /**
     * Setter method for heureFin.
     *
     * @param aHeureFin the new value for heureFin
     */
    public void setHeureFin(LocalDateTime aHeureFin) {
        heureFin = aHeureFin;
    }

    /**
     * Access method for duree.
     *
     * @return the current value of duree
     */
    public LocalDateTime getDuree() {
        return duree;
    }

    /**
     * Setter method for duree.
     *
     * @param aDuree the new value for duree
     */
    public void setDuree(LocalDateTime aDuree) {
        duree = aDuree;
    }

    /**
     * Access method for avTech.
     *
     * @return the current value of avTech
     */
    public BigDecimal getAvTech() {
        return avTech;
    }

    /**
     * Setter method for avTech.
     *
     * @param aAvTech the new value for avTech
     */
    public void setAvTech(BigDecimal aAvTech) {
        avTech = aAvTech;
    }

    /**
     * Access method for avAng.
     *
     * @return the current value of avAng
     */
    public String getAvAng() {
        return avAng;
    }

    /**
     * Setter method for avAng.
     *
     * @param aAvAng the new value for avAng
     */
    public void setAvAng(String aAvAng) {
        avAng = aAvAng;
    }

    /**
     * Access method for avFr.
     *
     * @return the current value of avFr
     */
    public String getAvFr() {
        return avFr;
    }

    /**
     * Setter method for avFr.
     *
     * @param aAvFr the new value for avFr
     */
    public void setAvFr(String aAvFr) {
        avFr = aAvFr;
    }

    /**
     * Access method for avRapport.
     *
     * @return the current value of avRapport
     */
    public BigDecimal getAvRapport() {
        return avRapport;
    }

    /**
     * Setter method for avRapport.
     *
     * @param aAvRapport the new value for avRapport
     */
    public void setAvRapport(BigDecimal aAvRapport) {
        avRapport = aAvRapport;
    }

    /**
     * Access method for avCc.
     *
     * @return the current value of avCc
     */
    public BigDecimal getAvCc() {
        return avCc;
    }

    /**
     * Setter method for avCc.
     *
     * @param aAvCc the new value for avCc
     */
    public void setAvCc(BigDecimal aAvCc) {
        avCc = aAvCc;
    }

    /**
     * Access method for comportement.
     *
     * @return the current value of comportement
     */
    public String getComportement() {
        return comportement;
    }

    /**
     * Setter method for comportement.
     *
     * @param aComportement the new value for comportement
     */
    public void setComportement(String aComportement) {
        comportement = aComportement;
    }

    /**
     * Access method for remarqueObs.
     *
     * @return the current value of remarqueObs
     */
    public String getRemarqueObs() {
        return remarqueObs;
    }

    /**
     * Setter method for remarqueObs.
     *
     * @param aRemarqueObs the new value for remarqueObs
     */
    public void setRemarqueObs(String aRemarqueObs) {
        remarqueObs = aRemarqueObs;
    }

    /**
     * Access method for travauxDemande.
     *
     * @return the current value of travauxDemande
     */
    public String getTravauxDemande() {
        return travauxDemande;
    }

    /**
     * Setter method for travauxDemande.
     *
     * @param aTravauxDemande the new value for travauxDemande
     */
    public void setTravauxDemande(String aTravauxDemande) {
        travauxDemande = aTravauxDemande;
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
     * Access method for obsTech.
     *
     * @return the current value of obsTech
     */
    public String getObsTech() {
        return obsTech;
    }

    /**
     * Setter method for obsTech.
     *
     * @param aObsTech the new value for obsTech
     */
    public void setObsTech(String aObsTech) {
        obsTech = aObsTech;
    }

    /**
     * Access method for obsAnglais.
     *
     * @return the current value of obsAnglais
     */
    public String getObsAnglais() {
        return obsAnglais;
    }

    /**
     * Setter method for obsAnglais.
     *
     * @param aObsAnglais the new value for obsAnglais
     */
    public void setObsAnglais(String aObsAnglais) {
        obsAnglais = aObsAnglais;
    }

    /**
     * Access method for obsCc.
     *
     * @return the current value of obsCc
     */
    public String getObsCc() {
        return obsCc;
    }

    /**
     * Setter method for obsCc.
     *
     * @param aObsCc the new value for obsCc
     */
    public void setObsCc(String aObsCc) {
        obsCc = aObsCc;
    }

    /**
     * Access method for obsFrancais.
     *
     * @return the current value of obsFrancais
     */
    public String getObsFrancais() {
        return obsFrancais;
    }

    /**
     * Setter method for obsFrancais.
     *
     * @param aObsFrancais the new value for obsFrancais
     */
    public void setObsFrancais(String aObsFrancais) {
        obsFrancais = aObsFrancais;
    }

    /**
     * Access method for obsRapport.
     *
     * @return the current value of obsRapport
     */
    public String getObsRapport() {
        return obsRapport;
    }

    /**
     * Setter method for obsRapport.
     *
     * @param aObsRapport the new value for obsRapport
     */
    public void setObsRapport(String aObsRapport) {
        obsRapport = aObsRapport;
    }

    /**
     * Compares the key for this instance with another EspEncadrement.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspEncadrement and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspEncadrement)) {
            return false;
        }
        EspEncadrement that = (EspEncadrement) other;
        Object myIdProjet = this.getIdProjet();
        Object yourIdProjet = that.getIdProjet();
        if (myIdProjet==null ? yourIdProjet!=null : !myIdProjet.equals(yourIdProjet)) {
            return false;
        }
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myDateEnc = this.getDateEnc();
        Object yourDateEnc = that.getDateEnc();
        if (myDateEnc==null ? yourDateEnc!=null : !myDateEnc.equals(yourDateEnc)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspEncadrement.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspEncadrement)) return false;
        return this.equalKeys(other) && ((EspEncadrement)other).equalKeys(this);
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
        if (getIdProjet() == null) {
            i = 0;
        } else {
            i = getIdProjet().hashCode();
        }
        result = 37*result + i;
        if (getIdEt() == null) {
            i = 0;
        } else {
            i = getIdEt().hashCode();
        }
        result = 37*result + i;
        if (getDateEnc() == null) {
            i = 0;
        } else {
            i = getDateEnc().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspEncadrement |");
        sb.append(" idProjet=").append(getIdProjet());
        sb.append(" idEt=").append(getIdEt());
        sb.append(" dateEnc=").append(getDateEnc());
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
        ret.put("idProjet", getIdProjet());
        ret.put("idEt", getIdEt());
        ret.put("dateEnc", getDateEnc());
        return ret;
    }

}
