// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="CLASSE")
public class Classe implements Serializable {

    /** Primary key. */
    protected static final String PK = "codeCl";

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
    @Column(name="CODE_CL", unique=true, nullable=false, length=10)
    private String codeCl;
    @Column(name="LIBELLE_CL", length=60)
    private String libelleCl;
    @Column(name="DESCRIPTION_CL", length=300)
    private String descriptionCl;
    @Column(name="DATE_CR")
    private LocalDateTime dateCr;
    @Column(name="DATE_DERN_MODIF")
    private LocalDateTime dateDernModif;
    @Column(name="SALLE_PRINCIPALE", length=10)
    private String sallePrincipale;
    @Column(name="SELLE_SECONDAIRE_1", length=10)
    private String selleSecondaire1;
    @Column(name="SALLE_SECONDAIRE_2", length=10)
    private String salleSecondaire2;
    @Column(name="NIVEAU_ACCEES", precision=1)
    private BigDecimal niveauAccees;
    @Column(name="FILIERE", length=2)
    private String filiere;
    @Column(name="ANNEE_SCOLAIRE", length=4)
    private String anneeScolaire;
    @Column(name="LIB_FILIERE", length=30)
    private String libFiliere;
    @Column(name="CODE_SPECIALITE", length=2)
    private String codeSpecialite;
    @Column(name="LIB_SPECIALITE", length=100)
    private String libSpecialite;
    @Column(name="CATEGORIE", length=10)
    private String categorie;
    @Column(name="SITE_ESP", length=2)
    private String siteEsp;
    @Column(name="FILIERE_NEW", length=1)
    private String filiereNew;
    @Column(name="MAIL", length=255)
    private String mail;
    

