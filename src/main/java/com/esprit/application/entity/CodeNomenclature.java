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

@Entity(name="CODE_NOMENCLATURE")
@IdClass(CodeNomenclature.CodeNomenclatureId.class)
public class CodeNomenclature implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class CodeNomenclatureId implements Serializable {
        StrNome strNome;
        java.lang.String codeNome;
    }

    /** Primary key. */
    protected static final String PK = "CodeNomenclaturePkCodeNomenclature";

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
    @Column(name="CODE_NOME", nullable=false, length=4)
    private String codeNome;
    @Column(name="LIB_NOME", length=100)
    private String libNome;
    @OneToMany(mappedBy="codeNomenclature")
    private Set<Champ> champ;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_STR", nullable=false)
    private StrNome strNome;

    /** Default constructor. */
    public CodeNomenclature() {
        super();
    }

    /**
     * Access method for codeNome.
     *
     * @return the current value of codeNome
     */
    public String getCodeNome() {
        return codeNome;
    }

    /**
     * Setter method for codeNome.
     *
     * @param aCodeNome the new value for codeNome
     */
    public void setCodeNome(String aCodeNome) {
        codeNome = aCodeNome;
    }

    /**
     * Access method for libNome.
     *
     * @return the current value of libNome
     */
    public String getLibNome() {
        return libNome;
    }

    /**
     * Setter method for libNome.
     *
     * @param aLibNome the new value for libNome
     */
    public void setLibNome(String aLibNome) {
        libNome = aLibNome;
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
     * Compares the key for this instance with another CodeNomenclature.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CodeNomenclature and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CodeNomenclature)) {
            return false;
        }
        CodeNomenclature that = (CodeNomenclature) other;
        Object myStrNomeCodeStr = this.getStrNomeCodeStr();
        Object yourStrNomeCodeStr = that.getStrNomeCodeStr();
        if (myStrNomeCodeStr==null ? yourStrNomeCodeStr!=null : !myStrNomeCodeStr.equals(yourStrNomeCodeStr)) {
            return false;
        }
        Object myCodeNome = this.getCodeNome();
        Object yourCodeNome = that.getCodeNome();
        if (myCodeNome==null ? yourCodeNome!=null : !myCodeNome.equals(yourCodeNome)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CodeNomenclature.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CodeNomenclature)) return false;
        return this.equalKeys(other) && ((CodeNomenclature)other).equalKeys(this);
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
        if (getCodeNome() == null) {
            i = 0;
        } else {
            i = getCodeNome().hashCode();
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
        StringBuffer sb = new StringBuffer("[CodeNomenclature |");
        sb.append(" strNomeCodeStr=").append(getStrNomeCodeStr());
        sb.append(" codeNome=").append(getCodeNome());
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
        ret.put("codeNome", getCodeNome());
        return ret;
    }

}
