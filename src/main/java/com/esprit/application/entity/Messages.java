// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="MESSAGES", indexes={@Index(name="MESSAGES_MSGID_IX", columnList="MSGID", unique=true)})
public class Messages implements Serializable {

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
    @Column(name="MSGID", unique=true, nullable=false, length=40)
    private String msgid;
    @Column(name="MSGTITLE", nullable=false, length=255)
    private String msgtitle;
    @Column(name="MSGTEXT", nullable=false, length=255)
    private String msgtext;
    @Column(name="MSGICON", nullable=false, length=12)
    private String msgicon;
    @Column(name="MSGBUTTON", nullable=false, length=17)
    private String msgbutton;
    @Column(name="MSGDEFAULTBUTTON", nullable=false, precision=126)
    private double msgdefaultbutton;
    @Column(name="MSGSEVERITY", nullable=false, precision=126)
    private double msgseverity;
    @Column(name="MSGPRINT", nullable=false, length=1)
    private String msgprint;
    @Column(name="MSGUSERINPUT", nullable=false, length=1)
    private String msguserinput;

    /** Default constructor. */
    public Messages() {
        super();
    }

    /**
     * Access method for msgid.
     *
     * @return the current value of msgid
     */
    public String getMsgid() {
        return msgid;
    }

    /**
     * Setter method for msgid.
     *
     * @param aMsgid the new value for msgid
     */
    public void setMsgid(String aMsgid) {
        msgid = aMsgid;
    }

    /**
     * Access method for msgtitle.
     *
     * @return the current value of msgtitle
     */
    public String getMsgtitle() {
        return msgtitle;
    }

    /**
     * Setter method for msgtitle.
     *
     * @param aMsgtitle the new value for msgtitle
     */
    public void setMsgtitle(String aMsgtitle) {
        msgtitle = aMsgtitle;
    }

    /**
     * Access method for msgtext.
     *
     * @return the current value of msgtext
     */
    public String getMsgtext() {
        return msgtext;
    }

    /**
     * Setter method for msgtext.
     *
     * @param aMsgtext the new value for msgtext
     */
    public void setMsgtext(String aMsgtext) {
        msgtext = aMsgtext;
    }

    /**
     * Access method for msgicon.
     *
     * @return the current value of msgicon
     */
    public String getMsgicon() {
        return msgicon;
    }

    /**
     * Setter method for msgicon.
     *
     * @param aMsgicon the new value for msgicon
     */
    public void setMsgicon(String aMsgicon) {
        msgicon = aMsgicon;
    }

    /**
     * Access method for msgbutton.
     *
     * @return the current value of msgbutton
     */
    public String getMsgbutton() {
        return msgbutton;
    }

    /**
     * Setter method for msgbutton.
     *
     * @param aMsgbutton the new value for msgbutton
     */
    public void setMsgbutton(String aMsgbutton) {
        msgbutton = aMsgbutton;
    }

    /**
     * Access method for msgdefaultbutton.
     *
     * @return the current value of msgdefaultbutton
     */
    public double getMsgdefaultbutton() {
        return msgdefaultbutton;
    }

    /**
     * Setter method for msgdefaultbutton.
     *
     * @param aMsgdefaultbutton the new value for msgdefaultbutton
     */
    public void setMsgdefaultbutton(double aMsgdefaultbutton) {
        msgdefaultbutton = aMsgdefaultbutton;
    }

    /**
     * Access method for msgseverity.
     *
     * @return the current value of msgseverity
     */
    public double getMsgseverity() {
        return msgseverity;
    }

    /**
     * Setter method for msgseverity.
     *
     * @param aMsgseverity the new value for msgseverity
     */
    public void setMsgseverity(double aMsgseverity) {
        msgseverity = aMsgseverity;
    }

    /**
     * Access method for msgprint.
     *
     * @return the current value of msgprint
     */
    public String getMsgprint() {
        return msgprint;
    }

    /**
     * Setter method for msgprint.
     *
     * @param aMsgprint the new value for msgprint
     */
    public void setMsgprint(String aMsgprint) {
        msgprint = aMsgprint;
    }

    /**
     * Access method for msguserinput.
     *
     * @return the current value of msguserinput
     */
    public String getMsguserinput() {
        return msguserinput;
    }

    /**
     * Setter method for msguserinput.
     *
     * @param aMsguserinput the new value for msguserinput
     */
    public void setMsguserinput(String aMsguserinput) {
        msguserinput = aMsguserinput;
    }

}
