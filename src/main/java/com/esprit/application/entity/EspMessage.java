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

@Entity(name="ESP_MESSAGE")
@IdClass(EspMessage.EspMessageId.class)
public class EspMessage implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public static class EspMessageId implements Serializable {
        java.lang.String anneeDeb;
        java.time.LocalDateTime dateMessage;
        java.lang.String senderMsg;
    }

    /** Primary key. */
    protected static final String PK = "EspMessageEspMessagePk";

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
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="ID_ET", length=10)
    private String idEt;
    @Id
    @Column(name="DATE_MESSAGE", nullable=false)
    private LocalDateTime dateMessage;
    @Column(name="CONTENU_MSG", length=1000)
    private String contenuMsg;
    @Column(name="SUBJET_MSG", length=1000)
    private String subjetMsg;
    @Id
    @Column(name="SENDER_MSG", nullable=false, length=1)
    private String senderMsg;
    @Column(name="TYPE_MSG", length=100)
    private String typeMsg;
    @Column(name="DEST_MSG", nullable=false, length=100)
    private String destMsg;
    @Column(name="ETAT", nullable=false, length=1)
    private String etat;

    /** Default constructor. */
    public EspMessage() {
        super();
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
     * Access method for dateMessage.
     *
     * @return the current value of dateMessage
     */
    public LocalDateTime getDateMessage() {
        return dateMessage;
    }

    /**
     * Setter method for dateMessage.
     *
     * @param aDateMessage the new value for dateMessage
     */
    public void setDateMessage(LocalDateTime aDateMessage) {
        dateMessage = aDateMessage;
    }

    /**
     * Access method for contenuMsg.
     *
     * @return the current value of contenuMsg
     */
    public String getContenuMsg() {
        return contenuMsg;
    }

    /**
     * Setter method for contenuMsg.
     *
     * @param aContenuMsg the new value for contenuMsg
     */
    public void setContenuMsg(String aContenuMsg) {
        contenuMsg = aContenuMsg;
    }

    /**
     * Access method for subjetMsg.
     *
     * @return the current value of subjetMsg
     */
    public String getSubjetMsg() {
        return subjetMsg;
    }

    /**
     * Setter method for subjetMsg.
     *
     * @param aSubjetMsg the new value for subjetMsg
     */
    public void setSubjetMsg(String aSubjetMsg) {
        subjetMsg = aSubjetMsg;
    }

    /**
     * Access method for senderMsg.
     *
     * @return the current value of senderMsg
     */
    public String getSenderMsg() {
        return senderMsg;
    }

    /**
     * Setter method for senderMsg.
     *
     * @param aSenderMsg the new value for senderMsg
     */
    public void setSenderMsg(String aSenderMsg) {
        senderMsg = aSenderMsg;
    }

    /**
     * Access method for typeMsg.
     *
     * @return the current value of typeMsg
     */
    public String getTypeMsg() {
        return typeMsg;
    }

    /**
     * Setter method for typeMsg.
     *
     * @param aTypeMsg the new value for typeMsg
     */
    public void setTypeMsg(String aTypeMsg) {
        typeMsg = aTypeMsg;
    }

    /**
     * Access method for destMsg.
     *
     * @return the current value of destMsg
     */
    public String getDestMsg() {
        return destMsg;
    }

    /**
     * Setter method for destMsg.
     *
     * @param aDestMsg the new value for destMsg
     */
    public void setDestMsg(String aDestMsg) {
        destMsg = aDestMsg;
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
     * Compares the key for this instance with another EspMessage.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspMessage and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspMessage)) {
            return false;
        }
        EspMessage that = (EspMessage) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myDateMessage = this.getDateMessage();
        Object yourDateMessage = that.getDateMessage();
        if (myDateMessage==null ? yourDateMessage!=null : !myDateMessage.equals(yourDateMessage)) {
            return false;
        }
        Object mySenderMsg = this.getSenderMsg();
        Object yourSenderMsg = that.getSenderMsg();
        if (mySenderMsg==null ? yourSenderMsg!=null : !mySenderMsg.equals(yourSenderMsg)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspMessage.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspMessage)) return false;
        return this.equalKeys(other) && ((EspMessage)other).equalKeys(this);
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
        if (getDateMessage() == null) {
            i = 0;
        } else {
            i = getDateMessage().hashCode();
        }
        result = 37*result + i;
        if (getSenderMsg() == null) {
            i = 0;
        } else {
            i = getSenderMsg().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspMessage |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" dateMessage=").append(getDateMessage());
        sb.append(" senderMsg=").append(getSenderMsg());
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
        ret.put("dateMessage", getDateMessage());
        ret.put("senderMsg", getSenderMsg());
        return ret;
    }

}
