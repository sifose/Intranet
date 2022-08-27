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

@Entity(name="ESP_PREVISION")
@IdClass(EspPrevision.EspPrevisionId.class)
public class EspPrevision implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspPrevisionId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String categorieClasse;
        java.math.BigDecimal niveauAcces;
    }

    /** Primary key. */
    protected static final String PK = "EspPrevisionPkPrevision";

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
    @Column(name="CATEGORIE_CLASSE", nullable=false, length=10)
    private String categorieClasse;
    @Id
    @Column(name="NIVEAU_ACCES", nullable=false, precision=1)
    private BigDecimal niveauAcces;
    @Column(name="EFFECTIF_PREVUE", precision=6)
    private BigDecimal effectifPrevue;
    @Column(name="EFFECTIF_REEL", precision=6)
    private BigDecimal effectifReel;
    @Column(name="DATE_LAST_MODIF")
    private LocalDateTime dateLastModif;
    @Column(name="NB_CLASSE", precision=3)
    private BigDecimal nbClasse;
    @Column(name="CODE_SPECIALITE", length=2)
    private String codeSpecialite;
    @Column(name="SCORE_MIN_ADMIS", precision=10, scale=3)
    private BigDecimal scoreMinAdmis;
    @Column(name="NB_ETUDIANT_VENTILE", precision=4)
    private BigDecimal nbEtudiantVentile;
    @Column(name="SCORE_REJET", precision=10, scale=3)
    private BigDecimal scoreRejet;
    @Column(name="NB_ETUDIANT_REJET", precision=4)
    private BigDecimal nbEtudiantRejet;
    @Column(name="SCORE_MIN_S2", precision=10, scale=3)
    private BigDecimal scoreMinS2;
    @Column(name="NB_ETUDIANT_S2", precision=4)
    private BigDecimal nbEtudiantS2;

    /** Default constructor. */
    public EspPrevision() {
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
     * Access method for categorieClasse.
     *
     * @return the current value of categorieClasse
     */
    public String getCategorieClasse() {
        return categorieClasse;
    }

    /**
     * Setter method for categorieClasse.
     *
     * @param aCategorieClasse the new value for categorieClasse
     */
    public void setCategorieClasse(String aCategorieClasse) {
        categorieClasse = aCategorieClasse;
    }

    /**
     * Access method for niveauAcces.
     *
     * @return the current value of niveauAcces
     */
    public BigDecimal getNiveauAcces() {
        return niveauAcces;
    }

    /**
     * Setter method for niveauAcces.
     *
     * @param aNiveauAcces the new value for niveauAcces
     */
    public void setNiveauAcces(BigDecimal aNiveauAcces) {
        niveauAcces = aNiveauAcces;
    }

    /**
     * Access method for effectifPrevue.
     *
     * @return the current value of effectifPrevue
     */
    public BigDecimal getEffectifPrevue() {
        return effectifPrevue;
    }

    /**
     * Setter method for effectifPrevue.
     *
     * @param aEffectifPrevue the new value for effectifPrevue
     */
    public void setEffectifPrevue(BigDecimal aEffectifPrevue) {
        effectifPrevue = aEffectifPrevue;
    }

    /**
     * Access method for effectifReel.
     *
     * @return the current value of effectifReel
     */
    public BigDecimal getEffectifReel() {
        return effectifReel;
    }

    /**
     * Setter method for effectifReel.
     *
     * @param aEffectifReel the new value for effectifReel
     */
    public void setEffectifReel(BigDecimal aEffectifReel) {
        effectifReel = aEffectifReel;
    }

    /**
     * Access method for dateLastModif.
     *
     * @return the current value of dateLastModif
     */
    public LocalDateTime getDateLastModif() {
        return dateLastModif;
    }

    /**
     * Setter method for dateLastModif.
     *
     * @param aDateLastModif the new value for dateLastModif
     */
    public void setDateLastModif(LocalDateTime aDateLastModif) {
        dateLastModif = aDateLastModif;
    }

    /**
     * Access method for nbClasse.
     *
     * @return the current value of nbClasse
     */
    public BigDecimal getNbClasse() {
        return nbClasse;
    }

    /**
     * Setter method for nbClasse.
     *
     * @param aNbClasse the new value for nbClasse
     */
    public void setNbClasse(BigDecimal aNbClasse) {
        nbClasse = aNbClasse;
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
     * Access method for scoreMinAdmis.
     *
     * @return the current value of scoreMinAdmis
     */
    public BigDecimal getScoreMinAdmis() {
        return scoreMinAdmis;
    }

    /**
     * Setter method for scoreMinAdmis.
     *
     * @param aScoreMinAdmis the new value for scoreMinAdmis
     */
    public void setScoreMinAdmis(BigDecimal aScoreMinAdmis) {
        scoreMinAdmis = aScoreMinAdmis;
    }

    /**
     * Access method for nbEtudiantVentile.
     *
     * @return the current value of nbEtudiantVentile
     */
    public BigDecimal getNbEtudiantVentile() {
        return nbEtudiantVentile;
    }

    /**
     * Setter method for nbEtudiantVentile.
     *
     * @param aNbEtudiantVentile the new value for nbEtudiantVentile
     */
    public void setNbEtudiantVentile(BigDecimal aNbEtudiantVentile) {
        nbEtudiantVentile = aNbEtudiantVentile;
    }

    /**
     * Access method for scoreRejet.
     *
     * @return the current value of scoreRejet
     */
    public BigDecimal getScoreRejet() {
        return scoreRejet;
    }

    /**
     * Setter method for scoreRejet.
     *
     * @param aScoreRejet the new value for scoreRejet
     */
    public void setScoreRejet(BigDecimal aScoreRejet) {
        scoreRejet = aScoreRejet;
    }

    /**
     * Access method for nbEtudiantRejet.
     *
     * @return the current value of nbEtudiantRejet
     */
    public BigDecimal getNbEtudiantRejet() {
        return nbEtudiantRejet;
    }

    /**
     * Setter method for nbEtudiantRejet.
     *
     * @param aNbEtudiantRejet the new value for nbEtudiantRejet
     */
    public void setNbEtudiantRejet(BigDecimal aNbEtudiantRejet) {
        nbEtudiantRejet = aNbEtudiantRejet;
    }

    /**
     * Access method for scoreMinS2.
     *
     * @return the current value of scoreMinS2
     */
    public BigDecimal getScoreMinS2() {
        return scoreMinS2;
    }

    /**
     * Setter method for scoreMinS2.
     *
     * @param aScoreMinS2 the new value for scoreMinS2
     */
    public void setScoreMinS2(BigDecimal aScoreMinS2) {
        scoreMinS2 = aScoreMinS2;
    }

    /**
     * Access method for nbEtudiantS2.
     *
     * @return the current value of nbEtudiantS2
     */
    public BigDecimal getNbEtudiantS2() {
        return nbEtudiantS2;
    }

    /**
     * Setter method for nbEtudiantS2.
     *
     * @param aNbEtudiantS2 the new value for nbEtudiantS2
     */
    public void setNbEtudiantS2(BigDecimal aNbEtudiantS2) {
        nbEtudiantS2 = aNbEtudiantS2;
    }

    /**
     * Compares the key for this instance with another EspPrevision.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspPrevision and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspPrevision)) {
            return false;
        }
        EspPrevision that = (EspPrevision) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myCategorieClasse = this.getCategorieClasse();
        Object yourCategorieClasse = that.getCategorieClasse();
        if (myCategorieClasse==null ? yourCategorieClasse!=null : !myCategorieClasse.equals(yourCategorieClasse)) {
            return false;
        }
        Object myNiveauAcces = this.getNiveauAcces();
        Object yourNiveauAcces = that.getNiveauAcces();
        if (myNiveauAcces==null ? yourNiveauAcces!=null : !myNiveauAcces.equals(yourNiveauAcces)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspPrevision.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspPrevision)) return false;
        return this.equalKeys(other) && ((EspPrevision)other).equalKeys(this);
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
        if (getCategorieClasse() == null) {
            i = 0;
        } else {
            i = getCategorieClasse().hashCode();
        }
        result = 37*result + i;
        if (getNiveauAcces() == null) {
            i = 0;
        } else {
            i = getNiveauAcces().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspPrevision |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" categorieClasse=").append(getCategorieClasse());
        sb.append(" niveauAcces=").append(getNiveauAcces());
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
        ret.put("categorieClasse", getCategorieClasse());
        ret.put("niveauAcces", getNiveauAcces());
        return ret;
    }

}
