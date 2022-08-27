// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Version;

@Entity(name="FICHEPFE")
public class Fichepfe implements Serializable {

    /** Primary key. */
    protected static final String PK = "idFiche";

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
    @Column(name="ID_FICHE", unique=true, nullable=false, precision=10)
    private BigDecimal idFiche;
    @Column(name="ETAT", length=255)
    private String etat;
    @Column(name="NOM_ENCAD", length=255)
    private String nomEncad;
    @Column(name="NOM_ENTREPRISE", length=255)
    private String nomEntreprise;
    @Column(name="ADRESS_ENTREPRISE", length=255)
    private String adressEntreprise;
    @Column(name="TELEPHONE_ENTREPRISE", precision=10)
    private BigDecimal telephoneEntreprise;
    @Column(name="MAIL_ENTREPRISE", length=255)
    private String mailEntreprise;
    @Column(name="DESCRIPTIONSUJET", length=4000)
    private String descriptionsujet;
    @Column(name="PROBELEMATIQUESUJET", length=4000)
    private String probelematiquesujet;
    @Column(name="FONCTIONNALITESUJET", length=4000)
    private String fonctionnalitesujet;
    @Column(name="PREREQUISUJET", length=4000)
    private String prerequisujet;
    @Column(name="AVIS", length=4000)
    private String avis;
    @Column(name="VALID", precision=1)
    private BigDecimal valid;
    @Column(name="VALIDATEINFO", nullable=false, precision=1)
    private BigDecimal validateinfo;
    @Column(name="NOM_ENCAD_ESPRIT", length=255)
    private String nomEncadEsprit;
    @Column(name="REGIS", precision=1)
    private BigDecimal regis;
    @Column(name="REGECTEDINFO", nullable=false, precision=1)
    private BigDecimal regectedinfo;
    @Column(name="REHECTEDSTAGE", nullable=false, precision=1)
    private BigDecimal rehectedstage;
    @Column(name="ACORRIGERSTAGE", nullable=false, precision=1)
    private BigDecimal acorrigerstage;
    @Column(name="DATEENVOIE", length=255)
    private String dateenvoie;
    @Column(name="ANNEE_DEB", length=4)
    private String anneeDeb;
    @OneToOne
    private EspEnseignantFichepfe espEnseignantFichepfe;
    @ManyToOne
    @JoinColumn(name="ET_ID_ET")
    private EspEtudiant espEtudiant;

    /** Default constructor. */
    public Fichepfe() {
        super();
    }

    /**
     * Access method for idFiche.
     *
     * @return the current value of idFiche
     */
    public BigDecimal getIdFiche() {
        return idFiche;
    }

    /**
     * Setter method for idFiche.
     *
     * @param aIdFiche the new value for idFiche
     */
    public void setIdFiche(BigDecimal aIdFiche) {
        idFiche = aIdFiche;
    }

    /**
     * Access method for etat.
     *
     * @return the current value of etat
     */
    public String getEtat() {
        return etat;
    }

    /**
     * Setter method for etat.
     *
     * @param aEtat the new value for etat
     */
    public void setEtat(String aEtat) {
        etat = aEtat;
    }

    /**
     * Access method for nomEncad.
     *
     * @return the current value of nomEncad
     */
    public String getNomEncad() {
        return nomEncad;
    }

    /**
     * Setter method for nomEncad.
     *
     * @param aNomEncad the new value for nomEncad
     */
    public void setNomEncad(String aNomEncad) {
        nomEncad = aNomEncad;
    }

    /**
     * Access method for nomEntreprise.
     *
     * @return the current value of nomEntreprise
     */
    public String getNomEntreprise() {
        return nomEntreprise;
    }

    /**
     * Setter method for nomEntreprise.
     *
     * @param aNomEntreprise the new value for nomEntreprise
     */
    public void setNomEntreprise(String aNomEntreprise) {
        nomEntreprise = aNomEntreprise;
    }

    /**
     * Access method for adressEntreprise.
     *
     * @return the current value of adressEntreprise
     */
    public String getAdressEntreprise() {
        return adressEntreprise;
    }

