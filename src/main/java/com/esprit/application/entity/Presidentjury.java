// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="PRESIDENTJURY")
public class Presidentjury implements Serializable {

    /** Primary key. */
    protected static final String PK = "id";

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
    @Column(name="ID", unique=true, nullable=false, precision=10)
    private BigDecimal id;
    @Column(name="EMAIL", length=255)
    private String email;
    @Column(name="NOM", length=255)
    private String nom;
    @Column(name="PRENOM", length=255)
    private String prenom;
    @Column(name="FONCTION", length=255)
    private String fonction;
    @Column(name="TEL", length=255)
    private String tel;
    @Column(name="JURYREF", precision=10)
    private BigDecimal juryref;
    @Column(name="SOCIETE", length=255)
    private String societe;
    @OneToMany(mappedBy="presidentjury")
    private Set<Soutenance> soutenance;

    /** Default constructor. */
    public Presidentjury() {
        super();
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

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(String aEmail) {
        email = aEmail;
    }

    /**
     * Access method for nom.
     *
     * @return the current value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter method for nom.
     *
     * @param aNom the new value for nom
     */
    public void setNom(String aNom) {
        nom = aNom;
    }

    /**
     * Access method for prenom.
     *
     * @return the current value of prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter method for prenom.
     *
     * @param aPrenom the new value for prenom
     */
    public void setPrenom(String aPrenom) {
        prenom = aPrenom;
    }

    /**
     * Access method for fonction.
     *
     * @return the current value of fonction
     */
    public String getFonction() {
        return fonction;
    }

    /**
     * Setter method for fonction.
     *
     * @param aFonction the new value for fonction
     */
    public void setFonction(String aFonction) {
        fonction = aFonction;
    }

    /**
     * Access method for tel.
     *
     * @return the current value of tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * Setter method for tel.
     *
     * @param aTel the new value for tel
     */
    public void setTel(String aTel) {
        tel = aTel;
    }

    /**
     * Access method for juryref.
     *
     * @return the current value of juryref
     */
    public BigDecimal getJuryref() {
        return juryref;
    }

    /**
     * Setter method for juryref.
     *
     * @param aJuryref the new value for juryref
     */
    public void setJuryref(BigDecimal aJuryref) {
        juryref = aJuryref;
    }

    /**
     * Access method for societe.
     *
     * @return the current value of societe
     */
    public String getSociete() {
        return societe;
    }

    /**
     * Setter method for societe.
     *
     * @param aSociete the new value for societe
     */
    public void setSociete(String aSociete) {
        societe = aSociete;
    }

    /**
     * Access method for soutenance.
     *
     * @return the current value of soutenance
     */
    public Set<Soutenance> getSoutenance() {
        return soutenance;
    }

    /**
     * Setter method for soutenance.
     *
     * @param aSoutenance the new value for soutenance
     */
    public void setSoutenance(Set<Soutenance> aSoutenance) {
        soutenance = aSoutenance;
    }

    /**
     * Compares the key for this instance with another Presidentjury.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Presidentjury and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Presidentjury)) {
            return false;
        }
        Presidentjury that = (Presidentjury) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Presidentjury.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Presidentjury)) return false;
        return this.equalKeys(other) && ((Presidentjury)other).equalKeys(this);
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
        if (getId() == null) {
            i = 0;
        } else {
            i = getId().hashCode();
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
        StringBuffer sb = new StringBuffer("[Presidentjury |");
        sb.append(" id=").append(getId());
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
        ret.put("id", getId());
        return ret;
    }

}
