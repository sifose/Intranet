// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
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

@Entity(name="CHAMP_STR")
@IdClass(ChampStr.ChampStrId.class)
public class ChampStr implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class ChampStrId implements Serializable {
        StrNome strNome;
        java.lang.String codeChamp;
    }

    /** Primary key. */
    protected static final String PK = "ChampStrPkChampStr";

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
    @Column(name="CODE_CHAMP", nullable=false, length=2)
    private String codeChamp;
    @Column(name="NOM_CHAMP", length=30)
    private String nomChamp;
    @Column(name="MASQUE_CHAMP", length=40)
    private String masqueChamp;
    @OneToMany(mappedBy="champStr")
    private Set<Champ> champ;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_STR", nullable=false)
    private StrNome strNome;

    /** Default constructor. */
    public ChampStr() {
        super();
    }

    /**
     * Access method for codeChamp.
     *
     * @return the current value of codeChamp
     */
    public String getCodeChamp() {
        return codeChamp;
    }

    /**
     * Setter method for codeChamp.
     *
     * @param aCodeChamp the new value for codeChamp
     */
    public void setCodeChamp(String aCodeChamp) {
        codeChamp = aCodeChamp;
    }

    /**
     * Access method for nomChamp.
     *
     * @return the current value of nomChamp
     */
    public String getNomChamp() {
        return nomChamp;
    }

    /**
     * Setter method for nomChamp.
     *
     * @param aNomChamp the new value for nomChamp
     */
    public void setNomChamp(String aNomChamp) {
        nomChamp = aNomChamp;
    }

    /**
     * Access method for masqueChamp.
     *
     * @return the current value of masqueChamp
     */
    public String getMasqueChamp() {
        return masqueChamp;
    }

    /**
     * Setter method for masqueChamp.
     *
     * @param aMasqueChamp the new value for masqueChamp
     */
    public void setMasqueChamp(String aMasqueChamp) {
        masqueChamp = aMasqueChamp;
    }

    /**
     * Access method for champ.
     *
     * @return the current value of champ
     */
    public Set<Champ> getChamp() {
        return champ;
    }

    /**
     * Setter method for champ.
     *
     * @param aChamp the new value for champ
     */
    public void setChamp(Set<Champ> aChamp) {
        champ = aChamp;
    }

   

    /**
     * Access method for strNome.
     *
     * @return the current value of strNome
     */
    public StrNome getStrNome() {
        return strNome;
    }

    /**
     * Setter method for strNome.
     *
     * @param aStrNome the new value for strNome
     */
    public void setStrNome(StrNome aStrNome) {
        strNome = aStrNome;
    }

    /** Temporary value holder for group key fragment strNomeCodeStr */
    private transient String tempStrNomeCodeStr;

    /**
     * Gets the key fragment codeStr for member strNome.
     * If this.strNome is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setStrNomeCodeStr.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see StrNome
     */
    public String getStrNomeCodeStr() {
        return (getStrNome() == null ? tempStrNomeCodeStr : getStrNome().getCodeStr());
    }

    /**
     * Sets the key fragment codeStr from member strNome.
     * If this.strNome is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getStrNomeCodeStr.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeStr New value for the key fragment
     * @see StrNome
     */
    public void setStrNomeCodeStr(String aCodeStr) {
        if (getStrNome() == null) {
            tempStrNomeCodeStr = aCodeStr;
        } else {
            getStrNome().setCodeStr(aCodeStr);
        }
    }

    /**
     * Compares the key for this instance with another ChampStr.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ChampStr and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ChampStr)) {
            return false;
        }
        ChampStr that = (ChampStr) other;
        Object myStrNomeCodeStr = this.getStrNomeCodeStr();
        Object yourStrNomeCodeStr = that.getStrNomeCodeStr();
        if (myStrNomeCodeStr==null ? yourStrNomeCodeStr!=null : !myStrNomeCodeStr.equals(yourStrNomeCodeStr)) {
            return false;
        }
        Object myCodeChamp = this.getCodeChamp();
        Object yourCodeChamp = that.getCodeChamp();
        if (myCodeChamp==null ? yourCodeChamp!=null : !myCodeChamp.equals(yourCodeChamp)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ChampStr.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ChampStr)) return false;
        return this.equalKeys(other) && ((ChampStr)other).equalKeys(this);
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
        if (getStrNomeCodeStr() == null) {
            i = 0;
        } else {
            i = getStrNomeCodeStr().hashCode();
        }
        result = 37*result + i;
        if (getCodeChamp() == null) {
            i = 0;
        } else {
            i = getCodeChamp().hashCode();
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
        StringBuffer sb = new StringBuffer("[ChampStr |");
        sb.append(" strNomeCodeStr=").append(getStrNomeCodeStr());
        sb.append(" codeChamp=").append(getCodeChamp());
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
        ret.put("strNomeCodeStr", getStrNomeCodeStr());
        ret.put("codeChamp", getCodeChamp());
        return ret;
    }

}