    /**
     * Setter method for adressEntreprise.
     *
     * @param aAdressEntreprise the new value for adressEntreprise
     */
    public void setAdressEntreprise(String aAdressEntreprise) {
        adressEntreprise = aAdressEntreprise;
    }

    /**
     * Access method for telephoneEntreprise.
     *
     * @return the current value of telephoneEntreprise
     */
    public BigDecimal getTelephoneEntreprise() {
        return telephoneEntreprise;
    }

    /**
     * Setter method for telephoneEntreprise.
     *
     * @param aTelephoneEntreprise the new value for telephoneEntreprise
     */
    public void setTelephoneEntreprise(BigDecimal aTelephoneEntreprise) {
        telephoneEntreprise = aTelephoneEntreprise;
    }

    /**
     * Access method for mailEntreprise.
     *
     * @return the current value of mailEntreprise
     */
    public String getMailEntreprise() {
        return mailEntreprise;
    }

    /**
     * Setter method for mailEntreprise.
     *
     * @param aMailEntreprise the new value for mailEntreprise
     */
    public void setMailEntreprise(String aMailEntreprise) {
        mailEntreprise = aMailEntreprise;
    }

    /**
     * Access method for descriptionsujet.
     *
     * @return the current value of descriptionsujet
     */
    public String getDescriptionsujet() {
        return descriptionsujet;
    }

    /**
     * Setter method for descriptionsujet.
     *
     * @param aDescriptionsujet the new value for descriptionsujet
     */
    public void setDescriptionsujet(String aDescriptionsujet) {
        descriptionsujet = aDescriptionsujet;
    }

    /**
     * Access method for probelematiquesujet.
     *
     * @return the current value of probelematiquesujet
     */
    public String getProbelematiquesujet() {
        return probelematiquesujet;
    }

    /**
     * Setter method for probelematiquesujet.
     *
     * @param aProbelematiquesujet the new value for probelematiquesujet
     */
    public void setProbelematiquesujet(String aProbelematiquesujet) {
        probelematiquesujet = aProbelematiquesujet;
    }

    /**
     * Access method for fonctionnalitesujet.
     *
     * @return the current value of fonctionnalitesujet
     */
    public String getFonctionnalitesujet() {
        return fonctionnalitesujet;
    }

    /**
     * Setter method for fonctionnalitesujet.
     *
     * @param aFonctionnalitesujet the new value for fonctionnalitesujet
     */
    public void setFonctionnalitesujet(String aFonctionnalitesujet) {
        fonctionnalitesujet = aFonctionnalitesujet;
    }

    /**
     * Access method for prerequisujet.
     *
     * @return the current value of prerequisujet
     */
    public String getPrerequisujet() {
        return prerequisujet;
    }

    /**
     * Setter method for prerequisujet.
     *
     * @param aPrerequisujet the new value for prerequisujet
     */
    public void setPrerequisujet(String aPrerequisujet) {
        prerequisujet = aPrerequisujet;
    }

    /**
     * Access method for avis.
     *
     * @return the current value of avis
     */
    public String getAvis() {
        return avis;
    }

    /**
     * Setter method for avis.
     *
     * @param aAvis the new value for avis
     */
    public void setAvis(String aAvis) {
        avis = aAvis;
    }

    /**
     * Access method for valid.
     *
     * @return the current value of valid
     */
    public BigDecimal getValid() {
        return valid;
    }

    /**
     * Setter method for valid.
     *
     * @param aValid the new value for valid
     */
    public void setValid(BigDecimal aValid) {
        valid = aValid;
    }

    /**
     * Access method for validateinfo.
     *
     * @return the current value of validateinfo
     */
    public BigDecimal getValidateinfo() {
        return validateinfo;
    }

    /**
     * Setter method for validateinfo.
     *
     * @param aValidateinfo the new value for validateinfo
     */
    public void setValidateinfo(BigDecimal aValidateinfo) {
        validateinfo = aValidateinfo;
    }

    /**
     * Access method for nomEncadEsprit.
     *
     * @return the current value of nomEncadEsprit
     */
    public String getNomEncadEsprit() {
        return nomEncadEsprit;
    }

