// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="ESP_DOSSIERS_SCOLAIRES")
@IdClass(EspDossiersScolaires.EspDossiersScolairesId.class)
public class EspDossiersScolaires implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspDossiersScolairesId implements Serializable {
        java.lang.String idEt;
        java.lang.String anneeDeb;
        java.lang.String codePiece;
    }

    /** Primary key. */
    protected static final String PK = "EspDossiersScolairesEspDossiersScolairesPk";

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
    @Column(name="ID_ET", nullable=false, length=20)
    private String idEt;
    @Column(name="ETAT", length=1)
    private String etat;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Id
    @Column(name="CODE_PIECE", nullable=false, length=2)
    private String codePiece;

    /** Default constructor. */
    public EspDossiersScolaires() {
        super();
    }

    /**
     * Access method for idEt.
     *
     * @return the current value of idEt
     */
    public String getIdEt() {
        return idEt;
    }

    /**
     * Setter method for idEt.
     *
     * @param aIdEt the new value for idEt
     */
    public void setIdEt(String aIdEt) {
        idEt = aIdEt;
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
     * Access method for codePiece.
     *
     * @return the current value of codePiece
     */
    public String getCodePiece() {
        return codePiece;
    }

    /**
     * Setter method for codePiece.
     *
     * @param aCodePiece the new value for codePiece
     */
    public void setCodePiece(String aCodePiece) {
        codePiece = aCodePiece;
    }

    /**
     * Compares the key for this instance with another EspDossiersScolaires.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspDossiersScolaires and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspDossiersScolaires)) {
            return false;
        }
        EspDossiersScolaires that = (EspDossiersScolaires) other;
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myCodePiece = this.getCodePiece();
        Object yourCodePiece = that.getCodePiece();
        if (myCodePiece==null ? yourCodePiece!=null : !myCodePiece.equals(yourCodePiece)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspDossiersScolaires.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspDossiersScolaires)) return false;
        return this.equalKeys(other) && ((EspDossiersScolaires)other).equalKeys(this);
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
        if (getIdEt() == null) {
            i = 0;
        } else {
            i = getIdEt().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getCodePiece() == null) {
            i = 0;
        } else {
            i = getCodePiece().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspDossiersScolaires |");
        sb.append(" idEt=").append(getIdEt());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" codePiece=").append(getCodePiece());
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
        ret.put("idEt", getIdEt());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("codePiece", getCodePiece());
        return ret;
    }

}
