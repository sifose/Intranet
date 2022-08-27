// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_ASS_RUB_ET_INS")
@IdClass(EspAssRubEtIns.EspAssRubEtInsId.class)
public class EspAssRubEtIns implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspAssRubEtInsId implements Serializable {
        EspRubrique espRubrique;
        EspEtudiant espEtudiant;
        java.lang.String anneeDeb;
        java.time.LocalDateTime dateOp;
    }

    /** Primary key. */
    protected static final String PK = "EspAssRubEtInsPkAssRubEt";

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
    @Column(name="CODE_CL", length=10)
    private String codeCl;
    @Id
    @Column(name="DATE_OP", nullable=false)
    private LocalDateTime dateOp;
    @Column(name="DATE_LAST_MODIF")
    private LocalDateTime dateLastModif;
    @Column(name="MONTANT_OP", precision=10, scale=3)
    private BigDecimal montantOp;
    @Column(name="USER_NAME", length=16)
    private String userName;
    @Column(name="MODE_RGLT", length=2)
    private String modeRglt;
    @Column(name="NUM_PIECE", length=20)
    private String numPiece;
    @Column(name="DATE_PIECE")
    private LocalDateTime datePiece;
    @Column(name="BANQUE", length=50)
    private String banque;
    @Column(name="NUM_RECU", precision=8)
    private BigDecimal numRecu;
    @Column(name="OBJET", length=300)
    private String objet;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ID_ET", nullable=false)
    private EspEtudiant espEtudiant;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_RUB", nullable=false)
    private EspRubrique espRubrique;

    /** Default constructor. */
    public EspAssRubEtIns() {
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
     * Access method for codeCl.
     *
     * @return the current value of codeCl
     */
    public String getCodeCl() {
        return codeCl;
    }

    /**
     * Setter method for codeCl.
     *
     * @param aCodeCl the new value for codeCl
     */
    public void setCodeCl(String aCodeCl) {
        codeCl = aCodeCl;
    }

    /**
     * Access method for dateOp.
     *
     * @return the current value of dateOp
     */
    public LocalDateTime getDateOp() {
        return dateOp;
    }

    /**
     * Setter method for dateOp.
     *
     * @param aDateOp the new value for dateOp
     */
    public void setDateOp(LocalDateTime aDateOp) {
        dateOp = aDateOp;
    }

    /**
     * Access method for dateLastModif.
     *
     * @return the current value of dateLastModif
     */
    public LocalDateTime getDateLastModif() {
        return dateLastModif;
    }

    /**
     * Setter method for dateLastModif.
     *
     * @param aDateLastModif the new value for dateLastModif
     */
    public void setDateLastModif(LocalDateTime aDateLastModif) {
        dateLastModif = aDateLastModif;
    }

    /**
     * Access method for montantOp.
     *
     * @return the current value of montantOp
     */
    public BigDecimal getMontantOp() {
        return montantOp;
    }

    /**
     * Setter method for montantOp.
     *
     * @param aMontantOp the new value for montantOp
     */
    public void setMontantOp(BigDecimal aMontantOp) {
        montantOp = aMontantOp;
    }

    /**
     * Access method for userName.
     *
     * @return the current value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for userName.
     *
     * @param aUserName the new value for userName
     */
    public void setUserName(String aUserName) {
        userName = aUserName;
    }

    /**
     * Access method for modeRglt.
     *
     * @return the current value of modeRglt
     */
    public String getModeRglt() {
        return modeRglt;
    }

    /**
     * Setter method for modeRglt.
     *
     * @param aModeRglt the new value for modeRglt
     */
    public void setModeRglt(String aModeRglt) {
        modeRglt = aModeRglt;
    }

    /**
     * Access method for numPiece.
     *
     * @return the current value of numPiece
     */
    public String getNumPiece() {
        return numPiece;
    }

    /**
     * Setter method for numPiece.
     *
     * @param aNumPiece the new value for numPiece
     */
    public void setNumPiece(String aNumPiece) {
        numPiece = aNumPiece;
    }

    /**
     * Access method for datePiece.
     *
     * @return the current value of datePiece
     */
    public LocalDateTime getDatePiece() {
        return datePiece;
    }

    /**
     * Setter method for datePiece.
     *
     * @param aDatePiece the new value for datePiece
     */
    public void setDatePiece(LocalDateTime aDatePiece) {
        datePiece = aDatePiece;
    }

    /**
     * Access method for banque.
     *
     * @return the current value of banque
     */
    public String getBanque() {
        return banque;
    }

    /**
     * Setter method for banque.
     *
     * @param aBanque the new value for banque
     */
    public void setBanque(String aBanque) {
        banque = aBanque;
    }

    /**
     * Access method for numRecu.
     *
     * @return the current value of numRecu
     */
    public BigDecimal getNumRecu() {
        return numRecu;
    }

    /**
     * Setter method for numRecu.
     *
     * @param aNumRecu the new value for numRecu
     */
    public void setNumRecu(BigDecimal aNumRecu) {
        numRecu = aNumRecu;
    }

    /**
     * Access method for objet.
     *
     * @return the current value of objet
     */
    public String getObjet() {
        return objet;
    }

    /**
     * Setter method for objet.
     *
     * @param aObjet the new value for objet
     */
    public void setObjet(String aObjet) {
        objet = aObjet;
    }

    /**
     * Access method for espEtudiant.
     *
     * @return the current value of espEtudiant
     */
    public EspEtudiant getEspEtudiant() {
        return espEtudiant;
    }

    /**
     * Setter method for espEtudiant.
     *
     * @param aEspEtudiant the new value for espEtudiant
     */
    public void setEspEtudiant(EspEtudiant aEspEtudiant) {
        espEtudiant = aEspEtudiant;
    }

    /**
     * Access method for espRubrique.
     *
     * @return the current value of espRubrique
     */
    public EspRubrique getEspRubrique() {
        return espRubrique;
    }

    /**
     * Setter method for espRubrique.
     *
     * @param aEspRubrique the new value for espRubrique
     */
    public void setEspRubrique(EspRubrique aEspRubrique) {
        espRubrique = aEspRubrique;
    }

    /** Temporary value holder for group key fragment espRubriqueCodeRub */
    private transient String tempEspRubriqueCodeRub;

    /**
     * Gets the key fragment codeRub for member espRubrique.
     * If this.espRubrique is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspRubriqueCodeRub.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspRubrique
     */
    public String getEspRubriqueCodeRub() {
        return (getEspRubrique() == null ? tempEspRubriqueCodeRub : getEspRubrique().getCodeRub());
    }

    /**
     * Sets the key fragment codeRub from member espRubrique.
     * If this.espRubrique is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspRubriqueCodeRub.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeRub New value for the key fragment
     * @see EspRubrique
     */
    public void setEspRubriqueCodeRub(String aCodeRub) {
        if (getEspRubrique() == null) {
            tempEspRubriqueCodeRub = aCodeRub;
        } else {
            getEspRubrique().setCodeRub(aCodeRub);
        }
    }

    /** Temporary value holder for group key fragment espEtudiantIdEt */
    private transient String tempEspEtudiantIdEt;

    /**
     * Gets the key fragment idEt for member espEtudiant.
     * If this.espEtudiant is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspEtudiantIdEt.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspEtudiant
     */
    public String getEspEtudiantIdEt() {
        return (getEspEtudiant() == null ? tempEspEtudiantIdEt : getEspEtudiant().getIdEt());
    }

    /**
     * Sets the key fragment idEt from member espEtudiant.
     * If this.espEtudiant is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspEtudiantIdEt.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdEt New value for the key fragment
     * @see EspEtudiant
     */
    public void setEspEtudiantIdEt(String aIdEt) {
        if (getEspEtudiant() == null) {
            tempEspEtudiantIdEt = aIdEt;
        } else {
            getEspEtudiant().setIdEt(aIdEt);
        }
    }

    /**
     * Compares the key for this instance with another EspAssRubEtIns.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspAssRubEtIns and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspAssRubEtIns)) {
            return false;
        }
        EspAssRubEtIns that = (EspAssRubEtIns) other;
        Object myEspRubriqueCodeRub = this.getEspRubriqueCodeRub();
        Object yourEspRubriqueCodeRub = that.getEspRubriqueCodeRub();
        if (myEspRubriqueCodeRub==null ? yourEspRubriqueCodeRub!=null : !myEspRubriqueCodeRub.equals(yourEspRubriqueCodeRub)) {
            return false;
        }
        Object myEspEtudiantIdEt = this.getEspEtudiantIdEt();
        Object yourEspEtudiantIdEt = that.getEspEtudiantIdEt();
        if (myEspEtudiantIdEt==null ? yourEspEtudiantIdEt!=null : !myEspEtudiantIdEt.equals(yourEspEtudiantIdEt)) {
            return false;
        }
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myDateOp = this.getDateOp();
        Object yourDateOp = that.getDateOp();
        if (myDateOp==null ? yourDateOp!=null : !myDateOp.equals(yourDateOp)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspAssRubEtIns.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspAssRubEtIns)) return false;
        return this.equalKeys(other) && ((EspAssRubEtIns)other).equalKeys(this);
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
        if (getEspRubriqueCodeRub() == null) {
            i = 0;
        } else {
            i = getEspRubriqueCodeRub().hashCode();
        }
        result = 37*result + i;
        if (getEspEtudiantIdEt() == null) {
            i = 0;
        } else {
            i = getEspEtudiantIdEt().hashCode();
        }
        result = 37*result + i;
        if (getAnneeDeb() == null) {
            i = 0;
        } else {
            i = getAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getDateOp() == null) {
            i = 0;
        } else {
            i = getDateOp().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspAssRubEtIns |");
        sb.append(" espRubriqueCodeRub=").append(getEspRubriqueCodeRub());
        sb.append(" espEtudiantIdEt=").append(getEspEtudiantIdEt());
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" dateOp=").append(getDateOp());
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
        ret.put("espRubriqueCodeRub", getEspRubriqueCodeRub());
        ret.put("espEtudiantIdEt", getEspEtudiantIdEt());
        ret.put("anneeDeb", getAnneeDeb());
        ret.put("dateOp", getDateOp());
        return ret;
    }

}
