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

@Entity(name="ESP_COMPTEUR")
@IdClass(EspCompteur.EspCompteurId.class)
public class EspCompteur implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspCompteurId implements Serializable {
        java.lang.String codeCpt;
        java.lang.String anneeCpt;
    }

    /** Primary key. */
    protected static final String PK = "EspCompteurPkCompteur";

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
    @Column(name="CODE_CPT", nullable=false, length=2)
    private String codeCpt;
    @Id
    @Column(name="ANNEE_CPT", nullable=false, length=4)
    private String anneeCpt;
    @Column(name="DESIGNATION_CPT", length=50)
    private String designationCpt;
    @Column(name="AUTO_CPT", length=1)
    private String autoCpt;
    @Column(name="NUM_AUTO", precision=10)
    private BigDecimal numAuto;
    @Column(name="TAILLE_CPT", precision=4)
    private BigDecimal tailleCpt;
    @Column(name="DATE_CREATION")
    private LocalDateTime dateCreation;
    @Column(name="DATE_LAST_MODIF")
    private LocalDateTime dateLastModif;

    /** Default constructor. */
    public EspCompteur() {
        super();
    }

    /**
     * Access method for codeCpt.
     *
     * @return the current value of codeCpt
     */
    public String getCodeCpt() {
        return codeCpt;
    }

    /**
     * Setter method for codeCpt.
     *
     * @param aCodeCpt the new value for codeCpt
     */
    public void setCodeCpt(String aCodeCpt) {
        codeCpt = aCodeCpt;
    }

    /**
     * Access method for anneeCpt.
     *
     * @return the current value of anneeCpt
     */
    public String getAnneeCpt() {
        return anneeCpt;
    }

    /**
     * Setter method for anneeCpt.
     *
     * @param aAnneeCpt the new value for anneeCpt
     */
    public void setAnneeCpt(String aAnneeCpt) {
        anneeCpt = aAnneeCpt;
    }

    /**
     * Access method for designationCpt.
     *
     * @return the current value of designationCpt
     */
    public String getDesignationCpt() {
        return designationCpt;
    }

    /**
     * Setter method for designationCpt.
     *
     * @param aDesignationCpt the new value for designationCpt
     */
    public void setDesignationCpt(String aDesignationCpt) {
        designationCpt = aDesignationCpt;
    }

    /**
     * Access method for autoCpt.
     *
     * @return the current value of autoCpt
     */
    public String getAutoCpt() {
        return autoCpt;
    }

    /**
     * Setter method for autoCpt.
     *
     * @param aAutoCpt the new value for autoCpt
     */
    public void setAutoCpt(String aAutoCpt) {
        autoCpt = aAutoCpt;
    }

    /**
     * Access method for numAuto.
     *
     * @return the current value of numAuto
     */
    public BigDecimal getNumAuto() {
        return numAuto;
    }

    /**
     * Setter method for numAuto.
     *
     * @param aNumAuto the new value for numAuto
     */
    public void setNumAuto(BigDecimal aNumAuto) {
        numAuto = aNumAuto;
    }

    /**
     * Access method for tailleCpt.
     *
     * @return the current value of tailleCpt
     */
    public BigDecimal getTailleCpt() {
        return tailleCpt;
    }

    /**
     * Setter method for tailleCpt.
     *
     * @param aTailleCpt the new value for tailleCpt
     */
    public void setTailleCpt(BigDecimal aTailleCpt) {
        tailleCpt = aTailleCpt;
    }

    /**
     * Access method for dateCreation.
     *
     * @return the current value of dateCreation
     */
    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    /**
     * Setter method for dateCreation.
     *
     * @param aDateCreation the new value for dateCreation
     */
    public void setDateCreation(LocalDateTime aDateCreation) {
        dateCreation = aDateCreation;
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
     * Compares the key for this instance with another EspCompteur.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspCompteur and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspCompteur)) {
            return false;
        }
        EspCompteur that = (EspCompteur) other;
        Object myCodeCpt = this.getCodeCpt();
        Object yourCodeCpt = that.getCodeCpt();
        if (myCodeCpt==null ? yourCodeCpt!=null : !myCodeCpt.equals(yourCodeCpt)) {
            return false;
        }
        Object myAnneeCpt = this.getAnneeCpt();
        Object yourAnneeCpt = that.getAnneeCpt();
        if (myAnneeCpt==null ? yourAnneeCpt!=null : !myAnneeCpt.equals(yourAnneeCpt)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspCompteur.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspCompteur)) return false;
        return this.equalKeys(other) && ((EspCompteur)other).equalKeys(this);
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
        if (getCodeCpt() == null) {
            i = 0;
        } else {
            i = getCodeCpt().hashCode();
        }
        result = 37*result + i;
        if (getAnneeCpt() == null) {
            i = 0;
        } else {
            i = getAnneeCpt().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspCompteur |");
        sb.append(" codeCpt=").append(getCodeCpt());
        sb.append(" anneeCpt=").append(getAnneeCpt());
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
        ret.put("codeCpt", getCodeCpt());
        ret.put("anneeCpt", getAnneeCpt());
        return ret;
    }

}
