// Generated with g9.

package com.esprit.application.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public final class SysC0023304 {

    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private final String anneeDeb;
    @Column(name="DATE_MESSAGE", nullable=false)
    private final LocalDateTime dateMessage;
    @Column(name="SENDER_MSG", nullable=false, length=1)
    private final String senderMsg;

    /** Initializing constructor. */
    public SysC0023304(String anneeDeb, LocalDateTime dateMessage, String senderMsg) {
        this.anneeDeb = anneeDeb;
        this.dateMessage = dateMessage;
        this.senderMsg = senderMsg;
    }

    /** Private default constructor (for ORM frameworks). */
    @SuppressWarnings("unused")
    private SysC0023304() {
        this(null, null, null);
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
     * Access method for dateMessage.
     *
     * @return the current value of dateMessage
     */
    public LocalDateTime getDateMessage() {
        return dateMessage;
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
     * Compares this instance with another SysC0023304.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (getClass() != other.getClass()) {
            return false;
        }
        SysC0023304 that = (SysC0023304) other;
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
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i = 1;
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

}