    /**
     * Setter method for nomEncadEsprit.
     *
     * @param aNomEncadEsprit the new value for nomEncadEsprit
     */
    public void setNomEncadEsprit(String aNomEncadEsprit) {
        nomEncadEsprit = aNomEncadEsprit;
    }

    /**
     * Access method for regis.
     *
     * @return the current value of regis
     */
    public BigDecimal getRegis() {
        return regis;
    }

    /**
     * Setter method for regis.
     *
     * @param aRegis the new value for regis
     */
    public void setRegis(BigDecimal aRegis) {
        regis = aRegis;
    }

    /**
     * Access method for regectedinfo.
     *
     * @return the current value of regectedinfo
     */
    public BigDecimal getRegectedinfo() {
        return regectedinfo;
    }

    /**
     * Setter method for regectedinfo.
     *
     * @param aRegectedinfo the new value for regectedinfo
     */
    public void setRegectedinfo(BigDecimal aRegectedinfo) {
        regectedinfo = aRegectedinfo;
    }

    /**
     * Access method for rehectedstage.
     *
     * @return the current value of rehectedstage
     */
    public BigDecimal getRehectedstage() {
        return rehectedstage;
    }

    /**
     * Setter method for rehectedstage.
     *
     * @param aRehectedstage the new value for rehectedstage
     */
    public void setRehectedstage(BigDecimal aRehectedstage) {
        rehectedstage = aRehectedstage;
    }

    /**
     * Access method for acorrigerstage.
     *
     * @return the current value of acorrigerstage
     */
    public BigDecimal getAcorrigerstage() {
        return acorrigerstage;
    }

    /**
     * Setter method for acorrigerstage.
     *
     * @param aAcorrigerstage the new value for acorrigerstage
     */
    public void setAcorrigerstage(BigDecimal aAcorrigerstage) {
        acorrigerstage = aAcorrigerstage;
    }

    /**
     * Access method for dateenvoie.
     *
     * @return the current value of dateenvoie
     */
    public String getDateenvoie() {
        return dateenvoie;
    }

    /**
     * Setter method for dateenvoie.
     *
     * @param aDateenvoie the new value for dateenvoie
     */
    public void setDateenvoie(String aDateenvoie) {
        dateenvoie = aDateenvoie;
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
     * Access method for espEnseignantFichepfe.
     *
     * @return the current value of espEnseignantFichepfe
     */
    public EspEnseignantFichepfe getEspEnseignantFichepfe() {
        return espEnseignantFichepfe;
    }

    /**
     * Setter method for espEnseignantFichepfe.
     *
     * @param aEspEnseignantFichepfe the new value for espEnseignantFichepfe
     */
    public void setEspEnseignantFichepfe(EspEnseignantFichepfe aEspEnseignantFichepfe) {
        espEnseignantFichepfe = aEspEnseignantFichepfe;
    }

    /**
     * Access method for espEtudiant.
     *
     * @return the current value of espEtudiant
     */
    public EspEtudiant getEspEtudiant() {
        return espEtudiant;
    }

    /**
     * Setter method for espEtudiant.
     *
     * @param aEspEtudiant the new value for espEtudiant
     */
    public void setEspEtudiant(EspEtudiant aEspEtudiant) {
        espEtudiant = aEspEtudiant;
    }

    /**
     * Compares the key for this instance with another Fichepfe.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Fichepfe and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Fichepfe)) {
            return false;
        }
        Fichepfe that = (Fichepfe) other;
        Object myIdFiche = this.getIdFiche();
        Object yourIdFiche = that.getIdFiche();
        if (myIdFiche==null ? yourIdFiche!=null : !myIdFiche.equals(yourIdFiche)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Fichepfe.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Fichepfe)) return false;
        return this.equalKeys(other) && ((Fichepfe)other).equalKeys(this);
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
        if (getIdFiche() == null) {
            i = 0;
        } else {
            i = getIdFiche().hashCode();
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
        StringBuffer sb = new StringBuffer("[Fichepfe |");
        sb.append(" idFiche=").append(getIdFiche());
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
        ret.put("idFiche", getIdFiche());
        return ret;
    }

}
