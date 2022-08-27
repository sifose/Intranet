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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ESP_UE")
@IdClass(EspUe.EspUeId.class)
public class EspUe implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspUeId implements Serializable {
        java.lang.String codeUe;
        java.lang.String anneeDeb;
    }

    /** Primary key. */
    protected static final String PK = "EspUePkUe";

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
    @Column(name="CODE_UE", nullable=false, length=14)
    private String codeUe;
    @Column(name="LIB_UE", length=200)
    private String libUe;
    @Column(name="NB_ECTS", precision=5, scale=2)
    private BigDecimal nbEcts;
    @Column(name="CHARGE_H", precision=3)
    private BigDecimal chargeH;
    @Column(name="TYPE_UE", length=1)
    private String typeUe;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="NATURE_UE", length=10)
    private String natureUe;
    @OneToMany(mappedBy="espUe")
    private Set<EspMoyUeEtudiant> espMoyUeEtudiant;
    
    @ManyToOne
    @JoinColumn(name="CODE_FILIERE")
    private EspFiliere espFiliere;

    /** Default constructor. */
    public EspUe() {
        super();
    }

    /**
     * Access method for codeUe.
     *
     * @return the current value of codeUe
     */
    public String getCodeUe() {
        return codeUe;
    }

    /**
     * Setter method for codeUe.
     *
     * @param aCodeUe the new value for codeUe
     */
    public void setCodeUe(String aCodeUe) {
        codeUe = aCodeUe;
    }

    /**
     * Access method for libUe.
     *
     * @return the current value of libUe
     */
    public String getLibUe() {
        return libUe;
    }

    /**
     * Setter method for libUe.
     *
     * @param aLibUe the new value for libUe
     */
    public void setLibUe(String aLibUe) {
        libUe = aLibUe;
    }

    /**
     * Access method for nbEcts.
     *
     * @return the current value of nbEcts
     */
    public BigDecimal getNbEcts() {
        return nbEcts;
    }

    /**
     * Setter method for nbEcts.
     *
     * @param aNbEcts the new value for nbEcts
     */
    public void setNbEcts(BigDecimal aNbEcts) {
        nbEcts = aNbEcts;
    }

    /**
     * Access method for chargeH.
     *
     * @return the current value of chargeH
     */
    public BigDecimal getChargeH() {
        return chargeH;
    }

    /**
     * Setter method for chargeH.
     *
     * @param aChargeH the new value for chargeH
     */
    public void setChargeH(BigDecimal aChargeH) {
        chargeH = aChargeH;
    }

    /**
     * Access method for typeUe.
     *
     * @return the current value of typeUe
     */
    public String getTypeUe() {
        return typeUe;
    }

    /**
     * Setter method for typeUe.
     *
     * @param aTypeUe the new value for typeUe
     */
    public void setTypeUe(String aTypeUe) {
        typeUe = aTypeUe;
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
     * Access method for natureUe.
     *
     * @return the current value of natureUe
     */
    public String getNatureUe() {
        return natureUe;
    }

    /**
     * Setter method for natureUe.
     *
     * @param aNatureUe the new value for natureUe
     */
    public void setNatureUe(String aNatureUe) {
        natureUe = aNatureUe;
    }

    /**
     * Access method for espMoyUeEtudiant.
     *
     * @return the current value of espMoyUeEtudiant
     */
    public Set<EspMoyUeEtudiant> getEspMoyUeEtudiant() {
        return espMoyUeEtudiant;
    }

    /**
     * Setter method for espMoyUeEtudiant.
     *
     * @param aEspMoyUeEtudiant the new value for espMoyUeEtudiant
     */
    public void setEspMoyUeEtudiant(Set<EspMoyUeEtudiant> aEspMoyUeEtudiant) {
        espMoyUeEtudiant = aEspMoyUeEtudiant;
    }

   
    /**
     * Access method for espFiliere.
     *
     * @return the current value of espFiliere
     */
    public EspFiliere getEspFiliere() {
        return espFiliere;
    }

    /**
     * Setter method for espFiliere.
     *
     * @param aEspFiliere the new value for espFiliere
     */
    public void setEspFiliere(EspFiliere aEspFiliere) {
        espFiliere = aEspFiliere;
    }

    /**
     * Compares the key for this instance with another EspUe.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspUe and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspUe)) {
            return false;
        }
        EspUe that = (EspUe) other;
        Object myCodeUe = this.getCodeUe();
        Object yourCodeUe = that.getCodeUe();
        if (myCodeUe==null ? yourCodeUe!=null : !myCodeUe.equals(yourCodeUe)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspUe.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspUe)) return false;
        return this.equalKeys(other) && ((EspUe)other).equalKeys(this);
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
        if (getCodeUe() == null) {
            i = 0;
        } else {
            i = getCodeUe().hashCode();
        }
        result = 37*result + i;
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
        StringBuffer sb = new StringBuffer("[EspUe |");
        sb.append(" codeUe=").append(getCodeUe());
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
        ret.put("codeUe", getCodeUe());
        ret.put("anneeDeb", getAnneeDeb());
        return ret;
    }

}
