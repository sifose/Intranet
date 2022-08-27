// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="CHAMP")
@IdClass(Champ.ChampId.class)
public class Champ implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class ChampId implements Serializable {
        CodeNomenclature codeNomenclature;
        ChampStr champStr;
    }

    /** Primary key. */
    protected static final String PK = "ChampPkChamp";

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

    @Column(name="VALEUR", length=100)
    private String valeur;
    @ManyToOne(optional=false)
    @Id
    @JoinColumns ({
    @JoinColumn(name="CODE_STR", nullable=false),
    @JoinColumn(name="CODE_NOME", nullable=false) })
    private CodeNomenclature codeNomenclature;
   
    
    @ManyToOne(optional=false)
    @Id
    @JoinColumns ({
    @JoinColumn(name="CODE_CHAMP", nullable=false),
   
    @JoinColumn(name="CHA_CODE_STR") })
    private ChampStr champStr;

    /** Default constructor. */
    public Champ() {
        super();
    }

    /**
     * Access method for valeur.
     *
     * @return the current value of valeur
     */
    public String getValeur() {
        return valeur;
    }

    /**
     * Setter method for valeur.
     *
     * @param aValeur the new value for valeur
     */
    public void setValeur(String aValeur) {
        valeur = aValeur;
    }

    /**
     * Access method for codeNomenclature.
     *
     * @return the current value of codeNomenclature
     */
    public CodeNomenclature getCodeNomenclature() {
        return codeNomenclature;
    }

    /**
     * Setter method for codeNomenclature.
     *
     * @param aCodeNomenclature the new value for codeNomenclature
     */
    public void setCodeNomenclature(CodeNomenclature aCodeNomenclature) {
        codeNomenclature = aCodeNomenclature;
    }

   
    /**
     * Access method for champStr.
     *
     * @return the current value of champStr
     */
    public ChampStr getChampStr() {
        return champStr;
    }

    /**
     * Setter method for champStr.
     *
     * @param aChampStr the new value for champStr
     */
    public void setChampStr(ChampStr aChampStr) {
        champStr = aChampStr;
    }

   

    /** Temporary value holder for group key fragment codeNomenclatureStrNomeCodeStr */
    private transient String tempCodeNomenclatureStrNomeCodeStr;

    /**
     * Gets the key fragment codeStr for member codeNomenclature.
     * If this.codeNomenclature is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setCodeNomenclatureStrNomeCodeStr.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see StrNome
     */
    public String getCodeNomenclatureStrNomeCodeStr() {
        return (getCodeNomenclature() == null ? tempCodeNomenclatureStrNomeCodeStr : getCodeNomenclature().getStrNomeCodeStr());
    }

    /**
     * Sets the key fragment codeStr from member codeNomenclature.
     * If this.codeNomenclature is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getCodeNomenclatureStrNomeCodeStr.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeStr New value for the key fragment
     * @see StrNome
     */
    public void setCodeNomenclatureStrNomeCodeStr(String aCodeStr) {
        if (getCodeNomenclature() == null) {
            tempCodeNomenclatureStrNomeCodeStr = aCodeStr;
        } else {
            getCodeNomenclature().setStrNomeCodeStr(aCodeStr);
        }
    }

    /** Temporary value holder for group key fragment codeNomenclatureCodeNome */
    private transient String tempCodeNomenclatureCodeNome;

    /**
     * Gets the key fragment codeNome for member codeNomenclature.
     * If this.codeNomenclature is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setCodeNomenclatureCodeNome.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see CodeNomenclature
     */
    public String getCodeNomenclatureCodeNome() {
        return (getCodeNomenclature() == null ? tempCodeNomenclatureCodeNome : getCodeNomenclature().getCodeNome());
    }

    /**
     * Sets the key fragment codeNome from member codeNomenclature.
     * If this.codeNomenclature is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getCodeNomenclatureCodeNome.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeNome New value for the key fragment
     * @see CodeNomenclature
     */
    public void setCodeNomenclatureCodeNome(String aCodeNome) {
        if (getCodeNomenclature() == null) {
            tempCodeNomenclatureCodeNome = aCodeNome;
        } else {
            getCodeNomenclature().setCodeNome(aCodeNome);
        }
    }

    /** Temporary value holder for group key fragment codeNomenclature2StrNomeCodeStr */
    private transient String tempCodeNomenclature2StrNomeCodeStr;

    /**
  
    /** Temporary value holder for group key fragment champStrStrNomeCodeStr */
    private transient String tempChampStrStrNomeCodeStr;

    /**
     * Gets the key fragment codeStr for member champStr.
     * If this.champStr is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setChampStrStrNomeCodeStr.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see StrNome
     */
    public String getChampStrStrNomeCodeStr() {
        return (getChampStr() == null ? tempChampStrStrNomeCodeStr : getChampStr().getStrNomeCodeStr());
    }

    /**
     * Sets the key fragment codeStr from member champStr.
     * If this.champStr is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getChampStrStrNomeCodeStr.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeStr New value for the key fragment
     * @see StrNome
     */
    public void setChampStrStrNomeCodeStr(String aCodeStr) {
        if (getChampStr() == null) {
            tempChampStrStrNomeCodeStr = aCodeStr;
        } else {
            getChampStr().setStrNomeCodeStr(aCodeStr);
        }
    }

    /** Temporary value holder for group key fragment champStrCodeChamp */
    private transient String tempChampStrCodeChamp;

    /**
     * Gets the key fragment codeChamp for member champStr.
     * If this.champStr is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setChampStrCodeChamp.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see ChampStr
     */
    public String getChampStrCodeChamp() {
        return (getChampStr() == null ? tempChampStrCodeChamp : getChampStr().getCodeChamp());
    }

    /**
     * Sets the key fragment codeChamp from member champStr.
     * If this.champStr is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getChampStrCodeChamp.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeChamp New value for the key fragment
     * @see ChampStr
     */
    public void setChampStrCodeChamp(String aCodeChamp) {
        if (getChampStr() == null) {
            tempChampStrCodeChamp = aCodeChamp;
        } else {
            getChampStr().setCodeChamp(aCodeChamp);
        }
    }

    /**
     * Compares the key for this instance with another Champ.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Champ and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Champ)) {
            return false;
        }
        Champ that = (Champ) other;
        Object myCodeNomenclatureStrNomeCodeStr = this.getCodeNomenclatureStrNomeCodeStr();
        Object yourCodeNomenclatureStrNomeCodeStr = that.getCodeNomenclatureStrNomeCodeStr();
        if (myCodeNomenclatureStrNomeCodeStr==null ? yourCodeNomenclatureStrNomeCodeStr!=null : !myCodeNomenclatureStrNomeCodeStr.equals(yourCodeNomenclatureStrNomeCodeStr)) {
            return false;
        }
        Object myCodeNomenclatureCodeNome = this.getCodeNomenclatureCodeNome();
        Object yourCodeNomenclatureCodeNome = that.getCodeNomenclatureCodeNome();
        if (myCodeNomenclatureCodeNome==null ? yourCodeNomenclatureCodeNome!=null : !myCodeNomenclatureCodeNome.equals(yourCodeNomenclatureCodeNome)) {
            return false;
        }
        
        Object myChampStrStrNomeCodeStr = this.getChampStrStrNomeCodeStr();
        Object yourChampStrStrNomeCodeStr = that.getChampStrStrNomeCodeStr();
        if (myChampStrStrNomeCodeStr==null ? yourChampStrStrNomeCodeStr!=null : !myChampStrStrNomeCodeStr.equals(yourChampStrStrNomeCodeStr)) {
            return false;
        }
        Object myChampStrCodeChamp = this.getChampStrCodeChamp();
        Object yourChampStrCodeChamp = that.getChampStrCodeChamp();
        if (myChampStrCodeChamp==null ? yourChampStrCodeChamp!=null : !myChampStrCodeChamp.equals(yourChampStrCodeChamp)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Champ.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Champ)) return false;
        return this.equalKeys(other) && ((Champ)other).equalKeys(this);
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
        if (getCodeNomenclatureStrNomeCodeStr() == null) {
            i = 0;
        } else {
            i = getCodeNomenclatureStrNomeCodeStr().hashCode();
        }
        result = 37*result + i;
        if (getCodeNomenclatureCodeNome() == null) {
            i = 0;
        } else {
            i = getCodeNomenclatureCodeNome().hashCode();
        }
        result = 37*result + i;
       
        if (getChampStrStrNomeCodeStr() == null) {
            i = 0;
        } else {
            i = getChampStrStrNomeCodeStr().hashCode();
        }
        result = 37*result + i;
        if (getChampStrCodeChamp() == null) {
            i = 0;
        } else {
            i = getChampStrCodeChamp().hashCode();
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
        StringBuffer sb = new StringBuffer("[Champ |");
        sb.append(" codeNomenclatureStrNomeCodeStr=").append(getCodeNomenclatureStrNomeCodeStr());
        sb.append(" codeNomenclatureCodeNome=").append(getCodeNomenclatureCodeNome());
        sb.append(" champStrStrNomeCodeStr=").append(getChampStrStrNomeCodeStr());
        sb.append(" champStrCodeChamp=").append(getChampStrCodeChamp());
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
        ret.put("codeNomenclatureStrNomeCodeStr", getCodeNomenclatureStrNomeCodeStr());
        ret.put("codeNomenclatureCodeNome", getCodeNomenclatureCodeNome());
        ret.put("champStrStrNomeCodeStr", getChampStrStrNomeCodeStr());
        ret.put("champStrCodeChamp", getChampStrCodeChamp());
        return ret;
    }

}
