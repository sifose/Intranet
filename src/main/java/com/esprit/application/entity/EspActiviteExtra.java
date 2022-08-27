// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Version;

@Entity(name="ESP_ACTIVITE_EXTRA")
@IdClass(EspActiviteExtra.EspActiviteExtraId.class)
public class EspActiviteExtra implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspActiviteExtraId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String idEt;
        java.lang.String typeActivite;
    }

    /** Primary key. */
    protected static final String PK = "EspActiviteExtraEspActiviteExtraPk";

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
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Column(name="CODE_MODULE", nullable=false, length=20)
    private String codeModule;
    @Id
    @Column(name="TYPE_ACTIVITE", nullable=false, length=1)
    private String typeActivite;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;

    /** Default constructor. */
    public EspActiviteExtra() {
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
     * Access method for codeModule.
     *
     * @return the current value of codeModule
     */
    public String getCodeModule() {
        return codeModule;
    }

    /**
     * Setter method for codeModule.
     *
     * @param aCodeModule the new value for codeModule
     */
    public void setCodeModule(String aCodeModule) {
        codeModule = aCodeModule;
    }

    /**
     * Access method for typeActivite.
     *
     * @return the current value of typeActivite
     */
    public String getTypeActivite() {
        return typeActivite;
    }

    /**
     * Setter method for typeActivite.
     *
     * @param aTypeActivite the new value for typeActivite
     */
    public void setTypeActivite(String aTypeActivite) {
        typeActivite = aTypeActivite;
    }

    /**
     * Access method for dateSaisie.
     *
     * @return the current value of dateSaisie
     */
    public LocalDateTime getDateSaisie() {
        return dateSaisie;
    }

    /**
     * Setter method for dateSaisie.
     *
     * @param aDateSaisie the new value for dateSaisie
     */
    public void setDateSaisie(LocalDateTime aDateSaisie) {
        dateSaisie = aDateSaisie;
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
     * Compares the key for this instance with another EspActiviteExtra.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspActiviteExtra and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspActiviteExtra)) {
            return false;
        }
        EspActiviteExtra that = (EspActiviteExtra) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myIdEt = this.getIdEt();
        Object yourIdEt = that.getIdEt();
        if (myIdEt==null ? yourIdEt!=null : !myIdEt.equals(yourIdEt)) {
            return false;
        }
        Object myTypeActivite = this.getTypeActivite();
        Object yourTypeActivite = that.getTypeActivite();
        if (myTypeActivite==null ? yourTypeActivite!=null : !myTypeActivite.equals(yourTypeActivite)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspActiviteExtra.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspActiviteExtra)) return false;
        return this.equalKeys(other) && ((EspActiviteExtra)other).equalKeys(this);
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
        if (getIdEt() == null) {
            i = 0;
        } else {
            i = getIdEt().hashCode();
        }
        result = 37*result + i;
        if (getTypeActivite() == null) {
            i = 0;
        } else {
            i = getTypeActivite().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspActiviteExtra |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" idEt=").append(getIdEt());
        sb.append(" typeActivite=").append(getTypeActivite());
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
        ret.put("idEt", getIdEt());
        ret.put("typeActivite", getTypeActivite());
        return ret;
    }

}