    /** Default constructor. */
    public Classe() {
        super();
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
     * Access method for libelleCl.
     *
     * @return the current value of libelleCl
     */
    public String getLibelleCl() {
        return libelleCl;
    }

    /**
     * Setter method for libelleCl.
     *
     * @param aLibelleCl the new value for libelleCl
     */
    public void setLibelleCl(String aLibelleCl) {
        libelleCl = aLibelleCl;
    }

    /**
     * Access method for descriptionCl.
     *
     * @return the current value of descriptionCl
     */
    public String getDescriptionCl() {
        return descriptionCl;
    }

    /**
     * Setter method for descriptionCl.
     *
     * @param aDescriptionCl the new value for descriptionCl
     */
    public void setDescriptionCl(String aDescriptionCl) {
        descriptionCl = aDescriptionCl;
    }

    /**
     * Access method for dateCr.
     *
     * @return the current value of dateCr
     */
    public LocalDateTime getDateCr() {
        return dateCr;
    }

    /**
     * Setter method for dateCr.
     *
     * @param aDateCr the new value for dateCr
     */
    public void setDateCr(LocalDateTime aDateCr) {
        dateCr = aDateCr;
    }

    /**
     * Access method for dateDernModif.
     *
     * @return the current value of dateDernModif
     */
    public LocalDateTime getDateDernModif() {
        return dateDernModif;
    }

    /**
     * Setter method for dateDernModif.
     *
     * @param aDateDernModif the new value for dateDernModif
     */
    public void setDateDernModif(LocalDateTime aDateDernModif) {
        dateDernModif = aDateDernModif;
    }

    /**
     * Access method for sallePrincipale.
     *
     * @return the current value of sallePrincipale
     */
    public String getSallePrincipale() {
        return sallePrincipale;
    }

    /**
     * Setter method for sallePrincipale.
     *
     * @param aSallePrincipale the new value for sallePrincipale
     */
    public void setSallePrincipale(String aSallePrincipale) {
        sallePrincipale = aSallePrincipale;
    }

    /**
     * Access method for selleSecondaire1.
     *
     * @return the current value of selleSecondaire1
     */
    public String getSelleSecondaire1() {
        return selleSecondaire1;
    }

    /**
     * Setter method for selleSecondaire1.
     *
     * @param aSelleSecondaire1 the new value for selleSecondaire1
     */
    public void setSelleSecondaire1(String aSelleSecondaire1) {
        selleSecondaire1 = aSelleSecondaire1;
    }

    /**
     * Access method for salleSecondaire2.
     *
     * @return the current value of salleSecondaire2
     */
    public String getSalleSecondaire2() {
        return salleSecondaire2;
    }

    /**
     * Setter method for salleSecondaire2.
     *
     * @param aSalleSecondaire2 the new value for salleSecondaire2
     */
    public void setSalleSecondaire2(String aSalleSecondaire2) {
        salleSecondaire2 = aSalleSecondaire2;
    }

    /**
     * Access method for niveauAccees.
     *
     * @return the current value of niveauAccees
     */
    public BigDecimal getNiveauAccees() {
        return niveauAccees;
    }

    /**
     * Setter method for niveauAccees.
     *
     * @param aNiveauAccees the new value for niveauAccees
     */
    public void setNiveauAccees(BigDecimal aNiveauAccees) {
        niveauAccees = aNiveauAccees;
    }

    /**
     * Access method for filiere.
     *
     * @return the current value of filiere
     */
    public String getFiliere() {
        return filiere;
    }

    /**
     * Setter method for filiere.
     *
     * @param aFiliere the new value for filiere
     */
    public void setFiliere(String aFiliere) {
        filiere = aFiliere;
    }

    /**
     * Access method for anneeScolaire.
     *
     * @return the current value of anneeScolaire
     */
    public String getAnneeScolaire() {
        return anneeScolaire;
    }

    /**
     * Setter method for anneeScolaire.
     *
     * @param aAnneeScolaire the new value for anneeScolaire
     */
    public void setAnneeScolaire(String aAnneeScolaire) {
        anneeScolaire = aAnneeScolaire;
    }

    /**
     * Access method for libFiliere.
     *
     * @return the current value of libFiliere
     */
    public String getLibFiliere() {
        return libFiliere;
    }

    /**
     * Setter method for libFiliere.
     *
     * @param aLibFiliere the new value for libFiliere
     */
    public void setLibFiliere(String aLibFiliere) {
        libFiliere = aLibFiliere;
    }

    /**
     * Access method for codeSpecialite.
     *
     * @return the current value of codeSpecialite
     */
    public String getCodeSpecialite() {
        return codeSpecialite;
    }

    /**
     * Setter method for codeSpecialite.
     *
     * @param aCodeSpecialite the new value for codeSpecialite
     */
    public void setCodeSpecialite(String aCodeSpecialite) {
        codeSpecialite = aCodeSpecialite;
    }

    /**
     * Access method for libSpecialite.
     *
     * @return the current value of libSpecialite
     */
    public String getLibSpecialite() {
        return libSpecialite;
    }

    /**
     * Setter method for libSpecialite.
     *
     * @param aLibSpecialite the new value for libSpecialite
     */
    public void setLibSpecialite(String aLibSpecialite) {
        libSpecialite = aLibSpecialite;
    }

    /**
     * Access method for categorie.
     *
     * @return the current value of categorie
     */
    public String getCategorie() {
        return categorie;
    }

    /**
     * Setter method for categorie.
     *
     * @param aCategorie the new value for categorie
     */
    public void setCategorie(String aCategorie) {
        categorie = aCategorie;
    }

    /**
     * Access method for siteEsp.
     *
     * @return the current value of siteEsp
     */
    public String getSiteEsp() {
        return siteEsp;
    }

    /**
     * Setter method for siteEsp.
     *
     * @param aSiteEsp the new value for siteEsp
     */
    public void setSiteEsp(String aSiteEsp) {
        siteEsp = aSiteEsp;
    }

    /**
     * Access method for filiereNew.
     *
     * @return the current value of filiereNew
     */
    public String getFiliereNew() {
        return filiereNew;
    }

    /**
     * Setter method for filiereNew.
     *
     * @param aFiliereNew the new value for filiereNew
     */
    public void setFiliereNew(String aFiliereNew) {
        filiereNew = aFiliereNew;
    }

    /**
     * Access method for mail.
     *
     * @return the current value of mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * Setter method for mail.
     *
     * @param aMail the new value for mail
     */
    public void setMail(String aMail) {
        mail = aMail;
    }

    /**
     * Access method for espEtudiant.
     *
     * @return the current value of espEtudiant
     */
  
    /**
     * Compares the key for this instance with another Classe.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Classe and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Classe)) {
            return false;
        }
        Classe that = (Classe) other;
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Classe.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Classe)) return false;
        return this.equalKeys(other) && ((Classe)other).equalKeys(this);
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
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
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
        StringBuffer sb = new StringBuffer("[Classe |");
        sb.append(" codeCl=").append(getCodeCl());
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
        ret.put("codeCl", getCodeCl());
        return ret;
    }

}
