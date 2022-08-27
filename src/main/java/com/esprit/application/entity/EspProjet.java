// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ESP_PROJET")
public class EspProjet implements Serializable {

    /** Primary key. */
    protected static final String PK = "idProjet";

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
    @Column(name="ID_PROJET", unique=true, nullable=false, length=10)
    private String idProjet;
    @Column(name="NOM_PROJET", length=30)
    private String nomProjet;
    @Column(name="DESCRIPTION_PROJET", length=100)
    private String descriptionProjet;
    @Column(name="TECHNOLOGIES", length=30)
    private String technologies;
    @Column(name="METHODOLOGIE", length=30)
    private String methodologie;
    @Column(name="TYPE_PROJET", length=30)
    private String typeProjet;
    @Column(name="NIVEAU", length=30)
    private String niveau;
    @Column(name="ID_ENSEIGNANT", length=30)
    private String idEnseignant;
    @ManyToOne
    @JoinColumn(name="ANNEE_DEB")
    private EspSaisonUniversitaire espSaisonUniversitaire;
    @OneToMany(mappedBy="espProjet")
    private Set<EspGroupeProjet> espGroupeProjet;
    @ManyToOne
    @JoinColumn(name="CODE_MODULE")
    private EspModule espModule;

    /** Default constructor. */
    public EspProjet() {
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
     * Access method for nomProjet.
     *
     * @return the current value of nomProjet
     */
    public String getNomProjet() {
        return nomProjet;
    }

    /**
     * Setter method for nomProjet.
     *
     * @param aNomProjet the new value for nomProjet
     */
    public void setNomProjet(String aNomProjet) {
        nomProjet = aNomProjet;
    }

    /**
     * Access method for descriptionProjet.
     *
     * @return the current value of descriptionProjet
     */
    public String getDescriptionProjet() {
        return descriptionProjet;
    }

    /**
     * Setter method for descriptionProjet.
     *
     * @param aDescriptionProjet the new value for descriptionProjet
     */
    public void setDescriptionProjet(String aDescriptionProjet) {
        descriptionProjet = aDescriptionProjet;
    }

    /**
     * Access method for technologies.
     *
     * @return the current value of technologies
     */
    public String getTechnologies() {
        return technologies;
    }

    /**
     * Setter method for technologies.
     *
     * @param aTechnologies the new value for technologies
     */
    public void setTechnologies(String aTechnologies) {
        technologies = aTechnologies;
    }

    /**
     * Access method for methodologie.
     *
     * @return the current value of methodologie
     */
    public String getMethodologie() {
        return methodologie;
    }

    /**
     * Setter method for methodologie.
     *
     * @param aMethodologie the new value for methodologie
     */
    public void setMethodologie(String aMethodologie) {
        methodologie = aMethodologie;
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
     * Access method for niveau.
     *
     * @return the current value of niveau
     */
    public String getNiveau() {
        return niveau;
    }

    /**
     * Setter method for niveau.
     *
     * @param aNiveau the new value for niveau
     */
    public void setNiveau(String aNiveau) {
        niveau = aNiveau;
    }

    /**
     * Access method for idEnseignant.
     *
     * @return the current value of idEnseignant
     */
    public String getIdEnseignant() {
        return idEnseignant;
    }

    /**
     * Setter method for idEnseignant.
     *
     * @param aIdEnseignant the new value for idEnseignant
     */
    public void setIdEnseignant(String aIdEnseignant) {
        idEnseignant = aIdEnseignant;
    }

    /**
     * Access method for espSaisonUniversitaire.
     *
     * @return the current value of espSaisonUniversitaire
     */
    public EspSaisonUniversitaire getEspSaisonUniversitaire() {
        return espSaisonUniversitaire;
    }

    /**
     * Setter method for espSaisonUniversitaire.
     *
     * @param aEspSaisonUniversitaire the new value for espSaisonUniversitaire
     */
    public void setEspSaisonUniversitaire(EspSaisonUniversitaire aEspSaisonUniversitaire) {
        espSaisonUniversitaire = aEspSaisonUniversitaire;
    }

    /**
     * Access method for espGroupeProjet.
     *
     * @return the current value of espGroupeProjet
     */
    public Set<EspGroupeProjet> getEspGroupeProjet() {
        return espGroupeProjet;
    }

    /**
     * Setter method for espGroupeProjet.
     *
     * @param aEspGroupeProjet the new value for espGroupeProjet
     */
    public void setEspGroupeProjet(Set<EspGroupeProjet> aEspGroupeProjet) {
        espGroupeProjet = aEspGroupeProjet;
    }

    /**
     * Access method for espModule.
     *
     * @return the current value of espModule
     */
    public EspModule getEspModule() {
        return espModule;
    }

    /**
     * Setter method for espModule.
     *
     * @param aEspModule the new value for espModule
     */
    public void setEspModule(EspModule aEspModule) {
        espModule = aEspModule;
    }

    /**
     * Compares the key for this instance with another EspProjet.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspProjet and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspProjet)) {
            return false;
        }
        EspProjet that = (EspProjet) other;
        Object myIdProjet = this.getIdProjet();
        Object yourIdProjet = that.getIdProjet();
        if (myIdProjet==null ? yourIdProjet!=null : !myIdProjet.equals(yourIdProjet)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspProjet.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspProjet)) return false;
        return this.equalKeys(other) && ((EspProjet)other).equalKeys(this);
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
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[EspProjet |");
        sb.append(" idProjet=").append(getIdProjet());
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
        return ret;
    }

}
