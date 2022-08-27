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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ESP_NOTE")
@IdClass(EspNote.EspNoteId.class)
public class EspNote implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class EspNoteId implements Serializable {
       
        EspEnteteNote espEnteteNote;

        EspEtudiant espEtudiant;
    }

    /** Primary key. */
    protected static final String PK = "EspNotePkEspNote";

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
    @Column(name="ANNEE_FIN", length=4)
    private String anneeFin;
    @Column(name="TYPE_NOTE", length=2)
    private String typeNote;
    @Column(name="NATURE_NOTE", length=2)
    private String natureNote;
    @Column(name="TAUX_NOTE", precision=5, scale=2)
    private BigDecimal tauxNote;
    @Column(name="OBSERVATION", length=300)
    private String observation;
    @Column(name="DATE_DEROULEMENT")
    private LocalDateTime dateDeroulement;
    @Column(name="ID_ENS", length=10)
    private String idEns;
    @Column(name="NB_HEURE", precision=2)
    private BigDecimal nbHeure;
    @Column(name="TYPE_SESSION", length=1)
    private String typeSession;
    @Column(name="NOTE_EXAM", precision=5, scale=2)
    private BigDecimal noteExam;
    @Column(name="NOTE_CC", precision=5, scale=2)
    private BigDecimal noteCc;
    @Column(name="NOTE_TP", precision=5, scale=2)
    private BigDecimal noteTp;
    @Column(name="NOTE_RATRAP", precision=5, scale=2)
    private BigDecimal noteRatrap;
    @Column(name="ABSENT", length=1)
    private String absent;
    @Column(name="JUSTIF", length=1)
    private String justif;
    @Column(name="ABSENT_TP", length=1)
    private String absentTp;
    @Column(name="ABSENT_CC", length=1)
    private String absentCc;
    @Column(name="ABSENT_EXAM", length=1)
    private String absentExam;
    @Column(name="UTILISATEUR", length=16)
    private String utilisateur;
    @Column(name="NUMPROMOTIONCS", precision=4)
    private BigDecimal numpromotioncs;
    @Column(name="NIV_ACQUIS_ANGLAIS", length=2)
    private String nivAcquisAnglais;
    @Column(name="NIVEAU_ACQUIS", length=2)
    private String niveauAcquis;
    @Column(name="NOTE_ORALE", precision=5, scale=2)
    private BigDecimal noteOrale;
    @Column(name="NOTE_ECRIT", precision=5, scale=2)
    private BigDecimal noteEcrit;
    @Column(name="DISPENSE", length=1)
    private String dispense;
    @Column(name="ABSENT_ORALE", length=1)
    private String absentOrale;
    @Column(name="ABSENT_ECRIT", length=1)
    private String absentEcrit;
    @Column(name="NIVEAU_ACTUEL", length=2)
    private String niveauActuel;
    @Column(name="NOTE_CC_LANG", precision=5, scale=2)
    private BigDecimal noteCcLang;
    @Column(name="NOTE_ORALE_LANG", precision=5, scale=2)
    private BigDecimal noteOraleLang;
    @Column(name="NOTE_ECRIT_LANG", precision=5, scale=2)
    private BigDecimal noteEcritLang;
    @Column(name="TAUX_CC_LANG", precision=5, scale=2)
    private BigDecimal tauxCcLang;
    @Column(name="TAUX_ORALE_LANG", precision=5, scale=2)
    private BigDecimal tauxOraleLang;
    @Column(name="TAUX_ECRIT_LANG", precision=5, scale=2)
    private BigDecimal tauxEcritLang;
    @Column(name="NOTE_ESB_01", precision=10, scale=3)
    private BigDecimal noteEsb01;
    @Column(name="NOTE_ESB_02", precision=10, scale=3)
    private BigDecimal noteEsb02;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="ID_ET", nullable=false)
    private EspEtudiant espEtudiant;
    @ManyToOne(optional=false)
    @Id
    @JoinColumns ({
    @JoinColumn(name="CODE_MODULE", nullable=false),

    @JoinColumn(name="CODE_CL", nullable=false),

    @JoinColumn(name="ANNEE_DEB", nullable=false),
  
    @JoinColumn(name="SEMESTRE", nullable=false) })
    private EspEnteteNote espEnteteNote;

    /** Default constructor. */
    public EspNote() {
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
     * Access method for typeNote.
     *
     * @return the current value of typeNote
     */
    public String getTypeNote() {
        return typeNote;
    }

    /**
     * Setter method for typeNote.
     *
     * @param aTypeNote the new value for typeNote
     */
    public void setTypeNote(String aTypeNote) {
        typeNote = aTypeNote;
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
     * Access method for tauxNote.
     *
     * @return the current value of tauxNote
     */
    public BigDecimal getTauxNote() {
        return tauxNote;
    }

    /**
     * Setter method for tauxNote.
     *
     * @param aTauxNote the new value for tauxNote
     */
    public void setTauxNote(BigDecimal aTauxNote) {
        tauxNote = aTauxNote;
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
     * Access method for noteExam.
     *
     * @return the current value of noteExam
     */
    public BigDecimal getNoteExam() {
        return noteExam;
    }

    /**
     * Setter method for noteExam.
     *
     * @param aNoteExam the new value for noteExam
     */
    public void setNoteExam(BigDecimal aNoteExam) {
        noteExam = aNoteExam;
    }

    /**
     * Access method for noteCc.
     *
     * @return the current value of noteCc
     */
    public BigDecimal getNoteCc() {
        return noteCc;
    }

    /**
     * Setter method for noteCc.
     *
     * @param aNoteCc the new value for noteCc
     */
    public void setNoteCc(BigDecimal aNoteCc) {
        noteCc = aNoteCc;
    }

    /**
     * Access method for noteTp.
     *
     * @return the current value of noteTp
     */
    public BigDecimal getNoteTp() {
        return noteTp;
    }

    /**
     * Setter method for noteTp.
     *
     * @param aNoteTp the new value for noteTp
     */
    public void setNoteTp(BigDecimal aNoteTp) {
        noteTp = aNoteTp;
    }

    /**
     * Access method for noteRatrap.
     *
     * @return the current value of noteRatrap
     */
    public BigDecimal getNoteRatrap() {
        return noteRatrap;
    }

    /**
     * Setter method for noteRatrap.
     *
     * @param aNoteRatrap the new value for noteRatrap
     */
    public void setNoteRatrap(BigDecimal aNoteRatrap) {
        noteRatrap = aNoteRatrap;
    }

    /**
     * Access method for absent.
     *
     * @return the current value of absent
     */
    public String getAbsent() {
        return absent;
    }

    /**
     * Setter method for absent.
     *
     * @param aAbsent the new value for absent
     */
    public void setAbsent(String aAbsent) {
        absent = aAbsent;
    }

    /**
     * Access method for justif.
     *
     * @return the current value of justif
     */
    public String getJustif() {
        return justif;
    }

    /**
     * Setter method for justif.
     *
     * @param aJustif the new value for justif
     */
    public void setJustif(String aJustif) {
        justif = aJustif;
    }

    /**
     * Access method for absentTp.
     *
     * @return the current value of absentTp
     */
    public String getAbsentTp() {
        return absentTp;
    }

    /**
     * Setter method for absentTp.
     *
     * @param aAbsentTp the new value for absentTp
     */
    public void setAbsentTp(String aAbsentTp) {
        absentTp = aAbsentTp;
    }

    /**
     * Access method for absentCc.
     *
     * @return the current value of absentCc
     */
    public String getAbsentCc() {
        return absentCc;
    }

    /**
     * Setter method for absentCc.
     *
     * @param aAbsentCc the new value for absentCc
     */
    public void setAbsentCc(String aAbsentCc) {
        absentCc = aAbsentCc;
    }

    /**
     * Access method for absentExam.
     *
     * @return the current value of absentExam
     */
    public String getAbsentExam() {
        return absentExam;
    }

    /**
     * Setter method for absentExam.
     *
     * @param aAbsentExam the new value for absentExam
     */
    public void setAbsentExam(String aAbsentExam) {
        absentExam = aAbsentExam;
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
     * Access method for nivAcquisAnglais.
     *
     * @return the current value of nivAcquisAnglais
     */
    public String getNivAcquisAnglais() {
        return nivAcquisAnglais;
    }

    /**
     * Setter method for nivAcquisAnglais.
     *
     * @param aNivAcquisAnglais the new value for nivAcquisAnglais
     */
    public void setNivAcquisAnglais(String aNivAcquisAnglais) {
        nivAcquisAnglais = aNivAcquisAnglais;
    }

    /**
     * Access method for niveauAcquis.
     *
     * @return the current value of niveauAcquis
     */
    public String getNiveauAcquis() {
        return niveauAcquis;
    }

    /**
     * Setter method for niveauAcquis.
     *
     * @param aNiveauAcquis the new value for niveauAcquis
     */
    public void setNiveauAcquis(String aNiveauAcquis) {
        niveauAcquis = aNiveauAcquis;
    }

    /**
     * Access method for noteOrale.
     *
     * @return the current value of noteOrale
     */
    public BigDecimal getNoteOrale() {
        return noteOrale;
    }

    /**
     * Setter method for noteOrale.
     *
     * @param aNoteOrale the new value for noteOrale
     */
    public void setNoteOrale(BigDecimal aNoteOrale) {
        noteOrale = aNoteOrale;
    }

    /**
     * Access method for noteEcrit.
     *
     * @return the current value of noteEcrit
     */
    public BigDecimal getNoteEcrit() {
        return noteEcrit;
    }

    /**
     * Setter method for noteEcrit.
     *
     * @param aNoteEcrit the new value for noteEcrit
     */
    public void setNoteEcrit(BigDecimal aNoteEcrit) {
        noteEcrit = aNoteEcrit;
    }

    /**
     * Access method for dispense.
     *
     * @return the current value of dispense
     */
    public String getDispense() {
        return dispense;
    }

    /**
     * Setter method for dispense.
     *
     * @param aDispense the new value for dispense
     */
    public void setDispense(String aDispense) {
        dispense = aDispense;
    }

    /**
     * Access method for absentOrale.
     *
     * @return the current value of absentOrale
     */
    public String getAbsentOrale() {
        return absentOrale;
    }

    /**
     * Setter method for absentOrale.
     *
     * @param aAbsentOrale the new value for absentOrale
     */
    public void setAbsentOrale(String aAbsentOrale) {
        absentOrale = aAbsentOrale;
    }

    /**
     * Access method for absentEcrit.
     *
     * @return the current value of absentEcrit
     */
    public String getAbsentEcrit() {
        return absentEcrit;
    }

    /**
     * Setter method for absentEcrit.
     *
     * @param aAbsentEcrit the new value for absentEcrit
     */
    public void setAbsentEcrit(String aAbsentEcrit) {
        absentEcrit = aAbsentEcrit;
    }

    /**
     * Access method for niveauActuel.
     *
     * @return the current value of niveauActuel
     */
    public String getNiveauActuel() {
        return niveauActuel;
    }

    /**
     * Setter method for niveauActuel.
     *
     * @param aNiveauActuel the new value for niveauActuel
     */
    public void setNiveauActuel(String aNiveauActuel) {
        niveauActuel = aNiveauActuel;
    }

    /**
     * Access method for noteCcLang.
     *
     * @return the current value of noteCcLang
     */
    public BigDecimal getNoteCcLang() {
        return noteCcLang;
    }

    /**
     * Setter method for noteCcLang.
     *
     * @param aNoteCcLang the new value for noteCcLang
     */
    public void setNoteCcLang(BigDecimal aNoteCcLang) {
        noteCcLang = aNoteCcLang;
    }

    /**
     * Access method for noteOraleLang.
     *
     * @return the current value of noteOraleLang
     */
    public BigDecimal getNoteOraleLang() {
        return noteOraleLang;
    }

    /**
     * Setter method for noteOraleLang.
     *
     * @param aNoteOraleLang the new value for noteOraleLang
     */
    public void setNoteOraleLang(BigDecimal aNoteOraleLang) {
        noteOraleLang = aNoteOraleLang;
    }

    /**
     * Access method for noteEcritLang.
     *
     * @return the current value of noteEcritLang
     */
    public BigDecimal getNoteEcritLang() {
        return noteEcritLang;
    }

    /**
     * Setter method for noteEcritLang.
     *
     * @param aNoteEcritLang the new value for noteEcritLang
     */
    public void setNoteEcritLang(BigDecimal aNoteEcritLang) {
        noteEcritLang = aNoteEcritLang;
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
     * Access method for tauxOraleLang.
     *
     * @return the current value of tauxOraleLang
     */
    public BigDecimal getTauxOraleLang() {
        return tauxOraleLang;
    }

    /**
     * Setter method for tauxOraleLang.
     *
     * @param aTauxOraleLang the new value for tauxOraleLang
     */
    public void setTauxOraleLang(BigDecimal aTauxOraleLang) {
        tauxOraleLang = aTauxOraleLang;
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
     * Access method for noteEsb01.
     *
     * @return the current value of noteEsb01
     */
    public BigDecimal getNoteEsb01() {
        return noteEsb01;
    }

    /**
     * Setter method for noteEsb01.
     *
     * @param aNoteEsb01 the new value for noteEsb01
     */
    public void setNoteEsb01(BigDecimal aNoteEsb01) {
        noteEsb01 = aNoteEsb01;
    }

    /**
     * Access method for noteEsb02.
     *
     * @return the current value of noteEsb02
     */
    public BigDecimal getNoteEsb02() {
        return noteEsb02;
    }

    /**
     * Setter method for noteEsb02.
     *
     * @param aNoteEsb02 the new value for noteEsb02
     */
    public void setNoteEsb02(BigDecimal aNoteEsb02) {
        noteEsb02 = aNoteEsb02;
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
     * Access method for espEnteteNote.
     *
     * @return the current value of espEnteteNote
     */
    public EspEnteteNote getEspEnteteNote() {
        return espEnteteNote;
    }

    /**
     * Setter method for espEnteteNote.
     *
     * @param aEspEnteteNote the new value for espEnteteNote
     */
    public void setEspEnteteNote(EspEnteteNote aEspEnteteNote) {
        espEnteteNote = aEspEnteteNote;
    }

   

    /** Temporary value holder for group key fragment espEnteteNoteAnneeDeb */
    private transient String tempEspEnteteNoteAnneeDeb;

    /**
     * Gets the key fragment anneeDeb for member espEnteteNote.
     * If this.espEnteteNote is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspEnteteNoteAnneeDeb.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspEnteteNote
     */
    public String getEspEnteteNoteAnneeDeb() {
        return (getEspEnteteNote() == null ? tempEspEnteteNoteAnneeDeb : getEspEnteteNote().getAnneeDeb());
    }

    /**
     * Sets the key fragment anneeDeb from member espEnteteNote.
     * If this.espEnteteNote is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspEnteteNoteAnneeDeb.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAnneeDeb New value for the key fragment
     * @see EspEnteteNote
     */
    public void setEspEnteteNoteAnneeDeb(String aAnneeDeb) {
        if (getEspEnteteNote() == null) {
            tempEspEnteteNoteAnneeDeb = aAnneeDeb;
        } else {
            getEspEnteteNote().setAnneeDeb(aAnneeDeb);
        }
    }

    /** Temporary value holder for group key fragment espEnteteNoteCodeCl */
    private transient String tempEspEnteteNoteCodeCl;

    /**
     * Gets the key fragment codeCl for member espEnteteNote.
     * If this.espEnteteNote is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspEnteteNoteCodeCl.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspEnteteNote
     */
    public String getEspEnteteNoteCodeCl() {
        return (getEspEnteteNote() == null ? tempEspEnteteNoteCodeCl : getEspEnteteNote().getCodeCl());
    }

    /**
     * Sets the key fragment codeCl from member espEnteteNote.
     * If this.espEnteteNote is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspEnteteNoteCodeCl.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeCl New value for the key fragment
     * @see EspEnteteNote
     */
    public void setEspEnteteNoteCodeCl(String aCodeCl) {
        if (getEspEnteteNote() == null) {
            tempEspEnteteNoteCodeCl = aCodeCl;
        } else {
            getEspEnteteNote().setCodeCl(aCodeCl);
        }
    }

    /** Temporary value holder for group key fragment espEnteteNoteEspModuleCodeModule */
    private transient String tempEspEnteteNoteEspModuleCodeModule;

    /**
     * Gets the key fragment codeModule for member espEnteteNote.
     * If this.espEnteteNote is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspEnteteNoteEspModuleCodeModule.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspModule
     */
    public String getEspEnteteNoteEspModuleCodeModule() {
        return (getEspEnteteNote() == null ? tempEspEnteteNoteEspModuleCodeModule : getEspEnteteNote().getEspModuleCodeModule());
    }

    /**
     * Sets the key fragment codeModule from member espEnteteNote.
     * If this.espEnteteNote is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspEnteteNoteEspModuleCodeModule.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aCodeModule New value for the key fragment
     * @see EspModule
     */
    public void setEspEnteteNoteEspModuleCodeModule(String aCodeModule) {
        if (getEspEnteteNote() == null) {
            tempEspEnteteNoteEspModuleCodeModule = aCodeModule;
        } else {
            getEspEnteteNote().setEspModuleCodeModule(aCodeModule);
        }
    }

    /** Temporary value holder for group key fragment espEnteteNoteSemestre */
    private transient BigDecimal tempEspEnteteNoteSemestre;

    /**
     * Gets the key fragment semestre for member espEnteteNote.
     * If this.espEnteteNote is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setEspEnteteNoteSemestre.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see EspEnteteNote
     */
    public BigDecimal getEspEnteteNoteSemestre() {
        return (getEspEnteteNote() == null ? tempEspEnteteNoteSemestre : getEspEnteteNote().getSemestre());
    }

    /**
     * Sets the key fragment semestre from member espEnteteNote.
     * If this.espEnteteNote is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getEspEnteteNoteSemestre.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aSemestre New value for the key fragment
     * @see EspEnteteNote
     */
    public void setEspEnteteNoteSemestre(BigDecimal aSemestre) {
        if (getEspEnteteNote() == null) {
            tempEspEnteteNoteSemestre = aSemestre;
        } else {
            getEspEnteteNote().setSemestre(aSemestre);
        }
    }

    /** Temporary value holder for group key fragment espEnteteNote4AnneeDeb */
    private transient String tempEspEnteteNote4AnneeDeb;

    /**
 
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
     * Compares the key for this instance with another EspNote.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EspNote and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EspNote)) {
            return false;
        }
        EspNote that = (EspNote) other;
       
       
        Object myEspEnteteNoteAnneeDeb = this.getEspEnteteNoteAnneeDeb();
        Object yourEspEnteteNoteAnneeDeb = that.getEspEnteteNoteAnneeDeb();
        if (myEspEnteteNoteAnneeDeb==null ? yourEspEnteteNoteAnneeDeb!=null : !myEspEnteteNoteAnneeDeb.equals(yourEspEnteteNoteAnneeDeb)) {
            return false;
        }
        Object myEspEnteteNoteCodeCl = this.getEspEnteteNoteCodeCl();
        Object yourEspEnteteNoteCodeCl = that.getEspEnteteNoteCodeCl();
        if (myEspEnteteNoteCodeCl==null ? yourEspEnteteNoteCodeCl!=null : !myEspEnteteNoteCodeCl.equals(yourEspEnteteNoteCodeCl)) {
            return false;
        }
        Object myEspEnteteNoteEspModuleCodeModule = this.getEspEnteteNoteEspModuleCodeModule();
        Object yourEspEnteteNoteEspModuleCodeModule = that.getEspEnteteNoteEspModuleCodeModule();
        if (myEspEnteteNoteEspModuleCodeModule==null ? yourEspEnteteNoteEspModuleCodeModule!=null : !myEspEnteteNoteEspModuleCodeModule.equals(yourEspEnteteNoteEspModuleCodeModule)) {
            return false;
        }
        Object myEspEnteteNoteSemestre = this.getEspEnteteNoteSemestre();
        Object yourEspEnteteNoteSemestre = that.getEspEnteteNoteSemestre();
        if (myEspEnteteNoteSemestre==null ? yourEspEnteteNoteSemestre!=null : !myEspEnteteNoteSemestre.equals(yourEspEnteteNoteSemestre)) {
            return false;
        }
      
        Object myEspEtudiantIdEt = this.getEspEtudiantIdEt();
        Object yourEspEtudiantIdEt = that.getEspEtudiantIdEt();
        if (myEspEtudiantIdEt==null ? yourEspEtudiantIdEt!=null : !myEspEtudiantIdEt.equals(yourEspEtudiantIdEt)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EspNote.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EspNote)) return false;
        return this.equalKeys(other) && ((EspNote)other).equalKeys(this);
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
      
        if (getEspEnteteNoteAnneeDeb() == null) {
            i = 0;
        } else {
            i = getEspEnteteNoteAnneeDeb().hashCode();
        }
        result = 37*result + i;
        if (getEspEnteteNoteCodeCl() == null) {
            i = 0;
        } else {
            i = getEspEnteteNoteCodeCl().hashCode();
        }
        result = 37*result + i;
        if (getEspEnteteNoteEspModuleCodeModule() == null) {
            i = 0;
        } else {
            i = getEspEnteteNoteEspModuleCodeModule().hashCode();
        }
        result = 37*result + i;
        if (getEspEnteteNoteSemestre() == null) {
            i = 0;
        } else {
            i = getEspEnteteNoteSemestre().hashCode();
        }
        result = 37*result + i;
       
        if (getEspEtudiantIdEt() == null) {
            i = 0;
        } else {
            i = getEspEtudiantIdEt().hashCode();
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
        StringBuffer sb = new StringBuffer("[EspNote |");
        sb.append(" espEnteteNoteAnneeDeb=").append(getEspEnteteNoteAnneeDeb());
        sb.append(" espEnteteNoteCodeCl=").append(getEspEnteteNoteCodeCl());
        sb.append(" espEnteteNoteEspModuleCodeModule=").append(getEspEnteteNoteEspModuleCodeModule());
        sb.append(" espEnteteNoteSemestre=").append(getEspEnteteNoteSemestre());
        sb.append(" espEtudiantIdEt=").append(getEspEtudiantIdEt());
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
        ret.put("espEnteteNoteAnneeDeb", getEspEnteteNoteAnneeDeb());
        ret.put("espEnteteNoteCodeCl", getEspEnteteNoteCodeCl());
        ret.put("espEnteteNoteEspModuleCodeModule", getEspEnteteNoteEspModuleCodeModule());
        ret.put("espEnteteNoteSemestre", getEspEnteteNoteSemestre());
        ret.put("espEtudiantIdEt", getEspEtudiantIdEt());
        return ret;
    }

}
