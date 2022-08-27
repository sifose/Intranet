// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="SEQUENCE")
public class Sequence implements Serializable {

    /** Primary key. */
    protected static final String PK = "seqName";

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
    @Column(name="SEQ_NAME", unique=true, nullable=false, length=50)
    private String seqName;
    @Column(name="SEQ_COUNT", precision=38)
    private BigDecimal seqCount;

    /** Default constructor. */
    public Sequence() {
        super();
    }

    /**
     * Access method for seqName.
     *
     * @return the current value of seqName
     */
    public String getSeqName() {
        return seqName;
    }

    /**
     * Setter method for seqName.
     *
     * @param aSeqName the new value for seqName
     */
    public void setSeqName(String aSeqName) {
        seqName = aSeqName;
    }

    /**
     * Access method for seqCount.
     *
     * @return the current value of seqCount
     */
    public BigDecimal getSeqCount() {
        return seqCount;
    }

    /**
     * Setter method for seqCount.
     *
     * @param aSeqCount the new value for seqCount
     */
    public void setSeqCount(BigDecimal aSeqCount) {
        seqCount = aSeqCount;
    }

    /**
     * Compares the key for this instance with another Sequence.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Sequence and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Sequence)) {
            return false;
        }
        Sequence that = (Sequence) other;
        Object mySeqName = this.getSeqName();
        Object yourSeqName = that.getSeqName();
        if (mySeqName==null ? yourSeqName!=null : !mySeqName.equals(yourSeqName)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Sequence.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Sequence)) return false;
        return this.equalKeys(other) && ((Sequence)other).equalKeys(this);
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
        if (getSeqName() == null) {
            i = 0;
        } else {
            i = getSeqName().hashCode();
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
        StringBuffer sb = new StringBuffer("[Sequence |");
        sb.append(" seqName=").append(getSeqName());
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
        ret.put("seqName", getSeqName());
        return ret;
    }

}
