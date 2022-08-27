// Generated with g9.

package com.esprit.application.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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

@Entity(name="ESP_ENTETE_NOTE")
@IdClass(EspEnteteNote.EspEnteteNoteId.class)
public class EspEnteteNote implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspEnteteNoteId implements Serializable {
        java.lang.String anneeDeb;
        java.lang.String codeCl;
        EspModule espModule;
        java.math.BigDecimal semestre;
    }

    /** Primary key. */
    protected static final String PK = "EspEnteteNotePkEspEnteteNote";

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

    @Column(name="NUM_PANIER", length=5)
    private String numPanier;
    @Id
    @Column(name="CODE_CL", nullable=false, length=10)
    private String codeCl;
    @Id
    @Column(name="ANNEE_DEB", nullable=false, length=4)
    private String anneeDeb;
    @Column(name="ANNEE_FIN", length=4)
    private String anneeFin;
    @Column(name="ID_ENS", nullable=false, length=10)
    private String idEns;
    @Column(name="TYPE_SESSION", length=1)
    private String typeSession;
    @Column(name="NATURE_NOTE", length=2)
    private String natureNote;
    @Column(name="OBSERVATION", length=300)
    private String observation;
    @Column(name="DATE_DEROULEMENT", nullable=false)
    private LocalDateTime dateDeroulement;
    @Id
    @Column(name="SEMESTRE", nullable=false, precision=1)
    private BigDecimal semestre;
    @Column(name="NB_HEURE", precision=2)
    private BigDecimal nbHeure;
    @Column(name="CONFIRMATION", length=1)
    private String confirmation;
    @Column(name="DATE_SAISIE")
    private LocalDateTime dateSaisie;
    @Column(name="DATE_CONFIRMATION")
    private LocalDateTime dateConfirmation;
    @Column(name="TAUX_EXAM", precision=5, scale=2)
    private BigDecimal tauxExam;
    @Column(name="TAUX_CC", precision=5, scale=2)
    private BigDecimal tauxCc;
    @Column(name="TAUX_TP", precision=5, scale=2)
    private BigDecimal tauxTp;
    @Column(name="EXISTE_NOTE_CC", length=1)
    private String existeNoteCc;
    @Column(name="EXISTE_NOTE_TP", length=1)
    private String existeNoteTp;
    @Column(name="COEF", precision=5, scale=2)
    private BigDecimal coef;
    @Column(name="DATE_RATRAP")
    private LocalDateTime dateRatrap;
    @Column(name="USER_NAME", length=16)
    private String userName;
    @Column(name="CONF_RATTRAPAGE", length=1)
    private String confRattrapage;
    @Column(name="DATE_CONF_RATT")
    private LocalDateTime dateConfRatt;
    @Column(name="USER_CONFIRM", length=16)
    private String userConfirm;
    @Column(name="DATE_LAST_MODIF")
    private LocalDateTime dateLastModif;
    @Column(name="USER_LAST_MODIF", length=16)
    private String userLastModif;
    @Column(name="USER_CONFIRM_RATT", length=16)
    private String userConfirmRatt;
    @Column(name="TATOUAGE_ENS", length=20)
    private String tatouageEns;
    @Column(name="CONFIRM_NEW", length=1)
    private String confirmNew;
    @Column(name="NUMPROMOTIONCS", precision=4)
    private BigDecimal numpromotioncs;
    @Column(name="TAUX_ECRIT_LANG", precision=5, scale=2)
    private BigDecimal tauxEcritLang;
    @Column(name="TAUX_ORAL_LANG", precision=5, scale=2)
    private BigDecimal tauxOralLang;
    @Column(name="TAUX_CC_LANG", precision=5, scale=2)
    private BigDecimal tauxCcLang;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="CODE_MODULE", nullable=false)
    private EspModule espModule;
    @OneToMany(mappedBy="espEnteteNote")
    private Set<EspNote> espNote;

    /** Default constructor. */
    public EspEnteteNote() {
        super();
    }

    /**
     * Access method for numPanier.
     *
     * @return the current value of numPanier
     */
    public String getNumPanier() {
        return numPanier;
    }

    /**
     * Setter method for numPanier.
     *
     * @param aNumPanier the new value for numPanier
     */
    public void setNumPanier(String aNumPanier) {
        numPanier = aNumPanier;
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
     * Access method for anneeFin.
     *
     * @return the current value of anneeFin
     */
    public String getAnneeFin() {
        return anneeFin;
    }

    /**
     * Setter method for anneeFin.
     *
     * @param aAnneeFin the new value for anneeFin
     */
    public void setAnneeFin(String aAnneeFin) {
        anneeFin = aAnneeFin;
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
     * Access method for typeSession.
     *
     * @return the current value of typeSession
     */
    public String getTypeSession() {
        return typeSession;
    }

    /**
     * Setter method for typeSession.
     *
     * @param aTypeSession the new value for typeSession
     */
    public void setTypeSession(String aTypeSession) {
        typeSession = aTypeSession;
    }

    /**
     * Access method for natureNote.
     *
     * @return the current value of natureNote
     */
    public String getNatureNote() {
        return natureNote;
    }

    /**
     * Setter method for natureNote.
     *
     * @param aNatureNote the new value for natureNote
     */
    public void setNatureNote(String aNatureNote) {
        natureNote = aNatureNote;
    }

    /**
     * Access method for observation.
     *
     * @return the current value of observation
     */
    public String getObservation() {
        return observation;
    }

    /**
     * Setter method for observation.
     *
     * @param aObservation the new value for observation
     */
    public void setObservation(String aObservation) {
        observation = aObservation;
    }

    /**
     * Access method for dateDeroulement.
     *
     * @return the current value of dateDeroulement
     */
    public LocalDateTime getDateDeroulement() {
        return dateDeroulement;
    }

    /**
     * Setter method for dateDeroulement.
     *
     * @param aDateDeroulement the new value for dateDeroulement
     */
    public void setDateDeroulement(LocalDateTime aDateDeroulement) {
        dateDeroulement = aDateDeroulement;
    }

    /**
     * Access method for semestre.
     *
     * @return the current value of semestre
     */
    public BigDecimal getSemestre() {
        return semestre;
    }

    /**
     * Setter method for semestre.
     *
     * @param aSemestre the new value for semestre
     */
    public void setSemestre(BigDecimal aSemestre) {
        semestre = aSemestre;
    }

    /**
     * Access method for nbHeure.
     *
     * @return the current value of nbHeure
     */
    public BigDecimal getNbHeure() {
        return nbHeure;
    }

    /**
     * Setter method for nbHeure.
     *
     * @param aNbHeure the new value for nbHeure
     */
    public void setNbHeure(BigDecimal aNbHeure) {
        nbHeure = aNbHeure;
    }

    /**
     * Access method for confirmation.
     *
     * @return the current value of confirmation
     */
    public String getConfirmation() {
        return confirmation;
    }

    /**
     * Setter method for confirmation.
     *
     * @param aConfirmation the new value for confirmation
     */
    public void setConfirmation(String aConfirmation) {
        confirmation = aConfirmation;
    }

    /**
     * Access method for dateSaisie.
     *
     * @return the current value of dateSaisie
     */
    public LocalDateTime getDateSaisie() {
        return dateSaisie;
    }

    /**
     * Setter method for dateSaisie.
     *
     * @param aDateSaisie the new value for dateSaisie
     */
    public void setDateSaisie(LocalDateTime aDateSaisie) {
        dateSaisie = aDateSaisie;
    }

    /**
     * Access method for dateConfirmation.
     *
     * @return the current value of dateConfirmation
     */
    public LocalDateTime getDateConfirmation() {
        return dateConfirmation;
    }

    /**
     * Setter method for dateConfirmation.
     *
     * @param aDateConfirmation the new value for dateConfirmation
     */
    public void setDateConfirmation(LocalDateTime aDateConfirmation) {
        dateConfirmation = aDateConfirmation;
    }

    /**
     * Access method for tauxExam.
     *
     * @return the current value of tauxExam
     */
    public BigDecimal getTauxExam() {
        return tauxExam;
    }

    /**
     * Setter method for tauxExam.
     *
     * @param aTauxExam the new value for tauxExam
     */
    public void setTauxExam(BigDecimal aTauxExam) {
        tauxExam = aTauxExam;
    }

    /**
     * Access method for tauxCc.
     *
     * @return the current value of tauxCc
     */
    public BigDecimal getTauxCc() {
        return tauxCc;
    }

    /**
     * Setter method for tauxCc.
     *
     * @param aTauxCc the new value for tauxCc
     */
    public void setTauxCc(BigDecimal aTauxCc) {
        tauxCc = aTauxCc;
    }

    /**
     * Access method for tauxTp.
     *
     * @return the current value of tauxTp
     */
    public BigDecimal getTauxTp() {
        return tauxTp;
    }

    /**
     * Setter method for tauxTp.
     *
     * @param aTauxTp the new value for tauxTp
     */
    public void setTauxTp(BigDecimal aTauxTp) {
        tauxTp = aTauxTp;
    }

    /**
     * Access method for existeNoteCc.
     *
     * @return the current value of existeNoteCc
     */
    public String getExisteNoteCc() {
        return existeNoteCc;
    }

    /**
     * Setter method for existeNoteCc.
     *
     * @param aExisteNoteCc the new value for existeNoteCc
     */
    public void setExisteNoteCc(String aExisteNoteCc) {
        existeNoteCc = aExisteNoteCc;
    }

    /**
     * Access method for existeNoteTp.
     *
     * @return the current value of existeNoteTp
     */
    public String getExisteNoteTp() {
        return existeNoteTp;
    }

    /**
     * Setter method for existeNoteTp.
     *
     * @param aExisteNoteTp the new value for existeNoteTp
     */
    public void setExisteNoteTp(String aExisteNoteTp) {
        existeNoteTp = aExisteNoteTp;
    }

    /**
     * Access method for coef.
     *
     * @return the current value of coef
     */
    public BigDecimal getCoef() {
        return coef;
    }

    /**
     * Setter method for coef.
     *
     * @param aCoef the new value for coef
     */
    public void setCoef(BigDecimal aCoef) {
        coef = aCoef;
    }

    /**
     * Access method for dateRatrap.
     *
     * @return the current value of dateRatrap
     */
    public LocalDateTime getDateRatrap() {
        return dateRatrap;
    }

    /**
     * Setter method for dateRatrap.
     *
     * @param aDateRatrap the new value for dateRatrap
     */
    public void setDateRatrap(LocalDateTime aDateRatrap) {
        dateRatrap = aDateRatrap;
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
     * Access method for confRattrapage.
     *
     * @return the current value of confRattrapage
     */
    public String getConfRattrapage() {
        return confRattrapage;
    }

    /**
     * Setter method for confRattrapage.
     *
     * @param aConfRattrapage the new value for confRattrapage
     */
    public void setConfRattrapage(String aConfRattrapage) {
        confRattrapage = aConfRattrapage;
    }

    /**
     * Access method for dateConfRatt.
     *
     * @return the current value of dateConfRatt
     */
    public LocalDateTime getDateConfRatt() {
        return dateConfRatt;
    }

    /**
     * Setter method for dateConfRatt.
     *
     * @param aDateConfRatt the new value for dateConfRatt
     */
    public void setDateConfRatt(LocalDateTime aDateConfRatt) {
        dateConfRatt = aDateConfRatt;
    }

    /**
     * Access method for userConfirm.
     *
     * @return the current value of userConfirm
     */
    public String getUserConfirm() {
        return userConfirm;
    }

    /**
     * Setter method for userConfirm.
     *
     * @param aUserConfirm the new value for userConfirm
     */
    public void setUserConfirm(String aUserConfirm) {
        userConfirm = aUserConfirm;
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
     * Access method for userLastModif.
     *
     * @return the current value of userLastModif
     */
    public String getUserLastModif() {
        return userLastModif;
    }

    /**
     * Setter method for userLastModif.
     *
     * @param aUserLastModif the new value for userLastModif
     */
    public void setUserLastModif(String aUserLastModif) {
        userLastModif = aUserLastModif;
    }

    /**
     * Access method for userConfirmRatt.
     *
     * @return the current value of userConfirmRatt
     */
    public String getUserConfirmRatt() {
        return userConfirmRatt;
    }

    /**
     * Setter method for userConfirmRatt.
     *
     * @param aUserConfirmRatt the new value for userConfirmRatt
     */
    public void setUserConfirmRatt(String aUserConfirmRatt) {
        userConfirmRatt = aUserConfirmRatt;
    }

    /**
     * Access method for tatouageEns.
     *
     * @return the current value of tatouageEns
     */
    public String getTatouageEns() {
        return tatouageEns;
    }

    /**
     * Setter method for tatouageEns.
     *
     * @param aTatouageEns the new value for tatouageEns
     */
    public void setTatouageEns(String aTatouageEns) {
        tatouageEns = aTatouageEns;
    }

    /**
     * Access method for confirmNew.
     *
     * @return the current value of confirmNew
     */
    public String getConfirmNew() {
        return confirmNew;
    }

    /**
     * Setter method for confirmNew.
     *
     * @param aConfirmNew the new value for confirmNew
     */
    public void setConfirmNew(String aConfirmNew) {
        confirmNew = aConfirmNew;
    }

    /**
     * Access method for numpromotioncs.
     *
     * @return the current value of numpromotioncs
     */
    public BigDecimal getNumpromotioncs() {
        return numpromotioncs;
    }

    /**
     * Setter method for numpromotioncs.
     *
     * @param aNumpromotioncs the new value for numpromotioncs
     */
    public void setNumpromotioncs(BigDecimal aNumpromotioncs) {
        numpromotioncs = aNumpromotioncs;
    }

    /**
     * Access method for tauxEcritLang.
     *
     * @return the current value of tauxEcritLang
     */
    public BigDecimal getTauxEcritLang() {
        return tauxEcritLang;
    }

    /**
     * Setter method for tauxEcritLang.
     *
     * @param aTauxEcritLang the new value for tauxEcritLang
     */
    public void setTauxEcritLang(BigDecimal aTauxEcritLang) {
        tauxEcritLang = aTauxEcritLang;
    }

    /**
     * Access method for tauxOralLang.
     *
     * @return the current value of tauxOralLang
     */
    public BigDecimal getTauxOralLang() {
        return tauxOralLang;
    }

    /**
     * Setter method for tauxOralLang.
     *
     * @param aTauxOralLang the new value for tauxOralLang
     */
    public void setTauxOralLang(BigDecimal aTauxOralLang) {
        tauxOralLang = aTauxOralLang;
    }

    /**
     * Access method for tauxCcLang.
     *
     * @return the current value of tauxCcLang
     */
    public BigDecimal getTauxCcLang() {
        return tauxCcLang;
    }

    /**
     * Setter method for tauxCcLang.
     *
     * @param aTauxCcLang the new value for tauxCcLang
     */
    public void setTauxCcLang(BigDecimal aTauxCcLang) {
        tauxCcLang = aTauxCcLang;
    }

    /**
     * Access method for espModule.
     *
     * @return the current value of espModule
     */
    public EspModule getEspModule() {
        return espModule;
    }

    /**
     * Setter method for espModule.
     *
     * @param aEspModule the new value for espModule
     */
    public void setEspModule(EspModule aEspModule) {
        espModule = aEspModule;
    }

    /**
     * Access method for espNote.
     *
     * @return the current value of espNote
     */
    public Set<EspNote> getEspNote() {
        return espNote;
    }

    /**
     * Setter method for espNote.
     *
     * @param aEspNote the new value for espNote
     */
    public void setEspNote(Set<EspNote> aEspNote) {
        espNote = aEspNote;
    }

   
    /** Temporary value holder for group key fragment espModuleCodeModule */
    private transient String tempEspModuleCodeModule;

    /**
     * Gets the key fragment codeModule for member espModule.
     * If this.espModule is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspModuleCodeModule.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspModule
     */
    public String getEspModuleCodeModule() {
        return (getEspModule() == null ? tempEspModuleCodeModule : getEspModule().getCodeModule());
    }

    /**
     * Sets the key fragment codeModule from member espModule.
     * If this.espModule is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspModuleCodeModule.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeModule New value for the key fragment
     * @see EspModule
     */
    public void setEspModuleCodeModule(String aCodeModule) {
        if (getEspModule() == null) {
            tempEspModuleCodeModule = aCodeModule;
        } else {
            getEspModule().setCodeModule(aCodeModule);
        }
    }

    /**
     * Compares the key for this instance with another EspEnteteNote.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspEnteteNote and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspEnteteNote)) {
            return false;
        }
        EspEnteteNote that = (EspEnteteNote) other;
        Object myAnneeDeb = this.getAnneeDeb();
        Object yourAnneeDeb = that.getAnneeDeb();
        if (myAnneeDeb==null ? yourAnneeDeb!=null : !myAnneeDeb.equals(yourAnneeDeb)) {
            return false;
        }
        Object myCodeCl = this.getCodeCl();
        Object yourCodeCl = that.getCodeCl();
        if (myCodeCl==null ? yourCodeCl!=null : !myCodeCl.equals(yourCodeCl)) {
            return false;
        }
        Object myEspModuleCodeModule = this.getEspModuleCodeModule();
        Object yourEspModuleCodeModule = that.getEspModuleCodeModule();
        if (myEspModuleCodeModule==null ? yourEspModuleCodeModule!=null : !myEspModuleCodeModule.equals(yourEspModuleCodeModule)) {
            return false;
        }
        Object mySemestre = this.getSemestre();
        Object yourSemestre = that.getSemestre();
        if (mySemestre==null ? yourSemestre!=null : !mySemestre.equals(yourSemestre)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspEnteteNote.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspEnteteNote)) return false;
        return this.equalKeys(other) && ((EspEnteteNote)other).equalKeys(this);
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
        if (getCodeCl() == null) {
            i = 0;
        } else {
            i = getCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getEspModuleCodeModule() == null) {
            i = 0;
        } else {
            i = getEspModuleCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getSemestre() == null) {
            i = 0;
        } else {
            i = getSemestre().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspEnteteNote |");
        sb.append(" anneeDeb=").append(getAnneeDeb());
        sb.append(" codeCl=").append(getCodeCl());
        sb.append(" espModuleCodeModule=").append(getEspModuleCodeModule());
        sb.append(" semestre=").append(getSemestre());
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
        ret.put("codeCl", getCodeCl());
        ret.put("espModuleCodeModule", getEspModuleCodeModule());
        ret.put("semestre", getSemestre());
        return ret;
    }

}
