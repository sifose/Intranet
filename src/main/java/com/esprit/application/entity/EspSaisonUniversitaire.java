// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ESP_SAISON_UNIVERSITAIRE")
public class EspSaisonUniversitaire implements Serializable {

    /** Primary key. */
    protected static final String PK = "anneeDeb";

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
    @Column(name="ANNEE_DEB", unique=true, nullable=false, length=4)
    private String anneeDeb;
    @Column(name="ANNEE_FIN", nullable=false, length=4)
    private String anneeFin;
    @Column(name="DESCRIPTION", length=1000)
    private String description;
    @OneToMany(mappedBy="espSaisonUniversitaire")
    private Set<EspProjet> espProjet;
    @OneToMany(mappedBy="espSaisonUniversitaire")
    private Set<EspExamen> espExamen;
    @OneToMany(mappedBy="espSaisonUniversitaire")
    private Set<EspInscription> espInscription;
    @OneToMany(mappedBy="espSaisonUniversitaire")
    private Set<EspSaisonClasse> espSaisonClasse;
    @OneToMany(mappedBy="espSaisonUniversitaire")
    private Set<EspGroupeTarif> espGroupeTarif;

    /** Default constructor. */
    public EspSaisonUniversitaire() {
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
     * Access method for anneeFin.
     *
     * @return the current value of anneeFin
     */
    public String getAnneeFin() {
        return anneeFin;
    }

    /**
     * Setter method for anneeFin.
     *
     * @param aAnneeFin the new value for anneeFin
     */
    public void setAnneeFin(String aAnneeFin) {
        anneeFin = aAnneeFin;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for espProjet.
     *
     * @return the current value of espProjet
     */
    public Set<EspProjet> getEspProjet() {
        return espProjet;
    }

    /**
     * Setter method for espProjet.
     *
     * @param aEspProjet the new value for espProjet
     */
    public void setEspProjet(Set<EspProjet> aEspProjet) {
        espProjet = aEspProjet;
    }

    /**
     * Access method for espExamen.
     *
     * @return the current value of espExamen
     */
    public Set<EspExamen> getEspExamen() {
        return espExamen;
    }

    /**
     * Setter method for espExamen.
     *
     * @param aEspExamen the new value for espExamen
     */
    public void setEspExamen(Set<EspExamen> aEspExamen) {
        espExamen = aEspExamen;
    }

    /**
     * Access method for espInscription.
     *
     * @return the current value of espInscription
     */
    public Set<EspInscription> getEspInscription() {
        return espInscription;
    }

    /**
     * Setter method for espInscription.
     *
     * @param aEspInscription the new value for espInscription
     */
    public void setEspInscription(Set<EspInscription> aEspInscription) {
        espInscription = aEspInscription;
    }

    /**
     * Access method for espSaisonClasse.
     *
     * @return the current value of espSaisonClasse
     */
    public Set<EspSaisonClasse> getEspSaisonClasse() {
        return espSaisonClasse;
    }

    /**
     * Setter method for espSaisonClasse.
     *
     * @param aEspSaisonClasse the new value for espSaisonClasse
     */
    public void setEspSaisonClasse(Set<EspSaisonClasse> aEspSaisonClasse) {
        espSaisonClasse = aEspSaisonClasse;
    }

    /**
     * Access method for espGroupeTarif.
     *
     * @return the current value of espGroupeTarif
     */
    public Set<EspGroupeTarif> getEspGroupeTarif() {
        return espGroupeTarif;
    }

    /**
     * Setter method for espGroupeTarif.
     *
     * @param aEspGroupeTarif the new value for espGroupeTarif
     */
    public void setEspGroupeTarif(Set<EspGroupeTarif> aEspGroupeTarif) {
        espGroupeTarif = aEspGroupeTarif;
    }

    /**
     * Compares the key for this instance with another EspSaisonUniversitaire.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspSaisonUniversitaire and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspSaisonUniversitaire)) {
            return false;
        }
        EspSaisonUniversitaire that = (EspSaisonUniversitaire) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspSaisonUniversitaire.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspSaisonUniversitaire)) return false;
        return this.equalKeys(other) && ((EspSaisonUniversitaire)other).equalKeys(this);
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
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EspSaisonUniversitaire |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
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
        return ret;
    }

}
