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

@Entity(name="STR_NOME")
public class StrNome implements Serializable {

    /** Primary key. */
    protected static final String PK = "codeStr";

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
    @Column(name="CODE_STR", unique=true, nullable=false, length=2)
    private String codeStr;
    @Column(name="NOM_STR", length=35)
    private String nomStr;
    @OneToMany(mappedBy="strNome")
    private Set<ChampStr> champStr;
    @OneToMany(mappedBy="strNome")
    private Set<CodeNomenclature> codeNomenclature;

    /** Default constructor. */
    public StrNome() {
        super();
    }

    /**
     * Access method for codeStr.
     *
     * @return the current value of codeStr
     */
    public String getCodeStr() {
        return codeStr;
    }

    /**
     * Setter method for codeStr.
     *
     * @param aCodeStr the new value for codeStr
     */
    public void setCodeStr(String aCodeStr) {
        codeStr = aCodeStr;
    }

    /**
     * Access method for nomStr.
     *
     * @return the current value of nomStr
     */
    public String getNomStr() {
        return nomStr;
    }

    /**
     * Setter method for nomStr.
     *
     * @param aNomStr the new value for nomStr
     */
    public void setNomStr(String aNomStr) {
        nomStr = aNomStr;
    }

    /**
     * Access method for champStr.
     *
     * @return the current value of champStr
     */
    public Set<ChampStr> getChampStr() {
        return champStr;
    }

    /**
     * Setter method for champStr.
     *
     * @param aChampStr the new value for champStr
     */
    public void setChampStr(Set<ChampStr> aChampStr) {
        champStr = aChampStr;
    }

    /**
     * Access method for codeNomenclature.
     *
     * @return the current value of codeNomenclature
     */
    public Set<CodeNomenclature> getCodeNomenclature() {
        return codeNomenclature;
    }

    /**
     * Setter method for codeNomenclature.
     *
     * @param aCodeNomenclature the new value for codeNomenclature
     */
    public void setCodeNomenclature(Set<CodeNomenclature> aCodeNomenclature) {
        codeNomenclature = aCodeNomenclature;
    }

    /**
     * Compares the key for this instance with another StrNome.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StrNome and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StrNome)) {
            return false;
        }
        StrNome that = (StrNome) other;
        Object myCodeStr = this.getCodeStr();
        Object yourCodeStr = that.getCodeStr();
        if (myCodeStr==null ? yourCodeStr!=null : !myCodeStr.equals(yourCodeStr)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StrNome.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StrNome)) return false;
        return this.equalKeys(other) && ((StrNome)other).equalKeys(this);
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
        if (getCodeStr() == null) {
            i = 0;
        } else {
            i = getCodeStr().hashCode();
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
        StringBuffer sb = new StringBuffer("[StrNome |");
        sb.append(" codeStr=").append(getCodeStr());
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
        ret.put("codeStr", getCodeStr());
        return ret;
    }

}
