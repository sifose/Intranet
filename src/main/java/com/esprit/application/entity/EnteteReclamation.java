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

@Entity(name="ENTETE_RECLAMATION")
@IdClass(EnteteReclamation.EnteteReclamationId.class)
public class EnteteReclamation implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EnteteReclamationId implements Serializable {
        java.math.BigDecimal idEnteteReclamation;
        java.lang.String idEns;
    }

    /** Primary key. */
    protected static final String PK = "EnteteReclamationConstraint4";

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
    @Column(name="ID_ENTETE_RECLAMATION", nullable=false)
    private BigDecimal idEnteteReclamation;
    @Column(name="NOM_ENS", nullable=false, length=30)
    private String nomEns;
    @Column(name="TYPE_RECLAMATION", nullable=false, length=50)
    private String typeReclamation;
    @Column(name="DATE_RECLAMATION", nullable=false)
    private LocalDateTime dateReclamation;
    @Column(name="DESIGNATION", nullable=false, length=500)
    private String designation;
    @Id
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;

    /** Default constructor. */
    public EnteteReclamation() {
        super();
    }

    /**
     * Access method for idEnteteReclamation.
     *
     * @return the current value of idEnteteReclamation
     */
    public BigDecimal getIdEnteteReclamation() {
        return idEnteteReclamation;
    }

    /**
     * Setter method for idEnteteReclamation.
     *
     * @param aIdEnteteReclamation the new value for idEnteteReclamation
     */
    public void setIdEnteteReclamation(BigDecimal aIdEnteteReclamation) {
        idEnteteReclamation = aIdEnteteReclamation;
    }

    /**
     * Access method for nomEns.
     *
     * @return the current value of nomEns
     */
    public String getNomEns() {
        return nomEns;
    }

    /**
     * Setter method for nomEns.
     *
     * @param aNomEns the new value for nomEns
     */
    public void setNomEns(String aNomEns) {
        nomEns = aNomEns;
    }

    /**
     * Access method for typeReclamation.
     *
     * @return the current value of typeReclamation
     */
    public String getTypeReclamation() {
        return typeReclamation;
    }

    /**
     * Setter method for typeReclamation.
     *
     * @param aTypeReclamation the new value for typeReclamation
     */
    public void setTypeReclamation(String aTypeReclamation) {
        typeReclamation = aTypeReclamation;
    }

    /**
     * Access method for dateReclamation.
     *
     * @return the current value of dateReclamation
     */
    public LocalDateTime getDateReclamation() {
        return dateReclamation;
    }

    /**
     * Setter method for dateReclamation.
     *
     * @param aDateReclamation the new value for dateReclamation
     */
    public void setDateReclamation(LocalDateTime aDateReclamation) {
        dateReclamation = aDateReclamation;
    }

    /**
     * Access method for designation.
     *
     * @return the current value of designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Setter method for designation.
     *
     * @param aDesignation the new value for designation
     */
    public void setDesignation(String aDesignation) {
        designation = aDesignation;
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
     * Compares the key for this instance with another EnteteReclamation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EnteteReclamation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EnteteReclamation)) {
            return false;
        }
        EnteteReclamation that = (EnteteReclamation) other;
        Object myIdEnteteReclamation = this.getIdEnteteReclamation();
        Object yourIdEnteteReclamation = that.getIdEnteteReclamation();
        if (myIdEnteteReclamation==null ? yourIdEnteteReclamation!=null : !myIdEnteteReclamation.equals(yourIdEnteteReclamation)) {
            return false;
        }
        Object myIdEns = this.getIdEns();
        Object yourIdEns = that.getIdEns();
        if (myIdEns==null ? yourIdEns!=null : !myIdEns.equals(yourIdEns)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EnteteReclamation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EnteteReclamation)) return false;
        return this.equalKeys(other) && ((EnteteReclamation)other).equalKeys(this);
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
        if (getIdEnteteReclamation() == null) {
            i = 0;
        } else {
            i = getIdEnteteReclamation().hashCode();
        }
        result = 37*result + i;
        if (getIdEns() == null) {
            i = 0;
        } else {
            i = getIdEns().hashCode();
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
        StringBuffer sb = new StringBuffer("[EnteteReclamation |");
        sb.append(" idEnteteReclamation=").append(getIdEnteteReclamation());
        sb.append(" idEns=").append(getIdEns());
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
        ret.put("idEnteteReclamation", getIdEnteteReclamation());
        ret.put("idEns", getIdEns());
        return ret;
    }

}
