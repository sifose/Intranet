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

@Entity(name="ESP_AUDIT_CHANGE_CLASSE")
@IdClass(EspAuditChangeClasse.EspAuditChangeClasseId.class)
public class EspAuditChangeClasse implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspAuditChangeClasseId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String idEt;
        java.time.LocalDateTime dateChangementCl;
    }

    /** Primary key. */
    protected static final String PK = "EspAuditChangeClassePkChangeClasse";

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
    @Id
    @Column(name="ID_ET", nullable=false, length=10)
    private String idEt;
    @Column(name="DATE_INSCRIPTION")
    private LocalDateTime dateInscription;
    @Id
    @Column(name="DATE_CHANGEMENT_CL", nullable=false)
    private LocalDateTime dateChangementCl;
    @Column(name="OLD_CL", length=10)
    private String oldCl;
    @Column(name="NEW_CL", length=10)
    private String newCl;
    @Column(name="IP_MACHINE", length=20)
    private String ipMachine;
    @Column(name="NOM_MACHINE", length=50)
    private String nomMachine;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;

    /** Default constructor. */
    public EspAuditChangeClasse() {
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
     * Access method for dateInscription.
     *
     * @return the current value of dateInscription
     */
    public LocalDateTime getDateInscription() {
        return dateInscription;
    }

    /**
     * Setter method for dateInscription.
     *
     * @param aDateInscription the new value for dateInscription
     */
    public void setDateInscription(LocalDateTime aDateInscription) {
        dateInscription = aDateInscription;
    }

    /**
     * Access method for dateChangementCl.
     *
     * @return the current value of dateChangementCl
     */
    public LocalDateTime getDateChangementCl() {
        return dateChangementCl;
    }

    /**
     * Setter method for dateChangementCl.
     *
     * @param aDateChangementCl the new value for dateChangementCl
     */
    public void setDateChangementCl(LocalDateTime aDateChangementCl) {
        dateChangementCl = aDateChangementCl;
    }

    /**
     * Access method for oldCl.
     *
     * @return the current value of oldCl
     */
    public String getOldCl() {
        return oldCl;
    }

    /**
     * Setter method for oldCl.
     *
     * @param aOldCl the new value for oldCl
     */
    public void setOldCl(String aOldCl) {
        oldCl = aOldCl;
    }

    /**
     * Access method for newCl.
     *
     * @return the current value of newCl
     */
    public String getNewCl() {
        return newCl;
    }

    /**
     * Setter method for newCl.
     *
     * @param aNewCl the new value for newCl
     */
    public void setNewCl(String aNewCl) {
        newCl = aNewCl;
    }

    /**
     * Access method for ipMachine.
     *
     * @return the current value of ipMachine
     */
    public String getIpMachine() {
        return ipMachine;
    }

    /**
     * Setter method for ipMachine.
     *
     * @param aIpMachine the new value for ipMachine
     */
    public void setIpMachine(String aIpMachine) {
        ipMachine = aIpMachine;
    }

    /**
     * Access method for nomMachine.
     *
     * @return the current value of nomMachine
     */
    public String getNomMachine() {
        return nomMachine;
    }

    /**
     * Setter method for nomMachine.
     *
     * @param aNomMachine the new value for nomMachine
     */
    public void setNomMachine(String aNomMachine) {
        nomMachine = aNomMachine;
    }

    /**
     * Access method for utilisateur.
     *
     * @return the current value of utilisateur
     */
    public String getUtilisateur() {
        return utilisateur;
    }

    /**
     * Setter method for utilisateur.
     *
     * @param aUtilisateur the new value for utilisateur
     */
    public void setUtilisateur(String aUtilisateur) {
        utilisateur = aUtilisateur;
    }

    /**
     * Compares the key for this instance with another EspAuditChangeClasse.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspAuditChangeClasse and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspAuditChangeClasse)) {
            return false;
        }
        EspAuditChangeClasse that = (EspAuditChangeClasse) other;
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
        Object myDateChangementCl = this.getDateChangementCl();
        Object yourDateChangementCl = that.getDateChangementCl();
        if (myDateChangementCl==null ? yourDateChangementCl!=null : !myDateChangementCl.equals(yourDateChangementCl)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspAuditChangeClasse.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspAuditChangeClasse)) return false;
        return this.equalKeys(other) && ((EspAuditChangeClasse)other).equalKeys(this);
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
        if (getDateChangementCl() == null) {
            i = 0;
        } else {
            i = getDateChangementCl().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspAuditChangeClasse |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" idEt=").append(getIdEt());
        sb.append(" dateChangementCl=").append(getDateChangementCl());
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
        ret.put("dateChangementCl", getDateChangementCl());
        return ret;
    }

}
