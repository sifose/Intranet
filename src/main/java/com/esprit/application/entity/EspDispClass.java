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
import javax.persistence.Version;

@Entity(name="ESP_DISP_CLASS")
public class EspDispClass implements Serializable {

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
    @Column(name="ID", unique=true, nullable=false, precision=19)
    private BigDecimal id;
    @Column(name="IDUSER", nullable=false, precision=19)
    private BigDecimal iduser;
    @Column(name="MOTIFDISP", length=255)
    private String motifdisp;
    @Column(name="CODJOUR", precision=19)
    private BigDecimal codjour;
    @Column(name="CODSEANCE", length=255)
    private String codseance;
    @Column(name="IDSEM", precision=19)
    private BigDecimal idsem;
    @Column(name="IDSEMAINE", precision=19)
    private BigDecimal idsemaine;
    @ManyToOne
    @JoinColumn(name="CODSAL")
    private Classe classe;

    /** Default constructor. */
    public EspDispClass() {
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
     * Access method for iduser.
     *
     * @return the current value of iduser
     */
    public BigDecimal getIduser() {
        return iduser;
    }

    /**
     * Setter method for iduser.
     *
     * @param aIduser the new value for iduser
     */
    public void setIduser(BigDecimal aIduser) {
        iduser = aIduser;
    }

    /**
     * Access method for motifdisp.
     *
     * @return the current value of motifdisp
     */
    public String getMotifdisp() {
        return motifdisp;
    }

    /**
     * Setter method for motifdisp.
     *
     * @param aMotifdisp the new value for motifdisp
     */
    public void setMotifdisp(String aMotifdisp) {
        motifdisp = aMotifdisp;
    }

    /**
     * Access method for codjour.
     *
     * @return the current value of codjour
     */
    public BigDecimal getCodjour() {
        return codjour;
    }

    /**
     * Setter method for codjour.
     *
     * @param aCodjour the new value for codjour
     */
    public void setCodjour(BigDecimal aCodjour) {
        codjour = aCodjour;
    }

    /**
     * Access method for codseance.
     *
     * @return the current value of codseance
     */
    public String getCodseance() {
        return codseance;
    }

    /**
     * Setter method for codseance.
     *
     * @param aCodseance the new value for codseance
     */
    public void setCodseance(String aCodseance) {
        codseance = aCodseance;
    }

    /**
     * Access method for idsem.
     *
     * @return the current value of idsem
     */
    public BigDecimal getIdsem() {
        return idsem;
    }

    /**
     * Setter method for idsem.
     *
     * @param aIdsem the new value for idsem
     */
    public void setIdsem(BigDecimal aIdsem) {
        idsem = aIdsem;
    }

    /**
     * Access method for idsemaine.
     *
     * @return the current value of idsemaine
     */
    public BigDecimal getIdsemaine() {
        return idsemaine;
    }

    /**
     * Setter method for idsemaine.
     *
     * @param aIdsemaine the new value for idsemaine
     */
    public void setIdsemaine(BigDecimal aIdsemaine) {
        idsemaine = aIdsemaine;
    }

    /**
     * Access method for classe.
     *
     * @return the current value of classe
     */
    public Classe getClasse() {
        return classe;
    }

    /**
     * Setter method for classe.
     *
     * @param aClasse the new value for classe
     */
    public void setClasse(Classe aClasse) {
        classe = aClasse;
    }

    /**
     * Compares the key for this instance with another EspDispClass.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspDispClass and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspDispClass)) {
            return false;
        }
        EspDispClass that = (EspDispClass) other;
        Object myId = this.getId();
        Object yourId = that.getId();
        if (myId==null ? yourId!=null : !myId.equals(yourId)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspDispClass.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspDispClass)) return false;
        return this.equalKeys(other) && ((EspDispClass)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[EspDispClass |");
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
